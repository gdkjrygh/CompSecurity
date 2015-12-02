// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            aoz

class ep
    implements Runnable
{

    final aoz a;
    final long b;
    final c4 c;
    final int d;
    final String e;

    ep(aoz aoz1, c4 c4, String s, int i, long l)
    {
        a = aoz1;
        c = c4;
        e = s;
        d = i;
        b = l;
        super();
    }

    public void run()
    {
        aoz.a(a, c, e, d, b);
    }
}
