// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;

// Referenced classes of package android.support.v7.internal.a:
//            i

class j extends ViewPropertyAnimatorListenerAdapter
{

    final i a;

    j(i k)
    {
        a = k;
        super();
    }

    public void onAnimationEnd(View view)
    {
        if (i.a(a) && i.b(a) != null)
        {
            ViewCompat.setTranslationY(i.b(a), 0.0F);
            ViewCompat.setTranslationY(i.c(a), 0.0F);
        }
        if (i.d(a) != null && i.e(a) == 1)
        {
            i.d(a).setVisibility(8);
        }
        i.c(a).setVisibility(8);
        i.c(a).setTransitioning(false);
        i.a(a, null);
        a.f();
        if (i.f(a) != null)
        {
            ViewCompat.requestApplyInsets(i.f(a));
        }
    }
}
