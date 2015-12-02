// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            AccountInfoActivity

class te
    implements Runnable
{

    final AccountInfoActivity a;

    te(AccountInfoActivity accountinfoactivity)
    {
        a = accountinfoactivity;
        super();
    }

    public void run()
    {
        AccountInfoActivity.n(a);
    }
}
