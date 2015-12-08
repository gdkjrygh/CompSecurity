// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.widget:
//            SearchView

final class c
    implements android.widget.AdapterView.OnItemSelectedListener
{

    final SearchView a;

    c(SearchView searchview)
    {
        a = searchview;
        super();
    }

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        SearchView.a(a, i);
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }
}
