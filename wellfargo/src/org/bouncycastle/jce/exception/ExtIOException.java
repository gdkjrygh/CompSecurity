// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.exception;

import java.io.IOException;

// Referenced classes of package org.bouncycastle.jce.exception:
//            ExtException

public class ExtIOException extends IOException
    implements ExtException
{

    private Throwable cause;

    public ExtIOException(String s, Throwable throwable)
    {
        super(s);
        cause = throwable;
    }

    public Throwable getCause()
    {
        return cause;
    }
}
