// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.util.concurrent:
//            SerializingExecutor

private class <init>
    implements Runnable
{

    final SerializingExecutor this$0;

    public void run()
    {
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = true;
_L1:
        boolean flag = flag1;
        Preconditions.checkState(SerializingExecutor.access$100(SerializingExecutor.this));
        flag = flag1;
        Object obj1 = SerializingExecutor.access$200(SerializingExecutor.this);
        flag = flag1;
        obj1;
        JVM INSTR monitorenter ;
        flag = flag2;
        obj = (Runnable)SerializingExecutor.access$300(SerializingExecutor.this).poll();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        flag = flag2;
        SerializingExecutor.access$102(SerializingExecutor.this, false);
        flag = false;
        obj1;
        JVM INSTR monitorexit ;
        if (false)
        {
            synchronized (SerializingExecutor.access$200(SerializingExecutor.this))
            {
                SerializingExecutor.access$102(SerializingExecutor.this, false);
            }
        }
        return;
        flag = flag2;
        obj1;
        JVM INSTR monitorexit ;
        flag = flag1;
        ((Runnable) (obj)).run();
          goto _L1
        obj1;
        flag = flag1;
        Logger logger = SerializingExecutor.access$400();
        flag = flag1;
        Level level = Level.SEVERE;
        flag = flag1;
        obj = String.valueOf(String.valueOf(obj));
        flag = flag1;
        logger.log(level, (new StringBuilder(((String) (obj)).length() + 35)).append("Exception while executing runnable ").append(((String) (obj))).toString(), ((Throwable) (obj1)));
          goto _L1
        obj1;
        if (flag)
        {
            synchronized (SerializingExecutor.access$200(SerializingExecutor.this))
            {
                SerializingExecutor.access$102(SerializingExecutor.this, false);
            }
        }
        throw obj1;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    private ()
    {
        this$0 = SerializingExecutor.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
