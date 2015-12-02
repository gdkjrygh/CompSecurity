// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class ang.Object
    implements Runnable
{

    final Context a;
    final String b;

    public final void run()
    {
        try
        {
            rq.a(a, b);
            return;
        }
        catch (Exception exception)
        {
            ijg.b(exception, "Failed to clear google token", new Object[0]);
        }
    }

    (Context context, String s)
    {
        a = context;
        b = s;
        super();
    }
}
