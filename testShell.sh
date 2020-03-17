#!/bin/bash

changes=$(git diff --quiet)

"testing test"
"testing test"
git add .

git commit -m "date $(date + '%Y-%m-%d') update "

if git push
then
  echo "xxxxxxxxxxxxxxxxxx"
else
  echo "no"
fi
