#!/bin/bash

git add .
git commit -m "ls $(date + '%Y-%m-%d') update "
temporarySHAholder=$(git cherry -v)
git push

if[-z "$temporarySHAholder"]
then
  echo "empty"="test"  >> tst.properties
else
  command=$(git log --name-status HEAD^..HEAD | grep Author | awk '{print $2}')
  echo $command="test"  >> tst.properties
fi

#key='key_value'
#value=12345
#
#echo 'GERRIT_LINK_TEXT'='Gerrit url:' >> tst.properties
#echo 'GERRIT_URL'=$value >> tst.properties