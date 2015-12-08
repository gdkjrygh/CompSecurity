// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v4.view.n;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            u, w

class v extends ActionProvider
{

    final n a;
    final u b;

    public v(u u1, n n1)
    {
        b = u1;
        super(n1.a());
        a = n1;
        if (u.a(u1))
        {
            a.a(new w(this, u1));
        }
    }

    public boolean hasSubMenu()
    {
        n n1 = a;
        return false;
    }

    public View onCreateActionView()
    {
        if (u.a(b))
        {
            b.b();
        }
        return a.b();
    }

    public boolean onPerformDefaultAction()
    {
        n n1 = a;
        return false;
    }

    public void onPrepareSubMenu(SubMenu submenu)
    {
        n n1 = a;
        b.a(submenu);
    }
}
