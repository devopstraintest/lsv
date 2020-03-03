#!/bin/bash

execGroovy() {
    local CI_DIR="$(readlink -f "$(dirname "$0")/..")"
    echo "$CI_DIR"
    local SCRIPT="$1"
    echo "$SCRIPT"
    shift
    echo "$CI_DIR/scripts:$CI_DIR/src/main/groovy:$CI_DIR/ci-common/src/main/groovy:$CI_DIR/jobs"
    exec groovy --classpath "$CI_DIR/scripts:$CI_DIR/src/main/groovy:$CI_DIR/ci-common/src/main/groovy:$CI_DIR/jobs" "$SCRIPT" "$@"
   # exec groovy "$SCRIPT" "$@"
}


#source "$(dirname "$0")/groovy.sh"
execGroovy "newScript.groovy" $1