// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo.service;

import java.io.IOException;
import okio.BufferedSource;

// Referenced classes of package com.walmartlabs.kangaroo.service:
//            Converter, RequestBuilder

private static class <init>
    implements Converter
{

    public Object from(BufferedSource bufferedsource, Class class1)
        throws IOException
    {
        return bufferedsource.readByteArray();
    }

    public String getContentType()
    {
        throw new UnsupportedOperationException();
    }

    public String toString(Object obj)
        throws IOException
    {
        throw new UnsupportedOperationException();
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
