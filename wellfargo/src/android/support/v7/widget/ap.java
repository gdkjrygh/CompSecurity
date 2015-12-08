// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.widget:
//            SearchView

class ap
    implements android.widget.AdapterView.OnItemClickListener
{

    final SearchView a;

    ap(SearchView searchview)
    {
        a = searchview;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        SearchView.a(a, i, 0, null);
    }
}
