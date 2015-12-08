// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.UserProfile;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            al

final class an
    implements b
{

    final al a;
    private final Video b;
    private final b c;

    public an(al al1, Video video, b b1)
    {
        a = al1;
        super();
        b = video;
        c = b1;
    }

    public final volatile void a(Object obj, Exception exception)
    {
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (UserProfile)obj1;
        al.a(a).put(b.id, ((UserProfile) (obj)).thumbnailUri);
        al.c(a).a(((UserProfile) (obj)).thumbnailUri, c);
    }
}
