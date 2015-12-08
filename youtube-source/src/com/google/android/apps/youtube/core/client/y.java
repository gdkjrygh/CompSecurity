// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.fromguava.d;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.utils.Util;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            x

final class y
    implements d
{

    final String a;
    final x b;

    y(x x, String s)
    {
        b = x;
        a = s;
        super();
    }

    public final boolean a(Object obj)
    {
        obj = (GDataRequest)obj;
        return a.equals(Util.a(((GDataRequest) (obj)).a));
    }
}
