// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.core.client.al;
import com.google.android.apps.youtube.core.identity.o;
import java.io.File;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ax

final class cr extends f
{

    final ax a;

    cr(ax ax1)
    {
        a = ax1;
        super();
    }

    public final Object a()
    {
        al al1 = new al(a.aJ(), a.av().getAbsolutePath(), a.aG(), a.aL(), "AIzaSyA8eiZmM1FaDVjRy-df2KTyQ_vz_yYM39w", a.aS());
        return new o(a.f(), al1, a.aw(), a.aR(), a.ba(), a.aP(), a.aI());
    }
}
