// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.content.res.Configuration;
import android.content.res.Resources;

// Referenced classes of package com.google.android.gms.b:
//            aa

public final class x
{

    public static boolean a(Resources resources)
    {
        if (resources != null)
        {
            boolean flag;
            if ((resources.getConfiguration().screenLayout & 0xf) > 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (aa.a() && flag || b(resources))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean b(Resources resources)
    {
        boolean flag1 = false;
        resources = resources.getConfiguration();
        boolean flag = flag1;
        if (aa.b())
        {
            flag = flag1;
            if ((((Configuration) (resources)).screenLayout & 0xf) <= 3)
            {
                flag = flag1;
                if (((Configuration) (resources)).smallestScreenWidthDp >= 600)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }
}
