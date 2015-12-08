// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.ViewCompat;
import android.support.v7.c.a;
import android.support.v7.c.b;
import android.support.v7.internal.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7, t

class ah
    implements b
{

    final AppCompatDelegateImplV7 a;
    private b b;

    public ah(AppCompatDelegateImplV7 appcompatdelegateimplv7, b b1)
    {
        a = appcompatdelegateimplv7;
        super();
        b = b1;
    }

    public void a(a a1)
    {
        b.a(a1);
        if (a.m == null) goto _L2; else goto _L1
_L1:
        a.b.getDecorView().removeCallbacks(a.n);
        a.m.dismiss();
_L4:
        if (a.l != null)
        {
            a.l.removeAllViews();
        }
        if (a.e != null)
        {
            a.e.onSupportActionModeFinished(a.k);
        }
        a.k = null;
        return;
_L2:
        if (a.l != null)
        {
            a.l.setVisibility(8);
            if (a.l.getParent() != null)
            {
                ViewCompat.requestApplyInsets((View)a.l.getParent());
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean a(a a1, Menu menu)
    {
        return b.a(a1, menu);
    }

    public boolean a(a a1, MenuItem menuitem)
    {
        return b.a(a1, menuitem);
    }

    public boolean b(a a1, Menu menu)
    {
        return b.b(a1, menu);
    }
}
