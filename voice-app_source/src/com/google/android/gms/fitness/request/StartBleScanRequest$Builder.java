// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.request:
//            StartBleScanRequest, zzn, BleScanCallback

public static class zzamL
{

    private zzn zzamK;
    private int zzamL;
    private DataType zzami[];

    static DataType[] zza(zzamL zzaml)
    {
        return zzaml.zzami;
    }

    static zzn zzb(zzami zzami1)
    {
        return zzami1.zzamK;
    }

    static int zzc(zzamK zzamk)
    {
        return zzamk.zzamL;
    }

    public StartBleScanRequest build()
    {
        boolean flag;
        if (zzamK != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Must set BleScanCallback");
        return new StartBleScanRequest(this, null);
    }

    public zzamK setBleScanCallback(BleScanCallback blescancallback)
    {
        zza(zza().zza(blescancallback));
        return this;
    }

    public transient zza setDataTypes(DataType adatatype[])
    {
        zzami = adatatype;
        return this;
    }

    public zzami setTimeoutSecs(int i)
    {
        boolean flag1 = true;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Stop time must be greater than zero");
        if (i <= 60)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Stop time must be less than 1 minute");
        zzamL = i;
        return this;
    }

    public zzamL zza(zzn zzn)
    {
        zzamK = zzn;
        return this;
    }

    public ()
    {
        zzami = new DataType[0];
        zzamL = 10;
    }
}
