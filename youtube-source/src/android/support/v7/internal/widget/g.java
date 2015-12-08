// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.internal.view.menu.s;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarView, i

final class g
    implements android.view.View.OnClickListener
{

    final ActionBarView a;

    g(ActionBarView actionbarview)
    {
        a = actionbarview;
        super();
    }

    public final void onClick(View view)
    {
        view = ActionBarView.b(a).b;
        if (view != null)
        {
            view.collapseActionView();
        }
    }
}
