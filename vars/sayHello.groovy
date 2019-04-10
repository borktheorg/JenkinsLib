#!/usr/bin/env groovy

def call(String name = 'human', boolean status = 'false', String repo = 'monorepo', String owner = 'bork'){
    echo "Hello, ${name}!!"
    echo "status, ${status}"
    echo "repo, ${repo}"
    echo "owner, ${owner}"
}