// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.view.View;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.honeycomb.ui.ActionBarMenuHelper;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            SearchFragment

final class bn
    implements android.view.View.OnClickListener
{

    final SearchFragment a;

    bn(SearchFragment searchfragment)
    {
        a = searchfragment;
        super();
    }

    public final void onClick(View view)
    {
        a.c.O().a(true);
    }
}
