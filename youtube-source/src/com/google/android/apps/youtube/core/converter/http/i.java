// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.FloatMath;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.converter.ConverterException;
import com.google.android.apps.youtube.core.converter.d;

public final class i
    implements d
{

    private final int a;
    private final boolean b;
    private final boolean c;
    private final android.graphics.Bitmap.Config d;

    public i()
    {
        this(false);
    }

    public i(int j, boolean flag, boolean flag1, android.graphics.Bitmap.Config config)
    {
        boolean flag2;
        if (j > 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag2, "desiredWidth must be > 0");
        a = j;
        b = flag;
        c = flag1;
        d = config;
    }

    public i(boolean flag)
    {
        a = 0;
        b = false;
        c = flag;
        d = null;
    }

    private static int a(int j, int k)
    {
        boolean flag = true;
        int l = k;
        k = ((flag) ? 1 : 0);
        do
        {
            l >>= 1;
            if (l >= j)
            {
                k <<= 1;
            } else
            {
                return k;
            }
        } while (true);
    }

    public final Object a_(Object obj)
    {
        obj = (byte[])obj;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options);
        if (options.outWidth < 0)
        {
            obj = null;
        } else
        {
            int j;
            if (a == 0)
            {
                j = 1;
            } else
            {
                j = a(a, options.outWidth);
            }
            if (!b && !c && j == 1 && d == null)
            {
                obj = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, null);
            } else
            {
                options.inSampleSize = j;
                options.inJustDecodeBounds = false;
                options.inPreferredConfig = d;
                options.inPurgeable = c;
                options.inInputShareable = false;
                Bitmap bitmap = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options);
                obj = bitmap;
                if (b)
                {
                    obj = bitmap;
                    if (bitmap != null)
                    {
                        float f = options.outWidth;
                        int k = (int)FloatMath.ceil(((float)options.outHeight - f * 0.5625F) / 2.0F);
                        obj = bitmap;
                        if (k > 0)
                        {
                            int l = options.outHeight - k * 2;
                            obj = bitmap;
                            if (l > 0)
                            {
                                obj = Bitmap.createBitmap(bitmap, 0, k, options.outWidth, l);
                                bitmap.recycle();
                            }
                        }
                    }
                }
            }
        }
        if (obj == null)
        {
            throw new ConverterException("failed to decode bitmap");
        } else
        {
            return obj;
        }
    }
}
