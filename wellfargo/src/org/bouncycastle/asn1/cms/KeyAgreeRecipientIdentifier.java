// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            IssuerAndSerialNumber, RecipientKeyIdentifier

public class KeyAgreeRecipientIdentifier extends ASN1Object
    implements ASN1Choice
{

    private IssuerAndSerialNumber issuerSerial;
    private RecipientKeyIdentifier rKeyID;

    public KeyAgreeRecipientIdentifier(IssuerAndSerialNumber issuerandserialnumber)
    {
        issuerSerial = issuerandserialnumber;
        rKeyID = null;
    }

    public KeyAgreeRecipientIdentifier(RecipientKeyIdentifier recipientkeyidentifier)
    {
        issuerSerial = null;
        rKeyID = recipientkeyidentifier;
    }

    public static KeyAgreeRecipientIdentifier getInstance(Object obj)
    {
        if (obj == null || (obj instanceof KeyAgreeRecipientIdentifier))
        {
            return (KeyAgreeRecipientIdentifier)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new KeyAgreeRecipientIdentifier(IssuerAndSerialNumber.getInstance(obj));
        }
        if ((obj instanceof ASN1TaggedObject) && ((ASN1TaggedObject)obj).getTagNo() == 0)
        {
            return new KeyAgreeRecipientIdentifier(RecipientKeyIdentifier.getInstance((ASN1TaggedObject)obj, false));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid KeyAgreeRecipientIdentifier: ").append(obj.getClass().getName()).toString());
        }
    }

    public static KeyAgreeRecipientIdentifier getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public IssuerAndSerialNumber getIssuerAndSerialNumber()
    {
        return issuerSerial;
    }

    public RecipientKeyIdentifier getRKeyID()
    {
        return rKeyID;
    }

    public ASN1Primitive toASN1Primitive()
    {
        if (issuerSerial != null)
        {
            return issuerSerial.toASN1Primitive();
        } else
        {
            return new DERTaggedObject(false, 0, rKeyID);
        }
    }
}
