// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            App, f8, afn

class p0
    implements android.view.View.OnClickListener
{

    final afn a;
    final f8 b;

    p0(afn afn1, f8 f8_1)
    {
        a = afn1;
        b = f8_1;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            if (App.aR())
            {
                afn.c(f8.c(b));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            afn.c(afn.f(a).length - 1 - f8.c(b));
        }
        afn.c(a).setCurrentItem(afn.a(), true);
        afn.a(a, afn.a());
    }
}
