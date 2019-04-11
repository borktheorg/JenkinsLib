package com.test.utils

class Utilities implements Serializable {

    def steps

    Utilities(steps){
        this.steps = steps
    }

    def getRepoURL() {
        steps.sh "git config --get remote.origin.url > .git/remote-url"
        //println( readFile(".git/remote-url").trim() )
    }

    def getCommitSha() {
        steps.sh "git rev-parse HEAD > .git/current-commit"
        //println(readFile(".git/current-commit").trim())
    }
}