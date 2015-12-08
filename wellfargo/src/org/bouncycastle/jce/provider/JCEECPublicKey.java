// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.ec.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.ECGOST3410NamedCurveTable;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;

// Referenced classes of package org.bouncycastle.jce.provider:
//            BouncyCastleProvider

public class JCEECPublicKey
    implements ECPublicKey, ECPointEncoder, org.bouncycastle.jce.interfaces.ECPublicKey
{

    private String algorithm;
    private java.security.spec.ECParameterSpec ecSpec;
    private GOST3410PublicKeyAlgParameters gostParams;
    private ECPoint q;
    private boolean withCompression;

    public JCEECPublicKey(String s, ECPublicKeySpec ecpublickeyspec)
    {
        algorithm = "EC";
        algorithm = s;
        ecSpec = ecpublickeyspec.getParams();
        q = EC5Util.convertPoint(ecSpec, ecpublickeyspec.getW(), false);
    }

    public JCEECPublicKey(String s, ECPublicKeyParameters ecpublickeyparameters)
    {
        algorithm = "EC";
        algorithm = s;
        q = ecpublickeyparameters.getQ();
        ecSpec = null;
    }

    public JCEECPublicKey(String s, ECPublicKeyParameters ecpublickeyparameters, java.security.spec.ECParameterSpec ecparameterspec)
    {
        algorithm = "EC";
        ECDomainParameters ecdomainparameters = ecpublickeyparameters.getParameters();
        algorithm = s;
        q = ecpublickeyparameters.getQ();
        if (ecparameterspec == null)
        {
            ecSpec = createSpec(EC5Util.convertCurve(ecdomainparameters.getCurve(), ecdomainparameters.getSeed()), ecdomainparameters);
            return;
        } else
        {
            ecSpec = ecparameterspec;
            return;
        }
    }

    public JCEECPublicKey(String s, ECPublicKeyParameters ecpublickeyparameters, ECParameterSpec ecparameterspec)
    {
        algorithm = "EC";
        ECDomainParameters ecdomainparameters = ecpublickeyparameters.getParameters();
        algorithm = s;
        q = ecpublickeyparameters.getQ();
        if (ecparameterspec == null)
        {
            ecSpec = createSpec(EC5Util.convertCurve(ecdomainparameters.getCurve(), ecdomainparameters.getSeed()), ecdomainparameters);
            return;
        } else
        {
            ecSpec = EC5Util.convertSpec(EC5Util.convertCurve(ecparameterspec.getCurve(), ecparameterspec.getSeed()), ecparameterspec);
            return;
        }
    }

    public JCEECPublicKey(String s, JCEECPublicKey jceecpublickey)
    {
        algorithm = "EC";
        algorithm = s;
        q = jceecpublickey.q;
        ecSpec = jceecpublickey.ecSpec;
        withCompression = jceecpublickey.withCompression;
        gostParams = jceecpublickey.gostParams;
    }

    public JCEECPublicKey(String s, org.bouncycastle.jce.spec.ECPublicKeySpec ecpublickeyspec)
    {
        algorithm = "EC";
        algorithm = s;
        q = ecpublickeyspec.getQ();
        if (ecpublickeyspec.getParams() != null)
        {
            ecSpec = EC5Util.convertSpec(EC5Util.convertCurve(ecpublickeyspec.getParams().getCurve(), ecpublickeyspec.getParams().getSeed()), ecpublickeyspec.getParams());
            return;
        }
        if (q.getCurve() == null)
        {
            q = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getCurve().createPoint(q.getX().toBigInteger(), q.getY().toBigInteger(), false);
        }
        ecSpec = null;
    }

    public JCEECPublicKey(ECPublicKey ecpublickey)
    {
        algorithm = "EC";
        algorithm = ecpublickey.getAlgorithm();
        ecSpec = ecpublickey.getParams();
        q = EC5Util.convertPoint(ecSpec, ecpublickey.getW(), false);
    }

    JCEECPublicKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        algorithm = "EC";
        populateFromPubKeyInfo(subjectpublickeyinfo);
    }

    private java.security.spec.ECParameterSpec createSpec(EllipticCurve ellipticcurve, ECDomainParameters ecdomainparameters)
    {
        return new java.security.spec.ECParameterSpec(ellipticcurve, new java.security.spec.ECPoint(ecdomainparameters.getG().getX().toBigInteger(), ecdomainparameters.getG().getY().toBigInteger()), ecdomainparameters.getN(), ecdomainparameters.getH().intValue());
    }

    private void extractBytes(byte abyte0[], int i, BigInteger biginteger)
    {
        biginteger = biginteger.toByteArray();
        if (biginteger.length < 32)
        {
            byte abyte1[] = new byte[32];
            System.arraycopy(biginteger, 0, abyte1, abyte1.length - biginteger.length, biginteger.length);
            biginteger = abyte1;
        }
        for (int j = 0; j != 32; j++)
        {
            abyte0[i + j] = biginteger[biginteger.length - 1 - j];
        }

    }

    private void populateFromPubKeyInfo(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
label0:
        {
            if (subjectpublickeyinfo.getAlgorithmId().getObjectId().equals(CryptoProObjectIdentifiers.gostR3410_2001))
            {
                Object obj = subjectpublickeyinfo.getPublicKeyData();
                algorithm = "ECGOST3410";
                byte abyte0[];
                byte abyte1[];
                byte abyte2[];
                try
                {
                    obj = (ASN1OctetString)ASN1Primitive.fromByteArray(((DERBitString) (obj)).getBytes());
                }
                // Misplaced declaration of an exception variable
                catch (SubjectPublicKeyInfo subjectpublickeyinfo)
                {
                    throw new IllegalArgumentException("error recovering public key");
                }
                abyte2 = ((ASN1OctetString) (obj)).getOctets();
                abyte0 = new byte[32];
                abyte1 = new byte[32];
                for (int i = 0; i != abyte0.length; i++)
                {
                    abyte0[i] = abyte2[31 - i];
                }

                for (int j = 0; j != abyte1.length; j++)
                {
                    abyte1[j] = abyte2[63 - j];
                }

                gostParams = new GOST3410PublicKeyAlgParameters((ASN1Sequence)subjectpublickeyinfo.getAlgorithmId().getParameters());
                subjectpublickeyinfo = ECGOST3410NamedCurveTable.getParameterSpec(ECGOST3410NamedCurves.getName(gostParams.getPublicKeyParamSet()));
                ECCurve eccurve = subjectpublickeyinfo.getCurve();
                EllipticCurve ellipticcurve = EC5Util.convertCurve(eccurve, subjectpublickeyinfo.getSeed());
                q = eccurve.createPoint(new BigInteger(1, abyte0), new BigInteger(1, abyte1), false);
                ecSpec = new ECNamedCurveSpec(ECGOST3410NamedCurves.getName(gostParams.getPublicKeyParamSet()), ellipticcurve, new java.security.spec.ECPoint(subjectpublickeyinfo.getG().getX().toBigInteger(), subjectpublickeyinfo.getG().getY().toBigInteger()), subjectpublickeyinfo.getN(), subjectpublickeyinfo.getH());
                return;
            }
            Object obj1 = new X962Parameters((ASN1Primitive)subjectpublickeyinfo.getAlgorithmId().getParameters());
            DEROctetString deroctetstring;
            byte abyte3[];
            if (((X962Parameters) (obj1)).isNamedCurve())
            {
                ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)((X962Parameters) (obj1)).getParameters();
                X9ECParameters x9ecparameters1 = ECUtil.getNamedCurveByOid(asn1objectidentifier);
                obj1 = x9ecparameters1.getCurve();
                EllipticCurve ellipticcurve1 = EC5Util.convertCurve(((ECCurve) (obj1)), x9ecparameters1.getSeed());
                ecSpec = new ECNamedCurveSpec(ECUtil.getCurveName(asn1objectidentifier), ellipticcurve1, new java.security.spec.ECPoint(x9ecparameters1.getG().getX().toBigInteger(), x9ecparameters1.getG().getY().toBigInteger()), x9ecparameters1.getN(), x9ecparameters1.getH());
            } else
            if (((X962Parameters) (obj1)).isImplicitlyCA())
            {
                ecSpec = null;
                obj1 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getCurve();
            } else
            {
                X9ECParameters x9ecparameters = X9ECParameters.getInstance(((X962Parameters) (obj1)).getParameters());
                obj1 = x9ecparameters.getCurve();
                ecSpec = new java.security.spec.ECParameterSpec(EC5Util.convertCurve(((ECCurve) (obj1)), x9ecparameters.getSeed()), new java.security.spec.ECPoint(x9ecparameters.getG().getX().toBigInteger(), x9ecparameters.getG().getY().toBigInteger()), x9ecparameters.getN(), x9ecparameters.getH().intValue());
            }
            abyte3 = subjectpublickeyinfo.getPublicKeyData().getBytes();
            deroctetstring = new DEROctetString(abyte3);
            subjectpublickeyinfo = deroctetstring;
            if (abyte3[0] != 4)
            {
                break label0;
            }
            subjectpublickeyinfo = deroctetstring;
            if (abyte3[1] != abyte3.length - 2)
            {
                break label0;
            }
            if (abyte3[2] != 2)
            {
                subjectpublickeyinfo = deroctetstring;
                if (abyte3[2] != 3)
                {
                    break label0;
                }
            }
            subjectpublickeyinfo = deroctetstring;
            if ((new X9IntegerConverter()).getByteLength(((ECCurve) (obj1))) >= abyte3.length - 3)
            {
                try
                {
                    subjectpublickeyinfo = (ASN1OctetString)ASN1Primitive.fromByteArray(abyte3);
                }
                // Misplaced declaration of an exception variable
                catch (SubjectPublicKeyInfo subjectpublickeyinfo)
                {
                    throw new IllegalArgumentException("error recovering public key");
                }
            }
        }
        q = (new X9ECPoint(((ECCurve) (obj1)), subjectpublickeyinfo)).getPoint();
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        populateFromPubKeyInfo(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[])(byte[])objectinputstream.readObject())));
        algorithm = (String)objectinputstream.readObject();
        withCompression = objectinputstream.readBoolean();
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.writeObject(getEncoded());
        objectoutputstream.writeObject(algorithm);
        objectoutputstream.writeBoolean(withCompression);
    }

    public ECPoint engineGetQ()
    {
        return q;
    }

    ECParameterSpec engineGetSpec()
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
        if (obj instanceof JCEECPublicKey)
        {
            if (engineGetQ().equals(((JCEECPublicKey) (obj = (JCEECPublicKey)obj)).engineGetQ()) && engineGetSpec().equals(((JCEECPublicKey) (obj)).engineGetSpec()))
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

    public byte[] getEncoded()
    {
        if (!algorithm.equals("ECGOST3410")) goto _L2; else goto _L1
_L1:
        Object obj;
        BigInteger biginteger;
        BigInteger biginteger1;
        byte abyte0[];
        if (gostParams != null)
        {
            obj = gostParams;
        } else
        if (ecSpec instanceof ECNamedCurveSpec)
        {
            obj = new GOST3410PublicKeyAlgParameters(ECGOST3410NamedCurves.getOID(((ECNamedCurveSpec)ecSpec).getName()), CryptoProObjectIdentifiers.gostR3411_94_CryptoProParamSet);
        } else
        {
            obj = EC5Util.convertCurve(ecSpec.getCurve());
            obj = new X962Parameters(new X9ECParameters(((ECCurve) (obj)), EC5Util.convertPoint(((ECCurve) (obj)), ecSpec.getGenerator(), withCompression), ecSpec.getOrder(), BigInteger.valueOf(ecSpec.getCofactor()), ecSpec.getCurve().getSeed()));
        }
        biginteger = q.getX().toBigInteger();
        biginteger1 = q.getY().toBigInteger();
        abyte0 = new byte[64];
        extractBytes(abyte0, 0, biginteger);
        extractBytes(abyte0, 32, biginteger1);
        try
        {
            obj = new SubjectPublicKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_2001, ((org.bouncycastle.asn1.ASN1Encodable) (obj))), new DEROctetString(abyte0));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
_L4:
        return KeyUtil.getEncodedSubjectPublicKeyInfo(((SubjectPublicKeyInfo) (obj)));
_L2:
        if (!(ecSpec instanceof ECNamedCurveSpec))
        {
            break; /* Loop/switch isn't completed */
        }
        ASN1ObjectIdentifier asn1objectidentifier = ECUtil.getNamedCurveOid(((ECNamedCurveSpec)ecSpec).getName());
        obj = asn1objectidentifier;
        if (asn1objectidentifier == null)
        {
            obj = new ASN1ObjectIdentifier(((ECNamedCurveSpec)ecSpec).getName());
        }
        obj = new X962Parameters(((ASN1ObjectIdentifier) (obj)));
_L5:
        ASN1OctetString asn1octetstring = (ASN1OctetString)(new X9ECPoint(engineGetQ().getCurve().createPoint(getQ().getX().toBigInteger(), getQ().getY().toBigInteger(), withCompression))).toASN1Primitive();
        obj = new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, ((org.bouncycastle.asn1.ASN1Encodable) (obj))), asn1octetstring.getOctets());
        if (true) goto _L4; else goto _L3
_L3:
        if (ecSpec == null)
        {
            obj = new X962Parameters(DERNull.INSTANCE);
        } else
        {
            obj = EC5Util.convertCurve(ecSpec.getCurve());
            obj = new X962Parameters(new X9ECParameters(((ECCurve) (obj)), EC5Util.convertPoint(((ECCurve) (obj)), ecSpec.getGenerator(), withCompression), ecSpec.getOrder(), BigInteger.valueOf(ecSpec.getCofactor()), ecSpec.getCurve().getSeed()));
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public String getFormat()
    {
        return "X.509";
    }

    public ECParameterSpec getParameters()
    {
        if (ecSpec == null)
        {
            return null;
        } else
        {
            return EC5Util.convertSpec(ecSpec, withCompression);
        }
    }

    public java.security.spec.ECParameterSpec getParams()
    {
        return ecSpec;
    }

    public ECPoint getQ()
    {
        if (ecSpec == null)
        {
            if (q instanceof org.bouncycastle.math.ec.ECPoint.Fp)
            {
                return new org.bouncycastle.math.ec.ECPoint.Fp(null, q.getX(), q.getY());
            } else
            {
                return new org.bouncycastle.math.ec.ECPoint.F2m(null, q.getX(), q.getY());
            }
        } else
        {
            return q;
        }
    }

    public java.security.spec.ECPoint getW()
    {
        return new java.security.spec.ECPoint(q.getX().toBigInteger(), q.getY().toBigInteger());
    }

    public int hashCode()
    {
        return engineGetQ().hashCode() ^ engineGetSpec().hashCode();
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
        stringbuffer.append("EC Public Key").append(s);
        stringbuffer.append("            X: ").append(q.getX().toBigInteger().toString(16)).append(s);
        stringbuffer.append("            Y: ").append(q.getY().toBigInteger().toString(16)).append(s);
        return stringbuffer.toString();
    }
}
