// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import java.io.ByteArrayOutputStream;

// Referenced classes of package com.google.common.hash:
//            AbstractNonStreamingHashFunction

private static final class  extends ByteArrayOutputStream
{

    byte[] byteArray()
    {
        return buf;
    }

    int length()
    {
        return count;
    }

    (int i)
    {
        super(i);
    }
}
