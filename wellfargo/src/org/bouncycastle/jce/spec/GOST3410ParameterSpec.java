// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.GOST3410NamedParameters;
import org.bouncycastle.asn1.cryptopro.GOST3410ParamSetParameters;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.jce.interfaces.GOST3410Params;

// Referenced classes of package org.bouncycastle.jce.spec:
//            GOST3410PublicKeyParameterSetSpec

public class GOST3410ParameterSpec
    implements AlgorithmParameterSpec, GOST3410Params
{

    private String digestParamSetOID;
    private String encryptionParamSetOID;
    private String keyParamSetOID;
    private GOST3410PublicKeyParameterSetSpec keyParameters;

    public GOST3410ParameterSpec(String s)
    {
        this(s, CryptoProObjectIdentifiers.gostR3411_94_CryptoProParamSet.getId(), null);
    }

    public GOST3410ParameterSpec(String s, String s1)
    {
        this(s, s1, null);
    }

    public GOST3410ParameterSpec(String s, String s1, String s2)
    {
        GOST3410ParamSetParameters gost3410paramsetparameters;
        gost3410paramsetparameters = null;
        GOST3410ParamSetParameters gost3410paramsetparameters1 = GOST3410NamedParameters.getByOID(new ASN1ObjectIdentifier(s));
        gost3410paramsetparameters = gost3410paramsetparameters1;
_L1:
        IllegalArgumentException illegalargumentexception;
        if (gost3410paramsetparameters == null)
        {
            throw new IllegalArgumentException("no key parameter set for passed in name/OID.");
        } else
        {
            keyParameters = new GOST3410PublicKeyParameterSetSpec(gost3410paramsetparameters.getP(), gost3410paramsetparameters.getQ(), gost3410paramsetparameters.getA());
            keyParamSetOID = s;
            digestParamSetOID = s1;
            encryptionParamSetOID = s2;
            return;
        }
        illegalargumentexception;
        ASN1ObjectIdentifier asn1objectidentifier = GOST3410NamedParameters.getOID(s);
        if (asn1objectidentifier != null)
        {
            s = asn1objectidentifier.getId();
            gost3410paramsetparameters = GOST3410NamedParameters.getByOID(asn1objectidentifier);
        }
          goto _L1
    }

    public GOST3410ParameterSpec(GOST3410PublicKeyParameterSetSpec gost3410publickeyparametersetspec)
    {
        keyParameters = gost3410publickeyparametersetspec;
        digestParamSetOID = CryptoProObjectIdentifiers.gostR3411_94_CryptoProParamSet.getId();
        encryptionParamSetOID = null;
    }

    public static GOST3410ParameterSpec fromPublicKeyAlg(GOST3410PublicKeyAlgParameters gost3410publickeyalgparameters)
    {
        if (gost3410publickeyalgparameters.getEncryptionParamSet() != null)
        {
            return new GOST3410ParameterSpec(gost3410publickeyalgparameters.getPublicKeyParamSet().getId(), gost3410publickeyalgparameters.getDigestParamSet().getId(), gost3410publickeyalgparameters.getEncryptionParamSet().getId());
        } else
        {
            return new GOST3410ParameterSpec(gost3410publickeyalgparameters.getPublicKeyParamSet().getId(), gost3410publickeyalgparameters.getDigestParamSet().getId());
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (!(obj instanceof GOST3410ParameterSpec))
            {
                break label0;
            }
            obj = (GOST3410ParameterSpec)obj;
            flag = flag1;
            if (!keyParameters.equals(((GOST3410ParameterSpec) (obj)).keyParameters))
            {
                break label0;
            }
            flag = flag1;
            if (!digestParamSetOID.equals(((GOST3410ParameterSpec) (obj)).digestParamSetOID))
            {
                break label0;
            }
            if (encryptionParamSetOID != ((GOST3410ParameterSpec) (obj)).encryptionParamSetOID)
            {
                flag = flag1;
                if (encryptionParamSetOID == null)
                {
                    break label0;
                }
                flag = flag1;
                if (!encryptionParamSetOID.equals(((GOST3410ParameterSpec) (obj)).encryptionParamSetOID))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public String getDigestParamSetOID()
    {
        return digestParamSetOID;
    }

    public String getEncryptionParamSetOID()
    {
        return encryptionParamSetOID;
    }

    public String getPublicKeyParamSetOID()
    {
        return keyParamSetOID;
    }

    public GOST3410PublicKeyParameterSetSpec getPublicKeyParameters()
    {
        return keyParameters;
    }

    public int hashCode()
    {
        int j = keyParameters.hashCode();
        int k = digestParamSetOID.hashCode();
        int i;
        if (encryptionParamSetOID != null)
        {
            i = encryptionParamSetOID.hashCode();
        } else
        {
            i = 0;
        }
        return i ^ (k ^ j);
    }
}
