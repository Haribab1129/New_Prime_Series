node{
     stage('SOM Checkout'){
	 git  'https://github.com/Haribab1129/New_Prime_Series.git'
	 }
	 stage('Compile-Package'){
	 def mvnHome = tool name: 'maven', type:'maven'
	 sh "${mvnHome}/bin/mvn package"
	 }

}
