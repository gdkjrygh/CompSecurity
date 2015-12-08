// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.widget.Toast;
import java.lang.ref.WeakReference;

public class UiThreadUtil
{
    private static class WbUtilHolder
    {

        public static final UiThreadUtil INSTANCE = new UiThreadUtil();


        private WbUtilHolder()
        {
        }
    }


    private UiThreadUtil()
    {
    }


    public static UiThreadUtil getInstance()
    {
        return WbUtilHolder.INSTANCE;
    }

    public void dismissLoading(WeakReference weakreference, final ProgressDialog progressDialog)
    {
        if (weakreference != null)
        {
            weakreference = (Activity)weakreference.get();
            if (weakreference != null)
            {
                weakreference.runOnUiThread(new Runnable() {

                    final UiThreadUtil this$0;
                    final ProgressDialog val$progressDialog;

                    public void run()
                    {
                        if (progressDialog != null && progressDialog.isShowing())
                        {
                            progressDialog.dismiss();
                        }
                    }

            
            {
                this$0 = UiThreadUtil.this;
                progressDialog = progressdialog;
                super();
            }
                });
            }
        }
    }

    public void dismissLoadingDialogAndDisplayError(final WeakReference activity, final ProgressDialog progressDialog, final int errorDialogId)
    {
        if (activity != null)
        {
            activity = (Activity)activity.get();
            if (activity != null)
            {
                activity.runOnUiThread(new Runnable() {

                    final UiThreadUtil this$0;
                    final Activity val$activity;
                    final int val$errorDialogId;
                    final ProgressDialog val$progressDialog;

                    public void run()
                    {
                        if (progressDialog != null && progressDialog.isShowing())
                        {
                            progressDialog.dismiss();
                        }
                        activity.showDialog(errorDialogId);
                    }

            
            {
                this$0 = UiThreadUtil.this;
                progressDialog = progressdialog;
                activity = activity1;
                errorDialogId = i;
                super();
            }
                });
            }
        }
    }

    public void displayToastMessage(final WeakReference activity, final String message, final int flags)
    {
        if (activity != null)
        {
            activity = (Activity)activity.get();
            if (activity != null)
            {
                activity.runOnUiThread(new Runnable() {

                    final UiThreadUtil this$0;
                    final Activity val$activity;
                    final int val$flags;
                    final String val$message;

                    public void run()
                    {
                        Toast.makeText(activity, message, flags).show();
                    }

            
            {
                this$0 = UiThreadUtil.this;
                activity = activity1;
                message = s;
                flags = i;
                super();
            }
                });
            }
        }
    }
}
