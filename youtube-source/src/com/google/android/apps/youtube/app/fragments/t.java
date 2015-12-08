// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            GuideFragment

final class t
    implements android.view.View.OnClickListener
{

    final GuideFragment a;

    t(GuideFragment guidefragment)
    {
        a = guidefragment;
        super();
    }

    public final void onClick(View view)
    {
        GuideFragment.a(a);
    }
}
