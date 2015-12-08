// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import android.content.Context;
import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.core.async.j;
import com.google.android.apps.youtube.core.client.u;
import com.google.android.apps.youtube.core.utils.ai;
import com.google.android.apps.youtube.core.utils.k;

// Referenced classes of package com.google.android.apps.youtube.core:
//            a

final class ag extends f
{

    final a a;

    ag(a a1)
    {
        a = a1;
        super();
    }

    public final Object a()
    {
        String s = k.a(a.a.getContentResolver());
        return new j(new u(a.aJ(), a.aL(), new ai(a.a.getContentResolver()), a.e(), s), a.aP());
    }
}
