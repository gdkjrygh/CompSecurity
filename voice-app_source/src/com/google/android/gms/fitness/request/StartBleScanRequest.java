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
import com.google.android.gms.internal.zzmu;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzaa, zzn, BleScanCallback

public class StartBleScanRequest
    implements SafeParcelable
{
    public static class Builder
    {

        private zzn zzamK;
        private int zzamL;
        private DataType zzami[];

        static DataType[] zza(Builder builder)
        {
            return builder.zzami;
        }

        static zzn zzb(Builder builder)
        {
            return builder.zzamK;
        }

        static int zzc(Builder builder)
        {
            return builder.zzamL;
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
            return new StartBleScanRequest(this);
        }

        public Builder setBleScanCallback(BleScanCallback blescancallback)
        {
            zza(com.google.android.gms.fitness.request.zza.zza.zzqS().zza(blescancallback));
            return this;
        }

        public transient Builder setDataTypes(DataType adatatype[])
        {
            zzami = adatatype;
            return this;
        }

        public Builder setTimeoutSecs(int i)
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

        public Builder zza(zzn zzn1)
        {
            zzamK = zzn1;
            return this;
        }

        public Builder()
        {
            zzami = new DataType[0];
            zzamL = 10;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zzaa();
    private final int zzCY;
    private final String zzMZ;
    private final List zzajQ;
    private final zzmu zzalN;
    private final zzn zzamK;
    private final int zzamL;

    StartBleScanRequest(int i, List list, IBinder ibinder, int j, IBinder ibinder1, String s)
    {
        zzCY = i;
        zzajQ = list;
        zzamK = zzn.zza.zzbI(ibinder);
        zzamL = j;
        if (ibinder1 == null)
        {
            list = null;
        } else
        {
            list = com.google.android.gms.internal.zzmu.zza.zzbF(ibinder1);
        }
        zzalN = list;
        zzMZ = s;
    }

    private StartBleScanRequest(Builder builder)
    {
        this(((List) (zzkx.zzb(Builder.zza(builder)))), Builder.zzb(builder), Builder.zzc(builder), null, null);
    }


    public StartBleScanRequest(StartBleScanRequest startblescanrequest, zzmu zzmu1, String s)
    {
        this(startblescanrequest.zzajQ, startblescanrequest.zzamK, startblescanrequest.zzamL, zzmu1, s);
    }

    public StartBleScanRequest(List list, zzn zzn1, int i, zzmu zzmu1, String s)
    {
        zzCY = 3;
        zzajQ = list;
        zzamK = zzn1;
        zzamL = i;
        zzalN = zzmu1;
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

    public int getTimeoutSecs()
    {
        return zzamL;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("dataTypes", zzajQ).zzg("timeoutSecs", Integer.valueOf(zzamL)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzaa.zza(this, parcel, i);
    }

    public IBinder zzqU()
    {
        if (zzalN == null)
        {
            return null;
        } else
        {
            return zzalN.asBinder();
        }
    }

    public IBinder zzrq()
    {
        return zzamK.asBinder();
    }

}
