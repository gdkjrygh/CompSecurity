// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.util.Arrays;

public class HKDFParameters
    implements DerivationParameters
{

    private final byte ikm[];
    private final byte info[];
    private final byte salt[];
    private final boolean skipExpand;

    private HKDFParameters(byte abyte0[], boolean flag, byte abyte1[], byte abyte2[])
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("IKM (input keying material) should not be null");
        }
        ikm = Arrays.clone(abyte0);
        skipExpand = flag;
        if (abyte1 == null || abyte1.length == 0)
        {
            salt = null;
        } else
        {
            salt = Arrays.clone(abyte1);
        }
        if (abyte2 == null)
        {
            info = new byte[0];
            return;
        } else
        {
            info = Arrays.clone(abyte2);
            return;
        }
    }

    public HKDFParameters(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        this(abyte0, false, abyte1, abyte2);
    }

    public static HKDFParameters defaultParameters(byte abyte0[])
    {
        return new HKDFParameters(abyte0, false, null, null);
    }

    public static HKDFParameters skipExtractParameters(byte abyte0[], byte abyte1[])
    {
        return new HKDFParameters(abyte0, true, null, abyte1);
    }

    public byte[] getIKM()
    {
        return Arrays.clone(ikm);
    }

    public byte[] getInfo()
    {
        return Arrays.clone(info);
    }

    public byte[] getSalt()
    {
        return Arrays.clone(salt);
    }

    public boolean skipExtract()
    {
        return skipExpand;
    }
}
