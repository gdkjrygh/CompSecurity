// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzai

public final class <init>
{

    private final String mName;
    private final long zzMA;
    final zzai zzMB;

    private void zzkq()
    {
        long l = zzMB.zzhP().currentTimeMillis();
        android.content.ferences.Editor editor = zzai.zza(zzMB).edit();
        editor.remove(zzkv());
        editor.remove(zzkw());
        editor.putLong(zzku(), l);
        editor.commit();
    }

    private long zzkr()
    {
        long l = zzkt();
        if (l == 0L)
        {
            return 0L;
        } else
        {
            return Math.abs(l - zzMB.zzhP().currentTimeMillis());
        }
    }

    private long zzkt()
    {
        return zzai.zza(zzMB).getLong(zzku(), 0L);
    }

    private String zzku()
    {
        return (new StringBuilder()).append(mName).append(":start").toString();
    }

    private String zzkv()
    {
        return (new StringBuilder()).append(mName).append(":count").toString();
    }

    public void zzbg(String s)
    {
        String s1;
        if (zzkt() == 0L)
        {
            zzkq();
        }
        s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        this;
        JVM INSTR monitorenter ;
        long l = zzai.zza(zzMB).getLong(zzkv(), 0L);
        if (l > 0L)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        s = zzai.zza(zzMB).edit();
        s.putString(zzkw(), s1);
        s.putLong(zzkv(), 1L);
        s.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        boolean flag;
        if ((UUID.randomUUID().getLeastSignificantBits() & 0x7fffffffffffffffL) < 0x7fffffffffffffffL / (l + 1L))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = zzai.zza(zzMB).edit();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        s.putString(zzkw(), s1);
        s.putLong(zzkv(), l + 1L);
        s.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public Pair zzks()
    {
        long l = zzkr();
        if (l >= zzMA)
        {
            if (l > zzMA * 2L)
            {
                zzkq();
                return null;
            }
            String s = zzai.zza(zzMB).getString(zzkw(), null);
            l = zzai.zza(zzMB).getLong(zzkv(), 0L);
            zzkq();
            if (s != null && l > 0L)
            {
                return new Pair(s, Long.valueOf(l));
            }
        }
        return null;
    }

    protected String zzkw()
    {
        return (new StringBuilder()).append(mName).append(":value").toString();
    }

    private (zzai zzai1, String s, long l)
    {
        zzMB = zzai1;
        super();
        zzu.zzcj(s);
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzV(flag);
        mName = s;
        zzMA = l;
    }

    zzMA(zzai zzai1, String s, long l, zzMA zzma)
    {
        this(zzai1, s, l);
    }
}
