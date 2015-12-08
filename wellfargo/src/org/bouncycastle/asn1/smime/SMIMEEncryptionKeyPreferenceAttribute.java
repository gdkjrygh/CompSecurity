// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.smime;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.cms.RecipientKeyIdentifier;

// Referenced classes of package org.bouncycastle.asn1.smime:
//            SMIMEAttributes

public class SMIMEEncryptionKeyPreferenceAttribute extends Attribute
{

    public SMIMEEncryptionKeyPreferenceAttribute(ASN1OctetString asn1octetstring)
    {
        super(SMIMEAttributes.encrypKeyPref, new DERSet(new DERTaggedObject(false, 2, asn1octetstring)));
    }

    public SMIMEEncryptionKeyPreferenceAttribute(IssuerAndSerialNumber issuerandserialnumber)
    {
        super(SMIMEAttributes.encrypKeyPref, new DERSet(new DERTaggedObject(false, 0, issuerandserialnumber)));
    }

    public SMIMEEncryptionKeyPreferenceAttribute(RecipientKeyIdentifier recipientkeyidentifier)
    {
        super(SMIMEAttributes.encrypKeyPref, new DERSet(new DERTaggedObject(false, 1, recipientkeyidentifier)));
    }
}
