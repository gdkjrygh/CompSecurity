// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.datalib.innertube.model.Offlineability;
import com.google.android.apps.youtube.datalib.innertube.model.af;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ba

final class ax extends ba
{

    private static final ax a = new ax();

    private ax()
    {
        super((byte)0);
    }

    static ax a()
    {
        return a;
    }

    public final Offlineability a(Object obj)
    {
        return ((af)obj).j();
    }

    public final String b(Object obj)
    {
        return ((af)obj).d().toString();
    }

    public final String c(Object obj)
    {
        return ((af)obj).a();
    }

    protected final boolean d(Object obj)
    {
        return ((af)obj).h();
    }

    public final String e(Object obj)
    {
        return ((af)obj).i();
    }

    public final String f(Object obj)
    {
        return ((af)obj).b();
    }

}
