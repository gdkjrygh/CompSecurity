// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            GeneralName

public class Target extends ASN1Object
    implements ASN1Choice
{

    public static final int targetGroup = 1;
    public static final int targetName = 0;
    private GeneralName targGroup;
    private GeneralName targName;

    public Target(int i, GeneralName generalname)
    {
        this(((ASN1TaggedObject) (new DERTaggedObject(i, generalname))));
    }

    private Target(ASN1TaggedObject asn1taggedobject)
    {
        switch (asn1taggedobject.getTagNo())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("unknown tag: ").append(asn1taggedobject.getTagNo()).toString());

        case 0: // '\0'
            targName = GeneralName.getInstance(asn1taggedobject, true);
            return;

        case 1: // '\001'
            targGroup = GeneralName.getInstance(asn1taggedobject, true);
            break;
        }
    }

    public static Target getInstance(Object obj)
    {
        if (obj == null || (obj instanceof Target))
        {
            return (Target)obj;
        }
        if (obj instanceof ASN1TaggedObject)
        {
            return new Target((ASN1TaggedObject)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object in factory: ").append(obj.getClass()).toString());
        }
    }

    public GeneralName getTargetGroup()
    {
        return targGroup;
    }

    public GeneralName getTargetName()
    {
        return targName;
    }

    public ASN1Primitive toASN1Primitive()
    {
        if (targName != null)
        {
            return new DERTaggedObject(true, 0, targName);
        } else
        {
            return new DERTaggedObject(true, 1, targGroup);
        }
    }
}
