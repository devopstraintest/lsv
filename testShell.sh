#!/bin/bash

changes=$(git diff --quiet)

"testing test"
"another test"
"another test"

"another test"
changes=$?

"testing test"
"another test"
"another test"

"another test"
git add .
echo $changes
git commit -m "date $(date + '%Y-%m-%d') update "

"testing test"
"another test"
"another test"

"another test"
#git log @{u}.. --quiet
#changes=$?
#echo "*****"
#echo $changes
#SHAholder=$(git cherry -v)
git push
"testing test"
#
#if [ -z "$SHAholder" ]
#then
#  echo "empty"
#else
#  command=$(git log --name-status HEAD^..HEAD | grep Author | awk '{print $2}')
#  echo $command="test"  >> tst.properties
#fi

"testing test"
"another test"
"another test"

"another test"