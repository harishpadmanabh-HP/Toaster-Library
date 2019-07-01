package com.example.toasterlibrary;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.Toast;
import com.mrntlu.toastie.*;


public class ToasterMessage {

    int icon=R.drawable.ic_check_circle_black_24dp;


    public static void toaster(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }



    //warning toast
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
    //success toast
    public static void successToaster(Context c, String message,String postionOfToast) {


        if(postionOfToast.equalsIgnoreCase("bottom"))
        {
            Toastie.success(c,message, Toast.LENGTH_LONG).show();

        }
        else if(postionOfToast.equalsIgnoreCase("centre"))
        {
            Toastie.centerSuccess(c,message, Toast.LENGTH_LONG).show();

        }
        else if(postionOfToast.equalsIgnoreCase("top"))
        {
            Toastie.topSuccess(c,message, Toast.LENGTH_LONG).show();

        }
        else
        {
            Toastie.success(c,message, Toast.LENGTH_LONG).show();

        }


    }

    //info toast

    public static void infoToaster(Context c, String message,String postionOfToast) {

        if(postionOfToast.equalsIgnoreCase("bottom"))
        {
            Toastie.info(c,message, Toast.LENGTH_LONG).show();

        }
        else if(postionOfToast.equalsIgnoreCase("centre"))
        {
            Toastie.centerInfo(c,message, Toast.LENGTH_LONG).show();

        }
        else if(postionOfToast.equalsIgnoreCase("top"))
        {
            Toastie.topInfo(c,message, Toast.LENGTH_LONG).show();

        }
        else
        {
            Toastie.info(c,message, Toast.LENGTH_LONG).show();

        }


    }



        //custom toast

    public static void customToaster(Context c, String message,String postionOfToast,int icon,int cardBackcolor,int textSize,int cardRadious) {

        if(postionOfToast.equalsIgnoreCase("bottom"))
        {
            Toastie.allCustom(c)
                    .setTypeFace(Typeface.DEFAULT_BOLD)
                    .setTextSize(textSize)
                    .setCardRadius(cardRadious)
                    .setCardElevation(10)
                    .setIcon(icon)
                    .setCardBackgroundColor(cardBackcolor)
                    .setMessage(message)
                    .setGravity(Gravity.BOTTOM,5,5)
                    .createToast(Toast.LENGTH_LONG)
                    .show();
        }
        else if(postionOfToast.equalsIgnoreCase("centre"))
        {
            Toastie.allCustom(c)
                    .setTypeFace(Typeface.DEFAULT_BOLD)
                    .setTextSize(textSize)
                    .setCardRadius(cardRadious)
                    .setCardElevation(10)
                    .setIcon(icon)
                    .setCardBackgroundColor(cardBackcolor)
                    .setMessage("Fully customizable toast. But in a different way.")
                    .setGravity(Gravity.CENTER,5,5)
                    .createToast(Toast.LENGTH_LONG)
                    .show();
        }
        else if(postionOfToast.equalsIgnoreCase("top"))
        {
            Toastie.allCustom(c)
                    .setTypeFace(Typeface.DEFAULT_BOLD)
                    .setTextSize(textSize)
                    .setCardRadius(cardRadious)
                    .setCardElevation(10)
                    .setIcon(icon)
                    .setCardBackgroundColor(cardBackcolor)
                    .setMessage("Fully customizable toast. But in a different way.")
                    .setGravity(Gravity.TOP,5,5)
                    .createToast(Toast.LENGTH_LONG)
                    .show();
        }
        else
        {
            Toastie.allCustom(c)
                    .setTypeFace(Typeface.DEFAULT_BOLD)
                    .setTextSize(textSize)
                    .setCardRadius(cardRadious)
                    .setCardElevation(10)
                    .setIcon(icon)
                    .setCardBackgroundColor(cardBackcolor)
                    .setMessage("Fully customizable toast. But in a different way.")
                    .setGravity(Gravity.BOTTOM,5,5)
                    .createToast(Toast.LENGTH_LONG)
                    .show();
        }




    }



}
