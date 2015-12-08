// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//            zzb, DataBuffer, zzc

public class zzg extends zzb
{

    private Object zzYM;

    public zzg(DataBuffer databuffer)
    {
        super(databuffer);
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder()).append("Cannot advance the iterator beyond ").append(zzYq).toString());
        }
        zzYq = zzYq + 1;
        if (zzYq == 0)
        {
            zzYM = zzYp.get(0);
            if (!(zzYM instanceof zzc))
            {
                throw new IllegalStateException((new StringBuilder()).append("DataBuffer reference of type ").append(zzYM.getClass()).append(" is not movable").toString());
            }
        } else
        {
            ((zzc)zzYM).zzbf(zzYq);
        }
        return zzYM;
    }
}
