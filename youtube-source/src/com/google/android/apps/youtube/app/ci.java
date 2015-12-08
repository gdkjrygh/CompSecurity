// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.core.client.aj;
import com.google.android.apps.youtube.core.utils.Util;
import java.io.File;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ax

final class ci extends f
{

    final ax a;

    ci(ax ax1)
    {
        a = ax1;
        super();
    }

    public final Object a()
    {
        return new aj(a.aJ(), a.av().getAbsolutePath(), a.aG(), a.aL(), "AIzaSyA8eiZmM1FaDVjRy-df2KTyQ_vz_yYM39w", Util.a(ax.C(a)));
    }
}
