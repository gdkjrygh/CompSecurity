// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.utils;

import android.app.Activity;
import android.app.ProgressDialog;

// Referenced classes of package net.hockeyapp.android.utils:
//            UiThreadUtil

class val.errorDialogId
    implements Runnable
{

    final UiThreadUtil this$0;
    final Activity val$activity;
    final int val$errorDialogId;
    final ProgressDialog val$progressDialog;

    public void run()
    {
        if (val$progressDialog != null && val$progressDialog.isShowing())
        {
            val$progressDialog.dismiss();
        }
        val$activity.showDialog(val$errorDialogId);
    }

    ()
    {
        this$0 = final_uithreadutil;
        val$progressDialog = progressdialog;
        val$activity = activity1;
        val$errorDialogId = I.this;
        super();
    }
}
