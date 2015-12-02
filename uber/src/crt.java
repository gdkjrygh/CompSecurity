// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

public final class crt
{

    private static crs a;

    public static crs a()
    {
        if (a == null)
        {
            throw new RuntimeException("The partner-funnel library was not initialized prior to its use.");
        } else
        {
            return a;
        }
    }

    public static void a(Application application, cpt cpt)
    {
        application = new cot(application, cpt);
        a = crp.a().a(application).a();
    }
}
