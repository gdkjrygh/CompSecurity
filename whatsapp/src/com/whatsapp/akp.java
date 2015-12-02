// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

// Referenced classes of package com.whatsapp:
//            App

class akp extends LruCache
{

    final App b;

    akp(App app, int i)
    {
        b = app;
        super(i);
    }

    protected int a(String s, Bitmap bitmap)
    {
        if (android.os.Build.VERSION.SDK_INT < 12)
        {
            return (bitmap.getRowBytes() * bitmap.getHeight()) / 1024;
        } else
        {
            return bitmap.getByteCount() / 1024;
        }
    }

    protected int sizeOf(Object obj, Object obj1)
    {
        return a((String)obj, (Bitmap)obj1);
    }
}
