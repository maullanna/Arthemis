// Import fungsi yang Anda butuhkan dari SDK Firebase
import { initializeApp } from "https://www.gstatic.com/firebasejs/10.7.1/firebase-app.js";
import { getAuth, createUserWithEmailAndPassword, signInWithEmailAndPassword, signOut, GoogleAuthProvider, signInWithPopup } from "https://www.gstatic.com/firebasejs/10.7.1/firebase-auth.js";
import { getDatabase, set, ref } from "https://www.gstatic.com/firebasejs/10.7.1/firebase-database.js";
// import { getAuth, GoogleAuthProvider, signInWithPopup } from "https://www.gstatic.com/firebasejs/10.7.1/firebase-auth.js";

// Konfigurasi Firebase
const firebaseConfig = {
  apiKey: "AIzaSyA-YX8S57wme6fBxMFdUPvrRqWOrfyj8Ec",
  authDomain: "foodunity-app.firebaseapp.com",
  databaseURL: "https://foodunity-app-default-rtdb.firebaseio.com",
  projectId: "foodunity-app",
  storageBucket: "foodunity-app.appspot.com",
  messagingSenderId: "989622596199",
  appId: "1:989622596199:web:03f9a4cd02fb9eb4129ac2"
};

// Inisialisasi Firebase
const app = initializeApp(firebaseConfig);
const auth = getAuth(app);
const database = getDatabase(app);


// Fungsi untuk menambahkan pengguna
const addUser = (userCredential) => {
  const user = userCredential.user;
  set(ref(database, "user/" + user.uid), {
    email: user.email,
  });
};

// Fungsi untuk menangani kesalahan
const handleErrors = (error) => {
  const errorCode = error.code;
  const errorMessage = error.message;
  alert(`Error (${errorCode}): ${errorMessage}`);
};


// Tindakan ketika tombol signup diklik
const handleSignUp = () => {
  const emailSignUp = document.getElementById('email_signup').value;
  const passwordSignUp = document.getElementById('psw_signup').value;

  createUserWithEmailAndPassword(auth, emailSignUp, passwordSignUp)
    .then((userCredential) => {
      addUser(userCredential);
      alert('User Telah ditambahkan:)');
      window.location.href = "index.html"; // Redirect to index.html
    })
    .catch(handleErrors);
};

// Tindakan ketika tombol signin diklik
const handleSignIn = () => {
  const emailSignIn = document.getElementById('email_signin').value;
  const passwordSignIn = document.getElementById('psw_signin').value;

  signInWithEmailAndPassword(auth, emailSignIn, passwordSignIn)
    .then(() => {
      alert('Login berhasil!');
    })
    .catch(handleErrors);
};

// Tindakan ketika tombol signout diklik
const handleSignOut = () => {
  signOut(auth)
    .then(() => {
      alert('Logout berhasil!');
    })
    .catch(handleErrors);
};

// Menambahkan event listener untuk masing-masing tombol
document.getElementById('button_signup').addEventListener('click', handleSignUp);
document.getElementById('button_signin').addEventListener('click', handleSignIn);
document.getElementById('button_signout').addEventListener('click', handleSignOut);

  
const provider = new GoogleAuthProvider();

const googleLogin = document.getElementById('loginWithGoogle');
googleLogin.addEventListener('click', function() {
  console.log('Button clicked!');
  signInWithPopup(auth, provider)
  .then((result) => {
      const credential = GoogleAuthProvider.credentialFromResult(result);
      const user = result.user;
      console.log(user);
      window.location.href = "../index.html";
  })
  .catch((error) => {
      const errorCode = error.code;
      const errorMessage = error.message;
      const email = error.customeData.email;
      const credential = GoogleAuthProvider.credentialFromError(error);
  });
})
