// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.app.offline.a.s;
import com.google.android.apps.youtube.common.fromguava.d;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            cc

final class ce
    implements d
{

    final s a;
    final cc b;

    ce(cc cc, s s1)
    {
        b = cc;
        a = s1;
        super();
    }

    public final boolean a(Object obj)
    {
        return (obj instanceof Playlist) && ((Playlist)obj).id.equals(a.a);
    }
}
