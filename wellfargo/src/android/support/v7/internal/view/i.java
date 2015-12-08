// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view:
//            h

class i extends ViewPropertyAnimatorListenerAdapter
{

    final h a;
    private boolean b;
    private int c;

    i(h h1)
    {
        a = h1;
        super();
        b = false;
        c = 0;
    }

    void a()
    {
        c = 0;
        b = false;
        h.b(a);
    }

    public void onAnimationEnd(View view)
    {
        int j = c + 1;
        c = j;
        if (j == h.c(a).size())
        {
            if (h.a(a) != null)
            {
                h.a(a).onAnimationEnd(null);
            }
            a();
        }
    }

    public void onAnimationStart(View view)
    {
        if (!b)
        {
            b = true;
            if (h.a(a) != null)
            {
                h.a(a).onAnimationStart(null);
                return;
            }
        }
    }
}
