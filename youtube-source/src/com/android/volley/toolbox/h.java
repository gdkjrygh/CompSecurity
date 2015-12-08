// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import com.android.volley.o;

// Referenced classes of package com.android.volley.toolbox:
//            g

final class h
    implements o
{

    final String a;
    final g b;

    h(g g1, String s)
    {
        b = g1;
        a = s;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (Bitmap)obj;
        g.a(b, a, ((Bitmap) (obj)));
    }
}
