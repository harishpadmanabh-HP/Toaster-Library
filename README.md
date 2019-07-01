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
                  implementation 'com.github.harishpadmanabh-HP:Toaster-Library:2.0'
	}
  
  Then you can use simply 
          ToasterMessage.toaster(MainActivity.this,"Example Toast");
          
          to show toast.
	  
	 
For WARNING toast ,pass context,message and positionOfToast in args. top, bottom and centre are currently available values for positionOfToast

                  ToasterMessage.warningToaster(this,"qwerty","top");



For SUCCESS toast ,pass context,message and positionOfToast in args. top, bottom and centre are currently available values for positionOfToast

		    ToasterMessage.successToaster(this,"qwerty","top");

For INFO toast ,pass context,message and positionOfToast in args. top, bottom and centre are currently available values for positionOfToast

                   ToasterMessage.infoToaster(this,"qwerty","top");
		  
		  
For CUSTOM Toast pass
context,
message,
position,
icon,
cardBackcolor,
textSize,
cardRadious.
                         
			 
			 
			 ToasterMessage.customToaster
			     (this,"qwerty","centre",R.drawable.ic_launcher_foreground,R.color.colorPrimary,25,15);



          
          HAPPY toasting !!

