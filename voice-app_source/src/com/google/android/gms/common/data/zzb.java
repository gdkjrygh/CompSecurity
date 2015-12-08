// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.zzu;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer

public class zzb
    implements Iterator
{

    protected final DataBuffer zzYp;
    protected int zzYq;

    public zzb(DataBuffer databuffer)
    {
        zzYp = (DataBuffer)zzu.zzu(databuffer);
        zzYq = -1;
    }

    public boolean hasNext()
    {
        return zzYq < zzYp.getCount() - 1;
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder()).append("Cannot advance the iterator beyond ").append(zzYq).toString());
        } else
        {
            DataBuffer databuffer = zzYp;
            int i = zzYq + 1;
            zzYq = i;
            return databuffer.get(i);
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
