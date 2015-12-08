// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzz, zzaa, zzf, zzaf, 
//            zzp

private static class zzJy
    implements zzJy
{

    private final zzf zzJy;
    private final zzaa zzLT = new zzaa();

    public void zzc(String s, boolean flag)
    {
        if ("ga_dryRun".equals(s))
        {
            s = zzLT;
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            s.zzLY = i;
            return;
        } else
        {
            zzJy.zzhQ().zzd("Bool xml configuration name not recognized", s);
            return;
        }
    }

    public void zzd(String s, int i)
    {
        if ("ga_dispatchPeriod".equals(s))
        {
            zzLT.zzLX = i;
            return;
        } else
        {
            zzJy.zzhQ().zzd("Int xml configuration name not recognized", s);
            return;
        }
    }

    public zzp zziV()
    {
        return zzjJ();
    }

    public zzaa zzjJ()
    {
        return zzLT;
    }

    public void zzk(String s, String s1)
    {
    }

    public void zzl(String s, String s1)
    {
        if ("ga_appName".equals(s))
        {
            zzLT.zzLU = s1;
            return;
        }
        if ("ga_appVersion".equals(s))
        {
            zzLT.zzLV = s1;
            return;
        }
        if ("ga_logLevel".equals(s))
        {
            zzLT.zzLW = s1;
            return;
        } else
        {
            zzJy.zzhQ().zzd("String xml configuration name not recognized", s);
            return;
        }
    }

    public (zzf zzf1)
    {
        zzJy = zzf1;
    }
}
