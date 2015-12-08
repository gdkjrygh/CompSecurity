// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            SessionReadRequest

public static class zzamG
{

    private String zzFE;
    private long zzKT;
    private long zzajH;
    private List zzajQ;
    private List zzalP;
    private String zzamE;
    private boolean zzamF;
    private List zzamG;
    private boolean zzama;

    static String zza(zzamG zzamg)
    {
        return zzamg.zzamE;
    }

    static String zzb(zzamE zzame)
    {
        return zzame.zzFE;
    }

    static long zzc(zzFE zzfe)
    {
        return zzfe.zzKT;
    }

    static long zzd(zzKT zzkt)
    {
        return zzkt.zzajH;
    }

    static List zze(zzajH zzajh)
    {
        return zzajh.zzajQ;
    }

    static List zzf(zzajQ zzajq)
    {
        return zzajq.zzalP;
    }

    static boolean zzg(zzalP zzalp)
    {
        return zzalp.zzamF;
    }

    static boolean zzh(zzamF zzamf)
    {
        return zzamf.zzama;
    }

    static List zzi(zzama zzama1)
    {
        return zzama1.zzamG;
    }

    public SessionReadRequest build()
    {
        boolean flag;
        if (zzKT > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Invalid start time: %s", new Object[] {
            Long.valueOf(zzKT)
        });
        if (zzajH > 0L && zzajH > zzKT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Invalid end time: %s", new Object[] {
            Long.valueOf(zzajH)
        });
        return new SessionReadRequest(this, null);
    }

    public zzajH enableServerQueries()
    {
        zzama = true;
        return this;
    }

    public zzama excludePackage(String s)
    {
        zzu.zzb(s, "Attempting to use a null package name");
        if (!zzamG.contains(s))
        {
            zzamG.add(s);
        }
        return this;
    }

    public zzamG read(DataSource datasource)
    {
        zzu.zzb(datasource, "Attempting to add a null data source");
        if (!zzalP.contains(datasource))
        {
            zzalP.add(datasource);
        }
        return this;
    }

    public zzalP read(DataType datatype)
    {
        zzu.zzb(datatype, "Attempting to use a null data type");
        if (!zzajQ.contains(datatype))
        {
            zzajQ.add(datatype);
        }
        return this;
    }

    public zzajQ readSessionsFromAllApps()
    {
        zzamF = true;
        return this;
    }

    public zzamF setSessionId(String s)
    {
        zzFE = s;
        return this;
    }

    public zzFE setSessionName(String s)
    {
        zzamE = s;
        return this;
    }

    public zzamE setTimeInterval(long l, long l1, TimeUnit timeunit)
    {
        zzKT = timeunit.toMillis(l);
        zzajH = timeunit.toMillis(l1);
        return this;
    }

    public ()
    {
        zzKT = 0L;
        zzajH = 0L;
        zzajQ = new ArrayList();
        zzalP = new ArrayList();
        zzamF = false;
        zzama = false;
        zzamG = new ArrayList();
    }
}
