// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness:
//            HistoryApi

public static class zzajF
{

    private final Context mContext;
    private long zzKT;
    private final DataType zzajF;
    private DataSource zzajG;
    private long zzajH;
    private String zzajI;

    private Intent zzj(Intent intent)
    {
        if (zzajI != null)
        {
            Intent intent1 = (new Intent(intent)).setPackage(zzajI);
            ResolveInfo resolveinfo = mContext.getPackageManager().resolveActivity(intent1, 0);
            if (resolveinfo != null)
            {
                intent = resolveinfo.activityInfo.name;
                intent1.setComponent(new ComponentName(zzajI, intent));
                return intent1;
            }
        }
        return intent;
    }

    public Intent build()
    {
        boolean flag1 = true;
        Intent intent;
        boolean flag;
        if (zzKT > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Start time must be set");
        if (zzajH > zzKT)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "End time must be set and after start time");
        intent = new Intent("vnd.google.fitness.VIEW");
        intent.setType(DataType.getMimeType(zzajG.getDataType()));
        intent.putExtra("vnd.google.fitness.start_time", zzKT);
        intent.putExtra("vnd.google.fitness.end_time", zzajH);
        zzc.zza(zzajG, intent, "vnd.google.fitness.data_source");
        return zzj(intent);
    }

    public zzj setDataSource(DataSource datasource)
    {
        zzu.zzb(datasource.getDataType().equals(zzajF), "Data source %s is not for the data type %s", new Object[] {
            datasource, zzajF
        });
        zzajG = datasource;
        return this;
    }

    public zzajG setPreferredApplication(String s)
    {
        zzajI = s;
        return this;
    }

    public zzajI setTimeInterval(long l, long l1, TimeUnit timeunit)
    {
        zzKT = timeunit.toMillis(l);
        zzajH = timeunit.toMillis(l1);
        return this;
    }

    public A(Context context, DataType datatype)
    {
        mContext = context;
        zzajF = datatype;
    }
}
