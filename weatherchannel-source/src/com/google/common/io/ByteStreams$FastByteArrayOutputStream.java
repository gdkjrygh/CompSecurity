// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.ByteArrayOutputStream;

// Referenced classes of package com.google.common.io:
//            ByteStreams

private static final class <init> extends ByteArrayOutputStream
{

    void writeTo(byte abyte0[], int i)
    {
        System.arraycopy(buf, 0, abyte0, i, count);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
