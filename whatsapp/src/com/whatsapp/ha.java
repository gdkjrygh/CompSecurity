// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            jb, AccountInfoActivity

class ha
    implements Runnable
{

    final jb a;

    ha(jb jb1)
    {
        a = jb1;
        super();
    }

    public void run()
    {
        AccountInfoActivity.n(a.a);
    }
}
