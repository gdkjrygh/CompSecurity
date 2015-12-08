// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            aj

class ak extends BroadcastReceiver
{

    final aj a;

    ak(aj aj1)
    {
        a = aj1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        try
        {
            aj.a(a, intent.getIntExtra("plugged", 0));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }
}
