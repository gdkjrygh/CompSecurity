// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;

import java.util.Date;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.ocsp.CertStatus;
import org.bouncycastle.asn1.ocsp.RevokedInfo;
import org.bouncycastle.asn1.ocsp.SingleResponse;
import org.bouncycastle.asn1.x509.CRLReason;
import org.bouncycastle.asn1.x509.X509Extensions;

// Referenced classes of package org.bouncycastle.ocsp:
//            UnknownStatus, RevokedStatus, CertificateID, BasicOCSPRespGenerator, 
//            CertificateStatus

class extensions
{

    CertificateID certId;
    CertStatus certStatus;
    X509Extensions extensions;
    DERGeneralizedTime nextUpdate;
    final BasicOCSPRespGenerator this$0;
    DERGeneralizedTime thisUpdate;

    public SingleResponse toResponse()
    {
        return new SingleResponse(certId.toASN1Object(), certStatus, thisUpdate, nextUpdate, extensions);
    }

    public A(CertificateID certificateid, CertificateStatus certificatestatus, Date date, Date date1, X509Extensions x509extensions)
    {
        this$0 = BasicOCSPRespGenerator.this;
        super();
        certId = certificateid;
        if (certificatestatus == null)
        {
            certStatus = new CertStatus();
        } else
        if (certificatestatus instanceof UnknownStatus)
        {
            certStatus = new CertStatus(2, DERNull.INSTANCE);
        } else
        {
            basicocsprespgenerator = (RevokedStatus)certificatestatus;
            if (hasRevocationReason())
            {
                certStatus = new CertStatus(new RevokedInfo(new ASN1GeneralizedTime(getRevocationTime()), CRLReason.lookup(getRevocationReason())));
            } else
            {
                certStatus = new CertStatus(new RevokedInfo(new ASN1GeneralizedTime(getRevocationTime()), null));
            }
        }
        thisUpdate = new DERGeneralizedTime(date);
        if (date1 != null)
        {
            nextUpdate = new DERGeneralizedTime(date1);
        } else
        {
            nextUpdate = null;
        }
        extensions = x509extensions;
    }
}
