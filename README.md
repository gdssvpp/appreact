# App React + Spring

Seja bem vindo ao meu projeto React + Spring!

Criei essa aplicação seguindo os vídeos do Professor Nélio do Dev Superior.
Aqui você encontra o [PROJETO](https://gdssvpp.netlify.app/).

Tudo que você viu aqui é um estagiário que tenta desenvolver algumas coisas e jogar no GitHub como portfólio..
(A parte da filtragem por nome foi eu quem fez... Acredito que seja algo que deveria ter no projeto, pra quem fez o mesmo projeto e gostaria de incrementar, sinta-se à vontade!).


## Funcionalidades

- Filtro por Datas;
- Filtro por Nome(funcionalidade depende da data correta);
- Envia SMS; 



## Referência

 - [Dev Superior](https://www.instagram.com/devsuperior.ig/) produziu as vídeo-aulas que resultaram nesse projeto.

 

## 🔗 Links
*Me conheça um pouco mais!*
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/pablo-nogueira-9a0313205/)

Obrigado por ter lido até aqui e valeu pela presença!

## ATENÇÃO!! 
O ENVIO DE SMS PARA UM NOVO NÚMERO AINDA NÃO ESTÁ FUNCIONANDO, CASO EU ADICIONE ESSA FUNÇÃO FUTURAMENTE EU COLOCAREI UM AVISO NO TOPO DO LEIA-ME!!

(Porém, já vou deixar escrito um passo-a-passo aqui pra facilitar futuramente.)

(Os SMSs em questão estão cadastrados para serem enviados para o meu celular. Caso você queira que seja enviado para o seu, tenha o Spring Tool Suite e coloque as Variáveis de Ambientes conforme criado na sua conta da [Twilio](https://www.twilio.com/pt-br/). Você precisará clonar o repositório, após isso setar as Variáveis conforme o Arquivo *application.properties* dentro do repositório, que são elas: ${TWILIO_SID}, ${TWILIO_KEY}, ${TWILIO_PHONE_FROM} e ${TWILIO_PHONE_TO}.

Passo-a-passo:

Botão direito no projeto e navegue até Run As -> Run Configurations.
![image](https://user-images.githubusercontent.com/92610124/185016269-65cb550b-b3cb-4670-abfc-c8e9e6e1f73c.png).

Abrindo essa tela, vá até Environment.
![image](https://user-images.githubusercontent.com/92610124/185016390-01f3f29f-4e4d-4590-9d11-04797ec7d6e4.png)

E é aqui que você adiciona as Variáveis de Ambiente:
![image](https://user-images.githubusercontent.com/92610124/185016463-4d58a06b-a911-43ab-af21-0719b9097276.png)

(As informações de SID, KEY e PHONE FROM você conseguirá após a criação e autenticação da sua conta na Twilio!).

Após todos esses passos, inicie o projeto e envie um SMS! 🥳
