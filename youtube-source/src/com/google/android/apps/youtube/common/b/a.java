// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.b;

import android.os.Handler;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.concurrent.Executor;

public class a
    implements Executor
{

    private final Handler a;

    public a(Handler handler)
    {
        a = (Handler)c.a(handler);
    }

    public final void execute(Runnable runnable)
    {
        a.post(runnable);
    }
}
