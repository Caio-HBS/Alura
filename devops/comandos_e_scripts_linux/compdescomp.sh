#! /bin/bash

read -p "Escolha a operacao desejada ('compactar' ou 'descompactar'): " operacao

case "$operacao" in
	"compactar")
		read -p "Entre o nome final do arquivo (.tar.gz): " arquivo_saida
		read -p "Entre a lista de arquivos a serem compactados(separados por espaco): " lista_arquivos
		
		tar -czf "$arquivo_saida" $lista_arquivos
		
		echo "Arquivos compactados em $arquivo_saida"
		
	;;
	"descompactar")
		read -p "Entre o nome do arquivo a ser descompactado (.tar.gz): " arquivo_descompactar
		read -p "Informe o diretorio de destino: " diretorio_destino
		
		tar -xzf "$arquivo_descompactar" -C "$diretorio_destino"
		
		echo "Arquivo descompactado com sucesso em $diretorio_destino"
		
	;;
	*)
	echo "Operacao invalida: verifique se voce selecionou uma operacao valida."
	exit 1
	;;
esac
