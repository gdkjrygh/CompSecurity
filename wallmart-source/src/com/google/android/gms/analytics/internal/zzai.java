// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlm;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzr, zzaj, zzf

public class zzai extends zzd
{
    public final class zza
    {

        private final String mName;
        private final long zzOA;
        final zzai zzOB;

        private void zzkE()
        {
            long l = zzOB.zzid().currentTimeMillis();
            android.content.SharedPreferences.Editor editor = zzai.zza(zzOB).edit();
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

        private zza(String s, long l)
        {
            zzOB = zzai.this;
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

        zza(String s, long l, _cls1 _pcls1)
        {
            this(s, l);
        }
    }


    private SharedPreferences zzOw;
    private long zzOx;
    private long zzOy;
    private final zza zzOz = new zza("monitoring", zzif().zzjQ());

    protected zzai(zzf zzf)
    {
        super(zzf);
        zzOy = -1L;
    }

    static SharedPreferences zza(zzai zzai1)
    {
        return zzai1.zzOw;
    }

    public void zzbk(String s)
    {
        zzic();
        zzio();
        android.content.SharedPreferences.Editor editor = zzOw.edit();
        if (TextUtils.isEmpty(s))
        {
            editor.remove("installation_campaign");
        } else
        {
            editor.putString("installation_campaign", s);
        }
        if (!editor.commit())
        {
            zzbb("Failed to commit campaign data");
        }
    }

    protected void zzhB()
    {
        zzOw = getContext().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public long zzkA()
    {
        zzic();
        zzio();
        if (zzOy == -1L)
        {
            zzOy = zzOw.getLong("last_dispatch", 0L);
        }
        return zzOy;
    }

    public void zzkB()
    {
        zzic();
        zzio();
        long l = zzid().currentTimeMillis();
        android.content.SharedPreferences.Editor editor = zzOw.edit();
        editor.putLong("last_dispatch", l);
        editor.apply();
        zzOy = l;
    }

    public String zzkC()
    {
        zzic();
        zzio();
        String s = zzOw.getString("installation_campaign", null);
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return s;
        }
    }

    public zza zzkD()
    {
        return zzOz;
    }

    public long zzky()
    {
        zzic();
        zzio();
        if (zzOx == 0L)
        {
            long l = zzOw.getLong("first_run", 0L);
            if (l != 0L)
            {
                zzOx = l;
            } else
            {
                long l1 = zzid().currentTimeMillis();
                android.content.SharedPreferences.Editor editor = zzOw.edit();
                editor.putLong("first_run", l1);
                if (!editor.commit())
                {
                    zzbb("Failed to commit first run time");
                }
                zzOx = l1;
            }
        }
        return zzOx;
    }

    public zzaj zzkz()
    {
        return new zzaj(zzid(), zzky());
    }
}
