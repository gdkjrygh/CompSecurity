// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            DistributionPointName, ReasonFlags, GeneralNames

public class DistributionPoint extends ASN1Object
{

    GeneralNames cRLIssuer;
    DistributionPointName distributionPoint;
    ReasonFlags reasons;

    public DistributionPoint(ASN1Sequence asn1sequence)
    {
        int i;
        i = 0;
_L6:
        ASN1TaggedObject asn1taggedobject;
        if (i == asn1sequence.size())
        {
            break MISSING_BLOCK_LABEL_102;
        }
        asn1taggedobject = ASN1TaggedObject.getInstance(asn1sequence.getObjectAt(i));
        asn1taggedobject.getTagNo();
        JVM INSTR tableswitch 0 2: default 52
    //                   0 59
    //                   1 71
    //                   2 90;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_90;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L7:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        distributionPoint = DistributionPointName.getInstance(asn1taggedobject, true);
          goto _L7
_L3:
        reasons = new ReasonFlags(DERBitString.getInstance(asn1taggedobject, false));
          goto _L7
        cRLIssuer = GeneralNames.getInstance(asn1taggedobject, false);
          goto _L7
    }

    public DistributionPoint(DistributionPointName distributionpointname, ReasonFlags reasonflags, GeneralNames generalnames)
    {
        distributionPoint = distributionpointname;
        reasons = reasonflags;
        cRLIssuer = generalnames;
    }

    private void appendObject(StringBuffer stringbuffer, String s, String s1, String s2)
    {
        stringbuffer.append("    ");
        stringbuffer.append(s1);
        stringbuffer.append(":");
        stringbuffer.append(s);
        stringbuffer.append("    ");
        stringbuffer.append("    ");
        stringbuffer.append(s2);
        stringbuffer.append(s);
    }

    public static DistributionPoint getInstance(Object obj)
    {
        if (obj == null || (obj instanceof DistributionPoint))
        {
            return (DistributionPoint)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new DistributionPoint((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid DistributionPoint: ").append(obj.getClass().getName()).toString());
        }
    }

    public static DistributionPoint getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public GeneralNames getCRLIssuer()
    {
        return cRLIssuer;
    }

    public DistributionPointName getDistributionPoint()
    {
        return distributionPoint;
    }

    public ReasonFlags getReasons()
    {
        return reasons;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (distributionPoint != null)
        {
            asn1encodablevector.add(new DERTaggedObject(0, distributionPoint));
        }
        if (reasons != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 1, reasons));
        }
        if (cRLIssuer != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 2, cRLIssuer));
        }
        return new DERSequence(asn1encodablevector);
    }

    public String toString()
    {
        String s = System.getProperty("line.separator");
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("DistributionPoint: [");
        stringbuffer.append(s);
        if (distributionPoint != null)
        {
            appendObject(stringbuffer, s, "distributionPoint", distributionPoint.toString());
        }
        if (reasons != null)
        {
            appendObject(stringbuffer, s, "reasons", reasons.toString());
        }
        if (cRLIssuer != null)
        {
            appendObject(stringbuffer, s, "cRLIssuer", cRLIssuer.toString());
        }
        stringbuffer.append("]");
        stringbuffer.append(s);
        return stringbuffer.toString();
    }
}
