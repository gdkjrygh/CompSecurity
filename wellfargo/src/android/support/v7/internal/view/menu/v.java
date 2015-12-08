// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.a.b;
import android.support.v7.a.e;
import android.support.v7.a.i;
import android.support.v7.widget.ab;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

// Referenced classes of package android.support.v7.internal.view.menu:
//            x, w, i, y, 
//            ad, m

public class v
    implements x, android.view.View.OnKeyListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
{

    static final int a;
    boolean b;
    private final Context c;
    private final LayoutInflater d;
    private final android.support.v7.internal.view.menu.i e;
    private final w f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;
    private View k;
    private ab l;
    private ViewTreeObserver m;
    private y n;
    private ViewGroup o;
    private boolean p;
    private int q;
    private int r;

    public v(Context context, android.support.v7.internal.view.menu.i i1, View view)
    {
        this(context, i1, view, false, b.popupMenuStyle);
    }

    public v(Context context, android.support.v7.internal.view.menu.i i1, View view, boolean flag, int j1)
    {
        this(context, i1, view, flag, j1, 0);
    }

    public v(Context context, android.support.v7.internal.view.menu.i i1, View view, boolean flag, int j1, int k1)
    {
        r = 0;
        c = context;
        d = LayoutInflater.from(context);
        e = i1;
        f = new w(this, e);
        g = flag;
        i = j1;
        j = k1;
        Resources resources = context.getResources();
        h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(e.abc_config_prefDialogWidth));
        k = view;
        i1.a(this, context);
    }

    static boolean a(v v1)
    {
        return v1.g;
    }

    static LayoutInflater b(v v1)
    {
        return v1.d;
    }

    static android.support.v7.internal.view.menu.i c(v v1)
    {
        return v1.e;
    }

    private int g()
    {
        w w1 = f;
        int i2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int j2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int k2 = w1.getCount();
        int j1 = 0;
        int k1 = 0;
        View view = null;
        int i1 = 0;
        do
        {
            int l1;
label0:
            {
                l1 = i1;
                if (j1 < k2)
                {
                    l1 = w1.getItemViewType(j1);
                    if (l1 != k1)
                    {
                        k1 = l1;
                        view = null;
                    }
                    if (o == null)
                    {
                        o = new FrameLayout(c);
                    }
                    view = w1.getView(j1, view, o);
                    view.measure(i2, j2);
                    l1 = view.getMeasuredWidth();
                    if (l1 < h)
                    {
                        break label0;
                    }
                    l1 = h;
                }
                return l1;
            }
            if (l1 > i1)
            {
                i1 = l1;
            }
            j1++;
        } while (true);
    }

    public void a()
    {
        if (!d())
        {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        } else
        {
            return;
        }
    }

    public void a(int i1)
    {
        r = i1;
    }

    public void a(Context context, android.support.v7.internal.view.menu.i i1)
    {
    }

    public void a(android.support.v7.internal.view.menu.i i1, boolean flag)
    {
        if (i1 == e)
        {
            e();
            if (n != null)
            {
                n.a(i1, flag);
                return;
            }
        }
    }

    public void a(y y1)
    {
        n = y1;
    }

    public void a(View view)
    {
        k = view;
    }

    public void a(boolean flag)
    {
        p = false;
        if (f != null)
        {
            f.notifyDataSetChanged();
        }
    }

    public boolean a(ad ad1)
    {
        if (!ad1.hasVisibleItems()) goto _L2; else goto _L1
_L1:
        v v1;
        int i1;
        int j1;
        v1 = new v(c, ad1, k);
        v1.a(n);
        j1 = ad1.size();
        i1 = 0;
_L5:
        MenuItem menuitem;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        menuitem = ad1.getItem(i1);
        if (!menuitem.isVisible() || menuitem.getIcon() == null) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        v1.b(flag);
        if (v1.d())
        {
            if (n != null)
            {
                n.a(ad1);
            }
            return true;
        }
          goto _L2
_L4:
        i1++;
          goto _L5
_L2:
        return false;
        flag = false;
          goto _L6
    }

    public boolean a(android.support.v7.internal.view.menu.i i1, m m1)
    {
        return false;
    }

    public void b(boolean flag)
    {
        b = flag;
    }

    public boolean b()
    {
        return false;
    }

    public boolean b(android.support.v7.internal.view.menu.i i1, m m1)
    {
        return false;
    }

    public ab c()
    {
        return l;
    }

    public boolean d()
    {
        boolean flag = false;
        l = new ab(c, null, i, j);
        l.a(this);
        l.a(this);
        l.a(f);
        l.a(true);
        View view = k;
        if (view != null)
        {
            if (m == null)
            {
                flag = true;
            }
            m = view.getViewTreeObserver();
            if (flag)
            {
                m.addOnGlobalLayoutListener(this);
            }
            l.a(view);
            l.b(r);
            if (!p)
            {
                q = g();
                p = true;
            }
            l.d(q);
            l.e(2);
            l.c();
            l.g().setOnKeyListener(this);
            return true;
        } else
        {
            return false;
        }
    }

    public void e()
    {
        if (f())
        {
            l.a();
        }
    }

    public boolean f()
    {
        return l != null && l.b();
    }

    public void onDismiss()
    {
        l = null;
        e.close();
        if (m != null)
        {
            if (!m.isAlive())
            {
                m = k.getViewTreeObserver();
            }
            m.removeGlobalOnLayoutListener(this);
            m = null;
        }
    }

    public void onGlobalLayout()
    {
        if (f())
        {
            View view = k;
            if (view == null || !view.isShown())
            {
                e();
            } else
            if (f())
            {
                l.c();
                return;
            }
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = f;
        w.a(adapterview).a(adapterview.a(i1), 0);
    }

    public boolean onKey(View view, int i1, KeyEvent keyevent)
    {
        if (keyevent.getAction() == 1 && i1 == 82)
        {
            e();
            return true;
        } else
        {
            return false;
        }
    }

    static 
    {
        a = i.abc_popup_menu_item_layout;
    }
}
