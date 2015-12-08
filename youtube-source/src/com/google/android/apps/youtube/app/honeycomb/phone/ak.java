// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.v;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            UploadActivity

final class ak
    implements v
{

    final UploadActivity a;

    private ak(UploadActivity uploadactivity)
    {
        a = uploadactivity;
        super();
    }

    ak(UploadActivity uploadactivity, byte byte0)
    {
        this(uploadactivity);
    }

    public final void a()
    {
        UploadActivity.e(a);
    }

    public final void a(Exception exception)
    {
        L.a("Error authenticating", exception);
        UploadActivity.b(a).c(exception);
        a.finish();
    }

    public final void b()
    {
        a.finish();
    }
}
