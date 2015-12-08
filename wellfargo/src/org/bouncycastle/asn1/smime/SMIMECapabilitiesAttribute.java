// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.smime;

import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cms.Attribute;

// Referenced classes of package org.bouncycastle.asn1.smime:
//            SMIMEAttributes, SMIMECapabilityVector

public class SMIMECapabilitiesAttribute extends Attribute
{

    public SMIMECapabilitiesAttribute(SMIMECapabilityVector smimecapabilityvector)
    {
        super(SMIMEAttributes.smimeCapabilities, new DERSet(new DERSequence(smimecapabilityvector.toASN1EncodableVector())));
    }
}
