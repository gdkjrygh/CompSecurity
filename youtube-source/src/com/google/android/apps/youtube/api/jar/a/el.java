// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.view.SurfaceHolder;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ej

final class el
    implements Runnable
{

    final boolean a;
    final ej b;

    el(ej ej1, boolean flag)
    {
        b = ej1;
        a = flag;
        super();
    }

    public final void run()
    {
        if (ej.d(b) != null)
        {
            ej.d(b).setKeepScreenOn(a);
        }
    }
}
