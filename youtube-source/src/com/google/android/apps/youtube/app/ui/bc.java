// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.datalib.innertube.model.Offlineability;
import com.google.android.apps.youtube.datalib.innertube.model.as;
import com.google.android.apps.youtube.datalib.innertube.model.au;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ba

final class bc extends ba
{

    private static final bc a = new bc();

    private bc()
    {
        super((byte)0);
    }

    static bc a()
    {
        return a;
    }

    public final Offlineability a(Object obj)
    {
        return ((as)obj).f().h();
    }

    public final String b(Object obj)
    {
        return ((as)obj).f().c().toString();
    }

    public final String c(Object obj)
    {
        return ((as)obj).f().a();
    }

}
