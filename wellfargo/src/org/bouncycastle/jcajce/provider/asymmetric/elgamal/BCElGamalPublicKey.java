// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.oiw.ElGamalParameter;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;
import org.bouncycastle.jce.interfaces.ElGamalPublicKey;
import org.bouncycastle.jce.spec.ElGamalParameterSpec;
import org.bouncycastle.jce.spec.ElGamalPublicKeySpec;

public class BCElGamalPublicKey
    implements DHPublicKey, ElGamalPublicKey
{

    static final long serialVersionUID = 0x78e9d455552c6634L;
    private transient ElGamalParameterSpec elSpec;
    private BigInteger y;

    BCElGamalPublicKey(BigInteger biginteger, ElGamalParameterSpec elgamalparameterspec)
    {
        y = biginteger;
        elSpec = elgamalparameterspec;
    }

    BCElGamalPublicKey(DHPublicKey dhpublickey)
    {
        y = dhpublickey.getY();
        elSpec = new ElGamalParameterSpec(dhpublickey.getParams().getP(), dhpublickey.getParams().getG());
    }

    BCElGamalPublicKey(DHPublicKeySpec dhpublickeyspec)
    {
        y = dhpublickeyspec.getY();
        elSpec = new ElGamalParameterSpec(dhpublickeyspec.getP(), dhpublickeyspec.getG());
    }

    BCElGamalPublicKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        ElGamalParameter elgamalparameter = new ElGamalParameter((ASN1Sequence)subjectpublickeyinfo.getAlgorithmId().getParameters());
        try
        {
            subjectpublickeyinfo = (DERInteger)subjectpublickeyinfo.parsePublicKey();
        }
        // Misplaced declaration of an exception variable
        catch (SubjectPublicKeyInfo subjectpublickeyinfo)
        {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
        y = subjectpublickeyinfo.getValue();
        elSpec = new ElGamalParameterSpec(elgamalparameter.getP(), elgamalparameter.getG());
    }

    BCElGamalPublicKey(ElGamalPublicKeyParameters elgamalpublickeyparameters)
    {
        y = elgamalpublickeyparameters.getY();
        elSpec = new ElGamalParameterSpec(elgamalpublickeyparameters.getParameters().getP(), elgamalpublickeyparameters.getParameters().getG());
    }

    BCElGamalPublicKey(ElGamalPublicKey elgamalpublickey)
    {
        y = elgamalpublickey.getY();
        elSpec = elgamalpublickey.getParameters();
    }

    BCElGamalPublicKey(ElGamalPublicKeySpec elgamalpublickeyspec)
    {
        y = elgamalpublickeyspec.getY();
        elSpec = new ElGamalParameterSpec(elgamalpublickeyspec.getParams().getP(), elgamalpublickeyspec.getParams().getG());
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        elSpec = new ElGamalParameterSpec((BigInteger)objectinputstream.readObject(), (BigInteger)objectinputstream.readObject());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(elSpec.getP());
        objectoutputstream.writeObject(elSpec.getG());
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
        return "ElGamal";
    }

    public byte[] getEncoded()
    {
        byte abyte0[];
        try
        {
            abyte0 = (new SubjectPublicKeyInfo(new AlgorithmIdentifier(OIWObjectIdentifiers.elGamalAlgorithm, new ElGamalParameter(elSpec.getP(), elSpec.getG())), new DERInteger(y))).getEncoded("DER");
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return abyte0;
    }

    public String getFormat()
    {
        return "X.509";
    }

    public ElGamalParameterSpec getParameters()
    {
        return elSpec;
    }

    public DHParameterSpec getParams()
    {
        return new DHParameterSpec(elSpec.getP(), elSpec.getG());
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
