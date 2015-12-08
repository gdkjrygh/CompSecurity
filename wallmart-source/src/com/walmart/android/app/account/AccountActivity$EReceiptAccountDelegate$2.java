// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.app.Activity;
import android.app.ProgressDialog;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.account:
//            AccountActivity

class val.callback
    implements com.walmartlabs.ereceipt.service.ack
{

    final e this$0;
    final Activity val$activity;
    final e val$callback;
    final ProgressDialog val$pd;
    final Presenter val$presenter;

    public void onResult(com.walmartlabs.ereceipt.service.t t)
    {
        val$pd.dismiss();
        if (t == com.walmartlabs.ereceipt.service.t.NO)
        {
            cess._mth200(this._cls0.this, val$activity, val$presenter, val$callback);
            return;
        } else
        {
            val$callback.e();
            return;
        }
    }

    lt()
    {
        this$0 = final_lt;
        val$pd = progressdialog;
        val$activity = activity1;
        val$presenter = presenter1;
        val$callback = val.callback.this;
        super();
    }
}
