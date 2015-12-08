// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v7.widget.ActionMenuView;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            a

public class b
    implements ViewPropertyAnimatorListener
{

    int a;
    final a b;
    private boolean c;

    protected b(a a1)
    {
        b = a1;
        super();
        c = false;
    }

    public b a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, int i)
    {
        b.i = viewpropertyanimatorcompat;
        a = i;
        return this;
    }

    public void onAnimationCancel(View view)
    {
        c = true;
    }

    public void onAnimationEnd(View view)
    {
        if (!c)
        {
            b.i = null;
            b.setVisibility(a);
            if (b.e != null && b.c != null)
            {
                b.c.setVisibility(a);
                return;
            }
        }
    }

    public void onAnimationStart(View view)
    {
        b.setVisibility(0);
        c = false;
    }
}
