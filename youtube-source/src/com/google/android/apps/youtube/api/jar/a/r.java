// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.view.KeyEvent;
import com.google.android.apps.youtube.api.jar.a;
import com.google.android.apps.youtube.api.jar.v;
import com.google.android.apps.youtube.core.utils.PackageUtil;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            a

final class r
    implements v
{

    final com.google.android.apps.youtube.api.jar.a.a a;

    private r(com.google.android.apps.youtube.api.jar.a.a a1)
    {
        a = a1;
        super();
    }

    r(com.google.android.apps.youtube.api.jar.a.a a1, byte byte0)
    {
        this(a1);
    }

    public final void a()
    {
        if (com.google.android.apps.youtube.api.jar.a.a.e(a))
        {
            a.M();
        }
    }

    public final boolean a(int i, KeyEvent keyevent)
    {
        return a.a(i, keyevent);
    }

    public final void b()
    {
        if (PackageUtil.d(com.google.android.apps.youtube.api.jar.a.a.f(a)))
        {
            a.d(false);
            return;
        } else
        {
            com.google.android.apps.youtube.api.jar.a.a.g(a).f();
            return;
        }
    }

    public final boolean b(int i, KeyEvent keyevent)
    {
        return a.b(i, keyevent);
    }
}
