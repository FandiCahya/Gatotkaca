<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Duryudana</title>
    <link rel="stylesheet" href="css/style.css">
    
</head>
<body>
    <?php session_start();
        if(!isset($_SESSION["username"])){ header("location: login.php");}
    ?>
    <div class="header cl">
        <div class="logo">
            <a href="?">
                <img src="img/logo5.PNG" alt="Duryudana" width="60px" height="60px">
            </a>
        </div>
        <div class="keluar">
            <a href="logout.php">
                <img src="img/exit1.png" alt="exit" width="30px" height="30px">
            </a>
        </div>
        <div class="tambah">
            <form action="" method="POST">
                <a href="upload.html">
                    <img src="img/tambah1.png" alt="tambah" width="50px" height="50px">
                </a>
            </form>
        </div>
    </div>
    <?php 
        require'proses.php';
        $member1=$_SESSION["username"];
        $datamember1=shWithKey($member1);
    ?>
    <span class="title"><h1><?=$datamember1["nama"]?> Photos</h1></span>
    <div class="beranda">
        <div class="konten">
            <a href="#add">
                <img src="img/testi.png" alt="testi" width="100%" height="100%">
            </a>
        </div>

        <div class="konten">
            <a href="#add">
                <img src="img/testi1.png" alt="testi" width="100%" height="100%">
            </a>
        </div>
        
    </div>
</body>
<footer><marquee direction="down">
</marquee> copyright</footer>
</html>