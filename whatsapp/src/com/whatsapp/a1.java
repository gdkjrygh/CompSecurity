// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.util.a3;

// Referenced classes of package com.whatsapp:
//            og, App, yt

final class a1
    implements Runnable
{

    final og a;

    a1(og og1)
    {
        a = og1;
        super();
    }

    public void run()
    {
        boolean flag1 = true;
        boolean flag;
        if (a.u == -1 && a.q == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a.u != 0 || a.q != 0)
        {
            flag1 = false;
        }
        a.g();
        a.a(-1, -1);
        App.E.b(a.a);
        App.at.b(a.a);
        if (!flag)
        {
            App.au.ab().post(new yt(this, flag1));
        }
    }
}
