// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarOverlayLayout

class i extends ViewPropertyAnimatorListenerAdapter
{

    final ActionBarOverlayLayout a;

    i(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        a = actionbaroverlaylayout;
        super();
    }

    public void onAnimationCancel(View view)
    {
        ActionBarOverlayLayout.b(a, null);
        ActionBarOverlayLayout.a(a, false);
    }

    public void onAnimationEnd(View view)
    {
        ActionBarOverlayLayout.b(a, null);
        ActionBarOverlayLayout.a(a, false);
    }
}
