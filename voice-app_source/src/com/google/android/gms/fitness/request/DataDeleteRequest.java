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
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.zzmu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzd

public class DataDeleteRequest
    implements SafeParcelable
{
    public static class Builder
    {

        private long zzKT;
        private long zzajH;
        private List zzajQ;
        private List zzalP;
        private List zzalQ;
        private boolean zzalR;
        private boolean zzalS;

        static long zza(Builder builder)
        {
            return builder.zzKT;
        }

        static long zzb(Builder builder)
        {
            return builder.zzajH;
        }

        static List zzc(Builder builder)
        {
            return builder.zzalP;
        }

        static List zzd(Builder builder)
        {
            return builder.zzajQ;
        }

        static List zze(Builder builder)
        {
            return builder.zzalQ;
        }

        static boolean zzf(Builder builder)
        {
            return builder.zzalR;
        }

        static boolean zzg(Builder builder)
        {
            return builder.zzalS;
        }

        private void zzqX()
        {
            if (!zzalQ.isEmpty())
            {
                Iterator iterator = zzalQ.iterator();
                while (iterator.hasNext()) 
                {
                    Session session = (Session)iterator.next();
                    boolean flag;
                    if (session.getStartTime(TimeUnit.MILLISECONDS) >= zzKT && session.getEndTime(TimeUnit.MILLISECONDS) <= zzajH)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    zzu.zza(flag, "Session %s is outside the time interval [%d, %d]", new Object[] {
                        session, Long.valueOf(zzKT), Long.valueOf(zzajH)
                    });
                }
            }
        }

        public Builder addDataSource(DataSource datasource)
        {
            boolean flag1 = true;
            boolean flag;
            if (!zzalR)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "All data is already marked for deletion");
            if (datasource != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Must specify a valid data source");
            if (!zzalP.contains(datasource))
            {
                zzalP.add(datasource);
            }
            return this;
        }

        public Builder addDataType(DataType datatype)
        {
            boolean flag1 = true;
            boolean flag;
            if (!zzalR)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "All data is already marked for deletion");
            if (datatype != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Must specify a valid data type");
            if (!zzajQ.contains(datatype))
            {
                zzajQ.add(datatype);
            }
            return this;
        }

        public Builder addSession(Session session)
        {
            boolean flag1 = true;
            boolean flag;
            if (!zzalS)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "All sessions already marked for deletion");
            if (session != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Must specify a valid session");
            if (session.getEndTime(TimeUnit.MILLISECONDS) > 0L)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Cannot delete an ongoing session. Please stop the session prior to deleting it");
            zzalQ.add(session);
            return this;
        }

        public DataDeleteRequest build()
        {
label0:
            {
                boolean flag3 = false;
                boolean flag;
                boolean flag1;
                boolean flag2;
                if (zzKT > 0L && zzajH > zzKT)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                zzu.zza(flag2, "Must specify a valid time interval");
                if (zzalR || !zzalP.isEmpty() || !zzajQ.isEmpty())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (zzalS || !zzalQ.isEmpty())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (!flag)
                {
                    flag2 = flag3;
                    if (!flag1)
                    {
                        break label0;
                    }
                }
                flag2 = true;
            }
            zzu.zza(flag2, "No data or session marked for deletion");
            zzqX();
            return new DataDeleteRequest(this);
        }

        public Builder deleteAllData()
        {
            boolean flag;
            if (zzajQ.isEmpty() && zzalP.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Specific data source/type already specified for deletion. DataSources: %s DataTypes: %s", new Object[] {
                zzalP, zzajQ
            });
            zzalR = true;
            return this;
        }

        public Builder deleteAllSessions()
        {
            zzu.zzb(zzalQ.isEmpty(), "Specific sessions already added for deletion: %s", new Object[] {
                zzalQ
            });
            zzalS = true;
            return this;
        }

        public Builder setTimeInterval(long l, long l1, TimeUnit timeunit)
        {
            boolean flag;
            if (l > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Invalid start time :%d", new Object[] {
                Long.valueOf(l)
            });
            if (l1 > l)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Invalid end time :%d", new Object[] {
                Long.valueOf(l1)
            });
            zzKT = timeunit.toMillis(l);
            zzajH = timeunit.toMillis(l1);
            return this;
        }

        public Builder()
        {
            zzalP = new ArrayList();
            zzajQ = new ArrayList();
            zzalQ = new ArrayList();
            zzalR = false;
            zzalS = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    private final int zzCY;
    private final long zzKT;
    private final String zzMZ;
    private final long zzajH;
    private final List zzajQ;
    private final zzmu zzalN;
    private final List zzalP;
    private final List zzalQ;
    private final boolean zzalR;
    private final boolean zzalS;

    DataDeleteRequest(int i, long l, long l1, List list, List list1, 
            List list2, boolean flag, boolean flag1, IBinder ibinder, String s)
    {
        zzCY = i;
        zzKT = l;
        zzajH = l1;
        zzalP = Collections.unmodifiableList(list);
        zzajQ = Collections.unmodifiableList(list1);
        zzalQ = list2;
        zzalR = flag;
        zzalS = flag1;
        if (ibinder == null)
        {
            list = null;
        } else
        {
            list = com.google.android.gms.internal.zzmu.zza.zzbF(ibinder);
        }
        zzalN = list;
        zzMZ = s;
    }

    public DataDeleteRequest(long l, long l1, List list, List list1, List list2, 
            boolean flag, boolean flag1, zzmu zzmu1, String s)
    {
        zzCY = 2;
        zzKT = l;
        zzajH = l1;
        zzalP = Collections.unmodifiableList(list);
        zzajQ = Collections.unmodifiableList(list1);
        zzalQ = list2;
        zzalR = flag;
        zzalS = flag1;
        zzalN = zzmu1;
        zzMZ = s;
    }

    private DataDeleteRequest(Builder builder)
    {
        this(Builder.zza(builder), Builder.zzb(builder), Builder.zzc(builder), Builder.zzd(builder), Builder.zze(builder), Builder.zzf(builder), Builder.zzg(builder), null, null);
    }


    public DataDeleteRequest(DataDeleteRequest datadeleterequest, zzmu zzmu1, String s)
    {
        this(datadeleterequest.zzKT, datadeleterequest.zzajH, datadeleterequest.zzalP, datadeleterequest.zzajQ, datadeleterequest.zzalQ, datadeleterequest.zzalR, datadeleterequest.zzalS, zzmu1, s);
    }

    private boolean zzb(DataDeleteRequest datadeleterequest)
    {
        return zzKT == datadeleterequest.zzKT && zzajH == datadeleterequest.zzajH && zzt.equal(zzalP, datadeleterequest.zzalP) && zzt.equal(zzajQ, datadeleterequest.zzajQ) && zzt.equal(zzalQ, datadeleterequest.zzalQ) && zzalR == datadeleterequest.zzalR && zzalS == datadeleterequest.zzalS;
    }

    public boolean deleteAllData()
    {
        return zzalR;
    }

    public boolean deleteAllSessions()
    {
        return zzalS;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof DataDeleteRequest) && zzb((DataDeleteRequest)obj);
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

    public String getPackageName()
    {
        return zzMZ;
    }

    public List getSessions()
    {
        return zzalQ;
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
            Long.valueOf(zzKT), Long.valueOf(zzajH)
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("startTimeMillis", Long.valueOf(zzKT)).zzg("endTimeMillis", Long.valueOf(zzajH)).zzg("dataSources", zzalP).zzg("dateTypes", zzajQ).zzg("sessions", zzalQ).zzg("deleteAllData", Boolean.valueOf(zzalR)).zzg("deleteAllSessions", Boolean.valueOf(zzalS)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd.zza(this, parcel, i);
    }

    public long zzkt()
    {
        return zzKT;
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

    public boolean zzqV()
    {
        return zzalR;
    }

    public boolean zzqW()
    {
        return zzalS;
    }

    public long zzqs()
    {
        return zzajH;
    }

}
