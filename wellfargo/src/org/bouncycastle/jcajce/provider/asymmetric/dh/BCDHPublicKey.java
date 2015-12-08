// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.DHDomainParameters;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;

public class BCDHPublicKey
    implements DHPublicKey
{

    static final long serialVersionUID = 0xfcfe28290f23e4fcL;
    private transient DHParameterSpec dhSpec;
    private transient SubjectPublicKeyInfo info;
    private BigInteger y;

    BCDHPublicKey(BigInteger biginteger, DHParameterSpec dhparameterspec)
    {
        y = biginteger;
        dhSpec = dhparameterspec;
    }

    BCDHPublicKey(DHPublicKey dhpublickey)
    {
        y = dhpublickey.getY();
        dhSpec = dhpublickey.getParams();
    }

    BCDHPublicKey(DHPublicKeySpec dhpublickeyspec)
    {
        y = dhpublickeyspec.getY();
        dhSpec = new DHParameterSpec(dhpublickeyspec.getP(), dhpublickeyspec.getG());
    }

    public BCDHPublicKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        info = subjectpublickeyinfo;
        Object obj;
        try
        {
            obj = (ASN1Integer)subjectpublickeyinfo.parsePublicKey();
        }
        // Misplaced declaration of an exception variable
        catch (SubjectPublicKeyInfo subjectpublickeyinfo)
        {
            throw new IllegalArgumentException("invalid info structure in DH public key");
        }
        y = ((ASN1Integer) (obj)).getValue();
        obj = ASN1Sequence.getInstance(subjectpublickeyinfo.getAlgorithm().getParameters());
        subjectpublickeyinfo = subjectpublickeyinfo.getAlgorithm().getAlgorithm();
        if (subjectpublickeyinfo.equals(PKCSObjectIdentifiers.dhKeyAgreement) || isPKCSParam(((ASN1Sequence) (obj))))
        {
            subjectpublickeyinfo = DHParameter.getInstance(obj);
            if (subjectpublickeyinfo.getL() != null)
            {
                dhSpec = new DHParameterSpec(subjectpublickeyinfo.getP(), subjectpublickeyinfo.getG(), subjectpublickeyinfo.getL().intValue());
                return;
            } else
            {
                dhSpec = new DHParameterSpec(subjectpublickeyinfo.getP(), subjectpublickeyinfo.getG());
                return;
            }
        }
        if (subjectpublickeyinfo.equals(X9ObjectIdentifiers.dhpublicnumber))
        {
            subjectpublickeyinfo = DHDomainParameters.getInstance(obj);
            dhSpec = new DHParameterSpec(subjectpublickeyinfo.getP().getValue(), subjectpublickeyinfo.getG().getValue());
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown algorithm type: ").append(subjectpublickeyinfo).toString());
        }
    }

    BCDHPublicKey(DHPublicKeyParameters dhpublickeyparameters)
    {
        y = dhpublickeyparameters.getY();
        dhSpec = new DHParameterSpec(dhpublickeyparameters.getParameters().getP(), dhpublickeyparameters.getParameters().getG(), dhpublickeyparameters.getParameters().getL());
    }

    private boolean isPKCSParam(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 2)
        {
            if (asn1sequence.size() > 3)
            {
                return false;
            }
            ASN1Integer asn1integer = ASN1Integer.getInstance(asn1sequence.getObjectAt(2));
            asn1sequence = ASN1Integer.getInstance(asn1sequence.getObjectAt(0));
            if (asn1integer.getValue().compareTo(BigInteger.valueOf(asn1sequence.getValue().bitLength())) > 0)
            {
                return false;
            }
        }
        return true;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        dhSpec = new DHParameterSpec((BigInteger)objectinputstream.readObject(), (BigInteger)objectinputstream.readObject(), objectinputstream.readInt());
        info = null;
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(dhSpec.getP());
        objectoutputstream.writeObject(dhSpec.getG());
        objectoutputstream.writeInt(dhSpec.getL());
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DHPublicKey)
        {
            if (getY().equals(((DHPublicKey) (obj = (DHPublicKey)obj)).getY()) && getParams().getG().equals(((DHPublicKey) (obj)).getParams().getG()) && getParams().getP().equals(((DHPublicKey) (obj)).getParams().getP()) && getParams().getL() == ((DHPublicKey) (obj)).getParams().getL())
            {
                return true;
            }
        }
        return false;
    }

    public String getAlgorithm()
    {
        return "DH";
    }

    public byte[] getEncoded()
    {
        if (info != null)
        {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(info);
        } else
        {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.dhKeyAgreement, (new DHParameter(dhSpec.getP(), dhSpec.getG(), dhSpec.getL())).toASN1Primitive()), new ASN1Integer(y));
        }
    }

    public String getFormat()
    {
        return "X.509";
    }

    public DHParameterSpec getParams()
    {
        return dhSpec;
    }

    public BigInteger getY()
    {
        return y;
    }

    public int hashCode()
    {
        return getY().hashCode() ^ getParams().getG().hashCode() ^ getParams().getP().hashCode() ^ getParams().getL();
    }
}
