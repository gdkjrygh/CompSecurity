// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import com.google.android.apps.youtube.app.ui.bx;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            f, j, OfflineStreamQuality

final class h
    implements bx
{

    final String a;
    final j b;
    final f c;

    h(f f1, String s, j j)
    {
        c = f1;
        a = s;
        b = j;
        super();
    }

    public final void a(OfflineStreamQuality offlinestreamquality)
    {
        f.a(c, a, offlinestreamquality, b);
    }
}
