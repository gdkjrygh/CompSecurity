// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cms.EnvelopedData;

// Referenced classes of package org.bouncycastle.asn1.crmf:
//            EncryptedValue

public class EncryptedKey extends ASN1Object
    implements ASN1Choice
{

    private EncryptedValue encryptedValue;
    private EnvelopedData envelopedData;

    public EncryptedKey(EnvelopedData envelopeddata)
    {
        envelopedData = envelopeddata;
    }

    public EncryptedKey(EncryptedValue encryptedvalue)
    {
        encryptedValue = encryptedvalue;
    }

    public static EncryptedKey getInstance(Object obj)
    {
        if (obj instanceof EncryptedKey)
        {
            return (EncryptedKey)obj;
        }
        if (obj instanceof ASN1TaggedObject)
        {
            return new EncryptedKey(EnvelopedData.getInstance((ASN1TaggedObject)obj, false));
        }
        if (obj instanceof EncryptedValue)
        {
            return new EncryptedKey((EncryptedValue)obj);
        } else
        {
            return new EncryptedKey(EncryptedValue.getInstance(obj));
        }
    }

    public ASN1Encodable getValue()
    {
        if (encryptedValue != null)
        {
            return encryptedValue;
        } else
        {
            return envelopedData;
        }
    }

    public boolean isEncryptedValue()
    {
        return encryptedValue != null;
    }

    public ASN1Primitive toASN1Primitive()
    {
        if (encryptedValue != null)
        {
            return encryptedValue.toASN1Primitive();
        } else
        {
            return new DERTaggedObject(false, 0, envelopedData);
        }
    }
}
