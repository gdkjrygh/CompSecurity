// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            a7

class ok
    implements Runnable
{

    final a7 a;

    ok(a7 a7_1)
    {
        a = a7_1;
        super();
    }

    public void run()
    {
        a.a.dismiss();
    }
}
