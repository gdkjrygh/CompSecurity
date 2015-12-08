// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.am;
import com.google.android.apps.youtube.core.player.an;
import com.google.android.apps.youtube.core.ui.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            av, ax, aw, ay

public class PlayerOverlaysLayout extends FrameLayout
    implements am
{

    private final List a;
    private final List b;
    private final List c;
    private an d;
    private ay e;
    private g f;
    private View g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;

    public PlayerOverlaysLayout(Context context)
    {
        this(context, null);
    }

    public PlayerOverlaysLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ArrayList();
        b = new ArrayList();
        c = new ArrayList();
        setFocusable(true);
        setDescendantFocusability(0x40000);
        f = null;
    }

    private LayoutParams a(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    private void b()
    {
        boolean flag = false;
        int l;
        if (h)
        {
            l = (int)((float)getWidth() * 0.075F);
        } else
        {
            l = 0;
        }
        i = l;
        l = ((flag) ? 1 : 0);
        if (h)
        {
            l = (int)((float)getHeight() * 0.075F);
        }
        j = l;
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            iterator.next();
            l = i;
            l = j;
        }

    }

    private void b(boolean flag)
    {
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) 
        {
            View view = (View)iterator.next();
            byte byte0;
            if (flag)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            view.setVisibility(byte0);
        }
        for (Iterator iterator1 = b.iterator(); iterator1.hasNext(); ((av)iterator1.next()).setMinimized(flag)) { }
    }

    protected void a()
    {
        if (d != null)
        {
            d.b();
        }
    }

    public final void a(boolean flag)
    {
        if (f != null)
        {
            f.e(flag);
        }
    }

    public final transient void a(ax aax[])
    {
        int l = 0;
        while (l < aax.length) 
        {
            Object obj = aax[l];
            View view = ((ax) (obj)).b();
            if (view == null)
            {
                throw new IllegalArgumentException((new StringBuilder("Overlay ")).append(obj).append(" does not provide a View and LayoutParams").toString());
            }
            if (obj instanceof aw)
            {
                aw aw1 = (aw)obj;
                int i1 = i;
                i1 = j;
                a.add(aw1);
            }
            LayoutParams layoutparams = ((ax) (obj)).c();
            if (obj instanceof av)
            {
                obj = (av)obj;
                ((av) (obj)).setMinimized(k);
                b.add(obj);
                addView(view, layoutparams);
            } else
            {
                FrameLayout framelayout = new FrameLayout(view.getContext());
                framelayout.addView(view, layoutparams);
                addView(framelayout, new LayoutParams(-1, -1, layoutparams.a));
                c.add(framelayout);
            }
            l++;
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        if (e != null)
        {
            Rect rect1 = new Rect(rect);
            e.a(rect1);
        }
        return super.fitSystemWindows(rect);
    }

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    protected android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams(-2, -2, false);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new LayoutParams(layoutparams);
    }

    public android.widget.FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected void onMeasure(int l, int i1)
    {
        boolean flag = false;
        int l1 = android.view.View.MeasureSpec.getMode(l);
        int i2 = android.view.View.MeasureSpec.getMode(i1);
        int j1 = android.view.View.MeasureSpec.getSize(l);
        int k1 = android.view.View.MeasureSpec.getSize(i1);
        if (l1 != 0x40000000 || i2 != 0x40000000)
        {
            if (l1 == 0x40000000 || l1 == 0x80000000 && i2 == 0)
            {
                k1 = (int)((float)j1 / 1.777F);
            } else
            if (i2 == 0x40000000 || i2 == 0x80000000 && l1 == 0)
            {
                j1 = (int)((float)k1 * 1.777F);
            } else
            if (l1 == 0x80000000 && i2 == 0x80000000)
            {
                if ((float)k1 < (float)j1 / 1.777F)
                {
                    j1 = (int)((float)k1 * 1.777F);
                } else
                {
                    k1 = (int)((float)j1 / 1.777F);
                }
            } else
            {
                k1 = 0;
                j1 = ((flag) ? 1 : 0);
            }
        }
        l = resolveSize(j1, l);
        i1 = resolveSize(k1, i1);
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000));
    }

    protected void onSizeChanged(int l, int i1, int j1, int k1)
    {
        super.onSizeChanged(l, i1, j1, k1);
        if (h)
        {
            b();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        a();
        return super.onTouchEvent(motionevent);
    }

    public void setListener(an an1)
    {
        d = an1;
    }

    public void setMakeSafeForOverscan(boolean flag)
    {
        if (h != flag)
        {
            h = flag;
            b();
        }
    }

    public void setMinimized(boolean flag)
    {
        k = flag;
        b(flag);
    }

    public void setSliding(boolean flag)
    {
        if (flag || k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b(flag);
    }

    public void setSystemWindowInsetsListener(ay ay1)
    {
        e = ay1;
    }

    public void setVideoView(View view)
    {
        LayoutParams layoutparams;
        boolean flag;
        if (g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag, "videoView has already been set");
        g = view;
        layoutparams = new LayoutParams(-2, -2);
        layoutparams.gravity = 17;
        addView(view, 0, layoutparams);
    }

    public void setfullscreenUiVisibilityHelper(g g1)
    {
        f = g1;
    }

    private class LayoutParams extends android.widget.FrameLayout.LayoutParams
    {

        public boolean a;

        public LayoutParams(int l, int i1)
        {
            super(l, i1);
        }

        public LayoutParams(int l, int i1, boolean flag)
        {
            super(l, i1);
            a = flag;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            context = context.obtainStyledAttributes(attributeset, r.z);
            a = context.getBoolean(0, false);
            context.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
        }
    }

}
