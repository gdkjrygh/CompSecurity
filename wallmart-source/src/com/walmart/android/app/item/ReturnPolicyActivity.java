// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.walmart.android.app.main.FullScreenActivity;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmart.android.app.item:
//            ReturnPolicyPresenter

public class ReturnPolicyActivity extends FullScreenActivity
{

    public static final String EXTRA_STRING = "ReturnPolicyActivity:EXTRA_STRING";

    public ReturnPolicyActivity()
    {
    }

    public static Intent makeIntent(Context context, String s)
    {
        context = new Intent(context, com/walmart/android/app/item/ReturnPolicyActivity);
        context.putExtra("ReturnPolicyActivity:EXTRA_STRING", s);
        context.addFlags(0x10000000);
        return context;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            bundle = bundle.getString("ReturnPolicyActivity:EXTRA_STRING", "");
        } else
        {
            bundle = "";
        }
        getPresenterStack().pushPresenter(new ReturnPolicyPresenter(this, bundle), false);
    }
}
