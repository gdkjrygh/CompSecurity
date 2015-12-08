// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.core.client.ar;
import java.io.File;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ax

final class cg extends f
{

    final ax a;

    cg(ax ax1)
    {
        a = ax1;
        super();
    }

    public final Object a()
    {
        return new ar(a.aJ(), a.aL(), a.aN(), a.av().getAbsolutePath(), a.aG());
    }
}
