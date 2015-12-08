// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.Context;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.ytremote.model.CloudScreen;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            a

final class d
    implements b
{

    final Context a;

    d(Context context)
    {
        a = context;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
    }

    public final void a(Object obj, Object obj1)
    {
        obj = ((CloudScreen)obj1).getScreenId();
        com.google.android.apps.youtube.app.remote.a.a(a, ((com.google.android.apps.ytremote.model.ScreenId) (obj)));
    }
}
