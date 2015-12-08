// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            cn, p

public final class cp
    implements j
{

    private final Context a;
    private final a b;

    public cp(Context context, a a1)
    {
        a = (Context)c.a(context);
        b = (a)c.a(a1);
    }

    public final g a()
    {
        return new cn(a, new p(a), b);
    }
}
