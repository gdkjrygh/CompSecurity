// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzw;
import java.util.ArrayList;

public final class zzli
{

    public static int zza(Object aobj[], Object obj)
    {
        int j = 0;
        int i;
        if (aobj != null)
        {
            i = aobj.length;
        } else
        {
            i = 0;
        }
        for (; j < i; j++)
        {
            if (zzw.equal(aobj[j], obj))
            {
                return j;
            }
        }

        return -1;
    }

    public static void zza(StringBuilder stringbuilder, double ad[])
    {
        int j = ad.length;
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(Double.toString(ad[i]));
        }

    }

    public static void zza(StringBuilder stringbuilder, float af[])
    {
        int j = af.length;
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(Float.toString(af[i]));
        }

    }

    public static void zza(StringBuilder stringbuilder, int ai[])
    {
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(Integer.toString(ai[i]));
        }

    }

    public static void zza(StringBuilder stringbuilder, long al[])
    {
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(Long.toString(al[i]));
        }

    }

    public static void zza(StringBuilder stringbuilder, Object aobj[])
    {
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(aobj[i].toString());
        }

    }

    public static void zza(StringBuilder stringbuilder, String as[])
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append("\"").append(as[i]).append("\"");
        }

    }

    public static void zza(StringBuilder stringbuilder, boolean aflag[])
    {
        int j = aflag.length;
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(Boolean.toString(aflag[i]));
        }

    }

    public static Integer[] zza(int ai[])
    {
        if (ai != null) goto _L2; else goto _L1
_L1:
        Integer ainteger[] = null;
_L4:
        return ainteger;
_L2:
        int j = ai.length;
        Integer ainteger1[] = new Integer[j];
        int i = 0;
        do
        {
            ainteger = ainteger1;
            if (i >= j)
            {
                continue;
            }
            ainteger1[i] = Integer.valueOf(ai[i]);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static ArrayList zzb(Object aobj[])
    {
        int j = aobj.length;
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(aobj[i]);
        }

        return arraylist;
    }

    public static boolean zzb(Object aobj[], Object obj)
    {
        return zza(aobj, obj) >= 0;
    }

    public static ArrayList zzpM()
    {
        return new ArrayList();
    }
}
