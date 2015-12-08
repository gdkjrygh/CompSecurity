// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.uilib.innertube;

import com.google.android.apps.youtube.common.fromguava.d;
import com.google.android.apps.youtube.datalib.innertube.ap;
import com.google.android.apps.youtube.datalib.innertube.model.af;

// Referenced classes of package com.google.android.apps.youtube.uilib.innertube:
//            r

final class s
    implements d
{

    final ap a;
    final r b;

    s(r r, ap ap1)
    {
        b = r;
        a = ap1;
        super();
    }

    public final boolean a(Object obj)
    {
        return (obj instanceof af) && ((af)obj).i().equals(a.a) && ((af)obj).b().equals(a.b);
    }
}
