// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//            ab, af, ac

class an
    implements Runnable
{

    final ab a;

    private an(ab ab1)
    {
        a = ab1;
        super();
    }

    an(ab ab1, ac ac)
    {
        this(ab1);
    }

    public void run()
    {
        if (ab.a(a) != null && ab.a(a).getCount() > ab.a(a).getChildCount() && ab.a(a).getChildCount() <= a.b)
        {
            ab.b(a).setInputMethodMode(2);
            a.c();
        }
    }
}
