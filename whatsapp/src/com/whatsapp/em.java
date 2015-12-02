// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.util.a3;

// Referenced classes of package com.whatsapp:
//            og, App, wq, an

class em
    implements Runnable
{

    final an a;
    final int b;
    final og c;

    em(an an, og og1, int i)
    {
        a = an;
        c = og1;
        b = i;
        super();
    }

    public void run()
    {
        int j = 0;
        int i;
        if (c.u != b)
        {
            i = 0;
        } else
        {
            i = c.u;
        }
        if (c.q == b)
        {
            j = c.q;
        }
        c.a(i, j);
        App.E.b(c.a);
        App.at.b(c.a);
        App.au.ab().post(new wq(this));
    }
}
