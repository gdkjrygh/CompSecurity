// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            ContentInfoParser, OriginatorInfo

public class AuthenticatedDataParser
{

    private ASN1Encodable nextObject;
    private boolean originatorInfoCalled;
    private ASN1SequenceParser seq;
    private ASN1Integer version;

    public AuthenticatedDataParser(ASN1SequenceParser asn1sequenceparser)
    {
        seq = asn1sequenceparser;
        version = ASN1Integer.getInstance(asn1sequenceparser.readObject());
    }

    public ASN1SetParser getAuthAttrs()
    {
        if (nextObject == null)
        {
            nextObject = seq.readObject();
        }
        if (nextObject instanceof ASN1TaggedObjectParser)
        {
            ASN1Encodable asn1encodable = nextObject;
            nextObject = null;
            return (ASN1SetParser)((ASN1TaggedObjectParser)asn1encodable).getObjectParser(17, false);
        } else
        {
            return null;
        }
    }

    public AlgorithmIdentifier getDigestAlgorithm()
    {
        if (nextObject == null)
        {
            nextObject = seq.readObject();
        }
        if (nextObject instanceof ASN1TaggedObjectParser)
        {
            AlgorithmIdentifier algorithmidentifier = AlgorithmIdentifier.getInstance((ASN1TaggedObject)nextObject.toASN1Primitive(), false);
            nextObject = null;
            return algorithmidentifier;
        } else
        {
            return null;
        }
    }

    public ContentInfoParser getEnapsulatedContentInfo()
    {
        if (nextObject == null)
        {
            nextObject = seq.readObject();
        }
        if (nextObject != null)
        {
            ASN1SequenceParser asn1sequenceparser = (ASN1SequenceParser)nextObject;
            nextObject = null;
            return new ContentInfoParser(asn1sequenceparser);
        } else
        {
            return null;
        }
    }

    public ASN1OctetString getMac()
    {
        if (nextObject == null)
        {
            nextObject = seq.readObject();
        }
        ASN1Encodable asn1encodable = nextObject;
        nextObject = null;
        return ASN1OctetString.getInstance(asn1encodable.toASN1Primitive());
    }

    public AlgorithmIdentifier getMacAlgorithm()
    {
        if (nextObject == null)
        {
            nextObject = seq.readObject();
        }
        if (nextObject != null)
        {
            ASN1SequenceParser asn1sequenceparser = (ASN1SequenceParser)nextObject;
            nextObject = null;
            return AlgorithmIdentifier.getInstance(asn1sequenceparser.toASN1Primitive());
        } else
        {
            return null;
        }
    }

    public OriginatorInfo getOriginatorInfo()
    {
        originatorInfoCalled = true;
        if (nextObject == null)
        {
            nextObject = seq.readObject();
        }
        if ((nextObject instanceof ASN1TaggedObjectParser) && ((ASN1TaggedObjectParser)nextObject).getTagNo() == 0)
        {
            ASN1SequenceParser asn1sequenceparser = (ASN1SequenceParser)((ASN1TaggedObjectParser)nextObject).getObjectParser(16, false);
            nextObject = null;
            return OriginatorInfo.getInstance(asn1sequenceparser.toASN1Primitive());
        } else
        {
            return null;
        }
    }

    public ASN1SetParser getRecipientInfos()
    {
        if (!originatorInfoCalled)
        {
            getOriginatorInfo();
        }
        if (nextObject == null)
        {
            nextObject = seq.readObject();
        }
        ASN1SetParser asn1setparser = (ASN1SetParser)nextObject;
        nextObject = null;
        return asn1setparser;
    }

    public ASN1SetParser getUnauthAttrs()
    {
        if (nextObject == null)
        {
            nextObject = seq.readObject();
        }
        if (nextObject != null)
        {
            ASN1Encodable asn1encodable = nextObject;
            nextObject = null;
            return (ASN1SetParser)((ASN1TaggedObjectParser)asn1encodable).getObjectParser(17, false);
        } else
        {
            return null;
        }
    }

    public ASN1Integer getVersion()
    {
        return version;
    }
}
