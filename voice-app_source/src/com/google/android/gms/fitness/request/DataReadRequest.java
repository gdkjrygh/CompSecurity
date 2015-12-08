// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzmf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzf

public class DataReadRequest
    implements SafeParcelable
{
    public static class Builder
    {

        private long zzKT;
        private long zzajH;
        private List zzajQ;
        private int zzajT;
        private List zzalP;
        private List zzalU;
        private List zzalV;
        private long zzalW;
        private DataSource zzalX;
        private int zzalY;
        private boolean zzalZ;
        private boolean zzama;
        private List zzamc;

        static List zza(Builder builder)
        {
            return builder.zzajQ;
        }

        static List zzb(Builder builder)
        {
            return builder.zzalP;
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
            return builder.zzalU;
        }

        static List zzf(Builder builder)
        {
            return builder.zzalV;
        }

        static int zzg(Builder builder)
        {
            return builder.zzajT;
        }

        static long zzh(Builder builder)
        {
            return builder.zzalW;
        }

        static DataSource zzi(Builder builder)
        {
            return builder.zzalX;
        }

        static int zzj(Builder builder)
        {
            return builder.zzalY;
        }

        static boolean zzk(Builder builder)
        {
            return builder.zzalZ;
        }

        static boolean zzl(Builder builder)
        {
            return builder.zzama;
        }

        static List zzm(Builder builder)
        {
            return builder.zzamc;
        }

        public Builder aggregate(DataSource datasource, DataType datatype)
        {
            zzu.zzb(datasource, "Attempting to add a null data source");
            DataType datatype1;
            boolean flag;
            if (!zzalP.contains(datasource))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zza(flag, "Cannot add the same data source for aggregated and detailed");
            datatype1 = datasource.getDataType();
            zzu.zzb(DataType.AGGREGATE_INPUT_TYPES.contains(datatype1), "Unsupported input data type specified for aggregation: %s", new Object[] {
                datatype1
            });
            zzu.zzb(DataType.getAggregatesForInput(datatype1).contains(datatype), "Invalid output aggregate data type specified: %s -> %s", new Object[] {
                datatype1, datatype
            });
            if (!zzalV.contains(datasource))
            {
                zzalV.add(datasource);
            }
            return this;
        }

        public Builder aggregate(DataType datatype, DataType datatype1)
        {
            zzu.zzb(datatype, "Attempting to use a null data type");
            boolean flag;
            if (!zzajQ.contains(datatype))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zza(flag, "Cannot add the same data type as aggregated and detailed");
            zzu.zzb(DataType.AGGREGATE_INPUT_TYPES.contains(datatype), "Unsupported input data type specified for aggregation: %s", new Object[] {
                datatype
            });
            zzu.zzb(DataType.getAggregatesForInput(datatype).contains(datatype1), "Invalid output aggregate data type specified: %s -> %s", new Object[] {
                datatype, datatype1
            });
            if (!zzalU.contains(datatype))
            {
                zzalU.add(datatype);
            }
            return this;
        }

        public Builder bucketByActivitySegment(int i, TimeUnit timeunit)
        {
            boolean flag;
            if (zzajT == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(zzajT)
            });
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i)
            });
            zzajT = 4;
            zzalW = timeunit.toMillis(i);
            return this;
        }

        public Builder bucketByActivitySegment(int i, TimeUnit timeunit, DataSource datasource)
        {
            boolean flag;
            if (zzajT == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(zzajT)
            });
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i)
            });
            if (datasource != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Invalid activity data source specified");
            zzu.zzb(datasource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", new Object[] {
                datasource
            });
            zzalX = datasource;
            zzajT = 4;
            zzalW = timeunit.toMillis(i);
            return this;
        }

        public Builder bucketByActivityType(int i, TimeUnit timeunit)
        {
            boolean flag;
            if (zzajT == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(zzajT)
            });
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i)
            });
            zzajT = 3;
            zzalW = timeunit.toMillis(i);
            return this;
        }

        public Builder bucketByActivityType(int i, TimeUnit timeunit, DataSource datasource)
        {
            boolean flag;
            if (zzajT == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(zzajT)
            });
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i)
            });
            if (datasource != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Invalid activity data source specified");
            zzu.zzb(datasource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", new Object[] {
                datasource
            });
            zzalX = datasource;
            zzajT = 3;
            zzalW = timeunit.toMillis(i);
            return this;
        }

        public Builder bucketBySession(int i, TimeUnit timeunit)
        {
            boolean flag;
            if (zzajT == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(zzajT)
            });
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i)
            });
            zzajT = 2;
            zzalW = timeunit.toMillis(i);
            return this;
        }

        public Builder bucketByTime(int i, TimeUnit timeunit)
        {
            boolean flag;
            if (zzajT == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(zzajT)
            });
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i)
            });
            zzajT = 1;
            zzalW = timeunit.toMillis(i);
            return this;
        }

        public DataReadRequest build()
        {
label0:
            {
                boolean flag2 = true;
                boolean flag;
                boolean flag1;
                if (!zzalP.isEmpty() || !zzajQ.isEmpty() || !zzalV.isEmpty() || !zzalU.isEmpty())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                zzu.zza(flag1, "Must add at least one data source (aggregated or detailed)");
                if (zzKT > 0L)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                zzu.zza(flag1, "Invalid start time: %s", new Object[] {
                    Long.valueOf(zzKT)
                });
                if (zzajH > 0L && zzajH > zzKT)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                zzu.zza(flag1, "Invalid end time: %s", new Object[] {
                    Long.valueOf(zzajH)
                });
                if (zzalV.isEmpty() && zzalU.isEmpty())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    flag1 = flag2;
                    if (zzajT == 0)
                    {
                        break label0;
                    }
                }
                if (!flag && zzajT != 0)
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
            }
            zzu.zza(flag1, "Must specify a valid bucketing strategy while requesting aggregation");
            return new DataReadRequest(this);
        }

        public Builder enableServerQueries()
        {
            zzama = true;
            return this;
        }

        public Builder read(DataSource datasource)
        {
            zzu.zzb(datasource, "Attempting to add a null data source");
            boolean flag;
            if (!zzalV.contains(datasource))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Cannot add the same data source as aggregated and detailed");
            if (!zzalP.contains(datasource))
            {
                zzalP.add(datasource);
            }
            return this;
        }

        public Builder read(DataType datatype)
        {
            zzu.zzb(datatype, "Attempting to use a null data type");
            boolean flag;
            if (!zzalU.contains(datatype))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zza(flag, "Cannot add the same data type as aggregated and detailed");
            if (!zzajQ.contains(datatype))
            {
                zzajQ.add(datatype);
            }
            return this;
        }

        public Builder setLimit(int i)
        {
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Invalid limit %d is specified", new Object[] {
                Integer.valueOf(i)
            });
            zzalY = i;
            return this;
        }

        public Builder setTimeRange(long l, long l1, TimeUnit timeunit)
        {
            zzKT = timeunit.toMillis(l);
            zzajH = timeunit.toMillis(l1);
            return this;
        }

        public Builder()
        {
            zzajQ = new ArrayList();
            zzalP = new ArrayList();
            zzalU = new ArrayList();
            zzalV = new ArrayList();
            zzajT = 0;
            zzalW = 0L;
            zzalY = 0;
            zzalZ = false;
            zzama = false;
            zzamc = new ArrayList();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    public static final int NO_LIMIT = 0;
    private final int zzCY;
    private final long zzKT;
    private final String zzMZ;
    private final long zzajH;
    private final List zzajQ;
    private final int zzajT;
    private final List zzalP;
    private final List zzalU;
    private final List zzalV;
    private final long zzalW;
    private final DataSource zzalX;
    private final int zzalY;
    private final boolean zzalZ;
    private final boolean zzama;
    private final zzmf zzamb;
    private final List zzamc;

    DataReadRequest(int i, List list, List list1, long l, long l1, 
            List list2, List list3, int j, long l2, DataSource datasource, int k, 
            boolean flag, boolean flag1, IBinder ibinder, String s, List list4)
    {
        zzCY = i;
        zzajQ = Collections.unmodifiableList(list);
        zzalP = Collections.unmodifiableList(list1);
        zzKT = l;
        zzajH = l1;
        zzalU = Collections.unmodifiableList(list2);
        zzalV = Collections.unmodifiableList(list3);
        zzajT = j;
        zzalW = l2;
        zzalX = datasource;
        zzalY = k;
        zzalZ = flag;
        zzama = flag1;
        if (ibinder == null)
        {
            list = null;
        } else
        {
            list = com.google.android.gms.internal.zzmf.zza.zzbq(ibinder);
        }
        zzamb = list;
        zzMZ = s;
        list = list4;
        if (list4 == null)
        {
            list = Collections.EMPTY_LIST;
        }
        zzamc = list;
    }

    private DataReadRequest(Builder builder)
    {
        this(Builder.zza(builder), Builder.zzb(builder), Builder.zzc(builder), Builder.zzd(builder), Builder.zze(builder), Builder.zzf(builder), Builder.zzg(builder), Builder.zzh(builder), Builder.zzi(builder), Builder.zzj(builder), Builder.zzk(builder), Builder.zzl(builder), null, null, Builder.zzm(builder));
    }


    public DataReadRequest(DataReadRequest datareadrequest, zzmf zzmf1, String s)
    {
        this(datareadrequest.zzajQ, datareadrequest.zzalP, datareadrequest.zzKT, datareadrequest.zzajH, datareadrequest.zzalU, datareadrequest.zzalV, datareadrequest.zzajT, datareadrequest.zzalW, datareadrequest.zzalX, datareadrequest.zzalY, datareadrequest.zzalZ, datareadrequest.zzama, zzmf1, s, datareadrequest.zzamc);
    }

    public DataReadRequest(List list, List list1, long l, long l1, List list2, 
            List list3, int i, long l2, DataSource datasource, int j, boolean flag, 
            boolean flag1, zzmf zzmf1, String s, List list4)
    {
        zzCY = 4;
        zzajQ = Collections.unmodifiableList(list);
        zzalP = Collections.unmodifiableList(list1);
        zzKT = l;
        zzajH = l1;
        zzalU = Collections.unmodifiableList(list2);
        zzalV = Collections.unmodifiableList(list3);
        zzajT = i;
        zzalW = l2;
        zzalX = datasource;
        zzalY = j;
        zzalZ = flag;
        zzama = flag1;
        zzamb = zzmf1;
        zzMZ = s;
        zzamc = list4;
    }

    private boolean zzb(DataReadRequest datareadrequest)
    {
        return zzajQ.equals(datareadrequest.zzajQ) && zzalP.equals(datareadrequest.zzalP) && zzKT == datareadrequest.zzKT && zzajH == datareadrequest.zzajH && zzajT == datareadrequest.zzajT && zzalV.equals(datareadrequest.zzalV) && zzalU.equals(datareadrequest.zzalU) && zzt.equal(zzalX, datareadrequest.zzalX) && zzalW == datareadrequest.zzalW && zzama == datareadrequest.zzama;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DataReadRequest) && zzb((DataReadRequest)obj);
    }

    public DataSource getActivityDataSource()
    {
        return zzalX;
    }

    public List getAggregatedDataSources()
    {
        return zzalV;
    }

    public List getAggregatedDataTypes()
    {
        return zzalU;
    }

    public long getBucketDuration(TimeUnit timeunit)
    {
        return timeunit.convert(zzalW, TimeUnit.MILLISECONDS);
    }

    public int getBucketType()
    {
        return zzajT;
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

    public int getLimit()
    {
        return zzalY;
    }

    public String getPackageName()
    {
        return zzMZ;
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
            Integer.valueOf(zzajT), Long.valueOf(zzKT), Long.valueOf(zzajH)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataReadRequest{");
        if (!zzajQ.isEmpty())
        {
            for (Iterator iterator = zzajQ.iterator(); iterator.hasNext(); stringbuilder.append(((DataType)iterator.next()).zzqD()).append(" ")) { }
        }
        if (!zzalP.isEmpty())
        {
            for (Iterator iterator1 = zzalP.iterator(); iterator1.hasNext(); stringbuilder.append(((DataSource)iterator1.next()).toDebugString()).append(" ")) { }
        }
        if (zzajT != 0)
        {
            stringbuilder.append("bucket by ").append(Bucket.zzeb(zzajT));
            if (zzalW > 0L)
            {
                stringbuilder.append(" >").append(zzalW).append("ms");
            }
            stringbuilder.append(": ");
        }
        if (!zzalU.isEmpty())
        {
            for (Iterator iterator2 = zzalU.iterator(); iterator2.hasNext(); stringbuilder.append(((DataType)iterator2.next()).zzqD()).append(" ")) { }
        }
        if (!zzalV.isEmpty())
        {
            for (Iterator iterator3 = zzalV.iterator(); iterator3.hasNext(); stringbuilder.append(((DataSource)iterator3.next()).toDebugString()).append(" ")) { }
        }
        stringbuilder.append(String.format("(%tF %tT - %tF %tT)", new Object[] {
            Long.valueOf(zzKT), Long.valueOf(zzKT), Long.valueOf(zzajH), Long.valueOf(zzajH)
        }));
        if (zzalX != null)
        {
            stringbuilder.append("activities: ").append(zzalX.toDebugString());
        }
        if (zzama)
        {
            stringbuilder.append(" +server");
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    public long zzkt()
    {
        return zzKT;
    }

    public IBinder zzqU()
    {
        if (zzamb == null)
        {
            return null;
        } else
        {
            return zzamb.asBinder();
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

    public boolean zzra()
    {
        return zzalZ;
    }

    public long zzrb()
    {
        return zzalW;
    }

    public List zzrc()
    {
        return zzamc;
    }

}
