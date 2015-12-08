// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            w, c, y

abstract class AbsSpinnerCompat extends w
{

    private DataSetObserver E;
    SpinnerAdapter a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    final Rect h = new Rect();
    final c i = new c(this);

    AbsSpinnerCompat(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        k();
    }

    static void a(AbsSpinnerCompat absspinnercompat, View view, boolean flag)
    {
        absspinnercompat.removeDetachedView(view, flag);
    }

    private void k()
    {
        setFocusable(true);
        setWillNotDraw(false);
    }

    int a(View view)
    {
        return view.getMeasuredHeight();
    }

    void a()
    {
        u = false;
        o = false;
        removeAllViewsInLayout();
        B = -1;
        C = 0x8000000000000000L;
        setSelectedPositionInt(-1);
        setNextSelectedPositionInt(-1);
        invalidate();
    }

    abstract void a(int j, boolean flag);

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
            E = new y(this);
            a.registerDataSetObserver(E);
            if (z > 0)
            {
                byte0 = 0;
            }
            setSelectedPositionInt(byte0);
            setNextSelectedPositionInt(byte0);
            if (z == 0)
            {
                h();
            }
        } else
        {
            e();
            a();
            h();
        }
        requestLayout();
    }

    int b(View view)
    {
        return view.getMeasuredWidth();
    }

    void b()
    {
        int l = getChildCount();
        c c1 = i;
        int i1 = this.j;
        for (int j = 0; j < l; j++)
        {
            c1.a(i1 + j, getChildAt(j));
        }

    }

    public SpinnerAdapter c()
    {
        return a;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.LayoutParams(-1, -2);
    }

    public Adapter getAdapter()
    {
        return c();
    }

    public int getCount()
    {
        return z;
    }

    public View getSelectedView()
    {
        if (z > 0 && x >= 0)
        {
            return getChildAt(x - j);
        } else
        {
            return null;
        }
    }

    protected void onMeasure(int j, int l)
    {
        int i1;
        int j1;
        int k1;
        int i2 = android.view.View.MeasureSpec.getMode(j);
        i1 = getPaddingLeft();
        int l1 = getPaddingTop();
        k1 = getPaddingRight();
        j1 = getPaddingBottom();
        Object obj = h;
        View view;
        if (i1 <= d)
        {
            i1 = d;
        }
        obj.left = i1;
        obj = h;
        if (l1 > e)
        {
            i1 = l1;
        } else
        {
            i1 = e;
        }
        obj.top = i1;
        obj = h;
        if (k1 > f)
        {
            i1 = k1;
        } else
        {
            i1 = f;
        }
        obj.right = i1;
        obj = h;
        if (j1 > g)
        {
            i1 = j1;
        } else
        {
            i1 = g;
        }
        obj.bottom = i1;
        if (u)
        {
            g();
        }
        i1 = getSelectedItemPosition();
        if (i1 < 0 || a == null || i1 >= a.getCount()) goto _L2; else goto _L1
_L1:
        view = i.a(i1);
        obj = view;
        if (view == null)
        {
            obj = a.getView(i1, null, this);
        }
        if (obj == null) goto _L2; else goto _L3
_L3:
        i.a(i1, ((View) (obj)));
        if (((View) (obj)).getLayoutParams() == null)
        {
            D = true;
            ((View) (obj)).setLayoutParams(generateDefaultLayoutParams());
            D = false;
        }
        measureChild(((View) (obj)), j, l);
        j1 = a(((View) (obj))) + h.top + h.bottom;
        i1 = b(((View) (obj))) + h.left + h.right;
        k1 = 0;
_L5:
        l1 = i1;
        if (k1 != 0)
        {
            k1 = h.top + h.bottom;
            l1 = i1;
            j1 = k1;
            if (i2 == 0)
            {
                l1 = h.left + h.right;
                j1 = k1;
            }
        }
        i1 = Math.max(j1, getSuggestedMinimumHeight());
        j1 = Math.max(l1, getSuggestedMinimumWidth());
        i1 = ViewCompat.resolveSizeAndState(i1, l, 0);
        setMeasuredDimension(ViewCompat.resolveSizeAndState(j1, j, 0), i1);
        b = l;
        c = j;
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
        if (((SavedState) (parcelable)).a >= 0L)
        {
            u = true;
            o = true;
            m = ((SavedState) (parcelable)).a;
            l = ((SavedState) (parcelable)).b;
            p = 0;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = getSelectedItemId();
        if (savedstate.a >= 0L)
        {
            savedstate.b = getSelectedItemPosition();
            return savedstate;
        } else
        {
            savedstate.b = -1;
            return savedstate;
        }
    }

    public void requestLayout()
    {
        if (!D)
        {
            super.requestLayout();
        }
    }

    public void setAdapter(Adapter adapter)
    {
        a((SpinnerAdapter)adapter);
    }

    public void setSelection(int j)
    {
        setNextSelectedPositionInt(j);
        requestLayout();
        invalidate();
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new d();
        long a;
        int b;

        public String toString()
        {
            return (new StringBuilder()).append("AbsSpinner.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" selectedId=").append(a).append(" position=").append(b).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            super.writeToParcel(parcel, j);
            parcel.writeLong(a);
            parcel.writeInt(b);
        }


        SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readLong();
            b = parcel.readInt();
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
