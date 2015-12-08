// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments.navigation;

import android.net.Uri;
import android.os.Bundle;
import com.google.a.a.a.a.qu;
import com.google.android.apps.youtube.app.fragments.ArtistFragment;
import com.google.android.apps.youtube.app.fragments.BrowseFragment;
import com.google.android.apps.youtube.app.fragments.CategoryFragment;
import com.google.android.apps.youtube.app.fragments.ChannelFragment;
import com.google.android.apps.youtube.app.fragments.ChannelStoreCategoryFragment;
import com.google.android.apps.youtube.app.fragments.ChannelStoreFragment;
import com.google.android.apps.youtube.app.fragments.InnerTubeRelatedFragment;
import com.google.android.apps.youtube.app.fragments.LiveFragment;
import com.google.android.apps.youtube.app.fragments.MoreFromArtistFragment;
import com.google.android.apps.youtube.app.fragments.MyFavoritesFragment;
import com.google.android.apps.youtube.app.fragments.MyPlaylistsFragment;
import com.google.android.apps.youtube.app.fragments.MySubscriptionsFragment;
import com.google.android.apps.youtube.app.fragments.MyUploadsFragment;
import com.google.android.apps.youtube.app.fragments.OfflineFragment;
import com.google.android.apps.youtube.app.fragments.OfflinePlaylistFragment;
import com.google.android.apps.youtube.app.fragments.PaneFragment;
import com.google.android.apps.youtube.app.fragments.SearchFragment;
import com.google.android.apps.youtube.app.fragments.WatchHistoryFragment;
import com.google.android.apps.youtube.app.fragments.WatchLaterFragment;
import com.google.android.apps.youtube.app.search.SearchType;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.q;

// Referenced classes of package com.google.android.apps.youtube.app.fragments.navigation:
//            PaneDescriptor

public final class d
{

    private static Bundle a(int j)
    {
        Bundle bundle = new Bundle();
        if ((j & 1) != 0)
        {
            bundle.putBoolean("must_authenticate", true);
        }
        if ((j & 2) != 0)
        {
            bundle.putBoolean("guide_entry", true);
        }
        return bundle;
    }

    public static final PaneDescriptor a()
    {
        Bundle bundle = a(3);
        bundle.putString("search_type", SearchType.CHANNEL.toString());
        return new PaneDescriptor(com/google/android/apps/youtube/app/fragments/ChannelStoreFragment, bundle);
    }

    public static final PaneDescriptor a(Uri uri)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        return a(p.c(uri), false);
    }

    public static final PaneDescriptor a(Uri uri, String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        Bundle bundle = a(1);
        bundle.putString("search_type", SearchType.CHANNEL.toString());
        bundle.putParcelable("channel_feed_uri", uri);
        bundle.putString("category", s);
        return new PaneDescriptor(com/google/android/apps/youtube/app/fragments/ChannelStoreCategoryFragment, bundle);
    }

    public static PaneDescriptor a(qu qu)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(qu);
        Bundle bundle = a(0);
        bundle.putByteArray("section_list_without_preview_proto", com.google.protobuf.nano.c.a(qu));
        return new PaneDescriptor(com/google/android/apps/youtube/app/fragments/InnerTubeRelatedFragment, bundle);
    }

    public static final PaneDescriptor a(PaneFragment panefragment)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(panefragment);
        Bundle bundle = panefragment.h();
        Class class1 = panefragment.getClass();
        if (bundle != null)
        {
            panefragment = bundle;
        } else
        {
            panefragment = new Bundle();
        }
        return new PaneDescriptor(class1, panefragment);
    }

    public static final PaneDescriptor a(SearchType searchtype, String s, com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter timefilter)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s, "query cannot be null");
        Bundle bundle = a(0);
        bundle.putString("search_type", searchtype.toString());
        bundle.putString("search_query", s);
        if (timefilter != null)
        {
            bundle.putSerializable("time_filter", timefilter);
        }
        return new PaneDescriptor(com/google/android/apps/youtube/app/fragments/SearchFragment, bundle);
    }

    public static final PaneDescriptor a(String s)
    {
        return a(s, false);
    }

    public static PaneDescriptor a(String s, String s1)
    {
        Bundle bundle = a(0);
        bundle.putString("artist_id", (String)com.google.android.apps.youtube.common.fromguava.c.a(s));
        bundle.putString("artist_name", (String)com.google.android.apps.youtube.common.fromguava.c.a(s1));
        return new PaneDescriptor(com/google/android/apps/youtube/app/fragments/MoreFromArtistFragment, bundle);
    }

    public static final PaneDescriptor a(String s, boolean flag)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        Bundle bundle;
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        bundle = a(byte0);
        bundle.putString("channel_username", s);
        return new PaneDescriptor(com/google/android/apps/youtube/app/fragments/ChannelFragment, bundle);
    }

    public static final PaneDescriptor b()
    {
        return new PaneDescriptor(com/google/android/apps/youtube/app/fragments/MySubscriptionsFragment, a(3));
    }

    public static final PaneDescriptor b(Uri uri)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        return b(com.google.android.apps.youtube.datalib.innertube.d.a(q.a(uri).a), false);
    }

    public static final PaneDescriptor b(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        Bundle bundle = a(2);
        bundle.putString("category_term", s);
        return new PaneDescriptor(com/google/android/apps/youtube/app/fragments/CategoryFragment, bundle);
    }

    public static PaneDescriptor b(String s, boolean flag)
    {
        Bundle bundle;
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        bundle = a(byte0);
        bundle.putString("browse_id", com.google.android.apps.youtube.common.fromguava.c.a(s));
        return new PaneDescriptor(com/google/android/apps/youtube/app/fragments/BrowseFragment, bundle);
    }

    public static final PaneDescriptor c()
    {
        return new PaneDescriptor(com/google/android/apps/youtube/app/fragments/LiveFragment, a(2));
    }

    public static final PaneDescriptor c(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        Bundle bundle = new Bundle();
        bundle.putString("playlist_id", s);
        return new PaneDescriptor(com/google/android/apps/youtube/app/fragments/OfflinePlaylistFragment, bundle);
    }

    public static final PaneDescriptor d()
    {
        return new PaneDescriptor(com/google/android/apps/youtube/app/fragments/WatchHistoryFragment, a(3));
    }

    public static PaneDescriptor d(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("artist_id", com.google.android.apps.youtube.common.fromguava.c.a(s));
        return new PaneDescriptor(com/google/android/apps/youtube/app/fragments/ArtistFragment, bundle);
    }

    public static final PaneDescriptor e()
    {
        return new PaneDescriptor(com/google/android/apps/youtube/app/fragments/MyUploadsFragment, a(3));
    }

    public static final PaneDescriptor f()
    {
        return new PaneDescriptor(com/google/android/apps/youtube/app/fragments/MyFavoritesFragment, a(3));
    }

    public static final PaneDescriptor g()
    {
        return new PaneDescriptor(com/google/android/apps/youtube/app/fragments/MyPlaylistsFragment, a(3));
    }

    public static final PaneDescriptor h()
    {
        return new PaneDescriptor(com/google/android/apps/youtube/app/fragments/WatchLaterFragment, a(3));
    }

    public static final PaneDescriptor i()
    {
        return new PaneDescriptor(com/google/android/apps/youtube/app/fragments/OfflineFragment, a(3));
    }
}
