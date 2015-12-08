// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            PKIFreeText, InfoTypeAndValue

public class PKIHeader extends ASN1Object
{

    public static final int CMP_1999 = 1;
    public static final int CMP_2000 = 2;
    public static final GeneralName NULL_NAME = new GeneralName(X500Name.getInstance(new DERSequence()));
    private PKIFreeText freeText;
    private ASN1Sequence generalInfo;
    private DERGeneralizedTime messageTime;
    private AlgorithmIdentifier protectionAlg;
    private ASN1Integer pvno;
    private ASN1OctetString recipKID;
    private ASN1OctetString recipNonce;
    private GeneralName recipient;
    private GeneralName sender;
    private ASN1OctetString senderKID;
    private ASN1OctetString senderNonce;
    private ASN1OctetString transactionID;

    public PKIHeader(int i, GeneralName generalname, GeneralName generalname1)
    {
        this(new ASN1Integer(i), generalname, generalname1);
    }

    private PKIHeader(ASN1Integer asn1integer, GeneralName generalname, GeneralName generalname1)
    {
        pvno = asn1integer;
        sender = generalname;
        recipient = generalname1;
    }

    private PKIHeader(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        pvno = ASN1Integer.getInstance(asn1sequence.nextElement());
        sender = GeneralName.getInstance(asn1sequence.nextElement());
        recipient = GeneralName.getInstance(asn1sequence.nextElement());
        do
        {
            if (!asn1sequence.hasMoreElements())
            {
                break;
            }
            ASN1TaggedObject asn1taggedobject = (ASN1TaggedObject)asn1sequence.nextElement();
            switch (asn1taggedobject.getTagNo())
            {
            default:
                throw new IllegalArgumentException((new StringBuilder()).append("unknown tag number: ").append(asn1taggedobject.getTagNo()).toString());

            case 0: // '\0'
                messageTime = DERGeneralizedTime.getInstance(asn1taggedobject, true);
                break;

            case 1: // '\001'
                protectionAlg = AlgorithmIdentifier.getInstance(asn1taggedobject, true);
                break;

            case 2: // '\002'
                senderKID = ASN1OctetString.getInstance(asn1taggedobject, true);
                break;

            case 3: // '\003'
                recipKID = ASN1OctetString.getInstance(asn1taggedobject, true);
                break;

            case 4: // '\004'
                transactionID = ASN1OctetString.getInstance(asn1taggedobject, true);
                break;

            case 5: // '\005'
                senderNonce = ASN1OctetString.getInstance(asn1taggedobject, true);
                break;

            case 6: // '\006'
                recipNonce = ASN1OctetString.getInstance(asn1taggedobject, true);
                break;

            case 7: // '\007'
                freeText = PKIFreeText.getInstance(asn1taggedobject, true);
                break;

            case 8: // '\b'
                generalInfo = ASN1Sequence.getInstance(asn1taggedobject, true);
                break;
            }
        } while (true);
    }

    private void addOptional(ASN1EncodableVector asn1encodablevector, int i, ASN1Encodable asn1encodable)
    {
        if (asn1encodable != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, i, asn1encodable));
        }
    }

    public static PKIHeader getInstance(Object obj)
    {
        if (obj instanceof PKIHeader)
        {
            return (PKIHeader)obj;
        }
        if (obj != null)
        {
            return new PKIHeader(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public PKIFreeText getFreeText()
    {
        return freeText;
    }

    public InfoTypeAndValue[] getGeneralInfo()
    {
        if (generalInfo == null)
        {
            return null;
        }
        InfoTypeAndValue ainfotypeandvalue[] = new InfoTypeAndValue[generalInfo.size()];
        for (int i = 0; i < ainfotypeandvalue.length; i++)
        {
            ainfotypeandvalue[i] = InfoTypeAndValue.getInstance(generalInfo.getObjectAt(i));
        }

        return ainfotypeandvalue;
    }

    public DERGeneralizedTime getMessageTime()
    {
        return messageTime;
    }

    public AlgorithmIdentifier getProtectionAlg()
    {
        return protectionAlg;
    }

    public ASN1Integer getPvno()
    {
        return pvno;
    }

    public ASN1OctetString getRecipKID()
    {
        return recipKID;
    }

    public ASN1OctetString getRecipNonce()
    {
        return recipNonce;
    }

    public GeneralName getRecipient()
    {
        return recipient;
    }

    public GeneralName getSender()
    {
        return sender;
    }

    public ASN1OctetString getSenderKID()
    {
        return senderKID;
    }

    public ASN1OctetString getSenderNonce()
    {
        return senderNonce;
    }

    public ASN1OctetString getTransactionID()
    {
        return transactionID;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(pvno);
        asn1encodablevector.add(sender);
        asn1encodablevector.add(recipient);
        addOptional(asn1encodablevector, 0, messageTime);
        addOptional(asn1encodablevector, 1, protectionAlg);
        addOptional(asn1encodablevector, 2, senderKID);
        addOptional(asn1encodablevector, 3, recipKID);
        addOptional(asn1encodablevector, 4, transactionID);
        addOptional(asn1encodablevector, 5, senderNonce);
        addOptional(asn1encodablevector, 6, recipNonce);
        addOptional(asn1encodablevector, 7, freeText);
        addOptional(asn1encodablevector, 8, generalInfo);
        return new DERSequence(asn1encodablevector);
    }

}
