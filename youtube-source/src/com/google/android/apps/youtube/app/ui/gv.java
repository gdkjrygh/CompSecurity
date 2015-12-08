// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            gt

final class gv
    implements b
{

    final gt a;

    private gv(gt gt1)
    {
        a = gt1;
        super();
    }

    gv(gt gt1, byte byte0)
    {
        this(gt1);
    }

    public final volatile void a(Object obj, Exception exception)
    {
        L.a("Error retrieving user thumbnail", exception);
        gt.a(a);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Bitmap)obj1;
        gt.d(a).setImageBitmap(((Bitmap) (obj)));
    }
}
