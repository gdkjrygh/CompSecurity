// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import com.google.android.apps.youtube.common.database.b;
import com.google.android.apps.youtube.common.database.c;
import com.google.android.apps.youtube.common.e.f;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core:
//            a

final class w extends f
{

    final a a;

    w(a a1)
    {
        a = a1;
        super();
    }

    public final Object a()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new b("ScheduledTaskProto"));
        arraylist.add(new b("OfflineHttpRequestProto"));
        return new c(a.a, arraylist);
    }
}
