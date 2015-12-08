// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.imageload;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.jiubang.playsdk.imageload:
//            q

public class p
{

    private static volatile p b;
    private LruCache a;
    private ConcurrentHashMap c;

    private p(int i)
    {
        a = null;
        c = new ConcurrentHashMap();
        a = new q(this, i);
    }

    public static p a()
    {
        int i = 0x500000;
        if (b != null) goto _L2; else goto _L1
_L1:
        com/jiubang/playsdk/imageload/p;
        JVM INSTR monitorenter ;
        int j;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        j = (int)Runtime.getRuntime().maxMemory() / 8;
        Exception exception;
        if (j <= 0x500000)
        {
            i = j;
        }
        b = new p(i);
        com/jiubang/playsdk/imageload/p;
        JVM INSTR monitorexit ;
_L2:
        return b;
        exception;
        com/jiubang/playsdk/imageload/p;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static ConcurrentHashMap a(p p1)
    {
        return p1.c;
    }

    public Bitmap a(String s)
    {
        Bitmap bitmap;
        if (s == null)
        {
            bitmap = null;
        } else
        {
            Bitmap bitmap1 = (Bitmap)a.get(s);
            bitmap = bitmap1;
            if (bitmap1 == null)
            {
                s = (SoftReference)c.get(s);
                bitmap = bitmap1;
                if (s != null)
                {
                    return (Bitmap)s.get();
                }
            }
        }
        return bitmap;
    }

    public void a(String s, Bitmap bitmap)
    {
        while (s == null || bitmap == null || a == null) 
        {
            return;
        }
        a.put(s, bitmap);
    }

    public void b()
    {
        a.evictAll();
        c.clear();
    }
}
