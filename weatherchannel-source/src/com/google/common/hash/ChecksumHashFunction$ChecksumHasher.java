// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.util.zip.Checksum;

// Referenced classes of package com.google.common.hash:
//            AbstractByteHasher, ChecksumHashFunction, HashCode

private final class <init> extends AbstractByteHasher
{

    private final Checksum checksum;
    final ChecksumHashFunction this$0;

    public HashCode hash()
    {
        long l = checksum.getValue();
        if (ChecksumHashFunction.access$100(ChecksumHashFunction.this) == 32)
        {
            return HashCode.fromInt((int)l);
        } else
        {
            return HashCode.fromLong(l);
        }
    }

    protected void update(byte byte0)
    {
        checksum.update(byte0);
    }

    protected void update(byte abyte0[], int i, int j)
    {
        checksum.update(abyte0, i, j);
    }

    private (Checksum checksum1)
    {
        this$0 = ChecksumHashFunction.this;
        super();
        checksum = (Checksum)Preconditions.checkNotNull(checksum1);
    }

    checksum(Checksum checksum1, checksum checksum2)
    {
        this(checksum1);
    }
}
