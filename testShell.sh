#!/bin/bash

git add .
git commit -m "ls $(date + '%Y-%m-%d') update "
#git push
command=$(git log --name-status HEAD^..HEAD | grep Author)

echo $command | awk '{print $2}'


#key='key_value'
#value=12345
#
#echo 'GERRIT_LINK_TEXT'='Gerrit url:' >> tst.properties
#echo 'GERRIT_URL'=$value >> tst.properties