// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.view.SurfaceHolder;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ej

final class eq
    implements Runnable
{

    final ej a;

    eq(ej ej1)
    {
        a = ej1;
        super();
    }

    public final void run()
    {
        if (ej.d(a) != null)
        {
            ej.d(a).setSizeFromLayout();
        }
    }
}
