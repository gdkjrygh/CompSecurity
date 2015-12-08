// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.uservoice.uservoicesdk.model.User;
import com.uservoice.uservoicesdk.ui.DefaultCallback;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            SigninDialogFragment

class val.activity extends DefaultCallback
{

    final SigninDialogFragment this$0;
    final Activity val$activity;

    public void onModel(User user)
    {
        Toast.makeText(val$activity, com.uservoice.uservoicesdk.password, 0).show();
    }

    public volatile void onModel(Object obj)
    {
        onModel((User)obj);
    }

    (Activity activity1)
    {
        this$0 = final_signindialogfragment;
        val$activity = activity1;
        super(Context.this);
    }
}
