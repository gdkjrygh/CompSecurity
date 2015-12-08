// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.a.l;
import android.support.v7.c.a;
import android.support.v7.c.b;
import android.support.v7.internal.a.i;
import android.support.v7.internal.view.e;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            u, y, x, a, 
//            t, f

abstract class v extends u
{

    final Context a;
    final Window b;
    final android.view.Window.Callback c;
    final android.view.Window.Callback d;
    final t e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    private android.support.v7.app.a k;
    private MenuInflater l;
    private CharSequence m;
    private boolean n;

    v(Context context, Window window, t t)
    {
        a = context;
        b = window;
        e = t;
        c = b.getCallback();
        if (c instanceof y)
        {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        } else
        {
            d = a(c);
            b.setCallback(d);
            return;
        }
    }

    public android.support.v7.app.a a()
    {
        if (!f) goto _L2; else goto _L1
_L1:
        if (k == null)
        {
            k = i();
        }
_L4:
        return k;
_L2:
        if (k instanceof i)
        {
            k = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    android.view.Window.Callback a(android.view.Window.Callback callback)
    {
        return new y(this, callback);
    }

    public void a(Bundle bundle)
    {
        bundle = a.obtainStyledAttributes(l.Theme);
        if (!bundle.hasValue(l.Theme_windowActionBar))
        {
            bundle.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (bundle.getBoolean(l.Theme_windowActionBar, false))
        {
            f = true;
        }
        if (bundle.getBoolean(l.Theme_windowActionBarOverlay, false))
        {
            g = true;
        }
        if (bundle.getBoolean(l.Theme_windowActionModeOverlay, false))
        {
            h = true;
        }
        i = bundle.getBoolean(l.Theme_android_windowIsFloating, false);
        j = bundle.getBoolean(l.Theme_windowNoTitle, false);
        bundle.recycle();
    }

    final void a(android.support.v7.app.a a1)
    {
        k = a1;
    }

    public final void a(CharSequence charsequence)
    {
        m = charsequence;
        b(charsequence);
    }

    abstract boolean a(int i1, KeyEvent keyevent);

    abstract boolean a(int i1, Menu menu);

    abstract boolean a(KeyEvent keyevent);

    abstract a b(b b1);

    public MenuInflater b()
    {
        if (l == null)
        {
            l = new e(k());
        }
        return l;
    }

    abstract void b(CharSequence charsequence);

    abstract boolean b(int i1, Menu menu);

    public final void f()
    {
        n = true;
    }

    public final f g()
    {
        return new x(this, null);
    }

    abstract android.support.v7.app.a i();

    final android.support.v7.app.a j()
    {
        return k;
    }

    final Context k()
    {
        Context context = null;
        Object obj = a();
        if (obj != null)
        {
            context = ((android.support.v7.app.a) (obj)).c();
        }
        obj = context;
        if (context == null)
        {
            obj = a;
        }
        return ((Context) (obj));
    }

    final boolean l()
    {
        return n;
    }

    final android.view.Window.Callback m()
    {
        return b.getCallback();
    }

    final CharSequence n()
    {
        if (c instanceof Activity)
        {
            return ((Activity)c).getTitle();
        } else
        {
            return m;
        }
    }
}
