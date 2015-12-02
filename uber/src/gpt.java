// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.support.v4.util.ArrayMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class gpt
{

    private final cyg a;
    private final Map b = new ArrayMap();
    private final gps c;

    public gpt(Application application, gps gps1)
    {
        a = new cyg(application);
        c = gps1;
    }

    private void a(gpr gpr1)
    {
        ArrayMap arraymap = new ArrayMap(2);
        ArrayMap arraymap1 = new ArrayMap(3);
        arraymap.put("title", "performanceMetric");
        arraymap.put("message", arraymap1);
        arraymap1.put("name", gpr1.c().name().toLowerCase());
        arraymap1.put("data", gpr1.e());
        arraymap1.put("yearClass", Integer.valueOf(a.a()));
        c.a(arraymap);
    }

    private gpr b(gpu gpu1, String s)
    {
        gpu1 = (Map)b.get(gpu1);
        if (gpu1 == null)
        {
            return null;
        } else
        {
            return (gpr)gpu1.get(s);
        }
    }

    private gpr c(gpu gpu1, String s)
    {
        Map map = (Map)b.get(gpu1);
        if (map == null)
        {
            s = null;
        } else
        {
            gpr gpr1 = (gpr)map.remove(s);
            s = gpr1;
            if (map.isEmpty())
            {
                b.remove(gpu1);
                return gpr1;
            }
        }
        return s;
    }

    private List c(gpu gpu1)
    {
        if ((Map)b.get(gpu1) == null)
        {
            return Collections.emptyList();
        } else
        {
            return gkk.a(((Map)b.remove(gpu1)).values());
        }
    }

    public final String a(gpv gpv1, gpu gpu1)
    {
        this;
        JVM INSTR monitorenter ;
        Map map;
        gpr gpr1;
        gpr1 = new gpr(gpu1, gpv1.a());
        gpr1.a();
        map = (Map)b.get(gpu1);
        gpv1 = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        gpv1 = new ArrayMap();
        b.put(gpu1, gpv1);
        gpv1.put(gpr1.d(), gpr1);
        gpv1 = gpr1.d();
        this;
        JVM INSTR monitorexit ;
        return gpv1;
        gpv1;
        throw gpv1;
    }

    public final void a(gpu gpu1)
    {
        this;
        JVM INSTR monitorenter ;
        c(gpu1);
        this;
        JVM INSTR monitorexit ;
        return;
        gpu1;
        throw gpu1;
    }

    public final void a(gpu gpu1, String s)
    {
        this;
        JVM INSTR monitorenter ;
        gpu1 = c(gpu1, s);
        if (gpu1 == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        gpu1.b();
        a(((gpr) (gpu1)));
        this;
        JVM INSTR monitorexit ;
        return;
        gpu1;
        throw gpu1;
    }

    public final void a(gpu gpu1, String s, String s1, Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        gpu1 = b(gpu1, s);
        if (gpu1 == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        gpu1.a(s1, obj);
        this;
        JVM INSTR monitorexit ;
        return;
        gpu1;
        throw gpu1;
    }

    public final void b(gpu gpu1)
    {
        this;
        JVM INSTR monitorenter ;
        gpr gpr1;
        for (gpu1 = c(gpu1).iterator(); gpu1.hasNext(); a(gpr1))
        {
            gpr1 = (gpr)gpu1.next();
            gpr1.b();
        }

        break MISSING_BLOCK_LABEL_49;
        gpu1;
        throw gpu1;
        this;
        JVM INSTR monitorexit ;
    }
}
