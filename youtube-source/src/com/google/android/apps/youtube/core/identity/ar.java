// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            l, f

public final class ar
{

    private final l a;

    public ar(l l1)
    {
        a = (l)c.a(l1);
    }

    public final Uri a(Uri uri)
    {
        f f1 = a.g();
        Uri uri1 = uri;
        if (f1 != f.a)
        {
            uri1 = uri;
            if (f1.d())
            {
                uri1 = uri.buildUpon().appendQueryParameter("on-behalf-of", f1.a()).build();
            }
        }
        return uri1;
    }
}
