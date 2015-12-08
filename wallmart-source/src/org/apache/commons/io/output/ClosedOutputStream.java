// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

public class ClosedOutputStream extends OutputStream
{

    public static final ClosedOutputStream CLOSED_OUTPUT_STREAM = new ClosedOutputStream();

    public ClosedOutputStream()
    {
    }

    public void write(int i)
        throws IOException
    {
        throw new IOException((new StringBuilder()).append("write(").append(i).append(") failed: stream is closed").toString());
    }

}
