// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.ui.dw;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.Artist;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            ArtistFragment, b

final class a
    implements b
{

    final ArtistFragment a;

    a(ArtistFragment artistfragment)
    {
        a = artistfragment;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        com.google.android.apps.youtube.app.fragments.ArtistFragment.b(a).setText(a.c.getString(p.cL));
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Artist)obj1;
        ArtistFragment.a(a, ((Artist) (obj)).name);
        ArtistFragment.a(a).setText(((Artist) (obj)).name);
        a.F();
        if (TextUtils.isEmpty(((Artist) (obj)).bio))
        {
            com.google.android.apps.youtube.app.fragments.ArtistFragment.b(a).setText(a.c.getString(p.cL));
        } else
        {
            com.google.android.apps.youtube.app.fragments.ArtistFragment.b(a).setText(((Artist) (obj)).bio.replaceAll("[\\r\\n]+", "\r\n\r\n").trim());
            ArtistFragment.a(a, false);
            com.google.android.apps.youtube.app.fragments.ArtistFragment.b(a).setMaxLines(4);
            ArtistFragment.c(a);
        }
        ArtistFragment.d(a).a(a.c, obj);
        ArtistFragment.a(a, ((Artist) (obj)));
        ArtistFragment.a(a).setOnClickListener(new com.google.android.apps.youtube.app.fragments.b(this));
    }
}
