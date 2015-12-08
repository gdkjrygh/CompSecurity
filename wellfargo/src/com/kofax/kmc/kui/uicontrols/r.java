// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.kofax.kmc.kui.uicontrols.data.ImageCaptureFrame;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            s

class r extends View
{

    private int a;
    private int b;
    private int c;
    private int d;
    private Paint e;
    private Paint f;
    private Rect g;
    private ArrayList h;
    private ImageCaptureFrame i;
    private ImageCaptureFrame j;

    public r(Context context)
    {
        this(context, null);
    }

    public r(Context context, Bus bus)
    {
        super(context);
        Object obj = bus;
        if (bus == null)
        {
            obj = s.a(context);
        }
        ((Bus) (obj)).register(this);
        e = new Paint();
        f = new Paint();
        h = new ArrayList();
        e.setStyle(android.graphics.Paint.Style.STROKE);
        f.setStyle(android.graphics.Paint.Style.FILL);
        j = new ImageCaptureFrame();
    }

    private void a()
    {
        j.setFrameBorderColor(i.getFrameBorderColor());
        j.setFrameBorderWidth(i.getFrameBorderWidth());
        j.setFrameHeight(i.getFrameHeight());
        j.setFrameWidth(i.getFrameWidth());
        j.setFrameOuterColor(i.getFrameOuterColor());
    }

    private void b()
    {
        e.setColor(i.getFrameBorderColor());
        f.setColor(i.getFrameOuterColor());
    }

    private void c()
    {
        if (i == null)
        {
            return;
        }
        int j1 = i.getFrameWidth();
        int i1 = i.getFrameHeight();
        int k = i.getFrameBorderWidth() / 2;
        int l = b;
        int i2 = a;
        int k1 = d;
        int l1 = c;
        l = (l - i2 - j1) / 2;
        k1 = (k1 - l1 - i1) / 2;
        j1 += l;
        i1 += k1;
        g = new Rect(l, k1, j1, i1);
        if (h.size() > 0)
        {
            h.clear();
        }
        k1 -= k;
        i1 += k;
        h.add(new Rect(a, c, b, k1));
        h.add(new Rect(a, i1, b, d));
        h.add(new Rect(a, k1, l - k, i1));
        h.add(new Rect(j1 + k, k1, b, i1));
        e.setStrokeWidth(i.getFrameBorderWidth());
    }

    private boolean d()
    {
        boolean flag3 = false;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag4;
        if (i.getFrameBorderWidth() != j.getFrameBorderWidth())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i.getFrameHeight() != j.getFrameHeight())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i.getFrameWidth() != j.getFrameWidth())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2 | (flag1 | flag))
        {
            c();
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (i.getFrameBorderColor() != j.getFrameBorderColor())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag3;
        if (i.getFrameOuterColor() != j.getFrameOuterColor())
        {
            flag1 = true;
        }
        if (flag1 | flag)
        {
            b();
            return true;
        } else
        {
            return flag4;
        }
    }

    public void a(BusEvents.ImageCaptureFrameChangedEvent imagecaptureframechangedevent)
    {
        i = imagecaptureframechangedevent.frame;
        if (i != null)
        {
            a();
            b();
            c();
        }
        (new Handler(Looper.getMainLooper())).post(new _cls1());
    }

    protected void onDraw(Canvas canvas)
    {
        if (i != null)
        {
            if (d())
            {
                a();
            }
            if (h.size() > 0)
            {
                for (Iterator iterator = h.iterator(); iterator.hasNext(); canvas.drawRect((Rect)iterator.next(), f)) { }
            }
            if (g != null)
            {
                canvas.drawRect(g, e);
            }
        }
    }

    protected void onLayout(boolean flag, int k, int l, int i1, int j1)
    {
        super.onLayout(flag, k, l, i1, j1);
        a = k;
        c = l;
        b = i1;
        d = j1;
        c();
    }

    private class _cls1
        implements Runnable
    {

        final r a;

        public void run()
        {
            a.invalidate();
        }

        _cls1()
        {
            a = r.this;
            super();
        }
    }

}
