// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.crmf.CertReqMessages;
import org.bouncycastle.asn1.pkcs.CertificationRequest;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            CertRepMessage, POPODecKeyChallContent, POPODecKeyRespContent, KeyRecRepContent, 
//            RevReqContent, RevRepContent, CAKeyUpdAnnContent, CMPCertificate, 
//            RevAnnContent, CRLAnnContent, PKIConfirmContent, PKIMessages, 
//            GenMsgContent, GenRepContent, ErrorMsgContent, CertConfirmContent, 
//            PollReqContent, PollRepContent

public class PKIBody extends ASN1Object
    implements ASN1Choice
{

    public static final int TYPE_CA_KEY_UPDATE_ANN = 15;
    public static final int TYPE_CERT_ANN = 16;
    public static final int TYPE_CERT_CONFIRM = 24;
    public static final int TYPE_CERT_REP = 3;
    public static final int TYPE_CERT_REQ = 2;
    public static final int TYPE_CONFIRM = 19;
    public static final int TYPE_CRL_ANN = 18;
    public static final int TYPE_CROSS_CERT_REP = 14;
    public static final int TYPE_CROSS_CERT_REQ = 13;
    public static final int TYPE_ERROR = 23;
    public static final int TYPE_GEN_MSG = 21;
    public static final int TYPE_GEN_REP = 22;
    public static final int TYPE_INIT_REP = 1;
    public static final int TYPE_INIT_REQ = 0;
    public static final int TYPE_KEY_RECOVERY_REP = 10;
    public static final int TYPE_KEY_RECOVERY_REQ = 9;
    public static final int TYPE_KEY_UPDATE_REP = 8;
    public static final int TYPE_KEY_UPDATE_REQ = 7;
    public static final int TYPE_NESTED = 20;
    public static final int TYPE_P10_CERT_REQ = 4;
    public static final int TYPE_POLL_REP = 26;
    public static final int TYPE_POLL_REQ = 25;
    public static final int TYPE_POPO_CHALL = 5;
    public static final int TYPE_POPO_REP = 6;
    public static final int TYPE_REVOCATION_ANN = 17;
    public static final int TYPE_REVOCATION_REP = 12;
    public static final int TYPE_REVOCATION_REQ = 11;
    private ASN1Encodable body;
    private int tagNo;

    public PKIBody(int i, ASN1Encodable asn1encodable)
    {
        tagNo = i;
        body = getBodyForType(i, asn1encodable);
    }

    private PKIBody(ASN1TaggedObject asn1taggedobject)
    {
        tagNo = asn1taggedobject.getTagNo();
        body = getBodyForType(tagNo, asn1taggedobject.getObject());
    }

    private static ASN1Encodable getBodyForType(int i, ASN1Encodable asn1encodable)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("unknown tag number: ").append(i).toString());

        case 0: // '\0'
            return CertReqMessages.getInstance(asn1encodable);

        case 1: // '\001'
            return CertRepMessage.getInstance(asn1encodable);

        case 2: // '\002'
            return CertReqMessages.getInstance(asn1encodable);

        case 3: // '\003'
            return CertRepMessage.getInstance(asn1encodable);

        case 4: // '\004'
            return CertificationRequest.getInstance(asn1encodable);

        case 5: // '\005'
            return POPODecKeyChallContent.getInstance(asn1encodable);

        case 6: // '\006'
            return POPODecKeyRespContent.getInstance(asn1encodable);

        case 7: // '\007'
            return CertReqMessages.getInstance(asn1encodable);

        case 8: // '\b'
            return CertRepMessage.getInstance(asn1encodable);

        case 9: // '\t'
            return CertReqMessages.getInstance(asn1encodable);

        case 10: // '\n'
            return KeyRecRepContent.getInstance(asn1encodable);

        case 11: // '\013'
            return RevReqContent.getInstance(asn1encodable);

        case 12: // '\f'
            return RevRepContent.getInstance(asn1encodable);

        case 13: // '\r'
            return CertReqMessages.getInstance(asn1encodable);

        case 14: // '\016'
            return CertRepMessage.getInstance(asn1encodable);

        case 15: // '\017'
            return CAKeyUpdAnnContent.getInstance(asn1encodable);

        case 16: // '\020'
            return CMPCertificate.getInstance(asn1encodable);

        case 17: // '\021'
            return RevAnnContent.getInstance(asn1encodable);

        case 18: // '\022'
            return CRLAnnContent.getInstance(asn1encodable);

        case 19: // '\023'
            return PKIConfirmContent.getInstance(asn1encodable);

        case 20: // '\024'
            return PKIMessages.getInstance(asn1encodable);

        case 21: // '\025'
            return GenMsgContent.getInstance(asn1encodable);

        case 22: // '\026'
            return GenRepContent.getInstance(asn1encodable);

        case 23: // '\027'
            return ErrorMsgContent.getInstance(asn1encodable);

        case 24: // '\030'
            return CertConfirmContent.getInstance(asn1encodable);

        case 25: // '\031'
            return PollReqContent.getInstance(asn1encodable);

        case 26: // '\032'
            return PollRepContent.getInstance(asn1encodable);
        }
    }

    public static PKIBody getInstance(Object obj)
    {
        if (obj == null || (obj instanceof PKIBody))
        {
            return (PKIBody)obj;
        }
        if (obj instanceof ASN1TaggedObject)
        {
            return new PKIBody((ASN1TaggedObject)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid object: ").append(obj.getClass().getName()).toString());
        }
    }

    public ASN1Encodable getContent()
    {
        return body;
    }

    public int getType()
    {
        return tagNo;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return new DERTaggedObject(true, tagNo, body);
    }
}
