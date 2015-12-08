// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.smime;

import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

// Referenced classes of package org.bouncycastle.asn1.smime:
//            SMIMECapability

public class SMIMECapabilities extends ASN1Object
{

    public static final ASN1ObjectIdentifier canNotDecryptAny;
    public static final ASN1ObjectIdentifier dES_CBC = new ASN1ObjectIdentifier("1.3.14.3.2.7");
    public static final ASN1ObjectIdentifier dES_EDE3_CBC;
    public static final ASN1ObjectIdentifier preferSignedData;
    public static final ASN1ObjectIdentifier rC2_CBC;
    public static final ASN1ObjectIdentifier sMIMECapabilitesVersions;
    private ASN1Sequence capabilities;

    public SMIMECapabilities(ASN1Sequence asn1sequence)
    {
        capabilities = asn1sequence;
    }

    public static SMIMECapabilities getInstance(Object obj)
    {
        if (obj == null || (obj instanceof SMIMECapabilities))
        {
            return (SMIMECapabilities)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new SMIMECapabilities((ASN1Sequence)obj);
        }
        if (obj instanceof Attribute)
        {
            return new SMIMECapabilities((ASN1Sequence)(ASN1Sequence)((Attribute)obj).getAttrValues().getObjectAt(0));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object in factory: ").append(obj.getClass().getName()).toString());
        }
    }

    public Vector getCapabilities(ASN1ObjectIdentifier asn1objectidentifier)
    {
        Enumeration enumeration = capabilities.getObjects();
        Vector vector = new Vector();
        if (asn1objectidentifier == null)
        {
            for (; enumeration.hasMoreElements(); vector.addElement(SMIMECapability.getInstance(enumeration.nextElement()))) { }
        } else
        {
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break;
                }
                SMIMECapability smimecapability = SMIMECapability.getInstance(enumeration.nextElement());
                if (asn1objectidentifier.equals(smimecapability.getCapabilityID()))
                {
                    vector.addElement(smimecapability);
                }
            } while (true);
        }
        return vector;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return capabilities;
    }

    static 
    {
        preferSignedData = PKCSObjectIdentifiers.preferSignedData;
        canNotDecryptAny = PKCSObjectIdentifiers.canNotDecryptAny;
        sMIMECapabilitesVersions = PKCSObjectIdentifiers.sMIMECapabilitiesVersions;
        dES_EDE3_CBC = PKCSObjectIdentifiers.des_EDE3_CBC;
        rC2_CBC = PKCSObjectIdentifiers.RC2_CBC;
    }
}
