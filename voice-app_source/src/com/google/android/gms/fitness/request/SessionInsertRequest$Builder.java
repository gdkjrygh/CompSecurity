// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.zzlu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            SessionInsertRequest

public static class zzamD
{

    private Session zzajJ;
    private List zzajS;
    private List zzamC;
    private List zzamD;

    static Session zza(zzamD zzamd)
    {
        return zzamd.zzajJ;
    }

    static List zzb(zzajJ zzajj)
    {
        return zzajj.zzajS;
    }

    static List zzc(zzajS zzajs)
    {
        return zzajs.zzamC;
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

    public zzd addAggregateDataPoint(DataPoint datapoint)
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

    public zzamC addDataSet(DataSet dataset)
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
        return new SessionInsertRequest(this, null);
    }

    public zzrn setSession(Session session)
    {
        zzajJ = session;
        return this;
    }

    public I()
    {
        zzajS = new ArrayList();
        zzamC = new ArrayList();
        zzamD = new ArrayList();
    }
}
