// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.parsers;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.KeyParser;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECCurve;

public class ECIESPublicKeyParser
    implements KeyParser
{

    private ECDomainParameters ecParams;

    public ECIESPublicKeyParser(ECDomainParameters ecdomainparameters)
    {
        ecParams = ecdomainparameters;
    }

    public AsymmetricKeyParameter readKey(InputStream inputstream)
    {
        int i = inputstream.read();
        i;
        JVM INSTR tableswitch 0 7: default 52
    //                   0 84
    //                   1 52
    //                   2 94
    //                   3 94
    //                   4 154
    //                   5 52
    //                   6 154
    //                   7 154;
           goto _L1 _L2 _L1 _L3 _L3 _L4 _L1 _L4 _L4
_L1:
        throw new IOException((new StringBuilder()).append("Sender's public key has invalid point encoding 0x").append(Integer.toString(i, 16)).toString());
_L2:
        throw new IOException("Sender's public key invalid.");
_L3:
        byte abyte0[] = new byte[(ecParams.getCurve().getFieldSize() + 7) / 8 + 1];
_L6:
        abyte0[0] = (byte)i;
        inputstream.read(abyte0, 1, abyte0.length - 1);
        return new ECPublicKeyParameters(ecParams.getCurve().decodePoint(abyte0), ecParams);
_L4:
        abyte0 = new byte[((ecParams.getCurve().getFieldSize() + 7) / 8) * 2 + 1];
        if (true) goto _L6; else goto _L5
_L5:
    }
}
