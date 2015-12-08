// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.core.converter.f;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            dq, eb, ea, ej, 
//            ei, eh, eg, ef, 
//            ee, ed, ec, dz

public final class dy
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "http://gdata.youtube.com/schemas/2007#user.uploads", "http://gdata.youtube.com/schemas/2007#user.favorites", "http://gdata.youtube.com/schemas/2007#user.subscriptions", "http://gdata.youtube.com/schemas/2007#user.watchhistory", "http://gdata.youtube.com/schemas/2007#user.watchlater", "http://gdata.youtube.com/schemas/2007#user.playlists", "http://gdata.youtube.com/schemas/2007#user.recentactivity"
    })));

    static Set a()
    {
        return a;
    }

    public static void a(f f1)
    {
        dq.a(f1);
        b(f1, "");
    }

    public static void a(f f1, String s)
    {
        dq.a(f1, s);
        b(f1, s);
    }

    private static void b(f f1, String s)
    {
        f1.a((new StringBuilder()).append(s).append("/entry/yt:username").toString(), new eb()).a((new StringBuilder()).append(s).append("/entry/yt:channelId").toString(), new ea()).a((new StringBuilder()).append(s).append("/entry/yt:googlePlusUserId").toString(), new ej()).a((new StringBuilder()).append(s).append("/entry/author/email").toString(), new ei()).a((new StringBuilder()).append(s).append("/entry/yt:age").toString(), new eh()).a((new StringBuilder()).append(s).append("/entry/yt:gender").toString(), new eg()).a((new StringBuilder()).append(s).append("/entry/media:thumbnail").toString(), new ef()).a((new StringBuilder()).append(s).append("/entry/yt:incomplete").toString(), new ee()).a((new StringBuilder()).append(s).append("/entry/yt:eligibleForChannel").toString(), new ed()).a((new StringBuilder()).append(s).append("/entry/yt:statistics").toString(), new ec()).a((new StringBuilder()).append(s).append("/entry/gd:feedLink").toString(), new dz()).a();
    }

}
