// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.apps.youtube.uilib.a.h;
import com.google.android.youtube.p;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            cc, LoadingFrameLayout, cf

final class cg
    implements b
{

    final cc a;

    private cg(cc cc1)
    {
        a = cc1;
        super();
    }

    cg(cc cc1, byte byte0)
    {
        this(cc1);
    }

    public final void a(Object obj, Exception exception)
    {
        cc.e(a).a(p.cP);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (List)obj1;
        cc.c(a).b();
        cc.d(a).clear();
        if (((List) (obj)).isEmpty())
        {
            cc.e(a).a(p.cP);
        } else
        {
            cc.c(a).a(((java.util.Collection) (obj)));
            cc.e(a).b();
            obj1 = ((List) (obj)).iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                Playlist playlist = (Playlist)((Iterator) (obj1)).next();
                cc.d(a).add(playlist.id);
            }
        }
        cc.f(a).a(((List) (obj)).size());
    }
}
