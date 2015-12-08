// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.billing;


// Referenced classes of package com.gau.go.launcherex.gowidget.billing:
//            BillingActivity

class e
    implements Runnable
{

    final String a;
    final String b;
    final BillingActivity c;

    e(BillingActivity billingactivity, String s, String s1)
    {
        c = billingactivity;
        a = s;
        b = s1;
        super();
    }

    public void run()
    {
        BillingActivity.b(c, a, b);
    }
}
