<?php

  function getUsuarios(){
  $dados = [["nome"=>"Luciano","email"=>"luciano@mail.com"],
        ["nome"=>"Lucas","email"=>"lucas@mail.com"],
        ["nome"=>"Lucian","email"=>"lucian@mail.com"],
        ["nome"=>"Luan","email"=>"luan@mail.com"],
        ["nome"=>"Abreu","email"=>"abreu@mail.com"],
        ["nome"=>"Juvenal","email"=>"juvenal@mail.com"],
        ["nome"=>"Luana","email"=>"luana@mail.com"]
        ];

  return $dados;
  }

  function exibeUsuario(){
    $usuarios = getUsuarios();
    $html = "";

    foreach ($usuarios as $key => $usuario) {
      $nome = $usuario["nome"];
      $email = $usuario["email"];
      $html .= "<li> Nome: $nome - E-mail: $email</li>";
    }

    echo $html;

  }
