// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

// Referenced classes of package com.whatsapp:
//            ThumbnailTextButton, a1g, App

public class MediaGalleryImageView extends ThumbnailTextButton
{

    private static Paint v;
    private static Paint w;
    private static Paint x;
    private final Rect u = new Rect();
    protected boolean y;

    public MediaGalleryImageView(Context context)
    {
        super(context);
        y = true;
        if (w == null)
        {
            w = new Paint();
            w.setColor(0x660099cc);
            w.setStyle(android.graphics.Paint.Style.FILL);
            w.setAntiAlias(true);
        }
        if (v == null)
        {
            context = a1g.a();
            v = new Paint();
            v.setColor(0xff00cbde);
            v.setStrokeWidth(((a1g) (context)).p * 3);
            v.setStyle(android.graphics.Paint.Style.STROKE);
            v.setAntiAlias(true);
        }
        if (x == null)
        {
            context = a1g.a();
            x = new Paint();
            x.setColor(0x7d000000);
            x.setStrokeWidth(((a1g) (context)).p);
            x.setStyle(android.graphics.Paint.Style.STROKE);
            x.setAntiAlias(true);
        }
    }

    public void c(Canvas canvas)
    {
label0:
        {
            getDrawingRect(u);
            if (isPressed() || isSelected())
            {
                if (y)
                {
                    canvas.drawRect(u, w);
                }
                canvas.drawRect(u, v);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            canvas.drawRect(u, x);
        }
    }
}
