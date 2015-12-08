// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.UUID;
import org.apache.commons.io.TaggedIOException;

// Referenced classes of package org.apache.commons.io.input:
//            ProxyInputStream

public class TaggedInputStream extends ProxyInputStream
{

    private final Serializable tag = UUID.randomUUID();

    public TaggedInputStream(InputStream inputstream)
    {
        super(inputstream);
    }

    protected void handleIOException(IOException ioexception)
        throws IOException
    {
        throw new TaggedIOException(ioexception, tag);
    }

    public boolean isCauseOf(Throwable throwable)
    {
        return TaggedIOException.isTaggedWith(throwable, tag);
    }

    public void throwIfCauseOf(Throwable throwable)
        throws IOException
    {
        TaggedIOException.throwCauseIfTaggedWith(throwable, tag);
    }
}
