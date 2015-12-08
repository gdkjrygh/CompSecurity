// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.graphics.Bitmap;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            b

final class d
    implements b
{

    final com.google.android.apps.youtube.app.ui.b a;

    private d(com.google.android.apps.youtube.app.ui.b b1)
    {
        a = b1;
        super();
    }

    d(com.google.android.apps.youtube.app.ui.b b1, byte byte0)
    {
        this(b1);
    }

    public final void a(Object obj, Exception exception)
    {
        L.a("Error retrieving rating image", exception);
        com.google.android.apps.youtube.app.ui.b.b(a, null);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Bitmap)obj1;
        com.google.android.apps.youtube.app.ui.b.b(a, ((Bitmap) (obj)));
    }
}
