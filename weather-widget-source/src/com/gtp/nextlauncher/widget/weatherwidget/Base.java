// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.go.gl.view.GLLayoutInflater;
import com.go.gl.view.GLRelativeLayout;
import com.go.gl.view.GLView;
import com.go.gowidget.core.IGoWidget3D;
import com.go.gowidget.core.WidgetCallback;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            y, a, HourlyTypeView, WeatherTrendView, 
//            e

public class Base extends GLRelativeLayout
    implements com.go.gl.view.GLView.OnLongClickListener, IGoWidget3D, y
{

    private HourlyTypeView a;
    private WeatherTrendView b;
    private e c;
    private int d;
    private Context e;
    private float f;
    private VelocityTracker g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final long k;
    private boolean l;
    private boolean m;
    private Handler n;

    public Base(Context context)
    {
        super(context);
        d = -1;
        h = false;
        i = false;
        j = true;
        k = 10000L;
        l = false;
        m = false;
        n = new a(this);
        a(context);
    }

    public Base(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = -1;
        h = false;
        i = false;
        j = true;
        k = 10000L;
        l = false;
        m = false;
        n = new a(this);
        a(context);
    }

    private void a()
    {
        if (a != null)
        {
            return;
        } else
        {
            b();
            a.rebuildAnimation(mHeight);
            e();
            return;
        }
    }

    private void a(Context context)
    {
        e = context;
        b();
    }

    private void b()
    {
        a = (HourlyTypeView)GLLayoutInflater.from(e).inflate(0x7f0300d4, null);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        addView(a, layoutparams);
        a.setOnLongClickListener(this);
        if (b != null)
        {
            b.setHourlyView(a);
            a.setTrendView(b);
        }
    }

    private void c()
    {
        if (b != null)
        {
            return;
        } else
        {
            d();
            b.rebuildAnimation(mHeight);
            b.refreshScreenMode();
            f();
            return;
        }
    }

    private void d()
    {
        b = (WeatherTrendView)GLLayoutInflater.from(e).inflate(0x7f0300d7, null);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        addView(b, 0, layoutparams);
        b.setOnLongClickListener(this);
        if (a != null)
        {
            b.setHourlyView(a);
            a.setTrendView(b);
        }
        requestLayout();
    }

    private void e()
    {
        a.setDataHandler(c, this);
        a.onStart();
    }

    private void f()
    {
        b.setDataHandler(c, this);
        b.setWidgetId(d);
        b.onStart();
    }

    private void g()
    {
        while (h || i || a == null || b == null) 
        {
            return;
        }
        a.cleanup();
        removeView(a);
        b.setHourlyView(null);
        a = null;
    }

    private void h()
    {
        while (h || i || b == null || a == null) 
        {
            return;
        }
        b.cleanup();
        a.setTrendView(null);
        removeView(b);
        b = null;
    }

    public GLView getContentView()
    {
        return this;
    }

    public HourlyTypeView getHourlyTypeView()
    {
        this;
        JVM INSTR monitorenter ;
        HourlyTypeView hourlytypeview;
        a();
        hourlytypeview = a;
        this;
        JVM INSTR monitorexit ;
        return hourlytypeview;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean getIfHourSwitchReady()
    {
        return !h;
    }

    public boolean getIfTrendSwitchReady()
    {
        return !i;
    }

    public WeatherTrendView getTrendView()
    {
        this;
        JVM INSTR monitorenter ;
        WeatherTrendView weathertrendview;
        c();
        weathertrendview = b;
        this;
        JVM INSTR monitorexit ;
        return weathertrendview;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int getVersion()
    {
        return 0;
    }

    public boolean onActivate(boolean flag, Bundle bundle)
    {
        return false;
    }

    public boolean onApplyTheme(Bundle bundle)
    {
        return false;
    }

    public void onClearMemory()
    {
    }

    public boolean onDeactivate(boolean flag, Bundle bundle)
    {
        return false;
    }

    public void onDelete()
    {
        c.a(d);
    }

    public void onEnter()
    {
        a.onEnter();
    }

    public void onHourlyViewHide()
    {
        j = false;
        h = false;
        n.removeMessages(0);
        n.sendEmptyMessageDelayed(0, 10000L);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        float f1;
        int i1;
        i1 = motionevent.getAction();
        motionevent.getX();
        f1 = motionevent.getY();
        i1;
        JVM INSTR tableswitch 0 2: default 44
    //                   0 67
    //                   1 44
    //                   2 46;
           goto _L1 _L2 _L1 _L3
_L1:
        return false;
_L3:
        if ((int)Math.abs(f - f1) > (i1 = getTouchSlop()))
        {
            return true;
        }
          goto _L1
_L2:
        f = f1;
        return false;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        if (b != null)
        {
            b.refreshScreenMode();
        }
    }

    public void onLeave()
    {
    }

    public boolean onLongClick(GLView glview)
    {
        performLongClick();
        return false;
    }

    public void onRemove()
    {
        if (c != null)
        {
            c.e();
        }
        if (b != null)
        {
            b.cleanup();
        }
        if (a != null)
        {
            a.cleanup();
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (a != null)
        {
            a.rebuildAnimation(j1);
        }
        if (b != null)
        {
            b.rebuildAnimation(j1);
            b.refreshScreenMode();
        }
    }

    public void onStart(Bundle bundle)
    {
        d = bundle.getInt("gowidget_Id");
        if (c == null)
        {
            c = new e(e, d, this, false);
        }
        if (a != null)
        {
            e();
        }
        if (b != null)
        {
            f();
        }
        m = true;
    }

    public void onStop()
    {
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (m) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (g == null)
        {
            g = VelocityTracker.obtain();
        }
        g.addMovement(motionevent);
        switch (motionevent.getAction())
        {
        default:
            return true;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break;

        case 0: // '\0'
            f = motionevent.getY();
            return true;
        }
        if (true || (l || h || i || h)) goto _L1; else goto _L3
_L3:
        float f1;
        int i1;
        VelocityTracker velocitytracker = g;
        velocitytracker.computeCurrentVelocity(1000);
        i1 = (int)velocitytracker.getYVelocity();
        f1 = motionevent.getY() - f;
        if (i1 <= 600 && f1 <= (float)(getHeight() / 4) || b == null || !b.isVisible() || h || i)
        {
            continue; /* Loop/switch isn't completed */
        }
        n.removeMessages(0);
        this;
        JVM INSTR monitorenter ;
        a();
        this;
        JVM INSTR monitorexit ;
        j = true;
        i = true;
        a.startAppearAnimation();
        b.startDisppearAnimation();
        return true;
        motionevent;
        this;
        JVM INSTR monitorexit ;
        throw motionevent;
        if (i1 >= -600 && f1 >= (float)(-getHeight() / 4) || a == null || !a.isVisible() || i) goto _L1; else goto _L4
_L4:
        n.removeMessages(0);
        this;
        JVM INSTR monitorenter ;
        c();
        this;
        JVM INSTR monitorexit ;
        h = true;
        b.startAppearAnimation();
        a.startDisppearAnimation();
        return true;
        motionevent;
        this;
        JVM INSTR monitorexit ;
        throw motionevent;
    }

    public void onTrendViewHide()
    {
        j = true;
        i = false;
        n.removeMessages(0);
        n.sendEmptyMessageDelayed(0, 10000L);
    }

    public void setDrawingCacheEnabled(boolean flag)
    {
        if (a != null)
        {
            a.setDrawingCacheEnabled(flag);
        }
        if (b != null)
        {
            b.setDrawingCacheEnabled(flag);
        }
        super.setDrawingCacheEnabled(flag);
    }

    public void setHourDisappearStart()
    {
        h = true;
    }

    public void setTrendDisappearStart()
    {
        i = true;
    }

    public void setWidgetCallback(WidgetCallback widgetcallback)
    {
    }


/*
    static boolean access$002(Base base, boolean flag)
    {
        base.l = flag;
        return flag;
    }

*/



}
