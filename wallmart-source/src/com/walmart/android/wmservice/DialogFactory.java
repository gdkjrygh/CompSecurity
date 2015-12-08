// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.util.Log;

public class DialogFactory
{
    public static interface DialogListener
    {

        public abstract void onClicked(int i, int j, Object aobj[]);
    }


    public static final int DIALOG_COULD_NOT_FIND_LOCATION = 101;
    public static final int DIALOG_ERROR_ADD_ITEM = 251;
    public static final int DIALOG_ERROR_CREATE_LIST = 250;
    public static final int DIALOG_ERROR_LOADING_ITEM = 6;
    public static final int DIALOG_ERROR_LOADING_ITEM_AVAILABILITY = 5;
    public static final int DIALOG_ERROR_LOADING_ITEM_DETAILS = 2;
    public static final int DIALOG_ERROR_LOADING_ORDER_DETAILS = 504;
    public static final int DIALOG_ERROR_LOADING_ORDER_LIST = 503;
    public static final int DIALOG_ERROR_NO_NETWORK = 600;
    public static final int DIALOG_LOCATION_SERVICE_FAILED = 100;
    public static final int DIALOG_PRESCRIPTION_NO_SELECTION = 702;
    public static final int DIALOG_PRESCRIPTION_SELECTION_ERROR = 701;
    public static final int DIALOG_RATE_APP = 800;
    public static final int DIALOG_SHOW_ON_WEBSITE = 7;
    public static final int DIALOG_SORT = 3;
    public static final int DIALOG_SYSTEM_ERROR = 901;
    public static final int DIALOG_UNABLE_ACQUIRE_LOCATION_USE_SEARCH = 102;
    public static final int DIALOG_UNKNOWN_ERROR = 900;

    public DialogFactory()
    {
    }

    public static Dialog onCreateDialog(int i, Activity activity)
    {
        return onCreateDialog(i, activity, null);
    }

    public static Dialog onCreateDialog(int i, Activity activity, DialogListener dialoglistener)
    {
        switch (i)
        {
        default:
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setMessage(0x7f0905a4).setPositiveButton(0x7f090292, null).create();

        case 503: 
            activity = new com.walmart.android.ui.CustomAlertDialog.Builder(activity);
            activity.setMessage("Could not retrieve order history. Please try again later").setCancelable(true).setPositiveButton("Ok", null);
            return activity.create();

        case 5: // '\005'
            activity = new com.walmart.android.ui.CustomAlertDialog.Builder(activity);
            activity.setMessage("This item is not available in a store near you.").setCancelable(true).setPositiveButton("Ok", null);
            return activity.create();

        case 6: // '\006'
            activity = new com.walmart.android.ui.CustomAlertDialog.Builder(activity);
            activity.setMessage("Could not retrieve value of the day. Please try again later.").setCancelable(true).setPositiveButton("Ok", null);
            return activity.create();

        case 7: // '\007'
            activity = new com.walmart.android.ui.CustomAlertDialog.Builder(activity);
            activity.setTitle(0x7f090603).setMessage(0x7f090605).setPositiveButton(0x7f090606, new android.content.DialogInterface.OnClickListener(dialoglistener, i) {

                final int val$id;
                final DialogListener val$listener;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    if (listener != null)
                    {
                        listener.onClicked(id, j, null);
                    }
                }

            
            {
                listener = dialoglistener;
                id = i;
                super();
            }
            }).setNegativeButton(0x7f090604, null);
            return activity.create();

        case 701: 
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setMessage("We can only process refills for one location at a time. Please place separate orders for each pickup location.").setCancelable(false).setTitle("Separate Orders Required").setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialoginterface, int j)
                {
                }

            }).create();

        case 702: 
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setMessage("Select One or More Prescriptions").setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialoginterface, int j)
                {
                }

            }).create();

        case 800: 
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setTitle("Share your thoughts").setMessage("Did you enjoy using this app to shop? If so, please leave a review in Google Play. Tap \"Rate & Review\" to share your thoughts").setCancelable(true).setPositiveButton("Review App", new android.content.DialogInterface.OnClickListener(dialoglistener, i) {

                final int val$id;
                final DialogListener val$listener;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    listener.onClicked(id, j, null);
                }

            
            {
                listener = dialoglistener;
                id = i;
                super();
            }
            }).setNegativeButton("No, Thanks", null).create();

        case 100: // 'd'
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setMessage(0x7f090598).setCancelable(true).setPositiveButton(0x7f090292, null).create();

        case 101: // 'e'
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setMessage(0x7f090596).setCancelable(true).setPositiveButton(0x7f090292, null).create();

        case 102: // 'f'
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setMessage(0x7f09059d).setCancelable(true).setPositiveButton(0x7f090292, null).create();

        case 250: 
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setMessage(0x7f090620).setPositiveButton(0x7f090292, null).create();

        case 251: 
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setMessage(0x7f09061f).setPositiveButton(0x7f090292, null).create();
        }
    }

    public static void showDialog(int i, Activity activity)
    {
        showDialog(i, activity, null);
    }

    public static void showDialog(int i, Activity activity, DialogListener dialoglistener)
    {
        activity = onCreateDialog(i, activity, dialoglistener);
        try
        {
            activity.show();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            Log.w(com/walmart/android/wmservice/DialogFactory.getSimpleName(), "Failed to show dialog");
        }
    }

    public static void showErrorDialog(Activity activity, int i)
    {
        if (i >= 500 && i <= 599)
        {
            showDialog(901, activity);
            return;
        }
        if (i == 0x15f92)
        {
            showDialog(600, activity);
            return;
        } else
        {
            showDialog(901, activity);
            return;
        }
    }
}
