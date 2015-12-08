// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            Synchronized

static class mutex
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Object _flddelegate;
    final Object mutex;

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        synchronized (mutex)
        {
            objectoutputstream.defaultWriteObject();
        }
        return;
        objectoutputstream;
        obj;
        JVM INSTR monitorexit ;
        throw objectoutputstream;
    }

    Object _mthdelegate()
    {
        return _flddelegate;
    }

    public String toString()
    {
        String s;
        synchronized (mutex)
        {
            s = _flddelegate.toString();
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (Object obj, Object obj1)
    {
        _flddelegate = Preconditions.checkNotNull(obj);
        obj = obj1;
        if (obj1 == null)
        {
            obj = this;
        }
        mutex = obj;
    }
}
