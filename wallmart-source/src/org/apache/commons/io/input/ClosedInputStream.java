// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;

import java.io.InputStream;

public class ClosedInputStream extends InputStream
{

    public static final ClosedInputStream CLOSED_INPUT_STREAM = new ClosedInputStream();

    public ClosedInputStream()
    {
    }

    public int read()
    {
        return -1;
    }

}
