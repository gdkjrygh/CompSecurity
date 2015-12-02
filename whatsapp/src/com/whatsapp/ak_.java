// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;

// Referenced classes of package com.whatsapp:
//            Conversation, a1g

class ak_ extends BitmapDrawable
{

    final Conversation a;
    private Paint b;

    public ak_(Conversation conversation, Resources resources, Bitmap bitmap)
    {
        a = conversation;
        super(resources, bitmap);
    }

    public void draw(Canvas canvas)
    {
        if (b == null)
        {
            b = new Paint();
            b.setAntiAlias(true);
            b.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            b.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            b.setStrokeWidth(1.0F * Conversation.S(a).g);
        }
        super.draw(canvas);
        float f = a.getResources().getDimension(0x7f0a0058);
        RectF rectf = new RectF(getBounds());
        b.setStyle(android.graphics.Paint.Style.STROKE);
        b.setColor(0x59000000);
        canvas.drawRoundRect(rectf, f, f, b);
    }
}
