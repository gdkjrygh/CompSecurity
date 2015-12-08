// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.async;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import java.util.EventObject;

// Referenced classes of package com.kofax.kmc.kut.utilities.async:
//            TaskRunner

public class c extends EventObject
{

    private static final long serialVersionUID = 1L;
    final TaskRunner a;
    private long b;
    private Object c;
    private ErrorInfo d;

    public final ErrorInfo getTaskError()
    {
        return d;
    }

    public final long getTaskID()
    {
        return b;
    }

    public final Object getTaskReturnValue()
    {
        return c;
    }

    public (TaskRunner taskrunner, Object obj, long l, Object obj1, ErrorInfo errorinfo)
    {
        a = taskrunner;
        super(obj);
        b = l;
        d = errorinfo;
        c = obj1;
    }
}
