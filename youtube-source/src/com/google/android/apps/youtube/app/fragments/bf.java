// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.widget.TextView;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            RemoteWatchDialogFragment

final class bf
    implements b
{

    final RemoteWatchDialogFragment a;

    bf(RemoteWatchDialogFragment remotewatchdialogfragment)
    {
        a = remotewatchdialogfragment;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        L.a("Error retrieving playlist description", exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Playlist)obj1;
        RemoteWatchDialogFragment.a(a).setText(((Playlist) (obj)).title);
        com.google.android.apps.youtube.app.fragments.RemoteWatchDialogFragment.b(a).setText(((Playlist) (obj)).author);
    }
}
