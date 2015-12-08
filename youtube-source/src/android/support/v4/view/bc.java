// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            bb

class bc extends bb
{

    bc()
    {
    }

    public final void a(View view, int i, int j, int k, int l)
    {
        view.postInvalidate(i, j, k, l);
    }

    public final void a(View view, Runnable runnable)
    {
        view.postOnAnimation(runnable);
    }

    public final void b(View view)
    {
        view.postInvalidateOnAnimation();
    }

    public final void b(View view, int i)
    {
        view.setImportantForAccessibility(i);
    }

    public final int c(View view)
    {
        return view.getImportantForAccessibility();
    }

    public final ViewParent f(View view)
    {
        return view.getParentForAccessibility();
    }
}
