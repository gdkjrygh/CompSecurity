// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.fitness.data:
//            Subscription, DataSource, DataType

public static class zzakQ
{

    private DataType zzajF;
    private DataSource zzajG;
    private long zzakP;
    private int zzakQ;

    static DataType zza(zzakQ zzakq)
    {
        return zzakq.zzajF;
    }

    static DataSource zzb(zzajF zzajf)
    {
        return zzajf.zzajG;
    }

    static long zzc(zzajG zzajg)
    {
        return zzajg.zzakP;
    }

    static int zzd(zzakP zzakp)
    {
        return zzakp.zzakQ;
    }

    public zzakQ zzb(DataSource datasource)
    {
        zzajG = datasource;
        return this;
    }

    public zzajG zzb(DataType datatype)
    {
        zzajF = datatype;
        return this;
    }

    public Subscription zzqN()
    {
label0:
        {
            boolean flag1 = false;
            boolean flag;
            if (zzajG != null || zzajF != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zza(flag, "Must call setDataSource() or setDataType()");
            if (zzajF != null && zzajG != null)
            {
                flag = flag1;
                if (!zzajF.equals(zzajG.getDataType()))
                {
                    break label0;
                }
            }
            flag = true;
        }
        zzu.zza(flag, "Specified data type is incompatible with specified data source");
        return new Subscription(this, null);
    }

    public ()
    {
        zzakP = -1L;
        zzakQ = 2;
    }
}
