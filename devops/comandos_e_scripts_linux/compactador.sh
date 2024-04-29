#! /bin/bash

if [ "$#" -lt 1 ]; then
	echo "O programa $0 requer o nome do arquivo final e os arquivos a serem compactados"
	exit 1
fi

arquivo_saida="$1"
arquivos=("${@:2}")

tar -czf "$arquivo_saida" "${arquivos[@}"

echo "Compactado com sucesso em $arquivo_saida"
