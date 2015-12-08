// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.common.fromguava.d;
import com.google.android.apps.youtube.datalib.legacy.model.LiveEvent;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            LiveFragment

final class ac
    implements d
{

    final LiveFragment a;

    ac(LiveFragment livefragment)
    {
        a = livefragment;
        super();
    }

    public final boolean a(Object obj)
    {
        return ((LiveEvent)obj).isLiveNow();
    }
}
