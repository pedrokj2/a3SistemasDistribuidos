
# Autism Tutor


# Sobre o projeto

Autism Tutor é um aplicativo web com uma finalidade de auxiliar o cadastro de tutores em uma instituição para dar apoio a estudantes com autismo;

O aplicativo consiste em cadastrar os respectivos tutores na plataforma Autims Tutor com o foco de facilitar e atualizar o sistema da instituição, onde os dados são coletados no app web.

## Layout Web
### Logo

![logo](https://github.com/pedrokj2/Readme-/assets/173087252/2e639592-b1f1-486f-bb25-2248c1a82651)

### Tela Inicial

![tela inicial](https://github.com/pedrokj2/Readme-/assets/173087252/c8ce9146-9f34-40b3-bf77-7ed77bb80fa8)

### Tela de pesquisa 

![tela de pesquisa](https://github.com/pedrokj2/Readme-/assets/173087252/59abc61d-1d70-43d1-a151-4286970e82f7)

### Tela de cadastro 

![cadastro](https://github.com/pedrokj2/Readme-/assets/173087252/eff8a3a8-806a-41a5-9801-0a3c0b5bb6ed)


# Linguagem utilizadas
- Java
# Programa utilizado
- NetBeans
## Implantação do sistema 
- Banco de dados: Mysql 
O código implementa uma interface gráfica em Java, utilizando Swing, para gerenciamento de registros de clientes baseados no CPF. As funcionalidades principais incluem:

1. *Pesquisar* - Verificar se o CPF inserido é válido e buscar as informações do cliente armazenadas em um arquivo de texto.
2. *Atualizar* - Atualizar o arquivo de texto com novas informações fornecidas pelo usuário.
3. *Excluir* - Excluir o arquivo de texto correspondente ao CPF fornecido.
4. *Ver Foto* - Abrir uma foto do cliente, armazenada em um diretório específico, se a mesma existir.

# Como executar o projeto

1. *Validação de CPF*:
   - Verifica se o CPF contém exatamente 11 dígitos.
   - Garante que todos os dígitos não sejam iguais.
   - Calcula os dígitos verificadores para validar a autenticidade do CPF.

2. *Interface Gráfica*:
   - Usa componentes Swing, como JLabel, JButton, JTextArea, JFormattedTextField, e JScrollPane.
   - Permite interação com botões para confirmar, atualizar, excluir, e visualizar fotos.
   - Exibe mensagens de erro e sucesso em caixas de diálogo (JOptionPane).

3. *Manipulação de Arquivos*:
   - Lê informações de um arquivo de texto específico ao CPF.
   - Escreve e atualiza informações no arquivo de texto.
   - Exclui arquivos de texto que correspondem ao CPF.
   - Abre arquivos de imagem (fotos) armazenados em um diretório específico.

4. *Gerenciamento de Eventos*:
   - Utiliza ActionListener para gerenciar eventos de clique nos botões.
   - Executa ações como validação de CPF, leitura/escrita de arquivos, e abertura de imagens em resposta aos eventos.

5. *Organização e Layout*:
   - Utiliza GroupLayout para organizar os componentes dentro do painel (JPanel).
   - Define a estrutura da janela interna (JInternalFrame) para que seja fechável e tenha um tamanho preferido.

Essas características permitem que o código ofereça uma interface amigável e eficiente para o gerenciamento de dados de clientes através da manipulação de arquivos e validação de informações.







