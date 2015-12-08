// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.async;

import java.util.concurrent.Future;

// Referenced classes of package com.kofax.kmc.kut.utilities.async:
//            TaskRunner

class b
{

    public Future a;
    public long b;
    final TaskRunner c;

    (TaskRunner taskrunner, Future future, long l)
    {
        c = taskrunner;
        super();
        a = future;
        b = l;
    }
}
