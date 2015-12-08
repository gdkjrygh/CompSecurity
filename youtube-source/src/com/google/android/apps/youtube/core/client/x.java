// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.cache.a;
import com.google.android.apps.youtube.common.fromguava.d;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.async.m;
import com.google.android.apps.youtube.core.utils.Util;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            y, v

final class x extends m
{

    final v a;

    x(v v, a a1, af af)
    {
        a = v;
        super(a1, af);
    }

    protected final d a(Object obj, Object obj1)
    {
        return new y(this, Util.a(((GDataRequest)obj).a));
    }
}
