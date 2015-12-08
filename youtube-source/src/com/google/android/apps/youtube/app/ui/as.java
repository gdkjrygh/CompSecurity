// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.datalib.legacy.model.Event;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ba

final class as extends ba
{

    private static final as a = new as();

    private as()
    {
        super((byte)0);
    }

    static as a()
    {
        return a;
    }

    public final volatile String b(Object obj)
    {
        return ((Event)obj).targetVideo.title;
    }

    public final volatile String c(Object obj)
    {
        return ((Event)obj).targetVideo.id;
    }

}
