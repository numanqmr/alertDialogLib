package com.example.testlib;

import android.app.Activity;

import androidx.appcompat.app.AlertDialog;

/**
 * Created by Numan on 9/10/19.
 */
public class AlertHelper {

    public static void successAlert(Activity activity, String message, AlertDialog.OnClickListener listener, AlertDialog.OnClickListener listener2) {
        new AlertDialog.Builder(activity)
                .setPositiveButton("YES", listener)// You can pass also View.OnClickListener as second param
                .setNegativeButton("NO", listener2)// You can pass also View.OnClickListener as second param
                .setMessage(message)
                .setCancelable(false)
                .show();
    }
    public static void successAlert(Activity activity, String message, AlertDialog.OnClickListener listener) {
        new AlertDialog.Builder(activity)
                .setPositiveButton("OK", listener)// You can pass also View.OnClickListener as second param
                .setMessage(message)
                .setCancelable(false)
                .show();
    }
    public static void successAlert(Activity activity, String message, String positiveBtnText, String negativeBtnText, AlertDialog.OnClickListener listener, AlertDialog.OnClickListener listener2) {
        new AlertDialog.Builder(activity)
                .setPositiveButton(positiveBtnText, listener)// You can pass also View.OnClickListener as second param
                .setNegativeButton(negativeBtnText, listener2)// You can pass also View.OnClickListener as second param
                .setMessage(message)
                .setCancelable(false)
                .show();
    }
    public static void errorAlert(Activity activity, String message, String positiveBtnText, String negativeBtnText, AlertDialog.OnClickListener listener, AlertDialog.OnClickListener listener2) {
        new AlertDialog.Builder(activity)
                .setPositiveButton(positiveBtnText, listener)// You can pass also View.OnClickListener as second param
                .setNegativeButton(negativeBtnText, listener2)// You can pass also View.OnClickListener as second param
                .setMessage(message)
                .setCancelable(false)
                .show();
    }
    public static void errorAlert(Activity activity, String message, AlertDialog.OnClickListener postivityListener, AlertDialog.OnClickListener listener2) {
        new AlertDialog.Builder(activity)
                .setIcon(android.R.drawable.ic_delete)
                .setPositiveButton("YES", postivityListener)// You can pass also View.OnClickListener as second param
                .setNegativeButton("NO", listener2)// You can pass also View.OnClickListener as second param
                .setMessage(message)
                .setCancelable(false)
                .show();
    }
    public static void errorAlert(Activity activity, String message, AlertDialog.OnClickListener postivityListener) {
        new AlertDialog.Builder(activity)
                .setIcon(android.R.drawable.ic_delete)
                .setPositiveButton("Ok", postivityListener)// You can pass also View.OnClickListener as second param
                .setMessage(message)
                .setCancelable(false)
                .show();
    }


}
