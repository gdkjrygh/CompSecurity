// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            zzbz, zzbv

public final class zzbr
{

    private String zztu;
    private int zztv;

    public zzbr()
    {
        this((String)zzbz.zztD.zzcY(), -1);
    }

    public zzbr(String s)
    {
        this(s, -1);
    }

    public zzbr(String s, int i)
    {
        zztv = -1;
        if (TextUtils.isEmpty(s))
        {
            s = (String)zzbz.zztD.zzcY();
        }
        zztu = s;
        zztv = i;
    }

    public String zzcW()
    {
        return zztu;
    }

    public int zzcX()
    {
        return zztv;
    }
}
