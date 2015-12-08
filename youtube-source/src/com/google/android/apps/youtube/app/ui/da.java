// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.widget.ImageView;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            cr

final class da
    implements b
{

    final cr a;

    private da(cr cr1)
    {
        a = cr1;
        super();
    }

    da(cr cr1, byte byte0)
    {
        this(cr1);
    }

    public final volatile void a(Object obj, Exception exception)
    {
        cr.a(a);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Playlist)obj1;
        if (cr.k(a) == null)
        {
            cr.a(a, ((Playlist) (obj)).contentUri);
        }
        cr.a(a, ((Playlist) (obj)));
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            obj1 = cr.l(a);
            float f;
            if (((Playlist) (obj)).isPrivate)
            {
                f = 0.2F;
            } else
            {
                f = 1.0F;
            }
            ((ImageView) (obj1)).setAlpha(f);
        }
        if (!cr.m(a))
        {
            com.google.android.apps.youtube.app.ui.cr.b(a, ((Playlist) (obj)));
        }
        cr.a(a);
    }
}
