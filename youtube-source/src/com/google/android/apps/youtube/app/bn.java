// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import com.android.volley.l;
import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.datalib.a.a;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ax

final class bn extends f
{

    final ax a;

    bn(ax ax1)
    {
        a = ax1;
        super();
    }

    public final Object a()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(a.aS());
        arraylist.add(new a("X-Api-Client", "device=2;application=104;platform=2"));
        return new com.google.android.apps.youtube.datalib.distiller.a(a.aV(), a.V(), arraylist, (l)ax.j(a).b(), a.az(), "AIzaSyA8eiZmM1FaDVjRy-df2KTyQ_vz_yYM39w");
    }
}
