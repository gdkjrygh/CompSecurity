// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.adapter.ae;
import com.google.android.apps.youtube.datalib.legacy.model.ArtistSnippet;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            ArtistFragment

final class f
    implements ae
{

    final ArtistFragment a;
    private final View b;
    private final View c;
    private final TextView d;

    public f(ArtistFragment artistfragment, View view)
    {
        a = artistfragment;
        super();
        b = view;
        c = b.findViewById(j.eu);
        d = (TextView)b.findViewById(j.dZ);
    }

    public final View a(int i, Object obj)
    {
        obj = (ArtistSnippet)obj;
        View view = c;
        if (i == 0)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
        d.setText(((ArtistSnippet) (obj)).name);
        return b;
    }
}
