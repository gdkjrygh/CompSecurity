// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            aoz

class wx
    implements Runnable
{

    final c4 a;
    final long b;
    final aoz c;

    wx(aoz aoz1, c4 c4, long l)
    {
        c = aoz1;
        a = c4;
        b = l;
        super();
    }

    public void run()
    {
        aoz.a(c, a, b);
    }
}
