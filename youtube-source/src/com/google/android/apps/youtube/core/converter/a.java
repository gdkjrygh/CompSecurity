// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.android.apps.youtube.core.a.o;

// Referenced classes of package com.google.android.apps.youtube.core.converter:
//            d

public final class a
    implements d
{

    private static final ThreadLocal a = new ThreadLocal();
    private final float b = 1.625F;
    private int c;
    private int d;

    public a(float f)
    {
    }

    public final Object a_(Object obj)
    {
        obj = (Bitmap)obj;
        if (a.get() == null || c != ((Bitmap) (obj)).getWidth() || d != ((Bitmap) (obj)).getHeight())
        {
            a.set(new o(b, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight()));
            c = ((Bitmap) (obj)).getWidth();
            d = ((Bitmap) (obj)).getHeight();
        }
        Rect rect = ((o)a.get()).a(((Bitmap) (obj)));
        return Bitmap.createBitmap(((Bitmap) (obj)), 0, rect.top, rect.width(), rect.height());
    }

}
