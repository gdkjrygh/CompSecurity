// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;


// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            bd, PayPalOneTouchCore, dm, cl, 
//            cz

final class cs
    implements bd
{

    private final cz a;

    public cs(cz cz1)
    {
        a = cz1;
    }

    public final void a(cl cl1)
    {
label0:
        {
            PayPalOneTouchCore.a();
            if (cl1 instanceof dm)
            {
                if (!cl1.p())
                {
                    break label0;
                }
                cl1 = (dm)cl1;
                a.a(cl1.h(), false);
                PayPalOneTouchCore.a();
            }
            return;
        }
        PayPalOneTouchCore.a();
    }
}
