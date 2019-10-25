mvn -PDebug test -Dbrowser=chrome -Durl=VoiceWatch-26.2

mvn -PSanity test -Dbrowser=chrome -Durl=VoiceWatch-26.2

mvn -PRegression test -Dbrowser=chrome -Durl=VoiceWatch-26.2


#To Run on eclipse

Comment

First#
String URL=System.getProperty("url");

if (URL.contains("VoiceWatch-26.0")) {	
	driver.get(prop.getProperty("url1"));
}	
	if (URL.contains("VoiceWatch-26.1")) {
		
		driver.get(prop.getProperty("url2"));
	
} if (URL.contains("VoiceWatch-26.2")) {
	
	driver.get(prop.getProperty("url3"));	
}

Second#
String browserName=System.getProperty("browser");
================================
Uncomment

First#

String browserName=prop.getProperty("browser");

Second#
//driver.get(prop.getProperty("url3"));

=====================================