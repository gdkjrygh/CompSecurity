// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.smime;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

public class SMIMECapability extends ASN1Object
{

    public static final ASN1ObjectIdentifier aES128_CBC;
    public static final ASN1ObjectIdentifier aES192_CBC;
    public static final ASN1ObjectIdentifier aES256_CBC;
    public static final ASN1ObjectIdentifier canNotDecryptAny;
    public static final ASN1ObjectIdentifier dES_CBC = new ASN1ObjectIdentifier("1.3.14.3.2.7");
    public static final ASN1ObjectIdentifier dES_EDE3_CBC;
    public static final ASN1ObjectIdentifier preferSignedData;
    public static final ASN1ObjectIdentifier rC2_CBC;
    public static final ASN1ObjectIdentifier sMIMECapabilitiesVersions;
    private ASN1ObjectIdentifier capabilityID;
    private ASN1Encodable parameters;

    public SMIMECapability(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        capabilityID = asn1objectidentifier;
        parameters = asn1encodable;
    }

    public SMIMECapability(ASN1Sequence asn1sequence)
    {
        capabilityID = (ASN1ObjectIdentifier)asn1sequence.getObjectAt(0);
        if (asn1sequence.size() > 1)
        {
            parameters = (ASN1Primitive)asn1sequence.getObjectAt(1);
        }
    }

    public static SMIMECapability getInstance(Object obj)
    {
        if (obj == null || (obj instanceof SMIMECapability))
        {
            return (SMIMECapability)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new SMIMECapability((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException("Invalid SMIMECapability");
        }
    }

    public ASN1ObjectIdentifier getCapabilityID()
    {
        return capabilityID;
    }

    public ASN1Encodable getParameters()
    {
        return parameters;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(capabilityID);
        if (parameters != null)
        {
            asn1encodablevector.add(parameters);
        }
        return new DERSequence(asn1encodablevector);
    }

    static 
    {
        preferSignedData = PKCSObjectIdentifiers.preferSignedData;
        canNotDecryptAny = PKCSObjectIdentifiers.canNotDecryptAny;
        sMIMECapabilitiesVersions = PKCSObjectIdentifiers.sMIMECapabilitiesVersions;
        dES_EDE3_CBC = PKCSObjectIdentifiers.des_EDE3_CBC;
        rC2_CBC = PKCSObjectIdentifiers.RC2_CBC;
        aES128_CBC = NISTObjectIdentifiers.id_aes128_CBC;
        aES192_CBC = NISTObjectIdentifiers.id_aes192_CBC;
        aES256_CBC = NISTObjectIdentifiers.id_aes256_CBC;
    }
}
