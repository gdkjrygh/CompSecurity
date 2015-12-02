// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.pm.ApplicationInfo;

public final class dtz
{

    public static cjy a(Application application, String s)
    {
        byte byte0;
        if (a(application))
        {
            return cjy.c;
        }
        byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch 64093495 64093495: default 36
    //                   64093495 60;
           goto _L1 _L2
_L1:
        switch (byte0)
        {
        default:
            return cjy.b;

        case 0: // '\0'
            return cjy.a;
        }
_L2:
        if (s.equals("CHINA"))
        {
            byte0 = 0;
        }
          goto _L1
    }

    private static boolean a(Application application)
    {
        return (application.getApplicationInfo().flags & 0x100) != 0;
    }
}
