// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.adapter.ae;
import com.google.android.apps.youtube.app.adapter.g;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            f, ArtistFragment

final class d extends g
{

    final ArtistFragment a;

    d(ArtistFragment artistfragment)
    {
        a = artistfragment;
        super();
    }

    public final ae a(View view, ViewGroup viewgroup)
    {
        return new f(a, view);
    }
}
