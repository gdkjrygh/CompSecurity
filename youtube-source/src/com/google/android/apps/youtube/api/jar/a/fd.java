// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.core.player.overlay.bm;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ez

final class fd
    implements Runnable
{

    final String a;
    final List b;
    final boolean c;
    final ez d;

    fd(ez ez1, String s, List list, boolean flag)
    {
        d = ez1;
        a = s;
        b = list;
        c = flag;
        super();
    }

    public final void run()
    {
        ez.b(d).a(a, b, c);
    }
}
