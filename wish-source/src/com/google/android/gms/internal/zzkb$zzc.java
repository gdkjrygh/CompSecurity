// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzkb, zznw, zznr

public static final class zzst extends zzns
{

    public String type;
    public zzaOe zzape[];

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof zzst))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (zzst)obj;
        if (type != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((type) (obj)).type != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (zznw.equals(zzape, ((zzape) (obj)).zzape))
        {
            return zza(((zzns) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!type.equals(((type) (obj)).type))
        {
            return false;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public int hashCode()
    {
        int i;
        if (type == null)
        {
            i = 0;
        } else
        {
            i = type.hashCode();
        }
        return ((i + 527) * 31 + zznw.hashCode(zzape)) * 31 + zzzM();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        if (!type.equals(""))
        {
            zznr1.zzb(1, type);
        }
        if (zzape != null && zzape.length > 0)
        {
            for (int i = 0; i < zzape.length; i++)
            {
                zzzM zzzm = zzape[i];
                if (zzzm != null)
                {
                    zznr1.zza(2, zzzm);
                }
            }

        }
        super.zza(zznr1);
    }

    protected int zzc()
    {
        int j = super.zzc();
        int i = j;
        if (!type.equals(""))
        {
            i = j + zznr.zzj(1, type);
        }
        j = i;
        if (zzape != null)
        {
            j = i;
            if (zzape.length > 0)
            {
                for (j = 0; j < zzape.length;)
                {
                    zzape zzape1 = zzape[j];
                    int k = i;
                    if (zzape1 != null)
                    {
                        k = i + zznr.zzc(2, zzape1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        return j;
    }

    public zzape zzst()
    {
        type = "";
        zzape = zzsr();
        zzaNT = null;
        zzaOe = -1;
        return this;
    }

    public ()
    {
        zzst();
    }
}
