// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.app.offline.f;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ab, cc

final class cd
    implements ab
{

    final cc a;

    cd(cc cc1)
    {
        a = cc1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Playlist)obj;
        if (cc.a(a) != null)
        {
            cc.b(a).a(((Playlist) (obj)).id);
        }
    }
}
