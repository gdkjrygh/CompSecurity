// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.zip.Checksum;

// Referenced classes of package com.google.common.hash:
//            AbstractStreamingHashFunction, Hasher, AbstractByteHasher, HashCode

final class ChecksumHashFunction extends AbstractStreamingHashFunction
    implements Serializable
{
    private final class ChecksumHasher extends AbstractByteHasher
    {

        private final Checksum checksum;
        final ChecksumHashFunction this$0;

        public HashCode hash()
        {
            long l = checksum.getValue();
            if (bits == 32)
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

        private ChecksumHasher(Checksum checksum1)
        {
            this$0 = ChecksumHashFunction.this;
            super();
            checksum = (Checksum)Preconditions.checkNotNull(checksum1);
        }

    }


    private static final long serialVersionUID = 0L;
    private final int bits;
    private final Supplier checksumSupplier;
    private final String toString;

    ChecksumHashFunction(Supplier supplier, int i, String s)
    {
        checksumSupplier = (Supplier)Preconditions.checkNotNull(supplier);
        boolean flag;
        if (i == 32 || i == 64)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "bits (%s) must be either 32 or 64", new Object[] {
            Integer.valueOf(i)
        });
        bits = i;
        toString = (String)Preconditions.checkNotNull(s);
    }

    public int bits()
    {
        return bits;
    }

    public Hasher newHasher()
    {
        return new ChecksumHasher((Checksum)checksumSupplier.get());
    }

    public String toString()
    {
        return toString;
    }

}
