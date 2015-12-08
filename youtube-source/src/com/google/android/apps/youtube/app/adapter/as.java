// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ae, aq, ThumbnailRendererFactory, h

final class as
    implements ae
{

    final aq a;
    private final View b;
    private final h c;

    public as(aq aq1, View view, ViewGroup viewgroup)
    {
        a = aq1;
        super();
        b = view;
        c = (h)aq.a(aq1).a(view, viewgroup);
    }

    public final volatile View a(int i, Object obj)
    {
        obj = (Playlist)obj;
        c.a(i, obj);
        return b;
    }
}
