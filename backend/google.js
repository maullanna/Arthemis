// import { initializeApp } from "https://www.gstatic.com/firebasejs/10.7.1/firebase-app.js";
// import { getAuth ,GoogleAuthProvider, signInWithPopup} from "https://www.gstatic.com/firebasejs/10.7.1/firebase-app.js";

//   // Your web app's Firebase configuration
//   const firebaseConfig = {
//     apiKey: "AIzaSyA-YX8S57wme6fBxMFdUPvrRqWOrfyj8Ec",
//     authDomain: "foodunity-app.firebaseapp.com",
//     databaseURL: "https://foodunity-app-default-rtdb.firebaseio.com",
//     projectId: "foodunity-app",
//     storageBucket: "foodunity-app.appspot.com",
//     messagingSenderId: "989622596199",
//     appId: "1:989622596199:web:03f9a4cd02fb9eb4129ac2"
//   };

//   // Initialize Firebase
//   const app = initializeApp(firebaseConfig);
//   const auth = getAuth(app);
//   auth.languageCode = 'en'

//   const provider = new GoogleAuthProvider();

//   const googleLogin = document.getElementById('loginWithGoogle');
//   googleLogin.addEventListener('click', function() {
//     signInWithPopup(auth, provider)
//     .then((result) => {
//         const credential = GoogleAuthProvider.credentialFromResult(result);
//         const user = result.user;
//         console.log(user);
//         window.location.href = "../logged.html";
//     })
//     .catch((error) => {
//         const errorCode = error.code;
//         const errorMessage = error.message;
//         const email = error.customeData.email;
//         const credential = GoogleAuthProvider.credentialFromError(error);
//     });
//   })