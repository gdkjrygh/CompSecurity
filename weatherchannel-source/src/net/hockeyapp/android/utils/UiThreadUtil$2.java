// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.utils;

import android.app.ProgressDialog;

// Referenced classes of package net.hockeyapp.android.utils:
//            UiThreadUtil

class val.progressDialog
    implements Runnable
{

    final UiThreadUtil this$0;
    final ProgressDialog val$progressDialog;

    public void run()
    {
        if (val$progressDialog != null && val$progressDialog.isShowing())
        {
            val$progressDialog.dismiss();
        }
    }

    ()
    {
        this$0 = final_uithreadutil;
        val$progressDialog = ProgressDialog.this;
        super();
    }
}
