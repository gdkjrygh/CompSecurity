// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer, DataHolder, zzb, zzg

public abstract class AbstractDataBuffer
    implements DataBuffer
{

    protected final DataHolder zzWu;

    protected AbstractDataBuffer(DataHolder dataholder)
    {
        zzWu = dataholder;
        if (zzWu != null)
        {
            zzWu.zzp(this);
        }
    }

    public final void close()
    {
        release();
    }

    public abstract Object get(int i);

    public int getCount()
    {
        if (zzWu == null)
        {
            return 0;
        } else
        {
            return zzWu.getCount();
        }
    }

    public boolean isClosed()
    {
        return zzWu == null || zzWu.isClosed();
    }

    public Iterator iterator()
    {
        return new zzb(this);
    }

    public void release()
    {
        if (zzWu != null)
        {
            zzWu.close();
        }
    }

    public Iterator singleRefIterator()
    {
        return new zzg(this);
    }

    public Bundle zznb()
    {
        return zzWu.zznb();
    }
}
