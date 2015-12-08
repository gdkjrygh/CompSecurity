// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.p;

public class SubtitlesTextView extends View
{

    private TextPaint a;
    private TextPaint b;
    private TextPaint c;
    private Path d;
    private StaticLayout e;
    private StaticLayout f;
    private Editable g;
    private android.text.Layout.Alignment h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private float m;

    public SubtitlesTextView(Context context)
    {
        super(context);
        a();
    }

    public SubtitlesTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public SubtitlesTextView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a();
    }

    private int a(CharSequence charsequence, int i1)
    {
        int j1;
        int k1;
        j1 = android.view.View.MeasureSpec.getMode(i1);
        k1 = android.view.View.MeasureSpec.getSize(i1);
        i1 = getPaddingLeft() + getPaddingRight();
        j;
        JVM INSTR tableswitch 0 4: default 60
    //                   0 87
    //                   1 105
    //                   2 87
    //                   3 87
    //                   4 87;
           goto _L1 _L2 _L3 _L2 _L2 _L2
_L1:
        throw new IllegalStateException(String.format("Edge type %d is not supported.", new Object[] {
            Integer.valueOf(j)
        }));
_L2:
        i1 += (int)Layout.getDesiredWidth(charsequence, a);
_L5:
        if (j1 == 0)
        {
            return i1;
        }
        break; /* Loop/switch isn't completed */
_L3:
        i1 += (int)Layout.getDesiredWidth(charsequence, b);
        if (true) goto _L5; else goto _L4
_L4:
        if (j1 == 0x80000000)
        {
            return Math.min(i1, k1);
        } else
        {
            return k1;
        }
    }

    private StaticLayout a(int i1)
    {
        StaticLayout staticlayout;
label0:
        {
            StaticLayout staticlayout1 = e;
            i1 = a(((CharSequence) (g)), i1);
            if (staticlayout1 != null)
            {
                staticlayout = staticlayout1;
                if (i1 == staticlayout1.getWidth())
                {
                    break label0;
                }
            }
            staticlayout = new StaticLayout(g, a, i1, h, 1.0F, 0.0F, true);
        }
        return staticlayout;
    }

    private void a()
    {
        setLayerType(1, null);
        a = new TextPaint();
        a.setAntiAlias(true);
        a.setStyle(android.graphics.Paint.Style.FILL);
        b = new TextPaint();
        b.setAntiAlias(true);
        b.setColor(i);
        b.setStyle(android.graphics.Paint.Style.STROKE);
        c = new TextPaint();
        c.setAntiAlias(true);
        d = new Path();
        g = android.text.Editable.Factory.getInstance().newEditable("");
        h = android.text.Layout.Alignment.ALIGN_CENTER;
        m = a.getTextSize() * 0.0625F;
        setContentDescription(getResources().getString(p.fP));
    }

    private int b()
    {
        int i1;
        int k1;
        int l1;
        i1 = 0;
        k1 = getPaddingRight();
        l1 = getPaddingLeft();
        j;
        JVM INSTR tableswitch 0 4: default 52
    //                   0 79
    //                   1 116
    //                   2 79
    //                   3 79
    //                   4 79;
           goto _L1 _L2 _L3 _L2 _L2 _L2
_L1:
        throw new IllegalStateException(String.format("Edge type %d is not supported.", new Object[] {
            Integer.valueOf(j)
        }));
_L2:
        StaticLayout staticlayout = e;
_L5:
        int j1;
        int i2 = staticlayout.getLineCount();
        j1 = 0;
        for (; i1 < i2; i1++)
        {
            j1 = Math.max((int)staticlayout.getLineMax(i1), j1);
        }

        break; /* Loop/switch isn't completed */
_L3:
        staticlayout = f;
        if (true) goto _L5; else goto _L4
_L4:
        return j1 + (k1 + l1);
    }

    private StaticLayout b(int i1)
    {
        Object obj;
label0:
        {
            boolean flag = false;
            StaticLayout staticlayout = f;
            int j1 = a(g, i1);
            if (staticlayout != null)
            {
                obj = staticlayout;
                if (j1 == staticlayout.getWidth())
                {
                    break label0;
                }
            }
            obj = new SpannableString(g);
            ForegroundColorSpan aforegroundcolorspan[] = (ForegroundColorSpan[])((SpannableString) (obj)).getSpans(0, ((SpannableString) (obj)).length(), android/text/style/ForegroundColorSpan);
            int k1 = aforegroundcolorspan.length;
            for (i1 = ((flag) ? 1 : 0); i1 < k1; i1++)
            {
                ((SpannableString) (obj)).removeSpan(aforegroundcolorspan[i1]);
            }

            obj = new StaticLayout(((CharSequence) (obj)), b, j1, h, 1.0F, 0.0F, true);
        }
        return ((StaticLayout) (obj));
    }

    private int c()
    {
        switch (j)
        {
        default:
            throw new IllegalStateException(String.format("Edge type %d is not supported.", new Object[] {
                Integer.valueOf(j)
            }));

        case 0: // '\0'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            com.google.android.apps.youtube.common.fromguava.c.a(e);
            return e.getHeight();

        case 1: // '\001'
            com.google.android.apps.youtube.common.fromguava.c.a(f);
            break;
        }
        return f.getHeight();
    }

    protected void onDraw(Canvas canvas)
    {
        if (TextUtils.isEmpty(g) || f == null || e == null)
        {
            return;
        }
        if (Color.alpha(k) != 0)
        {
            canvas.drawPath(d, c);
        }
        if (j == 1)
        {
            f.draw(canvas);
        }
        e.draw(canvas);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        i1 = android.view.View.MeasureSpec.makeMeasureSpec(k1 - i1, 0x40000000);
        e = a(i1);
        f = b(i1);
        StaticLayout staticlayout = e;
        j1 = staticlayout.getLineCount();
        RectF rectf = new RectF();
        d.reset();
        for (i1 = 0; i1 < j1; i1++)
        {
            k1 = staticlayout.getLineBottom(i1);
            l1 = staticlayout.getLineTop(i1);
            float f1 = staticlayout.getLineLeft(i1);
            float f2 = staticlayout.getLineRight(i1);
            rectf.set(f1 - (float)getPaddingLeft(), l1, f2 + (float)getPaddingRight(), k1);
            d.addRect(rectf, android.graphics.Path.Direction.CCW);
        }

    }

    protected void onMeasure(int i1, int j1)
    {
        int l1 = android.view.View.MeasureSpec.getSize(i1);
        int k1 = android.view.View.MeasureSpec.getSize(j1);
        e = a(i1);
        f = b(i1);
        int i2 = android.view.View.MeasureSpec.getMode(i1);
        if (i2 == 0x80000000)
        {
            i1 = Math.min(l1, b());
        } else
        {
            i1 = l1;
            if (i2 != 0x40000000)
            {
                i1 = b();
            }
        }
        l1 = android.view.View.MeasureSpec.getMode(j1);
        if (l1 == 0x80000000)
        {
            j1 = Math.min(k1, c());
        } else
        {
            j1 = k1;
            if (l1 != 0x40000000)
            {
                j1 = c();
            }
        }
        setMeasuredDimension(i1, j1);
    }

    public void setBackgroundColor(int i1)
    {
        k = i1;
        c.setColor(i1);
        invalidate();
    }

    public void setEdgeColor(int i1)
    {
        b.setColor(i1);
        invalidate();
    }

    public void setEdgeType(int i1)
    {
        j;
        JVM INSTR tableswitch 0 4: default 40
    //                   0 76
    //                   1 76
    //                   2 136
    //                   3 67
    //                   4 67;
           goto _L1 _L2 _L2 _L3 _L4 _L4
_L2:
        break MISSING_BLOCK_LABEL_76;
_L1:
        throw new IllegalStateException(String.format("Edge type %d is not supported.", new Object[] {
            Integer.valueOf(j)
        }));
_L4:
        a.setMaskFilter(null);
_L10:
        i1;
        JVM INSTR tableswitch 0 4: default 112
    //                   0 181
    //                   1 181
    //                   2 233
    //                   3 146
    //                   4 191;
           goto _L5 _L6 _L6 _L7 _L8 _L9
_L5:
        throw new IllegalStateException(String.format("Edge type %d is not supported.", new Object[] {
            Integer.valueOf(i1)
        }));
_L3:
        a.clearShadowLayer();
          goto _L10
_L8:
        a.setMaskFilter(new EmbossMaskFilter(new float[] {
            1.0F, 1.0F, 1.0F
        }, 0.0F, 9F, 2.0F));
_L6:
        j = i1;
        requestLayout();
        return;
_L9:
        a.setMaskFilter(new EmbossMaskFilter(new float[] {
            -1F, -1F, 1.0F
        }, 0.0F, 9F, 2.0F));
        continue; /* Loop/switch isn't completed */
_L7:
        a.setShadowLayer(m, m, m, b.getColor());
        if (true) goto _L6; else goto _L11
_L11:
    }

    public void setText(CharSequence charsequence)
    {
        g.clear();
        g.append(charsequence);
        e = null;
        f = null;
        requestLayout();
        invalidate();
    }

    public void setTextColor(int i1)
    {
        a.setColor(i1);
        invalidate();
    }

    public void setTextSize(float f1)
    {
        f1 = TypedValue.applyDimension(2, f1, getResources().getDisplayMetrics());
        a.setTextSize(f1);
        m = 0.0625F * f1;
        b.setTextSize(f1);
        b.setStrokeWidth(m);
        setEdgeType(j);
        f = null;
        e = null;
        requestLayout();
        invalidate();
    }

    public void setTypeface(Typeface typeface)
    {
        a.setTypeface(typeface);
        b.setTypeface(typeface);
        c.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setWrapText(boolean flag)
    {
        l = flag;
        f = null;
        e = null;
        requestLayout();
    }
}
