// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            Extension, Time, CRLReason, TBSCertList, 
//            Extensions, X509Name, AlgorithmIdentifier, X509Extensions

public class V2TBSCertListGenerator
{

    private static final ASN1Sequence reasons[];
    private ASN1EncodableVector crlentries;
    private Extensions extensions;
    private X500Name issuer;
    private Time nextUpdate;
    private AlgorithmIdentifier signature;
    private Time thisUpdate;
    private ASN1Integer version;

    public V2TBSCertListGenerator()
    {
        version = new ASN1Integer(1L);
        nextUpdate = null;
        extensions = null;
        crlentries = new ASN1EncodableVector();
    }

    private static ASN1Sequence createInvalidityDateExtension(Time time)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        try
        {
            asn1encodablevector.add(Extension.invalidityDate);
            asn1encodablevector.add(new DEROctetString(time.getEncoded()));
        }
        // Misplaced declaration of an exception variable
        catch (Time time)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("error encoding reason: ").append(time).toString());
        }
        return new DERSequence(asn1encodablevector);
    }

    private static ASN1Sequence createReasonExtension(int i)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        CRLReason crlreason = CRLReason.lookup(i);
        try
        {
            asn1encodablevector.add(Extension.reasonCode);
            asn1encodablevector.add(new DEROctetString(crlreason.getEncoded()));
        }
        catch (IOException ioexception)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("error encoding reason: ").append(ioexception).toString());
        }
        return new DERSequence(asn1encodablevector);
    }

    private void internalAddCRLEntry(ASN1Integer asn1integer, Time time, ASN1Sequence asn1sequence)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(asn1integer);
        asn1encodablevector.add(time);
        if (asn1sequence != null)
        {
            asn1encodablevector.add(asn1sequence);
        }
        addCRLEntry(new DERSequence(asn1encodablevector));
    }

    public void addCRLEntry(ASN1Integer asn1integer, ASN1UTCTime asn1utctime, int i)
    {
        addCRLEntry(asn1integer, new Time(asn1utctime), i);
    }

    public void addCRLEntry(ASN1Integer asn1integer, Time time, int i)
    {
        addCRLEntry(asn1integer, time, i, null);
    }

    public void addCRLEntry(ASN1Integer asn1integer, Time time, int i, ASN1GeneralizedTime asn1generalizedtime)
    {
        if (i != 0)
        {
            ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
            if (i < reasons.length)
            {
                if (i < 0)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("invalid reason value: ").append(i).toString());
                }
                asn1encodablevector.add(reasons[i]);
            } else
            {
                asn1encodablevector.add(createReasonExtension(i));
            }
            if (asn1generalizedtime != null)
            {
                asn1encodablevector.add(createInvalidityDateExtension(time));
            }
            internalAddCRLEntry(asn1integer, time, new DERSequence(asn1encodablevector));
            return;
        }
        if (asn1generalizedtime != null)
        {
            asn1generalizedtime = new ASN1EncodableVector();
            asn1generalizedtime.add(createInvalidityDateExtension(time));
            internalAddCRLEntry(asn1integer, time, new DERSequence(asn1generalizedtime));
            return;
        } else
        {
            addCRLEntry(asn1integer, time, ((Extensions) (null)));
            return;
        }
    }

    public void addCRLEntry(ASN1Integer asn1integer, Time time, Extensions extensions1)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(asn1integer);
        asn1encodablevector.add(time);
        if (extensions1 != null)
        {
            asn1encodablevector.add(extensions1);
        }
        addCRLEntry(((ASN1Sequence) (new DERSequence(asn1encodablevector))));
    }

    public void addCRLEntry(ASN1Sequence asn1sequence)
    {
        crlentries.add(asn1sequence);
    }

    public TBSCertList generateTBSCertList()
    {
        if (signature == null || issuer == null || thisUpdate == null)
        {
            throw new IllegalStateException("Not all mandatory fields set in V2 TBSCertList generator.");
        }
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(version);
        asn1encodablevector.add(signature);
        asn1encodablevector.add(issuer);
        asn1encodablevector.add(thisUpdate);
        if (nextUpdate != null)
        {
            asn1encodablevector.add(nextUpdate);
        }
        if (crlentries.size() != 0)
        {
            asn1encodablevector.add(new DERSequence(crlentries));
        }
        if (extensions != null)
        {
            asn1encodablevector.add(new DERTaggedObject(0, extensions));
        }
        return new TBSCertList(new DERSequence(asn1encodablevector));
    }

    public void setExtensions(Extensions extensions1)
    {
        extensions = extensions1;
    }

    public void setExtensions(X509Extensions x509extensions)
    {
        setExtensions(Extensions.getInstance(x509extensions));
    }

    public void setIssuer(X500Name x500name)
    {
        issuer = x500name;
    }

    public void setIssuer(X509Name x509name)
    {
        issuer = X500Name.getInstance(x509name.toASN1Primitive());
    }

    public void setNextUpdate(ASN1UTCTime asn1utctime)
    {
        nextUpdate = new Time(asn1utctime);
    }

    public void setNextUpdate(Time time)
    {
        nextUpdate = time;
    }

    public void setSignature(AlgorithmIdentifier algorithmidentifier)
    {
        signature = algorithmidentifier;
    }

    public void setThisUpdate(ASN1UTCTime asn1utctime)
    {
        thisUpdate = new Time(asn1utctime);
    }

    public void setThisUpdate(Time time)
    {
        thisUpdate = time;
    }

    static 
    {
        reasons = new ASN1Sequence[11];
        reasons[0] = createReasonExtension(0);
        reasons[1] = createReasonExtension(1);
        reasons[2] = createReasonExtension(2);
        reasons[3] = createReasonExtension(3);
        reasons[4] = createReasonExtension(4);
        reasons[5] = createReasonExtension(5);
        reasons[6] = createReasonExtension(6);
        reasons[7] = createReasonExtension(7);
        reasons[8] = createReasonExtension(8);
        reasons[9] = createReasonExtension(9);
        reasons[10] = createReasonExtension(10);
    }
}
