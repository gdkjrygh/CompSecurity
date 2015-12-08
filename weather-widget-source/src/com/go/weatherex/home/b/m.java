// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.b;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class m
{

    private final LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public m(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        } else
        {
            c = i;
            a = new LinkedHashMap(0, 0.75F, true);
            return;
        }
    }

    private void a(int i)
    {
_L2:
        this;
        JVM INSTR monitorenter ;
        if (b < 0 || a.isEmpty() && b != 0)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getName()).append(".sizeOf() is reporting inconsistent results!").toString());
        }
        break MISSING_BLOCK_LABEL_64;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (b > i && !a.isEmpty())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        Object obj1;
        obj1 = (java.util.Map.Entry)a.entrySet().iterator().next();
        obj = ((java.util.Map.Entry) (obj1)).getKey();
        obj1 = ((java.util.Map.Entry) (obj1)).getValue();
        a.remove(obj);
        b = b - c(obj, obj1);
        e = e + 1;
        this;
        JVM INSTR monitorexit ;
        a(true, obj, obj1, null);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private int c(Object obj, Object obj1)
    {
        int i = b(obj, obj1);
        if (i < 0)
        {
            throw new IllegalStateException((new StringBuilder()).append("Negative size: ").append(obj).append("=").append(obj1).toString());
        } else
        {
            return i;
        }
    }

    public final Object a(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("key == null");
        }
        this;
        JVM INSTR monitorenter ;
        Object obj1 = a.remove(obj);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        b = b - c(obj, obj1);
        this;
        JVM INSTR monitorexit ;
        if (obj1 != null)
        {
            a(false, obj, obj1, null);
        }
        return obj1;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final Object a(Object obj, Object obj1)
    {
        if (obj == null || obj1 == null)
        {
            throw new NullPointerException("key == null || value == null");
        }
        this;
        JVM INSTR monitorenter ;
        Object obj2;
        d = d + 1;
        b = b + c(obj, obj1);
        obj2 = a.put(obj, obj1);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        b = b - c(obj, obj2);
        this;
        JVM INSTR monitorexit ;
        if (obj2 != null)
        {
            a(false, obj, obj2, obj1);
        }
        a(c);
        return obj2;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    protected void a(boolean flag, Object obj, Object obj1, Object obj2)
    {
    }

    protected int b(Object obj, Object obj1)
    {
        return 1;
    }

    public final String toString()
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        int j = f + g;
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        i = (f * 100) / j;
        String s = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] {
            Integer.valueOf(c), Integer.valueOf(f), Integer.valueOf(g), Integer.valueOf(i)
        });
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
