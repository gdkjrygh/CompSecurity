// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zznj, zzrl, zzrg, 
//            zzrf, zzrn

public static final class zztY extends zzrh
{

    private static volatile zzaWf zzawo[];
    public String name;
    public zzaWf zzawp;

    public static zztY[] zztX()
    {
        if (zzawo == null)
        {
            synchronized (zzrl.zzaWe)
            {
                if (zzawo == null)
                {
                    zzawo = new zzawo[0];
                }
            }
        }
        return zzawo;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

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
        if (!(obj instanceof zzawo)) goto _L4; else goto _L3
_L3:
        obj = (zzawo)obj;
        if (name != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((name) (obj)).name != null) goto _L4; else goto _L7
_L7:
        if (zzawp != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag = flag1;
        if (((zzawp) (obj)).zzawp != null) goto _L4; else goto _L8
_L8:
        return zza(((zzrh) (obj)));
_L6:
        if (!name.equals(((name) (obj)).name))
        {
            return false;
        }
          goto _L7
        if (!zzawp.equals(((equals) (obj)).zzawp))
        {
            return false;
        }
          goto _L8
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (name == null)
        {
            i = 0;
        } else
        {
            i = name.hashCode();
        }
        if (zzawp != null)
        {
            j = zzawp.hashCode();
        }
        return ((i + 527) * 31 + j) * 31 + zzBI();
    }

    protected int zzB()
    {
        int j = super.zzB();
        int i = j;
        if (!name.equals(""))
        {
            i = j + zzrg.zzk(1, name);
        }
        j = i;
        if (zzawp != null)
        {
            j = i + zzrg.zzc(2, zzawp);
        }
        return j;
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        if (!name.equals(""))
        {
            zzrg1.zzb(1, name);
        }
        if (zzawp != null)
        {
            zzrg1.zza(2, zzawp);
        }
        super.zza(zzrg1);
    }

    public zzrn zzb(zzrf zzrf1)
        throws IOException
    {
        return zzr(zzrf1);
    }

    public zzr zzr(zzrf zzrf1)
        throws IOException
    {
        do
        {
            int i = zzrf1.zzBr();
            switch (i)
            {
            default:
                if (zza(zzrf1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                name = zzrf1.readString();
                break;

            case 18: // '\022'
                if (zzawp == null)
                {
                    zzawp = new <init>();
                }
                zzrf1.zza(zzawp);
                break;
            }
        } while (true);
    }

    public zzawp zztY()
    {
        name = "";
        zzawp = null;
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public ()
    {
        zztY();
    }
}
