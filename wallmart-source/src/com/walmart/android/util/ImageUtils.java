// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;

public class ImageUtils
{

    public ImageUtils()
    {
    }

    public static Bitmap createPriceFlag(String s, int i, int j)
    {
        Paint paint = new Paint();
        paint.setTextSize(j);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        paint.setColor(i);
        paint.setTextAlign(android.graphics.Paint.Align.LEFT);
        paint.setAntiAlias(true);
        Object obj = new Rect();
        paint.getTextBounds(s, 0, s.length(), ((Rect) (obj)));
        obj = Bitmap.createBitmap(((Rect) (obj)).width() + 0, ((Rect) (obj)).height() + 10, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(((Bitmap) (obj)));
        canvas.drawText(s, 0.0F, ((Bitmap) (obj)).getHeight() - 5, paint);
        for (i = 0; i < ((Bitmap) (obj)).getWidth(); i += 4)
        {
            canvas.drawLine(i, 0.0F, i + 3, 0.0F, paint);
            canvas.drawLine(i, 1.0F, i + 3, 1.0F, paint);
            canvas.drawLine(i, ((Bitmap) (obj)).getHeight(), i + 3, ((Bitmap) (obj)).getHeight(), paint);
            canvas.drawLine(i, ((Bitmap) (obj)).getHeight() - 1, i + 3, ((Bitmap) (obj)).getHeight() - 1, paint);
        }

        return ((Bitmap) (obj));
    }
}
