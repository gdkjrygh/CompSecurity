// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataDeleteRequest

public static class zzalS
{

    private long zzKT;
    private long zzajH;
    private List zzajQ;
    private List zzalP;
    private List zzalQ;
    private boolean zzalR;
    private boolean zzalS;

    static long zza(zzalS zzals)
    {
        return zzals.zzKT;
    }

    static long zzb(zzKT zzkt)
    {
        return zzkt.zzajH;
    }

    static List zzc(zzajH zzajh)
    {
        return zzajh.zzalP;
    }

    static List zzd(zzalP zzalp)
    {
        return zzalp.zzajQ;
    }

    static List zze(zzajQ zzajq)
    {
        return zzajq.zzalQ;
    }

    static boolean zzf(zzalQ zzalq)
    {
        return zzalq.zzalR;
    }

    static boolean zzg(zzalR zzalr)
    {
        return zzalr.zzalS;
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

    public zzajH addDataSource(DataSource datasource)
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

    public zzalP addDataType(DataType datatype)
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

    public zzajQ addSession(Session session)
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
        return new DataDeleteRequest(this, null);
    }

    public zzqX deleteAllData()
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

    public zzalR deleteAllSessions()
    {
        zzu.zzb(zzalQ.isEmpty(), "Specific sessions already added for deletion: %s", new Object[] {
            zzalQ
        });
        zzalS = true;
        return this;
    }

    public zzalS setTimeInterval(long l, long l1, TimeUnit timeunit)
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

    public ()
    {
        zzalP = new ArrayList();
        zzajQ = new ArrayList();
        zzalQ = new ArrayList();
        zzalR = false;
        zzalS = false;
    }
}
