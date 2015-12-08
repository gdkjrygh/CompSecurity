// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.a.f;
import android.support.v7.a.k;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarView, ScrollingTabContainerView

public class ActionBarContainer extends FrameLayout
{

    private boolean a;
    private View b;
    private ActionBarView c;
    private Drawable d;
    private Drawable e;
    private Drawable f;
    private boolean g;
    private boolean h;

    public ActionBarContainer(Context context)
    {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeset)
    {
        boolean flag;
        flag = true;
        super(context, attributeset);
        setBackgroundDrawable(null);
        context = context.obtainStyledAttributes(attributeset, k.a);
        d = context.getDrawable(10);
        e = context.getDrawable(11);
        if (getId() == f.C)
        {
            g = true;
            f = context.getDrawable(12);
        }
        context.recycle();
        if (!g) goto _L2; else goto _L1
_L1:
        if (f != null)
        {
            flag = false;
        }
_L4:
        setWillNotDraw(flag);
        return;
_L2:
        if (d != null || e != null)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (d != null && d.isStateful())
        {
            d.setState(getDrawableState());
        }
        if (e != null && e.isStateful())
        {
            e.setState(getDrawableState());
        }
        if (f != null && f.isStateful())
        {
            f.setState(getDrawableState());
        }
    }

    public void onDraw(Canvas canvas)
    {
        if (getWidth() != 0 && getHeight() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!g)
        {
            break; /* Loop/switch isn't completed */
        }
        if (f != null)
        {
            f.draw(canvas);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (d != null)
        {
            d.draw(canvas);
        }
        if (e != null && h)
        {
            e.draw(canvas);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        c = (ActionBarView)findViewById(f.a);
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return a || super.onInterceptTouchEvent(motionevent);
    }

    public void onLayout(boolean flag, int i, int j, int l, int i1)
    {
label0:
        {
            {
                boolean flag1 = true;
                boolean flag2 = false;
                super.onLayout(flag, i, j, l, i1);
                if (b != null && b.getVisibility() != 8)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                if (b != null && b.getVisibility() != 8)
                {
                    i1 = getMeasuredHeight();
                    int j1 = b.getMeasuredHeight();
                    if ((c.m() & 2) == 0)
                    {
                        int k1 = getChildCount();
                        for (i1 = 0; i1 < k1; i1++)
                        {
                            View view = getChildAt(i1);
                            if (view != b && !c.n())
                            {
                                view.offsetTopAndBottom(j1);
                            }
                        }

                        b.layout(i, 0, l, j1);
                    } else
                    {
                        b.layout(i, i1 - j1, l, i1);
                    }
                }
                if (!g)
                {
                    break label0;
                }
                if (f != null)
                {
                    f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    i = ((flag1) ? 1 : 0);
                } else
                {
                    i = 0;
                }
            }
            if (i != 0)
            {
                invalidate();
            }
            return;
        }
        if (d != null)
        {
            d.setBounds(c.getLeft(), c.getTop(), c.getRight(), c.getBottom());
            i = 1;
        } else
        {
            i = 0;
        }
        flag = flag2;
        if (j != 0)
        {
            flag = flag2;
            if (e != null)
            {
                flag = true;
            }
        }
        h = flag;
        if (flag)
        {
            e.setBounds(b.getLeft(), b.getTop(), b.getRight(), b.getBottom());
            i = ((flag1) ? 1 : 0);
        }
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_195;
        }
    }

    public void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (c != null)
        {
            android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)c.getLayoutParams();
            if (c.n())
            {
                i = 0;
            } else
            {
                i = c.getMeasuredHeight();
                int l = layoutparams.topMargin;
                i = layoutparams.bottomMargin + (i + l);
            }
            if (b != null && b.getVisibility() != 8 && android.view.View.MeasureSpec.getMode(j) == 0x80000000)
            {
                j = android.view.View.MeasureSpec.getSize(j);
                setMeasuredDimension(getMeasuredWidth(), Math.min(i + b.getMeasuredHeight(), j));
                return;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        super.onTouchEvent(motionevent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable)
    {
        boolean flag;
        flag = true;
        if (d != null)
        {
            d.setCallback(null);
            unscheduleDrawable(d);
        }
        d = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
        }
        if (!g) goto _L2; else goto _L1
_L1:
        if (f != null)
        {
            flag = false;
        }
_L4:
        setWillNotDraw(flag);
        invalidate();
        return;
_L2:
        if (d != null || e != null)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setSplitBackground(Drawable drawable)
    {
        boolean flag;
        flag = true;
        if (f != null)
        {
            f.setCallback(null);
            unscheduleDrawable(f);
        }
        f = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
        }
        if (!g) goto _L2; else goto _L1
_L1:
        if (f != null)
        {
            flag = false;
        }
_L4:
        setWillNotDraw(flag);
        invalidate();
        return;
_L2:
        if (d != null || e != null)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setStackedBackground(Drawable drawable)
    {
        boolean flag;
        flag = true;
        if (e != null)
        {
            e.setCallback(null);
            unscheduleDrawable(e);
        }
        e = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
        }
        if (!g) goto _L2; else goto _L1
_L1:
        if (f != null)
        {
            flag = false;
        }
_L4:
        setWillNotDraw(flag);
        invalidate();
        return;
_L2:
        if (d != null || e != null)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setTabContainer(ScrollingTabContainerView scrollingtabcontainerview)
    {
        if (b != null)
        {
            removeView(b);
        }
        b = scrollingtabcontainerview;
        if (scrollingtabcontainerview != null)
        {
            addView(scrollingtabcontainerview);
            android.view.ViewGroup.LayoutParams layoutparams = scrollingtabcontainerview.getLayoutParams();
            layoutparams.width = -1;
            layoutparams.height = -2;
            scrollingtabcontainerview.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean flag)
    {
        a = flag;
        int i;
        if (flag)
        {
            i = 0x60000;
        } else
        {
            i = 0x40000;
        }
        setDescendantFocusability(i);
    }

    public void setVisibility(int i)
    {
        super.setVisibility(i);
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (d != null)
        {
            d.setVisible(flag, false);
        }
        if (e != null)
        {
            e.setVisible(flag, false);
        }
        if (f != null)
        {
            f.setVisible(flag, false);
        }
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return drawable == d && !g || drawable == e && h || drawable == f && g || super.verifyDrawable(drawable);
    }
}
