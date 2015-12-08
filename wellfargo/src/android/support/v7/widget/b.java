// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.internal.view.menu.ad;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.v;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter

class b extends v
{

    final ActionMenuPresenter c;
    private ad d;

    public b(ActionMenuPresenter actionmenupresenter, Context context, ad ad1)
    {
        boolean flag1 = false;
        c = actionmenupresenter;
        super(context, ad1, null, false, android.support.v7.a.b.actionOverflowMenuStyle);
        d = ad1;
        int i;
        if (!((m)ad1.getItem()).j())
        {
            int j;
            boolean flag;
            if (ActionMenuPresenter.d(actionmenupresenter) == null)
            {
                context = (View)ActionMenuPresenter.e(actionmenupresenter);
            } else
            {
                context = ActionMenuPresenter.d(actionmenupresenter);
            }
            a(context);
        }
        a(actionmenupresenter.g);
        j = ad1.size();
        i = 0;
        do
        {
label0:
            {
                flag = flag1;
                if (i < j)
                {
                    actionmenupresenter = ad1.getItem(i);
                    if (!actionmenupresenter.isVisible() || actionmenupresenter.getIcon() == null)
                    {
                        break label0;
                    }
                    flag = true;
                }
                b(flag);
                return;
            }
            i++;
        } while (true);
    }

    public void onDismiss()
    {
        super.onDismiss();
        ActionMenuPresenter.a(c, null);
        c.h = 0;
    }
}
