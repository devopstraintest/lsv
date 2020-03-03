#!/bin/bash

git add .
git commit -m "ls $(date + '%Y-%m-%d') update "
SHAholder=$(git cherry -v)
git push
echo $SHAholder


#if [ -z "$SHAholder" ]
#then
#  echo 'GERRIT_LINK_TEXT'=''
#  echo 'GERRIT_URL'='Everything up to date!'
#else
#  command=$(git log --name-status HEAD^..HEAD | grep Author | awk '{print $2}')
#  echo $command="test"  >> tst.properties
#fi

#key='key_value'
#value=12345
#
#echo 'GERRIT_LINK_TEXT'='Gerrit url:' >> tst.properties
#echo 'GERRIT_URL'=$value >> tst.properties