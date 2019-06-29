# Toaster-Library
use this to show toast easily 

# Usage

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file


Add jitpack in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.harishpadmanabh-HP:Toaster-Library:Toaster'
	}
  
  Then you can use simply 
          ToasterMessage.toaster(MainActivity.this,"Example Toast");
          
          to show toast.
          
          HAPPY toasting !!

