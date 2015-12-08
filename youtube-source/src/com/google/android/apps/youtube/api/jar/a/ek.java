// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.apps.youtube.api.b.a.ba;
import com.google.android.youtube.player.internal.b.b;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            es, ej, eu, et

final class ek
    implements Runnable
{

    final ba a;
    final ej b;

    ek(ej ej1, ba ba)
    {
        b = ej1;
        a = ba;
        super();
    }

    public final void run()
    {
        ej.a(b, new es(a, ej.a(b)));
        Object obj;
        if (com.google.android.apps.youtube.api.jar.a.ej.b(com.google.android.youtube.player.internal.b.b.a(com.google.android.apps.youtube.api.jar.a.ej.b(b).getPackageManager())))
        {
            try
            {
                obj = new eu(com.google.android.apps.youtube.api.jar.a.ej.b(b), ej.c(b));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalStateException("Could not create ProxyRelayoutSurfaceView: ", ((Throwable) (obj)));
            }
        } else
        {
            obj = new SurfaceView(com.google.android.apps.youtube.api.jar.a.ej.b(b));
        }
        ej.a(b, ((SurfaceView) (obj)).getHolder());
        ej.d(b).addCallback(ej.c(b));
        ej.a(b).a(((SurfaceView) (obj)));
    }
}
