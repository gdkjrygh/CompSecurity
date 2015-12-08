// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.i;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter, g

class d
    implements Runnable
{

    final ActionMenuPresenter a;
    private g b;

    public d(ActionMenuPresenter actionmenupresenter, g g1)
    {
        a = actionmenupresenter;
        super();
        b = g1;
    }

    public void run()
    {
        ActionMenuPresenter.f(a).f();
        View view = (View)ActionMenuPresenter.g(a);
        if (view != null && view.getWindowToken() != null && b.d())
        {
            ActionMenuPresenter.a(a, b);
        }
        ActionMenuPresenter.a(a, null);
    }
}
