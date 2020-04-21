#!/usr/bin/env groovy

set +x


error() {
echo "\033[1;31m [Error]   \033[0m "
}


success() {
echo "\033[1;32m [Success] \033[0m "
}


def call(String str = "hello") {
success()
 error()
}
