// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.ui;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.text.format.DateUtils;
import android.util.Log;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.ui.dob.DateInputDialogBuilder;
import java.util.Locale;

public class DialogFactory
{
    public static interface DialogListener
    {

        public abstract void onClicked(int i, int j, Object aobj[]);
    }

    public static interface DobDialogListener
    {

        public abstract void onCancel();

        public abstract void onDateEntered(String s);
    }

    private static class OnErrorDialogDismissListener
        implements android.content.DialogInterface.OnDismissListener
    {

        private String mError;
        private android.content.DialogInterface.OnDismissListener mWrappedListener;

        public void onDismiss(DialogInterface dialoginterface)
        {
            if (mWrappedListener != null)
            {
                mWrappedListener.onDismiss(dialoginterface);
            }
            MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", mError));
        }

        public OnErrorDialogDismissListener(String s, android.content.DialogInterface.OnDismissListener ondismisslistener)
        {
            mError = s;
            mWrappedListener = ondismisslistener;
        }
    }


    public static final int DIALOG_CLIENT_SESSION_TIMEOUT = 0x10000;
    public static final int DIALOG_ERROR_RX_NOT_ONLINE_REFILLABLE = 0x10001;
    public static final int DIALOG_ERROR_SERVICE_SUSPENDED = 65535;
    public static final int DIALOG_PHARMACY_INVALID_RX_STORE = 0x10003;
    public static final int DIALOG_PHARMACY_LOADING = 0x10002;
    private static final int DIALOG_START = 65535;
    public static final int DIALOG_SYSTEM_ERROR = 0x10004;
    private static final String TAG = com/walmartlabs/android/pharmacy/ui/DialogFactory.getSimpleName();
    private static final String sDateFormatter = "%02d%02d%04d";

    public DialogFactory()
    {
    }

    public static Dialog onCreateDialog(int i, Activity activity)
    {
        return onCreateDialog(i, activity, null);
    }

    public static Dialog onCreateDialog(int i, Activity activity, DialogListener dialoglistener)
    {
        return onCreateDialog(i, activity, dialoglistener, null);
    }

    public static Dialog onCreateDialog(int i, Activity activity, DialogListener dialoglistener, android.content.DialogInterface.OnDismissListener ondismisslistener)
    {
        switch (i)
        {
        default:
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setMessage(com.walmartlabs.android.pharmacy.R.string.pharmacy_system_error_message).setCancelable(true).setOnDismissListener(ondismisslistener).setPositiveButton(com.walmartlabs.android.pharmacy.R.string.ok, new android.content.DialogInterface.OnClickListener(dialoglistener, i) {

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
            }).create();

        case 65537: 
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setMessage(com.walmartlabs.android.pharmacy.R.string.pharmacy_rx_not_refillable_online).setCancelable(true).setOnDismissListener(new OnErrorDialogDismissListener("errMsgNoOnlineRefill", ondismisslistener)).setPositiveButton(com.walmartlabs.android.pharmacy.R.string.ok, null).create();

        case 65535: 
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setView(ViewUtil.inflate(activity, com.walmartlabs.android.pharmacy.R.layout.pharmacy_service_suspended_dialog)).setCancelable(true).setPositiveButton(com.walmartlabs.android.pharmacy.R.string.ok, new android.content.DialogInterface.OnClickListener(dialoglistener, i) {

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
            }).create();

        case 65536: 
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setMessage(com.walmartlabs.android.pharmacy.R.string.pharmacy_general_session_timeout_msg).setCancelable(true).setOnDismissListener(new OnErrorDialogDismissListener("errMsgCartEmptied", ondismisslistener)).setPositiveButton(com.walmartlabs.android.pharmacy.R.string.ok, new android.content.DialogInterface.OnClickListener(dialoglistener, i) {

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
            }).create();

        case 65538: 
            dialoglistener = CustomProgressDialog.create(activity);
            dialoglistener.setMessage(activity.getString(com.walmartlabs.android.pharmacy.R.string.pharmacy_loading_dialog));
            dialoglistener.setIndeterminate(true);
            dialoglistener.setCancelable(true);
            return dialoglistener;

        case 65539: 
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setMessage(com.walmartlabs.android.pharmacy.R.string.pharmacy_scan_to_refill_invalid_rx).setCancelable(true).setOnDismissListener(new OnErrorDialogDismissListener("errMsgInvalidRxNum", ondismisslistener)).setPositiveButton(com.walmartlabs.android.pharmacy.R.string.ok, null).create();
        }
    }

    public static void showCoolDownDialog(Activity activity, boolean flag, int i, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        android.view.View view = ViewUtil.inflate(activity, com.walmartlabs.android.pharmacy.R.layout.cooldown_dialog);
        TextView textview = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.pharmacy.R.id.cooldown_info_msg);
        CharSequence charsequence;
        int j;
        long l;
        long l1;
        long l2;
        if (flag)
        {
            j = com.walmartlabs.android.pharmacy.R.string.pharmacy_cooldown_dialog_disabled_account;
        } else
        {
            j = com.walmartlabs.android.pharmacy.R.string.pharmacy_cooldown_dialog_not_checked;
        }
        textview.setText(j);
        textview = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.pharmacy.R.id.cooldown_try_again_in);
        l2 = System.currentTimeMillis();
        l1 = i;
        if (l1 > 3600L && l1 % 3600L > 0L)
        {
            l = (l1 / 3600L + 1L) * 3600L;
        } else
        if (l1 > 60L && l1 % 60L > 0L)
        {
            l = (l1 / 60L + 1L) * 60L;
        } else
        {
            l = l1;
            if (l1 < 60L)
            {
                l = 60L;
            }
        }
        charsequence = DateUtils.getRelativeTimeSpanString(l2 + 1000L * l, l2, 60000L);
        textview.setText(activity.getString(com.walmartlabs.android.pharmacy.R.string.pharmacy_cooldown_dialog_try_again_in, new Object[] {
            charsequence
        }));
        activity = (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setView(view).setCancelable(false).setPositiveButton(com.walmartlabs.android.pharmacy.R.string.ok, onclicklistener).create();
        try
        {
            activity.show();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            Log.w(TAG, "Failed to show dialog");
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
            Log.w(TAG, "Failed to show dialog");
        }
    }

    public static void showDobDialog(Activity activity, DobDialogListener dobdialoglistener)
    {
        showDobDialog(activity, new com.walmartlabs.android.pharmacy.ui.dob.DateInputDialogBuilder.OnDateSetListener(dobdialoglistener) {

            final DobDialogListener val$listener;

            public void onCancel()
            {
                if (listener != null)
                {
                    listener.onCancel();
                }
            }

            public void onDateSet(int i, int j, int k)
            {
                if (listener != null)
                {
                    listener.onDateEntered(String.format(Locale.US, "%02d%02d%04d", new Object[] {
                        Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i)
                    }));
                }
            }

            
            {
                listener = dobdialoglistener;
                super();
            }
        });
    }

    public static void showDobDialog(Activity activity, com.walmartlabs.android.pharmacy.ui.dob.DateInputDialogBuilder.OnDateSetListener ondatesetlistener)
    {
        activity = (new DateInputDialogBuilder(activity)).setTitle(com.walmartlabs.android.pharmacy.R.string.pharmacy_dob_dialog_enter_dob).setOnDateSetListener(ondatesetlistener).create();
        try
        {
            activity.show();
            MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Rx:DobOverlay"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            Log.w(TAG, "Failed to show dialog");
        }
    }

    public static void showInvalidDobDialog(Activity activity, android.content.DialogInterface.OnClickListener onclicklistener, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        activity = (new com.walmart.android.ui.CustomAlertDialog.Builder(activity)).setMessage(com.walmartlabs.android.pharmacy.R.string.pharmacy_invalid_dob).setCancelable(true).setOnCancelListener(oncancellistener).setPositiveButton(com.walmartlabs.android.pharmacy.R.string.pharmacy_dob_dialog_try_again, onclicklistener).setNegativeButton(com.walmartlabs.android.pharmacy.R.string.cancel_button, new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
            }

        }).create();
        try
        {
            activity.show();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            Log.w(TAG, "Failed to show dialog");
        }
    }

}
