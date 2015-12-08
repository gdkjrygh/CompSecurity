// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.engines.GOST28147Engine;

public class GOST28147ParameterSpec
    implements AlgorithmParameterSpec
{

    private byte iv[];
    private byte sBox[];

    public GOST28147ParameterSpec(String s)
    {
        iv = null;
        sBox = null;
        sBox = GOST28147Engine.getSBox(s);
    }

    public GOST28147ParameterSpec(String s, byte abyte0[])
    {
        this(s);
        iv = new byte[abyte0.length];
        System.arraycopy(abyte0, 0, iv, 0, abyte0.length);
    }

    public GOST28147ParameterSpec(byte abyte0[])
    {
        iv = null;
        sBox = null;
        sBox = new byte[abyte0.length];
        System.arraycopy(abyte0, 0, sBox, 0, abyte0.length);
    }

    public GOST28147ParameterSpec(byte abyte0[], byte abyte1[])
    {
        this(abyte0);
        iv = new byte[abyte1.length];
        System.arraycopy(abyte1, 0, iv, 0, abyte1.length);
    }

    public byte[] getIV()
    {
        if (iv == null)
        {
            return null;
        } else
        {
            byte abyte0[] = new byte[iv.length];
            System.arraycopy(iv, 0, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }

    public byte[] getSbox()
    {
        return sBox;
    }
}
