// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.qrcode;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.DialogToastActivity;

// Referenced classes of package com.whatsapp.qrcode:
//            n, QrCodeActivity

public class QrCodeOverlay extends View
{

    private n a;
    private Paint b;
    float c;
    float d;

    public QrCodeOverlay(Context context)
    {
        super(context);
        b = new Paint(1);
        c = 0.0F;
        d = 0.01F;
    }

    public QrCodeOverlay(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new Paint(1);
        c = 0.0F;
        d = 0.01F;
    }

    public QrCodeOverlay(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new Paint(1);
        c = 0.0F;
        d = 0.01F;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a = new n(this, null);
        a.setDuration(2000L);
        a.setRepeatCount(-1);
        a.setRepeatMode(2);
        startAnimation(a);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    public void onDraw(Canvas canvas)
    {
        int i = QrCodeActivity.m;
        int i1 = getWidth();
        int j1 = getHeight();
        int k1 = (Math.min(i1, j1) * 3) / 4;
        int j = (i1 - k1) / 2;
        int l1 = (j1 - k1) / 2;
        int k = j + k1;
        int l = l1 + k1;
        b.setARGB(125, 50, 50, 50);
        b.setStyle(android.graphics.Paint.Style.FILL);
        canvas.drawRect(0.0F, 0.0F, i1, l1, b);
        canvas.drawRect(0.0F, l1, j, l, b);
        canvas.drawRect(k, l1, i1, l, b);
        canvas.drawRect(0.0F, l, i1, j1, b);
        float f = getContext().getResources().getDimension(0x7f0a0013);
        b.setStrokeWidth(f);
        b.setStyle(android.graphics.Paint.Style.STROKE);
        b.setColor(0x33ffffff);
        canvas.drawRect(j, l1, k, l, b);
        canvas.drawLine((j + k) / 2, l1 - k1 / 12, (j + k) / 2, k1 / 12 + l1, b);
        canvas.drawLine((j + k) / 2, l - k1 / 12, (j + k) / 2, k1 / 12 + l, b);
        canvas.drawLine(j - k1 / 12, (l1 + l) / 2, k1 / 12 + j, (l1 + l) / 2, b);
        canvas.drawLine(k - k1 / 12, (l1 + l) / 2, k1 / 12 + k, (l1 + l) / 2, b);
        b.setStyle(android.graphics.Paint.Style.STROKE);
        b.setColor(0x8000ff00);
        b.setStrokeWidth(2.0F * f);
        i1 = (int)((float)l1 + 2.0F * f);
        l = (int)((float)l - 2.0F * f);
        if (c > 1.0F || c < 0.0F)
        {
            d = -d;
        }
        c = c + d;
        canvas.drawLine(j, (float)i1 + (float)(l - i1) * c, k, (float)i1 + (float)(l - i1) * c, b);
        if (i != 0)
        {
            DialogToastActivity.g++;
        }
    }

    protected void onVisibilityChanged(View view, int i)
    {
label0:
        {
            if (getVisibility() == 0)
            {
                if (getAnimation() != null || a == null)
                {
                    break label0;
                }
                startAnimation(a);
                if (QrCodeActivity.m == 0)
                {
                    break label0;
                }
            }
            clearAnimation();
        }
    }
}
