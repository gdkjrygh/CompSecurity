// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.youtube.app.search.SearchType;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            SearchFragment

final class br
    implements android.widget.AdapterView.OnItemSelectedListener
{

    final SearchFragment a;

    private br(SearchFragment searchfragment)
    {
        a = searchfragment;
        super();
    }

    br(SearchFragment searchfragment, byte byte0)
    {
        this(searchfragment);
    }

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = SearchType.VIDEO;
        if (SearchType.CHANNEL.ordinal() != i) goto _L2; else goto _L1
_L1:
        adapterview = SearchType.CHANNEL;
_L4:
        if (adapterview != SearchFragment.g(a))
        {
            SearchFragment.a(a, adapterview);
            SearchFragment.f(a);
        }
        return;
_L2:
        if (SearchType.PLAYLISTS.ordinal() == i)
        {
            adapterview = SearchType.PLAYLISTS;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }
}
