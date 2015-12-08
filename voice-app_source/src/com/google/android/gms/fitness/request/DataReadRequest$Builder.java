// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataReadRequest

public static class zzamc
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

    static List zza(zzamc zzamc1)
    {
        return zzamc1.zzajQ;
    }

    static List zzb(zzajQ zzajq)
    {
        return zzajq.zzalP;
    }

    static long zzc(zzalP zzalp)
    {
        return zzalp.zzKT;
    }

    static long zzd(zzKT zzkt)
    {
        return zzkt.zzajH;
    }

    static List zze(zzajH zzajh)
    {
        return zzajh.zzalU;
    }

    static List zzf(zzalU zzalu)
    {
        return zzalu.zzalV;
    }

    static int zzg(zzalV zzalv)
    {
        return zzalv.zzajT;
    }

    static long zzh(zzajT zzajt)
    {
        return zzajt.zzalW;
    }

    static DataSource zzi(zzalW zzalw)
    {
        return zzalw.zzalX;
    }

    static int zzj(zzalX zzalx)
    {
        return zzalx.zzalY;
    }

    static boolean zzk(zzalY zzaly)
    {
        return zzaly.zzalZ;
    }

    static boolean zzl(zzalZ zzalz)
    {
        return zzalz.zzama;
    }

    static List zzm(zzama zzama1)
    {
        return zzama1.zzamc;
    }

    public zzamc aggregate(DataSource datasource, DataType datatype)
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

    public zzalV aggregate(DataType datatype, DataType datatype1)
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

    public zzalU bucketByActivitySegment(int i, TimeUnit timeunit)
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

    public zzalW bucketByActivitySegment(int i, TimeUnit timeunit, DataSource datasource)
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

    public zzalW bucketByActivityType(int i, TimeUnit timeunit)
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

    public zzalW bucketByActivityType(int i, TimeUnit timeunit, DataSource datasource)
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

    public zzalW bucketBySession(int i, TimeUnit timeunit)
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

    public zzalW bucketByTime(int i, TimeUnit timeunit)
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
        return new DataReadRequest(this, null);
    }

    public zzajT enableServerQueries()
    {
        zzama = true;
        return this;
    }

    public zzama read(DataSource datasource)
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

    public zzalP read(DataType datatype)
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

    public zzajQ setLimit(int i)
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

    public zzalY setTimeRange(long l, long l1, TimeUnit timeunit)
    {
        zzKT = timeunit.toMillis(l);
        zzajH = timeunit.toMillis(l1);
        return this;
    }

    public ()
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
