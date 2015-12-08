// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.os.Build;
import java.util.Locale;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            d, c

public class ba
{

    private static final String a = com/paypal/android/sdk/onetouch/core/ba.getSimpleName();
    private static String b = null;

    public ba()
    {
    }

    public static String a(c c1)
    {
        if (b == null)
        {
            String s = Locale.getDefault().toString().replace("_", "-");
            StringBuilder stringbuilder = new StringBuilder("Mozilla/5.0 (Linux; U; ");
            new d();
            b = stringbuilder.append(d.b()).append("; ").append(s).append("; ").append(Build.MODEL).append(" ").append(Build.DISPLAY).append(") mpl/").append(c1.a()).toString();
            (new StringBuilder("UserAgent: ")).append(b);
        }
        return b;
    }

}
