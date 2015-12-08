// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import java.io.File;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzad

public class zzw
{

    public static int version()
    {
        int i;
        try
        {
            i = Integer.parseInt(android.os.Build.VERSION.SDK);
        }
        catch (NumberFormatException numberformatexception)
        {
            zzad.zzf("Invalid version number", android.os.Build.VERSION.SDK);
            return 0;
        }
        return i;
    }

    public static boolean zzaQ(String s)
    {
        if (version() < 9)
        {
            return false;
        } else
        {
            s = new File(s);
            s.setReadable(false, false);
            s.setWritable(false, false);
            s.setReadable(true, true);
            s.setWritable(true, true);
            return true;
        }
    }
}
