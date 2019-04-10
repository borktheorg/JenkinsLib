#!/usr/bin/env groovy

def call(String name = 'human'){
    echo "Hello, ${name}!!"
}

def commitStatus(boolean status = 'false', String repo = 'monorepo', String owner = 'bork'){
    echo "status, ${status}"
    echo "repo, ${repo}"
    echo "owner, ${owner}"
}