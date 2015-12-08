// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzny, zznu, zznv, zznw, 
//            zznr

public abstract class zzns extends zzny
{

    protected zznu zzaNT;

    public zzns()
    {
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return zzzN();
    }

    public void zza(zznr zznr)
        throws IOException
    {
        if (zzaNT != null)
        {
            int i = 0;
            while (i < zzaNT.size()) 
            {
                zzaNT.zzjE(i).zza(zznr);
                i++;
            }
        }
    }

    protected final boolean zza(zzns zzns1)
    {
        if (zzaNT == null || zzaNT.isEmpty())
        {
            return zzns1.zzaNT == null || zzns1.zzaNT.isEmpty();
        } else
        {
            return zzaNT.equals(zzns1.zzaNT);
        }
    }

    protected int zzc()
    {
        int j = 0;
        int k;
        if (zzaNT != null)
        {
            int i = 0;
            do
            {
                k = i;
                if (j >= zzaNT.size())
                {
                    break;
                }
                i += zzaNT.zzjE(j).zzc();
                j++;
            } while (true);
        } else
        {
            k = 0;
        }
        return k;
    }

    protected final int zzzM()
    {
        if (zzaNT == null || zzaNT.isEmpty())
        {
            return 0;
        } else
        {
            return zzaNT.hashCode();
        }
    }

    public zzns zzzN()
        throws CloneNotSupportedException
    {
        zzns zzns1 = (zzns)super.zzzO();
        zznw.zza(this, zzns1);
        return zzns1;
    }

    public zzny zzzO()
        throws CloneNotSupportedException
    {
        return zzzN();
    }
}
