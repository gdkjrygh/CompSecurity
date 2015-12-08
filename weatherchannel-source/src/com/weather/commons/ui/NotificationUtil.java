// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

public final class NotificationUtil
{

    private NotificationUtil()
    {
    }

    public static Bitmap addSeverityBackground(Context context, Bitmap bitmap, int i, int j)
    {
        context = context.getResources();
        int k = context.getDimensionPixelOffset(com.weather.commons.R.dimen.notifications_icon_padding);
        int i1 = Math.max(context.getDimensionPixelOffset(0x1050005), context.getDimensionPixelOffset(0x1050006));
        int l = i1 - k * 2;
        k = i1 - k * 2;
        Bitmap bitmap1;
        Canvas canvas;
        if (k < l)
        {
            l = (bitmap.getWidth() * k) / bitmap.getHeight();
        } else
        {
            k = (bitmap.getHeight() * l) / bitmap.getWidth();
        }
        bitmap1 = Bitmap.createBitmap(i1, i1, bitmap.getConfig());
        canvas = new Canvas(bitmap1);
        if (i == 0)
        {
            i = j;
        } else
        if (i == 1)
        {
            i = context.getColor(com.weather.commons.R.color.severe_ticker_red);
        } else
        {
            i = context.getColor(com.weather.commons.R.color.severe_ticker_orange);
        }
        canvas.drawColor(i);
        i = (i1 - l) / 2;
        j = (i1 - k) / 2;
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(i, j, i1 - i, i1 - j), null);
        return bitmap1;
    }
}
