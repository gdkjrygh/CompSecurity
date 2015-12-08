// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;

public class RSAUtil
{

    public static final ASN1ObjectIdentifier rsaOids[];

    public RSAUtil()
    {
    }

    static RSAKeyParameters generatePrivateKeyParameter(RSAPrivateKey rsaprivatekey)
    {
        if (rsaprivatekey instanceof RSAPrivateCrtKey)
        {
            rsaprivatekey = (RSAPrivateCrtKey)rsaprivatekey;
            return new RSAPrivateCrtKeyParameters(rsaprivatekey.getModulus(), rsaprivatekey.getPublicExponent(), rsaprivatekey.getPrivateExponent(), rsaprivatekey.getPrimeP(), rsaprivatekey.getPrimeQ(), rsaprivatekey.getPrimeExponentP(), rsaprivatekey.getPrimeExponentQ(), rsaprivatekey.getCrtCoefficient());
        } else
        {
            return new RSAKeyParameters(true, rsaprivatekey.getModulus(), rsaprivatekey.getPrivateExponent());
        }
    }

    static RSAKeyParameters generatePublicKeyParameter(RSAPublicKey rsapublickey)
    {
        return new RSAKeyParameters(false, rsapublickey.getModulus(), rsapublickey.getPublicExponent());
    }

    public static boolean isRsaOid(ASN1ObjectIdentifier asn1objectidentifier)
    {
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i != rsaOids.length)
                {
                    if (!asn1objectidentifier.equals(rsaOids[i]))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    static 
    {
        rsaOids = (new ASN1ObjectIdentifier[] {
            PKCSObjectIdentifiers.rsaEncryption, X509ObjectIdentifiers.id_ea_rsa, PKCSObjectIdentifiers.id_RSAES_OAEP, PKCSObjectIdentifiers.id_RSASSA_PSS
        });
    }
}
