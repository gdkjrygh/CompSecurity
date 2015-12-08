// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarOverlayLayout, ActionBarContainer

class k
    implements Runnable
{

    final ActionBarOverlayLayout a;

    k(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        a = actionbaroverlaylayout;
        super();
    }

    public void run()
    {
        ActionBarOverlayLayout.a(a);
        ActionBarOverlayLayout.a(a, ViewCompat.animate(ActionBarOverlayLayout.c(a)).translationY(-ActionBarOverlayLayout.c(a).getHeight()).setListener(ActionBarOverlayLayout.b(a)));
        if (ActionBarOverlayLayout.d(a) != null && ActionBarOverlayLayout.d(a).getVisibility() != 8)
        {
            ActionBarOverlayLayout.b(a, ViewCompat.animate(ActionBarOverlayLayout.d(a)).translationY(ActionBarOverlayLayout.d(a).getHeight()).setListener(ActionBarOverlayLayout.e(a)));
        }
    }
}
