// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.ytremote.backend.model.Method;
import com.google.android.apps.ytremote.backend.model.Params;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            bk

final class bl
    implements Runnable
{

    final String a;
    final bk b;

    bl(bk bk1, String s)
    {
        b = bk1;
        a = s;
        super();
    }

    public final void run()
    {
        Params params = new Params();
        params.a("username", a);
        params.a("authToken", bk.a(b));
        bk.a(b, Method.UPDATE_USERNAME, params);
    }
}
