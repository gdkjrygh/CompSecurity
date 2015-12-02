// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;

// Referenced classes of package com.whatsapp:
//            WebSessionsActivity, cz, App

class a3e
    implements Runnable
{

    final WebSessionsActivity a;

    a3e(WebSessionsActivity websessionsactivity)
    {
        a = websessionsactivity;
        super();
    }

    public void run()
    {
        WebSessionsActivity.d(a).notifyDataSetChanged();
        App.au.ab().postDelayed(WebSessionsActivity.c(a), 30000L);
    }
}
