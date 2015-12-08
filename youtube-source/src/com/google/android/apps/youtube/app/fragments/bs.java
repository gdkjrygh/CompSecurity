// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.app.ui.bk;
import com.google.android.apps.youtube.core.Analytics;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            SearchFragment

final class bs
    implements bk
{

    final SearchFragment a;

    private bs(SearchFragment searchfragment)
    {
        a = searchfragment;
        super();
    }

    bs(SearchFragment searchfragment, byte byte0)
    {
        this(searchfragment);
    }

    public final void a(Enum enum)
    {
        enum = (com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter)enum;
        SearchFragment.e(a).a("TimeFilter", enum.toString());
        SearchFragment.a(a, enum);
        SearchFragment.f(a);
    }
}
