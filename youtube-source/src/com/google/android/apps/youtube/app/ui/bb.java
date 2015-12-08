// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ba

final class bb extends ba
{

    private static final bb a = new bb();

    private bb()
    {
        super((byte)0);
    }

    static bb a()
    {
        return a;
    }

    protected final volatile String b(Object obj)
    {
        return ((Video)obj).title;
    }

    protected final volatile String c(Object obj)
    {
        return ((Video)obj).id;
    }

}
