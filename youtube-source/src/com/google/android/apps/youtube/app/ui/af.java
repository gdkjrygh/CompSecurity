// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.app.offline.f;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ab, at, ad

final class af
    implements ab
{

    final at a;
    final YouTubeActivity b;
    final f c;

    af(at at1, YouTubeActivity youtubeactivity, f f)
    {
        a = at1;
        b = youtubeactivity;
        c = f;
        super();
    }

    public final void a(Object obj)
    {
        obj = a.a(obj);
        ad.a(b, ((String) (obj)), c);
    }
}
