// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            ContentInfoParser

public class SignedDataParser
{

    private boolean _certsCalled;
    private boolean _crlsCalled;
    private Object _nextObject;
    private ASN1SequenceParser _seq;
    private ASN1Integer _version;

    private SignedDataParser(ASN1SequenceParser asn1sequenceparser)
    {
        _seq = asn1sequenceparser;
        _version = (ASN1Integer)asn1sequenceparser.readObject();
    }

    public static SignedDataParser getInstance(Object obj)
    {
        if (obj instanceof ASN1Sequence)
        {
            return new SignedDataParser(((ASN1Sequence)obj).parser());
        }
        if (obj instanceof ASN1SequenceParser)
        {
            return new SignedDataParser((ASN1SequenceParser)obj);
        } else
        {
            throw new IOException((new StringBuilder()).append("unknown object encountered: ").append(obj.getClass().getName()).toString());
        }
    }

    public ASN1SetParser getCertificates()
    {
        _certsCalled = true;
        _nextObject = _seq.readObject();
        if ((_nextObject instanceof ASN1TaggedObjectParser) && ((ASN1TaggedObjectParser)_nextObject).getTagNo() == 0)
        {
            ASN1SetParser asn1setparser = (ASN1SetParser)((ASN1TaggedObjectParser)_nextObject).getObjectParser(17, false);
            _nextObject = null;
            return asn1setparser;
        } else
        {
            return null;
        }
    }

    public ASN1SetParser getCrls()
    {
        if (!_certsCalled)
        {
            throw new IOException("getCerts() has not been called.");
        }
        _crlsCalled = true;
        if (_nextObject == null)
        {
            _nextObject = _seq.readObject();
        }
        if ((_nextObject instanceof ASN1TaggedObjectParser) && ((ASN1TaggedObjectParser)_nextObject).getTagNo() == 1)
        {
            ASN1SetParser asn1setparser = (ASN1SetParser)((ASN1TaggedObjectParser)_nextObject).getObjectParser(17, false);
            _nextObject = null;
            return asn1setparser;
        } else
        {
            return null;
        }
    }

    public ASN1SetParser getDigestAlgorithms()
    {
        org.bouncycastle.asn1.ASN1Encodable asn1encodable = _seq.readObject();
        if (asn1encodable instanceof ASN1Set)
        {
            return ((ASN1Set)asn1encodable).parser();
        } else
        {
            return (ASN1SetParser)asn1encodable;
        }
    }

    public ContentInfoParser getEncapContentInfo()
    {
        return new ContentInfoParser((ASN1SequenceParser)_seq.readObject());
    }

    public ASN1SetParser getSignerInfos()
    {
        if (!_certsCalled || !_crlsCalled)
        {
            throw new IOException("getCerts() and/or getCrls() has not been called.");
        }
        if (_nextObject == null)
        {
            _nextObject = _seq.readObject();
        }
        return (ASN1SetParser)_nextObject;
    }

    public ASN1Integer getVersion()
    {
        return _version;
    }
}
