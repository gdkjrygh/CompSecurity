// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            w

public final class GDataRequest extends w
{

    private GDataRequest(Uri uri, Map map, byte abyte0[])
    {
        Uri uri1 = uri;
        if ("http".equalsIgnoreCase(uri.getScheme()))
        {
            boolean flag;
            if ("stage.gdata.youtube.com".equalsIgnoreCase(uri.getHost()) || "dev.gdata.youtube.com".equalsIgnoreCase(uri.getHost()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            uri1 = uri;
            if (!flag)
            {
                uri1 = uri.buildUpon().scheme("https").build();
            }
        }
        super(uri1, map, abyte0);
    }

    public static GDataRequest a(Uri uri)
    {
        return new GDataRequest(uri, null, null);
    }

    public static GDataRequest a(Uri uri, GDataRequest gdatarequest)
    {
        c.a(gdatarequest);
        return new GDataRequest(uri, gdatarequest.b, a(((w) (gdatarequest))));
    }

    public static GDataRequest a(Uri uri, Map map)
    {
        c.a(map);
        return new GDataRequest(uri, map, null);
    }

    public static GDataRequest a(Uri uri, Map map, byte abyte0[])
    {
        c.a(map);
        c.a(abyte0);
        return new GDataRequest(uri, map, abyte0);
    }

    public static GDataRequest a(Uri uri, byte abyte0[])
    {
        c.a(abyte0);
        return new GDataRequest(uri, null, abyte0);
    }

    public final GDataRequest b(Uri uri)
    {
        c.a(uri);
        return new GDataRequest(uri, b, a(this));
    }
}
