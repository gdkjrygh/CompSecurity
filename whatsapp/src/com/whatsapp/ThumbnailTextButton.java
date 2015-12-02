// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;

// Referenced classes of package com.whatsapp:
//            ThumbnailButton, np, App

public class ThumbnailTextButton extends ThumbnailButton
{

    private Rect k;
    private CharSequence l;
    private RectF m;
    private Drawable n;
    private int o;
    private int p;
    private TextPaint q;
    private Paint r;
    private float s;
    private int t;

    public ThumbnailTextButton(Context context)
    {
        super(context);
        o = 0x99000000;
        p = -1;
        s = 15F;
        t = 17;
        b(context, null);
    }

    public ThumbnailTextButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        o = 0x99000000;
        p = -1;
        s = 15F;
        t = 17;
        b(context, attributeset);
    }

    public ThumbnailTextButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        o = 0x99000000;
        p = -1;
        s = 15F;
        t = 17;
        b(context, attributeset);
    }

    private void b(Context context, AttributeSet attributeset)
    {
        if (attributeset != null)
        {
            attributeset = context.obtainStyledAttributes(attributeset, np.ThumbnailTextButton);
            l = attributeset.getText(0);
            s = attributeset.getDimension(2, s);
            t = attributeset.getInt(4, t);
            p = attributeset.getInt(3, p);
            o = attributeset.getInt(5, o);
            int i = attributeset.getResourceId(1, 0);
            if (i != 0)
            {
                n = context.getResources().getDrawable(i);
            }
            attributeset.recycle();
        }
    }

    protected void b(Canvas canvas)
    {
        int i;
        i = App.am;
        super.b(canvas);
        if (!TextUtils.isEmpty(l)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        float f1;
        float f2;
        Object obj;
        if (r == null)
        {
            r = new Paint();
            r.setAntiAlias(true);
            r.setStyle(android.graphics.Paint.Style.FILL);
            r.setColor(o);
        }
        if (q == null)
        {
            q = new TextPaint();
            q.setAntiAlias(true);
            q.setColor(p);
            q.setTextSize(s);
            q.setTextAlign(android.graphics.Paint.Align.CENTER);
        }
        if (m == null)
        {
            m = new RectF();
        }
        if (k == null)
        {
            k = new Rect();
        }
        f1 = s * 1.25F;
        f2 = f1 - s;
        obj = new Path();
        ((Path) (obj)).moveTo(e.left, e.bottom - f1);
        ((Path) (obj)).lineTo(e.right, e.bottom - f1);
        ((Path) (obj)).lineTo(e.right, e.bottom - this.i);
        m.set(e.right - this.i * 2.0F, e.bottom - this.i * 2.0F, e.right, e.bottom);
        ((Path) (obj)).arcTo(m, 0.0F, 90F);
        ((Path) (obj)).lineTo(e.left + this.i, e.bottom);
        m.set(e.left, e.bottom - this.i * 2.0F, e.left + this.i * 2.0F, e.bottom);
        ((Path) (obj)).arcTo(m, 90F, 90F);
        ((Path) (obj)).lineTo(e.left, e.bottom - f1);
        canvas.drawPath(((Path) (obj)), r);
        obj = TextUtils.ellipsize(l, q, e.width() - this.i, android.text.TextUtils.TruncateAt.END).toString();
        q.getTextBounds(((String) (obj)), 0, ((String) (obj)).length(), k);
        t;
        JVM INSTR tableswitch 3 5: default 512
    //                   3 688
    //                   4 512
    //                   5 723;
           goto _L3 _L4 _L3 _L5
_L3:
        float f = (e.right + e.left) / 2.0F;
_L6:
        canvas.drawText(((String) (obj)), 0, ((String) (obj)).length(), f, ((e.bottom - f1 / 2.0F) + s / 2.0F) - q.descent() / 2.0F, q);
        if (n != null)
        {
            f = ((float)n.getIntrinsicWidth() * f1) / (float)n.getIntrinsicHeight();
            n.setBounds((int)(e.left + f2 + this.i), (int)((e.bottom - f1) + (f1 - s) / 2.0F), (int)(f + (e.left + f2 + this.i)), (int)(e.bottom - (f1 - s) / 2.0F));
            n.draw(canvas);
            return;
        }
          goto _L1
_L4:
        f = e.left + (float)((k.right - k.left) / 2) + f2;
        if (i == 0) goto _L6; else goto _L5
_L5:
        f = e.right - (float)((k.right - k.left) / 2) - f2;
        if (i == 0) goto _L6; else goto _L3
    }

    public void setBackgroundColor(int i)
    {
        o = i;
    }

    public void setIcon(Drawable drawable)
    {
        n = drawable;
    }

    public void setText(CharSequence charsequence)
    {
        l = charsequence;
    }

    public void setTextGravity(int i)
    {
        t = i;
    }

    public void setTextSize(float f)
    {
        s = f;
    }
}
