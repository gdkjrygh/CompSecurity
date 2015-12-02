// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;

// Referenced classes of package com.whatsapp:
//            ThumbnailButton, a1g

public class ThumbnailPickerButton extends ThumbnailButton
{

    private Path k;

    public ThumbnailPickerButton(Context context)
    {
        super(context);
        k = new Path();
    }

    public ThumbnailPickerButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        k = new Path();
    }

    public ThumbnailPickerButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        k = new Path();
    }

    protected void b(Canvas canvas)
    {
        super.b(canvas);
        if (isEnabled() && i > 0.0F)
        {
            float f = 7F * i;
            k.reset();
            this.f.setStyle(android.graphics.Paint.Style.FILL);
            k.moveTo(e.right, e.bottom - f);
            k.lineTo(e.right, e.bottom - i);
            k.arcTo(new RectF(e.right - i * 2.0F, e.bottom - i * 2.0F, e.right, e.bottom), 0.0F, 90F);
            k.lineTo(e.right - f, e.bottom);
            k.lineTo(e.right, e.bottom - f);
            this.f.setColor(0x54000000);
            canvas.drawPath(k, this.f);
            k.reset();
            k.moveTo(e.right, e.bottom - f);
            k.lineTo(e.right - f, e.bottom);
            this.f.setStyle(android.graphics.Paint.Style.STROKE);
            this.f.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            this.f.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            this.f.setStrokeWidth(1.0F * a1g.a().g);
            this.f.setColor(0xddffffff);
            canvas.drawPath(k, this.f);
        }
    }
}
