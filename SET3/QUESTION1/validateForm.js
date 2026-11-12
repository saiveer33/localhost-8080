function validateForm()
{
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    var phone = document.getElementById("phone").value;
    var email = document.getElementById("email").value;
    var userReg = /^[A-Z][a-z0-9]*$/;
    var passReg = /^[A-Z]{8,12}$/;
    var phoneReg = /^[0-9]{10}$/;
    var emailReg = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    if (!userReg.test(username))
    {
        alert("Invalid Username");
        return false;
    }
    if (!passReg.test(password))
    {
        alert("Invalid Password");
        return false;
    }
    if (!phoneReg.test(phone))
    {
        alert("Invalid Phone Number");
        return false;
    }
    if (!emailReg.test(email))
    {
        alert("Invalid Email");
        return false;
    }
   alert("Registration Successful!");
    return true;
}
