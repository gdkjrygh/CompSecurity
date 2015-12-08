// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.d;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            GDataRequest, w, p

final class q
    implements d
{

    final GDataRequest a;
    final p b;

    q(p p, GDataRequest gdatarequest)
    {
        b = p;
        a = gdatarequest;
        super();
    }

    public final boolean a(Object obj)
    {
        obj = (GDataRequest)obj;
        GDataRequest gdatarequest = a;
        return ((w) (obj)).a.getPath().equals(((w) (gdatarequest)).a.getPath());
    }
}
