// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ag, e, ActionMenuPresenter, g, 
//            ab

class f extends ag
{

    final ActionMenuPresenter a;
    final e b;

    f(e e1, View view, ActionMenuPresenter actionmenupresenter)
    {
        b = e1;
        a = actionmenupresenter;
        super(view);
    }

    public ab a()
    {
        if (ActionMenuPresenter.a(b.a) == null)
        {
            return null;
        } else
        {
            return ActionMenuPresenter.a(b.a).c();
        }
    }

    public boolean b()
    {
        b.a.c();
        return true;
    }

    public boolean c()
    {
        if (ActionMenuPresenter.b(b.a) != null)
        {
            return false;
        } else
        {
            b.a.d();
            return true;
        }
    }
}
