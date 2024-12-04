function login() {
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    if(username && password){
        alert("Login SuccessFull");
        window.location.href ="dashboard.html";
    }else{
        alert("please enter your username and password");
    }

}