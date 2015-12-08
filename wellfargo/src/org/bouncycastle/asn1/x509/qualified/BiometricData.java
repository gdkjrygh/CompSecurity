// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509.qualified;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.x509.qualified:
//            TypeOfBiometricData

public class BiometricData extends ASN1Object
{

    private ASN1OctetString biometricDataHash;
    private AlgorithmIdentifier hashAlgorithm;
    private DERIA5String sourceDataUri;
    private TypeOfBiometricData typeOfBiometricData;

    private BiometricData(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        typeOfBiometricData = TypeOfBiometricData.getInstance(asn1sequence.nextElement());
        hashAlgorithm = AlgorithmIdentifier.getInstance(asn1sequence.nextElement());
        biometricDataHash = ASN1OctetString.getInstance(asn1sequence.nextElement());
        if (asn1sequence.hasMoreElements())
        {
            sourceDataUri = DERIA5String.getInstance(asn1sequence.nextElement());
        }
    }

    public BiometricData(TypeOfBiometricData typeofbiometricdata, AlgorithmIdentifier algorithmidentifier, ASN1OctetString asn1octetstring)
    {
        typeOfBiometricData = typeofbiometricdata;
        hashAlgorithm = algorithmidentifier;
        biometricDataHash = asn1octetstring;
        sourceDataUri = null;
    }

    public BiometricData(TypeOfBiometricData typeofbiometricdata, AlgorithmIdentifier algorithmidentifier, ASN1OctetString asn1octetstring, DERIA5String deria5string)
    {
        typeOfBiometricData = typeofbiometricdata;
        hashAlgorithm = algorithmidentifier;
        biometricDataHash = asn1octetstring;
        sourceDataUri = deria5string;
    }

    public static BiometricData getInstance(Object obj)
    {
        if (obj instanceof BiometricData)
        {
            return (BiometricData)obj;
        }
        if (obj != null)
        {
            return new BiometricData(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1OctetString getBiometricDataHash()
    {
        return biometricDataHash;
    }

    public AlgorithmIdentifier getHashAlgorithm()
    {
        return hashAlgorithm;
    }

    public DERIA5String getSourceDataUri()
    {
        return sourceDataUri;
    }

    public TypeOfBiometricData getTypeOfBiometricData()
    {
        return typeOfBiometricData;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(typeOfBiometricData);
        asn1encodablevector.add(hashAlgorithm);
        asn1encodablevector.add(biometricDataHash);
        if (sourceDataUri != null)
        {
            asn1encodablevector.add(sourceDataUri);
        }
        return new DERSequence(asn1encodablevector);
    }
}
