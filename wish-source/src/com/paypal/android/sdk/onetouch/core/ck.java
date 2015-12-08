// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.text.TextUtils;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            cl, c, cj, cm

public abstract class ck extends cl
{

    public ck(cj cj, cm cm, c c1, String s)
    {
        this(cj, cm, c1, null, null);
    }

    private ck(cj cj, cm cm, c c1, String s, String s1)
    {
        super(cj, cm, c1, null);
        if (!TextUtils.isEmpty(s))
        {
            a("Authorization", s);
        }
        a("User-Agent", f().c());
    }

    static 
    {
        com/paypal/android/sdk/onetouch/core/ck.getSimpleName();
    }
}
