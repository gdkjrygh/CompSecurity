// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;


// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            bi

public final class dp extends Enum
{

    public static final dp a;
    public static final dp b;
    private static final dp f[];
    private bi c;
    private String d;
    private boolean e;

    private dp(String s, int i, bi bi1, String s1)
    {
        this(s, 0, bi1, null, false);
    }

    private dp(String s, int i, bi bi1, String s1, boolean flag)
    {
        super(s, i);
        c = bi1;
        d = s1;
        e = flag;
    }

    public static dp valueOf(String s)
    {
        return (dp)Enum.valueOf(com/paypal/android/sdk/onetouch/core/dp, s);
    }

    public static dp[] values()
    {
        return (dp[])f.clone();
    }

    final bi a()
    {
        return c;
    }

    final String b()
    {
        return d;
    }

    final boolean c()
    {
        return e;
    }

    static 
    {
        a = new dp("FptiRequest", 0, bi.b, null);
        b = new dp("ConfigFileRequest", 1, bi.a, "https://www.paypalobjects.com/webstatic/otc/otc-config.android.json", true);
        f = (new dp[] {
            a, b
        });
    }
}
