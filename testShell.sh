#!/bin/bash

changes=$(git diff --quiet)

"testing test"

git add .
echo $changes
git commit -m "date $(date + '%Y-%m-%d') update "

if git push
then
  echo "testing test"
else
  echo "no"
fi
