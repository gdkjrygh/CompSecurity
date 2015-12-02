// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            aoz, t0

class u0
    implements Runnable
{

    final boolean a;
    final aoz b;

    u0(aoz aoz1, boolean flag)
    {
        b = aoz1;
        a = flag;
        super();
    }

    public void run()
    {
        aoz.b(b).a(null, a);
    }
}
