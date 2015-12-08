// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.util.Log;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            ci, cl, bg, bf

public abstract class ca
    implements ci
{

    private static final String a = com/paypal/android/sdk/onetouch/core/ca.getSimpleName();

    public ca()
    {
    }

    protected static void a(cl cl1)
    {
        try
        {
            (new StringBuilder("parsing success response\n:")).append(cl1.h());
            cl1.c();
            return;
        }
        catch (Exception exception)
        {
            Log.e("paypal.sdk", "Exception parsing server response", exception);
            cl1.a(new bg(bf.c, exception));
            return;
        }
    }

}
