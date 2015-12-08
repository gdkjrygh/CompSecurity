// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v7.widget.Toolbar;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            bg

class bj extends ViewPropertyAnimatorListenerAdapter
{

    final bg a;

    bj(bg bg1)
    {
        a = bg1;
        super();
    }

    public void onAnimationStart(View view)
    {
        bg.a(a).setVisibility(0);
    }
}
