// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

public class KDFParameters
    implements DerivationParameters
{

    byte iv[];
    byte shared[];

    public KDFParameters(byte abyte0[], byte abyte1[])
    {
        shared = abyte0;
        iv = abyte1;
    }

    public byte[] getIV()
    {
        return iv;
    }

    public byte[] getSharedSecret()
    {
        return shared;
    }
}
