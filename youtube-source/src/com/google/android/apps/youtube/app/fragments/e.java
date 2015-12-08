// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.datalib.legacy.model.ArtistSnippet;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            ArtistFragment

final class e
    implements android.widget.AdapterView.OnItemClickListener
{

    final ArtistFragment a;

    e(ArtistFragment artistfragment)
    {
        a = artistfragment;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (ArtistSnippet)ArtistFragment.g(a).getItemAtPosition(i);
        if (adapterview != null)
        {
            ArtistFragment.h(a).e(((ArtistSnippet) (adapterview)).id);
        }
    }
}
