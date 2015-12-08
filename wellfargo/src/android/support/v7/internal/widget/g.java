// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.c.a;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarContextView

class g
    implements android.view.View.OnClickListener
{

    final a a;
    final ActionBarContextView b;

    g(ActionBarContextView actionbarcontextview, a a1)
    {
        b = actionbarcontextview;
        a = a1;
        super();
    }

    public void onClick(View view)
    {
        a.c();
    }
}
