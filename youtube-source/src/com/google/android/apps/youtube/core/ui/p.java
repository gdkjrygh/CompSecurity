// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            o, n

final class p
    implements b
{

    final o a;

    p(o o1)
    {
        a = o1;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Bitmap)obj1;
        n.d(a.a).setImageBitmap(((Bitmap) (obj)));
    }
}
