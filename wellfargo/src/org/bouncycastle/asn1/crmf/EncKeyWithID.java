// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.GeneralName;

public class EncKeyWithID extends ASN1Object
{

    private final ASN1Encodable identifier;
    private final PrivateKeyInfo privKeyInfo;

    private EncKeyWithID(ASN1Sequence asn1sequence)
    {
        privKeyInfo = PrivateKeyInfo.getInstance(asn1sequence.getObjectAt(0));
        if (asn1sequence.size() > 1)
        {
            if (!(asn1sequence.getObjectAt(1) instanceof DERUTF8String))
            {
                identifier = GeneralName.getInstance(asn1sequence.getObjectAt(1));
                return;
            } else
            {
                identifier = asn1sequence.getObjectAt(1);
                return;
            }
        } else
        {
            identifier = null;
            return;
        }
    }

    public EncKeyWithID(PrivateKeyInfo privatekeyinfo)
    {
        privKeyInfo = privatekeyinfo;
        identifier = null;
    }

    public EncKeyWithID(PrivateKeyInfo privatekeyinfo, DERUTF8String derutf8string)
    {
        privKeyInfo = privatekeyinfo;
        identifier = derutf8string;
    }

    public EncKeyWithID(PrivateKeyInfo privatekeyinfo, GeneralName generalname)
    {
        privKeyInfo = privatekeyinfo;
        identifier = generalname;
    }

    public static EncKeyWithID getInstance(Object obj)
    {
        if (obj instanceof EncKeyWithID)
        {
            return (EncKeyWithID)obj;
        }
        if (obj != null)
        {
            return new EncKeyWithID(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Encodable getIdentifier()
    {
        return identifier;
    }

    public PrivateKeyInfo getPrivateKey()
    {
        return privKeyInfo;
    }

    public boolean hasIdentifier()
    {
        return identifier != null;
    }

    public boolean isIdentifierUTF8String()
    {
        return identifier instanceof DERUTF8String;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(privKeyInfo);
        if (identifier != null)
        {
            asn1encodablevector.add(identifier);
        }
        return new DERSequence(asn1encodablevector);
    }
}
