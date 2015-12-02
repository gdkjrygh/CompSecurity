// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.whatsapp.camera:
//            b

public class ShutterOverlay extends View
{

    private boolean a;
    private Paint b;

    public ShutterOverlay(Context context)
    {
        super(context);
        b = new Paint(1);
    }

    public ShutterOverlay(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new Paint(1);
    }

    public ShutterOverlay(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new Paint(1);
    }

    static boolean a(ShutterOverlay shutteroverlay, boolean flag)
    {
        shutteroverlay.a = flag;
        return flag;
    }

    public void onDraw(Canvas canvas)
    {
        if (a)
        {
            b.setStrokeWidth(getContext().getResources().getDimension(0x7f0a0013) * 8F);
            b.setStyle(android.graphics.Paint.Style.STROKE);
            b.setColor(-1);
            canvas.drawRect(0.0F, 0.0F, getWidth(), getHeight(), b);
        }
    }

    public void setOn()
    {
        a = true;
        invalidate();
        postDelayed(new b(this), 50L);
    }
}
