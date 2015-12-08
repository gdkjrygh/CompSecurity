// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            Extension

public class Extensions extends ASN1Object
{

    private Hashtable extensions;
    private Vector ordering;

    private Extensions(ASN1Sequence asn1sequence)
    {
        extensions = new Hashtable();
        ordering = new Vector();
        asn1sequence = asn1sequence.getObjects();
        while (asn1sequence.hasMoreElements()) 
        {
            ASN1Sequence asn1sequence1 = ASN1Sequence.getInstance(asn1sequence.nextElement());
            if (asn1sequence1.size() == 3)
            {
                extensions.put(asn1sequence1.getObjectAt(0), new Extension(ASN1ObjectIdentifier.getInstance(asn1sequence1.getObjectAt(0)), ASN1Boolean.getInstance(asn1sequence1.getObjectAt(1)), ASN1OctetString.getInstance(asn1sequence1.getObjectAt(2))));
            } else
            if (asn1sequence1.size() == 2)
            {
                extensions.put(asn1sequence1.getObjectAt(0), new Extension(ASN1ObjectIdentifier.getInstance(asn1sequence1.getObjectAt(0)), false, ASN1OctetString.getInstance(asn1sequence1.getObjectAt(1))));
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence1.size()).toString());
            }
            ordering.addElement(asn1sequence1.getObjectAt(0));
        }
    }

    public Extensions(Extension extension)
    {
        extensions = new Hashtable();
        ordering = new Vector();
        ordering.addElement(extension.getExtnId());
        extensions.put(extension.getExtnId(), extension);
    }

    public Extensions(Extension aextension[])
    {
        extensions = new Hashtable();
        ordering = new Vector();
        for (int i = 0; i != aextension.length; i++)
        {
            Extension extension = aextension[i];
            ordering.addElement(extension.getExtnId());
            extensions.put(extension.getExtnId(), extension);
        }

    }

    private ASN1ObjectIdentifier[] getExtensionOIDs(boolean flag)
    {
        Vector vector = new Vector();
        for (int i = 0; i != ordering.size(); i++)
        {
            Object obj = ordering.elementAt(i);
            if (((Extension)extensions.get(obj)).isCritical() == flag)
            {
                vector.addElement(obj);
            }
        }

        return toOidArray(vector);
    }

    public static Extensions getInstance(Object obj)
    {
        if (obj instanceof Extensions)
        {
            return (Extensions)obj;
        }
        if (obj != null)
        {
            return new Extensions(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static Extensions getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    private ASN1ObjectIdentifier[] toOidArray(Vector vector)
    {
        ASN1ObjectIdentifier aasn1objectidentifier[] = new ASN1ObjectIdentifier[vector.size()];
        for (int i = 0; i != aasn1objectidentifier.length; i++)
        {
            aasn1objectidentifier[i] = (ASN1ObjectIdentifier)vector.elementAt(i);
        }

        return aasn1objectidentifier;
    }

    public boolean equivalent(Extensions extensions1)
    {
        if (extensions.size() != extensions1.extensions.size())
        {
            return false;
        }
        for (Enumeration enumeration = extensions.keys(); enumeration.hasMoreElements();)
        {
            Object obj = enumeration.nextElement();
            if (!extensions.get(obj).equals(extensions1.extensions.get(obj)))
            {
                return false;
            }
        }

        return true;
    }

    public ASN1ObjectIdentifier[] getCriticalExtensionOIDs()
    {
        return getExtensionOIDs(true);
    }

    public Extension getExtension(ASN1ObjectIdentifier asn1objectidentifier)
    {
        return (Extension)extensions.get(asn1objectidentifier);
    }

    public ASN1ObjectIdentifier[] getExtensionOIDs()
    {
        return toOidArray(ordering);
    }

    public ASN1Encodable getExtensionParsedValue(ASN1ObjectIdentifier asn1objectidentifier)
    {
        asn1objectidentifier = getExtension(asn1objectidentifier);
        if (asn1objectidentifier != null)
        {
            return asn1objectidentifier.getParsedValue();
        } else
        {
            return null;
        }
    }

    public ASN1ObjectIdentifier[] getNonCriticalExtensionOIDs()
    {
        return getExtensionOIDs(false);
    }

    public Enumeration oids()
    {
        return ordering.elements();
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        ASN1EncodableVector asn1encodablevector1;
        for (Enumeration enumeration = ordering.elements(); enumeration.hasMoreElements(); asn1encodablevector.add(new DERSequence(asn1encodablevector1)))
        {
            ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)enumeration.nextElement();
            Extension extension = (Extension)extensions.get(asn1objectidentifier);
            asn1encodablevector1 = new ASN1EncodableVector();
            asn1encodablevector1.add(asn1objectidentifier);
            if (extension.isCritical())
            {
                asn1encodablevector1.add(ASN1Boolean.getInstance(true));
            }
            asn1encodablevector1.add(extension.getExtnValue());
        }

        return new DERSequence(asn1encodablevector);
    }
}
