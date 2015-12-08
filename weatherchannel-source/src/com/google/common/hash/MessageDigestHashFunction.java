// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

// Referenced classes of package com.google.common.hash:
//            AbstractStreamingHashFunction, Hasher, AbstractByteHasher, HashCode

final class MessageDigestHashFunction extends AbstractStreamingHashFunction
    implements Serializable
{
    private static final class MessageDigestHasher extends AbstractByteHasher
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

        private MessageDigestHasher(MessageDigest messagedigest, int i)
        {
            digest = messagedigest;
            bytes = i;
        }

    }

    private static final class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final String algorithmName;
        private final int bytes;
        private final String toString;

        private Object readResolve()
        {
            return new MessageDigestHashFunction(algorithmName, bytes, toString);
        }

        private SerializedForm(String s, int i, String s1)
        {
            algorithmName = s;
            bytes = i;
            toString = s1;
        }

    }


    private final int bytes;
    private final MessageDigest prototype;
    private final boolean supportsClone;
    private final String toString;

    MessageDigestHashFunction(String s, int i, String s1)
    {
        toString = (String)Preconditions.checkNotNull(s1);
        prototype = getMessageDigest(s);
        int j = prototype.getDigestLength();
        boolean flag;
        if (i >= 4 && i <= j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "bytes (%s) must be >= 4 and < %s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
        bytes = i;
        supportsClone = supportsClone();
    }

    MessageDigestHashFunction(String s, String s1)
    {
        prototype = getMessageDigest(s);
        bytes = prototype.getDigestLength();
        toString = (String)Preconditions.checkNotNull(s1);
        supportsClone = supportsClone();
    }

    private static MessageDigest getMessageDigest(String s)
    {
        try
        {
            s = MessageDigest.getInstance(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        return s;
    }

    private boolean supportsClone()
    {
        try
        {
            prototype.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return false;
        }
        return true;
    }

    public int bits()
    {
        return bytes * 8;
    }

    public Hasher newHasher()
    {
        if (!supportsClone)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        MessageDigestHasher messagedigesthasher = new MessageDigestHasher((MessageDigest)prototype.clone(), bytes);
        return messagedigesthasher;
        CloneNotSupportedException clonenotsupportedexception;
        clonenotsupportedexception;
        return new MessageDigestHasher(getMessageDigest(prototype.getAlgorithm()), bytes);
    }

    public String toString()
    {
        return toString;
    }

    Object writeReplace()
    {
        return new SerializedForm(prototype.getAlgorithm(), bytes, toString);
    }
}
