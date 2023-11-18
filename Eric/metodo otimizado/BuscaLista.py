def buscar(lista, nome):
    if nome in lista:
        return f"Nome encontrado: {nome}"
    else:
        return f"Nome não encontrado: {nome}"

with open('lista.txt', 'r') as file:
    lista_nomes = file.read().splitlines()

nome_busca = input("Digite o nome que deseja buscar: ")

resultado_busca = buscar(lista_nomes, nome_busca)

print(resultado_busca)
