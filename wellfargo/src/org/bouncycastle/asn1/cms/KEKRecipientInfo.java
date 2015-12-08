// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            KEKIdentifier

public class KEKRecipientInfo extends ASN1Object
{

    private ASN1OctetString encryptedKey;
    private KEKIdentifier kekid;
    private AlgorithmIdentifier keyEncryptionAlgorithm;
    private ASN1Integer version;

    public KEKRecipientInfo(ASN1Sequence asn1sequence)
    {
        version = (ASN1Integer)asn1sequence.getObjectAt(0);
        kekid = KEKIdentifier.getInstance(asn1sequence.getObjectAt(1));
        keyEncryptionAlgorithm = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(2));
        encryptedKey = (ASN1OctetString)asn1sequence.getObjectAt(3);
    }

    public KEKRecipientInfo(KEKIdentifier kekidentifier, AlgorithmIdentifier algorithmidentifier, ASN1OctetString asn1octetstring)
    {
        version = new ASN1Integer(4L);
        kekid = kekidentifier;
        keyEncryptionAlgorithm = algorithmidentifier;
        encryptedKey = asn1octetstring;
    }

    public static KEKRecipientInfo getInstance(Object obj)
    {
        if (obj == null || (obj instanceof KEKRecipientInfo))
        {
            return (KEKRecipientInfo)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new KEKRecipientInfo((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid KEKRecipientInfo: ").append(obj.getClass().getName()).toString());
        }
    }

    public static KEKRecipientInfo getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public ASN1OctetString getEncryptedKey()
    {
        return encryptedKey;
    }

    public KEKIdentifier getKekid()
    {
        return kekid;
    }

    public AlgorithmIdentifier getKeyEncryptionAlgorithm()
    {
        return keyEncryptionAlgorithm;
    }

    public ASN1Integer getVersion()
    {
        return version;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(version);
        asn1encodablevector.add(kekid);
        asn1encodablevector.add(keyEncryptionAlgorithm);
        asn1encodablevector.add(encryptedKey);
        return new DERSequence(asn1encodablevector);
    }
}
