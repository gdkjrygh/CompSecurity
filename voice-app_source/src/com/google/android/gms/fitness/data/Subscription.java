// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzr, DataType, DataSource

public class Subscription
    implements SafeParcelable
{
    public static class zza
    {

        private DataType zzajF;
        private DataSource zzajG;
        private long zzakP;
        private int zzakQ;

        static DataType zza(zza zza1)
        {
            return zza1.zzajF;
        }

        static DataSource zzb(zza zza1)
        {
            return zza1.zzajG;
        }

        static long zzc(zza zza1)
        {
            return zza1.zzakP;
        }

        static int zzd(zza zza1)
        {
            return zza1.zzakQ;
        }

        public zza zzb(DataSource datasource)
        {
            zzajG = datasource;
            return this;
        }

        public zza zzb(DataType datatype)
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
            return new Subscription(this);
        }

        public zza()
        {
            zzakP = -1L;
            zzakQ = 2;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zzr();
    private final int zzCY;
    private final DataType zzajF;
    private final DataSource zzajG;
    private final long zzakP;
    private final int zzakQ;

    Subscription(int i, DataSource datasource, DataType datatype, long l, int j)
    {
        zzCY = i;
        zzajG = datasource;
        zzajF = datatype;
        zzakP = l;
        zzakQ = j;
    }

    private Subscription(zza zza1)
    {
        zzCY = 1;
        zzajF = zza.zza(zza1);
        zzajG = zza.zzb(zza1);
        zzakP = zza.zzc(zza1);
        zzakQ = zza.zzd(zza1);
    }


    private boolean zza(Subscription subscription)
    {
        return zzt.equal(zzajG, subscription.zzajG) && zzt.equal(zzajF, subscription.zzajF) && zzakP == subscription.zzakP && zzakQ == subscription.zzakQ;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof Subscription) && zza((Subscription)obj);
    }

    public int getAccuracyMode()
    {
        return zzakQ;
    }

    public DataSource getDataSource()
    {
        return zzajG;
    }

    public DataType getDataType()
    {
        return zzajF;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzajG, zzajG, Long.valueOf(zzakP), Integer.valueOf(zzakQ)
        });
    }

    public String toDebugString()
    {
        String s;
        if (zzajG == null)
        {
            s = zzajF.getName();
        } else
        {
            s = zzajG.toDebugString();
        }
        return String.format("Subscription{%s}", new Object[] {
            s
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("dataSource", zzajG).zzg("dataType", zzajF).zzg("samplingIntervalMicros", Long.valueOf(zzakP)).zzg("accuracyMode", Integer.valueOf(zzakQ)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzr.zza(this, parcel, i);
    }

    public long zzqL()
    {
        return zzakP;
    }

    public DataType zzqM()
    {
        if (zzajF == null)
        {
            return zzajG.getDataType();
        } else
        {
            return zzajF;
        }
    }

}
