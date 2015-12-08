// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.security.MessageDigest;
import java.util.Arrays;

// Referenced classes of package com.google.common.hash:
//            AbstractByteHasher, MessageDigestHashFunction, HashCode

private static final class <init> extends AbstractByteHasher
{

    private final int bytes;
    private final MessageDigest digest;
    private boolean done;

    private void checkNotDone()
    {
        boolean flag;
        if (!done)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Cannot re-use a Hasher after calling hash() on it");
    }

    public HashCode hash()
    {
        checkNotDone();
        done = true;
        if (bytes == digest.getDigestLength())
        {
            return HashCode.fromBytesNoCopy(digest.digest());
        } else
        {
            return HashCode.fromBytesNoCopy(Arrays.copyOf(digest.digest(), bytes));
        }
    }

    protected void update(byte byte0)
    {
        checkNotDone();
        digest.update(byte0);
    }

    protected void update(byte abyte0[])
    {
        checkNotDone();
        digest.update(abyte0);
    }

    protected void update(byte abyte0[], int i, int j)
    {
        checkNotDone();
        digest.update(abyte0, i, j);
    }

    private (MessageDigest messagedigest, int i)
    {
        digest = messagedigest;
        bytes = i;
    }

    bytes(MessageDigest messagedigest, int i, bytes bytes1)
    {
        this(messagedigest, i);
    }
}
