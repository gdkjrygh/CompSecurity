// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import android.content.res.Resources;
import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.ac;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.youtube.k;

// Referenced classes of package com.google.android.apps.youtube.core:
//            a

final class af extends f
{

    final a a;

    af(a a1)
    {
        a = a1;
        super();
    }

    public final Object a()
    {
        return new GDataRequestFactory(new ac(a.aP()), a.b.getInteger(k.p), a.aW(), Util.a(a.a));
    }
}
