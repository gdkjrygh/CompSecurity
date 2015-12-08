// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.a;

import android.app.Activity;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.common.a:
//            f, b

public final class a extends f
{

    private final Activity a;

    private a(Activity activity, b b)
    {
        super(b);
        a = (Activity)c.a(activity);
    }

    public static a a(Activity activity, b b)
    {
        return new a(activity, b);
    }

    protected final void a(Runnable runnable)
    {
        a.runOnUiThread(runnable);
    }
}
