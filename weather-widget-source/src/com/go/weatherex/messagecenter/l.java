// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.messagecenter;

import java.util.Vector;

// Referenced classes of package com.go.weatherex.messagecenter:
//            a

public class l
{

    public static int a(Vector vector)
    {
        int k = vector.size();
        int j = 0;
        int i = 0;
        for (; j < k; j++)
        {
            if (!((a)vector.get(j)).a())
            {
                i++;
            }
        }

        return i;
    }
}
