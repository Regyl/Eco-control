<?
$ch = curl_init();
curl_setopt($ch, CURLOPT_URL, 'https://miller-backend.herokuapp.com/organizations/sort?pollutionType=' . $_POST['pollutionType'][0]);
curl_exec($ch);