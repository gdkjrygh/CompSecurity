// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v4.view.ActionProvider;
import android.support.v7.a.h;
import android.support.v7.a.i;
import android.support.v7.internal.view.a;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.aa;
import android.support.v7.internal.view.menu.ad;
import android.support.v7.internal.view.menu.d;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.v;
import android.support.v7.internal.view.menu.z;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            h, ActionMenuView, e, c, 
//            b, d, g

public class ActionMenuPresenter extends d
    implements android.support.v4.view.ActionProvider.SubUiVisibilityListener
{

    final android.support.v7.widget.h g = new android.support.v7.widget.h(this, null);
    int h;
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
    private g v;
    private b w;
    private android.support.v7.widget.d x;
    private c y;

    public ActionMenuPresenter(Context context)
    {
        super(context, i.abc_action_menu_layout, i.abc_action_menu_item_layout);
    }

    static b a(ActionMenuPresenter actionmenupresenter, b b1)
    {
        actionmenupresenter.w = b1;
        return b1;
    }

    static android.support.v7.widget.d a(ActionMenuPresenter actionmenupresenter, android.support.v7.widget.d d1)
    {
        actionmenupresenter.x = d1;
        return d1;
    }

    static g a(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.v;
    }

    static g a(ActionMenuPresenter actionmenupresenter, g g1)
    {
        actionmenupresenter.v = g1;
        return g1;
    }

    private View a(MenuItem menuitem)
    {
        ViewGroup viewgroup = (ViewGroup)f;
        if (viewgroup != null) goto _L2; else goto _L1
_L1:
        View view = null;
_L6:
        return view;
_L2:
        int i1;
        int j1;
        j1 = viewgroup.getChildCount();
        i1 = 0;
_L7:
        if (i1 >= j1) goto _L4; else goto _L3
_L3:
        View view1;
        view1 = viewgroup.getChildAt(i1);
        if (!(view1 instanceof aa))
        {
            continue; /* Loop/switch isn't completed */
        }
        view = view1;
        if (((aa)view1).getItemData() == menuitem) goto _L6; else goto _L5
_L5:
        i1++;
          goto _L7
_L4:
        return null;
    }

    static android.support.v7.widget.d b(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.x;
    }

    static android.support.v7.internal.view.menu.i c(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.c;
    }

    static View d(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.i;
    }

    static z e(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.f;
    }

    static android.support.v7.internal.view.menu.i f(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.c;
    }

    static z g(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.f;
    }

    static b h(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.w;
    }

    public z a(ViewGroup viewgroup)
    {
        viewgroup = super.a(viewgroup);
        ((ActionMenuView)viewgroup).setPresenter(this);
        return viewgroup;
    }

    public View a(m m1, View view, ViewGroup viewgroup)
    {
        View view1 = m1.getActionView();
        if (view1 == null || m1.n())
        {
            view1 = super.a(m1, view, viewgroup);
        }
        byte byte0;
        if (m1.isActionViewExpanded())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view1.setVisibility(byte0);
        m1 = (ActionMenuView)viewgroup;
        view = view1.getLayoutParams();
        if (!m1.checkLayoutParams(view))
        {
            view1.setLayoutParams(m1.a(view));
        }
        return view1;
    }

    public void a(int i1, boolean flag)
    {
        l = i1;
        p = flag;
        q = true;
    }

    public void a(Context context, android.support.v7.internal.view.menu.i i1)
    {
        super.a(context, i1);
        i1 = context.getResources();
        context = android.support.v7.internal.view.a.a(context);
        if (!k)
        {
            j = context.b();
        }
        if (!q)
        {
            l = context.c();
        }
        if (!o)
        {
            n = context.a();
        }
        int j1 = l;
        if (j)
        {
            if (i == null)
            {
                i = new e(this, a);
                int k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                i.measure(k1, k1);
            }
            j1 -= i.getMeasuredWidth();
        } else
        {
            i = null;
        }
        m = j1;
        s = (int)(56F * i1.getDisplayMetrics().density);
        u = null;
    }

    public void a(Configuration configuration)
    {
        if (!o)
        {
            n = b.getResources().getInteger(h.abc_max_action_buttons);
        }
        if (c != null)
        {
            c.b(true);
        }
    }

    public void a(android.support.v7.internal.view.menu.i i1, boolean flag)
    {
        e();
        super.a(i1, flag);
    }

    public void a(m m1, aa aa1)
    {
        aa1.a(m1, 0);
        m1 = (ActionMenuView)f;
        aa1 = (ActionMenuItemView)aa1;
        aa1.setItemInvoker(m1);
        if (y == null)
        {
            y = new c(this, null);
        }
        aa1.setPopupCallback(y);
    }

    public void a(ActionMenuView actionmenuview)
    {
        f = actionmenuview;
        actionmenuview.a(c);
    }

    public void a(boolean flag)
    {
        boolean flag1 = true;
        boolean flag2 = false;
        Object obj = (ViewGroup)((View)f).getParent();
        if (obj != null)
        {
            android.support.v7.internal.c.a.a(((ViewGroup) (obj)));
        }
        super.a(flag);
        ((View)f).requestLayout();
        if (c != null)
        {
            obj = c.k();
            int k1 = ((ArrayList) (obj)).size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                ActionProvider actionprovider = ((m)((ArrayList) (obj)).get(i1)).a();
                if (actionprovider != null)
                {
                    actionprovider.setSubUiVisibilityListener(this);
                }
            }

        }
        int j1;
        if (c != null)
        {
            obj = c.l();
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
                    if (!((m)((ArrayList) (obj)).get(0)).isActionViewExpanded())
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
            i = new e(this, a);
        }
        obj = (ViewGroup)i.getParent();
        if (obj != f)
        {
            if (obj != null)
            {
                ((ViewGroup) (obj)).removeView(i);
            }
            obj = (ActionMenuView)f;
            ((ActionMenuView) (obj)).addView(i, ((ActionMenuView) (obj)).c());
        }
_L4:
        ((ActionMenuView)f).setOverflowReserved(j);
        return;
_L2:
        if (i != null && i.getParent() == f)
        {
            ((ViewGroup)f).removeView(i);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean a(int i1, m m1)
    {
        return m1.j();
    }

    public boolean a(ad ad1)
    {
        if (!ad1.hasVisibleItems())
        {
            return false;
        }
        Object obj;
        for (obj = ad1; ((ad) (obj)).s() != c; obj = (ad)((ad) (obj)).s()) { }
        View view = a(((ad) (obj)).getItem());
        obj = view;
        if (view == null)
        {
            if (i == null)
            {
                return false;
            }
            obj = i;
        }
        h = ad1.getItem().getItemId();
        w = new b(this, b, ad1);
        w.a(((View) (obj)));
        w.a();
        super.a(ad1);
        return true;
    }

    public boolean a(ViewGroup viewgroup, int i1)
    {
        if (viewgroup.getChildAt(i1) == i)
        {
            return false;
        } else
        {
            return super.a(viewgroup, i1);
        }
    }

    public void b(int i1)
    {
        n = i1;
        o = true;
    }

    public void b(boolean flag)
    {
        j = flag;
        k = true;
    }

    public boolean b()
    {
        ArrayList arraylist;
        ViewGroup viewgroup;
        int k1;
        int l1;
        int l3;
        int l4;
        int i5;
label0:
        {
            arraylist = c.i();
            l4 = arraylist.size();
            int i1 = n;
            l3 = m;
            i5 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            viewgroup = (ViewGroup)f;
            l1 = 0;
            int i2 = 0;
            boolean flag = false;
            k1 = 0;
            while (k1 < l4) 
            {
                m m1 = (m)arraylist.get(k1);
                if (m1.l())
                {
                    l1++;
                } else
                if (m1.k())
                {
                    i2++;
                } else
                {
                    flag = true;
                }
                if (r && m1.isActionViewExpanded())
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
        int j1 = 0;
        int k2;
        boolean flag1;
        int j3;
        int k3;
        if (p)
        {
            j1 = l3 / s;
            l1 = s;
            int j2 = s;
            j3 = (l3 % l1) / j1 + j2;
        } else
        {
            j3 = 0;
        }
        k3 = 0;
        flag1 = false;
        l1 = j1;
        j1 = k1;
        k2 = l3;
        k1 = ((flag1) ? 1 : 0);
        while (k3 < l4) 
        {
            m m2 = (m)arraylist.get(k3);
            int l2;
            if (m2.l())
            {
                View view = a(m2, u, viewgroup);
                if (u == null)
                {
                    u = view;
                }
                int i4;
                if (p)
                {
                    l2 = l1 - android.support.v7.widget.ActionMenuView.a(view, j3, l1, i5, 0);
                } else
                {
                    view.measure(i5, i5);
                    l2 = l1;
                }
                l1 = view.getMeasuredWidth();
                if (k1 == 0)
                {
                    k1 = l1;
                }
                i4 = m2.getGroupId();
                if (i4 != 0)
                {
                    sparsebooleanarray.put(i4, true);
                }
                m2.d(true);
                k2 -= l1;
                l1 = j1;
                j1 = k2;
            } else
            if (m2.k())
            {
                int j5 = m2.getGroupId();
                boolean flag3 = sparsebooleanarray.get(j5);
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
                    View view1 = a(m2, u, viewgroup);
                    if (u == null)
                    {
                        u = view1;
                    }
                    int j4;
                    if (p)
                    {
                        l2 = android.support.v7.widget.ActionMenuView.a(view1, j3, l1, i5, 0);
                        if (l2 == 0)
                        {
                            flag2 = false;
                        }
                        l1 -= l2;
                    } else
                    {
                        view1.measure(i5, i5);
                    }
                    l2 = view1.getMeasuredWidth();
                    j4 = k2 - l2;
                    k2 = k1;
                    if (k1 == 0)
                    {
                        k2 = l2;
                    }
                    if (p)
                    {
                        if (j4 >= 0)
                        {
                            k1 = 1;
                        } else
                        {
                            k1 = 0;
                        }
                        flag2 &= k1;
                        k1 = k2;
                        l2 = l1;
                        k2 = j4;
                        l1 = k1;
                        k1 = l2;
                    } else
                    {
                        if (j4 + k2 > 0)
                        {
                            k1 = 1;
                        } else
                        {
                            k1 = 0;
                        }
                        flag2 &= k1;
                        k1 = l1;
                        l1 = k2;
                        k2 = j4;
                    }
                } else
                {
                    int i3 = k1;
                    k1 = l1;
                    l1 = i3;
                }
                if (flag2 && j5 != 0)
                {
                    sparsebooleanarray.put(j5, true);
                } else
                if (flag3)
                {
                    sparsebooleanarray.put(j5, false);
                    int k4 = 0;
                    while (k4 < k3) 
                    {
                        m m3 = (m)arraylist.get(k4);
                        l2 = j1;
                        if (m3.getGroupId() == j5)
                        {
                            l2 = j1;
                            if (m3.j())
                            {
                                l2 = j1 + 1;
                            }
                            m3.d(false);
                        }
                        k4++;
                        j1 = l2;
                    }
                }
                l2 = j1;
                if (flag2)
                {
                    l2 = j1 - 1;
                }
                m2.d(flag2);
                j1 = k2;
                k2 = l2;
                l2 = k1;
                k1 = l1;
                l1 = k2;
            } else
            {
                m2.d(false);
                l2 = k2;
                k2 = j1;
                j1 = l2;
                l2 = l1;
                l1 = k2;
            }
            i4 = k3 + 1;
            k3 = l1;
            l1 = l2;
            k2 = j1;
            j1 = k3;
            k3 = i4;
        }
        return true;
    }

    public void c(boolean flag)
    {
        r = flag;
    }

    public boolean c()
    {
        if (j && !g() && c != null && f != null && x == null && !c.l().isEmpty())
        {
            x = new android.support.v7.widget.d(this, new g(this, b, c, i, true));
            ((View)f).post(x);
            super.a(null);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean d()
    {
        if (x != null && f != null)
        {
            ((View)f).removeCallbacks(x);
            x = null;
            return true;
        }
        g g1 = v;
        if (g1 != null)
        {
            g1.e();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean e()
    {
        return d() | f();
    }

    public boolean f()
    {
        if (w != null)
        {
            w.e();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean g()
    {
        return v != null && v.f();
    }

    public boolean h()
    {
        return x != null || g();
    }

    public void onSubUiVisibilityChanged(boolean flag)
    {
        if (flag)
        {
            super.a(null);
            return;
        } else
        {
            c.a(false);
            return;
        }
    }
}
