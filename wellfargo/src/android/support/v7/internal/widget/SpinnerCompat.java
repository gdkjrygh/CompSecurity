// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.a.l;
import android.support.v7.widget.ag;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsSpinnerCompat, bf, az, au, 
//            aw, as, c, av, 
//            at, bd, z

class SpinnerCompat extends AbsSpinnerCompat
    implements android.content.DialogInterface.OnClickListener
{

    int E;
    private ag F;
    private az G;
    private av H;
    private int I;
    private boolean J;
    private Rect K;
    private final bd L;

    SpinnerCompat(Context context, AttributeSet attributeset, int i)
    {
        this(context, attributeset, i, -1);
    }

    SpinnerCompat(Context context, AttributeSet attributeset, int i, int j)
    {
        bf bf1;
        int k;
        super(context, attributeset, i);
        K = new Rect();
        bf1 = bf.a(context, attributeset, l.Spinner, i, 0);
        if (bf1.e(l.Spinner_android_background))
        {
            setBackgroundDrawable(bf1.a(l.Spinner_android_background));
        }
        k = j;
        if (j == -1)
        {
            k = bf1.a(l.Spinner_spinnerMode, 0);
        }
        k;
        JVM INSTR tableswitch 0 1: default 100
    //                   0 184
    //                   1 200;
           goto _L1 _L2 _L3
_L1:
        I = bf1.a(l.Spinner_android_gravity, 17);
        G.a(bf1.d(l.Spinner_prompt));
        J = bf1.a(l.Spinner_disableChildrenWhenDisabled, false);
        bf1.b();
        if (H != null)
        {
            G.a(H);
            H = null;
        }
        L = bf1.c();
        return;
_L2:
        G = new au(this, null);
        continue; /* Loop/switch isn't completed */
_L3:
        context = new aw(this, context, attributeset, i);
        E = bf1.e(l.Spinner_android_dropDownWidth, -2);
        context.a(bf1.a(l.Spinner_android_popupBackground));
        G = context;
        F = new as(this, this, context);
        if (true) goto _L1; else goto _L4
_L4:
    }

    static az a(SpinnerCompat spinnercompat)
    {
        return spinnercompat.G;
    }

    private void a(View view, boolean flag)
    {
        android.view.ViewGroup.LayoutParams layoutparams1 = view.getLayoutParams();
        android.view.ViewGroup.LayoutParams layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            layoutparams = generateDefaultLayoutParams();
        }
        if (flag)
        {
            addViewInLayout(view, 0, layoutparams);
        }
        view.setSelected(hasFocus());
        if (J)
        {
            view.setEnabled(isEnabled());
        }
        int i = ViewGroup.getChildMeasureSpec(b, h.top + h.bottom, layoutparams.height);
        view.measure(ViewGroup.getChildMeasureSpec(c, h.left + h.right, layoutparams.width), i);
        i = h.top + (getMeasuredHeight() - h.bottom - h.top - view.getMeasuredHeight()) / 2;
        int j = view.getMeasuredHeight();
        view.layout(0, i, view.getMeasuredWidth() + 0, j + i);
    }

    private View c(int i, boolean flag)
    {
        if (!u)
        {
            View view = this.i.a(i);
            if (view != null)
            {
                a(view, flag);
                return view;
            }
        }
        View view1 = a.getView(i, null, this);
        a(view1, flag);
        return view1;
    }

    int a(SpinnerAdapter spinneradapter, Drawable drawable)
    {
        if (spinneradapter == null)
        {
            return 0;
        }
        int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int i = Math.max(0, getSelectedItemPosition());
        int l1 = Math.min(spinneradapter.getCount(), i + 15);
        int j = Math.max(0, i - (15 - (l1 - i)));
        View view = null;
        int k = 0;
        i = 0;
        for (; j < l1; j++)
        {
            int i1 = spinneradapter.getItemViewType(j);
            if (i1 != i)
            {
                view = null;
                i = i1;
            }
            view = spinneradapter.getView(j, view, this);
            if (view.getLayoutParams() == null)
            {
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(j1, k1);
            k = Math.max(k, view.getMeasuredWidth());
        }

        if (drawable != null)
        {
            drawable.getPadding(K);
            return K.left + K.right + k;
        } else
        {
            return k;
        }
    }

    void a(int i, boolean flag)
    {
        int j;
        i = h.left;
        j = getRight() - getLeft() - h.left - h.right;
        if (u)
        {
            g();
        }
        if (z == 0)
        {
            a();
            return;
        }
        if (v >= 0)
        {
            setSelectedPositionInt(v);
        }
        b();
        removeAllViewsInLayout();
        this.j = x;
        if (a == null) goto _L2; else goto _L1
_L1:
        View view;
        int k;
        int i1;
        view = c(x, true);
        k = view.getMeasuredWidth();
        i1 = ViewCompat.getLayoutDirection(this);
        GravityCompat.getAbsoluteGravity(I, i1) & 7;
        JVM INSTR lookupswitch 2: default 156
    //                   1: 195
    //                   5: 210;
           goto _L3 _L4 _L5
_L3:
        view.offsetLeftAndRight(i);
_L2:
        this.i.a();
        invalidate();
        h();
        u = false;
        o = false;
        setNextSelectedPositionInt(x);
        return;
_L4:
        i = (i + j / 2) - k / 2;
        continue; /* Loop/switch isn't completed */
_L5:
        i = (i + j) - k;
        if (true) goto _L3; else goto _L6
_L6:
    }

    void a(z z)
    {
        super.setOnItemClickListener(z);
    }

    public void a(SpinnerAdapter spinneradapter)
    {
        super.a(spinneradapter);
        i.a();
        if (getContext().getApplicationInfo().targetSdkVersion >= 21 && spinneradapter != null && spinneradapter.getViewTypeCount() != 1)
        {
            throw new IllegalArgumentException("Spinner adapter view type count must be 1");
        }
        if (G != null)
        {
            G.a(new av(spinneradapter));
            return;
        } else
        {
            H = new av(spinneradapter);
            return;
        }
    }

    public int getBaseline()
    {
        Object obj;
        byte byte0;
        byte0 = -1;
        obj = null;
        if (getChildCount() <= 0) goto _L2; else goto _L1
_L1:
        View view = getChildAt(0);
_L4:
        int i = byte0;
        if (view != null)
        {
            int j = view.getBaseline();
            i = byte0;
            if (j >= 0)
            {
                i = view.getTop() + j;
            }
        }
        return i;
_L2:
        view = obj;
        if (a != null)
        {
            view = obj;
            if (a.getCount() > 0)
            {
                view = c(0, false);
                this.i.a(0, view);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        setSelection(i);
        dialoginterface.dismiss();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (G != null && G.b())
        {
            G.a();
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int i1)
    {
        super.onLayout(flag, i, j, k, i1);
        q = true;
        a(0, false);
        q = false;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (G != null && android.view.View.MeasureSpec.getMode(i) == 0x80000000)
        {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(c(), getBackground())), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).c)
        {
            parcelable = getViewTreeObserver();
            if (parcelable != null)
            {
                parcelable.addOnGlobalLayoutListener(new at(this));
            }
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        boolean flag;
        if (G != null && G.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        savedstate.c = flag;
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (F != null && F.onTouch(this, motionevent))
        {
            return true;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public boolean performClick()
    {
        boolean flag1 = super.performClick();
        boolean flag = flag1;
        if (!flag1)
        {
            boolean flag2 = true;
            flag = flag2;
            if (!G.b())
            {
                G.c();
                flag = flag2;
            }
        }
        return flag;
    }

    public void setAdapter(Adapter adapter)
    {
        a((SpinnerAdapter)adapter);
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        if (J)
        {
            int j = getChildCount();
            for (int i = 0; i < j; i++)
            {
                getChildAt(i).setEnabled(flag);
            }

        }
    }

    public void setOnItemClickListener(z z)
    {
        throw new RuntimeException("setOnItemClickListener cannot be used with a spinner.");
    }

    private class SavedState extends AbsSpinnerCompat.SavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new ay();
        boolean c;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            if (c)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeByte((byte)i);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            boolean flag;
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c = flag;
        }

        SavedState(Parcel parcel, as as1)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
