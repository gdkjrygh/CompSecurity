// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.mobilemessage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import cwu;
import eey;
import eez;
import efk;

public class MobileMessageDraggableLayout extends LinearLayout
{

    private static final int a = cwu.a(60);
    private static final int b = cwu.a(280);
    private static final int c = cwu.a(10);
    private float d;
    private float e;
    private FrameLayout f;
    private LinearLayout g;
    private ViewDragHelper h;
    private eez i;
    private efk j;
    private boolean k;
    private boolean l;
    private int m;

    public MobileMessageDraggableLayout(Context context)
    {
        this(context, null);
    }

    public MobileMessageDraggableLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MobileMessageDraggableLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        k = false;
        l = false;
        m = -1;
        ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
        d = viewconfiguration.getScaledMinimumFlingVelocity() * 2;
        e = viewconfiguration.getScaledMaximumFlingVelocity();
        f = new FrameLayout(context);
        f.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        f.setBackgroundResource(0x7f020125);
        g = new LinearLayout(context, attributeset, i1);
        g.setLayoutParams(new android.widget.LinearLayout.LayoutParams(b, -2));
        f.addView(g);
        super.addView(f);
        h = ViewDragHelper.create(this, 0.8F, new eey(this, (byte)0));
    }

    private boolean a(MotionEvent motionevent)
    {
        return !(new Rect(f.getLeft(), f.getTop(), f.getRight(), f.getBottom())).contains((int)motionevent.getX(), (int)motionevent.getY());
    }

    public static boolean a(MobileMessageDraggableLayout mobilemessagedraggablelayout)
    {
        return mobilemessagedraggablelayout.k;
    }

    public static FrameLayout b(MobileMessageDraggableLayout mobilemessagedraggablelayout)
    {
        return mobilemessagedraggablelayout.f;
    }

    public static int c()
    {
        return a;
    }

    public static int c(MobileMessageDraggableLayout mobilemessagedraggablelayout)
    {
        return mobilemessagedraggablelayout.m;
    }

    public static float d(MobileMessageDraggableLayout mobilemessagedraggablelayout)
    {
        return mobilemessagedraggablelayout.d;
    }

    public static int d()
    {
        return c;
    }

    public static float e(MobileMessageDraggableLayout mobilemessagedraggablelayout)
    {
        return mobilemessagedraggablelayout.e;
    }

    public static ViewDragHelper f(MobileMessageDraggableLayout mobilemessagedraggablelayout)
    {
        return mobilemessagedraggablelayout.h;
    }

    public static boolean g(MobileMessageDraggableLayout mobilemessagedraggablelayout)
    {
        return mobilemessagedraggablelayout.l;
    }

    public static eez h(MobileMessageDraggableLayout mobilemessagedraggablelayout)
    {
        return mobilemessagedraggablelayout.i;
    }

    public static boolean i(MobileMessageDraggableLayout mobilemessagedraggablelayout)
    {
        mobilemessagedraggablelayout.l = false;
        return false;
    }

    final int a()
    {
        return f.getTop() + f.getHeight() / 2;
    }

    public final void a(int i1)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)f.getLayoutParams();
        layoutparams.setMargins(layoutparams.leftMargin, layoutparams.topMargin, layoutparams.rightMargin, i1);
    }

    public final void a(eez eez1)
    {
        i = eez1;
    }

    public final void a(efk efk1)
    {
        j = efk1;
    }

    public void addView(View view)
    {
        g.addView(view);
    }

    public final void b()
    {
        l = true;
        h.smoothSlideViewTo(f, f.getLeft(), getHeight() + c);
        ViewCompat.postInvalidateOnAnimation(this);
        h.continueSettling(true);
    }

    public void computeScroll()
    {
        if (h.continueSettling(true))
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (j != null)
        {
            j.a(a());
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        flag = false;
        if (m == -1)
        {
            m = f.getTop();
            l = true;
        }
        i1 = MotionEventCompat.getActionMasked(motionevent);
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        k = false;
_L6:
        flag = h.shouldInterceptTouchEvent(motionevent);
_L4:
        return flag;
_L2:
        if (i1 == 3) goto _L4; else goto _L3
_L3:
        if (i1 == 1)
        {
            return false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        h.processTouchEvent(motionevent);
        if (motionevent.getActionMasked() == 0 && a(motionevent))
        {
            k = true;
        } else
        if (motionevent.getActionMasked() == 1 && k && a(motionevent))
        {
            i.d();
            return true;
        }
        return true;
    }

    public void removeAllViews()
    {
        g.removeAllViews();
    }

}
