#!/usr/bin/env groovy

def call(String name = 'human', String repo = 'monorepo', String owner = 'bork'){
    echo "Hello, ${name}!!"
    echo "repo, ${repo}"
    echo "owner, ${owner}"
}

def getRepoURL() {
    sh "git config --get remote.origin.url > .git/remote-url"
    println(readFile(".git/remote-url").trim())
}

def getCommitSha() {
    sh "git rev-parse HEAD > .git/current-commit"
    println(readFile(".git/current-commit").trim())
}

return this
