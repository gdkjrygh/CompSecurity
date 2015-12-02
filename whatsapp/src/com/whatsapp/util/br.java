// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import com.whatsapp.protocol.a;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.HashSet;

// Referenced classes of package com.whatsapp.util:
//            cl, y

class br extends LruCache
{

    final y b;

    br(y y1, int i)
    {
        b = y1;
        super(i);
    }

    protected int a(a a1, Bitmap bitmap)
    {
        return com.whatsapp.util.cl.a(bitmap) / 1024;
    }

    protected void a(boolean flag, a a1, Bitmap bitmap, Bitmap bitmap1)
    {
        if (flag)
        {
            com.whatsapp.util.y.a(b).put(a1, new SoftReference(bitmap));
            y.d(b).remove(a1);
        }
    }

    protected void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
        a(flag, (a)obj, (Bitmap)obj1, (Bitmap)obj2);
    }

    protected int sizeOf(Object obj, Object obj1)
    {
        return a((a)obj, (Bitmap)obj1);
    }
}
