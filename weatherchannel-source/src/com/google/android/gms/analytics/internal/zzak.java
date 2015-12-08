// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzq, zzf, zzc, zzal, 
//            zzp

public class zzak extends zzq
{
    private static class zza extends zzc
        implements zzq.zza
    {

        private final zzal zzMD = new zzal();

        public void zzc(String s, boolean flag)
        {
            boolean flag1 = true;
            boolean flag2 = true;
            int i = 1;
            if ("ga_autoActivityTracking".equals(s))
            {
                s = zzMD;
                if (!flag)
                {
                    i = 0;
                }
                s.zzMG = i;
                return;
            }
            if ("ga_anonymizeIp".equals(s))
            {
                s = zzMD;
                int j;
                if (flag)
                {
                    j = ((flag1) ? 1 : 0);
                } else
                {
                    j = 0;
                }
                s.zzMH = j;
                return;
            }
            if ("ga_reportUncaughtExceptions".equals(s))
            {
                s = zzMD;
                int k;
                if (flag)
                {
                    k = ((flag2) ? 1 : 0);
                } else
                {
                    k = 0;
                }
                s.zzMI = k;
                return;
            } else
            {
                zzd("bool configuration name not recognized", s);
                return;
            }
        }

        public void zzd(String s, int i)
        {
            if ("ga_sessionTimeout".equals(s))
            {
                zzMD.zzMF = i;
                return;
            } else
            {
                zzd("int configuration name not recognized", s);
                return;
            }
        }

        public zzp zziV()
        {
            return zzkx();
        }

        public void zzk(String s, String s1)
        {
            zzMD.zzMJ.put(s, s1);
        }

        public zzal zzkx()
        {
            return zzMD;
        }

        public void zzl(String s, String s1)
        {
            if ("ga_trackingId".equals(s))
            {
                zzMD.zztd = s1;
                return;
            }
            if ("ga_sampleFrequency".equals(s))
            {
                try
                {
                    zzMD.zzME = Double.parseDouble(s1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    zzc("Error parsing ga_sampleFrequency value", s1, s);
                }
                return;
            } else
            {
                zzd("string configuration name not recognized", s);
                return;
            }
        }

        public zza(zzf zzf)
        {
            super(zzf);
        }
    }


    public zzak(zzf zzf)
    {
        super(zzf, new zza(zzf));
    }
}
