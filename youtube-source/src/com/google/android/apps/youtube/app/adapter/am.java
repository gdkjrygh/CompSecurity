// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            al, an

final class am
    implements b
{

    final al a;
    private final Video b;
    private final b c;

    public am(al al1, Video video, b b1)
    {
        a = al1;
        super();
        b = video;
        c = b1;
    }

    public final void a(Object obj, Exception exception)
    {
        com.google.android.apps.youtube.app.adapter.al.b(a).a(b.ownerUri, new an(a, b, c));
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Uri)obj;
        obj1 = (Bitmap)obj1;
        al.a(a).put(b.id, obj);
        c.a(obj, obj1);
    }
}
