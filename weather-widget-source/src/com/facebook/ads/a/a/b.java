// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a.a;

import android.content.Context;
import android.net.Uri;

// Referenced classes of package com.facebook.ads.a.a:
//            e, c, d, a

public class b
{

    public static a a(Context context, Uri uri)
    {
        String s = uri.getAuthority();
        String s1 = uri.getQueryParameter("video_url");
        if ("store".equals(s))
        {
            if (s1 != null)
            {
                return new e(context, uri);
            } else
            {
                return new c(context, uri);
            }
        }
        if ("open_link".equals(s))
        {
            return new d(context, uri);
        } else
        {
            return null;
        }
    }
}
