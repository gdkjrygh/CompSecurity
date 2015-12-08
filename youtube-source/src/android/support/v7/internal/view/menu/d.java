// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ActionMenuPresenter, o, f

final class d
    implements Runnable
{

    final ActionMenuPresenter a;
    private f b;

    public d(ActionMenuPresenter actionmenupresenter, f f1)
    {
        a = actionmenupresenter;
        super();
        b = f1;
    }

    public final void run()
    {
        a.e.e();
        View view = (View)a.h;
        if (view != null && view.getWindowToken() != null && b.a())
        {
            ActionMenuPresenter.a(a, b);
        }
        ActionMenuPresenter.a(a, null);
    }
}
