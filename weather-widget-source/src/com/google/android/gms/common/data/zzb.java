// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.zzx;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer

public class zzb
    implements Iterator
{

    protected final DataBuffer zzabd;
    protected int zzabe;

    public zzb(DataBuffer databuffer)
    {
        zzabd = (DataBuffer)zzx.zzv(databuffer);
        zzabe = -1;
    }

    public boolean hasNext()
    {
        return zzabe < zzabd.getCount() - 1;
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder()).append("Cannot advance the iterator beyond ").append(zzabe).toString());
        } else
        {
            DataBuffer databuffer = zzabd;
            int i = zzabe + 1;
            zzabe = i;
            return databuffer.get(i);
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
