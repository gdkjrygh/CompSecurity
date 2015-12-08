// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.crmf.CertId;
import org.bouncycastle.asn1.x509.CertificateList;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            PKIStatusInfo

public class RevRepContent extends ASN1Object
{

    private ASN1Sequence crls;
    private ASN1Sequence revCerts;
    private ASN1Sequence status;

    private RevRepContent(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        status = ASN1Sequence.getInstance(asn1sequence.nextElement());
        while (asn1sequence.hasMoreElements()) 
        {
            ASN1TaggedObject asn1taggedobject = ASN1TaggedObject.getInstance(asn1sequence.nextElement());
            if (asn1taggedobject.getTagNo() == 0)
            {
                revCerts = ASN1Sequence.getInstance(asn1taggedobject, true);
            } else
            {
                crls = ASN1Sequence.getInstance(asn1taggedobject, true);
            }
        }
    }

    private void addOptional(ASN1EncodableVector asn1encodablevector, int i, ASN1Encodable asn1encodable)
    {
        if (asn1encodable != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, i, asn1encodable));
        }
    }

    public static RevRepContent getInstance(Object obj)
    {
        if (obj instanceof RevRepContent)
        {
            return (RevRepContent)obj;
        }
        if (obj != null)
        {
            return new RevRepContent(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public CertificateList[] getCrls()
    {
        if (crls == null)
        {
            return null;
        }
        CertificateList acertificatelist[] = new CertificateList[crls.size()];
        for (int i = 0; i != acertificatelist.length; i++)
        {
            acertificatelist[i] = CertificateList.getInstance(crls.getObjectAt(i));
        }

        return acertificatelist;
    }

    public CertId[] getRevCerts()
    {
        if (revCerts == null)
        {
            return null;
        }
        CertId acertid[] = new CertId[revCerts.size()];
        for (int i = 0; i != acertid.length; i++)
        {
            acertid[i] = CertId.getInstance(revCerts.getObjectAt(i));
        }

        return acertid;
    }

    public PKIStatusInfo[] getStatus()
    {
        PKIStatusInfo apkistatusinfo[] = new PKIStatusInfo[status.size()];
        for (int i = 0; i != apkistatusinfo.length; i++)
        {
            apkistatusinfo[i] = PKIStatusInfo.getInstance(status.getObjectAt(i));
        }

        return apkistatusinfo;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(status);
        addOptional(asn1encodablevector, 0, revCerts);
        addOptional(asn1encodablevector, 1, crls);
        return new DERSequence(asn1encodablevector);
    }
}
