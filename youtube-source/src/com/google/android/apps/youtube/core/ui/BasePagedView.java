// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.r;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            PagedView, f, d, i, 
//            k, j

public abstract class BasePagedView extends LinearLayout
    implements PagedView
{

    protected final ViewGroup a;
    protected final ViewGroup b;
    protected final TextView c;
    protected final View d;
    protected final ViewGroup e;
    protected final TextView f;
    protected final Button g;
    protected View h;
    protected ListAdapter i;
    protected final k j;
    protected String k;
    protected j l;
    protected android.widget.AdapterView.OnItemClickListener m;
    protected android.widget.AdapterView.OnItemLongClickListener n;
    private final List o;
    private final boolean p;
    private final Handler q;
    private boolean r;
    private final int s;
    private final int t;
    private FrameLayout u;
    private d v;
    private i w;
    private PagedView.State x;

    public BasePagedView(int i1, Context context, AttributeSet attributeset, int j1)
    {
        this(i1, context, attributeset, j1, -1, null);
    }

    public BasePagedView(int i1, Context context, AttributeSet attributeset, int j1, int k1, String s1)
    {
        super(context, attributeset);
        x = PagedView.State.NEW;
        attributeset = context.obtainStyledAttributes(attributeset, r.j, 0, j1);
        q = new Handler(context.getMainLooper());
        o = new LinkedList();
        p = g();
        int l1;
        boolean flag;
        if (s1 == null)
        {
            k = attributeset.getString(2);
        } else
        {
            k = s1;
        }
        setOrientation(1);
        u = new FrameLayout(context);
        s1 = new android.view.ViewGroup.LayoutParams(-1, -1);
        addView(u, s1);
        context = LayoutInflater.from(context);
        a = (ViewGroup)context.inflate(i1, null);
        u.addView(a);
        i1 = k1;
        if (k1 < 0)
        {
            i1 = attributeset.getResourceId(3, -1);
        }
        if (i1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag, "no statusView provided");
        j = new f(context.inflate(i1, null));
        b = (ViewGroup)a.getChildAt(0);
        c = (TextView)b.getChildAt(0);
        d = a.getChildAt(1);
        context = (ViewGroup)a.findViewWithTag("error_message_view");
        if (context == null)
        {
            e = (ViewGroup)a.getChildAt(2);
            f = (TextView)e.getChildAt(1);
            g = (Button)e.getChildAt(2);
        } else
        {
            e = context;
            f = (TextView)e.findViewWithTag("error_message");
            g = (Button)e.findViewWithTag("retry_button");
        }
        h = a.getChildAt(3);
        s = attributeset.getInt(0, 0x7fffffff);
        t = attributeset.getInt(1, 0x7fffffff);
        i1 = getPaddingLeft();
        j1 = getPaddingTop();
        k1 = getPaddingRight();
        l1 = getPaddingBottom();
        a(b, i1, j1, k1, l1);
        a(d, i1, j1, k1, l1);
        a(h, i1, j1, k1, l1);
        setPadding(0, 0, 0, 0);
        attributeset.recycle();
        v = new d(this, (byte)0);
    }

    static Handler a(BasePagedView basepagedview)
    {
        return basepagedview.q;
    }

    private static void a(View view, int i1, int j1, int k1, int l1)
    {
        view.setPadding(view.getPaddingLeft() + i1, view.getPaddingTop() + j1, view.getPaddingRight() + k1, view.getPaddingBottom() + l1);
    }

    private void a(PagedView.State state)
    {
        boolean flag = false;
        if (x != state)
        {
            Object obj = b;
            int i1;
            if (state == PagedView.State.EMPTY)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            ((ViewGroup) (obj)).setVisibility(i1);
            obj = d;
            if (state == PagedView.State.LOADING)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            ((View) (obj)).setVisibility(i1);
            obj = e;
            if (state == PagedView.State.ERROR)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            ((ViewGroup) (obj)).setVisibility(i1);
            obj = h;
            if (state == PagedView.State.ITEMS)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = 8;
            }
            ((View) (obj)).setVisibility(i1);
            x = state;
            if (w != null)
            {
                w.a(x);
            }
        }
    }

    private void j()
    {
        if (r || !p)
        {
            return;
        }
        Iterator iterator = o.iterator();
        for (int i1 = 0; iterator.hasNext(); i1++)
        {
            View view = (View)iterator.next();
            e(view);
            addView(view, i1, new android.widget.LinearLayout.LayoutParams(view.getLayoutParams()));
        }

        r = true;
    }

    public final int a()
    {
        return s;
    }

    public void a(int i1)
    {
    }

    public final void a(View view)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(view.getLayoutParams(), "header view doesn't specify any layout params, did you inflate with a null parent?");
        o.add(view);
        if (r || !p)
        {
            addView(view, o.size() - 1, new android.widget.LinearLayout.LayoutParams(view.getLayoutParams()));
            return;
        } else
        {
            c(view);
            return;
        }
    }

    public final void a(String s1)
    {
        f.setText(s1);
        g.setVisibility(8);
        a(PagedView.State.ERROR);
        j();
    }

    public final int b()
    {
        return t;
    }

    public final void b(View view)
    {
        d(view);
    }

    public final void b(String s1)
    {
        f.setText(s1);
        g.setVisibility(0);
        a(PagedView.State.ERROR);
        j();
    }

    public final void c()
    {
        c.setText(k);
        a(PagedView.State.EMPTY);
        j();
    }

    protected abstract void c(View view);

    public final void d()
    {
        a(PagedView.State.ITEMS);
        if (!r || !p)
        {
            return;
        }
        View view;
        for (Iterator iterator = o.iterator(); iterator.hasNext(); c(view))
        {
            view = (View)iterator.next();
            removeView(view);
        }

        r = false;
    }

    protected abstract void d(View view);

    public final void e()
    {
        a(PagedView.State.LOADING);
        j();
    }

    protected abstract void e(View view);

    public final PagedView.State f()
    {
        return x;
    }

    protected abstract boolean g();

    public final k h()
    {
        return j;
    }

    public int i()
    {
        return 0;
    }

    public void setAdapter(ListAdapter listadapter)
    {
        if (i != null)
        {
            i.unregisterDataSetObserver(v);
        }
        i = listadapter;
        i.registerDataSetObserver(v);
    }

    public void setEmptyText(int i1)
    {
        k = getContext().getString(i1);
        c.setText(i1);
    }

    public void setEmptyText(CharSequence charsequence)
    {
        k = charsequence.toString();
        c.setText(charsequence);
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        m = onitemclicklistener;
    }

    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener)
    {
        n = onitemlongclicklistener;
    }

    public void setOnKeyListener(android.view.View.OnKeyListener onkeylistener)
    {
        h.setOnKeyListener(onkeylistener);
    }

    public final void setOnPagedViewStateChangeListener(i i1)
    {
        w = i1;
    }

    public final void setOnRetryClickListener(android.view.View.OnClickListener onclicklistener)
    {
        g.setOnClickListener(onclicklistener);
    }

    public final void setOnScrollListener(j j1)
    {
        l = j1;
    }
}
