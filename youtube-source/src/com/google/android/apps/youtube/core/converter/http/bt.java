// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.core.converter.c;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            HttpMethod

public final class bt
    implements c
{

    private static final Uri a = Uri.parse("https://www.googleapis.com/youtubeMusic/v1/musicVideos");
    private final String b;
    private final String c;

    public bt(String s, String s1)
    {
        b = com.google.android.apps.youtube.common.fromguava.c.a(s, "apiaryKey cannot be empty");
        s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = "US";
        }
        c = s;
    }

    public final Object a(Object obj)
    {
        obj = (String)obj;
        obj = a.buildUpon().appendPath(((String) (obj))).appendQueryParameter("key", b).appendQueryParameter("countryCode", c).build();
        return HttpMethod.GET.createHttpRequest(((Uri) (obj)));
    }

}
