// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package org.apache.commons.io:
//            IOExceptionWithCause

public class TaggedIOException extends IOExceptionWithCause
{

    private static final long serialVersionUID = 0x9eefe1c017430d8dL;
    private final Serializable tag;

    public TaggedIOException(IOException ioexception, Serializable serializable)
    {
        super(ioexception.getMessage(), ioexception);
        tag = serializable;
    }

    public static boolean isTaggedWith(Throwable throwable, Object obj)
    {
        return obj != null && (throwable instanceof TaggedIOException) && obj.equals(((TaggedIOException)throwable).tag);
    }

    public static void throwCauseIfTaggedWith(Throwable throwable, Object obj)
        throws IOException
    {
        if (isTaggedWith(throwable, obj))
        {
            throw ((TaggedIOException)throwable).getCause();
        } else
        {
            return;
        }
    }

    public IOException getCause()
    {
        return (IOException)super.getCause();
    }

    public volatile Throwable getCause()
    {
        return getCause();
    }

    public Serializable getTag()
    {
        return tag;
    }
}
