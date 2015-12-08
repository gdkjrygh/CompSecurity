// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.ad;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.y;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter, a

class h
    implements y
{

    final ActionMenuPresenter a;

    private h(ActionMenuPresenter actionmenupresenter)
    {
        a = actionmenupresenter;
        super();
    }

    h(ActionMenuPresenter actionmenupresenter, a a1)
    {
        this(actionmenupresenter);
    }

    public void a(i j, boolean flag)
    {
        if (j instanceof ad)
        {
            ((ad)j).p().a(false);
        }
        y y1 = a.a();
        if (y1 != null)
        {
            y1.a(j, flag);
        }
    }

    public boolean a(i j)
    {
        if (j == null)
        {
            return false;
        }
        a.h = ((ad)j).getItem().getItemId();
        y y1 = a.a();
        boolean flag;
        if (y1 != null)
        {
            flag = y1.a(j);
        } else
        {
            flag = false;
        }
        return flag;
    }
}
