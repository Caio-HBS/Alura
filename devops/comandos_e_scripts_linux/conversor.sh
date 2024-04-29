#!/bin/bash

read -p "Digite o caminho do diretório com as imagens JPG: " diretorio

if [ ! -d "$diretorio" ]; then
    echo "Diretório não encontrado: $diretorio"
    exit 1
fi

for imagem_jpg in "$diretorio"/*.jpg; do
    convert "$imagem_jpg" "${imagem_jpg%.jpg}.png" && echo "Imagem convertida: ${imagem_jpg%.jpg}.png" || echo "Falha na conversão: $imagem_jpg"
done

echo "Conversão concluída!"
