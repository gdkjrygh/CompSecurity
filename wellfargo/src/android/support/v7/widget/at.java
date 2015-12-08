// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.widget.CursorAdapter;

// Referenced classes of package android.support.v7.widget:
//            SearchView, be

class at
    implements Runnable
{

    final SearchView a;

    at(SearchView searchview)
    {
        a = searchview;
        super();
    }

    public void run()
    {
        if (SearchView.b(a) != null && (SearchView.b(a) instanceof be))
        {
            SearchView.b(a).changeCursor(null);
        }
    }
}
