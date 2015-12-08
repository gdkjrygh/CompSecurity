// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.util.Random;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            dj

class dk
{

    public String a;
    private long b;

    public dk(dj dj)
    {
        long l = System.currentTimeMillis();
        if (a == null)
        {
            b = l;
        }
        if (b + 0x1b7740L > l)
        {
            b = l + 0x1b7740L;
            a = b();
        }
    }

    private String b()
    {
        Random random = new Random(b);
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < 8; i++)
        {
            stringbuilder.append((char)(Math.abs(random.nextInt()) % 10 + 48));
        }

        return stringbuilder.toString();
    }

    public final boolean a()
    {
        return b > System.currentTimeMillis();
    }

    public String toString()
    {
        return (new StringBuilder()).append(com/paypal/android/sdk/onetouch/core/dk.getSimpleName()).append("[mToken=").append(a).append(", validUntil=").append(b).append("]").toString();
    }
}
