// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;

// Referenced classes of package com.google.android.gms.internal:
//            zzob, zzny, zznr

public class zznt
{

    public final int tag;
    protected final int type;
    protected final Class zzaNU;
    protected final boolean zzaNV;

    int zzM(Object obj)
    {
        if (zzaNV)
        {
            return zzN(obj);
        } else
        {
            return zzO(obj);
        }
    }

    protected int zzN(Object obj)
    {
        int j = 0;
        int l = Array.getLength(obj);
        for (int i = 0; i < l;)
        {
            int k = j;
            if (Array.get(obj, i) != null)
            {
                k = j + zzO(Array.get(obj, i));
            }
            i++;
            j = k;
        }

        return j;
    }

    protected int zzO(Object obj)
    {
        int i = zzob.zzjH(tag);
        switch (type)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());

        case 10: // '\n'
            return zznr.zzb(i, (zzny)obj);

        case 11: // '\013'
            return zznr.zzc(i, (zzny)obj);
        }
    }

    void zza(Object obj, zznr zznr1)
        throws IOException
    {
        if (zzaNV)
        {
            zzc(obj, zznr1);
            return;
        } else
        {
            zzb(obj, zznr1);
            return;
        }
    }

    protected void zzb(Object obj, zznr zznr1)
    {
        zznr1.zzjz(tag);
        type;
        JVM INSTR tableswitch 10 11: default 110
    //                   10 76
    //                   11 101;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());
_L2:
        try
        {
            obj = (zzny)obj;
            int i = zzob.zzjH(tag);
            zznr1.zzb(((zzny) (obj)));
            zznr1.zzB(i, 4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
_L3:
        zznr1.zzc((zzny)obj);
        return;
    }

    protected void zzc(Object obj, zznr zznr1)
    {
        int j = Array.getLength(obj);
        for (int i = 0; i < j; i++)
        {
            Object obj1 = Array.get(obj, i);
            if (obj1 != null)
            {
                zzb(obj1, zznr1);
            }
        }

    }
}
