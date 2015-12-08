// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.imageload;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.jiubang.playsdk.imageload:
//            p

class q extends LruCache
{

    final p a;

    q(p p1, int i)
    {
        a = p1;
        super(i);
    }

    protected int a(String s, Bitmap bitmap)
    {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    protected void a(boolean flag, String s, Bitmap bitmap, Bitmap bitmap1)
    {
        if (flag)
        {
            p.a(a).put(s, new SoftReference(bitmap));
        }
    }

    protected void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
        a(flag, (String)obj, (Bitmap)obj1, (Bitmap)obj2);
    }

    protected int sizeOf(Object obj, Object obj1)
    {
        return a((String)obj, (Bitmap)obj1);
    }
}
