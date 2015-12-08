// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.util.Pair;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.apps.youtube.uilib.a.h;
import com.google.android.youtube.p;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            bz, LoadingFrameLayout

final class cb
    implements b
{

    final bz a;

    private cb(bz bz1)
    {
        a = bz1;
        super();
    }

    cb(bz bz1, byte byte0)
    {
        this(bz1);
    }

    public final void a(Object obj, Exception exception)
    {
        bz.e(a).a(bz.d(a).getString(p.cV));
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Pair)obj1;
        bz.c(a).b();
        if (obj == null || ((Pair) (obj)).first == null || ((Pair) (obj)).second == null)
        {
            bz.e(a).a(bz.d(a).getString(p.cV));
            return;
        }
        obj1 = ((Pair) (obj)).first;
        obj = (List)((Pair) (obj)).second;
        bz.f(a).clear();
        Video video;
        for (obj1 = ((List) (obj)).iterator(); ((Iterator) (obj1)).hasNext(); bz.f(a).add(video.id))
        {
            video = (Video)((Iterator) (obj1)).next();
        }

        bz.c(a).a(((java.util.Collection) (obj)));
        bz.e(a).b();
    }
}
