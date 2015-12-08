// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dstu;

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
import org.bouncycastle.asn1.ua.DSTU4145BinaryField;
import org.bouncycastle.asn1.ua.DSTU4145ECBinary;
import org.bouncycastle.asn1.ua.DSTU4145NamedCurves;
import org.bouncycastle.asn1.ua.DSTU4145Params;
import org.bouncycastle.asn1.ua.DSTU4145PointEncoder;
import org.bouncycastle.asn1.ua.UAObjectIdentifiers;
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
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;

public class BCDSTU4145PublicKey
    implements ECPublicKey, ECPointEncoder, org.bouncycastle.jce.interfaces.ECPublicKey
{

    static final long serialVersionUID = 0x61823879c4d16022L;
    private String algorithm;
    private transient DSTU4145Params dstuParams;
    private transient java.security.spec.ECParameterSpec ecSpec;
    private transient ECPoint q;
    private boolean withCompression;

    public BCDSTU4145PublicKey(String s, ECPublicKeyParameters ecpublickeyparameters)
    {
        algorithm = "DSTU4145";
        algorithm = s;
        q = ecpublickeyparameters.getQ();
        ecSpec = null;
    }

    public BCDSTU4145PublicKey(String s, ECPublicKeyParameters ecpublickeyparameters, java.security.spec.ECParameterSpec ecparameterspec)
    {
        algorithm = "DSTU4145";
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

    public BCDSTU4145PublicKey(String s, ECPublicKeyParameters ecpublickeyparameters, ECParameterSpec ecparameterspec)
    {
        algorithm = "DSTU4145";
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

    public BCDSTU4145PublicKey(ECPublicKey ecpublickey)
    {
        algorithm = "DSTU4145";
        algorithm = ecpublickey.getAlgorithm();
        ecSpec = ecpublickey.getParams();
        q = EC5Util.convertPoint(ecSpec, ecpublickey.getW(), false);
    }

    public BCDSTU4145PublicKey(ECPublicKeySpec ecpublickeyspec)
    {
        algorithm = "DSTU4145";
        ecSpec = ecpublickeyspec.getParams();
        q = EC5Util.convertPoint(ecSpec, ecpublickeyspec.getW(), false);
    }

    BCDSTU4145PublicKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        algorithm = "DSTU4145";
        populateFromPubKeyInfo(subjectpublickeyinfo);
    }

    public BCDSTU4145PublicKey(BCDSTU4145PublicKey bcdstu4145publickey)
    {
        algorithm = "DSTU4145";
        q = bcdstu4145publickey.q;
        ecSpec = bcdstu4145publickey.ecSpec;
        withCompression = bcdstu4145publickey.withCompression;
        dstuParams = bcdstu4145publickey.dstuParams;
    }

    public BCDSTU4145PublicKey(org.bouncycastle.jce.spec.ECPublicKeySpec ecpublickeyspec)
    {
        algorithm = "DSTU4145";
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

    private java.security.spec.ECParameterSpec createSpec(EllipticCurve ellipticcurve, ECDomainParameters ecdomainparameters)
    {
        return new java.security.spec.ECParameterSpec(ellipticcurve, new java.security.spec.ECPoint(ecdomainparameters.getG().getX().toBigInteger(), ecdomainparameters.getG().getY().toBigInteger()), ecdomainparameters.getN(), ecdomainparameters.getH().intValue());
    }

    private void populateFromPubKeyInfo(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
label0:
        {
            if (subjectpublickeyinfo.getAlgorithm().getAlgorithm().equals(UAObjectIdentifiers.dstu4145be) || subjectpublickeyinfo.getAlgorithm().getAlgorithm().equals(UAObjectIdentifiers.dstu4145le))
            {
                Object obj = subjectpublickeyinfo.getPublicKeyData();
                algorithm = "DSTU4145";
                byte abyte0[];
                ECCurve eccurve;
                Object obj2;
                try
                {
                    obj = (ASN1OctetString)ASN1Primitive.fromByteArray(((DERBitString) (obj)).getBytes());
                }
                // Misplaced declaration of an exception variable
                catch (SubjectPublicKeyInfo subjectpublickeyinfo)
                {
                    throw new IllegalArgumentException("error recovering public key");
                }
                abyte0 = ((ASN1OctetString) (obj)).getOctets();
                if (subjectpublickeyinfo.getAlgorithm().getAlgorithm().equals(UAObjectIdentifiers.dstu4145le))
                {
                    reverseBytes(abyte0);
                }
                dstuParams = DSTU4145Params.getInstance((ASN1Sequence)subjectpublickeyinfo.getAlgorithm().getParameters());
                if (dstuParams.isNamedCurve())
                {
                    subjectpublickeyinfo = dstuParams.getNamedCurve();
                    ECDomainParameters ecdomainparameters = DSTU4145NamedCurves.getByOID(subjectpublickeyinfo);
                    subjectpublickeyinfo = new ECNamedCurveParameterSpec(subjectpublickeyinfo.getId(), ecdomainparameters.getCurve(), ecdomainparameters.getG(), ecdomainparameters.getN(), ecdomainparameters.getH(), ecdomainparameters.getSeed());
                } else
                {
                    DSTU4145ECBinary dstu4145ecbinary = dstuParams.getECBinary();
                    obj2 = dstu4145ecbinary.getB();
                    if (subjectpublickeyinfo.getAlgorithm().getAlgorithm().equals(UAObjectIdentifiers.dstu4145le))
                    {
                        reverseBytes(((byte []) (obj2)));
                    }
                    DSTU4145BinaryField dstu4145binaryfield = dstu4145ecbinary.getField();
                    obj2 = new org.bouncycastle.math.ec.ECCurve.F2m(dstu4145binaryfield.getM(), dstu4145binaryfield.getK1(), dstu4145binaryfield.getK2(), dstu4145binaryfield.getK3(), dstu4145ecbinary.getA(), new BigInteger(1, ((byte []) (obj2))));
                    byte abyte2[] = dstu4145ecbinary.getG();
                    if (subjectpublickeyinfo.getAlgorithm().getAlgorithm().equals(UAObjectIdentifiers.dstu4145le))
                    {
                        reverseBytes(abyte2);
                    }
                    subjectpublickeyinfo = new ECParameterSpec(((ECCurve) (obj2)), DSTU4145PointEncoder.decodePoint(((ECCurve) (obj2)), abyte2), dstu4145ecbinary.getN());
                }
                eccurve = subjectpublickeyinfo.getCurve();
                obj2 = EC5Util.convertCurve(eccurve, subjectpublickeyinfo.getSeed());
                q = DSTU4145PointEncoder.decodePoint(eccurve, abyte0);
                if (dstuParams.isNamedCurve())
                {
                    ecSpec = new ECNamedCurveSpec(dstuParams.getNamedCurve().getId(), ((EllipticCurve) (obj2)), new java.security.spec.ECPoint(subjectpublickeyinfo.getG().getX().toBigInteger(), subjectpublickeyinfo.getG().getY().toBigInteger()), subjectpublickeyinfo.getN(), subjectpublickeyinfo.getH());
                    return;
                } else
                {
                    ecSpec = new java.security.spec.ECParameterSpec(((EllipticCurve) (obj2)), new java.security.spec.ECPoint(subjectpublickeyinfo.getG().getX().toBigInteger(), subjectpublickeyinfo.getG().getY().toBigInteger()), subjectpublickeyinfo.getN(), subjectpublickeyinfo.getH().intValue());
                    return;
                }
            }
            Object obj1 = new X962Parameters((ASN1Primitive)subjectpublickeyinfo.getAlgorithm().getParameters());
            DEROctetString deroctetstring;
            byte abyte1[];
            if (((X962Parameters) (obj1)).isNamedCurve())
            {
                ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)((X962Parameters) (obj1)).getParameters();
                X9ECParameters x9ecparameters1 = ECUtil.getNamedCurveByOid(asn1objectidentifier);
                obj1 = x9ecparameters1.getCurve();
                EllipticCurve ellipticcurve = EC5Util.convertCurve(((ECCurve) (obj1)), x9ecparameters1.getSeed());
                ecSpec = new ECNamedCurveSpec(ECUtil.getCurveName(asn1objectidentifier), ellipticcurve, new java.security.spec.ECPoint(x9ecparameters1.getG().getX().toBigInteger(), x9ecparameters1.getG().getY().toBigInteger()), x9ecparameters1.getN(), x9ecparameters1.getH());
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
            abyte1 = subjectpublickeyinfo.getPublicKeyData().getBytes();
            deroctetstring = new DEROctetString(abyte1);
            subjectpublickeyinfo = deroctetstring;
            if (abyte1[0] != 4)
            {
                break label0;
            }
            subjectpublickeyinfo = deroctetstring;
            if (abyte1[1] != abyte1.length - 2)
            {
                break label0;
            }
            if (abyte1[2] != 2)
            {
                subjectpublickeyinfo = deroctetstring;
                if (abyte1[2] != 3)
                {
                    break label0;
                }
            }
            subjectpublickeyinfo = deroctetstring;
            if ((new X9IntegerConverter()).getByteLength(((ECCurve) (obj1))) >= abyte1.length - 3)
            {
                try
                {
                    subjectpublickeyinfo = (ASN1OctetString)ASN1Primitive.fromByteArray(abyte1);
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
        objectinputstream.defaultReadObject();
        populateFromPubKeyInfo(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[])(byte[])objectinputstream.readObject())));
    }

    private void reverseBytes(byte abyte0[])
    {
        for (int i = 0; i < abyte0.length / 2; i++)
        {
            byte byte0 = abyte0[i];
            abyte0[i] = abyte0[abyte0.length - 1 - i];
            abyte0[abyte0.length - 1 - i] = byte0;
        }

    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(getEncoded());
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
        if (obj instanceof BCDSTU4145PublicKey)
        {
            if (engineGetQ().equals(((BCDSTU4145PublicKey) (obj = (BCDSTU4145PublicKey)obj)).engineGetQ()) && engineGetSpec().equals(((BCDSTU4145PublicKey) (obj)).engineGetSpec()))
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
        if (!algorithm.equals("DSTU4145")) goto _L2; else goto _L1
_L1:
        Object obj;
        byte abyte0[];
        if (dstuParams != null)
        {
            obj = dstuParams;
        } else
        if (ecSpec instanceof ECNamedCurveSpec)
        {
            obj = new DSTU4145Params(new ASN1ObjectIdentifier(((ECNamedCurveSpec)ecSpec).getName()));
        } else
        {
            obj = EC5Util.convertCurve(ecSpec.getCurve());
            obj = new X962Parameters(new X9ECParameters(((ECCurve) (obj)), EC5Util.convertPoint(((ECCurve) (obj)), ecSpec.getGenerator(), withCompression), ecSpec.getOrder(), BigInteger.valueOf(ecSpec.getCofactor()), ecSpec.getCurve().getSeed()));
        }
        abyte0 = DSTU4145PointEncoder.encodePoint(q);
        try
        {
            obj = new SubjectPublicKeyInfo(new AlgorithmIdentifier(UAObjectIdentifiers.dstu4145be, ((org.bouncycastle.asn1.ASN1Encodable) (obj))), new DEROctetString(abyte0));
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

    public byte[] getSbox()
    {
        if (dstuParams != null)
        {
            return dstuParams.getDKE();
        } else
        {
            return DSTU4145Params.getDefaultDKE();
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
