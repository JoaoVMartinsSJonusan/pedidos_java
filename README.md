Esse código faz o cadastro do cliente com:
- Nome;
- Email;
- Data de nascimento;
- Status do pedido (utilizando a enumeração para que o status possa ser constante);

Logo após pede a quantidade de pedidos para serem cadastrados, adicionando-os em uma lista, com os dados:
- Nome do produto;
- Preço;
- Quantidade;

Ao final do programa é exibido na tela o momento exato em que o cliente fez o pedido (utiliza-se a data e hora local da maquina em que se esta rodando), mostra o status do pedido, os dados cadastrados do cliente e logo após todos os itens cadastrados separadamente Ex: nome: tv, valor: 2000, quantidade: 2, e mostra valor de cada item e o subtotal desse pedido, ao fim mostra o valor total que o cliente tem que pagar pelos produtos.


A pasta Application conta com o programa principal, onde o cliente é cadastrado com o pedido.

A pasta entities conta com as classes onde os dados sao armazenados e calculos sao feitos, contando com composições para usar os dados de uma classe em outra sem ter que herdar todos os metodos e atributos da mesma.

A pasta enums conta com enumeradores para classificar o status do pedido.
