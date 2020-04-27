#!/usr/bin/env groovy

set +x
def info() {
echo "\033[1;33m[Info]    \033[0m "
}

def error() {
echo "\033[1;31m[Error]   \033[0m "
}


def success() {
echo "\033[1;32m[Success] \033[0m "
}

def call(String name = 'ansi color') {
  echo "${name}"
  
}
