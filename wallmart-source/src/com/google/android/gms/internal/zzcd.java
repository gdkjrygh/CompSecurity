// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzcc, zzlm

public class zzcd
{

    private final Object zzpc = new Object();
    boolean zzvf;
    private final List zzvr = new LinkedList();
    private final Map zzvs = new LinkedHashMap();
    private String zzvt;
    private zzcc zzvu;

    public zzcd(boolean flag, String s, String s1)
    {
        zzvf = flag;
        zzvs.put("action", s);
        zzvs.put("ad_format", s1);
    }

    private transient boolean zza(zzcc zzcc1, long l, String as[])
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        int j = as.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        zzcc zzcc2 = new zzcc(l, as[i], zzcc1);
        zzvr.add(zzcc2);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return true;
        zzcc1;
        obj;
        JVM INSTR monitorexit ;
        throw zzcc1;
    }

    public void zzR(String s)
    {
        if (!zzvf)
        {
            return;
        }
        synchronized (zzpc)
        {
            zzvt = s;
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public transient boolean zza(zzcc zzcc1, String as[])
    {
        if (!zzvf || zzcc1 == null)
        {
            return false;
        } else
        {
            return zza(zzcc1, zzp.zzbB().elapsedRealtime(), as);
        }
    }

    public zzcc zzb(long l)
    {
        if (!zzvf)
        {
            return null;
        } else
        {
            return new zzcc(l, null, null);
        }
    }

    public void zzd(String s, String s1)
    {
        if (!zzvf)
        {
            return;
        }
        synchronized (zzpc)
        {
            zzvs.put(s, s1);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public zzcc zzdl()
    {
        return zzb(zzp.zzbB().elapsedRealtime());
    }

    public void zzdm()
    {
        synchronized (zzpc)
        {
            zzvu = zzdl();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String zzdn()
    {
        Object obj1 = new StringBuilder();
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = zzvr.iterator();
_L2:
        String s;
        zzcc zzcc1;
        long l;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_118;
            }
            zzcc1 = (zzcc)iterator.next();
            l = zzcc1.getTime();
            s = zzcc1.zzdj();
            zzcc1 = zzcc1.zzdk();
        } while (zzcc1 == null || l <= 0L);
        long l1 = zzcc1.getTime();
        ((StringBuilder) (obj1)).append(s).append('.').append(l - l1).append(',');
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        zzvr.clear();
        if (TextUtils.isEmpty(zzvt)) goto _L4; else goto _L3
_L3:
        ((StringBuilder) (obj1)).append(zzvt);
_L6:
        obj1 = ((StringBuilder) (obj1)).toString();
        obj;
        JVM INSTR monitorexit ;
        return ((String) (obj1));
_L4:
        if (((StringBuilder) (obj1)).length() <= 0) goto _L6; else goto _L5
_L5:
        ((StringBuilder) (obj1)).setLength(((StringBuilder) (obj1)).length() - 1);
          goto _L6
    }

    public zzcc zzdo()
    {
        zzcc zzcc1;
        synchronized (zzpc)
        {
            zzcc1 = zzvu;
        }
        return zzcc1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    Map zzn()
    {
        Map map;
        synchronized (zzpc)
        {
            map = zzvs;
        }
        return map;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
