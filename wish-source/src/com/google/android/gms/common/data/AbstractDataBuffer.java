// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer, DataHolder, zzb

public abstract class AbstractDataBuffer
    implements DataBuffer
{

    protected final DataHolder zzPy;

    protected AbstractDataBuffer(DataHolder dataholder)
    {
        zzPy = dataholder;
        if (zzPy != null)
        {
            zzPy.zzm(this);
        }
    }

    public final void close()
    {
        release();
    }

    public int getCount()
    {
        if (zzPy == null)
        {
            return 0;
        } else
        {
            return zzPy.getCount();
        }
    }

    public Iterator iterator()
    {
        return new zzb(this);
    }

    public void release()
    {
        if (zzPy != null)
        {
            zzPy.close();
        }
    }
}
