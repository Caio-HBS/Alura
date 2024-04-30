#! /bin/bash

if pgrep nginx &> /dev/null
then
    echo "Nginx está em execução $( date +"%Y-%m-%d_%H:%M:%S")"
else
    echo "Nginx está fora do ar $( date +"%Y-%m-%d_%H:%M:%S")"
fi