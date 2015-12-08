// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzv

public class SessionReadRequest
    implements SafeParcelable
{
    public static class Builder
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

        static String zza(Builder builder)
        {
            return builder.zzamE;
        }

        static String zzb(Builder builder)
        {
            return builder.zzFE;
        }

        static long zzc(Builder builder)
        {
            return builder.zzKT;
        }

        static long zzd(Builder builder)
        {
            return builder.zzajH;
        }

        static List zze(Builder builder)
        {
            return builder.zzajQ;
        }

        static List zzf(Builder builder)
        {
            return builder.zzalP;
        }

        static boolean zzg(Builder builder)
        {
            return builder.zzamF;
        }

        static boolean zzh(Builder builder)
        {
            return builder.zzama;
        }

        static List zzi(Builder builder)
        {
            return builder.zzamG;
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
            return new SessionReadRequest(this);
        }

        public Builder enableServerQueries()
        {
            zzama = true;
            return this;
        }

        public Builder excludePackage(String s)
        {
            zzu.zzb(s, "Attempting to use a null package name");
            if (!zzamG.contains(s))
            {
                zzamG.add(s);
            }
            return this;
        }

        public Builder read(DataSource datasource)
        {
            zzu.zzb(datasource, "Attempting to add a null data source");
            if (!zzalP.contains(datasource))
            {
                zzalP.add(datasource);
            }
            return this;
        }

        public Builder read(DataType datatype)
        {
            zzu.zzb(datatype, "Attempting to use a null data type");
            if (!zzajQ.contains(datatype))
            {
                zzajQ.add(datatype);
            }
            return this;
        }

        public Builder readSessionsFromAllApps()
        {
            zzamF = true;
            return this;
        }

        public Builder setSessionId(String s)
        {
            zzFE = s;
            return this;
        }

        public Builder setSessionName(String s)
        {
            zzamE = s;
            return this;
        }

        public Builder setTimeInterval(long l, long l1, TimeUnit timeunit)
        {
            zzKT = timeunit.toMillis(l);
            zzajH = timeunit.toMillis(l1);
            return this;
        }

        public Builder()
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


    public static final android.os.Parcelable.Creator CREATOR = new zzv();
    private final int zzCY;
    private final String zzFE;
    private final long zzKT;
    private final String zzMZ;
    private final long zzajH;
    private final List zzajQ;
    private final List zzalP;
    private final String zzamE;
    private boolean zzamF;
    private final List zzamG;
    private final zzms zzamH;
    private final boolean zzama;

    SessionReadRequest(int i, String s, String s1, long l, long l1, 
            List list, List list1, boolean flag, boolean flag1, List list2, IBinder ibinder, String s2)
    {
        zzCY = i;
        zzamE = s;
        zzFE = s1;
        zzKT = l;
        zzajH = l1;
        zzajQ = Collections.unmodifiableList(list);
        zzalP = Collections.unmodifiableList(list1);
        zzamF = flag;
        zzama = flag1;
        zzamG = list2;
        if (ibinder == null)
        {
            s = null;
        } else
        {
            s = com.google.android.gms.internal.zzms.zza.zzbD(ibinder);
        }
        zzamH = s;
        zzMZ = s2;
    }

    private SessionReadRequest(Builder builder)
    {
        this(Builder.zza(builder), Builder.zzb(builder), Builder.zzc(builder), Builder.zzd(builder), Builder.zze(builder), Builder.zzf(builder), Builder.zzg(builder), Builder.zzh(builder), Builder.zzi(builder), null, null);
    }


    public SessionReadRequest(SessionReadRequest sessionreadrequest, zzms zzms1, String s)
    {
        this(sessionreadrequest.zzamE, sessionreadrequest.zzFE, sessionreadrequest.zzKT, sessionreadrequest.zzajH, sessionreadrequest.zzajQ, sessionreadrequest.zzalP, sessionreadrequest.zzamF, sessionreadrequest.zzama, sessionreadrequest.zzamG, zzms1, s);
    }

    public SessionReadRequest(String s, String s1, long l, long l1, List list, 
            List list1, boolean flag, boolean flag1, List list2, zzms zzms1, String s2)
    {
        zzCY = 4;
        zzamE = s;
        zzFE = s1;
        zzKT = l;
        zzajH = l1;
        zzajQ = Collections.unmodifiableList(list);
        zzalP = Collections.unmodifiableList(list1);
        zzamF = flag;
        zzama = flag1;
        zzamG = list2;
        zzamH = zzms1;
        zzMZ = s2;
    }

    private boolean zzb(SessionReadRequest sessionreadrequest)
    {
        return zzt.equal(zzamE, sessionreadrequest.zzamE) && zzFE.equals(sessionreadrequest.zzFE) && zzKT == sessionreadrequest.zzKT && zzajH == sessionreadrequest.zzajH && zzt.equal(zzajQ, sessionreadrequest.zzajQ) && zzt.equal(zzalP, sessionreadrequest.zzalP) && zzamF == sessionreadrequest.zzamF && zzamG.equals(sessionreadrequest.zzamG) && zzama == sessionreadrequest.zzama;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof SessionReadRequest) && zzb((SessionReadRequest)obj);
    }

    public List getDataSources()
    {
        return zzalP;
    }

    public List getDataTypes()
    {
        return zzajQ;
    }

    public long getEndTime(TimeUnit timeunit)
    {
        return timeunit.convert(zzajH, TimeUnit.MILLISECONDS);
    }

    public List getExcludedPackages()
    {
        return zzamG;
    }

    public String getPackageName()
    {
        return zzMZ;
    }

    public String getSessionId()
    {
        return zzFE;
    }

    public String getSessionName()
    {
        return zzamE;
    }

    public long getStartTime(TimeUnit timeunit)
    {
        return timeunit.convert(zzKT, TimeUnit.MILLISECONDS);
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzamE, zzFE, Long.valueOf(zzKT), Long.valueOf(zzajH)
        });
    }

    public boolean includeSessionsFromAllApps()
    {
        return zzamF;
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("sessionName", zzamE).zzg("sessionId", zzFE).zzg("startTimeMillis", Long.valueOf(zzKT)).zzg("endTimeMillis", Long.valueOf(zzajH)).zzg("dataTypes", zzajQ).zzg("dataSources", zzalP).zzg("sessionsFromAllApps", Boolean.valueOf(zzamF)).zzg("excludedPackages", zzamG).zzg("useServer", Boolean.valueOf(zzama)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzv.zza(this, parcel, i);
    }

    public long zzkt()
    {
        return zzKT;
    }

    public IBinder zzqU()
    {
        if (zzamH == null)
        {
            return null;
        } else
        {
            return zzamH.asBinder();
        }
    }

    public boolean zzqZ()
    {
        return zzama;
    }

    public long zzqs()
    {
        return zzajH;
    }

    public boolean zzro()
    {
        return zzamF;
    }

}
