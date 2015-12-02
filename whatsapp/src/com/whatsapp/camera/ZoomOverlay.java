// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.DialogToastActivity;

// Referenced classes of package com.whatsapp.camera:
//            a, CameraActivity

public class ZoomOverlay extends View
{

    private static final String z[];
    private Paint a;
    private float b;
    private TextPaint c;
    private float d;
    private Runnable e;
    private RectF f;

    public ZoomOverlay(Context context)
    {
        super(context);
        f = new RectF();
        a = new Paint(1);
        c = new TextPaint(1);
        e = new a(this);
    }

    public ZoomOverlay(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = new RectF();
        a = new Paint(1);
        c = new TextPaint(1);
        e = new a(this);
    }

    public ZoomOverlay(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        f = new RectF();
        a = new Paint(1);
        c = new TextPaint(1);
        e = new a(this);
    }

    public float a()
    {
        return ((float)Math.min(getWidth() / 2, getHeight() / 2) * 0.9F) / c.measureText(z[2]);
    }

    public void a(float f1)
    {
        setVisibility(0);
        d = f1;
        invalidate();
        removeCallbacks(e);
    }

    public void a(float f1, float f2)
    {
        d = f1;
        b = f2;
        invalidate();
    }

    public void b()
    {
        invalidate();
        postDelayed(e, 300L);
    }

    public void onDraw(Canvas canvas)
    {
        int i = CameraActivity.n;
        a.setStrokeWidth(getContext().getResources().getDimension(0x7f0a0013));
        a.setStyle(android.graphics.Paint.Style.STROKE);
        a.setColor(0x99ffffff);
        int j = getWidth() / 2;
        int k = getHeight() / 2;
        float f1 = (float)Math.min(j, k) * 0.9F;
        f.set((float)j - f1, (float)k - f1, (float)j + f1, (float)k + f1);
        canvas.drawOval(f, a);
        float f2 = getResources().getDimension(0x7f0a0005);
        c.setTextSize(f2);
        c.setColor(0x99ffffff);
        c.setTextAlign(android.graphics.Paint.Align.CENTER);
        c.setFakeBoldText(true);
        String s = (new StringBuilder()).append("x").append(String.format(z[1], new Object[] {
            Float.valueOf(b)
        })).toString();
        float f3 = j;
        float f4 = k;
        canvas.drawText(s, f3, f2 / 2.0F + f4, c);
        f2 = c.measureText(z[0]);
        f.set((float)j - f2, (float)k - f2, (float)j + f2, (float)k + f2);
        canvas.drawOval(f, a);
        f2 *= d;
        if (f2 <= f1)
        {
            f1 = f2;
        }
        a.setColor(0xff33b5e5);
        f.set((float)j - f1, (float)k - f1, (float)j + f1, f1 + (float)k);
        canvas.drawOval(f, a);
        if (i != 0)
        {
            DialogToastActivity.g++;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "\023lM\020M";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "NrLX";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "\023lM\020M";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 125;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 107;
          goto _L9
_L5:
        byte0 = 92;
          goto _L9
_L6:
        byte0 = 125;
          goto _L9
        byte0 = 62;
          goto _L9
    }
}
