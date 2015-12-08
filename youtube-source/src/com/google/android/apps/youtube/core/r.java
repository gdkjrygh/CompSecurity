// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.youtube.common.fromguava.e;
import com.google.android.exoplayer.upstream.cache.a;
import com.google.android.exoplayer.upstream.cache.g;
import java.io.File;

// Referenced classes of package com.google.android.apps.youtube.core:
//            q, a

final class r
    implements e
{

    final q a;
    private File b;
    private a c;

    r(q q1)
    {
        a = q1;
        super();
    }

    public final Object b()
    {
        boolean flag = a.a.aP().getBoolean("enable_exo_cache", a.a.ak());
        File file = a.a.a.getExternalCacheDir();
        if (!flag || file == null)
        {
            return null;
        }
        if (!file.equals(b))
        {
            b = file;
            c = new g(new File(file, "exo"), new com.google.android.exoplayer.upstream.cache.e(0x4000000L));
        }
        return c;
    }
}
