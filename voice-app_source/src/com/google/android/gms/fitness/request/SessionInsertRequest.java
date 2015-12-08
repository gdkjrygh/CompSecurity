// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.zzlu;
import com.google.android.gms.internal.zzmu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzu

public class SessionInsertRequest
    implements SafeParcelable
{
    public static class Builder
    {

        private Session zzajJ;
        private List zzajS;
        private List zzamC;
        private List zzamD;

        static Session zza(Builder builder)
        {
            return builder.zzajJ;
        }

        static List zzb(Builder builder)
        {
            return builder.zzajS;
        }

        static List zzc(Builder builder)
        {
            return builder.zzamC;
        }

        private void zzd(DataPoint datapoint)
        {
            zzf(datapoint);
            zze(datapoint);
        }

        private void zze(DataPoint datapoint)
        {
            long l2 = zzajJ.getStartTime(TimeUnit.NANOSECONDS);
            long l3 = zzajJ.getEndTime(TimeUnit.NANOSECONDS);
            long l4 = datapoint.getStartTime(TimeUnit.NANOSECONDS);
            long l1 = datapoint.getEndTime(TimeUnit.NANOSECONDS);
            if (l4 != 0L && l1 != 0L)
            {
                TimeUnit timeunit = TimeUnit.MILLISECONDS;
                long l = l1;
                if (l1 > l3)
                {
                    l = zzlu.zza(l1, TimeUnit.NANOSECONDS, timeunit);
                }
                boolean flag;
                if (l4 >= l2 && l <= l3)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                zzu.zza(flag, "Data point %s has start and end times outside session interval [%d, %d]", new Object[] {
                    datapoint, Long.valueOf(l2), Long.valueOf(l3)
                });
                if (l != datapoint.getEndTime(TimeUnit.NANOSECONDS))
                {
                    Log.w("Fitness", String.format("Data point end time [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", new Object[] {
                        Long.valueOf(datapoint.getEndTime(TimeUnit.NANOSECONDS)), Long.valueOf(l), timeunit
                    }));
                    datapoint.setTimeInterval(l4, l, TimeUnit.NANOSECONDS);
                }
            }
        }

        private void zzf(DataPoint datapoint)
        {
label0:
            {
                TimeUnit timeunit;
                long l;
                long l2;
                long l3;
label1:
                {
                    l2 = zzajJ.getStartTime(TimeUnit.NANOSECONDS);
                    l3 = zzajJ.getEndTime(TimeUnit.NANOSECONDS);
                    long l1 = datapoint.getTimestamp(TimeUnit.NANOSECONDS);
                    if (l1 == 0L)
                    {
                        break label0;
                    }
                    timeunit = TimeUnit.MILLISECONDS;
                    if (l1 >= l2)
                    {
                        l = l1;
                        if (l1 <= l3)
                        {
                            break label1;
                        }
                    }
                    l = zzlu.zza(l1, TimeUnit.NANOSECONDS, timeunit);
                }
                boolean flag;
                if (l >= l2 && l <= l3)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                zzu.zza(flag, "Data point %s has time stamp outside session interval [%d, %d]", new Object[] {
                    datapoint, Long.valueOf(l2), Long.valueOf(l3)
                });
                if (datapoint.getTimestamp(TimeUnit.NANOSECONDS) != l)
                {
                    Log.w("Fitness", String.format("Data point timestamp [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", new Object[] {
                        Long.valueOf(datapoint.getTimestamp(TimeUnit.NANOSECONDS)), Long.valueOf(l), timeunit
                    }));
                    datapoint.setTimestamp(l, TimeUnit.NANOSECONDS);
                }
            }
        }

        private void zzrn()
        {
            for (Iterator iterator = zzajS.iterator(); iterator.hasNext();)
            {
                Iterator iterator2 = ((DataSet)iterator.next()).getDataPoints().iterator();
                while (iterator2.hasNext()) 
                {
                    zzd((DataPoint)iterator2.next());
                }
            }

            for (Iterator iterator1 = zzamC.iterator(); iterator1.hasNext(); zzd((DataPoint)iterator1.next())) { }
        }

        public Builder addAggregateDataPoint(DataPoint datapoint)
        {
            com.google.android.gms.fitness.data.DataSource datasource;
            long l;
            long l1;
            boolean flag;
            if (datapoint != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Must specify a valid aggregate data point.");
            l = datapoint.getStartTime(TimeUnit.NANOSECONDS);
            l1 = datapoint.getEndTime(TimeUnit.NANOSECONDS);
            if (l > 0L && l1 > l)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Aggregate data point should have valid start and end times: %s", new Object[] {
                datapoint
            });
            datasource = datapoint.getDataSource();
            if (!zzamD.contains(datasource))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zza(flag, "Data set/Aggregate data point for this data source %s is already added.", new Object[] {
                datasource
            });
            zzamD.add(datasource);
            zzamC.add(datapoint);
            return this;
        }

        public Builder addDataSet(DataSet dataset)
        {
            boolean flag1 = true;
            com.google.android.gms.fitness.data.DataSource datasource;
            boolean flag;
            if (dataset != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Must specify a valid data set.");
            datasource = dataset.getDataSource();
            if (!zzamD.contains(datasource))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zza(flag, "Data set for this data source %s is already added.", new Object[] {
                datasource
            });
            if (!dataset.getDataPoints().isEmpty())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "No data points specified in the input data set.");
            zzamD.add(datasource);
            zzajS.add(dataset);
            return this;
        }

        public SessionInsertRequest build()
        {
            boolean flag1 = true;
            boolean flag;
            if (zzajJ != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zza(flag, "Must specify a valid session.");
            if (zzajJ.getEndTime(TimeUnit.MILLISECONDS) != 0L)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            zzu.zza(flag, "Must specify a valid end time, cannot insert a continuing session.");
            zzrn();
            return new SessionInsertRequest(this);
        }

        public Builder setSession(Session session)
        {
            zzajJ = session;
            return this;
        }

        public Builder()
        {
            zzajS = new ArrayList();
            zzamC = new ArrayList();
            zzamD = new ArrayList();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.fitness.request.zzu();
    private final int zzCY;
    private final String zzMZ;
    private final Session zzajJ;
    private final List zzajS;
    private final zzmu zzalN;
    private final List zzamC;

    SessionInsertRequest(int i, Session session, List list, List list1, IBinder ibinder, String s)
    {
        zzCY = i;
        zzajJ = session;
        zzajS = Collections.unmodifiableList(list);
        zzamC = Collections.unmodifiableList(list1);
        if (ibinder == null)
        {
            session = null;
        } else
        {
            session = com.google.android.gms.internal.zzmu.zza.zzbF(ibinder);
        }
        zzalN = session;
        zzMZ = s;
    }

    public SessionInsertRequest(Session session, List list, List list1, zzmu zzmu1, String s)
    {
        zzCY = 2;
        zzajJ = session;
        zzajS = Collections.unmodifiableList(list);
        zzamC = Collections.unmodifiableList(list1);
        zzalN = zzmu1;
        zzMZ = s;
    }

    private SessionInsertRequest(Builder builder)
    {
        this(Builder.zza(builder), Builder.zzb(builder), Builder.zzc(builder), null, null);
    }


    public SessionInsertRequest(SessionInsertRequest sessioninsertrequest, zzmu zzmu1, String s)
    {
        this(sessioninsertrequest.zzajJ, sessioninsertrequest.zzajS, sessioninsertrequest.zzamC, zzmu1, s);
    }

    private boolean zzb(SessionInsertRequest sessioninsertrequest)
    {
        return zzt.equal(zzajJ, sessioninsertrequest.zzajJ) && zzt.equal(zzajS, sessioninsertrequest.zzajS) && zzt.equal(zzamC, sessioninsertrequest.zzamC);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof SessionInsertRequest) && zzb((SessionInsertRequest)obj);
    }

    public List getAggregateDataPoints()
    {
        return zzamC;
    }

    public List getDataSets()
    {
        return zzajS;
    }

    public String getPackageName()
    {
        return zzMZ;
    }

    public Session getSession()
    {
        return zzajJ;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzajJ, zzajS, zzamC
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("session", zzajJ).zzg("dataSets", zzajS).zzg("aggregateDataPoints", zzamC).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzu.zza(this, parcel, i);
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

}
