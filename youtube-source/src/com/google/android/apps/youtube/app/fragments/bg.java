// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            RemoteWatchDialogFragment

final class bg
    implements b
{

    final RemoteWatchDialogFragment a;

    bg(RemoteWatchDialogFragment remotewatchdialogfragment)
    {
        a = remotewatchdialogfragment;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        RemoteWatchDialogFragment.c(a);
    }

    public final volatile void a(Object obj, Object obj1)
    {
        obj = (PlaybackPair)obj1;
        RemoteWatchDialogFragment.a(a, ((PlaybackPair) (obj)));
    }
}
