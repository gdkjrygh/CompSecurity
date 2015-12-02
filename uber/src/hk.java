// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public abstract class hk
{

    private boolean a;
    private boolean b;
    gc q;
    public RecyclerView r;
    hr s;

    public hk()
    {
        a = false;
        b = false;
    }

    private static int a(int i1, int j1, int k1, boolean flag)
    {
        int l1;
        int i2;
        i2 = 0x40000000;
        l1 = Math.max(0, i1 - j1);
        if (!flag) goto _L2; else goto _L1
_L1:
        if (k1 >= 0)
        {
            i1 = k1;
            j1 = i2;
        } else
        {
            j1 = 0;
            i1 = 0;
        }
_L4:
        return android.view.View.MeasureSpec.makeMeasureSpec(i1, j1);
_L2:
        j1 = i2;
        i1 = k1;
        if (k1 < 0)
        {
            if (k1 == -1)
            {
                i1 = l1;
                j1 = i2;
            } else
            if (k1 == -2)
            {
                j1 = 0x80000000;
                i1 = l1;
            } else
            {
                j1 = 0;
                i1 = 0;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(View view, int i1, int j1, int k1, int l1)
    {
        Rect rect = ((android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams()).b;
        view.layout(rect.left + i1, rect.top + j1, k1 - rect.right, l1 - rect.bottom);
    }

    private void a(View view, int i1, android.support.v7.widget.RecyclerView.LayoutParams layoutparams)
    {
        hw hw1 = RecyclerView.b(view);
        if (hw1.p())
        {
            r.e.b(view);
        } else
        {
            r.e.a(view);
        }
        q.a(view, i1, layoutparams, hw1.p());
    }

    private void a(View view, int i1, boolean flag)
    {
        hw hw1;
        android.support.v7.widget.RecyclerView.LayoutParams layoutparams;
        hw1 = RecyclerView.b(view);
        if (flag || hw1.p())
        {
            r.e.b(view);
        } else
        {
            r.e.a(view);
        }
        layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
        if (!hw1.i() && !hw1.g()) goto _L2; else goto _L1
_L1:
        if (hw1.g())
        {
            hw1.h();
        } else
        {
            hw1.j();
        }
        q.a(view, i1, view.getLayoutParams(), false);
_L4:
        if (layoutparams.d)
        {
            hw1.a.invalidate();
            layoutparams.d = false;
        }
        return;
_L2:
        if (view.getParent() == r)
        {
            int k1 = q.c(view);
            int j1 = i1;
            if (i1 == -1)
            {
                j1 = q.b();
            }
            if (k1 == -1)
            {
                throw new IllegalStateException((new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:")).append(r.indexOfChild(view)).toString());
            }
            if (k1 != j1)
            {
                RecyclerView.e(r).f(k1, j1);
            }
        } else
        {
            q.a(view, i1, false);
            layoutparams.c = true;
            if (s != null && s.e())
            {
                s.a(view);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(hk hk1, hr hr1)
    {
        hk1.b(hr1);
    }

    private void a(ho ho1, int i1, View view)
    {
        hw hw1 = RecyclerView.b(view);
        if (hw1.c())
        {
            return;
        }
        if (hw1.l() && !hw1.p() && !hw1.n() && !RecyclerView.g(r).b())
        {
            b(i1);
            ho1.a(hw1);
            return;
        } else
        {
            i(i1);
            ho1.c(view);
            return;
        }
    }

    private void a(ho ho1, ht ht1, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        if (ViewCompat.canScrollVertically(r, -1) || ViewCompat.canScrollHorizontally(r, -1))
        {
            accessibilitynodeinfocompat.addAction(8192);
            accessibilitynodeinfocompat.setScrollable(true);
        }
        if (ViewCompat.canScrollVertically(r, 1) || ViewCompat.canScrollHorizontally(r, 1))
        {
            accessibilitynodeinfocompat.addAction(4096);
            accessibilitynodeinfocompat.setScrollable(true);
        }
        accessibilitynodeinfocompat.setCollectionInfo(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(a(ho1, ht1), b(ho1, ht1), false, 0));
    }

    public static boolean a(hk hk1)
    {
        return hk1.a;
    }

    private void b(int i1)
    {
        if (d(i1) != null)
        {
            q.a(i1);
        }
    }

    private void b(AccessibilityEvent accessibilityevent)
    {
        boolean flag1 = true;
        accessibilityevent = AccessibilityEventCompat.asRecord(accessibilityevent);
        if (r != null && accessibilityevent != null)
        {
            boolean flag = flag1;
            if (!ViewCompat.canScrollVertically(r, 1))
            {
                flag = flag1;
                if (!ViewCompat.canScrollVertically(r, -1))
                {
                    flag = flag1;
                    if (!ViewCompat.canScrollHorizontally(r, -1))
                    {
                        if (ViewCompat.canScrollHorizontally(r, 1))
                        {
                            flag = flag1;
                        } else
                        {
                            flag = false;
                        }
                    }
                }
            }
            accessibilityevent.setScrollable(flag);
            if (RecyclerView.g(r) != null)
            {
                accessibilityevent.setItemCount(RecyclerView.g(r).a());
                return;
            }
        }
    }

    private void b(hr hr1)
    {
        if (s == hr1)
        {
            s = null;
        }
    }

    public static boolean b(hk hk1)
    {
        hk1.a = false;
        return false;
    }

    public static int c(View view)
    {
        return ((android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams()).e();
    }

    private void c(View view, int i1)
    {
        a(view, i1, (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams());
    }

    private boolean c(RecyclerView recyclerview)
    {
        return o() || recyclerview.g();
    }

    public static int e(View view)
    {
        Rect rect = ((android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams()).b;
        int i1 = view.getMeasuredWidth();
        int j1 = rect.left;
        return rect.right + (i1 + j1);
    }

    public static int f(View view)
    {
        Rect rect = ((android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams()).b;
        int i1 = view.getMeasuredHeight();
        int j1 = rect.top;
        return rect.bottom + (i1 + j1);
    }

    private void f(int i1, int j1)
    {
        View view = d(i1);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Cannot move a child from non-existing index:")).append(i1).toString());
        } else
        {
            i(i1);
            c(view, j1);
            return;
        }
    }

    public static int g(View view)
    {
        return view.getLeft() - n(view);
    }

    public static int h(View view)
    {
        return view.getTop() - l(view);
    }

    public static int i(View view)
    {
        return view.getRight() + o(view);
    }

    private void i(int i1)
    {
        d(i1);
        j(i1);
    }

    public static int j(View view)
    {
        return view.getBottom() + m(view);
    }

    private void j(int i1)
    {
        q.e(i1);
    }

    private void k(View view)
    {
        q.b(view);
    }

    private boolean k(int i1)
    {
        if (r != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        i1;
        JVM INSTR lookupswitch 2: default 36
    //                   4096: 122
    //                   8192: 59;
           goto _L3 _L4 _L5
_L3:
        int j1;
        i1 = 0;
        j1 = 0;
_L8:
        if (j1 != 0 || i1 != 0)
        {
            r.scrollBy(i1, j1);
            return true;
        }
          goto _L1
_L5:
        int k1;
        int l1;
        int i2;
        if (ViewCompat.canScrollVertically(r, -1))
        {
            i1 = -(s() - u() - w());
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if (!ViewCompat.canScrollHorizontally(r, -1)) goto _L7; else goto _L6
_L6:
        k1 = -(r() - t() - v());
        j1 = i1;
        i1 = k1;
          goto _L8
_L4:
        if (ViewCompat.canScrollVertically(r, 1))
        {
            i1 = s() - u() - w();
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if (!ViewCompat.canScrollHorizontally(r, 1)) goto _L7; else goto _L9
_L9:
        k1 = r();
        l1 = t();
        i2 = v();
        j1 = i1;
        i1 = k1 - l1 - i2;
          goto _L8
_L7:
        i1 = 0;
          goto _L8
    }

    private static int l(View view)
    {
        return ((android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams()).b.top;
    }

    private static int m(View view)
    {
        return ((android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams()).b.bottom;
    }

    private static int n(View view)
    {
        return ((android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams()).b.left;
    }

    private static int o(View view)
    {
        return ((android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams()).b.right;
    }

    final boolean A()
    {
        Object obj = r.a;
        obj = r.e;
        return false;
    }

    public int a(int i1, ho ho1, ht ht1)
    {
        return 0;
    }

    public int a(ho ho1, ht ht1)
    {
        while (r == null || RecyclerView.g(r) == null || !f()) 
        {
            return 1;
        }
        return RecyclerView.g(r).a();
    }

    public int a(ht ht1)
    {
        return 0;
    }

    public android.support.v7.widget.RecyclerView.LayoutParams a(Context context, AttributeSet attributeset)
    {
        return new android.support.v7.widget.RecyclerView.LayoutParams(context, attributeset);
    }

    public android.support.v7.widget.RecyclerView.LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.support.v7.widget.RecyclerView.LayoutParams)
        {
            return new android.support.v7.widget.RecyclerView.LayoutParams((android.support.v7.widget.RecyclerView.LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new android.support.v7.widget.RecyclerView.LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new android.support.v7.widget.RecyclerView.LayoutParams(layoutparams);
        }
    }

    public View a(int i1)
    {
        int k1 = q();
        for (int j1 = 0; j1 < k1; j1++)
        {
            View view = d(j1);
            hw hw1 = RecyclerView.b(view);
            if (hw1 != null && hw1.d() == i1 && !hw1.c() && (r.e.a() || !hw1.p()))
            {
                return view;
            }
        }

        return null;
    }

    public void a()
    {
    }

    public void a(int i1, int j1)
    {
    }

    public final void a(int i1, ho ho1)
    {
        View view = d(i1);
        b(i1);
        ho1.a(view);
    }

    public void a(Parcelable parcelable)
    {
    }

    final void a(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        a(r.a, r.e, accessibilitynodeinfocompat);
    }

    public final void a(RecyclerView recyclerview)
    {
        if (recyclerview == null)
        {
            r = null;
            q = null;
            return;
        } else
        {
            r = recyclerview;
            q = recyclerview.c;
            return;
        }
    }

    public void a(RecyclerView recyclerview, int i1)
    {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public void a(RecyclerView recyclerview, ho ho1)
    {
    }

    public final void a(View view)
    {
        a(view, -1);
    }

    public final void a(View view, int i1)
    {
        a(view, i1, true);
    }

    public final void a(View view, Rect rect)
    {
        if (r == null)
        {
            rect.set(0, 0, 0, 0);
            return;
        } else
        {
            rect.set(r.d(view));
            return;
        }
    }

    public final void a(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        hw hw1 = RecyclerView.b(view);
        if (hw1 != null && !hw1.p() && !q.d(hw1.a))
        {
            a(r.a, r.e, view, accessibilitynodeinfocompat);
        }
    }

    public final void a(View view, ho ho1)
    {
        k(view);
        ho1.a(view);
    }

    public void a(AccessibilityEvent accessibilityevent)
    {
        Object obj = r.a;
        obj = r.e;
        b(accessibilityevent);
    }

    public final void a(ho ho1)
    {
        for (int i1 = q() - 1; i1 >= 0; i1--)
        {
            a(ho1, i1, d(i1));
        }

    }

    public void a(ho ho1, ht ht1, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        int i1;
        int j1;
        if (f())
        {
            i1 = c(view);
        } else
        {
            i1 = 0;
        }
        if (e())
        {
            j1 = c(view);
        } else
        {
            j1 = 0;
        }
        accessibilitynodeinfocompat.setCollectionItemInfo(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i1, 1, j1, 1, false, false));
    }

    public final void a(hr hr1)
    {
        if (s != null && hr1 != s && s.e())
        {
            s.c();
        }
        s = hr1;
        s.a(r, this);
    }

    public final void a(Runnable runnable)
    {
        if (r != null)
        {
            ViewCompat.postOnAnimation(r, runnable);
        }
    }

    public void a(String s1)
    {
        if (r != null)
        {
            r.a(s1);
        }
    }

    public boolean a(android.support.v7.widget.RecyclerView.LayoutParams layoutparams)
    {
        return layoutparams != null;
    }

    public final boolean a(RecyclerView recyclerview, View view, Rect rect, boolean flag)
    {
        int k2 = t();
        int l1 = u();
        int l2 = r() - v();
        int j2 = s();
        int k3 = w();
        int i3 = view.getLeft() + rect.left;
        int i2 = view.getTop() + rect.top;
        int j3 = i3 + rect.width();
        int l3 = rect.height();
        int i1 = Math.min(0, i3 - k2);
        int j1 = Math.min(0, i2 - l1);
        int k1 = Math.max(0, j3 - l2);
        j2 = Math.max(0, (i2 + l3) - (j2 - k3));
        if (p() == 1)
        {
            if (k1 != 0)
            {
                i1 = k1;
            } else
            {
                i1 = Math.max(i1, j3 - l2);
            }
        } else
        if (i1 == 0)
        {
            i1 = Math.min(i3 - k2, k1);
        }
        if (j1 == 0)
        {
            j1 = Math.min(i2 - l1, j2);
        }
        if (i1 != 0 || j1 != 0)
        {
            if (flag)
            {
                recyclerview.scrollBy(i1, j1);
            } else
            {
                recyclerview.a(i1, j1);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public int b(int i1, ho ho1, ht ht1)
    {
        return 0;
    }

    public int b(ho ho1, ht ht1)
    {
        while (r == null || RecyclerView.g(r) == null || !e()) 
        {
            return 1;
        }
        return RecyclerView.g(r).a();
    }

    public int b(ht ht1)
    {
        return 0;
    }

    public abstract android.support.v7.widget.RecyclerView.LayoutParams b();

    public void b(int i1, int j1)
    {
    }

    public final void b(RecyclerView recyclerview, ho ho1)
    {
        b = false;
        a(recyclerview, ho1);
    }

    public final void b(View view)
    {
        b(view, -1);
    }

    public final void b(View view, int i1)
    {
        a(view, i1, false);
    }

    public final void b(ho ho1)
    {
        int j1 = ho1.c();
        for (int i1 = j1 - 1; i1 >= 0; i1--)
        {
            View view = ho1.c(i1);
            hw hw1 = RecyclerView.b(view);
            if (hw1.c())
            {
                continue;
            }
            hw1.a(false);
            if (hw1.r())
            {
                r.removeDetachedView(view, false);
            }
            if (r.d != null)
            {
                r.d.c(hw1);
            }
            hw1.a(true);
            ho1.b(view);
        }

        ho1.d();
        if (j1 > 0)
        {
            r.invalidate();
        }
    }

    public final boolean b(RecyclerView recyclerview)
    {
        return c(recyclerview);
    }

    public final boolean b(Runnable runnable)
    {
        if (r != null)
        {
            return r.removeCallbacks(runnable);
        } else
        {
            return false;
        }
    }

    public int c(ht ht1)
    {
        return 0;
    }

    public View c(int i1, ho ho1, ht ht1)
    {
        return null;
    }

    public void c(int i1)
    {
    }

    public void c(int i1, int j1)
    {
    }

    public final void c(ho ho1)
    {
        for (int i1 = q() - 1; i1 >= 0; i1--)
        {
            if (!RecyclerView.b(d(i1)).c())
            {
                a(i1, ho1);
            }
        }

    }

    public void c(ho ho1, ht ht1)
    {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public boolean c()
    {
        return false;
    }

    public int d(ht ht1)
    {
        return 0;
    }

    public Parcelable d()
    {
        return null;
    }

    public final View d(int i1)
    {
        if (q != null)
        {
            return q.b(i1);
        } else
        {
            return null;
        }
    }

    public void d(int i1, int j1)
    {
    }

    public final void d(View view)
    {
        android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
        Rect rect = r.d(view);
        int i1 = rect.left;
        int j1 = rect.right;
        int k1 = rect.top;
        int l1 = rect.bottom;
        view.measure(a(r(), i1 + j1 + 0 + (t() + v() + layoutparams.leftMargin + layoutparams.rightMargin), layoutparams.width, e()), a(s(), l1 + k1 + 0 + (u() + w() + layoutparams.topMargin + layoutparams.bottomMargin), layoutparams.height, f()));
    }

    public int e(ht ht1)
    {
        return 0;
    }

    public void e(int i1)
    {
        if (r != null)
        {
            r.d(i1);
        }
    }

    public final void e(int i1, int j1)
    {
        RecyclerView.b(r, i1, j1);
    }

    public boolean e()
    {
        return false;
    }

    public int f(ht ht1)
    {
        return 0;
    }

    public void f(int i1)
    {
        if (r != null)
        {
            r.c(i1);
        }
    }

    public boolean f()
    {
        return false;
    }

    public void g(int i1)
    {
    }

    final boolean h(int i1)
    {
        Object obj = r.a;
        obj = r.e;
        return k(i1);
    }

    public final void k()
    {
        if (r != null)
        {
            r.requestLayout();
        }
    }

    public final void l()
    {
        b = true;
    }

    public final boolean m()
    {
        return b;
    }

    public final boolean n()
    {
        return r != null && RecyclerView.u(r);
    }

    public final boolean o()
    {
        return s != null && s.e();
    }

    public final int p()
    {
        return ViewCompat.getLayoutDirection(r);
    }

    public final int q()
    {
        if (q != null)
        {
            return q.b();
        } else
        {
            return 0;
        }
    }

    public final int r()
    {
        if (r != null)
        {
            return r.getWidth();
        } else
        {
            return 0;
        }
    }

    public final int s()
    {
        if (r != null)
        {
            return r.getHeight();
        } else
        {
            return 0;
        }
    }

    public final int t()
    {
        if (r != null)
        {
            return r.getPaddingLeft();
        } else
        {
            return 0;
        }
    }

    public final int u()
    {
        if (r != null)
        {
            return r.getPaddingTop();
        } else
        {
            return 0;
        }
    }

    public final int v()
    {
        if (r != null)
        {
            return r.getPaddingRight();
        } else
        {
            return 0;
        }
    }

    public final int w()
    {
        if (r != null)
        {
            return r.getPaddingBottom();
        } else
        {
            return 0;
        }
    }

    public final View x()
    {
        View view;
        if (r != null)
        {
            if ((view = r.getFocusedChild()) != null && !q.d(view))
            {
                return view;
            }
        }
        return null;
    }

    public final void y()
    {
        if (s != null)
        {
            s.c();
        }
    }

    public final void z()
    {
        a = true;
    }
}
