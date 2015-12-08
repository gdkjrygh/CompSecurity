// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlm;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzai

public final class <init>
{

    private final String mName;
    private final long zzOA;
    final zzai zzOB;

    private void zzkE()
    {
        long l = zzOB.zzid().currentTimeMillis();
        android.content.ferences.Editor editor = zzai.zza(zzOB).edit();
        editor.remove(zzkJ());
        editor.remove(zzkK());
        editor.putLong(zzkI(), l);
        editor.commit();
    }

    private long zzkF()
    {
        long l = zzkH();
        if (l == 0L)
        {
            return 0L;
        } else
        {
            return Math.abs(l - zzOB.zzid().currentTimeMillis());
        }
    }

    private long zzkH()
    {
        return zzai.zza(zzOB).getLong(zzkI(), 0L);
    }

    private String zzkI()
    {
        return (new StringBuilder()).append(mName).append(":start").toString();
    }

    private String zzkJ()
    {
        return (new StringBuilder()).append(mName).append(":count").toString();
    }

    public void zzbl(String s)
    {
        String s1;
        if (zzkH() == 0L)
        {
            zzkE();
        }
        s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        this;
        JVM INSTR monitorenter ;
        long l = zzai.zza(zzOB).getLong(zzkJ(), 0L);
        if (l > 0L)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        s = zzai.zza(zzOB).edit();
        s.putString(zzkK(), s1);
        s.putLong(zzkJ(), 1L);
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
        s = zzai.zza(zzOB).edit();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        s.putString(zzkK(), s1);
        s.putLong(zzkJ(), l + 1L);
        s.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public Pair zzkG()
    {
        long l = zzkF();
        if (l >= zzOA)
        {
            if (l > zzOA * 2L)
            {
                zzkE();
                return null;
            }
            String s = zzai.zza(zzOB).getString(zzkK(), null);
            l = zzai.zza(zzOB).getLong(zzkJ(), 0L);
            zzkE();
            if (s != null && l > 0L)
            {
                return new Pair(s, Long.valueOf(l));
            }
        }
        return null;
    }

    protected String zzkK()
    {
        return (new StringBuilder()).append(mName).append(":value").toString();
    }

    private (zzai zzai1, String s, long l)
    {
        zzOB = zzai1;
        super();
        zzx.zzcs(s);
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzZ(flag);
        mName = s;
        zzOA = l;
    }

    zzOA(zzai zzai1, String s, long l, zzOA zzoa)
    {
        this(zzai1, s, l);
    }
}
