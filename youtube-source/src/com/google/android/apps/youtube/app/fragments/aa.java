// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.view.View;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.fragments.navigation.d;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            GuideFragment

final class aa
    implements android.view.View.OnClickListener
{

    final GuideFragment a;

    aa(GuideFragment guidefragment)
    {
        a = guidefragment;
        super();
    }

    public final void onClick(View view)
    {
        GuideFragment.b(a).a(d.i());
    }
}
