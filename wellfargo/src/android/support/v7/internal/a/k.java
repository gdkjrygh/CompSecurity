// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;

// Referenced classes of package android.support.v7.internal.a:
//            i

class k extends ViewPropertyAnimatorListenerAdapter
{

    final i a;

    k(i j)
    {
        a = j;
        super();
    }

    public void onAnimationEnd(View view)
    {
        i.a(a, null);
        i.c(a).requestLayout();
    }
}
