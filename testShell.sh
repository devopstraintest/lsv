#!/bin/bash

git add .
git commit -m "ls $(date + '%Y-%m-%d') update "
SHAholder=$(git cherry -v)
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