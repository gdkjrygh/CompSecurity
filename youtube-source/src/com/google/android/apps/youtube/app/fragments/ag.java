// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.datalib.legacy.model.Artist;
import com.google.android.apps.youtube.datalib.legacy.model.MusicVideo;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            af, ah

final class ag
    implements b
{

    final b a;
    final GDataRequest b;
    final com.google.android.apps.youtube.app.fragments.af c;

    ag(com.google.android.apps.youtube.app.fragments.af af1, b b1, GDataRequest gdatarequest)
    {
        c = af1;
        a = b1;
        b = gdatarequest;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        a.a(b, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj1 = (Artist)obj1;
        if (obj1 == null)
        {
            a.a(b, new Page(0, 0, 0, null, null, new ArrayList()));
        }
        obj = new ArrayList();
        for (obj1 = ((Artist) (obj1)).artistTape.iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(((MusicVideo)((Iterator) (obj1)).next()).videoId)) { }
        af.a(c).x().a(obj, new ah(this));
    }
}
