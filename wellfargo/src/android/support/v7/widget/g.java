// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.a.b;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.v;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter

class g extends v
{

    final ActionMenuPresenter c;

    public g(ActionMenuPresenter actionmenupresenter, Context context, i j, View view, boolean flag)
    {
        c = actionmenupresenter;
        super(context, j, view, flag, b.actionOverflowMenuStyle);
        a(0x800005);
        a(actionmenupresenter.g);
    }

    public void onDismiss()
    {
        super.onDismiss();
        ActionMenuPresenter.c(c).close();
        ActionMenuPresenter.a(c, null);
    }
}
