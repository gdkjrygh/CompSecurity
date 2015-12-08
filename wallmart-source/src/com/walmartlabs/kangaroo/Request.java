// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo;


// Referenced classes of package com.walmartlabs.kangaroo:
//            CheckedIllegalStateException, Callback, Result

public interface Request
{

    public abstract Request addCallback(Callback callback);

    public abstract void cancel();

    public abstract Request getPriorRequest();

    public abstract Result getResult()
        throws InterruptedException;

    public abstract boolean hasPriorRequest();

    public abstract Request retry()
        throws CheckedIllegalStateException;
}
