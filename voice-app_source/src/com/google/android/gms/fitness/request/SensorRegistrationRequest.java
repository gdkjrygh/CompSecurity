// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.zzj;
import com.google.android.gms.internal.zzmu;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzs, SensorRequest

public class SensorRegistrationRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzs();
    private final PendingIntent mPendingIntent;
    private final int zzCY;
    private final String zzMZ;
    private final DataType zzajF;
    private final DataSource zzajG;
    private final long zzakP;
    private final int zzakQ;
    private final zzmu zzalN;
    private zzj zzamr;
    int zzams;
    int zzamt;
    private final long zzamu;
    private final long zzamv;
    private final List zzamw;
    private final long zzamx;
    private final List zzamy;

    SensorRegistrationRequest(int i, DataSource datasource, DataType datatype, IBinder ibinder, int j, int k, long l, long l1, PendingIntent pendingintent, long l2, int i1, 
            List list, long l3, IBinder ibinder1, String s)
    {
        zzCY = i;
        zzajG = datasource;
        zzajF = datatype;
        long l4;
        if (ibinder == null)
        {
            datasource = null;
        } else
        {
            datasource = com.google.android.gms.fitness.data.zzj.zza.zzbh(ibinder);
        }
        zzamr = datasource;
        l4 = l;
        if (l == 0L)
        {
            l4 = j;
        }
        zzakP = l4;
        zzamv = l2;
        l = l1;
        if (l1 == 0L)
        {
            l = k;
        }
        zzamu = l;
        zzamw = list;
        mPendingIntent = pendingintent;
        zzakQ = i1;
        zzamy = Collections.emptyList();
        zzamx = l3;
        if (ibinder1 == null)
        {
            datasource = null;
        } else
        {
            datasource = com.google.android.gms.internal.zzmu.zza.zzbF(ibinder1);
        }
        zzalN = datasource;
        zzMZ = s;
    }

    public SensorRegistrationRequest(DataSource datasource, DataType datatype, zzj zzj1, PendingIntent pendingintent, long l, long l1, long l2, int i, List list, List list1, long l3, zzmu zzmu1, String s)
    {
        zzCY = 5;
        zzajG = datasource;
        zzajF = datatype;
        zzamr = zzj1;
        mPendingIntent = pendingintent;
        zzakP = l;
        zzamv = l1;
        zzamu = l2;
        zzakQ = i;
        zzamw = list;
        zzamy = list1;
        zzamx = l3;
        zzalN = zzmu1;
        zzMZ = s;
    }

    public SensorRegistrationRequest(SensorRequest sensorrequest, zzj zzj1, PendingIntent pendingintent, zzmu zzmu1, String s)
    {
        this(sensorrequest.getDataSource(), sensorrequest.getDataType(), zzj1, pendingintent, sensorrequest.getSamplingRate(TimeUnit.MICROSECONDS), sensorrequest.getFastestRate(TimeUnit.MICROSECONDS), sensorrequest.getMaxDeliveryLatency(TimeUnit.MICROSECONDS), sensorrequest.getAccuracyMode(), null, Collections.emptyList(), sensorrequest.zzrm(), zzmu1, s);
    }

    private boolean zzb(SensorRegistrationRequest sensorregistrationrequest)
    {
        return zzt.equal(zzajG, sensorregistrationrequest.zzajG) && zzt.equal(zzajF, sensorregistrationrequest.zzajF) && zzakP == sensorregistrationrequest.zzakP && zzamv == sensorregistrationrequest.zzamv && zzamu == sensorregistrationrequest.zzamu && zzakQ == sensorregistrationrequest.zzakQ && zzt.equal(zzamw, sensorregistrationrequest.zzamw);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof SensorRegistrationRequest) && zzb((SensorRegistrationRequest)obj);
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

    public String getPackageName()
    {
        return zzMZ;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzajG, zzajF, zzamr, Long.valueOf(zzakP), Long.valueOf(zzamv), Long.valueOf(zzamu), Integer.valueOf(zzakQ), zzamw
        });
    }

    public String toString()
    {
        return String.format("SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}", new Object[] {
            zzajF, zzajG, Long.valueOf(zzakP), Long.valueOf(zzamv), Long.valueOf(zzamu)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzs.zza(this, parcel, i);
    }

    public long zzqL()
    {
        return zzakP;
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

    public PendingIntent zzrg()
    {
        return mPendingIntent;
    }

    public long zzrh()
    {
        return zzamv;
    }

    public long zzri()
    {
        return zzamu;
    }

    public List zzrj()
    {
        return zzamw;
    }

    public long zzrk()
    {
        return zzamx;
    }

    IBinder zzrl()
    {
        if (zzamr == null)
        {
            return null;
        } else
        {
            return zzamr.asBinder();
        }
    }

}
