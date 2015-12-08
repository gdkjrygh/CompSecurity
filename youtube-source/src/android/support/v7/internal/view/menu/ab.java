// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.a.c;
import android.support.v7.a.e;
import android.support.v7.a.h;
import android.support.v7.internal.widget.ListPopupWindow;
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
//            ad, o, ae, ac, 
//            aj, s

public class ab
    implements ad, android.view.View.OnKeyListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
{

    static final int b;
    private Context a;
    boolean c;
    private LayoutInflater d;
    private ListPopupWindow e;
    private o f;
    private int g;
    private View h;
    private boolean i;
    private ViewTreeObserver j;
    private ac k;
    private ae l;
    private ViewGroup m;

    public ab(Context context, o o1, View view, boolean flag)
    {
        a = context;
        d = LayoutInflater.from(context);
        f = o1;
        i = flag;
        context = context.getResources();
        g = Math.max(context.getDisplayMetrics().widthPixels / 2, context.getDimensionPixelSize(e.c));
        h = view;
        o1.a(this);
    }

    static boolean a(ab ab1)
    {
        return ab1.i;
    }

    static LayoutInflater b(ab ab1)
    {
        return ab1.d;
    }

    static o c(ab ab1)
    {
        return ab1.f;
    }

    public final void a(Context context, o o1)
    {
    }

    public final void a(ae ae1)
    {
        l = ae1;
    }

    public final void a(o o1, boolean flag)
    {
        if (o1 == f)
        {
            b();
            if (l != null)
            {
                l.a(o1, flag);
                return;
            }
        }
    }

    public final boolean a()
    {
        boolean flag = false;
        e = new ListPopupWindow(a, null, c.k);
        e.a(this);
        e.a(this);
        k = new ac(this, f);
        e.a(k);
        e.a(true);
        View view = h;
        ListPopupWindow listpopupwindow;
        int k1;
        if (view != null)
        {
            ac ac1;
            int i1;
            int j1;
            int i2;
            int j2;
            int k2;
            if (j == null)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            j = view.getViewTreeObserver();
            if (i1 != 0)
            {
                j.addOnGlobalLayoutListener(this);
            }
            e.a(view);
            listpopupwindow = e;
            ac1 = k;
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            j2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            k2 = ac1.getCount();
            j1 = 0;
            view = null;
            k1 = 0;
            i1 = ((flag) ? 1 : 0);
            for (; j1 < k2; j1++)
            {
                int l1 = ac1.getItemViewType(j1);
                if (l1 != i1)
                {
                    view = null;
                    i1 = l1;
                }
                if (m == null)
                {
                    m = new FrameLayout(a);
                }
                view = ac1.getView(j1, view, m);
                view.measure(i2, j2);
                k1 = Math.max(k1, view.getMeasuredWidth());
            }

        } else
        {
            return false;
        }
        listpopupwindow.d(Math.min(k1, g));
        e.e(2);
        e.c();
        e.h().setOnKeyListener(this);
        return true;
    }

    public final boolean a(aj aj1)
    {
        if (!aj1.hasVisibleItems()) goto _L2; else goto _L1
_L1:
        ab ab1;
        int i1;
        int j1;
        ab1 = new ab(a, aj1, h, false);
        ab1.l = l;
        j1 = aj1.size();
        i1 = 0;
_L5:
        MenuItem menuitem;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        menuitem = aj1.getItem(i1);
        if (!menuitem.isVisible() || menuitem.getIcon() == null) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        ab1.c = flag;
        if (ab1.a())
        {
            if (l != null)
            {
                l.b(aj1);
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

    public final void b()
    {
        if (c())
        {
            e.d();
        }
    }

    public final boolean b(s s)
    {
        return false;
    }

    public final void c(boolean flag)
    {
        if (k != null)
        {
            k.notifyDataSetChanged();
        }
    }

    public final boolean c()
    {
        return e != null && e.f();
    }

    public final boolean c(s s)
    {
        return false;
    }

    public final boolean h()
    {
        return false;
    }

    public void onDismiss()
    {
        e = null;
        f.close();
        if (j != null)
        {
            if (!j.isAlive())
            {
                j = h.getViewTreeObserver();
            }
            j.removeGlobalOnLayoutListener(this);
            j = null;
        }
    }

    public void onGlobalLayout()
    {
        if (c())
        {
            View view = h;
            if (view == null || !view.isShown())
            {
                b();
            } else
            if (c())
            {
                e.c();
                return;
            }
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = k;
        ac.a(adapterview).a(adapterview.a(i1), 0);
    }

    public boolean onKey(View view, int i1, KeyEvent keyevent)
    {
        if (keyevent.getAction() == 1 && i1 == 82)
        {
            b();
            return true;
        } else
        {
            return false;
        }
    }

    static 
    {
        b = h.q;
    }
}
