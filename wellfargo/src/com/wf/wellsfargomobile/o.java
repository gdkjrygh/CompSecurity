// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package com.wf.wellsfargomobile:
//            FrontPorchTilesWebViewFragment, SlidingMenuWebViewFragment, l

class o extends BroadcastReceiver
{

    final l a;

    o(l l1)
    {
        a = l1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = intent.getExtras();
        if (intent != null)
        {
            context = intent.getString("url_type");
            intent = intent.getString("response");
            if ("tiles".equals(context) && (a instanceof FrontPorchTilesWebViewFragment) || "menu".equals(context) && (a instanceof SlidingMenuWebViewFragment))
            {
                a.d(intent);
            }
        }
    }
}
