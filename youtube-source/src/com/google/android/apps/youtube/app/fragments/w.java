// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.app.ui.presenter.a.d;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.j;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            GuideFragment

final class w
    implements j
{

    final GuideFragment a;

    w(GuideFragment guidefragment)
    {
        a = guidefragment;
        super();
    }

    public final g a()
    {
        return new d(GuideFragment.b(a), GuideFragment.c(a));
    }
}
