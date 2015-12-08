// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.oiw.ElGamalParameter;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.ElGamalPrivateKey;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.spec.ElGamalParameterSpec;
import org.bouncycastle.jce.spec.ElGamalPrivateKeySpec;

public class JCEElGamalPrivateKey
    implements DHPrivateKey, ElGamalPrivateKey, PKCS12BagAttributeCarrier
{

    static final long serialVersionUID = 0x42e1c55fb6bcc04eL;
    private PKCS12BagAttributeCarrierImpl attrCarrier;
    ElGamalParameterSpec elSpec;
    BigInteger x;

    protected JCEElGamalPrivateKey()
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    JCEElGamalPrivateKey(DHPrivateKey dhprivatekey)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        x = dhprivatekey.getX();
        elSpec = new ElGamalParameterSpec(dhprivatekey.getParams().getP(), dhprivatekey.getParams().getG());
    }

    JCEElGamalPrivateKey(DHPrivateKeySpec dhprivatekeyspec)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        x = dhprivatekeyspec.getX();
        elSpec = new ElGamalParameterSpec(dhprivatekeyspec.getP(), dhprivatekeyspec.getG());
    }

    JCEElGamalPrivateKey(PrivateKeyInfo privatekeyinfo)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        ElGamalParameter elgamalparameter = new ElGamalParameter((ASN1Sequence)privatekeyinfo.getAlgorithmId().getParameters());
        x = ASN1Integer.getInstance(privatekeyinfo.parsePrivateKey()).getValue();
        elSpec = new ElGamalParameterSpec(elgamalparameter.getP(), elgamalparameter.getG());
    }

    JCEElGamalPrivateKey(ElGamalPrivateKeyParameters elgamalprivatekeyparameters)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        x = elgamalprivatekeyparameters.getX();
        elSpec = new ElGamalParameterSpec(elgamalprivatekeyparameters.getParameters().getP(), elgamalprivatekeyparameters.getParameters().getG());
    }

    JCEElGamalPrivateKey(ElGamalPrivateKey elgamalprivatekey)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        x = elgamalprivatekey.getX();
        elSpec = elgamalprivatekey.getParameters();
    }

    JCEElGamalPrivateKey(ElGamalPrivateKeySpec elgamalprivatekeyspec)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        x = elgamalprivatekeyspec.getX();
        elSpec = new ElGamalParameterSpec(elgamalprivatekeyspec.getParams().getP(), elgamalprivatekeyspec.getParams().getG());
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        x = (BigInteger)objectinputstream.readObject();
        elSpec = new ElGamalParameterSpec((BigInteger)objectinputstream.readObject(), (BigInteger)objectinputstream.readObject());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.writeObject(getX());
        objectoutputstream.writeObject(elSpec.getP());
        objectoutputstream.writeObject(elSpec.getG());
    }

    public String getAlgorithm()
    {
        return "ElGamal";
    }

    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier asn1objectidentifier)
    {
        return attrCarrier.getBagAttribute(asn1objectidentifier);
    }

    public Enumeration getBagAttributeKeys()
    {
        return attrCarrier.getBagAttributeKeys();
    }

    public byte[] getEncoded()
    {
        return KeyUtil.getEncodedPrivateKeyInfo(new AlgorithmIdentifier(OIWObjectIdentifiers.elGamalAlgorithm, new ElGamalParameter(elSpec.getP(), elSpec.getG())), new DERInteger(getX()));
    }

    public String getFormat()
    {
        return "PKCS#8";
    }

    public ElGamalParameterSpec getParameters()
    {
        return elSpec;
    }

    public DHParameterSpec getParams()
    {
        return new DHParameterSpec(elSpec.getP(), elSpec.getG());
    }

    public BigInteger getX()
    {
        return x;
    }

    public void setBagAttribute(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        attrCarrier.setBagAttribute(asn1objectidentifier, asn1encodable);
    }
}
