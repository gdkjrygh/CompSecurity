// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCERSAPrivateKey

public class JCERSAPrivateCrtKey extends JCERSAPrivateKey
    implements RSAPrivateCrtKey
{

    static final long serialVersionUID = 0x6cba87ce0273552eL;
    private BigInteger crtCoefficient;
    private BigInteger primeExponentP;
    private BigInteger primeExponentQ;
    private BigInteger primeP;
    private BigInteger primeQ;
    private BigInteger publicExponent;

    JCERSAPrivateCrtKey(RSAPrivateCrtKey rsaprivatecrtkey)
    {
        modulus = rsaprivatecrtkey.getModulus();
        publicExponent = rsaprivatecrtkey.getPublicExponent();
        privateExponent = rsaprivatecrtkey.getPrivateExponent();
        primeP = rsaprivatecrtkey.getPrimeP();
        primeQ = rsaprivatecrtkey.getPrimeQ();
        primeExponentP = rsaprivatecrtkey.getPrimeExponentP();
        primeExponentQ = rsaprivatecrtkey.getPrimeExponentQ();
        crtCoefficient = rsaprivatecrtkey.getCrtCoefficient();
    }

    JCERSAPrivateCrtKey(RSAPrivateCrtKeySpec rsaprivatecrtkeyspec)
    {
        modulus = rsaprivatecrtkeyspec.getModulus();
        publicExponent = rsaprivatecrtkeyspec.getPublicExponent();
        privateExponent = rsaprivatecrtkeyspec.getPrivateExponent();
        primeP = rsaprivatecrtkeyspec.getPrimeP();
        primeQ = rsaprivatecrtkeyspec.getPrimeQ();
        primeExponentP = rsaprivatecrtkeyspec.getPrimeExponentP();
        primeExponentQ = rsaprivatecrtkeyspec.getPrimeExponentQ();
        crtCoefficient = rsaprivatecrtkeyspec.getCrtCoefficient();
    }

    JCERSAPrivateCrtKey(PrivateKeyInfo privatekeyinfo)
    {
        this(RSAPrivateKey.getInstance(privatekeyinfo.parsePrivateKey()));
    }

    JCERSAPrivateCrtKey(RSAPrivateKey rsaprivatekey)
    {
        modulus = rsaprivatekey.getModulus();
        publicExponent = rsaprivatekey.getPublicExponent();
        privateExponent = rsaprivatekey.getPrivateExponent();
        primeP = rsaprivatekey.getPrime1();
        primeQ = rsaprivatekey.getPrime2();
        primeExponentP = rsaprivatekey.getExponent1();
        primeExponentQ = rsaprivatekey.getExponent2();
        crtCoefficient = rsaprivatekey.getCoefficient();
    }

    JCERSAPrivateCrtKey(RSAPrivateCrtKeyParameters rsaprivatecrtkeyparameters)
    {
        super(rsaprivatecrtkeyparameters);
        publicExponent = rsaprivatecrtkeyparameters.getPublicExponent();
        primeP = rsaprivatecrtkeyparameters.getP();
        primeQ = rsaprivatecrtkeyparameters.getQ();
        primeExponentP = rsaprivatecrtkeyparameters.getDP();
        primeExponentQ = rsaprivatecrtkeyparameters.getDQ();
        crtCoefficient = rsaprivatecrtkeyparameters.getQInv();
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof RSAPrivateCrtKey))
            {
                return false;
            }
            obj = (RSAPrivateCrtKey)obj;
            if (!getModulus().equals(((RSAPrivateCrtKey) (obj)).getModulus()) || !getPublicExponent().equals(((RSAPrivateCrtKey) (obj)).getPublicExponent()) || !getPrivateExponent().equals(((RSAPrivateCrtKey) (obj)).getPrivateExponent()) || !getPrimeP().equals(((RSAPrivateCrtKey) (obj)).getPrimeP()) || !getPrimeQ().equals(((RSAPrivateCrtKey) (obj)).getPrimeQ()) || !getPrimeExponentP().equals(((RSAPrivateCrtKey) (obj)).getPrimeExponentP()) || !getPrimeExponentQ().equals(((RSAPrivateCrtKey) (obj)).getPrimeExponentQ()) || !getCrtCoefficient().equals(((RSAPrivateCrtKey) (obj)).getCrtCoefficient()))
            {
                return false;
            }
        }
        return true;
    }

    public BigInteger getCrtCoefficient()
    {
        return crtCoefficient;
    }

    public byte[] getEncoded()
    {
        return KeyUtil.getEncodedPrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE), new RSAPrivateKey(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient()));
    }

    public String getFormat()
    {
        return "PKCS#8";
    }

    public BigInteger getPrimeExponentP()
    {
        return primeExponentP;
    }

    public BigInteger getPrimeExponentQ()
    {
        return primeExponentQ;
    }

    public BigInteger getPrimeP()
    {
        return primeP;
    }

    public BigInteger getPrimeQ()
    {
        return primeQ;
    }

    public BigInteger getPublicExponent()
    {
        return publicExponent;
    }

    public int hashCode()
    {
        return getModulus().hashCode() ^ getPublicExponent().hashCode() ^ getPrivateExponent().hashCode();
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = System.getProperty("line.separator");
        stringbuffer.append("RSA Private CRT Key").append(s);
        stringbuffer.append("            modulus: ").append(getModulus().toString(16)).append(s);
        stringbuffer.append("    public exponent: ").append(getPublicExponent().toString(16)).append(s);
        stringbuffer.append("   private exponent: ").append(getPrivateExponent().toString(16)).append(s);
        stringbuffer.append("             primeP: ").append(getPrimeP().toString(16)).append(s);
        stringbuffer.append("             primeQ: ").append(getPrimeQ().toString(16)).append(s);
        stringbuffer.append("     primeExponentP: ").append(getPrimeExponentP().toString(16)).append(s);
        stringbuffer.append("     primeExponentQ: ").append(getPrimeExponentQ().toString(16)).append(s);
        stringbuffer.append("     crtCoefficient: ").append(getCrtCoefficient().toString(16)).append(s);
        return stringbuffer.toString();
    }
}
