// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzu;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzf, zzaf, zzy, zzm, 
//            zzo

public class zzr
{

    private final zzf zzIa;
    private Boolean zzKO;
    private String zzKP;
    private Set zzKQ;

    protected zzr(zzf zzf1)
    {
        zzu.zzu(zzf1);
        zzIa = zzf1;
    }

    public boolean zziW()
    {
        return zzd.zzZR;
    }

    public boolean zziX()
    {
        if (zzKO != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (zzKO != null) goto _L4; else goto _L3
_L3:
        Object obj;
        Object obj1;
        obj1 = zzIa.getContext();
        obj = ((Context) (obj1)).getApplicationInfo();
        if (obj == null) goto _L6; else goto _L5
_L5:
        obj = ((ApplicationInfo) (obj)).processName;
        obj1 = (ActivityManager)((Context) (obj1)).getSystemService("activity");
        if (obj1 == null) goto _L6; else goto _L7
_L7:
        int i;
        i = Process.myPid();
        obj1 = ((ActivityManager) (obj1)).getRunningAppProcesses().iterator();
_L10:
        if (!((Iterator) (obj1)).hasNext()) goto _L6; else goto _L8
_L8:
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj1)).next();
        if (i != runningappprocessinfo.pid) goto _L10; else goto _L9
_L9:
        if (obj == null) goto _L12; else goto _L11
_L11:
        if (!((String) (obj)).equals(runningappprocessinfo.processName)) goto _L12; else goto _L13
_L13:
        boolean flag = true;
_L15:
        zzKO = Boolean.valueOf(flag);
_L6:
        if (zzKO == null)
        {
            zzKO = Boolean.TRUE;
            zzIa.zzhQ().zzaX("My process not in the list of running processes");
        }
_L4:
        this;
        JVM INSTR monitorexit ;
_L2:
        return zzKO.booleanValue();
_L12:
        flag = false;
        if (true) goto _L15; else goto _L14
_L14:
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zziY()
    {
        return ((Boolean)zzy.zzLa.get()).booleanValue();
    }

    public int zziZ()
    {
        return ((Integer)zzy.zzLt.get()).intValue();
    }

    public int zzjA()
    {
        return ((Integer)zzy.zzLE.get()).intValue();
    }

    public long zzjB()
    {
        return ((Long)zzy.zzLF.get()).longValue();
    }

    public long zzjC()
    {
        return ((Long)zzy.zzLO.get()).longValue();
    }

    public int zzja()
    {
        return ((Integer)zzy.zzLx.get()).intValue();
    }

    public int zzjb()
    {
        return ((Integer)zzy.zzLy.get()).intValue();
    }

    public int zzjc()
    {
        return ((Integer)zzy.zzLz.get()).intValue();
    }

    public long zzjd()
    {
        return ((Long)zzy.zzLi.get()).longValue();
    }

    public long zzje()
    {
        return ((Long)zzy.zzLh.get()).longValue();
    }

    public long zzjf()
    {
        return ((Long)zzy.zzLl.get()).longValue();
    }

    public long zzjg()
    {
        return ((Long)zzy.zzLm.get()).longValue();
    }

    public int zzjh()
    {
        return ((Integer)zzy.zzLn.get()).intValue();
    }

    public int zzji()
    {
        return ((Integer)zzy.zzLo.get()).intValue();
    }

    public long zzjj()
    {
        return (long)((Integer)zzy.zzLB.get()).intValue();
    }

    public String zzjk()
    {
        return (String)zzy.zzLq.get();
    }

    public String zzjl()
    {
        return (String)zzy.zzLp.get();
    }

    public String zzjm()
    {
        return (String)zzy.zzLr.get();
    }

    public String zzjn()
    {
        return (String)zzy.zzLs.get();
    }

    public zzm zzjo()
    {
        return zzm.zzbc((String)zzy.zzLu.get());
    }

    public zzo zzjp()
    {
        return zzo.zzbd((String)zzy.zzLv.get());
    }

    public Set zzjq()
    {
        String s = (String)zzy.zzLA.get();
        if (zzKQ == null || zzKP == null || !zzKP.equals(s))
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
            zzKP = s;
            zzKQ = hashset;
        }
        return zzKQ;
    }

    public long zzjr()
    {
        return ((Long)zzy.zzLJ.get()).longValue();
    }

    public long zzjs()
    {
        return ((Long)zzy.zzLK.get()).longValue();
    }

    public long zzjt()
    {
        return ((Long)zzy.zzLN.get()).longValue();
    }

    public int zzju()
    {
        return ((Integer)zzy.zzLe.get()).intValue();
    }

    public int zzjv()
    {
        return ((Integer)zzy.zzLg.get()).intValue();
    }

    public String zzjw()
    {
        return "google_analytics_v4.db";
    }

    public String zzjx()
    {
        return "google_analytics2_v4.db";
    }

    public long zzjy()
    {
        return 0x5265c00L;
    }

    public int zzjz()
    {
        return ((Integer)zzy.zzLD.get()).intValue();
    }
}
