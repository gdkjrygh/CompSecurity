// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.graphics.Bitmap;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            g

final class i
    implements b
{

    final g a;

    private i(g g1)
    {
        a = g1;
        super();
    }

    i(g g1, byte byte0)
    {
        this(g1);
    }

    public final volatile void a(Object obj, Exception exception)
    {
        L.a("Error retrieving user banner", exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Bitmap)obj1;
        g.c(a).setImageBitmap(((Bitmap) (obj)));
        g.a(a, true);
        if (g.d(a) && g.e(a))
        {
            g.f(a).reset();
            g.f(a).setDuration(g.g(a));
            g.c(a).setAnimation(g.f(a));
            com.google.android.apps.youtube.app.ui.g.b(a, false);
        }
    }
}
