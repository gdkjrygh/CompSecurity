// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import chm;
import duq;
import gdo;
import gdp;
import gdq;
import gdr;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SlidePanelLayout extends ViewGroup
{

    private final ViewDragHelper a;
    private final List b;
    private final duq c;
    private boolean d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private View i;
    private View j;

    public SlidePanelLayout(Context context)
    {
        this(context, null);
    }

    public SlidePanelLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidePanelLayout(Context context, AttributeSet attributeset, int k)
    {
        float f2 = 0.5F;
        super(context, attributeset, k);
        b = new CopyOnWriteArrayList();
        e = -1;
        f = -1;
        g = 0.0F;
        h = true;
        float f1 = f2;
        if (attributeset != null)
        {
            context = context.obtainStyledAttributes(attributeset, chm.SlidePanelLayout);
            f1 = f2;
            if (context != null)
            {
                e = context.getDimensionPixelSize(0, -1);
                f = context.getResourceId(1, -1);
                f1 = context.getFloat(2, 0.5F);
                context.recycle();
            }
        }
        if (e == -1)
        {
            e = getResources().getDimensionPixelSize(0x7f080273);
        }
        c = new duq(gdr);
        a = ViewDragHelper.create(this, f1, new gdo(this, (byte)0));
    }

    public static float a(SlidePanelLayout slidepanellayout, float f1)
    {
        slidepanellayout.g = f1;
        return f1;
    }

    public static float a(SlidePanelLayout slidepanellayout, int k)
    {
        return slidepanellayout.c(k);
    }

    public static View a(SlidePanelLayout slidepanellayout)
    {
        return slidepanellayout.j;
    }

    private void a(float f1)
    {
        d = false;
        a.abort();
        if (g == f1)
        {
            return;
        } else
        {
            g = f1;
            j();
            requestLayout();
            return;
        }
    }

    public static float b(SlidePanelLayout slidepanellayout)
    {
        return slidepanellayout.g;
    }

    public static int b(SlidePanelLayout slidepanellayout, float f1)
    {
        return slidepanellayout.c(f1);
    }

    private void b(float f1)
    {
        if (getVisibility() == 8)
        {
            a(f1);
            return;
        } else
        {
            b(c(f1));
            return;
        }
    }

    private void b(int k)
    {
        d = false;
        a.smoothSlideViewTo(j, j.getLeft(), k);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public static void b(SlidePanelLayout slidepanellayout, int k)
    {
        slidepanellayout.d(k);
    }

    private float c(int k)
    {
        return (float)(c(0.0F) - k) / (float)g();
    }

    private int c(float f1)
    {
        int k = (int)((float)g() * f1);
        return getMeasuredHeight() - getPaddingBottom() - e - k;
    }

    public static int c(SlidePanelLayout slidepanellayout)
    {
        return slidepanellayout.g();
    }

    public static float d(SlidePanelLayout slidepanellayout)
    {
        return slidepanellayout.h();
    }

    private void d(int k)
    {
        gdr gdr1 = ((gdr)c.a()).a(j, e(), g, k, d);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((gdp)iterator.next()).a(gdr1)) { }
    }

    public static ViewDragHelper e(SlidePanelLayout slidepanellayout)
    {
        return slidepanellayout.a;
    }

    private void f()
    {
        b(1.0F);
    }

    private int g()
    {
        return j.getMeasuredHeight() - e;
    }

    private float h()
    {
        return g > 0.4F ? 1.0F : 0.0F;
    }

    private boolean i()
    {
        int k = a.getViewDragState();
        return k == 1 || k == 2;
    }

    private void j()
    {
        d(0);
    }

    public final void a(int k)
    {
        i = null;
        e = k;
        requestLayout();
    }

    public final void a(gdp gdp1)
    {
        b.add(gdp1);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            b(0.0F);
            return;
        } else
        {
            a(0.0F);
            return;
        }
    }

    public final boolean a()
    {
        return g != 0.0F;
    }

    public final int b()
    {
        if (i != null)
        {
            return i.getHeight();
        } else
        {
            return e;
        }
    }

    public final void c()
    {
        f();
    }

    public void computeScroll()
    {
        if (a.continueSettling(true))
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public final void d()
    {
        a(true);
    }

    public final gdq e()
    {
        if (g <= 0.0F)
        {
            return gdq.b;
        }
        if (g >= 1.0F)
        {
            return gdq.a;
        } else
        {
            return gdq.c;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        j = getChildAt(0);
        if (f != -1)
        {
            i = findViewById(f);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int k = motionevent.getActionMasked();
        if (k != 0 || !i()) goto _L2; else goto _L1
_L1:
        a.abort();
_L4:
        boolean flag = a.shouldInterceptTouchEvent(motionevent);
        d = flag;
        return flag;
_L2:
        if (k == 3 || k == 1)
        {
            int l = c(h());
            if (l != j.getTop())
            {
                a.smoothSlideViewTo(j, j.getLeft(), l);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onLayout(boolean flag, int k, int l, int i1, int j1)
    {
        k = j.getMeasuredHeight();
        l = c(g);
        i1 = getPaddingLeft();
        j1 = j.getMeasuredWidth();
        j.layout(i1, l, j1 + i1, k + l);
    }

    protected void onMeasure(int k, int l)
    {
        int k1 = android.view.View.MeasureSpec.getMode(k);
        int i1 = android.view.View.MeasureSpec.getSize(k);
        k = android.view.View.MeasureSpec.getMode(l);
        int j1 = android.view.View.MeasureSpec.getSize(l);
        if (k1 != 0x40000000)
        {
            throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        }
        if (k != 0x40000000)
        {
            throw new IllegalStateException("Height must have an exact value or MATCH_PARENT");
        }
        if (getChildCount() != 1)
        {
            throw new IllegalStateException("Sliding up panel layout must have exactly 1 child!");
        }
        if (getVisibility() != 8 && j.getVisibility() != 8)
        {
            l = j1 - getPaddingTop() - getPaddingBottom();
            android.view.ViewGroup.LayoutParams layoutparams = j.getLayoutParams();
            if (layoutparams.width == -2)
            {
                k = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000);
            } else
            if (layoutparams.width == -1)
            {
                k = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
            } else
            {
                k = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.width, 0x40000000);
            }
            if (layoutparams.height == -2)
            {
                l = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x80000000);
            } else
            if (layoutparams.height == -1)
            {
                l = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000);
            } else
            {
                l = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
            }
            j.measure(k, l);
            setMeasuredDimension(i1, j1);
            if (i != null)
            {
                e = i.getMeasuredHeight();
                return;
            }
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        float f1;
        if (((SavedState) (parcelable)).a)
        {
            f1 = 1.0F;
        } else
        {
            f1 = 0.0F;
        }
        g = f1;
        e = ((SavedState) (parcelable)).b;
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        boolean flag;
        if (e() == gdq.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        savedstate.a = flag;
        savedstate.b = e;
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (h)
        {
            a.processTouchEvent(motionevent);
            return super.onTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static SavedState a(Parcel parcel)
            {
                return new SavedState(parcel, (byte)0);
            }

            private static SavedState[] a(int k)
            {
                return new SavedState[k];
            }

            public final Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public final Object[] newArray(int k)
            {
                return a(k);
            }

        };
        boolean a;
        int b;

        public void writeToParcel(Parcel parcel, int k)
        {
            super.writeToParcel(parcel, k);
            if (a)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            parcel.writeInt(k);
            parcel.writeInt(b);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
            b = parcel.readInt();
        }

        SavedState(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
