// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.whatsapp.camera:
//            u, CameraActivity

public class AutofocusOverlay extends View
{

    private Paint a;
    private Runnable b;
    private Boolean c;
    private RectF d;

    public AutofocusOverlay(Context context)
    {
        super(context);
        a = new Paint(1);
        b = new u(this);
    }

    public AutofocusOverlay(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Paint(1);
        b = new u(this);
    }

    public AutofocusOverlay(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new Paint(1);
        b = new u(this);
    }

    public void a(float f, float f1)
    {
        float f2 = getContext().getResources().getDimension(0x7f0a0012);
        d = new RectF(f - f2 / 2.0F, f1 - f2 / 2.0F, f2 / 2.0F + f, f2 / 2.0F + f1);
        c = null;
        setVisibility(0);
        invalidate();
        removeCallbacks(b);
    }

    public void a(boolean flag)
    {
        c = Boolean.valueOf(flag);
        invalidate();
        postDelayed(b, 1000L);
    }

    public void onDraw(Canvas canvas)
    {
label0:
        {
            int i = CameraActivity.n;
            a.setStrokeWidth(getContext().getResources().getDimension(0x7f0a0013));
            a.setStyle(android.graphics.Paint.Style.STROKE);
            if (c == null)
            {
                a.setColor(-1);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (c == Boolean.TRUE)
            {
                a.setColor(0xff00ff00);
                if (i == 0)
                {
                    break label0;
                }
            }
            a.setColor(0xffff0000);
        }
        canvas.drawRect(d, a);
    }
}
