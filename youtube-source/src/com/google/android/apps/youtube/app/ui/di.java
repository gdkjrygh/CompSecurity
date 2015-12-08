// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.datalib.innertube.model.ac;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ab, df, LikeAction, cl

final class di
    implements ab
{

    final df a;

    di(df df1)
    {
        a = df1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (ac)obj;
        df.a(a).b((new StringBuilder()).append(LikeAction.REMOVE_LIKE.toString()).append(" Playlist").toString());
        df.b(a).a(LikeAction.REMOVE_LIKE, ((ac) (obj)).b());
    }
}
