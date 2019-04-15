#!/usr/bin/env groovy

def call(String name = 'human', String repo = 'monorepo', String owner = 'bork'){
    echo "Hello, ${name}!!"
    echo "repo, ${repo}"
    echo "owner, ${owner}"
}
