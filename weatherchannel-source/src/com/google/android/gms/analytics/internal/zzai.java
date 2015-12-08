// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzr, zzaj, zzf

public class zzai extends zzd
{
    public final class zza
    {

        private final String mName;
        private final long zzMA;
        final zzai zzMB;

        private void zzkq()
        {
            long l = zzMB.zzhP().currentTimeMillis();
            android.content.SharedPreferences.Editor editor = zzai.zza(zzMB).edit();
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

        private zza(String s, long l)
        {
            zzMB = zzai.this;
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

        zza(String s, long l, _cls1 _pcls1)
        {
            this(s, l);
        }
    }


    private SharedPreferences zzMw;
    private long zzMx;
    private long zzMy;
    private final zza zzMz = new zza("monitoring", zzhR().zzjC());

    protected zzai(zzf zzf)
    {
        super(zzf);
        zzMy = -1L;
    }

    static SharedPreferences zza(zzai zzai1)
    {
        return zzai1.zzMw;
    }

    public void zzbf(String s)
    {
        zzhO();
        zzia();
        android.content.SharedPreferences.Editor editor = zzMw.edit();
        if (TextUtils.isEmpty(s))
        {
            editor.remove("installation_campaign");
        } else
        {
            editor.putString("installation_campaign", s);
        }
        if (!editor.commit())
        {
            zzaW("Failed to commit campaign data");
        }
    }

    protected void zzhn()
    {
        zzMw = getContext().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public long zzkk()
    {
        zzhO();
        zzia();
        if (zzMx == 0L)
        {
            long l = zzMw.getLong("first_run", 0L);
            if (l != 0L)
            {
                zzMx = l;
            } else
            {
                long l1 = zzhP().currentTimeMillis();
                android.content.SharedPreferences.Editor editor = zzMw.edit();
                editor.putLong("first_run", l1);
                if (!editor.commit())
                {
                    zzaW("Failed to commit first run time");
                }
                zzMx = l1;
            }
        }
        return zzMx;
    }

    public zzaj zzkl()
    {
        return new zzaj(zzhP(), zzkk());
    }

    public long zzkm()
    {
        zzhO();
        zzia();
        if (zzMy == -1L)
        {
            zzMy = zzMw.getLong("last_dispatch", 0L);
        }
        return zzMy;
    }

    public void zzkn()
    {
        zzhO();
        zzia();
        long l = zzhP().currentTimeMillis();
        android.content.SharedPreferences.Editor editor = zzMw.edit();
        editor.putLong("last_dispatch", l);
        editor.apply();
        zzMy = l;
    }

    public String zzko()
    {
        zzhO();
        zzia();
        String s = zzMw.getString("installation_campaign", null);
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return s;
        }
    }

    public zza zzkp()
    {
        return zzMz;
    }
}
