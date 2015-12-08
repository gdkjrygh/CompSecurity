// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import com.google.android.apps.youtube.app.ui.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            ai

public final class aj
    implements j
{

    private final Context a;
    private final a b;

    public aj(Context context, a a1)
    {
        a = (Context)c.a(context);
        b = (a)c.a(a1);
    }

    public final g a()
    {
        return new ai(a, b);
    }
}
