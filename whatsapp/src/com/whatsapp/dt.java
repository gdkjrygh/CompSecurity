// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;

// Referenced classes of package com.whatsapp:
//            ak8

class dt
    implements Runnable
{

    final int a;
    final ak8 b;

    dt(ak8 ak8_1, int i)
    {
        b = ak8_1;
        a = i;
        super();
    }

    public void run()
    {
        if (!ak8.b(b).isFinishing())
        {
            ak8.b(b).showDialog(a);
        }
    }
}
