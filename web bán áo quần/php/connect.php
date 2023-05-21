<?php
$host = "localhost";
$user = "root";
$password = "";
$dbname = "mydb";
$con = mysqli_connect($host, $user, $password, $dbname);
$connect = new mysqli ($host,$user,$password,$dbname);
if ($connect->connect_error) {
    die ("Connection failed: " . $connect->connect_error);
}
echo "keets noi thanh coong"
?>