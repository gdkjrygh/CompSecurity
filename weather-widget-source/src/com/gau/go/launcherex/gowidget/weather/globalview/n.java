// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globalview;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.a.a.an;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globalview:
//            p, q, r, o

public class n
    implements android.view.View.OnClickListener
{

    private final FrameLayout a;
    private final View b;
    private Activity c;
    private an d;
    private an e;
    private boolean f;
    private android.widget.PopupWindow.OnDismissListener g;

    public n(Activity activity, View view, int i, int j)
    {
        f = false;
        c = activity;
        b = view;
        a = new FrameLayout(c);
        a.setOnClickListener(this);
        a.addView(b, new android.view.ViewGroup.LayoutParams(i, j));
    }

    static View a(n n1)
    {
        return n1.b;
    }

    private void b()
    {
        if (e != null)
        {
            e.b();
        }
        d = an.b(new int[] {
            b.getHeight() - b.getScrollY(), 0
        });
        d.a(new p(this));
        d.a(new AccelerateDecelerateInterpolator());
        d.c(300L);
        d.a();
    }

    static void b(n n1)
    {
        n1.b();
    }

    static boolean c(n n1)
    {
        return n1.f;
    }

    static Activity d(n n1)
    {
        return n1.c;
    }

    static FrameLayout e(n n1)
    {
        return n1.a;
    }

    public void a()
    {
        if (f)
        {
            f = false;
            if (d != null)
            {
                d.b();
            }
            e = an.b(new int[] {
                b.getScrollY(), b.getHeight()
            });
            e.a(new q(this));
            e.a(new r(this));
            e.c(300L);
            e.a(new AccelerateInterpolator());
            e.a();
            if (g != null)
            {
                g.onDismiss();
                return;
            }
        }
    }

    public void a(View view, int i, int j)
    {
        if (f)
        {
            return;
        }
        f = true;
        int ai[] = new int[2];
        view.getLocationInWindow(ai);
        ai[0] = ai[0] + i;
        ai[1] = ai[1] + j + view.getHeight();
        a.scrollTo(-ai[0], -ai[1]);
        ((ViewGroup)c.getWindow().getDecorView()).addView(a, new android.view.ViewGroup.LayoutParams(-1, -1));
        if (d == null)
        {
            b.getViewTreeObserver().addOnPreDrawListener(new o(this));
            return;
        } else
        {
            b();
            return;
        }
    }

    public void a(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        g = ondismisslistener;
    }

    public void onClick(View view)
    {
        if (view.equals(a))
        {
            a();
        }
    }
}
