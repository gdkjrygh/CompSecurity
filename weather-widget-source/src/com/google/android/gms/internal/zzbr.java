// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            zzby, zzbu

public final class zzbr
{

    private String zztN;
    private int zztO;

    public zzbr()
    {
        this((String)zzby.zztW.zzdd(), -1);
    }

    public zzbr(String s)
    {
        this(s, -1);
    }

    public zzbr(String s, int i)
    {
        zztO = -1;
        if (TextUtils.isEmpty(s))
        {
            s = (String)zzby.zztW.zzdd();
        }
        zztN = s;
        zztO = i;
    }

    public String zzdb()
    {
        return zztN;
    }

    public int zzdc()
    {
        return zztO;
    }
}
