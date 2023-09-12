<?php

$koneksi = mysqli_connect("localhost", "root", "", "praktikum");

$nim = $_GET['nim'];

$query = mysqli_query($koneksi, "select * from mahasiswqa where nim = 'nim'");
$mahasiswa = mysqli_fecth_array($query);
$data = array(
    'nama' => $mahasiswa['nama'],
    'alamat' => $mahasiswa['alamat'],
    'jurusan' => $mahasiswa['jurusan']
);

echo json_encode($data);
?>