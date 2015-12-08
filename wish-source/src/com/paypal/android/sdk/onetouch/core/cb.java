// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            ca, cc, cm, cl

public abstract class cb extends ca
{

    private static final String c = com/paypal/android/sdk/onetouch/core/cb.getSimpleName();
    protected final cm a;
    protected final int b;
    private ThreadPoolExecutor d;

    public cb(int i, cm cm)
    {
        b = i;
        a = cm;
        d = (ThreadPoolExecutor)Executors.newCachedThreadPool();
    }

    static String b()
    {
        return c;
    }

    protected abstract boolean a();

    public final boolean b(cl cl)
    {
        d.submit(new cc(this, cl));
        return true;
    }

}
