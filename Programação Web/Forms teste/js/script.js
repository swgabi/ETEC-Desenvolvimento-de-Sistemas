var nome = document.querySelector ("#nomeTxt")
var sobrenome = document.querySelector ("#sobrenomeTxt")
var email = document.querySelector ("#emailTxt")
var dataNasc = document.querySelector ("#dataNascTxt")
var tel = document.querySelector ("#telTxt")
var assunto = document.querySelector ("#assuntoTxt")
var mensagem = document.querySelector ("#msgTxt")

var btEnviar = document.querySelector ("button")

var resultado = document.querySelector("#resultado")

btEnviar.addEventListener('click', exibirDados)

function exibirDados(){

    resultado.innerHTML = `

        <p> Nome:  ${nome.value} </p>
        <p> Sebrenome: ${sobrenome.value} </p>
        <p> E-mail: ${email.value} </p>
        <p> Data de Nascimento: ${dataNasc.value} </p>
        <p> Telefone: ${tel.value} </p>
        <p> Assunto: ${assunto.value} </p>
        <p> Mensagem: ${mensagem.value} </p>
        
    `

}