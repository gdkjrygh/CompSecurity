// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.view.SurfaceHolder;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ej

final class eo
    implements Runnable
{

    final int a;
    final int b;
    final ej c;

    eo(ej ej1, int i, int j)
    {
        c = ej1;
        a = i;
        b = j;
        super();
    }

    public final void run()
    {
        if (ej.d(c) != null)
        {
            ej.d(c).setFixedSize(a, b);
        }
    }
}
