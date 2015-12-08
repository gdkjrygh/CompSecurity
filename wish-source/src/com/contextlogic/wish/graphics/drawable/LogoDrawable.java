// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;

public class LogoDrawable extends BitmapDrawable
{

    private String badgeText;
    private Resources resources;

    public LogoDrawable(Resources resources1, Bitmap bitmap)
    {
        super(resources1, bitmap);
        resources = resources1;
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (badgeText != null)
        {
            Paint paint = new Paint();
            paint.setColor(resources.getColor(0x7f0c00be));
            paint.setAntiAlias(true);
            paint.setTextAlign(android.graphics.Paint.Align.CENTER);
            int i = getIntrinsicWidth();
            int j = i / 8;
            paint.setTextSize((int)((double)i * 0.40000000000000002D));
            Object obj = new Rect();
            paint.getTextBounds(badgeText, 0, badgeText.length(), ((Rect) (obj)));
            obj = new RectF(i - ((Rect) (obj)).width() - j * 2, 0.0F, i, ((Rect) (obj)).height() + j * 2);
            canvas.drawRoundRect(((RectF) (obj)), 5F, 5F, paint);
            paint.setColor(-1);
            canvas.drawText(badgeText, ((RectF) (obj)).left + ((RectF) (obj)).width() / 2.0F, ((RectF) (obj)).bottom - (float)j, paint);
        }
    }

    public String getBadgeText()
    {
        return badgeText;
    }

    public void setBadgeText(String s)
    {
        badgeText = s;
    }
}
