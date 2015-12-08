// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.Context;
import com.google.android.apps.ytremote.model.CloudScreen;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            YouTubeTvScreen, c, bw

final class b
    implements com.google.android.apps.youtube.common.a.b
{

    final bw a;
    final Context b;

    b(bw bw1, Context context)
    {
        a = bw1;
        b = context;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (CloudScreen)obj1;
        obj1 = new YouTubeTvScreen(((CloudScreen) (obj)));
        a.b(new c(this, ((YouTubeTvScreen) (obj1)), ((CloudScreen) (obj))));
    }
}
