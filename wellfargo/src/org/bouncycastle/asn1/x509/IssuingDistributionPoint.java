// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            DistributionPointName, ReasonFlags

public class IssuingDistributionPoint extends ASN1Object
{

    private DistributionPointName distributionPoint;
    private boolean indirectCRL;
    private boolean onlyContainsAttributeCerts;
    private boolean onlyContainsCACerts;
    private boolean onlyContainsUserCerts;
    private ReasonFlags onlySomeReasons;
    private ASN1Sequence seq;

    private IssuingDistributionPoint(ASN1Sequence asn1sequence)
    {
        int i;
        seq = asn1sequence;
        i = 0;
_L9:
        ASN1TaggedObject asn1taggedobject;
        if (i == asn1sequence.size())
        {
            break MISSING_BLOCK_LABEL_177;
        }
        asn1taggedobject = ASN1TaggedObject.getInstance(asn1sequence.getObjectAt(i));
        asn1taggedobject.getTagNo();
        JVM INSTR tableswitch 0 5: default 72
    //                   0 82
    //                   1 98
    //                   2 113
    //                   3 128
    //                   4 147
    //                   5 162;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_162;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
_L2:
        distributionPoint = DistributionPointName.getInstance(asn1taggedobject, true);
_L10:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
        onlyContainsUserCerts = ASN1Boolean.getInstance(asn1taggedobject, false).isTrue();
          goto _L10
_L4:
        onlyContainsCACerts = ASN1Boolean.getInstance(asn1taggedobject, false).isTrue();
          goto _L10
_L5:
        onlySomeReasons = new ReasonFlags(ReasonFlags.getInstance(asn1taggedobject, false));
          goto _L10
_L6:
        indirectCRL = ASN1Boolean.getInstance(asn1taggedobject, false).isTrue();
          goto _L10
        onlyContainsAttributeCerts = ASN1Boolean.getInstance(asn1taggedobject, false).isTrue();
          goto _L10
    }

    public IssuingDistributionPoint(DistributionPointName distributionpointname, boolean flag, boolean flag1)
    {
        this(distributionpointname, false, false, null, flag, flag1);
    }

    public IssuingDistributionPoint(DistributionPointName distributionpointname, boolean flag, boolean flag1, ReasonFlags reasonflags, boolean flag2, boolean flag3)
    {
        distributionPoint = distributionpointname;
        indirectCRL = flag2;
        onlyContainsAttributeCerts = flag3;
        onlyContainsCACerts = flag1;
        onlyContainsUserCerts = flag;
        onlySomeReasons = reasonflags;
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (distributionpointname != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, distributionpointname));
        }
        if (flag)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 1, ASN1Boolean.getInstance(true)));
        }
        if (flag1)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 2, ASN1Boolean.getInstance(true)));
        }
        if (reasonflags != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 3, reasonflags));
        }
        if (flag2)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 4, ASN1Boolean.getInstance(true)));
        }
        if (flag3)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 5, ASN1Boolean.getInstance(true)));
        }
        seq = new DERSequence(asn1encodablevector);
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

    private String booleanToString(boolean flag)
    {
        if (flag)
        {
            return "true";
        } else
        {
            return "false";
        }
    }

    public static IssuingDistributionPoint getInstance(Object obj)
    {
        if (obj instanceof IssuingDistributionPoint)
        {
            return (IssuingDistributionPoint)obj;
        }
        if (obj != null)
        {
            return new IssuingDistributionPoint(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static IssuingDistributionPoint getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public DistributionPointName getDistributionPoint()
    {
        return distributionPoint;
    }

    public ReasonFlags getOnlySomeReasons()
    {
        return onlySomeReasons;
    }

    public boolean isIndirectCRL()
    {
        return indirectCRL;
    }

    public boolean onlyContainsAttributeCerts()
    {
        return onlyContainsAttributeCerts;
    }

    public boolean onlyContainsCACerts()
    {
        return onlyContainsCACerts;
    }

    public boolean onlyContainsUserCerts()
    {
        return onlyContainsUserCerts;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return seq;
    }

    public String toString()
    {
        String s = System.getProperty("line.separator");
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("IssuingDistributionPoint: [");
        stringbuffer.append(s);
        if (distributionPoint != null)
        {
            appendObject(stringbuffer, s, "distributionPoint", distributionPoint.toString());
        }
        if (onlyContainsUserCerts)
        {
            appendObject(stringbuffer, s, "onlyContainsUserCerts", booleanToString(onlyContainsUserCerts));
        }
        if (onlyContainsCACerts)
        {
            appendObject(stringbuffer, s, "onlyContainsCACerts", booleanToString(onlyContainsCACerts));
        }
        if (onlySomeReasons != null)
        {
            appendObject(stringbuffer, s, "onlySomeReasons", onlySomeReasons.toString());
        }
        if (onlyContainsAttributeCerts)
        {
            appendObject(stringbuffer, s, "onlyContainsAttributeCerts", booleanToString(onlyContainsAttributeCerts));
        }
        if (indirectCRL)
        {
            appendObject(stringbuffer, s, "indirectCRL", booleanToString(indirectCRL));
        }
        stringbuffer.append("]");
        stringbuffer.append(s);
        return stringbuffer.toString();
    }
}
