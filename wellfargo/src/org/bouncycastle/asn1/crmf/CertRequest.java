// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.crmf:
//            CertTemplate, Controls

public class CertRequest extends ASN1Object
{

    private ASN1Integer certReqId;
    private CertTemplate certTemplate;
    private Controls controls;

    public CertRequest(int i, CertTemplate certtemplate, Controls controls1)
    {
        this(new ASN1Integer(i), certtemplate, controls1);
    }

    public CertRequest(ASN1Integer asn1integer, CertTemplate certtemplate, Controls controls1)
    {
        certReqId = asn1integer;
        certTemplate = certtemplate;
        controls = controls1;
    }

    private CertRequest(ASN1Sequence asn1sequence)
    {
        certReqId = new ASN1Integer(ASN1Integer.getInstance(asn1sequence.getObjectAt(0)).getValue());
        certTemplate = CertTemplate.getInstance(asn1sequence.getObjectAt(1));
        if (asn1sequence.size() > 2)
        {
            controls = Controls.getInstance(asn1sequence.getObjectAt(2));
        }
    }

    public static CertRequest getInstance(Object obj)
    {
        if (obj instanceof CertRequest)
        {
            return (CertRequest)obj;
        }
        if (obj != null)
        {
            return new CertRequest(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Integer getCertReqId()
    {
        return certReqId;
    }

    public CertTemplate getCertTemplate()
    {
        return certTemplate;
    }

    public Controls getControls()
    {
        return controls;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(certReqId);
        asn1encodablevector.add(certTemplate);
        if (controls != null)
        {
            asn1encodablevector.add(controls);
        }
        return new DERSequence(asn1encodablevector);
    }
}
