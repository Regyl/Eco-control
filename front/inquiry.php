<?
$ch = curl_init();
curl_setopt($ch, CURLOPT_URL, 'https://miller-backend.herokuapp.com/organizations/all');
curl_exec($ch);