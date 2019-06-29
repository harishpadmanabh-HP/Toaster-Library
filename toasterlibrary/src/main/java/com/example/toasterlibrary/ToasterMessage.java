package com.example.toasterlibrary;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.widget.Toast;
import com.mrntlu.toastie.*;


public class ToasterMessage {


    public static void toaster(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }



    public static void warningToaster(Context c, String message,String postionOfToast) {



        if(postionOfToast.equalsIgnoreCase("bottom"))
        {
            Toastie.warning(c,message, Toast.LENGTH_LONG).show();

        }
        else if(postionOfToast.equalsIgnoreCase("centre"))
        {
            Toastie.centerWarning(c,message, Toast.LENGTH_LONG).show();

        }
        else if(postionOfToast.equalsIgnoreCase("top"))
        {
            Toastie.topWarning(c,message, Toast.LENGTH_LONG).show();

        }
        else
        {
            Toastie.warning(c,message, Toast.LENGTH_LONG).show();

        }



    }

    }
