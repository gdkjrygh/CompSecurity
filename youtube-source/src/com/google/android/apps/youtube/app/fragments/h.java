// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.content.DialogInterface;
import com.google.android.apps.youtube.datalib.innertube.model.ab;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            BrowseFragment

final class h
    implements android.content.DialogInterface.OnClickListener
{

    final BrowseFragment a;

    h(BrowseFragment browsefragment)
    {
        a = browsefragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            BrowseFragment.a(a, BrowseFragment.a(a).a());
        }
    }
}
