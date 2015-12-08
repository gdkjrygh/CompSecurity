// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.android.volley.VolleyError;
import com.google.android.apps.youtube.app.d.f;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.distiller.model.a;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            VideoInfoFragment

final class bu
    implements l
{

    final String a;
    final VideoInfoFragment b;

    bu(VideoInfoFragment videoinfofragment, String s)
    {
        b = videoinfofragment;
        a = s;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        com.google.android.apps.youtube.app.fragments.VideoInfoFragment.a(b).a(new a(a));
        VideoInfoFragment.b(b);
    }

    public final void a(Object obj)
    {
        obj = (a)obj;
        com.google.android.apps.youtube.app.fragments.VideoInfoFragment.a(b).a(((a) (obj)));
        VideoInfoFragment.b(b);
    }
}
