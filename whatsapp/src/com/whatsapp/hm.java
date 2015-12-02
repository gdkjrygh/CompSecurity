// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;

// Referenced classes of package com.whatsapp:
//            abp, vj, co, asw

class hm
    implements Runnable
{

    final abp a;

    hm(abp abp1)
    {
        a = abp1;
        super();
    }

    public void run()
    {
        vj.b(a.a).removeMessages(1);
        asw.a(new co(a.a, a.c, a.a.b, a.b), new Object[0]);
    }
}
