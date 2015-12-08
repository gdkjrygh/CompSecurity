// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataSourcesRequest

public static class zzamg
{

    private boolean zzamg;
    private DataType zzami[];
    private int zzamj[] = {
        0, 1
    };

    static DataType[] zza(zzamg zzamg1)
    {
        return zzamg1.zzami;
    }

    static int[] zzb(zzami zzami1)
    {
        return zzami1.zzamj;
    }

    static boolean zzc(zzamj zzamj1)
    {
        return zzamj1.zzamg;
    }

    public DataSourcesRequest build()
    {
        boolean flag1 = true;
        boolean flag;
        if (zzami.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Must add at least one data type");
        if (zzamj.length > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Must add at least one data source type");
        return new DataSourcesRequest(this, null);
    }

    public transient zzamj setDataSourceTypes(int ai[])
    {
        zzamj = ai;
        return this;
    }

    public transient zzamj setDataTypes(DataType adatatype[])
    {
        zzami = adatatype;
        return this;
    }

    public ()
    {
        zzami = new DataType[0];
        zzamg = false;
    }
}
