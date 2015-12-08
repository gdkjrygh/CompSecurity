// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.app.remote.av;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            RemoteWatchDialogFragment

final class bl extends av
{

    final RemoteWatchDialogFragment a;

    private bl(RemoteWatchDialogFragment remotewatchdialogfragment)
    {
        a = remotewatchdialogfragment;
        super();
    }

    bl(RemoteWatchDialogFragment remotewatchdialogfragment, byte byte0)
    {
        this(remotewatchdialogfragment);
    }

    public final void a(com.google.android.apps.youtube.app.remote.RemoteControl.State state)
    {
        RemoteWatchDialogFragment.a(a, state);
    }
}
