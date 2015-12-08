// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import android.net.Uri;
import android.util.Pair;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            af, GDataRequestFactory, GDataRequest

public abstract class a
    implements af
{

    protected final GDataRequestFactory a;
    private final af b;
    private final af c;

    public a(GDataRequestFactory gdatarequestfactory, af af1, af af2)
    {
        a = (GDataRequestFactory)com.google.android.apps.youtube.common.fromguava.c.a(gdatarequestfactory);
        b = (af)com.google.android.apps.youtube.common.fromguava.c.a(af1);
        c = (af)com.google.android.apps.youtube.common.fromguava.c.a(af2);
    }

    private List c(Object obj, Uri uri)
    {
        ArrayList arraylist = new ArrayList();
        Object obj1;
        do
        {
            obj1 = com.google.android.apps.youtube.common.a.c.a();
            c.a(b(obj, uri), ((b) (obj1)));
            uri = (Page)((com.google.android.apps.youtube.common.a.c) (obj1)).get();
            arraylist.addAll(((Page) (uri)).entries);
            obj1 = ((Page) (uri)).nextUri;
            if (((Page) (uri)).totalResults <= arraylist.size())
            {
                break;
            }
            uri = ((Uri) (obj1));
        } while (obj1 != null);
        return arraylist;
    }

    protected abstract GDataRequest a(Object obj, Uri uri);

    protected abstract String a(Object obj);

    public final void a(Object obj, b b1)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        com.google.android.apps.youtube.common.fromguava.c.a(obj);
        Object obj1 = Uri.parse((new StringBuilder("https://gdata.youtube.com/feeds/api/playlists/")).append(a(obj)).toString());
        com.google.android.apps.youtube.common.a.c c1 = com.google.android.apps.youtube.common.a.c.a();
        b.a(a(obj, ((Uri) (obj1))), c1);
        try
        {
            obj1 = c(obj, ((Uri) (obj1)));
            b1.a(obj, new Pair((Playlist)c1.get(), obj1));
            return;
        }
        catch (ExecutionException executionexception)
        {
            b1.a(obj, executionexception);
        }
    }

    protected abstract GDataRequest b(Object obj, Uri uri);
}
