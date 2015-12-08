// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            dq

final class dp
    implements dq
{

    final am a;

    dp(am am1)
    {
        a = am1;
        super();
    }

    public final void a(Playlist playlist)
    {
        a.b(playlist.contentUri);
    }
}
