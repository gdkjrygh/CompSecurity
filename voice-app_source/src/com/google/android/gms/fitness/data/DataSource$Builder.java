// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.content.Context;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.fitness.data:
//            DataSource, Application, DataType, Device

public static final class zzakf
{

    private String mName;
    private int zzSq;
    private DataType zzajF;
    private Device zzakd;
    private Application zzake;
    private String zzakf;

    static DataType zza(zzakf zzakf1)
    {
        return zzakf1.zzajF;
    }

    static int zzb(zzajF zzajf)
    {
        return zzajf.zzSq;
    }

    static String zzc(zzSq zzsq)
    {
        return zzsq.mName;
    }

    static Device zzd(mName mname)
    {
        return mname.zzakd;
    }

    static Application zze(zzakd zzakd1)
    {
        return zzakd1.zzake;
    }

    static String zzf(zzake zzake1)
    {
        return zzake1.zzakf;
    }

    public DataSource build()
    {
        boolean flag1 = true;
        boolean flag;
        if (zzajF != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Must set data type");
        if (zzSq >= 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Must set data source type");
        return new DataSource(this, null);
    }

    public zzSq setAppPackageName(Context context)
    {
        return setAppPackageName(context.getPackageName());
    }

    public setAppPackageName setAppPackageName(String s)
    {
        zzake = Application.zzcG(s);
        return this;
    }

    public zzake setDataType(DataType datatype)
    {
        zzajF = datatype;
        return this;
    }

    public zzajF setDevice(Device device)
    {
        zzakd = device;
        return this;
    }

    public zzakd setName(String s)
    {
        mName = s;
        return this;
    }

    public mName setStreamName(String s)
    {
        boolean flag;
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Must specify a valid stream name");
        zzakf = s;
        return this;
    }

    public zzakf setType(int i)
    {
        zzSq = i;
        return this;
    }

    public ()
    {
        zzSq = -1;
        zzakf = "";
    }
}
