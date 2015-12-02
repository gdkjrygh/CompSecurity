// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.view.View;
import android.widget.ListView;

// Referenced classes of package com.ubercab.client.feature.music:
//            PlaylistFragment

final class a
    implements Runnable
{

    final PlaylistFragment a;

    public final void run()
    {
        if (!PlaylistFragment.a(a))
        {
            a.mListViewTracks.removeFooterView(PlaylistFragment.b(a));
        } else
        if (a.mListViewTracks.getFooterViewsCount() == 0)
        {
            int i = a.mListViewTracks.getLastVisiblePosition();
            if (i != -1)
            {
                View view = a.mListViewTracks.getChildAt(i);
                i = PlaylistFragment.c(a).getTop();
                if (i != 0 && view.getBottom() > i)
                {
                    a.mListViewTracks.addFooterView(PlaylistFragment.b(a));
                    return;
                }
            }
        }
    }

    _cls9(PlaylistFragment playlistfragment)
    {
        a = playlistfragment;
        super();
    }
}
