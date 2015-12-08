// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.VideoAdActivity;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.ads.a.a:
//            c

public class e extends c
{

    private static final String a = com/facebook/ads/a/a/e.getSimpleName();
    private final Context b;
    private final Uri c;

    public e(Context context, Uri uri)
    {
        super(context, uri);
        b = context;
        c = uri;
    }

    private static void a(Map map, Intent intent)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); intent.putExtra((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public void a(Map map)
    {
        a(b, c);
        String s = c.getQueryParameter("video_url");
        Intent intent = new Intent(b, com/facebook/ads/VideoAdActivity);
        intent.putExtra("adUri", c.toString());
        intent.putExtra("adVideoPath", s);
        intent.putExtra("adMarketUri", b().toString());
        a(map, intent);
        intent.addFlags(0x10000000);
        try
        {
            b.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            Log.d(a, "Failed to start video", map);
        }
    }

}
