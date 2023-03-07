node{
     stage('SOM Checkout'){
	 git  
	 }
	 stage('Compile-Package'){
	 def MAVEN_HOME = tool name: 'maven-3', type:'maven'
	 sh "${MAVEN_HOME}/bin/mvn package"
	 }

}
