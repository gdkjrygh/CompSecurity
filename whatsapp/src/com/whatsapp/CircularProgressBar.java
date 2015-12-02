// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ProgressBar;

// Referenced classes of package com.whatsapp:
//            App

public class CircularProgressBar extends ProgressBar
{

    private static final String z[];
    private int a;
    private float b;
    private RectF c;
    private int d;
    private String e;
    private int f;
    private Paint g;
    private boolean h;
    private float i;

    public CircularProgressBar(Context context)
    {
        super(context);
        c = new RectF();
        g = new Paint();
        a = 0xff33b5e5;
        d = 0x99ffffff;
        e = null;
        f = 5;
        h = false;
    }

    public CircularProgressBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new RectF();
        g = new Paint();
        a = 0xff33b5e5;
        d = 0x99ffffff;
        e = null;
        f = 5;
        h = false;
    }

    public CircularProgressBar(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        c = new RectF();
        g = new Paint();
        a = 0xff33b5e5;
        d = 0x99ffffff;
        e = null;
        f = 5;
        h = false;
    }

    private float a(double d1)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)getContext().getSystemService(z[0])).getDefaultDisplay().getMetrics(displaymetrics);
        return (float)d1 * displaymetrics.density;
    }

    protected void onDraw(Canvas canvas)
    {
label0:
        {
            if (isIndeterminate())
            {
                super.onDraw(canvas);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            g.setAntiAlias(true);
            g.setStyle(android.graphics.Paint.Style.STROKE);
            g.setStrokeWidth(b / (float)f);
            g.setColor(d);
            canvas.drawArc(c, ((float)getProgress() * 360F) / (float)getMax() + 270F, 360F - ((float)getProgress() * 360F) / (float)getMax(), false, g);
            g.setStrokeWidth(g.getStrokeWidth());
            g.setColor(a);
            canvas.drawArc(c, -90F, ((float)getProgress() * 360F) / (float)getMax(), false, g);
            if (h)
            {
                g.setColor(d);
                g.setStyle(android.graphics.Paint.Style.FILL);
                float f1 = (float)getProgress() * (float)(6.2831853071795862D / (double)getMax());
                canvas.drawCircle((float)((double)c.centerX() + (double)b * Math.sin(f1)), (float)((double)c.centerY() - (double)b * Math.cos(f1)), 10F, g);
            }
            if (e != null)
            {
                g.setColor(0xff707070);
                g.setTextSize(i);
                g.setTextAlign(android.graphics.Paint.Align.CENTER);
                g.setTypeface(Typeface.create(z[1], 0));
                Rect rect = new Rect();
                g.getTextBounds(e, 0, e.length(), rect);
                g.setStyle(android.graphics.Paint.Style.FILL);
                canvas.drawText(e, 0, e.length(), c.centerX(), c.centerY() + (float)rect.height() * 0.5F, g);
            }
        }
    }

    protected void onSizeChanged(int j, int k, int l, int i1)
    {
        super.onSizeChanged(j, k, l, i1);
        b = (float)Math.min(j - getPaddingLeft() - getPaddingRight(), k - getPaddingTop() - getPaddingBottom()) / 2.0F;
        b = b - 0.3F * b;
        c.set((float)(j / 2) - b, (float)(k / 2) - b, (float)(j / 2) + b, (float)(k / 2) + b);
    }

    public void setCenterText(String s)
    {
        e = s;
        i = a(30D);
    }

    public void setKnobEnabled(boolean flag)
    {
        h = flag;
    }

    public void setPaintStrokeFactor(int j)
    {
        f = j;
    }

    public void setProgressBarBackgroundColor(int j)
    {
        d = j;
    }

    public void setProgressBarColor(int j)
    {
        a = j;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int j;
        as = new String[2];
        obj = "10WO71";
        byte1 = -1;
        j = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[j] = ((String) (obj));
                j = 1;
                obj = "58WXu5<KB>k5PL02";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 88;
_L9:
        obj[k] = (char)(byte0 ^ c1);
        k++;
          goto _L8
_L4:
        byte0 = 70;
          goto _L9
_L5:
        byte0 = 89;
          goto _L9
_L6:
        byte0 = 57;
          goto _L9
        byte0 = 43;
          goto _L9
    }
}
