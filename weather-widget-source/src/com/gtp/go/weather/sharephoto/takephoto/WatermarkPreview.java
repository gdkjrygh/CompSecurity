// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            an, m, q, ac, 
//            ao

public class WatermarkPreview extends ViewGroup
{

    private final SparseArray a;
    private WeatherBean b;
    private u c;
    private boolean d;
    private final PointF e;

    public WatermarkPreview(Context context)
    {
        super(context);
        a = new SparseArray();
        b = null;
        d = false;
        e = new PointF();
        b();
    }

    public WatermarkPreview(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new SparseArray();
        b = null;
        d = false;
        e = new PointF();
        b();
    }

    public WatermarkPreview(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new SparseArray();
        b = null;
        d = false;
        e = new PointF();
        b();
    }

    private void a(an an1)
    {
        removeAllViews();
        addView(an1.d());
    }

    private boolean a(MotionEvent motionevent)
    {
        if (getChildCount() > 0)
        {
            View view = getChildAt(0);
            an an1 = (an)view.getTag();
            int i = view.getLeft();
            int j = getScrollX();
            int k = view.getTop();
            int l = getScrollY();
            int i1 = view.getLeft();
            int j1 = an1.i();
            int k1 = getScrollX();
            int l1 = view.getTop();
            int i2 = an1.j();
            int j2 = getScrollY();
            float f = motionevent.getX();
            float f1 = motionevent.getY();
            return f > (float)(i - j) && f < (float)((i1 + j1) - k1) && f1 > (float)(k - l) && f1 < (float)((i2 + l1) - j2);
        } else
        {
            return false;
        }
    }

    private an b(int i)
    {
        an an2 = (an)a.get(i);
        an an1 = an2;
        if (an2 == null)
        {
            an1 = an.a(getContext(), i);
            an1.a(b, c);
            a.append(i, an1);
        }
        return an1;
    }

    private void b()
    {
        e e1 = com.gau.go.launcherex.gowidget.weather.c.c.a(getContext().getApplicationContext()).f();
        b = m.b().b();
        c = e1.a();
    }

    private void b(MotionEvent motionevent)
    {
        if (getChildCount() > 0)
        {
            an an1 = (an)getChildAt(0).getTag();
            an1.a(true);
            float f = motionevent.getX();
            float f1 = e.x;
            float f3 = motionevent.getY();
            float f4 = e.y;
            float f2 = an1.f() + (f - f1) / (float)getWidth();
            f1 = ((float)(getWidth() - an1.i()) * 1.0F) / (float)getWidth();
            f = f2;
            if (f2 < 0.0F)
            {
                f = 0.0F;
            }
            if (f > f1)
            {
                f = f1;
            }
            an1.a(f);
            f = an1.g();
            f2 = (f3 - f4) / (float)getHeight() + f;
            f1 = ((float)(getHeight() - an1.j()) * 1.0F) / (float)getHeight();
            f = f2;
            if (f2 < 0.0F)
            {
                f = 0.0F;
            }
            if (f > f1)
            {
                f = f1;
            }
            an1.b(f);
            c();
        }
    }

    private void c()
    {
        if (getChildCount() > 0)
        {
            an an1 = (an)getChildAt(0).getTag();
            int i = (int)((float)getWidth() * an1.f());
            float f = getHeight();
            int j = (int)(an1.g() * f);
            scrollTo(-i, -j);
        }
    }

    public ao a()
    {
        if (getChildCount() > 0)
        {
            return ((an)getChildAt(0).getTag()).a();
        } else
        {
            return (new ac(getContext())).a();
        }
    }

    public void a(int i)
    {
        a(b(i));
    }

    protected boolean drawChild(Canvas canvas, View view, long l)
    {
        an an1 = (an)view.getTag();
        canvas.save();
        canvas.scale(an1.f, an1.f);
        boolean flag = super.drawChild(canvas, view, l);
        canvas.restore();
        return flag;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        j = getChildCount();
        for (i = 0; i < j; i++)
        {
            View view = getChildAt(i);
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            ((an)view.getTag()).a(getWidth(), getHeight());
        }

        c();
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        measureChildren(android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i), 0), android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j), 0));
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 40
    //                   0 59
    //                   1 116
    //                   2 86
    //                   3 116;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        boolean flag1 = d;
        boolean flag = flag1;
        if (!flag1)
        {
            flag = super.onTouchEvent(motionevent);
        }
        return flag;
_L2:
        d = a(motionevent);
        e.set(motionevent.getX(), motionevent.getY());
        continue; /* Loop/switch isn't completed */
_L4:
        if (d)
        {
            b(motionevent);
        }
        e.set(motionevent.getX(), motionevent.getY());
        continue; /* Loop/switch isn't completed */
_L3:
        d = false;
        if (true) goto _L1; else goto _L5
_L5:
    }
}
