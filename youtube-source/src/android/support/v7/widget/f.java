// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.widget.c;

// Referenced classes of package android.support.v7.widget:
//            SearchView, q

final class f
    implements Runnable
{

    final SearchView a;

    f(SearchView searchview)
    {
        a = searchview;
        super();
    }

    public final void run()
    {
        if (SearchView.b(a) != null && (SearchView.b(a) instanceof q))
        {
            SearchView.b(a).a(null);
        }
    }
}
