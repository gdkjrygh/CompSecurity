// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            V2Form, GeneralNames

public class AttCertIssuer extends ASN1Object
    implements ASN1Choice
{

    ASN1Primitive choiceObj;
    ASN1Encodable obj;

    public AttCertIssuer(GeneralNames generalnames)
    {
        obj = generalnames;
        choiceObj = obj.toASN1Primitive();
    }

    public AttCertIssuer(V2Form v2form)
    {
        obj = v2form;
        choiceObj = new DERTaggedObject(false, 0, obj);
    }

    public static AttCertIssuer getInstance(Object obj1)
    {
        if (obj1 == null || (obj1 instanceof AttCertIssuer))
        {
            return (AttCertIssuer)obj1;
        }
        if (obj1 instanceof V2Form)
        {
            return new AttCertIssuer(V2Form.getInstance(obj1));
        }
        if (obj1 instanceof GeneralNames)
        {
            return new AttCertIssuer((GeneralNames)obj1);
        }
        if (obj1 instanceof ASN1TaggedObject)
        {
            return new AttCertIssuer(V2Form.getInstance((ASN1TaggedObject)obj1, false));
        }
        if (obj1 instanceof ASN1Sequence)
        {
            return new AttCertIssuer(GeneralNames.getInstance(obj1));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object in factory: ").append(obj1.getClass().getName()).toString());
        }
    }

    public static AttCertIssuer getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(asn1taggedobject.getObject());
    }

    public ASN1Encodable getIssuer()
    {
        return obj;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return choiceObj;
    }
}
