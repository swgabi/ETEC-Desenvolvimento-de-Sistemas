var nome = document.querySelector ("#nomeTxt")
var sobrenome = document.querySelector ("#sobrenomeTxt")
var email = document.querySelector ("#emailTxt")
var tel = document.querySelector ("#telTxt")
var assunto = document.querySelector ("#assuntoTxt")
var mensagem = document.querySelector ("#msgTxt")

var btEnviar = document.querySelector ("button")

var resultado = document.querySelector("#resultado")

btEnviar.addEventListener('click', exibirDados)

function exibirDados(){

    resultado.innerHTML = `
    
    <section id="porTras">
        <section id="ajusteTamanhoForm">
             
            <fieldset disabled>

              <br>
                <div class="input-group" class="ajusteMargem">
                    <span class="input-group-text">Nome e Sobrenome</span>
                    <input type="text" id="nomeTxt" aria-label="First name" class="form-control" placeholder="${nome.value}">
                    <input type="text" id="sobrenomeTxt" aria-label="Last name" class="form-control" placeholder="${sobrenome.value}">
                </div>
              <br>
    
              <div class="input-group flex-nowrap">
                <span class="input-group-text" id="addon-wrapping">@</span>
                <input type="text" id="emailTxt" class="form-control" placeholder="${email.value}" aria-label="${email.value}" aria-describedby="addon-wrapping">
              </div>
              <br>

              <div class="input-group flex-nowrap">
                    <span class="input-group-text" id="addon-wrapping">
                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-telephone" viewBox="0 0 16 16">
                        <path d="M3.654 1.328a.678.678 0 0 0-1.015-.063L1.605 2.3c-.483.484-.661 1.169-.45 1.77a17.6 17.6 0 0 0 4.168 6.608 17.6 17.6 0 0 0 6.608 4.168c.601.211 1.286.033 1.77-.45l1.034-1.034a.678.678 0 0 0-.063-1.015l-2.307-1.794a.68.68 0 0 0-.58-.122l-2.19.547a1.75 1.75 0 0 1-1.657-.459L5.482 8.062a1.75 1.75 0 0 1-.46-1.657l.548-2.19a.68.68 0 0 0-.122-.58zM1.884.511a1.745 1.745 0 0 1 2.612.163L6.29 2.98c.329.423.445.974.315 1.494l-.547 2.19a.68.68 0 0 0 .178.643l2.457 2.457a.68.68 0 0 0 .644.178l2.189-.547a1.75 1.75 0 0 1 1.494.315l2.306 1.794c.829.645.905 1.87.163 2.611l-1.034 1.034c-.74.74-1.846 1.065-2.877.702a18.6 18.6 0 0 1-7.01-4.42 18.6 18.6 0 0 1-4.42-7.009c-.362-1.03-.037-2.137.703-2.877z"/>
                    </svg>
                    </span>
                    <input type="text" id="telTxt" class="form-control" placeholder="${tel.value}" aria-label="${tel.value}" aria-describedby="addon-wrapping">
              </div>
              <br>

              <div class="input-group mb-3">
                    <span class="input-group-text" id="basic-addon1">
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-down" viewBox="0 0 16 16">
                            <path d="M3.204 5h9.592L8 10.481zm-.753.659 4.796 5.48a1 1 0 0 0 1.506 0l4.796-5.48c.566-.647.106-1.659-.753-1.659H3.204a1 1 0 0 0-.753 1.659"/>
                        </svg>
                    </span>
                    <input type="text" id="assuntoTxt" class="form-control" placeholder="${assunto.value}" aria-label="${assunto.value}" aria-describedby="basic-addon1">
                </div>
                <br>

                <div class="input-group">
                    <span class="input-group-text">Digite aqui:</span>
                    <textarea class="form-control" id="msgTxt" id="exampleFormControlTextarea1" rows="2" placeholder="${mensagem.value}"></textarea>
                </div>
                <br>

            </fieldset disabled>

        </section>
    </section> 
    `

}