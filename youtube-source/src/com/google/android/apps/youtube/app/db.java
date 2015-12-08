// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.content.Context;
import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.datalib.config.d;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ax

final class db extends f
{

    final ax a;

    db(ax ax1)
    {
        a = ax1;
        super();
    }

    public final Object a()
    {
        return new d(ax.P(a).getContentResolver());
    }
}
