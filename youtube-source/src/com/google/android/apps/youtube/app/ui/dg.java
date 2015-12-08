// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.datalib.innertube.model.ac;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ab, df, cl

final class dg
    implements ab
{

    final df a;

    dg(df df1)
    {
        a = df1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (ac)obj;
        df.a(a).b("Share Playlist");
        df.b(a).a(((ac) (obj)).b(), ((ac) (obj)).d());
    }
}
