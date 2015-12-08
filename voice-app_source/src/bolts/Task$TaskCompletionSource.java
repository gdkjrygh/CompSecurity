// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;


// Referenced classes of package bolts:
//            Task

public class <init>
{

    final Task this$0;

    public Task getTask()
    {
        return Task.this;
    }

    public void setCancelled()
    {
        if (!trySetCancelled())
        {
            throw new IllegalStateException("Cannot cancel a completed task.");
        } else
        {
            return;
        }
    }

    public void setError(Exception exception)
    {
        if (!trySetError(exception))
        {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        } else
        {
            return;
        }
    }

    public void setResult(Object obj)
    {
        if (!trySetResult(obj))
        {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        } else
        {
            return;
        }
    }

    public boolean trySetCancelled()
    {
label0:
        {
            synchronized (Task.access$300(Task.this))
            {
                if (!Task.access$400(Task.this))
                {
                    break label0;
                }
            }
            return false;
        }
        Task.access$402(Task.this, true);
        Task.access$502(Task.this, true);
        Task.access$300(Task.this).notifyAll();
        Task.access$600(Task.this);
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean trySetError(Exception exception)
    {
label0:
        {
            synchronized (Task.access$300(Task.this))
            {
                if (!Task.access$400(Task.this))
                {
                    break label0;
                }
            }
            return false;
        }
        Task.access$402(Task.this, true);
        Task.access$802(Task.this, exception);
        Task.access$300(Task.this).notifyAll();
        Task.access$600(Task.this);
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean trySetResult(Object obj)
    {
label0:
        {
            synchronized (Task.access$300(Task.this))
            {
                if (!Task.access$400(Task.this))
                {
                    break label0;
                }
            }
            return false;
        }
        Task.access$402(Task.this, true);
        Task.access$702(Task.this, obj);
        Task.access$300(Task.this).notifyAll();
        Task.access$600(Task.this);
        obj1;
        JVM INSTR monitorexit ;
        return true;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    private ()
    {
        this$0 = Task.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
