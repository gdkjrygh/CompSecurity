// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v7.c.b;
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

final class x extends FrameLayout
    implements CollapsibleActionView
{

    final b a;

    x(View view)
    {
        super(view.getContext());
        a = (b)view;
        addView(view);
    }

    final View a()
    {
        return (View)a;
    }

    public final void onActionViewCollapsed()
    {
        a.b();
    }

    public final void onActionViewExpanded()
    {
        a.a();
    }
}
