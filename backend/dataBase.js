const firebaseConfig = {
    apiKey: "AIzaSyA-YX8S57wme6fBxMFdUPvrRqWOrfyj8Ec",
    authDomain: "foodunity-app.firebaseapp.com",
    databaseURL: "https://foodunity-app-default-rtdb.firebaseio.com",
    projectId: "foodunity-app",
    storageBucket: "foodunity-app.appspot.com",
    messagingSenderId: "989622596199",
    appId: "1:989622596199:web:03f9a4cd02fb9eb4129ac2"
  };

firebase.initializeApp(firebaseConfig);

let foodunityDB = firebase.database().ref('foodunity-app');

document.getElementById('loginForm').addEventListener('submit', submitForm)

// sign up
function submitForm(e) {
    e.preventDefault();

    let email = getElementVal('email_signup');
    let password = getElementVal('psw_signup');

    saveSignupForm(email, password);
}

const saveSignupForm = (email, password) => {
    let newLoginForm = foodunityDB.push();

    newLoginForm.set({
        email: email_signup,
        password: psw_signup,
    });
};

const getElementVal = (id) => {
    return document.getElementById(id).value;
};

