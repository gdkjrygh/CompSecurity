// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.youtube.api.b;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            ag

public final class ae extends ag
{

    private final Paint n = new Paint();
    private final Rect o = new Rect();
    private final Drawable p;
    private final Drawable q;
    private final Drawable r;
    private final RectF s = new RectF();
    private final RectF t = new RectF();
    private final Rect u = new Rect();
    private final Rect v = new Rect();

    public ae(Resources resources)
    {
        n.setDither(true);
        r = resources.getDrawable(b.u);
        q = resources.getDrawable(b.v);
        p = resources.getDrawable(b.x);
        p.getPadding(u);
    }

    protected final void a()
    {
        int j;
        j = 98;
        int k = 0;
        int i;
        int l;
        if (this.l <= 1)
        {
            i = 0;
        } else
        if (this.l >= 99)
        {
            i = 98;
        } else
        {
            i = this.l - 1;
        }
        l = (v.width() * i) / 98;
        o.set(v.left, v.top, l + v.left, v.bottom);
        if (m > 1) goto _L2; else goto _L1
_L1:
        j = 0;
_L4:
        if (j > i)
        {
            k = ((j - i) * v.width()) / 98;
        }
        q.setBounds(o.right, v.top, k + o.right, v.bottom);
        return;
_L2:
        if (m < 99)
        {
            j = m - 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void draw(Canvas canvas)
    {
        r.draw(canvas);
        p.draw(canvas);
        if (l <= 0) goto _L2; else goto _L1
_L1:
        n.setShader(k);
        canvas.drawArc(s, 90F, 180F, true, n);
_L8:
        n.setShader(k);
        canvas.drawRect(o, n);
        q.draw(canvas);
        if (l < 100) goto _L4; else goto _L3
_L3:
        n.setShader(k);
        canvas.drawArc(t, -90F, 180F, true, n);
_L6:
        return;
_L2:
        if (m > 0)
        {
            n.setShader(null);
            n.setColor(h);
            canvas.drawArc(s, 90F, 180F, true, n);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (m < 100) goto _L6; else goto _L5
_L5:
        n.setShader(null);
        n.setColor(h);
        canvas.drawArc(t, -90F, 180F, true, n);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final int getIntrinsicHeight()
    {
        return p.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth()
    {
        return p.getIntrinsicWidth();
    }

    protected final void onBoundsChange(Rect rect)
    {
        p.setBounds(rect.left, rect.top, rect.right, rect.bottom);
        v.set(rect.left + u.left, rect.top + u.top, rect.right - u.right, rect.bottom - u.bottom);
        a(v, getState());
        s.set(rect.left, v.top, rect.left + v.height(), v.bottom);
        t.set(rect.right - v.height(), v.top, rect.right, v.bottom);
        a();
    }
}
