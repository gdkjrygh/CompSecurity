// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//            WorkQueue

private class callback
    implements callback
{

    static final boolean $assertionsDisabled;
    private final Runnable callback;
    private boolean isRunning;
    private .assertionsDisabled next;
    private .assertionsDisabled prev;
    final WorkQueue this$0;

    callback addToList(callback callback1, boolean flag)
    {
        if (!$assertionsDisabled && next != null)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && prev != null)
        {
            throw new AssertionError();
        }
        if (callback1 == null)
        {
            prev = this;
            next = this;
            callback1 = this;
        } else
        {
            next = callback1;
            prev = callback1.prev;
            callback callback2 = next;
            prev.next = this;
            callback2.prev = this;
        }
        if (flag)
        {
            return this;
        } else
        {
            return callback1;
        }
    }

    public boolean cancel()
    {
        Object obj = WorkQueue.access$0(WorkQueue.this);
        obj;
        JVM INSTR monitorenter ;
        if (isRunning())
        {
            break MISSING_BLOCK_LABEL_39;
        }
        WorkQueue.access$2(WorkQueue.this, removeFromList(WorkQueue.access$1(WorkQueue.this)));
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    Runnable getCallback()
    {
        return callback;
    }

    callback getNext()
    {
        return next;
    }

    public boolean isRunning()
    {
        return isRunning;
    }

    public void moveToFront()
    {
        synchronized (WorkQueue.access$0(WorkQueue.this))
        {
            if (!isRunning())
            {
                WorkQueue.access$2(WorkQueue.this, removeFromList(WorkQueue.access$1(WorkQueue.this)));
                WorkQueue.access$2(WorkQueue.this, addToList(WorkQueue.access$1(WorkQueue.this), true));
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    this._cls0 removeFromList(this._cls0 _pcls0)
    {
        if (!$assertionsDisabled && next == null)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && prev == null)
        {
            throw new AssertionError();
        }
        this._cls0 _lcls0 = _pcls0;
        if (_pcls0 == this)
        {
            if (next == this)
            {
                _lcls0 = null;
            } else
            {
                _lcls0 = next;
            }
        }
        next.prev = prev;
        prev.next = next;
        prev = null;
        next = null;
        return _lcls0;
    }

    void setIsRunning(boolean flag)
    {
        isRunning = flag;
    }

    void verify(boolean flag)
    {
        if (!$assertionsDisabled && prev.next != this)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && next.prev != this)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && isRunning() != flag)
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/facebook/internal/WorkQueue.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    (Runnable runnable)
    {
        this$0 = WorkQueue.this;
        super();
        callback = runnable;
    }
}
