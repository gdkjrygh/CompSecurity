// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            PKIHeader, PKIFreeText, InfoTypeAndValue

public class PKIHeaderBuilder
{

    private PKIFreeText freeText;
    private ASN1Sequence generalInfo;
    private ASN1GeneralizedTime messageTime;
    private AlgorithmIdentifier protectionAlg;
    private ASN1Integer pvno;
    private ASN1OctetString recipKID;
    private ASN1OctetString recipNonce;
    private GeneralName recipient;
    private GeneralName sender;
    private ASN1OctetString senderKID;
    private ASN1OctetString senderNonce;
    private ASN1OctetString transactionID;

    public PKIHeaderBuilder(int i, GeneralName generalname, GeneralName generalname1)
    {
        this(new ASN1Integer(i), generalname, generalname1);
    }

    private PKIHeaderBuilder(ASN1Integer asn1integer, GeneralName generalname, GeneralName generalname1)
    {
        pvno = asn1integer;
        sender = generalname;
        recipient = generalname1;
    }

    private void addOptional(ASN1EncodableVector asn1encodablevector, int i, ASN1Encodable asn1encodable)
    {
        if (asn1encodable != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, i, asn1encodable));
        }
    }

    private static ASN1Sequence makeGeneralInfoSeq(InfoTypeAndValue infotypeandvalue)
    {
        return new DERSequence(infotypeandvalue);
    }

    private static ASN1Sequence makeGeneralInfoSeq(InfoTypeAndValue ainfotypeandvalue[])
    {
        Object obj = null;
        if (ainfotypeandvalue != null)
        {
            obj = new ASN1EncodableVector();
            for (int i = 0; i < ainfotypeandvalue.length; i++)
            {
                ((ASN1EncodableVector) (obj)).add(ainfotypeandvalue[i]);
            }

            obj = new DERSequence(((ASN1EncodableVector) (obj)));
        }
        return ((ASN1Sequence) (obj));
    }

    public PKIHeader build()
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
        messageTime = null;
        protectionAlg = null;
        senderKID = null;
        recipKID = null;
        transactionID = null;
        senderNonce = null;
        recipNonce = null;
        freeText = null;
        generalInfo = null;
        return PKIHeader.getInstance(new DERSequence(asn1encodablevector));
    }

    public PKIHeaderBuilder setFreeText(PKIFreeText pkifreetext)
    {
        freeText = pkifreetext;
        return this;
    }

    public PKIHeaderBuilder setGeneralInfo(ASN1Sequence asn1sequence)
    {
        generalInfo = asn1sequence;
        return this;
    }

    public PKIHeaderBuilder setGeneralInfo(InfoTypeAndValue infotypeandvalue)
    {
        return setGeneralInfo(makeGeneralInfoSeq(infotypeandvalue));
    }

    public PKIHeaderBuilder setGeneralInfo(InfoTypeAndValue ainfotypeandvalue[])
    {
        return setGeneralInfo(makeGeneralInfoSeq(ainfotypeandvalue));
    }

    public PKIHeaderBuilder setMessageTime(ASN1GeneralizedTime asn1generalizedtime)
    {
        messageTime = asn1generalizedtime;
        return this;
    }

    public PKIHeaderBuilder setMessageTime(DERGeneralizedTime dergeneralizedtime)
    {
        messageTime = ASN1GeneralizedTime.getInstance(dergeneralizedtime);
        return this;
    }

    public PKIHeaderBuilder setProtectionAlg(AlgorithmIdentifier algorithmidentifier)
    {
        protectionAlg = algorithmidentifier;
        return this;
    }

    public PKIHeaderBuilder setRecipKID(DEROctetString deroctetstring)
    {
        recipKID = deroctetstring;
        return this;
    }

    public PKIHeaderBuilder setRecipKID(byte abyte0[])
    {
        if (abyte0 == null)
        {
            abyte0 = null;
        } else
        {
            abyte0 = new DEROctetString(abyte0);
        }
        return setRecipKID(((DEROctetString) (abyte0)));
    }

    public PKIHeaderBuilder setRecipNonce(ASN1OctetString asn1octetstring)
    {
        recipNonce = asn1octetstring;
        return this;
    }

    public PKIHeaderBuilder setRecipNonce(byte abyte0[])
    {
        if (abyte0 == null)
        {
            abyte0 = null;
        } else
        {
            abyte0 = new DEROctetString(abyte0);
        }
        return setRecipNonce(((ASN1OctetString) (abyte0)));
    }

    public PKIHeaderBuilder setSenderKID(ASN1OctetString asn1octetstring)
    {
        senderKID = asn1octetstring;
        return this;
    }

    public PKIHeaderBuilder setSenderKID(byte abyte0[])
    {
        if (abyte0 == null)
        {
            abyte0 = null;
        } else
        {
            abyte0 = new DEROctetString(abyte0);
        }
        return setSenderKID(((ASN1OctetString) (abyte0)));
    }

    public PKIHeaderBuilder setSenderNonce(ASN1OctetString asn1octetstring)
    {
        senderNonce = asn1octetstring;
        return this;
    }

    public PKIHeaderBuilder setSenderNonce(byte abyte0[])
    {
        if (abyte0 == null)
        {
            abyte0 = null;
        } else
        {
            abyte0 = new DEROctetString(abyte0);
        }
        return setSenderNonce(((ASN1OctetString) (abyte0)));
    }

    public PKIHeaderBuilder setTransactionID(ASN1OctetString asn1octetstring)
    {
        transactionID = asn1octetstring;
        return this;
    }

    public PKIHeaderBuilder setTransactionID(byte abyte0[])
    {
        if (abyte0 == null)
        {
            abyte0 = null;
        } else
        {
            abyte0 = new DEROctetString(abyte0);
        }
        return setTransactionID(((ASN1OctetString) (abyte0)));
    }
}
