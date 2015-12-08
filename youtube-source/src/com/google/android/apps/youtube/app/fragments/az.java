// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreen;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.remote.ck;
import com.google.android.apps.youtube.common.a.a;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            PlayerFragment, bb, ba

final class az
    implements ck
{

    final PlayerFragment a;

    az(PlayerFragment playerfragment)
    {
        a = playerfragment;
        super();
    }

    public final void a()
    {
        com.google.android.apps.youtube.app.fragments.PlayerFragment.a(a).runOnUiThread(new bb(this));
    }

    public final void a(YouTubeTvScreen youtubetvscreen)
    {
        PlayerFragment.e(a).a(youtubetvscreen, com.google.android.apps.youtube.common.a.a.a(com.google.android.apps.youtube.app.fragments.PlayerFragment.a(a), new ba(this)));
    }
}
