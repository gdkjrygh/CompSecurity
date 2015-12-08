// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;
import com.google.android.apps.youtube.common.L;
import com.google.android.youtube.q;
import com.google.android.youtube.r;
import java.util.ArrayList;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            a, b

public abstract class AbstractWorkspace extends ViewGroup
{

    Runnable a;
    private int b;
    private boolean c;
    private int d;
    private int e;
    private Scroller f;
    private VelocityTracker g;
    private float h;
    private float i;
    private float j;
    private int k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private int p;
    private Drawable q;
    private b r;
    private InteractionMode s;

    public AbstractWorkspace(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = true;
        e = -1;
        k = 0;
        l = true;
        p = -1;
        a = new a(this);
        b = 0;
        setHapticFeedbackEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        context = context.obtainStyledAttributes(attributeset, r.L, 0, q.k);
        setInteractionMode(InteractionMode.values()[context.getInt(0, 2)]);
        context.recycle();
        f = new Scroller(getContext());
        d = b;
        context = ViewConfiguration.get(getContext());
        m = context.getScaledTouchSlop();
        n = 50;
        o = context.getScaledMaximumFlingVelocity();
    }

    private int a()
    {
        int j1 = getChildCount();
        int i1 = j1;
        if (q != null)
        {
            i1 = (j1 + 1) / 2;
        }
        return i1;
    }

    static int a(AbstractWorkspace abstractworkspace)
    {
        return abstractworkspace.d;
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = (motionevent.getAction() & 0xff00) >> 8;
        if (motionevent.getPointerId(i1) == p)
        {
            float f1;
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            f1 = motionevent.getX(i1);
            h = f1;
            i = f1;
            j = motionevent.getY(i1);
            p = motionevent.getPointerId(i1);
            if (g != null)
            {
                g.clear();
            }
        }
    }

    private int b()
    {
        int j1 = getWidth();
        int i1 = j1;
        if (q != null)
        {
            i1 = j1 + q.getIntrinsicWidth();
        }
        return i1;
    }

    private void c(int i1)
    {
        Object obj = SelectionMethod.FLING;
        int l1 = Math.max(0, Math.min(i1, a() - 1));
        i1 = Math.abs(l1 - d);
        e = l1;
        obj = getFocusedChild();
        if (obj != null && i1 != 0 && obj == b(d))
        {
            ((View) (obj)).clearFocus();
        }
        int j1 = b();
        int i2 = getScrollX();
        int j2 = l1 * j1 - i2;
        if (s.enableSmoothScroll)
        {
            int k1 = i1 * 300;
            i1 = k1;
            if (k1 == 0)
            {
                i1 = Math.abs(j2);
            }
            awakenScrollBars(i1);
        } else
        {
            i1 = 0;
        }
        if (e != d)
        {
            b(d).dispatchDisplayHint(4);
            removeCallbacks(a);
            postDelayed(a, i1 + 10);
        }
        a(l1);
        if (r != null)
        {
            obj = r;
        }
        if (!f.isFinished())
        {
            f.abortAnimation();
        }
        f.startScroll(i2, 0, j2, 0, i1);
        invalidate();
    }

    protected abstract void a(int i1);

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        View view = b(d);
        if (view != null) goto _L2; else goto _L1
_L1:
        L.c((new StringBuilder("Tab index ")).append(d).append(" does not exist").toString());
_L4:
        return;
_L2:
        view.addFocusables(arraylist, i1);
        if (i1 != 17)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (d <= 0) goto _L4; else goto _L3
_L3:
        b(d - 1).addFocusables(arraylist, i1);
        return;
        if (i1 != 66 || d >= a() - 1) goto _L4; else goto _L5
_L5:
        b(d + 1).addFocusables(arraylist, i1);
        return;
    }

    public void addView(View view)
    {
        view.setClickable(true);
        super.addView(view);
    }

    public void addView(View view, int i1)
    {
        view.setClickable(true);
        super.addView(view, i1);
    }

    public void addView(View view, int i1, int j1)
    {
        view.setClickable(true);
        super.addView(view, i1, j1);
    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        view.setClickable(true);
        super.addView(view, i1, layoutparams);
    }

    public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        view.setClickable(true);
        super.addView(view, layoutparams);
    }

    final View b(int i1)
    {
        if (q == null)
        {
            return getChildAt(i1);
        } else
        {
            return getChildAt(i1 * 2);
        }
    }

    public void computeScroll()
    {
        if (f.computeScrollOffset())
        {
            scrollTo(f.getCurrX(), f.getCurrY());
            postInvalidate();
        } else
        if (e != -1)
        {
            d = Math.max(0, Math.min(e, a() - 1));
            e = -1;
            if (r != null)
            {
                b b1 = r;
                int i1 = d;
                return;
            }
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
        boolean flag1 = false;
        boolean flag;
        if (k != 1 && e == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            drawChild(canvas, b(d), getDrawingTime());
        } else
        {
            long l1 = getDrawingTime();
            if (e >= 0 && e < a() && Math.abs(d - e) == 1)
            {
                drawChild(canvas, b(d), l1);
                drawChild(canvas, b(e), l1);
                return;
            }
            int j1 = getChildCount();
            int i1 = ((flag1) ? 1 : 0);
            while (i1 < j1) 
            {
                drawChild(canvas, getChildAt(i1), l1);
                i1++;
            }
        }
    }

    public boolean dispatchUnhandledMove(View view, int i1)
    {
        if (i1 == 17)
        {
            if (d > 0)
            {
                c(d - 1);
                return true;
            }
        } else
        if (i1 == 66 && d < a() - 1)
        {
            c(d + 1);
            return true;
        }
        return super.dispatchUnhandledMove(view, i1);
    }

    public void focusableViewAvailable(View view)
    {
        View view1;
        View view2;
        view2 = b(d);
        view1 = view;
_L6:
        if (view1 != view2) goto _L2; else goto _L1
_L1:
        super.focusableViewAvailable(view);
_L4:
        return;
_L2:
        if (view1 == this || !(view1.getParent() instanceof View)) goto _L4; else goto _L3
_L3:
        view1 = (View)view1.getParent();
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (s.enableFling) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1;
        i1 = motionevent.getAction();
        if (i1 == 2 && k != 0)
        {
            return true;
        }
        i1 & 0xff;
        JVM INSTR tableswitch 0 6: default 80
    //                   0 244
    //                   1 311
    //                   2 89
    //                   3 311
    //                   4 80
    //                   5 80
    //                   6 329;
           goto _L3 _L4 _L5 _L6 _L5 _L3 _L3 _L7
_L7:
        break MISSING_BLOCK_LABEL_329;
_L3:
        break; /* Loop/switch isn't completed */
_L6:
        break; /* Loop/switch isn't completed */
_L9:
        if (k != 0)
        {
            return true;
        }
        if (true) goto _L1; else goto _L8
_L8:
        int j1 = motionevent.findPointerIndex(p);
        float f1 = motionevent.getX(j1);
        float f3 = motionevent.getY(j1);
        int l1 = (int)Math.abs(f1 - i);
        int i2 = (int)Math.abs(f3 - j);
        int j2 = m;
        boolean flag;
        boolean flag1;
        if (l1 > n)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (l1 > j2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i2 > j2)
        {
            i2 = 1;
        } else
        {
            i2 = 0;
        }
        if (flag1 || i2)
        {
            if (flag)
            {
                k = 1;
                i = f1;
            }
            if (l)
            {
                l = false;
                b(d).cancelLongPress();
            }
        }
          goto _L9
_L4:
        float f2 = motionevent.getX();
        float f4 = motionevent.getY();
        h = f2;
        i = f2;
        j = f4;
        p = motionevent.getPointerId(0);
        l = true;
        int k1;
        if (f.isFinished())
        {
            k1 = 0;
        } else
        {
            k1 = 1;
        }
        k = k1;
          goto _L9
_L5:
        k = 0;
        l = false;
        p = -1;
          goto _L9
        a(motionevent);
          goto _L9
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        l1 = getChildCount();
        i1 = 0;
        for (j1 = 0; i1 < l1; j1 = k1)
        {
            View view = getChildAt(i1);
            k1 = j1;
            if (view.getVisibility() != 8)
            {
                k1 = view.getMeasuredWidth();
                view.layout(j1, 0, j1 + k1, view.getMeasuredHeight());
                k1 = j1 + k1;
            }
            i1++;
        }

    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        if (android.view.View.MeasureSpec.getMode(i1) != 0x40000000)
        {
            throw new IllegalStateException("Workspace can only be used in EXACTLY mode.");
        }
        if (android.view.View.MeasureSpec.getMode(j1) != 0x40000000)
        {
            throw new IllegalStateException("Workspace can only be used in EXACTLY mode.");
        }
        int l1 = getChildCount();
        int k1 = 0;
        while (k1 < l1) 
        {
            if (q != null && (k1 & 1) == 1)
            {
                getChildAt(k1).measure(q.getIntrinsicWidth(), j1);
            } else
            {
                getChildAt(k1).measure(i1, j1);
            }
            k1++;
        }
        if (c)
        {
            setHorizontalScrollBarEnabled(false);
            j1 = android.view.View.MeasureSpec.getSize(i1);
            i1 = j1;
            if (q != null)
            {
                i1 = j1 + q.getIntrinsicWidth();
            }
            scrollTo(i1 * d, 0);
            setHorizontalScrollBarEnabled(true);
            c = false;
        }
    }

    protected boolean onRequestFocusInDescendants(int i1, Rect rect)
    {
        View view;
        int j1;
        if (e != -1)
        {
            j1 = e;
        } else
        {
            j1 = d;
        }
        view = b(j1);
        if (view != null)
        {
            view.requestFocus(i1, rect);
        }
        return false;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        d = ((SavedState) (parcelable)).currentScreen;
        if (d < 0 || d > getChildCount())
        {
            d = 0;
        }
        a(d);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.currentScreen = d;
        return savedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        setCurrentScreen(d);
        a(d);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (g == null)
        {
            g = VelocityTracker.obtain();
        }
        g.addMovement(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 72
    //                   0 74
    //                   1 232
    //                   2 117
    //                   3 453
    //                   4 72
    //                   5 72
    //                   6 465;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L1 _L6
_L1:
        return true;
_L2:
        if (!f.isFinished())
        {
            f.abortAnimation();
        }
        float f1 = motionevent.getX();
        i = f1;
        h = f1;
        p = motionevent.getPointerId(0);
        return true;
_L4:
        int i1;
        int l1;
        if (k != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        float f2 = motionevent.getX(motionevent.findPointerIndex(p));
        i1 = (int)(i - f2);
        i = f2;
        l1 = getScrollX();
        if (i1 >= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (l1 > 0)
        {
            scrollBy(Math.max(-l1, i1), 0);
            return true;
        }
        if (true) goto _L1; else goto _L7
_L7:
        if (i1 > 0)
        {
            l1 = getChildAt(getChildCount() - 1).getRight() - l1 - getWidth();
            if (l1 > 0)
            {
                scrollBy(Math.min(l1, i1), 0);
                return true;
            }
        } else
        {
            awakenScrollBars();
            return true;
        }
          goto _L1
_L3:
        if (k == 1)
        {
            int j1 = p;
            float f3 = motionevent.getX(motionevent.findPointerIndex(j1));
            motionevent = g;
            motionevent.computeCurrentVelocity(1000, o);
            int i2 = (int)motionevent.getXVelocity(j1);
            int j2;
            if (Math.abs(h - f3) > 100F)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            j2 = getWidth();
            j2 = (getScrollX() + j2 / 2) / j2;
            if (j1 && i2 > 500 && d > 0)
            {
                c(Math.min(j2, d - 1));
            } else
            if (j1 && i2 < -500 && d < getChildCount() - 1)
            {
                c(Math.max(j2, d + 1));
            } else
            {
                int k1 = b();
                c((getScrollX() + k1 / 2) / k1);
            }
            if (g != null)
            {
                g.recycle();
                g = null;
            }
        }
        k = 0;
        p = -1;
        return true;
_L5:
        k = 0;
        p = -1;
        return true;
_L6:
        a(motionevent);
        return true;
    }

    public void requestChildFocus(View view, View view1)
    {
        super.requestChildFocus(view, view1);
        int i1 = indexOfChild(view);
        if (i1 >= 0 && !isInTouchMode())
        {
            c(i1);
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
    {
        int i1 = indexOfChild(view);
        if (i1 != d || !f.isFinished())
        {
            c(i1);
            return true;
        } else
        {
            return false;
        }
    }

    public void setCurrentScreen(int i1)
    {
        if (!f.isFinished())
        {
            f.abortAnimation();
        }
        d = Math.max(0, Math.min(i1, a() - 1));
        scrollTo(d * b(), 0);
        a(i1);
        invalidate();
    }

    public void setInteractionMode(InteractionMode interactionmode)
    {
        s = interactionmode;
    }

    public void setOnLongClickListener(android.view.View.OnLongClickListener onlongclicklistener)
    {
        int j1 = a();
        for (int i1 = 0; i1 < j1; i1++)
        {
            b(i1).setOnLongClickListener(onlongclicklistener);
        }

    }

    public void setOnTabSelectedListener(b b1)
    {
        r = b1;
    }

    public void setSeparator(int i1)
    {
        int j1 = 1;
        if (q != null && i1 == 0)
        {
            q = null;
            for (i1 = getChildCount() - 2; i1 > 0; i1 -= 2)
            {
                removeViewAt(i1);
            }

            requestLayout();
        } else
        if (i1 != 0)
        {
            if (q == null)
            {
                int k1 = getChildCount();
                q = getResources().getDrawable(i1);
                for (i1 = 1; i1 < k1; i1++)
                {
                    View view = new View(getContext());
                    view.setBackgroundDrawable(q);
                    view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -1));
                    addView(view, j1);
                    j1 += 2;
                }

                requestLayout();
                return;
            }
            q = getResources().getDrawable(i1);
            for (i1 = getChildCount() - 2; i1 > 0; i1 -= 2)
            {
                getChildAt(i1).setBackgroundDrawable(q);
            }

            requestLayout();
            return;
        }
    }

    private class InteractionMode extends Enum
    {

        private static final InteractionMode $VALUES[];
        public static final InteractionMode FLINGABLE_SCROLLING;
        public static final InteractionMode NON_SCROLLING;
        public static final InteractionMode SCROLLING;
        public final boolean enableFling;
        public final boolean enableSmoothScroll;

        public static InteractionMode valueOf(String s1)
        {
            return (InteractionMode)Enum.valueOf(com/google/android/apps/youtube/core/ui/AbstractWorkspace$InteractionMode, s1);
        }

        public static InteractionMode[] values()
        {
            return (InteractionMode[])$VALUES.clone();
        }

        static 
        {
            NON_SCROLLING = new InteractionMode("NON_SCROLLING", 0, false, false);
            SCROLLING = new InteractionMode("SCROLLING", 1, false, true);
            FLINGABLE_SCROLLING = new InteractionMode("FLINGABLE_SCROLLING", 2, true, true);
            $VALUES = (new InteractionMode[] {
                NON_SCROLLING, SCROLLING, FLINGABLE_SCROLLING
            });
        }

        private InteractionMode(String s1, int i1, boolean flag, boolean flag1)
        {
            super(s1, i1);
            enableFling = flag;
            enableSmoothScroll = flag1;
        }
    }


    private class SelectionMethod extends Enum
    {

        private static final SelectionMethod $VALUES[];
        public static final SelectionMethod FLING;
        public static final SelectionMethod TAP;

        public static SelectionMethod valueOf(String s1)
        {
            return (SelectionMethod)Enum.valueOf(com/google/android/apps/youtube/core/ui/AbstractWorkspace$SelectionMethod, s1);
        }

        public static SelectionMethod[] values()
        {
            return (SelectionMethod[])$VALUES.clone();
        }

        static 
        {
            FLING = new SelectionMethod("FLING", 0);
            TAP = new SelectionMethod("TAP", 1);
            $VALUES = (new SelectionMethod[] {
                FLING, TAP
            });
        }

        private SelectionMethod(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new c();
        int currentScreen;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(currentScreen);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            currentScreen = -1;
            currentScreen = parcel.readInt();
        }

        SavedState(Parcel parcel, a a1)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
            currentScreen = -1;
        }
    }

}
