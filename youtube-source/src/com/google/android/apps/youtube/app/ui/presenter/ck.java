// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import com.google.android.apps.youtube.app.ui.ac;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.datalib.innertube.model.ak;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            ci

final class ck
    implements ac
{

    final ci a;

    ck(ci ci1)
    {
        a = ci1;
        super();
    }

    public final void a(v v1, Object obj)
    {
        if (((ak)obj).f() == null)
        {
            v1.b(ci.b(a));
            return;
        } else
        {
            v1.a(ci.b(a));
            return;
        }
    }
}
