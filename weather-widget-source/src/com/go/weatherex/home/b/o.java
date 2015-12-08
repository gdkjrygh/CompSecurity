// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.b;

import android.graphics.Bitmap;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.go.weatherex.home.b:
//            m, n

class o extends m
{

    final n a;

    o(n n1, int i)
    {
        a = n1;
        super(i);
    }

    protected int a(String s, Bitmap bitmap)
    {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    protected volatile void a(boolean flag, Object obj, Object obj1, Object obj2)
    {
        a(flag, (String)obj, (Bitmap)obj1, (Bitmap)obj2);
    }

    protected void a(boolean flag, String s, Bitmap bitmap, Bitmap bitmap1)
    {
        if (flag)
        {
            n.a(a).put(s, new SoftReference(bitmap));
        }
    }

    protected int b(Object obj, Object obj1)
    {
        return a((String)obj, (Bitmap)obj1);
    }
}
