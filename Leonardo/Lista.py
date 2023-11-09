def busca(nomeBuscar,lista):
  i = 0
  for n in lista:
    if n == nomeBuscar:
      print('Nome encontrado na posição: ',i)
      return
    i+=1
  print('Nome não encontrado')

def lerTxt():
  with open('/listaNomes.txt', 'r') as arquivo:
    nomes = []
    
    for linha in arquivo:
        nome = linha.strip()
        nomes.append(nome)
  return nomes

nome = input("Digite o nome que deseja buscar:")
lista = lerTxt()
busca(nome,lista)

