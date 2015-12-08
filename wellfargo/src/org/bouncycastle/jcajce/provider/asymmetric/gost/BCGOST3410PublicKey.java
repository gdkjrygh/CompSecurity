// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.GOST3410PublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jce.interfaces.GOST3410Params;
import org.bouncycastle.jce.interfaces.GOST3410PublicKey;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeySpec;

public class BCGOST3410PublicKey
    implements GOST3410PublicKey
{

    static final long serialVersionUID = 0xa93fe76368e6032aL;
    private transient GOST3410Params gost3410Spec;
    private BigInteger y;

    BCGOST3410PublicKey(BigInteger biginteger, GOST3410ParameterSpec gost3410parameterspec)
    {
        y = biginteger;
        gost3410Spec = gost3410parameterspec;
    }

    BCGOST3410PublicKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        GOST3410PublicKeyAlgParameters gost3410publickeyalgparameters = new GOST3410PublicKeyAlgParameters((ASN1Sequence)subjectpublickeyinfo.getAlgorithmId().getParameters());
        byte abyte0[];
        int i;
        try
        {
            subjectpublickeyinfo = ((DEROctetString)subjectpublickeyinfo.parsePublicKey()).getOctets();
            abyte0 = new byte[subjectpublickeyinfo.length];
        }
        // Misplaced declaration of an exception variable
        catch (SubjectPublicKeyInfo subjectpublickeyinfo)
        {
            throw new IllegalArgumentException("invalid info structure in GOST3410 public key");
        }
        i = 0;
        if (i == subjectpublickeyinfo.length)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte0[i] = subjectpublickeyinfo[subjectpublickeyinfo.length - 1 - i];
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_41;
_L1:
        y = new BigInteger(1, abyte0);
        gost3410Spec = GOST3410ParameterSpec.fromPublicKeyAlg(gost3410publickeyalgparameters);
        return;
    }

    BCGOST3410PublicKey(GOST3410PublicKeyParameters gost3410publickeyparameters, GOST3410ParameterSpec gost3410parameterspec)
    {
        y = gost3410publickeyparameters.getY();
        gost3410Spec = gost3410parameterspec;
    }

    BCGOST3410PublicKey(GOST3410PublicKey gost3410publickey)
    {
        y = gost3410publickey.getY();
        gost3410Spec = gost3410publickey.getParameters();
    }

    BCGOST3410PublicKey(GOST3410PublicKeySpec gost3410publickeyspec)
    {
        y = gost3410publickeyspec.getY();
        gost3410Spec = new GOST3410ParameterSpec(new GOST3410PublicKeyParameterSetSpec(gost3410publickeyspec.getP(), gost3410publickeyspec.getQ(), gost3410publickeyspec.getA()));
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        String s = (String)objectinputstream.readObject();
        if (s != null)
        {
            gost3410Spec = new GOST3410ParameterSpec(s, (String)objectinputstream.readObject(), (String)objectinputstream.readObject());
            return;
        } else
        {
            gost3410Spec = new GOST3410ParameterSpec(new GOST3410PublicKeyParameterSetSpec((BigInteger)objectinputstream.readObject(), (BigInteger)objectinputstream.readObject(), (BigInteger)objectinputstream.readObject()));
            objectinputstream.readObject();
            objectinputstream.readObject();
            return;
        }
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        if (gost3410Spec.getPublicKeyParamSetOID() != null)
        {
            objectoutputstream.writeObject(gost3410Spec.getPublicKeyParamSetOID());
            objectoutputstream.writeObject(gost3410Spec.getDigestParamSetOID());
            objectoutputstream.writeObject(gost3410Spec.getEncryptionParamSetOID());
            return;
        } else
        {
            objectoutputstream.writeObject(null);
            objectoutputstream.writeObject(gost3410Spec.getPublicKeyParameters().getP());
            objectoutputstream.writeObject(gost3410Spec.getPublicKeyParameters().getQ());
            objectoutputstream.writeObject(gost3410Spec.getPublicKeyParameters().getA());
            objectoutputstream.writeObject(gost3410Spec.getDigestParamSetOID());
            objectoutputstream.writeObject(gost3410Spec.getEncryptionParamSetOID());
            return;
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof BCGOST3410PublicKey)
        {
            obj = (BCGOST3410PublicKey)obj;
            flag = flag1;
            if (y.equals(((BCGOST3410PublicKey) (obj)).y))
            {
                flag = flag1;
                if (gost3410Spec.equals(((BCGOST3410PublicKey) (obj)).gost3410Spec))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public String getAlgorithm()
    {
        return "GOST3410";
    }

    public byte[] getEncoded()
    {
        Object obj;
        int i = 0;
        byte abyte0[] = getY().toByteArray();
        if (abyte0[0] == 0)
        {
            obj = new byte[abyte0.length - 1];
        } else
        {
            obj = new byte[abyte0.length];
        }
        for (; i != obj.length; i++)
        {
            obj[i] = abyte0[abyte0.length - 1 - i];
        }

        if (!(gost3410Spec instanceof GOST3410ParameterSpec))
        {
            break MISSING_BLOCK_LABEL_231;
        }
        if (gost3410Spec.getEncryptionParamSetOID() != null)
        {
            obj = new SubjectPublicKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_94, new GOST3410PublicKeyAlgParameters(new ASN1ObjectIdentifier(gost3410Spec.getPublicKeyParamSetOID()), new ASN1ObjectIdentifier(gost3410Spec.getDigestParamSetOID()), new ASN1ObjectIdentifier(gost3410Spec.getEncryptionParamSetOID()))), new DEROctetString(((byte []) (obj))));
        } else
        {
            obj = new SubjectPublicKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_94, new GOST3410PublicKeyAlgParameters(new ASN1ObjectIdentifier(gost3410Spec.getPublicKeyParamSetOID()), new ASN1ObjectIdentifier(gost3410Spec.getDigestParamSetOID()))), new DEROctetString(((byte []) (obj))));
        }
_L1:
        return KeyUtil.getEncodedSubjectPublicKeyInfo(((SubjectPublicKeyInfo) (obj)));
        try
        {
            obj = new SubjectPublicKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_94), new DEROctetString(((byte []) (obj))));
        }
        catch (IOException ioexception)
        {
            return null;
        }
          goto _L1
    }

    public String getFormat()
    {
        return "X.509";
    }

    public GOST3410Params getParameters()
    {
        return gost3410Spec;
    }

    public BigInteger getY()
    {
        return y;
    }

    public int hashCode()
    {
        return y.hashCode() ^ gost3410Spec.hashCode();
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = System.getProperty("line.separator");
        stringbuffer.append("GOST3410 Public Key").append(s);
        stringbuffer.append("            y: ").append(getY().toString(16)).append(s);
        return stringbuffer.toString();
    }
}
