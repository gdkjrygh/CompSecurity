// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.internal.zzmg;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzh

public class DataSourcesRequest
    implements SafeParcelable
{
    public static class Builder
    {

        private boolean zzamg;
        private DataType zzami[];
        private int zzamj[] = {
            0, 1
        };

        static DataType[] zza(Builder builder)
        {
            return builder.zzami;
        }

        static int[] zzb(Builder builder)
        {
            return builder.zzamj;
        }

        static boolean zzc(Builder builder)
        {
            return builder.zzamg;
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
            return new DataSourcesRequest(this);
        }

        public transient Builder setDataSourceTypes(int ai[])
        {
            zzamj = ai;
            return this;
        }

        public transient Builder setDataTypes(DataType adatatype[])
        {
            zzami = adatatype;
            return this;
        }

        public Builder()
        {
            zzami = new DataType[0];
            zzamg = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    private final int zzCY;
    private final String zzMZ;
    private final List zzajQ;
    private final List zzamf;
    private final boolean zzamg;
    private final zzmg zzamh;

    DataSourcesRequest(int i, List list, List list1, boolean flag, IBinder ibinder, String s)
    {
        zzCY = i;
        zzajQ = list;
        zzamf = list1;
        zzamg = flag;
        if (ibinder == null)
        {
            list = null;
        } else
        {
            list = com.google.android.gms.internal.zzmg.zza.zzbr(ibinder);
        }
        zzamh = list;
        zzMZ = s;
    }

    private DataSourcesRequest(Builder builder)
    {
        this(((List) (zzkx.zzb(Builder.zza(builder)))), Arrays.asList(zzkx.zza(Builder.zzb(builder))), Builder.zzc(builder), null, null);
    }


    public DataSourcesRequest(DataSourcesRequest datasourcesrequest, zzmg zzmg1, String s)
    {
        this(datasourcesrequest.zzajQ, datasourcesrequest.zzamf, datasourcesrequest.zzamg, zzmg1, s);
    }

    public DataSourcesRequest(List list, List list1, boolean flag, zzmg zzmg1, String s)
    {
        zzCY = 3;
        zzajQ = list;
        zzamf = list1;
        zzamg = flag;
        zzamh = zzmg1;
        zzMZ = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public List getDataTypes()
    {
        return Collections.unmodifiableList(zzajQ);
    }

    public String getPackageName()
    {
        return zzMZ;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public String toString()
    {
        com.google.android.gms.common.internal.zzt.zza zza = zzt.zzt(this).zzg("dataTypes", zzajQ).zzg("sourceTypes", zzamf);
        if (zzamg)
        {
            zza.zzg("includeDbOnlySources", "true");
        }
        return zza.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public IBinder zzqU()
    {
        if (zzamh == null)
        {
            return null;
        } else
        {
            return zzamh.asBinder();
        }
    }

    public List zzrd()
    {
        return zzamf;
    }

    public boolean zzre()
    {
        return zzamg;
    }

}
