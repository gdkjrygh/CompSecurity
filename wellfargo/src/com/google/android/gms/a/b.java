// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.a;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.j;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.a:
//            c, i, g, f, 
//            d, e, h, a, 
//            n

public abstract class b
{

    private a a;
    private Bundle b;
    private LinkedList c;
    private final n d = new c(this);

    public b()
    {
    }

    static Bundle a(b b1, Bundle bundle)
    {
        b1.b = bundle;
        return bundle;
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
        for (; !c.isEmpty() && ((i)c.getLast()).a() >= k; c.removeLast()) { }
    }

    private void a(Bundle bundle, i k)
    {
        if (a != null)
        {
            k.a(a);
            return;
        }
        if (c == null)
        {
            c = new LinkedList();
        }
        c.add(k);
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

    public static void b(FrameLayout framelayout)
    {
        android.content.Context context = framelayout.getContext();
        int k = com.google.android.gms.common.d.a(context);
        String s1 = j.a(context, k, com.google.android.gms.common.d.e(context));
        String s = j.b(context, k);
        LinearLayout linearlayout = new LinearLayout(framelayout.getContext());
        linearlayout.setOrientation(1);
        linearlayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        framelayout.addView(linearlayout);
        framelayout = new TextView(framelayout.getContext());
        framelayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        framelayout.setText(s1);
        linearlayout.addView(framelayout);
        if (s != null)
        {
            framelayout = new Button(context);
            framelayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            framelayout.setText(s);
            linearlayout.addView(framelayout);
            framelayout.setOnClickListener(new g(context, k));
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        FrameLayout framelayout = new FrameLayout(layoutinflater.getContext());
        a(bundle, ((i) (new f(this, framelayout, layoutinflater, viewgroup, bundle))));
        if (a == null)
        {
            a(framelayout);
        }
        return framelayout;
    }

    public a a()
    {
        return a;
    }

    public void a(Activity activity, Bundle bundle, Bundle bundle1)
    {
        a(bundle1, ((i) (new com.google.android.gms.a.d(this, activity, bundle, bundle1))));
    }

    public void a(Bundle bundle)
    {
        a(bundle, ((i) (new e(this, bundle))));
    }

    protected void a(FrameLayout framelayout)
    {
        b(framelayout);
    }

    protected abstract void a(n n);

    public void b()
    {
        a(((Bundle) (null)), new h(this));
    }

    public void b(Bundle bundle)
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

    public void c()
    {
        if (a != null)
        {
            a.b();
            return;
        } else
        {
            a(5);
            return;
        }
    }

    public void d()
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

    public void e()
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

    public void f()
    {
        if (a != null)
        {
            a.e();
        }
    }
}
