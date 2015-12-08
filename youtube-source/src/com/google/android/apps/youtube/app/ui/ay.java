// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.datalib.innertube.model.ah;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ba

final class ay extends ba
{

    private static final ay a = new ay();

    private ay()
    {
        super((byte)0);
    }

    static ay a()
    {
        return a;
    }

    public final String b(Object obj)
    {
        return ((ah)obj).c().toString();
    }

    public final String c(Object obj)
    {
        return ((ah)obj).a();
    }

}
