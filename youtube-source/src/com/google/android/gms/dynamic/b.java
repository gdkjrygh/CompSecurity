// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.e;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.dynamic:
//            c, j, g, h, 
//            d, f, i, a, 
//            o

public abstract class b
{

    private a a;
    private Bundle b;
    private LinkedList c;
    private final o d = new c(this);

    public b()
    {
    }

    static Bundle a(b b1, Bundle bundle)
    {
        b1.b = null;
        return null;
    }

    static a a(b b1, a a1)
    {
        b1.a = a1;
        return a1;
    }

    static LinkedList a(b b1)
    {
        return b1.c;
    }

    private void a(int k)
    {
        for (; !c.isEmpty() && ((j)c.getLast()).a() >= k; c.removeLast()) { }
    }

    private void a(Bundle bundle, j j1)
    {
        if (a != null)
        {
            bundle = a;
            j1.b();
            return;
        }
        if (c == null)
        {
            c = new LinkedList();
        }
        c.add(j1);
        if (bundle != null)
        {
            if (b == null)
            {
                b = (Bundle)bundle.clone();
            } else
            {
                b.putAll(bundle);
            }
        }
        a(d);
    }

    static a b(b b1)
    {
        return b1.a;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        FrameLayout framelayout = new FrameLayout(layoutinflater.getContext());
        a(bundle, ((j) (new g(this, framelayout, layoutinflater, viewgroup, bundle))));
        if (a == null)
        {
            layoutinflater = framelayout.getContext();
            int k = com.google.android.gms.common.e.a(layoutinflater);
            String s = com.google.android.gms.common.e.b(layoutinflater, k, -1);
            viewgroup = com.google.android.gms.common.e.a(layoutinflater, k);
            bundle = new LinearLayout(framelayout.getContext());
            bundle.setOrientation(1);
            bundle.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            framelayout.addView(bundle);
            TextView textview = new TextView(framelayout.getContext());
            textview.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            textview.setText(s);
            bundle.addView(textview);
            if (viewgroup != null)
            {
                Button button = new Button(layoutinflater);
                button.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
                button.setText(viewgroup);
                bundle.addView(button);
                button.setOnClickListener(new h(this, layoutinflater, k));
            }
        }
        return framelayout;
    }

    public final a a()
    {
        return a;
    }

    public final void a(Activity activity, Bundle bundle, Bundle bundle1)
    {
        a(bundle1, ((j) (new d(this, activity, bundle, bundle1))));
    }

    public final void a(Bundle bundle)
    {
        a(bundle, ((j) (new f(this, bundle))));
    }

    protected abstract void a(o o);

    public final void b()
    {
        a(((Bundle) (null)), new i(this));
    }

    public final void b(Bundle bundle)
    {
        if (a != null)
        {
            a.b(bundle);
        } else
        if (b != null)
        {
            bundle.putAll(b);
            return;
        }
    }

    public final void c()
    {
        if (a != null)
        {
            a.b();
            return;
        } else
        {
            a(3);
            return;
        }
    }

    public final void d()
    {
        if (a != null)
        {
            a.c();
            return;
        } else
        {
            a(2);
            return;
        }
    }

    public final void e()
    {
        if (a != null)
        {
            a.d();
            return;
        } else
        {
            a(1);
            return;
        }
    }

    public final void f()
    {
        if (a != null)
        {
            a.e();
        }
    }
}
