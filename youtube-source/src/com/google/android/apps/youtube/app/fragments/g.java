// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.content.Context;
import com.google.android.apps.youtube.app.adapter.af;
import com.google.android.apps.youtube.app.adapter.ai;
import com.google.android.apps.youtube.datalib.legacy.model.Artist;
import com.google.android.apps.youtube.datalib.legacy.model.ArtistSnippet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            ArtistFragment

final class g extends af
{

    public boolean a;
    final ArtistFragment b;

    public g(ArtistFragment artistfragment, Context context, int i, ai ai)
    {
        b = artistfragment;
        super(context, i, ai);
    }

    public final void a(Artist artist)
    {
        a();
        for (artist = artist.relatedArtists.iterator(); artist.hasNext(); d((ArtistSnippet)artist.next())) { }
    }

    public final void a(boolean flag)
    {
        if (a != flag)
        {
            a = flag;
            notifyDataSetChanged();
        }
    }

    public final int getCount()
    {
        int i = super.getCount();
        if (a && i > 3)
        {
            return 3;
        } else
        {
            return i;
        }
    }
}
