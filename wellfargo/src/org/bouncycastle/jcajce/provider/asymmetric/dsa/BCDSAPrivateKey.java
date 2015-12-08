// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;

public class BCDSAPrivateKey
    implements DSAPrivateKey, PKCS12BagAttributeCarrier
{

    private static final long serialVersionUID = 0xbf170939253dadbaL;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;
    private transient DSAParams dsaSpec;
    private BigInteger x;

    protected BCDSAPrivateKey()
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    BCDSAPrivateKey(DSAPrivateKey dsaprivatekey)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        x = dsaprivatekey.getX();
        dsaSpec = dsaprivatekey.getParams();
    }

    BCDSAPrivateKey(DSAPrivateKeySpec dsaprivatekeyspec)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        x = dsaprivatekeyspec.getX();
        dsaSpec = new DSAParameterSpec(dsaprivatekeyspec.getP(), dsaprivatekeyspec.getQ(), dsaprivatekeyspec.getG());
    }

    public BCDSAPrivateKey(PrivateKeyInfo privatekeyinfo)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        DSAParameter dsaparameter = DSAParameter.getInstance(privatekeyinfo.getPrivateKeyAlgorithm().getParameters());
        x = ((ASN1Integer)privatekeyinfo.parsePrivateKey()).getValue();
        dsaSpec = new DSAParameterSpec(dsaparameter.getP(), dsaparameter.getQ(), dsaparameter.getG());
    }

    BCDSAPrivateKey(DSAPrivateKeyParameters dsaprivatekeyparameters)
    {
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        x = dsaprivatekeyparameters.getX();
        dsaSpec = new DSAParameterSpec(dsaprivatekeyparameters.getParameters().getP(), dsaprivatekeyparameters.getParameters().getQ(), dsaprivatekeyparameters.getParameters().getG());
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        dsaSpec = new DSAParameterSpec((BigInteger)objectinputstream.readObject(), (BigInteger)objectinputstream.readObject(), (BigInteger)objectinputstream.readObject());
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(dsaSpec.getP());
        objectoutputstream.writeObject(dsaSpec.getQ());
        objectoutputstream.writeObject(dsaSpec.getG());
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DSAPrivateKey)
        {
            if (getX().equals(((DSAPrivateKey) (obj = (DSAPrivateKey)obj)).getX()) && getParams().getG().equals(((DSAPrivateKey) (obj)).getParams().getG()) && getParams().getP().equals(((DSAPrivateKey) (obj)).getParams().getP()) && getParams().getQ().equals(((DSAPrivateKey) (obj)).getParams().getQ()))
            {
                return true;
            }
        }
        return false;
    }

    public String getAlgorithm()
    {
        return "DSA";
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
        return KeyUtil.getEncodedPrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_dsa, (new DSAParameter(dsaSpec.getP(), dsaSpec.getQ(), dsaSpec.getG())).toASN1Primitive()), new ASN1Integer(getX()));
    }

    public String getFormat()
    {
        return "PKCS#8";
    }

    public DSAParams getParams()
    {
        return dsaSpec;
    }

    public BigInteger getX()
    {
        return x;
    }

    public int hashCode()
    {
        return getX().hashCode() ^ getParams().getG().hashCode() ^ getParams().getP().hashCode() ^ getParams().getQ().hashCode();
    }

    public void setBagAttribute(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        attrCarrier.setBagAttribute(asn1objectidentifier, asn1encodable);
    }
}
