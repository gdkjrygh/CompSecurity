// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.UUID;
import org.apache.commons.io.TaggedIOException;

// Referenced classes of package org.apache.commons.io.output:
//            ProxyOutputStream

public class TaggedOutputStream extends ProxyOutputStream
{

    private final Serializable tag = UUID.randomUUID();

    public TaggedOutputStream(OutputStream outputstream)
    {
        super(outputstream);
    }

    protected void handleIOException(IOException ioexception)
        throws IOException
    {
        throw new TaggedIOException(ioexception, tag);
    }

    public boolean isCauseOf(Exception exception)
    {
        return TaggedIOException.isTaggedWith(exception, tag);
    }

    public void throwIfCauseOf(Exception exception)
        throws IOException
    {
        TaggedIOException.throwCauseIfTaggedWith(exception, tag);
    }
}
