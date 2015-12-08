// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzq, zzf, zzaa, zzaf, 
//            zzp

public class zzz extends zzq
{
    private static class zza
        implements zzq.zza
    {

        private final zzf zzLy;
        private final zzaa zzNS = new zzaa();

        public void zzc(String s, boolean flag)
        {
            if ("ga_dryRun".equals(s))
            {
                s = zzNS;
                int i;
                if (flag)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                s.zzNX = i;
                return;
            } else
            {
                zzLy.zzie().zzd("Bool xml configuration name not recognized", s);
                return;
            }
        }

        public void zzd(String s, int i)
        {
            if ("ga_dispatchPeriod".equals(s))
            {
                zzNS.zzNW = i;
                return;
            } else
            {
                zzLy.zzie().zzd("Int xml configuration name not recognized", s);
                return;
            }
        }

        public zzaa zzjX()
        {
            return zzNS;
        }

        public zzp zzjj()
        {
            return zzjX();
        }

        public void zzl(String s, String s1)
        {
        }

        public void zzm(String s, String s1)
        {
            if ("ga_appName".equals(s))
            {
                zzNS.zzNT = s1;
                return;
            }
            if ("ga_appVersion".equals(s))
            {
                zzNS.zzNU = s1;
                return;
            }
            if ("ga_logLevel".equals(s))
            {
                zzNS.zzNV = s1;
                return;
            } else
            {
                zzLy.zzie().zzd("String xml configuration name not recognized", s);
                return;
            }
        }

        public zza(zzf zzf1)
        {
            zzLy = zzf1;
        }
    }


    public zzz(zzf zzf)
    {
        super(zzf, new zza(zzf));
    }
}
