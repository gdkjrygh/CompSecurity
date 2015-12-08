// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.n;
import android.support.v4.view.o;
import android.support.v7.a.g;
import android.support.v7.a.h;
import android.support.v7.internal.view.a;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            j, g, ActionMenuView, s, 
//            ActionMenuItemView, o, e, ag, 
//            aj, c, d, f, 
//            ab, af

public final class ActionMenuPresenter extends j
    implements o
{

    final android.support.v7.internal.view.menu.g a = new android.support.v7.internal.view.menu.g(this, (byte)0);
    int b;
    private View i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private final SparseBooleanArray t = new SparseBooleanArray();
    private View u;
    private f v;
    private c w;
    private d x;

    public ActionMenuPresenter(Context context)
    {
        super(context, h.i, h.h);
    }

    static c a(ActionMenuPresenter actionmenupresenter, c c1)
    {
        actionmenupresenter.w = null;
        return null;
    }

    static d a(ActionMenuPresenter actionmenupresenter, d d1)
    {
        actionmenupresenter.x = null;
        return null;
    }

    static f a(ActionMenuPresenter actionmenupresenter, f f1)
    {
        actionmenupresenter.v = f1;
        return f1;
    }

    public final af a(ViewGroup viewgroup)
    {
        viewgroup = super.a(viewgroup);
        ((ActionMenuView)viewgroup).setPresenter(this);
        return viewgroup;
    }

    public final View a(s s1, View view, ViewGroup viewgroup)
    {
        View view1 = s1.getActionView();
        if (view1 == null || s1.n())
        {
            view1 = view;
            if (!(view instanceof ActionMenuItemView))
            {
                view1 = null;
            }
            view1 = super.a(s1, view1, viewgroup);
        }
        byte byte0;
        if (s1.isActionViewExpanded())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view1.setVisibility(byte0);
        s1 = (ActionMenuView)viewgroup;
        view = view1.getLayoutParams();
        if (!s1.checkLayoutParams(view))
        {
            view1.setLayoutParams(s1.a(view));
        }
        return view1;
    }

    public final void a()
    {
        if (!o)
        {
            n = d.getResources().getInteger(g.a);
        }
        if (e != null)
        {
            e.b(true);
        }
    }

    public final void a(int i1)
    {
        n = 0x7fffffff;
        o = true;
    }

    public final void a(int i1, boolean flag)
    {
        l = i1;
        p = true;
        q = true;
    }

    public final void a(Context context, android.support.v7.internal.view.menu.o o1)
    {
        super.a(context, o1);
        o1 = context.getResources();
        context = android.support.v7.internal.view.a.a(context);
        if (!k)
        {
            int i1;
            int j1;
            boolean flag;
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j = flag;
        }
        if (!q)
        {
            l = context.b();
        }
        if (!o)
        {
            n = context.a();
        }
        i1 = l;
        if (j)
        {
            if (i == null)
            {
                i = new e(this, c);
                j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                i.measure(j1, j1);
            }
            i1 -= i.getMeasuredWidth();
        } else
        {
            i = null;
        }
        m = i1;
        s = (int)(56F * o1.getDisplayMetrics().density);
        u = null;
    }

    public final void a(android.support.v7.internal.view.menu.o o1, boolean flag)
    {
        d();
        super.a(o1, flag);
    }

    public final void a(s s1, ag ag1)
    {
        ag1.a(s1, 0);
        s1 = (ActionMenuView)h;
        ((ActionMenuItemView)ag1).setItemInvoker(s1);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            super.a(null);
            return;
        } else
        {
            e.a(false);
            return;
        }
    }

    public final boolean a(aj aj1)
    {
        MenuItem menuitem;
        ViewGroup viewgroup;
        if (!aj1.hasVisibleItems())
        {
            return false;
        }
        aj aj2;
        for (aj2 = aj1; aj2.t() != e; aj2 = (aj)aj2.t()) { }
        menuitem = aj2.getItem();
        viewgroup = (ViewGroup)h;
        if (viewgroup == null) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = viewgroup.getChildCount();
        i1 = 0;
_L7:
        if (i1 >= j1) goto _L2; else goto _L3
_L3:
        View view = viewgroup.getChildAt(i1);
        if (!(view instanceof ag) || ((ag)view).a() != menuitem) goto _L5; else goto _L4
_L5:
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        view = null;
_L4:
        if (view == null)
        {
            if (i == null)
            {
                return false;
            }
            view = i;
        }
        b = aj1.getItem().getItemId();
        w = new c(this, aj1);
        w.a(null);
        super.a(aj1);
        return true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean a(s s1)
    {
        return s1.i();
    }

    public final boolean a(ViewGroup viewgroup, int i1)
    {
        if (viewgroup.getChildAt(i1) == i)
        {
            return false;
        } else
        {
            return super.a(viewgroup, i1);
        }
    }

    public final void b(boolean flag)
    {
        r = flag;
    }

    public final boolean b()
    {
        if (j && !f() && e != null && h != null && x == null)
        {
            x = new d(this, new f(this, d, e, i, true));
            ((View)h).post(x);
            super.a(null);
            return true;
        } else
        {
            return false;
        }
    }

    public final void c(boolean flag)
    {
        boolean flag1 = true;
        boolean flag2 = false;
        super.c(flag);
        if (h == null)
        {
            return;
        }
        if (e != null)
        {
            ArrayList arraylist = e.l();
            int k1 = arraylist.size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                n n1 = ((s)arraylist.get(i1)).m();
                if (n1 != null)
                {
                    n1.a(this);
                }
            }

        }
        Object obj;
        int j1;
        if (e != null)
        {
            obj = e.m();
        } else
        {
            obj = null;
        }
        j1 = ((flag2) ? 1 : 0);
        if (j)
        {
            j1 = ((flag2) ? 1 : 0);
            if (obj != null)
            {
                j1 = ((ArrayList) (obj)).size();
                if (j1 == 1)
                {
                    if (!((s)((ArrayList) (obj)).get(0)).isActionViewExpanded())
                    {
                        j1 = 1;
                    } else
                    {
                        j1 = 0;
                    }
                } else
                if (j1 > 0)
                {
                    j1 = ((flag1) ? 1 : 0);
                } else
                {
                    j1 = 0;
                }
            }
        }
        if (j1 == 0) goto _L2; else goto _L1
_L1:
        if (i == null)
        {
            i = new e(this, c);
        }
        obj = (ViewGroup)i.getParent();
        if (obj != h)
        {
            if (obj != null)
            {
                ((ViewGroup) (obj)).removeView(i);
            }
            obj = (ActionMenuView)h;
            ((ActionMenuView) (obj)).addView(i, ((ActionMenuView) (obj)).a());
        }
_L4:
        ((ActionMenuView)h).setOverflowReserved(j);
        return;
_L2:
        if (i != null && i.getParent() == h)
        {
            ((ViewGroup)h).removeView(i);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean c()
    {
        if (x != null && h != null)
        {
            ((View)h).removeCallbacks(x);
            x = null;
            return true;
        }
        f f1 = v;
        if (f1 != null)
        {
            f1.b();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean d()
    {
        return c() | e();
    }

    public final boolean e()
    {
        if (w != null)
        {
            w.a();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean f()
    {
        return v != null && v.c();
    }

    public final boolean g()
    {
        return j;
    }

    public final boolean h()
    {
        ArrayList arraylist;
        ViewGroup viewgroup;
        int k1;
        int l1;
        int l4;
        int j6;
        int k6;
label0:
        {
            arraylist = e.j();
            j6 = arraylist.size();
            int i1 = n;
            l4 = m;
            k6 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            viewgroup = (ViewGroup)h;
            l1 = 0;
            int i2 = 0;
            boolean flag = false;
            k1 = 0;
            while (k1 < j6) 
            {
                s s1 = (s)arraylist.get(k1);
                if (s1.k())
                {
                    l1++;
                } else
                if (s1.j())
                {
                    i2++;
                } else
                {
                    flag = true;
                }
                if (r && s1.isActionViewExpanded())
                {
                    i1 = 0;
                }
                k1++;
            }
            k1 = i1;
            if (!j)
            {
                break label0;
            }
            if (!flag)
            {
                k1 = i1;
                if (l1 + i2 <= i1)
                {
                    break label0;
                }
            }
            k1 = i1 - 1;
        }
        k1 -= l1;
        SparseBooleanArray sparsebooleanarray = t;
        sparsebooleanarray.clear();
        int j1;
        int k2;
        boolean flag1;
        int j4;
        int k4;
        if (p)
        {
            j1 = l4 / s;
            l1 = s;
            int j2 = s;
            j4 = (l4 % l1) / j1 + j2;
        } else
        {
            j4 = 0;
            j1 = 0;
        }
        flag1 = false;
        k4 = 0;
        l1 = j1;
        j1 = k1;
        k2 = l4;
        k1 = ((flag1) ? 1 : 0);
        while (k4 < j6) 
        {
            s s2 = (s)arraylist.get(k4);
            if (s2.k())
            {
                View view = a(s2, u, viewgroup);
                if (u == null)
                {
                    u = view;
                }
                int l2;
                int i5;
                if (p)
                {
                    l2 = l1 - android.support.v7.internal.view.menu.ActionMenuView.a(view, j4, l1, k6, 0);
                } else
                {
                    view.measure(k6, k6);
                    l2 = l1;
                }
                l1 = view.getMeasuredWidth();
                if (k1 == 0)
                {
                    k1 = l1;
                }
                i5 = s2.getGroupId();
                if (i5 != 0)
                {
                    sparsebooleanarray.put(i5, true);
                }
                s2.d(true);
                l1 = k2 - l1;
                k2 = j1;
                j1 = l2;
            } else
            if (s2.j())
            {
                int l6 = s2.getGroupId();
                boolean flag3 = sparsebooleanarray.get(l6);
                boolean flag2;
                if ((j1 > 0 || flag3) && k2 > 0 && (!p || l1 > 0))
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                if (flag2)
                {
                    View view1 = a(s2, u, viewgroup);
                    if (u == null)
                    {
                        u = view1;
                    }
                    int j3;
                    int k5;
                    if (p)
                    {
                        int j5 = android.support.v7.internal.view.menu.ActionMenuView.a(view1, j4, l1, k6, 0);
                        int i3 = l1 - j5;
                        l1 = i3;
                        if (j5 == 0)
                        {
                            flag2 = false;
                            l1 = i3;
                        }
                    } else
                    {
                        view1.measure(k6, k6);
                    }
                    k5 = view1.getMeasuredWidth();
                    k2 -= k5;
                    j3 = k1;
                    if (k1 == 0)
                    {
                        j3 = k5;
                    }
                    if (p)
                    {
                        int l5;
                        if (k2 >= 0)
                        {
                            k1 = 1;
                        } else
                        {
                            k1 = 0;
                        }
                        flag2 &= k1;
                        k1 = l1;
                        l1 = j3;
                    } else
                    {
                        if (k2 + j3 > 0)
                        {
                            k1 = 1;
                        } else
                        {
                            k1 = 0;
                        }
                        flag2 &= k1;
                        k1 = l1;
                        l1 = j3;
                    }
                } else
                {
                    int l3 = l1;
                    l1 = k1;
                    k1 = l3;
                }
                if (flag2 && l6 != 0)
                {
                    sparsebooleanarray.put(l6, true);
                } else
                if (flag3)
                {
                    sparsebooleanarray.put(l6, false);
                    int i6 = 0;
                    while (i6 < k4) 
                    {
                        s s3 = (s)arraylist.get(i6);
                        int k3 = j1;
                        if (s3.getGroupId() == l6)
                        {
                            k3 = j1;
                            if (s3.i())
                            {
                                k3 = j1 + 1;
                            }
                            s3.d(false);
                        }
                        i6++;
                        j1 = k3;
                    }
                }
                j3 = j1;
                if (flag2)
                {
                    j3 = j1 - 1;
                }
                s2.d(flag2);
                l5 = l1;
                l1 = k2;
                k2 = j3;
                j1 = k1;
                k1 = l5;
            } else
            {
                int i4 = j1;
                j1 = l1;
                l1 = k2;
                k2 = i4;
            }
            i5 = k4 + 1;
            l2 = l1;
            k4 = k2;
            l1 = j1;
            k2 = l2;
            j1 = k4;
            k4 = i5;
        }
        return true;
    }
}
