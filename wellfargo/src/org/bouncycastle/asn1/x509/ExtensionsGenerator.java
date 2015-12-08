// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            Extension, Extensions

public class ExtensionsGenerator
{

    private Vector extOrdering;
    private Hashtable extensions;

    public ExtensionsGenerator()
    {
        extensions = new Hashtable();
        extOrdering = new Vector();
    }

    public void addExtension(ASN1ObjectIdentifier asn1objectidentifier, boolean flag, ASN1Encodable asn1encodable)
    {
        addExtension(asn1objectidentifier, flag, asn1encodable.toASN1Primitive().getEncoded("DER"));
    }

    public void addExtension(ASN1ObjectIdentifier asn1objectidentifier, boolean flag, byte abyte0[])
    {
        if (extensions.containsKey(asn1objectidentifier))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("extension ").append(asn1objectidentifier).append(" already added").toString());
        } else
        {
            extOrdering.addElement(asn1objectidentifier);
            extensions.put(asn1objectidentifier, new Extension(asn1objectidentifier, flag, new DEROctetString(abyte0)));
            return;
        }
    }

    public Extensions generate()
    {
        Extension aextension[] = new Extension[extOrdering.size()];
        for (int i = 0; i != extOrdering.size(); i++)
        {
            aextension[i] = (Extension)extensions.get(extOrdering.elementAt(i));
        }

        return new Extensions(aextension);
    }

    public boolean isEmpty()
    {
        return extOrdering.isEmpty();
    }

    public void reset()
    {
        extensions = new Hashtable();
        extOrdering = new Vector();
    }
}
