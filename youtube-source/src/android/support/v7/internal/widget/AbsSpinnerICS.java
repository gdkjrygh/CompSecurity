// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            v, d, w

abstract class AbsSpinnerICS extends v
{

    private DataSetObserver E;
    SpinnerAdapter a;
    int b;
    int c;
    boolean d;
    int e;
    int f;
    int g;
    int h;
    final Rect i = new Rect();
    final d j = new d(this);

    AbsSpinnerICS(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        setFocusable(true);
        setWillNotDraw(false);
    }

    static void a(AbsSpinnerICS absspinnerics, View view, boolean flag)
    {
        absspinnerics.removeDetachedView(view, true);
    }

    final void a()
    {
        u = false;
        p = false;
        removeAllViewsInLayout();
        B = -1;
        C = 0x8000000000000000L;
        b(-1);
        c(-1);
        invalidate();
    }

    public final void a(int k)
    {
        c(k);
        requestLayout();
        invalidate();
    }

    public void a(SpinnerAdapter spinneradapter)
    {
        byte byte0 = -1;
        if (a != null)
        {
            a.unregisterDataSetObserver(E);
            a();
        }
        a = spinneradapter;
        B = -1;
        C = 0x8000000000000000L;
        if (a != null)
        {
            A = z;
            z = a.getCount();
            e();
            E = new w(this);
            a.registerDataSetObserver(E);
            if (z > 0)
            {
                byte0 = 0;
            }
            b(byte0);
            c(byte0);
            if (z == 0)
            {
                g();
            }
        } else
        {
            e();
            a();
            g();
        }
        requestLayout();
    }

    public final View b()
    {
        if (z > 0 && x >= 0)
        {
            return getChildAt(x - k);
        } else
        {
            return null;
        }
    }

    public final volatile Adapter c()
    {
        return a;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.LayoutParams(-1, -2);
    }

    protected void onMeasure(int k, int l)
    {
        int i1;
        int j1;
        int k1;
        int i2 = android.view.View.MeasureSpec.getMode(k);
        i1 = getPaddingLeft();
        int l1 = getPaddingTop();
        k1 = getPaddingRight();
        j1 = getPaddingBottom();
        Object obj = i;
        View view;
        if (i1 <= e)
        {
            i1 = e;
        }
        obj.left = i1;
        obj = i;
        if (l1 > f)
        {
            i1 = l1;
        } else
        {
            i1 = f;
        }
        obj.top = i1;
        obj = i;
        if (k1 > g)
        {
            i1 = k1;
        } else
        {
            i1 = g;
        }
        obj.right = i1;
        obj = i;
        if (j1 > h)
        {
            i1 = j1;
        } else
        {
            i1 = h;
        }
        obj.bottom = i1;
        if (u)
        {
            f();
        }
        i1 = super.v;
        if (i1 < 0 || a == null || i1 >= a.getCount()) goto _L2; else goto _L1
_L1:
        view = j.a(i1);
        obj = view;
        if (view == null)
        {
            obj = a.getView(i1, null, this);
        }
        if (obj != null)
        {
            j.a(i1, ((View) (obj)));
        }
        if (obj == null) goto _L2; else goto _L3
_L3:
        if (((View) (obj)).getLayoutParams() == null)
        {
            d = true;
            ((View) (obj)).setLayoutParams(generateDefaultLayoutParams());
            d = false;
        }
        measureChild(((View) (obj)), k, l);
        j1 = ((View) (obj)).getMeasuredHeight() + i.top + i.bottom;
        i1 = ((View) (obj)).getMeasuredWidth() + i.left + i.right;
        k1 = 0;
_L5:
        l1 = i1;
        if (k1 != 0)
        {
            k1 = i.top + i.bottom;
            l1 = i1;
            j1 = k1;
            if (i2 == 0)
            {
                l1 = i.left + i.right;
                j1 = k1;
            }
        }
        i1 = Math.max(j1, getSuggestedMinimumHeight());
        j1 = Math.max(l1, getSuggestedMinimumWidth());
        i1 = resolveSize(i1, l);
        setMeasuredDimension(resolveSize(j1, k), i1);
        b = l;
        c = k;
        return;
_L2:
        k1 = 1;
        i1 = 0;
        j1 = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).selectedId >= 0L)
        {
            u = true;
            p = true;
            n = ((SavedState) (parcelable)).selectedId;
            m = ((SavedState) (parcelable)).position;
            q = 0;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.selectedId = super.w;
        if (savedstate.selectedId >= 0L)
        {
            savedstate.position = super.v;
            return savedstate;
        } else
        {
            savedstate.position = -1;
            return savedstate;
        }
    }

    public void requestLayout()
    {
        if (!d)
        {
            super.requestLayout();
        }
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new e();
        int position;
        long selectedId;

        public String toString()
        {
            return (new StringBuilder("AbsSpinner.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" selectedId=").append(selectedId).append(" position=").append(position).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int k)
        {
            super.writeToParcel(parcel, k);
            parcel.writeLong(selectedId);
            parcel.writeInt(position);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            selectedId = parcel.readLong();
            position = parcel.readInt();
        }

        SavedState(Parcel parcel, c c1)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
