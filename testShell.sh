#!/bin/bash

#echo "testing test"
echo "testing test"
git add .

git commit -m "date $(date + '%Y-%m-%d') update "

git push
#
#
#echo $pushed
#
#
#if [ ${pushed} -eq 0 ]
#then
#  echo "xxxxxxxxxxxxxxxxxx"
#else
#  echo "no"
#fi

echo > tst2.properties
