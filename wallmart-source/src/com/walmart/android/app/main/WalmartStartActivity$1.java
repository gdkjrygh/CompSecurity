// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.walmart.android.wmservice.DialogActivity;

// Referenced classes of package com.walmart.android.app.main:
//            WalmartStartActivity

class this._cls0 extends BroadcastReceiver
{

    final WalmartStartActivity this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("com.walmart.android.MAINTENANCE"))
        {
            context = new Intent(WalmartStartActivity.this, com/walmart/android/wmservice/DialogActivity);
            context.putExtra("title", getString(0x7f0901d5));
            context.putExtra("msg", getString(0x7f0901d4));
            startActivity(context);
        }
    }

    _cls9()
    {
        this$0 = WalmartStartActivity.this;
        super();
    }
}
