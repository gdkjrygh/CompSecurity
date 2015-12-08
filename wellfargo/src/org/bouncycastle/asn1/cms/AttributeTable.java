// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSet;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            Attribute, Attributes

public class AttributeTable
{

    private Hashtable attributes;

    public AttributeTable(Hashtable hashtable)
    {
        attributes = new Hashtable();
        attributes = copyTable(hashtable);
    }

    public AttributeTable(ASN1EncodableVector asn1encodablevector)
    {
        attributes = new Hashtable();
        for (int i = 0; i != asn1encodablevector.size(); i++)
        {
            Attribute attribute = Attribute.getInstance(asn1encodablevector.get(i));
            addAttribute(attribute.getAttrType(), attribute);
        }

    }

    public AttributeTable(ASN1Set asn1set)
    {
        attributes = new Hashtable();
        for (int i = 0; i != asn1set.size(); i++)
        {
            Attribute attribute = Attribute.getInstance(asn1set.getObjectAt(i));
            addAttribute(attribute.getAttrType(), attribute);
        }

    }

    public AttributeTable(Attribute attribute)
    {
        attributes = new Hashtable();
        addAttribute(attribute.getAttrType(), attribute);
    }

    public AttributeTable(Attributes attributes1)
    {
        this(ASN1Set.getInstance(attributes1.toASN1Primitive()));
    }

    private void addAttribute(ASN1ObjectIdentifier asn1objectidentifier, Attribute attribute)
    {
        Object obj = attributes.get(asn1objectidentifier);
        if (obj == null)
        {
            attributes.put(asn1objectidentifier, attribute);
            return;
        }
        if (obj instanceof Attribute)
        {
            Vector vector = new Vector();
            vector.addElement(obj);
            vector.addElement(attribute);
            attribute = vector;
        } else
        {
            Vector vector1 = (Vector)obj;
            vector1.addElement(attribute);
            attribute = vector1;
        }
        attributes.put(asn1objectidentifier, attribute);
    }

    private Hashtable copyTable(Hashtable hashtable)
    {
        Hashtable hashtable1 = new Hashtable();
        Object obj;
        for (Enumeration enumeration = hashtable.keys(); enumeration.hasMoreElements(); hashtable1.put(obj, hashtable.get(obj)))
        {
            obj = enumeration.nextElement();
        }

        return hashtable1;
    }

    public AttributeTable add(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        AttributeTable attributetable = new AttributeTable(attributes);
        attributetable.addAttribute(asn1objectidentifier, new Attribute(asn1objectidentifier, new DERSet(asn1encodable)));
        return attributetable;
    }

    public Attribute get(ASN1ObjectIdentifier asn1objectidentifier)
    {
        asn1objectidentifier = ((ASN1ObjectIdentifier) (attributes.get(asn1objectidentifier)));
        if (asn1objectidentifier instanceof Vector)
        {
            return (Attribute)((Vector)asn1objectidentifier).elementAt(0);
        } else
        {
            return (Attribute)asn1objectidentifier;
        }
    }

    public Attribute get(DERObjectIdentifier derobjectidentifier)
    {
        return get(new ASN1ObjectIdentifier(derobjectidentifier.getId()));
    }

    public ASN1EncodableVector getAll(ASN1ObjectIdentifier asn1objectidentifier)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1objectidentifier = ((ASN1ObjectIdentifier) (attributes.get(asn1objectidentifier)));
        if (asn1objectidentifier instanceof Vector)
        {
            for (asn1objectidentifier = ((Vector)asn1objectidentifier).elements(); asn1objectidentifier.hasMoreElements(); asn1encodablevector.add((Attribute)asn1objectidentifier.nextElement())) { }
        } else
        if (asn1objectidentifier != null)
        {
            asn1encodablevector.add((Attribute)asn1objectidentifier);
        }
        return asn1encodablevector;
    }

    public ASN1EncodableVector getAll(DERObjectIdentifier derobjectidentifier)
    {
        return getAll(new ASN1ObjectIdentifier(derobjectidentifier.getId()));
    }

    public AttributeTable remove(ASN1ObjectIdentifier asn1objectidentifier)
    {
        AttributeTable attributetable = new AttributeTable(attributes);
        attributetable.attributes.remove(asn1objectidentifier);
        return attributetable;
    }

    public int size()
    {
        Enumeration enumeration = attributes.elements();
        int i = 0;
        while (enumeration.hasMoreElements()) 
        {
            Object obj = enumeration.nextElement();
            if (obj instanceof Vector)
            {
                i = ((Vector)obj).size() + i;
            } else
            {
                i++;
            }
        }
        return i;
    }

    public ASN1EncodableVector toASN1EncodableVector()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        for (Enumeration enumeration = attributes.elements(); enumeration.hasMoreElements();)
        {
            Object obj = enumeration.nextElement();
            if (obj instanceof Vector)
            {
                obj = ((Vector)obj).elements();
                while (((Enumeration) (obj)).hasMoreElements()) 
                {
                    asn1encodablevector.add(Attribute.getInstance(((Enumeration) (obj)).nextElement()));
                }
            } else
            {
                asn1encodablevector.add(Attribute.getInstance(obj));
            }
        }

        return asn1encodablevector;
    }

    public Attributes toASN1Structure()
    {
        return new Attributes(toASN1EncodableVector());
    }

    public Hashtable toHashtable()
    {
        return copyTable(attributes);
    }
}
