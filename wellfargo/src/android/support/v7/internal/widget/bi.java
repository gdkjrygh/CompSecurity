// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v7.widget.Toolbar;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            bg

class bi extends ViewPropertyAnimatorListenerAdapter
{

    final bg a;
    private boolean b;

    bi(bg bg1)
    {
        a = bg1;
        super();
        b = false;
    }

    public void onAnimationCancel(View view)
    {
        b = true;
    }

    public void onAnimationEnd(View view)
    {
        if (!b)
        {
            bg.a(a).setVisibility(8);
        }
    }
}
