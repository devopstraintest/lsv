#!/bin/bash


changes=$(git diff --quiet)
changes=$?
git add .
echo $changes
git commit -m "ls $(date + '%Y-%m-%d') update "
#git log @{u}.. --quiet
#changes=$?
#echo "*****"
#echo $changes
#SHAholder=$(git cherry -v)
git push
#
#if [ -z "$SHAholder" ]
#then
#  echo 'GERRIT_LINK_TEXT'='' >> tst2.properties
#  echo 'GERRIT_URL'='Everything up to date!' >> tst2.properties
#else
#  command=$(git log --name-status HEAD^..HEAD | grep Reviewed | awk '{print $2}')
#  echo 'GERRIT_LINK_TEXT'='Gerrit url:' >> tst2.properties
#  echo 'GERRIT_URL'=$command >> tst2.properties
#fi
#
#
