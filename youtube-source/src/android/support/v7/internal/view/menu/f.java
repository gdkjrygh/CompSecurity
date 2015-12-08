// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ab, ActionMenuPresenter, o

final class f extends ab
{

    final ActionMenuPresenter a;

    public f(ActionMenuPresenter actionmenupresenter, Context context, o o1, View view, boolean flag)
    {
        a = actionmenupresenter;
        super(context, o1, view, true);
        a(actionmenupresenter.a);
    }

    public final void onDismiss()
    {
        super.onDismiss();
        a.e.close();
        ActionMenuPresenter.a(a, null);
    }
}
