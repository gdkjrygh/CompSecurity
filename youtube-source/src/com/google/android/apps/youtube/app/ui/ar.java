// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.datalib.innertube.model.Offlineability;
import com.google.android.apps.youtube.datalib.innertube.model.h;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ba

final class ar extends ba
{

    private static final ar a = new ar();

    private ar()
    {
        super((byte)0);
    }

    static ar a()
    {
        return a;
    }

    public final Offlineability a(Object obj)
    {
        return ((h)obj).h();
    }

    public final String b(Object obj)
    {
        return ((h)obj).b().toString();
    }

    public final String c(Object obj)
    {
        return ((h)obj).a();
    }

}
