// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.crmf:
//            POPOSigningKey, POPOPrivKey

public class ProofOfPossession extends ASN1Object
    implements ASN1Choice
{

    public static final int TYPE_KEY_AGREEMENT = 3;
    public static final int TYPE_KEY_ENCIPHERMENT = 2;
    public static final int TYPE_RA_VERIFIED = 0;
    public static final int TYPE_SIGNING_KEY = 1;
    private ASN1Encodable obj;
    private int tagNo;

    public ProofOfPossession()
    {
        tagNo = 0;
        obj = DERNull.INSTANCE;
    }

    public ProofOfPossession(int i, POPOPrivKey popoprivkey)
    {
        tagNo = i;
        obj = popoprivkey;
    }

    private ProofOfPossession(ASN1TaggedObject asn1taggedobject)
    {
        tagNo = asn1taggedobject.getTagNo();
        switch (tagNo)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("unknown tag: ").append(tagNo).toString());

        case 0: // '\0'
            obj = DERNull.INSTANCE;
            return;

        case 1: // '\001'
            obj = POPOSigningKey.getInstance(asn1taggedobject, false);
            return;

        case 2: // '\002'
        case 3: // '\003'
            obj = POPOPrivKey.getInstance(asn1taggedobject, true);
            break;
        }
    }

    public ProofOfPossession(POPOSigningKey poposigningkey)
    {
        tagNo = 1;
        obj = poposigningkey;
    }

    public static ProofOfPossession getInstance(Object obj1)
    {
        if (obj1 == null || (obj1 instanceof ProofOfPossession))
        {
            return (ProofOfPossession)obj1;
        }
        if (obj1 instanceof ASN1TaggedObject)
        {
            return new ProofOfPossession((ASN1TaggedObject)obj1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid object: ").append(obj1.getClass().getName()).toString());
        }
    }

    public ASN1Encodable getObject()
    {
        return obj;
    }

    public int getType()
    {
        return tagNo;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return new DERTaggedObject(false, tagNo, obj);
    }
}
