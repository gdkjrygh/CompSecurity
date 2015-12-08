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
//            z, x, aa

abstract class v extends ViewGroup
{

    int A;
    int B;
    long C;
    boolean D;
    private int a;
    private View b;
    private boolean c;
    private boolean d;
    private aa e;
    int k;
    int l;
    int m;
    long n;
    long o;
    boolean p;
    int q;
    boolean r;
    z s;
    x t;
    boolean u;
    int v;
    long w;
    int x;
    long y;
    int z;

    v(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        k = 0;
        n = 0x8000000000000000L;
        p = false;
        r = false;
        v = -1;
        w = 0x8000000000000000L;
        x = -1;
        y = 0x8000000000000000L;
        B = -1;
        C = 0x8000000000000000L;
        D = false;
    }

    private long a(int i)
    {
        Adapter adapter = c();
        if (adapter == null || i < 0)
        {
            return 0x8000000000000000L;
        } else
        {
            return adapter.getItemId(i);
        }
    }

    static Parcelable a(v v1)
    {
        return v1.onSaveInstanceState();
    }

    private void a()
    {
        if (s == null)
        {
            return;
        }
        int i = v;
        if (i >= 0)
        {
            b();
            s.a(i, c().getItemId(i));
            return;
        } else
        {
            z z1 = s;
            return;
        }
    }

    static void a(v v1, Parcelable parcelable)
    {
        v1.onRestoreInstanceState(parcelable);
    }

    static void b(v v1)
    {
        v1.a();
    }

    public void a(x x1)
    {
        t = x1;
    }

    public final boolean a(View view, int i, long l1)
    {
        if (t != null)
        {
            playSoundEffect(0);
            if (view != null)
            {
                view.sendAccessibilityEvent(1);
            }
            t.a(view, i);
            return true;
        } else
        {
            return false;
        }
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

    public abstract View b();

    final void b(int i)
    {
        x = i;
        y = a(i);
    }

    public abstract Adapter c();

    final void c(int i)
    {
        v = i;
        w = a(i);
        if (p && q == 0 && i >= 0)
        {
            m = i;
            n = w;
        }
    }

    protected boolean canAnimate()
    {
        return super.canAnimate() && z > 0;
    }

    public final int d()
    {
        return v;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        View view = b();
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

    final void e()
    {
label0:
        {
            boolean flag1 = true;
            Adapter adapter = c();
            boolean flag;
            boolean flag2;
            if (adapter == null || adapter.getCount() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && d)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            super.setFocusableInTouchMode(flag2);
            if (flag && c)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            super.setFocusable(flag2);
            if (b != null)
            {
                flag = flag1;
                if (adapter != null)
                {
                    if (adapter.isEmpty())
                    {
                        flag = flag1;
                    } else
                    {
                        flag = false;
                    }
                }
                if (!flag)
                {
                    break label0;
                }
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
            }
            return;
        }
        if (b != null)
        {
            b.setVisibility(8);
        }
        setVisibility(0);
    }

    final void f()
    {
        int k1;
        k1 = z;
        if (k1 <= 0)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        if (!p) goto _L2; else goto _L1
_L1:
        int l1;
        p = false;
        l1 = z;
        if (l1 == 0) goto _L4; else goto _L3
_L3:
        int i;
        long l2;
        l2 = n;
        i = m;
        if (l2 == 0x8000000000000000L) goto _L4; else goto _L5
_L5:
        Adapter adapter;
        int j;
        boolean flag;
        long l3;
        j = Math.min(l1 - 1, Math.max(0, i));
        l3 = SystemClock.uptimeMillis();
        flag = false;
        adapter = c();
        if (adapter == null) goto _L4; else goto _L6
_L6:
        int i1;
        int j1;
        i1 = j;
        i = j;
        j1 = j;
        j = ((flag) ? 1 : 0);
_L12:
        if (SystemClock.uptimeMillis() > l3 + 100L) goto _L4; else goto _L7
_L7:
        if (adapter.getItemId(i) != l2) goto _L9; else goto _L8
_L8:
        if (i < 0) goto _L2; else goto _L10
_L10:
        c(i);
        i = 1;
_L13:
        j = i;
        if (i == 0)
        {
            i1 = v;
            j = i1;
            if (i1 >= k1)
            {
                j = k1 - 1;
            }
            i1 = j;
            if (j < 0)
            {
                i1 = 0;
            }
            if (i1 >= 0);
            j = i;
            if (i1 >= 0)
            {
                c(i1);
                g();
                j = 1;
            }
        }
_L14:
        if (j == 0)
        {
            x = -1;
            y = 0x8000000000000000L;
            v = -1;
            w = 0x8000000000000000L;
            p = false;
            g();
        }
        return;
_L9:
        boolean flag1;
        if (j1 == l1 - 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i1 == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag && flag1) goto _L4; else goto _L11
_L11:
        if (flag1 || j != 0 && !flag)
        {
            j1++;
            j = 0;
            i = j1;
        } else
        if (flag || j == 0 && !flag1)
        {
            i1--;
            j = 1;
            i = i1;
        }
          goto _L12
_L4:
        i = -1;
          goto _L8
_L2:
        i = 0;
          goto _L13
        j = 0;
          goto _L14
    }

    final void g()
    {
        if (x != B || y != C)
        {
            if (s != null)
            {
                if (r || D)
                {
                    if (e == null)
                    {
                        e = new aa(this, (byte)0);
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
            B = x;
            C = y;
        }
    }

    final void h()
    {
label0:
        {
            if (getChildCount() > 0)
            {
                p = true;
                o = a;
                if (x < 0)
                {
                    break label0;
                }
                View view = getChildAt(x - k);
                n = w;
                m = v;
                if (view != null)
                {
                    l = view.getTop();
                }
                q = 0;
            }
            return;
        }
        View view1 = getChildAt(0);
        Adapter adapter = c();
        if (k >= 0 && k < adapter.getCount())
        {
            n = adapter.getItemId(k);
        } else
        {
            n = -1L;
        }
        m = k;
        if (view1 != null)
        {
            l = view1.getTop();
        }
        q = 1;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(e);
    }

    protected void onLayout(boolean flag, int i, int j, int i1, int j1)
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

    public void setFocusable(boolean flag)
    {
        boolean flag2 = true;
        Adapter adapter = c();
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
        if (flag && !flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        super.setFocusable(flag);
    }

    public void setFocusableInTouchMode(boolean flag)
    {
        boolean flag2 = true;
        Adapter adapter = c();
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
        if (flag && !flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        super.setFocusableInTouchMode(flag);
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
    }
}
