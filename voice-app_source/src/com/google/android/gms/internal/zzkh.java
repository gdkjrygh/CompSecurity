// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public final class zzkh
{

    public static Bitmap zza(Bitmap bitmap)
    {
        int k = 0;
        if (bitmap == null)
        {
            return null;
        }
        int l = bitmap.getWidth();
        int i = bitmap.getHeight();
        Bitmap bitmap1;
        Canvas canvas;
        Paint paint;
        int j;
        if (l >= i)
        {
            k = l / 2 - i / 2;
            j = 0;
        } else
        {
            j = i / 2 - l / 2;
            i = l;
        }
        bitmap1 = Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap1);
        paint = new Paint(1);
        paint.setColor(0xff000000);
        canvas.drawCircle(i / 2, i / 2, i / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, k, j, paint);
        return bitmap1;
    }

    private static Bitmap zza(Drawable drawable)
    {
        if (drawable == null)
        {
            return null;
        }
        if (drawable instanceof BitmapDrawable)
        {
            return ((BitmapDrawable)drawable).getBitmap();
        } else
        {
            Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmap;
        }
    }

    public static Drawable zza(Resources resources, Drawable drawable)
    {
        return new BitmapDrawable(resources, zza(zza(drawable)));
    }
}
