// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzy, zzab, zzr, 
//            zze, zzf, zzai

public class zzaf extends zzd
{

    private static String zzMl = "3";
    private static String zzMm = "01VDIWEA?";
    private static zzaf zzMn;

    public zzaf(zzf zzf1)
    {
        super(zzf1);
    }

    public static zzaf zzkc()
    {
        return zzMn;
    }

    public void zza(int i, String s, Object obj, Object obj1, Object obj2)
    {
        String s1 = (String)zzy.zzLb.get();
        if (Log.isLoggable(s1, i))
        {
            Log.println(i, s1, zzc(s, obj, obj1, obj2));
        }
        if (i >= 5)
        {
            zzb(i, s, obj, obj1, obj2);
        }
    }

    public void zza(zzab zzab1, String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "no reason provided";
        }
        if (zzab1 != null)
        {
            zzab1 = zzab1.toString();
        } else
        {
            zzab1 = "no hit data";
        }
        zzd((new StringBuilder()).append("Discarding hit. ").append(s1).toString(), zzab1);
    }

    public void zzb(int i, String s, Object obj, Object obj1, Object obj2)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        zzu.zzu(s);
        if (i < 0)
        {
            i = ((flag) ? 1 : 0);
        }
        if (i >= zzMm.length())
        {
            i = zzMm.length() - 1;
        }
        if (!zzhR().zziX()) goto _L2; else goto _L1
_L1:
        char c;
        if (zzhR().zziW())
        {
            c = 'P';
        } else
        {
            c = 'C';
        }
_L4:
        obj = (new StringBuilder()).append(zzMl).append(zzMm.charAt(i)).append(c).append(zze.VERSION).append(":").append(zzc(s, zzk(obj), zzk(obj1), zzk(obj2))).toString();
        s = ((String) (obj));
        if (((String) (obj)).length() > 1024)
        {
            s = ((String) (obj)).substring(0, 1024);
        }
        obj = zzhM().zzif();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        ((zzai) (obj)).zzkp().zzbg(s);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        boolean flag1 = zzhR().zziW();
        if (flag1)
        {
            c = 'p';
        } else
        {
            c = 'c';
        }
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public void zzg(Map map, String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "no reason provided";
        }
        if (map != null)
        {
            s = new StringBuilder();
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); s.append((String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
                if (s.length() > 0)
                {
                    s.append(',');
                }
                s.append((String)entry.getKey());
                s.append('=');
            }

            map = s.toString();
        } else
        {
            map = "no hit data";
        }
        zzd((new StringBuilder()).append("Discarding hit. ").append(s1).toString(), map);
    }

    protected void zzhn()
    {
        com/google/android/gms/analytics/internal/zzaf;
        JVM INSTR monitorenter ;
        zzMn = this;
        com/google/android/gms/analytics/internal/zzaf;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        com/google/android/gms/analytics/internal/zzaf;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected String zzk(Object obj)
    {
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof Integer)
        {
            obj = new Long(((Integer)obj).intValue());
        }
        if (obj instanceof Long)
        {
            if (Math.abs(((Long)obj).longValue()) < 100L)
            {
                return String.valueOf(obj);
            }
            String s;
            StringBuilder stringbuilder;
            if (String.valueOf(obj).charAt(0) == '-')
            {
                s = "-";
            } else
            {
                s = "";
            }
            obj = String.valueOf(Math.abs(((Long)obj).longValue()));
            stringbuilder = new StringBuilder();
            stringbuilder.append(s);
            stringbuilder.append(Math.round(Math.pow(10D, ((String) (obj)).length() - 1)));
            stringbuilder.append("...");
            stringbuilder.append(s);
            stringbuilder.append(Math.round(Math.pow(10D, ((String) (obj)).length()) - 1.0D));
            return stringbuilder.toString();
        }
        if (obj instanceof Boolean)
        {
            return String.valueOf(obj);
        }
        if (obj instanceof Throwable)
        {
            return obj.getClass().getCanonicalName();
        } else
        {
            return "-";
        }
    }

}
