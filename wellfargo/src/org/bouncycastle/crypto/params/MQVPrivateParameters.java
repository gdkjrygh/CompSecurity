// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

// Referenced classes of package org.bouncycastle.crypto.params:
//            ECPrivateKeyParameters, ECPublicKeyParameters

public class MQVPrivateParameters
    implements CipherParameters
{

    private ECPrivateKeyParameters ephemeralPrivateKey;
    private ECPublicKeyParameters ephemeralPublicKey;
    private ECPrivateKeyParameters staticPrivateKey;

    public MQVPrivateParameters(ECPrivateKeyParameters ecprivatekeyparameters, ECPrivateKeyParameters ecprivatekeyparameters1)
    {
        this(ecprivatekeyparameters, ecprivatekeyparameters1, null);
    }

    public MQVPrivateParameters(ECPrivateKeyParameters ecprivatekeyparameters, ECPrivateKeyParameters ecprivatekeyparameters1, ECPublicKeyParameters ecpublickeyparameters)
    {
        staticPrivateKey = ecprivatekeyparameters;
        ephemeralPrivateKey = ecprivatekeyparameters1;
        ephemeralPublicKey = ecpublickeyparameters;
    }

    public ECPrivateKeyParameters getEphemeralPrivateKey()
    {
        return ephemeralPrivateKey;
    }

    public ECPublicKeyParameters getEphemeralPublicKey()
    {
        return ephemeralPublicKey;
    }

    public ECPrivateKeyParameters getStaticPrivateKey()
    {
        return staticPrivateKey;
    }
}
