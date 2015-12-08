// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.e;

import android.net.Uri;
import com.android.volley.n;

// Referenced classes of package com.google.android.apps.youtube.datalib.e:
//            b

final class c
    implements Runnable
{

    final n a;
    final Uri b;
    final b c;

    c(b b1, n n1, Uri uri)
    {
        c = b1;
        a = n1;
        b = uri;
        super();
    }

    public final void run()
    {
        a.a(new com.google.android.apps.youtube.datalib.offline.SendingStrategy.PermanentVolleyError((new StringBuilder("Invalid URI ")).append(b).toString()));
    }
}
