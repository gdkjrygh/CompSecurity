// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Adapter;

// Referenced classes of package android.support.v7.internal.widget:
//            ab, z, ac, aa

public abstract class w extends ViewGroup
{

    int A;
    int B;
    long C;
    boolean D;
    private int a;
    private View b;
    private boolean c;
    private boolean d;
    private ac e;
    int j;
    int k;
    int l;
    long m;
    long n;
    boolean o;
    int p;
    boolean q;
    ab r;
    z s;
    aa t;
    boolean u;
    int v;
    long w;
    int x;
    long y;
    int z;

    w(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        j = 0;
        m = 0x8000000000000000L;
        o = false;
        q = false;
        v = -1;
        w = 0x8000000000000000L;
        x = -1;
        y = 0x8000000000000000L;
        B = -1;
        C = 0x8000000000000000L;
        D = false;
    }

    static Parcelable a(w w1)
    {
        return w1.onSaveInstanceState();
    }

    private void a()
    {
        if (r == null)
        {
            return;
        }
        int i1 = getSelectedItemPosition();
        if (i1 >= 0)
        {
            View view = getSelectedView();
            r.a(this, view, i1, getAdapter().getItemId(i1));
            return;
        } else
        {
            r.a(this);
            return;
        }
    }

    static void a(w w1, Parcelable parcelable)
    {
        w1.onRestoreInstanceState(parcelable);
    }

    private void a(boolean flag)
    {
        if (d())
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
            if (u)
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

    static void b(w w1)
    {
        w1.a();
    }

    public long a(int i1)
    {
        Adapter adapter = getAdapter();
        if (adapter == null || i1 < 0)
        {
            return 0x8000000000000000L;
        } else
        {
            return adapter.getItemId(i1);
        }
    }

    public boolean a(View view, int i1, long l1)
    {
        boolean flag = false;
        if (s != null)
        {
            playSoundEffect(0);
            if (view != null)
            {
                view.sendAccessibilityEvent(1);
            }
            s.a(this, view, i1, l1);
            flag = true;
        }
        return flag;
    }

    public void addView(View view)
    {
        throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
    }

    public void addView(View view, int i1)
    {
        throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
    }

    public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
    }

    int b(int i1, boolean flag)
    {
        return i1;
    }

    protected boolean canAnimate()
    {
        return super.canAnimate() && z > 0;
    }

    boolean d()
    {
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        View view = getSelectedView();
        return view != null && view.getVisibility() == 0 && view.dispatchPopulateAccessibilityEvent(accessibilityevent);
    }

    protected void dispatchRestoreInstanceState(SparseArray sparsearray)
    {
        dispatchThawSelfOnly(sparsearray);
    }

    protected void dispatchSaveInstanceState(SparseArray sparsearray)
    {
        dispatchFreezeSelfOnly(sparsearray);
    }

    void e()
    {
label0:
        {
label1:
            {
                boolean flag2 = false;
                Adapter adapter = getAdapter();
                boolean flag;
                boolean flag1;
                if (adapter == null || adapter.getCount() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag || d())
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

    void f()
    {
        if (r != null)
        {
            if (q || D)
            {
                if (e == null)
                {
                    e = new ac(this, null);
                }
                post(e);
            } else
            {
                a();
            }
        }
        if (x != -1 && isShown() && !isInTouchMode())
        {
            sendAccessibilityEvent(4);
        }
    }

    void g()
    {
        int l1;
        l1 = z;
        if (l1 <= 0)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        if (!o) goto _L2; else goto _L1
_L1:
        int i1;
        o = false;
        i1 = i();
        if (i1 < 0 || b(i1, true) != i1) goto _L2; else goto _L3
_L3:
        boolean flag;
        setNextSelectedPositionInt(i1);
        flag = true;
_L4:
        if (!flag)
        {
            int k1 = getSelectedItemPosition();
            int j1 = k1;
            if (k1 >= l1)
            {
                j1 = l1 - 1;
            }
            k1 = j1;
            if (j1 < 0)
            {
                k1 = 0;
            }
            j1 = b(k1, true);
            if (j1 < 0)
            {
                j1 = b(k1, false);
            }
            if (j1 >= 0)
            {
                setNextSelectedPositionInt(j1);
                h();
                flag = true;
            }
        }
_L5:
        if (!flag)
        {
            x = -1;
            y = 0x8000000000000000L;
            v = -1;
            w = 0x8000000000000000L;
            o = false;
            h();
        }
        return;
_L2:
        flag = false;
          goto _L4
        flag = false;
          goto _L5
    }

    public abstract Adapter getAdapter();

    public int getCount()
    {
        return z;
    }

    public View getEmptyView()
    {
        return b;
    }

    public int getFirstVisiblePosition()
    {
        return j;
    }

    public int getLastVisiblePosition()
    {
        return (j + getChildCount()) - 1;
    }

    public final z getOnItemClickListener()
    {
        return s;
    }

    public final aa getOnItemLongClickListener()
    {
        return t;
    }

    public final ab getOnItemSelectedListener()
    {
        return r;
    }

    public Object getSelectedItem()
    {
        Adapter adapter = getAdapter();
        int i1 = getSelectedItemPosition();
        if (adapter != null && adapter.getCount() > 0 && i1 >= 0)
        {
            return adapter.getItem(i1);
        } else
        {
            return null;
        }
    }

    public long getSelectedItemId()
    {
        return w;
    }

    public int getSelectedItemPosition()
    {
        return v;
    }

    public abstract View getSelectedView();

    void h()
    {
        if (x != B || y != C)
        {
            f();
            B = x;
            C = y;
        }
    }

    int i()
    {
        int j2 = z;
        if (j2 != 0) goto _L2; else goto _L1
_L1:
        int l1 = -1;
_L4:
        return l1;
_L2:
        Adapter adapter;
        int i1;
        boolean flag;
        long l2;
        long l3;
        l2 = m;
        i1 = l;
        if (l2 == 0x8000000000000000L)
        {
            return -1;
        }
        i1 = Math.min(j2 - 1, Math.max(0, i1));
        l3 = SystemClock.uptimeMillis();
        flag = false;
        adapter = getAdapter();
        if (adapter == null)
        {
            return -1;
        }
        break MISSING_BLOCK_LABEL_196;
_L6:
        int j1;
        int k1;
        boolean flag1;
        if (flag1 || flag && l1 == 0)
        {
            j1++;
            flag = false;
            i1 = j1;
        } else
        if (l1 != 0 || !flag && !flag1)
        {
            k1--;
            flag = true;
            i1 = k1;
        }
_L7:
        if (SystemClock.uptimeMillis() > l3 + 100L)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = i1;
        if (adapter.getItemId(i1) == l2) goto _L4; else goto _L3
_L3:
        if (j1 == j2 - 1)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (k1 == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (l1 == 0 || !flag1) goto _L6; else goto _L5
_L5:
        return -1;
        k1 = i1;
        int i2 = i1;
        j1 = i1;
        i1 = i2;
          goto _L7
    }

    void j()
    {
label0:
        {
            if (getChildCount() > 0)
            {
                o = true;
                n = a;
                if (x < 0)
                {
                    break label0;
                }
                View view = getChildAt(x - j);
                m = w;
                l = v;
                if (view != null)
                {
                    k = view.getTop();
                }
                p = 0;
            }
            return;
        }
        View view1 = getChildAt(0);
        Adapter adapter = getAdapter();
        if (j >= 0 && j < adapter.getCount())
        {
            m = adapter.getItemId(j);
        } else
        {
            m = -1L;
        }
        l = j;
        if (view1 != null)
        {
            k = view1.getTop();
        }
        p = 1;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(e);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
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

    public void removeViewAt(int i1)
    {
        throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
    }

    public abstract void setAdapter(Adapter adapter);

    public void setEmptyView(View view)
    {
        b = view;
        view = getAdapter();
        boolean flag;
        if (view == null || view.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
    }

    public void setFocusable(boolean flag)
    {
        boolean flag2 = true;
        Adapter adapter = getAdapter();
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
        if (!d()) goto _L2; else goto _L5
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
        Adapter adapter = getAdapter();
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
        if (!d()) goto _L2; else goto _L5
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

    void setNextSelectedPositionInt(int i1)
    {
        v = i1;
        w = a(i1);
        if (o && p == 0 && i1 >= 0)
        {
            l = i1;
            m = w;
        }
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
    }

    public void setOnItemClickListener(z z1)
    {
        s = z1;
    }

    public void setOnItemLongClickListener(aa aa)
    {
        if (!isLongClickable())
        {
            setLongClickable(true);
        }
        t = aa;
    }

    public void setOnItemSelectedListener(ab ab1)
    {
        r = ab1;
    }

    void setSelectedPositionInt(int i1)
    {
        x = i1;
        y = a(i1);
    }

    public abstract void setSelection(int i1);
}
