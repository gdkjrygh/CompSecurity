// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.app.Activity;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.ui.ie;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.a.a;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.ui.PagedView;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            MySubscriptionsFragment

final class ao extends ie
{

    final MySubscriptionsFragment a;

    ao(MySubscriptionsFragment mysubscriptionsfragment, Activity activity, PagedView pagedview, a a1, af af, aw aw, boolean flag, 
            am am, boolean flag1, WatchFeature watchfeature, Analytics analytics, com.google.android.apps.youtube.core.Analytics.VideoCategory videocategory)
    {
        a = mysubscriptionsfragment;
        super(activity, pagedview, a1, af, aw, false, am, false, watchfeature, analytics, videocategory);
    }

    protected final void a()
    {
        super.a();
        com.google.android.apps.youtube.app.fragments.MySubscriptionsFragment.a(a, true);
        com.google.android.apps.youtube.app.fragments.MySubscriptionsFragment.a(a);
    }
}
