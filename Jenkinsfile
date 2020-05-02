node{
	stage("Git clone"){
		git credentialsId: 'GITHUB_CREDENTIALS', url: 'https://github.com/surjeetkm/selfhealing.git'
	}
	stage("Build Artifact"){
		def mavenHome = tool name : "Maven", type: "maven"
		def mavenCmd = "${mavenHome}/bin/mvn"
		sh "${mavenCmd} clean install"
	}
	stage("Build Docker Image"){
		app=docker.build('microservices-2020/self-healing:v1')
	}
	stage("Push Docker image to Container Registry"){
			docker.withRegistry('https://eu.gcr.io', 'gcr:myregistry') {
 	 		app.push()
 	 		
		}
	}


}