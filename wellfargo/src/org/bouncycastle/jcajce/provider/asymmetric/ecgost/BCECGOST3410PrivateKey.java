// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.ec.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECFieldElement;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.ecgost:
//            BCECGOST3410PublicKey

public class BCECGOST3410PrivateKey
    implements ECPrivateKey, ECPointEncoder, org.bouncycastle.jce.interfaces.ECPrivateKey, PKCS12BagAttributeCarrier
{

    static final long serialVersionUID = 0x648ee5f4b1b13042L;
    private String algorithm;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient DERBitString publicKey;
    private boolean withCompression;

    protected BCECGOST3410PrivateKey()
    {
        algorithm = "ECGOST3410";
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public BCECGOST3410PrivateKey(String s, ECPrivateKeyParameters ecprivatekeyparameters)
    {
        algorithm = "ECGOST3410";
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        algorithm = s;
        d = ecprivatekeyparameters.getD();
        ecSpec = null;
    }

    public BCECGOST3410PrivateKey(String s, ECPrivateKeyParameters ecprivatekeyparameters, BCECGOST3410PublicKey bcecgost3410publickey, ECParameterSpec ecparameterspec)
    {
        algorithm = "ECGOST3410";
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        ECDomainParameters ecdomainparameters = ecprivatekeyparameters.getParameters();
        algorithm = s;
        d = ecprivatekeyparameters.getD();
        if (ecparameterspec == null)
        {
            ecSpec = new ECParameterSpec(EC5Util.convertCurve(ecdomainparameters.getCurve(), ecdomainparameters.getSeed()), new ECPoint(ecdomainparameters.getG().getX().toBigInteger(), ecdomainparameters.getG().getY().toBigInteger()), ecdomainparameters.getN(), ecdomainparameters.getH().intValue());
        } else
        {
            ecSpec = ecparameterspec;
        }
        publicKey = getPublicKeyDetails(bcecgost3410publickey);
    }

    public BCECGOST3410PrivateKey(String s, ECPrivateKeyParameters ecprivatekeyparameters, BCECGOST3410PublicKey bcecgost3410publickey, org.bouncycastle.jce.spec.ECParameterSpec ecparameterspec)
    {
        algorithm = "ECGOST3410";
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        ECDomainParameters ecdomainparameters = ecprivatekeyparameters.getParameters();
        algorithm = s;
        d = ecprivatekeyparameters.getD();
        if (ecparameterspec == null)
        {
            ecSpec = new ECParameterSpec(EC5Util.convertCurve(ecdomainparameters.getCurve(), ecdomainparameters.getSeed()), new ECPoint(ecdomainparameters.getG().getX().toBigInteger(), ecdomainparameters.getG().getY().toBigInteger()), ecdomainparameters.getN(), ecdomainparameters.getH().intValue());
        } else
        {
            ecSpec = new ECParameterSpec(EC5Util.convertCurve(ecparameterspec.getCurve(), ecparameterspec.getSeed()), new ECPoint(ecparameterspec.getG().getX().toBigInteger(), ecparameterspec.getG().getY().toBigInteger()), ecparameterspec.getN(), ecparameterspec.getH().intValue());
        }
        publicKey = getPublicKeyDetails(bcecgost3410publickey);
    }

    public BCECGOST3410PrivateKey(ECPrivateKey ecprivatekey)
    {
        algorithm = "ECGOST3410";
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        d = ecprivatekey.getS();
        algorithm = ecprivatekey.getAlgorithm();
        ecSpec = ecprivatekey.getParams();
    }

    public BCECGOST3410PrivateKey(ECPrivateKeySpec ecprivatekeyspec)
    {
        algorithm = "ECGOST3410";
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        d = ecprivatekeyspec.getS();
        ecSpec = ecprivatekeyspec.getParams();
    }

    BCECGOST3410PrivateKey(PrivateKeyInfo privatekeyinfo)
    {
        algorithm = "ECGOST3410";
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        populateFromPrivKeyInfo(privatekeyinfo);
    }

    public BCECGOST3410PrivateKey(BCECGOST3410PrivateKey bcecgost3410privatekey)
    {
        algorithm = "ECGOST3410";
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        d = bcecgost3410privatekey.d;
        ecSpec = bcecgost3410privatekey.ecSpec;
        withCompression = bcecgost3410privatekey.withCompression;
        attrCarrier = bcecgost3410privatekey.attrCarrier;
        publicKey = bcecgost3410privatekey.publicKey;
    }

    public BCECGOST3410PrivateKey(org.bouncycastle.jce.spec.ECPrivateKeySpec ecprivatekeyspec)
    {
        algorithm = "ECGOST3410";
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        d = ecprivatekeyspec.getD();
        if (ecprivatekeyspec.getParams() != null)
        {
            ecSpec = EC5Util.convertSpec(EC5Util.convertCurve(ecprivatekeyspec.getParams().getCurve(), ecprivatekeyspec.getParams().getSeed()), ecprivatekeyspec.getParams());
            return;
        } else
        {
            ecSpec = null;
            return;
        }
    }

    private DERBitString getPublicKeyDetails(BCECGOST3410PublicKey bcecgost3410publickey)
    {
        try
        {
            bcecgost3410publickey = SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(bcecgost3410publickey.getEncoded())).getPublicKeyData();
        }
        // Misplaced declaration of an exception variable
        catch (BCECGOST3410PublicKey bcecgost3410publickey)
        {
            return null;
        }
        return bcecgost3410publickey;
    }

    private void populateFromPrivKeyInfo(PrivateKeyInfo privatekeyinfo)
    {
        Object obj = new X962Parameters((ASN1Primitive)privatekeyinfo.getPrivateKeyAlgorithm().getParameters());
        if (((X962Parameters) (obj)).isNamedCurve())
        {
            obj = ASN1ObjectIdentifier.getInstance(((X962Parameters) (obj)).getParameters());
            Object obj1 = ECUtil.getNamedCurveByOid(((ASN1ObjectIdentifier) (obj)));
            if (obj1 == null)
            {
                obj1 = ECGOST3410NamedCurves.getByOID(((ASN1ObjectIdentifier) (obj)));
                EllipticCurve ellipticcurve = EC5Util.convertCurve(((ECDomainParameters) (obj1)).getCurve(), ((ECDomainParameters) (obj1)).getSeed());
                ecSpec = new ECNamedCurveSpec(ECGOST3410NamedCurves.getName(((ASN1ObjectIdentifier) (obj))), ellipticcurve, new ECPoint(((ECDomainParameters) (obj1)).getG().getX().toBigInteger(), ((ECDomainParameters) (obj1)).getG().getY().toBigInteger()), ((ECDomainParameters) (obj1)).getN(), ((ECDomainParameters) (obj1)).getH());
            } else
            {
                EllipticCurve ellipticcurve1 = EC5Util.convertCurve(((X9ECParameters) (obj1)).getCurve(), ((X9ECParameters) (obj1)).getSeed());
                ecSpec = new ECNamedCurveSpec(ECUtil.getCurveName(((ASN1ObjectIdentifier) (obj))), ellipticcurve1, new ECPoint(((X9ECParameters) (obj1)).getG().getX().toBigInteger(), ((X9ECParameters) (obj1)).getG().getY().toBigInteger()), ((X9ECParameters) (obj1)).getN(), ((X9ECParameters) (obj1)).getH());
            }
        } else
        if (((X962Parameters) (obj)).isImplicitlyCA())
        {
            ecSpec = null;
        } else
        {
            obj = X9ECParameters.getInstance(((X962Parameters) (obj)).getParameters());
            ecSpec = new ECParameterSpec(EC5Util.convertCurve(((X9ECParameters) (obj)).getCurve(), ((X9ECParameters) (obj)).getSeed()), new ECPoint(((X9ECParameters) (obj)).getG().getX().toBigInteger(), ((X9ECParameters) (obj)).getG().getY().toBigInteger()), ((X9ECParameters) (obj)).getN(), ((X9ECParameters) (obj)).getH().intValue());
        }
        privatekeyinfo = privatekeyinfo.parsePrivateKey();
        if (privatekeyinfo instanceof DERInteger)
        {
            d = DERInteger.getInstance(privatekeyinfo).getValue();
            return;
        } else
        {
            privatekeyinfo = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(privatekeyinfo);
            d = privatekeyinfo.getKey();
            publicKey = privatekeyinfo.getPublicKey();
            return;
        }
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        populateFromPrivKeyInfo(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[])(byte[])objectinputstream.readObject())));
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(getEncoded());
    }

    org.bouncycastle.jce.spec.ECParameterSpec engineGetSpec()
    {
        if (ecSpec != null)
        {
            return EC5Util.convertSpec(ecSpec, withCompression);
        } else
        {
            return BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
        }
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof BCECGOST3410PrivateKey)
        {
            if (getD().equals(((BCECGOST3410PrivateKey) (obj = (BCECGOST3410PrivateKey)obj)).getD()) && engineGetSpec().equals(((BCECGOST3410PrivateKey) (obj)).engineGetSpec()))
            {
                return true;
            }
        }
        return false;
    }

    public String getAlgorithm()
    {
        return algorithm;
    }

    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier asn1objectidentifier)
    {
        return attrCarrier.getBagAttribute(asn1objectidentifier);
    }

    public Enumeration getBagAttributeKeys()
    {
        return attrCarrier.getBagAttributeKeys();
    }

    public BigInteger getD()
    {
        return d;
    }

    public byte[] getEncoded()
    {
        Object obj;
        org.bouncycastle.asn1.sec.ECPrivateKey ecprivatekey;
        if (ecSpec instanceof ECNamedCurveSpec)
        {
            ASN1ObjectIdentifier asn1objectidentifier = ECUtil.getNamedCurveOid(((ECNamedCurveSpec)ecSpec).getName());
            obj = asn1objectidentifier;
            if (asn1objectidentifier == null)
            {
                obj = new DERObjectIdentifier(((ECNamedCurveSpec)ecSpec).getName());
            }
            obj = new X962Parameters(((ASN1Primitive) (obj)));
        } else
        if (ecSpec == null)
        {
            obj = new X962Parameters(DERNull.INSTANCE);
        } else
        {
            obj = EC5Util.convertCurve(ecSpec.getCurve());
            obj = new X962Parameters(new X9ECParameters(((org.bouncycastle.math.ec.ECCurve) (obj)), EC5Util.convertPoint(((org.bouncycastle.math.ec.ECCurve) (obj)), ecSpec.getGenerator(), withCompression), ecSpec.getOrder(), BigInteger.valueOf(ecSpec.getCofactor()), ecSpec.getCurve().getSeed()));
        }
        if (publicKey != null)
        {
            ecprivatekey = new org.bouncycastle.asn1.sec.ECPrivateKey(getS(), publicKey, ((org.bouncycastle.asn1.ASN1Object) (obj)));
        } else
        {
            ecprivatekey = new org.bouncycastle.asn1.sec.ECPrivateKey(getS(), ((org.bouncycastle.asn1.ASN1Object) (obj)));
        }
        if (!algorithm.equals("ECGOST3410"))
        {
            break MISSING_BLOCK_LABEL_239;
        }
        obj = new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_2001, ((X962Parameters) (obj)).toASN1Primitive()), ecprivatekey.toASN1Primitive());
_L1:
        obj = ((PrivateKeyInfo) (obj)).getEncoded("DER");
        return ((byte []) (obj));
        try
        {
            obj = new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, ((X962Parameters) (obj)).toASN1Primitive()), ecprivatekey.toASN1Primitive());
        }
        catch (IOException ioexception)
        {
            return null;
        }
          goto _L1
    }

    public String getFormat()
    {
        return "PKCS#8";
    }

    public org.bouncycastle.jce.spec.ECParameterSpec getParameters()
    {
        if (ecSpec == null)
        {
            return null;
        } else
        {
            return EC5Util.convertSpec(ecSpec, withCompression);
        }
    }

    public ECParameterSpec getParams()
    {
        return ecSpec;
    }

    public BigInteger getS()
    {
        return d;
    }

    public int hashCode()
    {
        return getD().hashCode() ^ engineGetSpec().hashCode();
    }

    public void setBagAttribute(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        attrCarrier.setBagAttribute(asn1objectidentifier, asn1encodable);
    }

    public void setPointFormat(String s)
    {
        boolean flag;
        if (!"UNCOMPRESSED".equalsIgnoreCase(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        withCompression = flag;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = System.getProperty("line.separator");
        stringbuffer.append("EC Private Key").append(s);
        stringbuffer.append("             S: ").append(d.toString(16)).append(s);
        return stringbuffer.toString();
    }
}
