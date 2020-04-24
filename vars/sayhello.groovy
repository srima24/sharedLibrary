#!/usr/bin/env groovy

set +x
info() {
echo "\033[1;33m[Info]    \033[0m $1"
}

error() {
echo "\033[1;31m[Error]   \033[0m $1"
}


success() {
echo "\033[1;32m[Success] \033[0m $1"
}

def call(String name = 'ansi color') {
  echo "${name}"
}
