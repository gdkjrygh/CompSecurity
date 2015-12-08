// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import java.util.List;

public class zzs
{

    public static int zza(Object obj, List list)
    {
        int i;
        if (obj == null)
        {
            i = -1;
        } else
        {
            int j = list.indexOf(obj);
            i = j;
            if (j < 0)
            {
                list.add(obj);
                return list.size() - 1;
            }
        }
        return i;
    }
}
