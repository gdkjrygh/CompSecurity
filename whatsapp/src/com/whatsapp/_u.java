// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            w4, WebSessionsActivity, my, cz, 
//            App

class _u
    implements Runnable
{

    final w4 a;

    _u(w4 w4_1)
    {
        a = w4_1;
        super();
    }

    public void run()
    {
label0:
        {
            WebSessionsActivity.d(a.a).a(my.g());
            if (WebSessionsActivity.d(a.a).getCount() > 0)
            {
                WebSessionsActivity.a(a.a).setVisibility(0);
                WebSessionsActivity.e(a.a).setVisibility(0);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            WebSessionsActivity.a(a.a).setVisibility(8);
            WebSessionsActivity.e(a.a).setVisibility(8);
        }
    }
}
