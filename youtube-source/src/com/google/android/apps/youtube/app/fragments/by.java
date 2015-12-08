// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.widget.AbsListView;
import com.google.android.apps.youtube.app.ui.s;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            VideoInfoFragment

final class by
    implements android.widget.AbsListView.OnScrollListener
{

    final VideoInfoFragment a;

    private by(VideoInfoFragment videoinfofragment)
    {
        a = videoinfofragment;
        super();
    }

    by(VideoInfoFragment videoinfofragment, byte byte0)
    {
        this(videoinfofragment);
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        VideoInfoFragment.c(a).a(i);
    }
}
