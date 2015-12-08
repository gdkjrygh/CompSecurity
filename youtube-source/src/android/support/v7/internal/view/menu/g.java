// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ae, aj, o, ActionMenuPresenter

final class g
    implements ae
{

    final ActionMenuPresenter a;

    private g(ActionMenuPresenter actionmenupresenter)
    {
        a = actionmenupresenter;
        super();
    }

    g(ActionMenuPresenter actionmenupresenter, byte byte0)
    {
        this(actionmenupresenter);
    }

    public final void a(o o1, boolean flag)
    {
        if (o1 instanceof aj)
        {
            ((aj)o1).q().a(false);
        }
    }

    public final boolean b(o o1)
    {
        if (o1 == null)
        {
            return false;
        } else
        {
            a.b = ((aj)o1).getItem().getItemId();
            return false;
        }
    }
}
