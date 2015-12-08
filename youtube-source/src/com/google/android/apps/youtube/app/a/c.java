// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.a;

import android.net.Uri;
import android.os.Handler;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.a.e;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import java.util.LinkedList;
import java.util.List;

public final class c
    implements b
{

    private final GDataRequestFactory a;
    private final af b;
    private final b c;
    private final b d;
    private List e;
    private int f;
    private int g;
    private int h;

    public c(bc bc1, af af1, Handler handler, b b1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(handler);
        a = ((bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1)).a();
        b = (af)com.google.android.apps.youtube.common.fromguava.c.a(af1);
        c = com.google.android.apps.youtube.common.a.e.a(handler, this);
        d = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
    }

    private void a(int i, GDataRequest gdatarequest)
    {
        int j = 1;
        if (i > 1)
        {
            gdatarequest = gdatarequest.a.buildUpon().query(null).build();
            h = i - 1;
            while (j < i) 
            {
                int k = g;
                Object obj = gdatarequest.buildUpon().appendQueryParameter("start-index", Integer.toString(k * j + 1)).build();
                GDataRequestFactory gdatarequestfactory = a;
                obj = GDataRequestFactory.e(((Uri) (obj)));
                b.a(obj, c);
                j++;
            }
        }
    }

    public final void a(Uri uri)
    {
        if (h == 0)
        {
            h = 1;
            uri = GDataRequest.a(uri.buildUpon().appendQueryParameter("inline", "true").appendQueryParameter("start-index", Integer.toString(1)).build());
            b.a(uri, c);
        }
    }

    public final void a(Object obj, Exception exception)
    {
        obj = (GDataRequest)obj;
        L.c((new StringBuilder("Error for request ")).append(obj).append(" : ").append(exception).toString());
        d.a(obj, exception);
        h = h - 1;
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (GDataRequest)obj;
        obj1 = (Page)obj1;
        h = h - 1;
        if (((Page) (obj1)).startIndex == 1)
        {
            g = ((Page) (obj1)).elementsPerPage;
            f = ((Page) (obj1)).totalResults;
            int i = (int)Math.ceil((double)f / (double)g);
            e = new LinkedList();
            e.addAll(((Page) (obj1)).entries);
            a(i, ((GDataRequest) (obj)));
        } else
        {
            e.addAll(((Page) (obj1)).entries);
        }
        if (h == 0)
        {
            obj1 = new Page(f, g, 1, ((Page) (obj1)).previousUri, ((Page) (obj1)).nextUri, e);
            d.a(obj, obj1);
        }
    }
}
