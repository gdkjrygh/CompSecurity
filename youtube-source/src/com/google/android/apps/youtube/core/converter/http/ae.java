// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.core.converter.e;
import com.google.android.apps.youtube.core.converter.f;
import com.google.android.apps.youtube.core.converter.g;
import com.google.android.apps.youtube.core.converter.n;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            ap, am, al, ak, 
//            aj, ai, ah, ag, 
//            af, fp, an

public final class ae extends ap
{

    private final e c;

    public ae(n n)
    {
        super(n);
        n = g.a("/feed").a("/feed/entry", new am(this)).a("/feed/entry/author/name", new al(this)).a("/feed/entry/author/uri", new ak(this)).a("/feed/entry/category", new aj(this)).a("/feed/entry/updated", new ai(this)).a("/feed/entry/yt:groupId", new ah(this)).a("/feed/entry/yt:videoid", new ag(this)).a("/feed/entry/yt:username", new af(this));
        fp.d(n, (new StringBuilder()).append("/feed/entry/link").append("/entry").toString());
        n.a("/feed/entry/link", new an(this));
        c = n.a();
    }

    protected final e a()
    {
        return c;
    }
}
