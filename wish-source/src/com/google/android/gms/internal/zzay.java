// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzh;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzat, zzap, zzax, zzaw, 
//            zzht

public class zzay
{

    private static int zzsp;
    private final Object zzoe;
    final String zzso;
    private final LinkedList zzsq;
    private zzax zzsr;

    public zzay(String s)
    {
        zzoe = new Object();
        zzso = s;
        zzsp = ((Integer)zzat.zzrD.get()).intValue();
        synchronized (zzoe)
        {
            zzsq = new LinkedList();
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private zzax zza(long l)
    {
        return new zzax(l, null, null);
    }

    private static Map zza(String s, StringBuilder stringbuilder)
    {
        LinkedHashMap linkedhashmap = null;
        if (stringbuilder.length() > 0)
        {
            linkedhashmap = new LinkedHashMap();
            if (s != null)
            {
                linkedhashmap.put("action", s);
            }
            stringbuilder.setLength(stringbuilder.length() - 1);
            linkedhashmap.put("it", stringbuilder.toString());
        }
        return linkedhashmap;
    }

    public static transient Map zza(zzay azzay[])
        throws IllegalArgumentException
    {
        String s = null;
        StringBuilder stringbuilder = new StringBuilder(zzsp * 10 * 20);
        int i = 0;
        while (i < azzay.length) 
        {
            Map map = azzay[i].zzcv();
            if (map != null)
            {
                if (i == 0)
                {
                    s = (String)map.get("action");
                    stringbuilder.append((String)map.get("it")).append(",");
                } else
                {
                    if (!map.containsKey("action") && s != null || map.containsKey("action") && !((String)map.get("action")).equals(s))
                    {
                        throw new IllegalArgumentException("Can not merge report items for the tickers with different action names.");
                    }
                    stringbuilder.append((String)map.get("it")).append(",");
                }
            }
            i++;
        }
        return zza(s, stringbuilder);
    }

    private transient boolean zza(zzax zzax1, long l, String as[])
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        int j = as.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        zzax zzax2 = new zzax(l, as[i], zzax1);
        zzsq.add(zzax2);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return true;
        zzax1;
        obj;
        JVM INSTR monitorexit ;
        throw zzax1;
    }

    public transient boolean zza(zzax zzax1, String as[])
    {
        if (!zzh.zzaV().zzch() || zzax1 == null)
        {
            return false;
        } else
        {
            return zza(zzax1, zzh.zzaU().elapsedRealtime(), as);
        }
    }

    public zzax zzct()
    {
        if (!zzh.zzaV().zzch())
        {
            return null;
        } else
        {
            return zza(zzh.zzaU().elapsedRealtime());
        }
    }

    public void zzcu()
    {
        zzsr = zzct();
    }

    Map zzcv()
    {
        Object obj1 = new StringBuilder();
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = zzsq.iterator();
_L2:
        Long long1;
        String s;
        zzax zzax1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_129;
            }
            zzax1 = (zzax)iterator.next();
            long1 = Long.valueOf(zzax1.getTime());
            s = zzax1.zzcr();
            zzax1 = zzax1.zzcs();
        } while (zzax1 == null);
        if (long1.longValue() <= 0L) goto _L2; else goto _L1
_L1:
        long l = long1.longValue();
        long l1 = zzax1.getTime();
        ((StringBuilder) (obj1)).append(s).append('.').append(l - l1).append(',');
          goto _L2
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        zzsq.clear();
        obj;
        JVM INSTR monitorexit ;
        return zza(zzso, ((StringBuilder) (obj1)));
    }

    public String zzcw()
    {
        return zzso;
    }

    public zzax zzcx()
    {
        return zzsr;
    }
}
