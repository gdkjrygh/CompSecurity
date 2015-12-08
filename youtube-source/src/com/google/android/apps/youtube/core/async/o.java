// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.d;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            GDataRequest, n

final class o
    implements d
{

    final GDataRequest a;
    final n b;

    o(n n, GDataRequest gdatarequest)
    {
        b = n;
        a = gdatarequest;
        super();
    }

    public final boolean a(Object obj)
    {
        obj = (GDataRequest)obj;
        return Pattern.compile((new StringBuilder("^")).append(((GDataRequest) (obj)).a.getPath().replace("/default/", "/[^/]+/")).toString()).matcher(a.a.getPath()).find();
    }
}
