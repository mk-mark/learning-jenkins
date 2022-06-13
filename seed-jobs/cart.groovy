multibranchPipelineJob('CI-pipelines/cart') {
    branchSources {
        git {
            id('23a744ab-a013-4682-addb-38fc7ccf8606') // IMPORTANT: use a constant and unique identifier
            remote('https://github.com/mk-mark/cart.git')
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