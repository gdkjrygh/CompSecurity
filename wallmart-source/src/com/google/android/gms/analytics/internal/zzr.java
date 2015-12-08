// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlw;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzy, zzm, zzo, zzf, 
//            zzaf

public class zzr
{

    private final zzf zzKa;
    private volatile Boolean zzMN;
    private String zzMO;
    private Set zzMP;

    protected zzr(zzf zzf1)
    {
        zzx.zzv(zzf1);
        zzKa = zzf1;
    }

    public String zzjA()
    {
        return (String)zzy.zzNq.get();
    }

    public String zzjB()
    {
        return (String)zzy.zzNr.get();
    }

    public zzm zzjC()
    {
        return zzm.zzbh((String)zzy.zzNt.get());
    }

    public zzo zzjD()
    {
        return zzo.zzbi((String)zzy.zzNu.get());
    }

    public Set zzjE()
    {
        String s = (String)zzy.zzNz.get();
        if (zzMP == null || zzMO == null || !zzMO.equals(s))
        {
            String as[] = TextUtils.split(s, ",");
            HashSet hashset = new HashSet();
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                String s1 = as[i];
                try
                {
                    hashset.add(Integer.valueOf(Integer.parseInt(s1)));
                }
                catch (NumberFormatException numberformatexception) { }
                i++;
            }
            zzMO = s;
            zzMP = hashset;
        }
        return zzMP;
    }

    public long zzjF()
    {
        return ((Long)zzy.zzNI.get()).longValue();
    }

    public long zzjG()
    {
        return ((Long)zzy.zzNJ.get()).longValue();
    }

    public long zzjH()
    {
        return ((Long)zzy.zzNM.get()).longValue();
    }

    public int zzjI()
    {
        return ((Integer)zzy.zzNd.get()).intValue();
    }

    public int zzjJ()
    {
        return ((Integer)zzy.zzNf.get()).intValue();
    }

    public String zzjK()
    {
        return "google_analytics_v4.db";
    }

    public String zzjL()
    {
        return "google_analytics2_v4.db";
    }

    public long zzjM()
    {
        return 0x5265c00L;
    }

    public int zzjN()
    {
        return ((Integer)zzy.zzNC.get()).intValue();
    }

    public int zzjO()
    {
        return ((Integer)zzy.zzND.get()).intValue();
    }

    public long zzjP()
    {
        return ((Long)zzy.zzNE.get()).longValue();
    }

    public long zzjQ()
    {
        return ((Long)zzy.zzNN.get()).longValue();
    }

    public boolean zzjk()
    {
        return zzd.zzacF;
    }

    public boolean zzjl()
    {
        if (zzMN != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (zzMN != null) goto _L4; else goto _L3
_L3:
        String s;
        Object obj;
        obj = zzKa.getContext().getApplicationInfo();
        s = zzlw.zzj(zzKa.getContext(), Process.myPid());
        if (obj == null) goto _L6; else goto _L5
_L5:
        obj = ((ApplicationInfo) (obj)).processName;
        if (obj == null) goto _L8; else goto _L7
_L7:
        if (!((String) (obj)).equals(s)) goto _L8; else goto _L9
_L9:
        boolean flag = true;
_L11:
        zzMN = Boolean.valueOf(flag);
_L6:
        if ((zzMN == null || !zzMN.booleanValue()) && "com.google.android.gms.analytics".equals(s))
        {
            zzMN = Boolean.TRUE;
        }
        if (zzMN == null)
        {
            zzMN = Boolean.TRUE;
            zzKa.zzie().zzbc("My process not in the list of running processes");
        }
_L4:
        this;
        JVM INSTR monitorexit ;
_L2:
        return zzMN.booleanValue();
_L8:
        flag = false;
        if (true) goto _L11; else goto _L10
_L10:
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzjm()
    {
        return ((Boolean)zzy.zzMZ.get()).booleanValue();
    }

    public int zzjn()
    {
        return ((Integer)zzy.zzNs.get()).intValue();
    }

    public int zzjo()
    {
        return ((Integer)zzy.zzNw.get()).intValue();
    }

    public int zzjp()
    {
        return ((Integer)zzy.zzNx.get()).intValue();
    }

    public int zzjq()
    {
        return ((Integer)zzy.zzNy.get()).intValue();
    }

    public long zzjr()
    {
        return ((Long)zzy.zzNh.get()).longValue();
    }

    public long zzjs()
    {
        return ((Long)zzy.zzNg.get()).longValue();
    }

    public long zzjt()
    {
        return ((Long)zzy.zzNk.get()).longValue();
    }

    public long zzju()
    {
        return ((Long)zzy.zzNl.get()).longValue();
    }

    public int zzjv()
    {
        return ((Integer)zzy.zzNm.get()).intValue();
    }

    public int zzjw()
    {
        return ((Integer)zzy.zzNn.get()).intValue();
    }

    public long zzjx()
    {
        return (long)((Integer)zzy.zzNA.get()).intValue();
    }

    public String zzjy()
    {
        return (String)zzy.zzNp.get();
    }

    public String zzjz()
    {
        return (String)zzy.zzNo.get();
    }
}
