#!/bin/bash

#BASEDIR=$(dirname "$0")

#VSN=$($BASEDIR/testShellOne.sh 20)
#echo "$VSN"

#a = ['system-platform','ea-applications','sqm-applications','sqm-engine','eea-common','os-tlp','eea-admin-node-components-tlp','system-platform-tlp','ea-applications-tlp','sqm-applications-tlp','sqm-engine-tlp']
#
#
#groovy newScript.groovy a
key='key_value'
value=12345

echo 'GERRIT_LINK_TEXT'='Gerrit url:' >> tst.properties
echo 'GERRIT_URL'=$value >> tst.properties