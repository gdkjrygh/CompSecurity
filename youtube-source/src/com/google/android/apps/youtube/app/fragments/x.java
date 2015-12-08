// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.ui.presenter.a.b;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.j;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            GuideFragment

final class x
    implements j
{

    final GuideFragment a;

    x(GuideFragment guidefragment)
    {
        a = guidefragment;
        super();
    }

    public final g a()
    {
        return new b(GuideFragment.d(a), com.google.android.apps.youtube.app.fragments.GuideFragment.b(a), GuideFragment.e(a).aw(), GuideFragment.c(a));
    }
}
