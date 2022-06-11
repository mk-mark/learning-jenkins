multibranchPipelineJob('CI-pipelines/b_cart') {
    branchSources {
        git {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            remote('https://github.com/mk-mark/b_cart')
            credentialsId('github-ci')
            includes('JENKINS-*')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}