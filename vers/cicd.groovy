def newGit(repo)
{
git "${repo}"
}
def newmaven()
{
sh 'mvn package'
}
def newdeploy()
{
deploy adapters: [tomcat9(credentialsId: '0a6acc03-208e-4911-8386-b187895e5c48', path: '', url: 'http://172.31.80.61:8080')], contextPath: 'testapp', war: '**/*.war'
}
