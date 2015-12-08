// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            Session, Application

public static class zzajR
{

    private String mName;
    private long zzKT;
    private long zzajH;
    private int zzajR;
    private String zzakL;
    private String zzakM;
    private Long zzakN;
    private Application zzake;

    static long zza(zzajR zzajr)
    {
        return zzajr.zzKT;
    }

    static long zzb(zzKT zzkt)
    {
        return zzkt.zzajH;
    }

    static String zzc(zzajH zzajh)
    {
        return zzajh.mName;
    }

    static String zzd(mName mname)
    {
        return mname.zzakL;
    }

    static String zze(zzakL zzakl)
    {
        return zzakl.zzakM;
    }

    static int zzf(zzakM zzakm)
    {
        return zzakm.zzajR;
    }

    static Application zzg(zzajR zzajr)
    {
        return zzajr.zzake;
    }

    static Long zzh(zzake zzake1)
    {
        return zzake1.zzakN;
    }

    public Session build()
    {
label0:
        {
            boolean flag1 = false;
            StringBuilder stringbuilder;
            boolean flag;
            if (zzKT > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zza(flag, "Start time should be specified.");
            if (zzajH != 0L)
            {
                flag = flag1;
                if (zzajH <= zzKT)
                {
                    break label0;
                }
            }
            flag = true;
        }
        zzu.zza(flag, "End time should be later than start time.");
        if (zzakL == null)
        {
            stringbuilder = new StringBuilder();
            String s;
            if (mName == null)
            {
                s = "";
            } else
            {
                s = mName;
            }
            zzakL = stringbuilder.append(s).append(zzKT).toString();
        }
        return new Session(this, null);
    }

    public zzKT setActiveTime(long l, TimeUnit timeunit)
    {
        zzakN = Long.valueOf(timeunit.toMillis(l));
        return this;
    }

    public zzakN setActivity(String s)
    {
        return zzeo(FitnessActivities.zzcF(s));
    }

    public F setDescription(String s)
    {
        boolean flag;
        if (s.length() <= 1000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Session description cannot exceed %d characters", new Object[] {
            Integer.valueOf(1000)
        });
        zzakM = s;
        return this;
    }

    public zzakM setEndTime(long l, TimeUnit timeunit)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "End time should be positive.");
        zzajH = timeunit.toMillis(l);
        return this;
    }

    public zzajH setIdentifier(String s)
    {
        boolean flag;
        if (s != null && TextUtils.getTrimmedLength(s) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzV(flag);
        zzakL = s;
        return this;
    }

    public zzakL setName(String s)
    {
        boolean flag;
        if (s.length() <= 100)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Session name cannot exceed %d characters", new Object[] {
            Integer.valueOf(100)
        });
        mName = s;
        return this;
    }

    public mName setStartTime(long l, TimeUnit timeunit)
    {
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Start time should be positive.");
        zzKT = timeunit.toMillis(l);
        return this;
    }

    public zzKT zzeo(int i)
    {
        zzajR = i;
        return this;
    }

    public _cls9()
    {
        zzKT = 0L;
        zzajH = 0L;
        mName = null;
        zzajR = 4;
    }
}
