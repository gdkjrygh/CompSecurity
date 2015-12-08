// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            g

final class k
    implements b
{

    final g a;

    private k(g g1)
    {
        a = g1;
        super();
    }

    k(g g1, byte byte0)
    {
        this(g1);
    }

    public final void a(Object obj, Exception exception)
    {
        L.a("Error retrieving user thumbnail", exception);
        com.google.android.apps.youtube.app.ui.g.b(a);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Bitmap)obj1;
        g.a(a).setImageBitmap(((Bitmap) (obj)));
    }
}
