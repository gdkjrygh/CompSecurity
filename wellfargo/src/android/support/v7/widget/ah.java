// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v7.widget:
//            ag, ac

class ah
    implements Runnable
{

    final ag a;

    private ah(ag ag1)
    {
        a = ag1;
        super();
    }

    ah(ag ag1, ac ac)
    {
        this(ag1);
    }

    public void run()
    {
        ag.a(a).getParent().requestDisallowInterceptTouchEvent(true);
    }
}
