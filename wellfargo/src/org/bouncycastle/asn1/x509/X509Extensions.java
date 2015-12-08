// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            X509Extension, Extensions

public class X509Extensions extends ASN1Object
{

    public static final ASN1ObjectIdentifier AuditIdentity = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.4");
    public static final ASN1ObjectIdentifier AuthorityInfoAccess = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.1");
    public static final ASN1ObjectIdentifier AuthorityKeyIdentifier = new ASN1ObjectIdentifier("2.5.29.35");
    public static final ASN1ObjectIdentifier BasicConstraints = new ASN1ObjectIdentifier("2.5.29.19");
    public static final ASN1ObjectIdentifier BiometricInfo = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.2");
    public static final ASN1ObjectIdentifier CRLDistributionPoints = new ASN1ObjectIdentifier("2.5.29.31");
    public static final ASN1ObjectIdentifier CRLNumber = new ASN1ObjectIdentifier("2.5.29.20");
    public static final ASN1ObjectIdentifier CertificateIssuer = new ASN1ObjectIdentifier("2.5.29.29");
    public static final ASN1ObjectIdentifier CertificatePolicies = new ASN1ObjectIdentifier("2.5.29.32");
    public static final ASN1ObjectIdentifier DeltaCRLIndicator = new ASN1ObjectIdentifier("2.5.29.27");
    public static final ASN1ObjectIdentifier ExtendedKeyUsage = new ASN1ObjectIdentifier("2.5.29.37");
    public static final ASN1ObjectIdentifier FreshestCRL = new ASN1ObjectIdentifier("2.5.29.46");
    public static final ASN1ObjectIdentifier InhibitAnyPolicy = new ASN1ObjectIdentifier("2.5.29.54");
    public static final ASN1ObjectIdentifier InstructionCode = new ASN1ObjectIdentifier("2.5.29.23");
    public static final ASN1ObjectIdentifier InvalidityDate = new ASN1ObjectIdentifier("2.5.29.24");
    public static final ASN1ObjectIdentifier IssuerAlternativeName = new ASN1ObjectIdentifier("2.5.29.18");
    public static final ASN1ObjectIdentifier IssuingDistributionPoint = new ASN1ObjectIdentifier("2.5.29.28");
    public static final ASN1ObjectIdentifier KeyUsage = new ASN1ObjectIdentifier("2.5.29.15");
    public static final ASN1ObjectIdentifier LogoType = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.12");
    public static final ASN1ObjectIdentifier NameConstraints = new ASN1ObjectIdentifier("2.5.29.30");
    public static final ASN1ObjectIdentifier NoRevAvail = new ASN1ObjectIdentifier("2.5.29.56");
    public static final ASN1ObjectIdentifier PolicyConstraints = new ASN1ObjectIdentifier("2.5.29.36");
    public static final ASN1ObjectIdentifier PolicyMappings = new ASN1ObjectIdentifier("2.5.29.33");
    public static final ASN1ObjectIdentifier PrivateKeyUsagePeriod = new ASN1ObjectIdentifier("2.5.29.16");
    public static final ASN1ObjectIdentifier QCStatements = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.3");
    public static final ASN1ObjectIdentifier ReasonCode = new ASN1ObjectIdentifier("2.5.29.21");
    public static final ASN1ObjectIdentifier SubjectAlternativeName = new ASN1ObjectIdentifier("2.5.29.17");
    public static final ASN1ObjectIdentifier SubjectDirectoryAttributes = new ASN1ObjectIdentifier("2.5.29.9");
    public static final ASN1ObjectIdentifier SubjectInfoAccess = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.11");
    public static final ASN1ObjectIdentifier SubjectKeyIdentifier = new ASN1ObjectIdentifier("2.5.29.14");
    public static final ASN1ObjectIdentifier TargetInformation = new ASN1ObjectIdentifier("2.5.29.55");
    private Hashtable extensions;
    private Vector ordering;

    public X509Extensions(Hashtable hashtable)
    {
        this(null, hashtable);
    }

    public X509Extensions(Vector vector, Hashtable hashtable)
    {
        extensions = new Hashtable();
        ordering = new Vector();
        if (vector == null)
        {
            vector = hashtable.keys();
        } else
        {
            vector = vector.elements();
        }
        for (; vector.hasMoreElements(); ordering.addElement(ASN1ObjectIdentifier.getInstance(vector.nextElement()))) { }
        ASN1ObjectIdentifier asn1objectidentifier;
        X509Extension x509extension;
        for (vector = ordering.elements(); vector.hasMoreElements(); extensions.put(asn1objectidentifier, x509extension))
        {
            asn1objectidentifier = ASN1ObjectIdentifier.getInstance(vector.nextElement());
            x509extension = (X509Extension)hashtable.get(asn1objectidentifier);
        }

    }

    public X509Extensions(Vector vector, Vector vector1)
    {
        extensions = new Hashtable();
        ordering = new Vector();
        for (vector = vector.elements(); vector.hasMoreElements(); ordering.addElement(vector.nextElement())) { }
        vector = ordering.elements();
        for (int i = 0; vector.hasMoreElements(); i++)
        {
            ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)vector.nextElement();
            X509Extension x509extension = (X509Extension)vector1.elementAt(i);
            extensions.put(asn1objectidentifier, x509extension);
        }

    }

    public X509Extensions(ASN1Sequence asn1sequence)
    {
        extensions = new Hashtable();
        ordering = new Vector();
        asn1sequence = asn1sequence.getObjects();
        while (asn1sequence.hasMoreElements()) 
        {
            ASN1Sequence asn1sequence1 = ASN1Sequence.getInstance(asn1sequence.nextElement());
            if (asn1sequence1.size() == 3)
            {
                extensions.put(asn1sequence1.getObjectAt(0), new X509Extension(DERBoolean.getInstance(asn1sequence1.getObjectAt(1)), ASN1OctetString.getInstance(asn1sequence1.getObjectAt(2))));
            } else
            if (asn1sequence1.size() == 2)
            {
                extensions.put(asn1sequence1.getObjectAt(0), new X509Extension(false, ASN1OctetString.getInstance(asn1sequence1.getObjectAt(1))));
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence1.size()).toString());
            }
            ordering.addElement(asn1sequence1.getObjectAt(0));
        }
    }

    private ASN1ObjectIdentifier[] getExtensionOIDs(boolean flag)
    {
        Vector vector = new Vector();
        for (int i = 0; i != ordering.size(); i++)
        {
            Object obj = ordering.elementAt(i);
            if (((X509Extension)extensions.get(obj)).isCritical() == flag)
            {
                vector.addElement(obj);
            }
        }

        return toOidArray(vector);
    }

    public static X509Extensions getInstance(Object obj)
    {
        if (obj == null || (obj instanceof X509Extensions))
        {
            return (X509Extensions)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new X509Extensions((ASN1Sequence)obj);
        }
        if (obj instanceof Extensions)
        {
            return new X509Extensions((ASN1Sequence)((Extensions)obj).toASN1Primitive());
        }
        if (obj instanceof ASN1TaggedObject)
        {
            return getInstance(((ASN1TaggedObject)obj).getObject());
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static X509Extensions getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
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

    public boolean equivalent(X509Extensions x509extensions)
    {
        if (extensions.size() != x509extensions.extensions.size())
        {
            return false;
        }
        for (Enumeration enumeration = extensions.keys(); enumeration.hasMoreElements();)
        {
            Object obj = enumeration.nextElement();
            if (!extensions.get(obj).equals(x509extensions.extensions.get(obj)))
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

    public X509Extension getExtension(ASN1ObjectIdentifier asn1objectidentifier)
    {
        return (X509Extension)extensions.get(asn1objectidentifier);
    }

    public X509Extension getExtension(DERObjectIdentifier derobjectidentifier)
    {
        return (X509Extension)extensions.get(derobjectidentifier);
    }

    public ASN1ObjectIdentifier[] getExtensionOIDs()
    {
        return toOidArray(ordering);
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
            X509Extension x509extension = (X509Extension)extensions.get(asn1objectidentifier);
            asn1encodablevector1 = new ASN1EncodableVector();
            asn1encodablevector1.add(asn1objectidentifier);
            if (x509extension.isCritical())
            {
                asn1encodablevector1.add(DERBoolean.TRUE);
            }
            asn1encodablevector1.add(x509extension.getValue());
        }

        return new DERSequence(asn1encodablevector);
    }

}
