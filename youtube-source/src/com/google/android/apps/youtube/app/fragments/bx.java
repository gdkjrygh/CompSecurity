// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.uilib.innertube.q;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            VideoInfoFragment, PlayerFragment

final class bx
    implements q
{

    final VideoInfoFragment a;

    private bx(VideoInfoFragment videoinfofragment)
    {
        a = videoinfofragment;
        super();
    }

    bx(VideoInfoFragment videoinfofragment, byte byte0)
    {
        this(videoinfofragment);
    }

    public final void k_()
    {
        if (VideoInfoFragment.d(a) != null)
        {
            VideoInfoFragment.d(a).a();
        }
    }
}
