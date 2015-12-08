// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.pla.internal;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Adapter;

// Referenced classes of package com.jiubang.pla.internal:
//            m, n

public abstract class PLA_AdapterView extends ViewGroup
{

    protected int B;
    int C;
    int D;
    long E;
    long F;
    boolean G;
    int H;
    boolean I;
    m J;
    n K;
    boolean L;
    int M;
    int N;
    int O;
    long P;
    boolean Q;
    private int a;
    private View b;
    private boolean c;
    private boolean d;

    public PLA_AdapterView(Context context)
    {
        super(context);
        B = 0;
        E = 0x8000000000000000L;
        G = false;
        I = false;
        O = -1;
        P = 0x8000000000000000L;
        Q = false;
    }

    public PLA_AdapterView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        B = 0;
        E = 0x8000000000000000L;
        G = false;
        I = false;
        O = -1;
        P = 0x8000000000000000L;
        Q = false;
    }

    public PLA_AdapterView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        B = 0;
        E = 0x8000000000000000L;
        G = false;
        I = false;
        O = -1;
        P = 0x8000000000000000L;
        Q = false;
    }

    static Parcelable a(PLA_AdapterView pla_adapterview)
    {
        return pla_adapterview.onSaveInstanceState();
    }

    static void a(PLA_AdapterView pla_adapterview, Parcelable parcelable)
    {
        pla_adapterview.onRestoreInstanceState(parcelable);
    }

    private void a(boolean flag)
    {
        if (w())
        {
            flag = false;
        }
        if (flag)
        {
            if (b != null)
            {
                b.setVisibility(0);
                setVisibility(8);
            } else
            {
                setVisibility(0);
            }
            if (L)
            {
                onLayout(false, getLeft(), getTop(), getRight(), getBottom());
            }
            return;
        }
        if (b != null)
        {
            b.setVisibility(8);
        }
        setVisibility(0);
    }

    int a(int i, boolean flag)
    {
        return i;
    }

    public void addView(View view)
    {
        throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
    }

    public void addView(View view, int i)
    {
        throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
    }

    public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
    }

    public int b(View view)
    {
        do
        {
            View view1;
            boolean flag;
            try
            {
                view1 = (View)view.getParent();
                flag = view1.equals(this);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                return -1;
            }
            if (!flag)
            {
                view = view1;
            } else
            {
                int j = getChildCount();
                for (int i = 0; i < j; i++)
                {
                    if (getChildAt(i).equals(view))
                    {
                        return i + B;
                    }
                }

                return -1;
            }
        } while (true);
    }

    public boolean b(View view, int i, long l)
    {
        boolean flag = false;
        if (J != null)
        {
            playSoundEffect(0);
            J.a(this, view, i, l);
            flag = true;
        }
        return flag;
    }

    protected boolean canAnimate()
    {
        return super.canAnimate() && M > 0;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        boolean flag = false;
        if (accessibilityevent.getEventType() == 8)
        {
            accessibilityevent.setEventType(4);
        }
        View view = e();
        if (view != null)
        {
            flag = view.dispatchPopulateAccessibilityEvent(accessibilityevent);
        }
        if (!flag)
        {
            if (view != null)
            {
                accessibilityevent.setEnabled(view.isEnabled());
            }
            accessibilityevent.setItemCount(u());
            accessibilityevent.setCurrentItemIndex(t());
        }
        return flag;
    }

    protected void dispatchRestoreInstanceState(SparseArray sparsearray)
    {
        dispatchThawSelfOnly(sparsearray);
    }

    protected void dispatchSaveInstanceState(SparseArray sparsearray)
    {
        dispatchFreezeSelfOnly(sparsearray);
    }

    public abstract View e();

    void m()
    {
        if (M > 0 && G)
        {
            G = false;
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        a = getHeight();
    }

    public void removeAllViews()
    {
        throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
    }

    public void removeView(View view)
    {
        throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
    }

    public void removeViewAt(int i)
    {
        throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
    }

    public abstract Adapter s();

    public void setFocusable(boolean flag)
    {
        boolean flag2 = true;
        Adapter adapter = s();
        boolean flag1;
        if (adapter == null || adapter.getCount() == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        c = flag;
        if (!flag)
        {
            d = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = flag2;
        if (!flag1) goto _L4; else goto _L3
_L3:
        if (!w()) goto _L2; else goto _L5
_L5:
        flag = flag2;
_L4:
        super.setFocusable(flag);
        return;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void setFocusableInTouchMode(boolean flag)
    {
        boolean flag2 = true;
        Adapter adapter = s();
        boolean flag1;
        if (adapter == null || adapter.getCount() == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        d = flag;
        if (flag)
        {
            c = true;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = flag2;
        if (!flag1) goto _L4; else goto _L3
_L3:
        if (!w()) goto _L2; else goto _L5
_L5:
        flag = flag2;
_L4:
        super.setFocusableInTouchMode(flag);
        return;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
    }

    public int t()
    {
        return -1;
    }

    public int u()
    {
        return M;
    }

    public int v()
    {
        return B;
    }

    boolean w()
    {
        return false;
    }

    void x()
    {
label0:
        {
label1:
            {
                boolean flag2 = false;
                Adapter adapter = s();
                boolean flag;
                boolean flag1;
                if (adapter == null || adapter.getCount() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag || w())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag && d)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                super.setFocusableInTouchMode(flag1);
                if (flag && c)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                super.setFocusable(flag1);
                if (b == null)
                {
                    break label0;
                }
                if (adapter != null)
                {
                    flag1 = flag2;
                    if (!adapter.isEmpty())
                    {
                        break label1;
                    }
                }
                flag1 = true;
            }
            a(flag1);
        }
    }

    void y()
    {
        if (getChildCount() > 0)
        {
            G = true;
            F = a;
            View view = getChildAt(0);
            Adapter adapter = s();
            if (B >= 0 && B < adapter.getCount())
            {
                E = adapter.getItemId(B);
            } else
            {
                E = -1L;
            }
            D = B;
            if (view != null)
            {
                C = view.getTop();
            }
            H = 1;
        }
    }
}
