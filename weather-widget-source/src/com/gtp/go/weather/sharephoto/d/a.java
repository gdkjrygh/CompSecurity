// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.d;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.lang.ref.SoftReference;
import java.util.HashMap;

public class a
{

    public static HashMap a = new HashMap();

    public static Bitmap a(String s)
    {
        s = (SoftReference)a.get(s);
        if (s != null)
        {
            return (Bitmap)s.get();
        } else
        {
            return null;
        }
    }

    public static void a()
    {
        if (a != null)
        {
            a.clear();
        }
    }

    public static void a(String s, Bitmap bitmap)
    {
        if (!TextUtils.isEmpty(s) && bitmap != null)
        {
            bitmap = new SoftReference(bitmap);
            a.put(s, bitmap);
        }
    }

}
