// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            a3, App

class sq
    implements Runnable
{

    final a3 a;

    sq(a3 a3_1)
    {
        a = a3_1;
        super();
    }

    public void run()
    {
        App.f(a.e);
    }
}
