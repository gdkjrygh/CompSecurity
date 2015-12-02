// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

public class bq extends InsetDrawable
{

    public bq(Drawable drawable)
    {
        super(drawable, 0);
    }

    public void draw(Canvas canvas)
    {
        canvas.save();
        canvas.scale(-1F, 1.0F, getBounds().exactCenterX(), 0.0F);
        super.draw(canvas);
        canvas.restore();
    }
}
