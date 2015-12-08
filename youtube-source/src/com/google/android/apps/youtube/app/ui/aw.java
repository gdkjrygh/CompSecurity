// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.datalib.innertube.model.ad;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ba

final class aw extends ba
{

    private static final aw a = new aw();

    private aw()
    {
        super((byte)0);
    }

    static aw a()
    {
        return a;
    }

    public final String b(Object obj)
    {
        return ((ad)obj).a().toString();
    }

    public final String c(Object obj)
    {
        return ((ad)obj).f();
    }

}
