DATABASE
CREATE DATABASE userdb;
USE userdb;

CREATE TABLE users(
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50),
    email VARCHAR(50),
    password VARCHAR(255)
);
REGISTER/LOGIN
<?php
$conn = mysqli_connect("localhost","root","","userdb");

if(isset($_POST['register'])){
    $name = $_POST['username'];
    $email = $_POST['email'];
    $pass = password_hash($_POST['password'], PASSWORD_DEFAULT);

    $sql = "INSERT INTO users(username,email,password)
            VALUES('$name','$email','$pass')";

    if(mysqli_query($conn,$sql))
        echo "Registration Successful";
    else
        echo "Registration Failed";
}
?>

<h2>Registration Form</h2>
<form method="post">
Username: <input type="text" name="username" required><br><br>
Email: <input type="email" name="email" required><br><br>
Password: <input type="password" name="password" required><br><br>
<input type="submit" name="register" value="Register">
</form>
