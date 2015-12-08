// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import com.google.android.apps.youtube.app.ui.bx;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            r, v, OfflineStreamQuality

final class t
    implements bx
{

    final String a;
    final v b;
    final r c;

    t(r r1, String s, v v)
    {
        c = r1;
        a = s;
        b = v;
        super();
    }

    public final void a(OfflineStreamQuality offlinestreamquality)
    {
        r.a(c, a, offlinestreamquality, b);
    }
}
