// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            LoadingFragment

final class ae
    implements Runnable
{

    final View a;
    final LoadingFragment b;

    ae(LoadingFragment loadingfragment, View view)
    {
        b = loadingfragment;
        a = view;
        super();
    }

    public final void run()
    {
        a.setVisibility(0);
    }
}
