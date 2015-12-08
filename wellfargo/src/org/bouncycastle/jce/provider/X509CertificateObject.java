// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.misc.NetscapeCertType;
import org.bouncycastle.asn1.misc.NetscapeRevocationURL;
import org.bouncycastle.asn1.misc.VerisignCzagExtension;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.RFC4519Style;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.jce.provider:
//            X509SignatureUtil, BouncyCastleProvider, RFC3280CertPathUtilities

public class X509CertificateObject extends X509Certificate
    implements PKCS12BagAttributeCarrier
{

    private PKCS12BagAttributeCarrier attrCarrier;
    private BasicConstraints basicConstraints;
    private Certificate c;
    private int hashValue;
    private boolean hashValueSet;
    private boolean keyUsage[];

    public X509CertificateObject(Certificate certificate)
    {
        int i;
        int j;
        i = 9;
        super();
        attrCarrier = new PKCS12BagAttributeCarrierImpl();
        c = certificate;
        DERBitString derbitstring;
        boolean aflag[];
        try
        {
            certificate = getExtensionBytes("2.5.29.19");
        }
        // Misplaced declaration of an exception variable
        catch (Certificate certificate)
        {
            throw new CertificateParsingException((new StringBuilder()).append("cannot construct BasicConstraints: ").append(certificate).toString());
        }
        if (certificate == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        basicConstraints = BasicConstraints.getInstance(ASN1Primitive.fromByteArray(certificate));
        try
        {
            certificate = getExtensionBytes("2.5.29.15");
        }
        // Misplaced declaration of an exception variable
        catch (Certificate certificate)
        {
            throw new CertificateParsingException((new StringBuilder()).append("cannot construct KeyUsage: ").append(certificate).toString());
        }
        if (certificate == null) goto _L2; else goto _L1
_L1:
        derbitstring = DERBitString.getInstance(ASN1Primitive.fromByteArray(certificate));
        certificate = derbitstring.getBytes();
        j = certificate.length * 8 - derbitstring.getPadBits();
        if (j >= 9)
        {
            i = j;
        }
        keyUsage = new boolean[i];
        i = 0;
_L4:
        if (i == j)
        {
            break; /* Loop/switch isn't completed */
        }
        aflag = keyUsage;
        boolean flag;
        if ((certificate[i / 8] & 128 >>> i % 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aflag[i] = flag;
        i++;
        if (true) goto _L4; else goto _L3
_L2:
        keyUsage = null;
_L3:
    }

    private int calculateHashCode()
    {
        byte abyte0[] = getEncoded();
        int i;
        int j;
        j = 1;
        i = 0;
_L2:
        int k;
        k = j;
        j = i;
        if (k >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        byte byte0 = abyte0[k];
        j = k + 1;
        i = byte0 * k + i;
        if (true) goto _L2; else goto _L1
        CertificateEncodingException certificateencodingexception;
        certificateencodingexception;
        j = 0;
_L1:
        return j;
    }

    private void checkSignature(PublicKey publickey, Signature signature)
    {
        if (!isAlgIdEqual(c.getSignatureAlgorithm(), c.getTBSCertificate().getSignature()))
        {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        X509SignatureUtil.setSignatureParameters(signature, c.getSignatureAlgorithm().getParameters());
        signature.initVerify(publickey);
        signature.update(getTBSCertificate());
        if (!signature.verify(getSignature()))
        {
            throw new SignatureException("certificate does not verify with supplied key");
        } else
        {
            return;
        }
    }

    private static Collection getAlternativeNames(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        ArrayList arraylist;
        arraylist = new ArrayList();
        abyte0 = ASN1Sequence.getInstance(abyte0).getObjects();
_L11:
        if (!abyte0.hasMoreElements()) goto _L2; else goto _L1
_L1:
        ArrayList arraylist1;
        Object obj;
        obj = GeneralName.getInstance(abyte0.nextElement());
        arraylist1 = new ArrayList();
        arraylist1.add(Integers.valueOf(((GeneralName) (obj)).getTagNo()));
        ((GeneralName) (obj)).getTagNo();
        JVM INSTR tableswitch 0 8: default 301
    //                   0 159
    //                   1 207
    //                   2 207
    //                   3 159
    //                   4 184
    //                   5 159
    //                   6 207
    //                   7 249
    //                   8 229;
           goto _L3 _L4 _L5 _L5 _L4 _L6 _L4 _L5 _L7 _L8
_L3:
        throw new IOException((new StringBuilder()).append("Bad tag number: ").append(((GeneralName) (obj)).getTagNo()).toString());
_L4:
        arraylist1.add(((GeneralName) (obj)).getEncoded());
_L9:
        arraylist.add(Collections.unmodifiableList(arraylist1));
        continue; /* Loop/switch isn't completed */
_L6:
        try
        {
            arraylist1.add(X500Name.getInstance(RFC4519Style.INSTANCE, ((GeneralName) (obj)).getName()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new CertificateParsingException(abyte0.getMessage());
        }
        continue; /* Loop/switch isn't completed */
_L5:
        arraylist1.add(((ASN1String)((GeneralName) (obj)).getName()).getString());
        continue; /* Loop/switch isn't completed */
_L8:
        arraylist1.add(ASN1ObjectIdentifier.getInstance(((GeneralName) (obj)).getName()).getId());
        continue; /* Loop/switch isn't completed */
_L7:
        byte abyte1[] = DEROctetString.getInstance(((GeneralName) (obj)).getName()).getOctets();
        abyte1 = InetAddress.getByAddress(abyte1).getHostAddress();
        arraylist1.add(abyte1);
        if (true) goto _L9; else goto _L2
_L2:
        if (arraylist.size() == 0)
        {
            return null;
        }
        abyte0 = Collections.unmodifiableCollection(arraylist);
        return abyte0;
        UnknownHostException unknownhostexception;
        unknownhostexception;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private byte[] getExtensionBytes(String s)
    {
        Extensions extensions = c.getTBSCertificate().getExtensions();
        if (extensions != null)
        {
            s = extensions.getExtension(new ASN1ObjectIdentifier(s));
            if (s != null)
            {
                return s.getExtnValue().getOctets();
            }
        }
        return null;
    }

    private boolean isAlgIdEqual(AlgorithmIdentifier algorithmidentifier, AlgorithmIdentifier algorithmidentifier1)
    {
        if (algorithmidentifier.getAlgorithm().equals(algorithmidentifier1.getAlgorithm())) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (algorithmidentifier.getParameters() != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (algorithmidentifier1.getParameters() == null || algorithmidentifier1.getParameters().equals(DERNull.INSTANCE))
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (algorithmidentifier1.getParameters() == null)
        {
            if (algorithmidentifier.getParameters() == null || algorithmidentifier.getParameters().equals(DERNull.INSTANCE))
            {
                return true;
            }
        } else
        {
            return algorithmidentifier.getParameters().equals(algorithmidentifier1.getParameters());
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void checkValidity()
    {
        checkValidity(new Date());
    }

    public void checkValidity(Date date)
    {
        if (date.getTime() > getNotAfter().getTime())
        {
            throw new CertificateExpiredException((new StringBuilder()).append("certificate expired on ").append(c.getEndDate().getTime()).toString());
        }
        if (date.getTime() < getNotBefore().getTime())
        {
            throw new CertificateNotYetValidException((new StringBuilder()).append("certificate not valid till ").append(c.getStartDate().getTime()).toString());
        } else
        {
            return;
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag = false;
        if (obj == this)
        {
            flag = true;
        } else
        if (obj instanceof java.security.cert.Certificate)
        {
            obj = (java.security.cert.Certificate)obj;
            boolean flag1;
            try
            {
                flag1 = Arrays.areEqual(getEncoded(), ((java.security.cert.Certificate) (obj)).getEncoded());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            return flag1;
        }
        return flag;
    }

    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier asn1objectidentifier)
    {
        return attrCarrier.getBagAttribute(asn1objectidentifier);
    }

    public Enumeration getBagAttributeKeys()
    {
        return attrCarrier.getBagAttributeKeys();
    }

    public int getBasicConstraints()
    {
label0:
        {
            byte byte0 = -1;
            int i = byte0;
            if (basicConstraints != null)
            {
                i = byte0;
                if (basicConstraints.isCA())
                {
                    if (basicConstraints.getPathLenConstraint() != null)
                    {
                        break label0;
                    }
                    i = 0x7fffffff;
                }
            }
            return i;
        }
        return basicConstraints.getPathLenConstraint().intValue();
    }

    public Set getCriticalExtensionOIDs()
    {
        if (getVersion() == 3)
        {
            HashSet hashset = new HashSet();
            Extensions extensions = c.getTBSCertificate().getExtensions();
            if (extensions != null)
            {
                Enumeration enumeration = extensions.oids();
                do
                {
                    if (!enumeration.hasMoreElements())
                    {
                        break;
                    }
                    ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)enumeration.nextElement();
                    if (extensions.getExtension(asn1objectidentifier).isCritical())
                    {
                        hashset.add(asn1objectidentifier.getId());
                    }
                } while (true);
                return hashset;
            }
        }
        return null;
    }

    public byte[] getEncoded()
    {
        byte abyte0[];
        try
        {
            abyte0 = c.getEncoded("DER");
        }
        catch (IOException ioexception)
        {
            throw new CertificateEncodingException(ioexception.toString());
        }
        return abyte0;
    }

    public List getExtendedKeyUsage()
    {
        byte abyte0[] = getExtensionBytes("2.5.29.37");
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        Object obj;
        ArrayList arraylist;
        int i;
        try
        {
            obj = (ASN1Sequence)(new ASN1InputStream(abyte0)).readObject();
            arraylist = new ArrayList();
        }
        catch (Exception exception)
        {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
        i = 0;
        if (i == ((ASN1Sequence) (obj)).size())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(((ASN1ObjectIdentifier)((ASN1Sequence) (obj)).getObjectAt(i)).getId());
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_37;
_L1:
        obj = Collections.unmodifiableList(arraylist);
        return ((List) (obj));
        return null;
    }

    public byte[] getExtensionValue(String s)
    {
        Extensions extensions = c.getTBSCertificate().getExtensions();
        if (extensions != null)
        {
            s = extensions.getExtension(new ASN1ObjectIdentifier(s));
            if (s != null)
            {
                try
                {
                    s = s.getExtnValue().getEncoded();
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw new IllegalStateException((new StringBuilder()).append("error parsing ").append(s.toString()).toString());
                }
                return s;
            }
        }
        return null;
    }

    public Collection getIssuerAlternativeNames()
    {
        return getAlternativeNames(getExtensionBytes(Extension.issuerAlternativeName.getId()));
    }

    public Principal getIssuerDN()
    {
        X509Principal x509principal;
        try
        {
            x509principal = new X509Principal(X500Name.getInstance(c.getIssuer().getEncoded()));
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return x509principal;
    }

    public boolean[] getIssuerUniqueID()
    {
        DERBitString derbitstring = c.getTBSCertificate().getIssuerUniqueId();
        if (derbitstring != null)
        {
            byte abyte0[] = derbitstring.getBytes();
            boolean aflag[] = new boolean[abyte0.length * 8 - derbitstring.getPadBits()];
            int i = 0;
            while (i != aflag.length) 
            {
                boolean flag;
                if ((abyte0[i / 8] & 128 >>> i % 8) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                aflag[i] = flag;
                i++;
            }
            return aflag;
        } else
        {
            return null;
        }
    }

    public X500Principal getIssuerX500Principal()
    {
        Object obj;
        try
        {
            obj = new ByteArrayOutputStream();
            (new ASN1OutputStream(((java.io.OutputStream) (obj)))).writeObject(c.getIssuer());
            obj = new X500Principal(((ByteArrayOutputStream) (obj)).toByteArray());
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("can't encode issuer DN");
        }
        return ((X500Principal) (obj));
    }

    public boolean[] getKeyUsage()
    {
        return keyUsage;
    }

    public Set getNonCriticalExtensionOIDs()
    {
        if (getVersion() == 3)
        {
            HashSet hashset = new HashSet();
            Extensions extensions = c.getTBSCertificate().getExtensions();
            if (extensions != null)
            {
                Enumeration enumeration = extensions.oids();
                do
                {
                    if (!enumeration.hasMoreElements())
                    {
                        break;
                    }
                    ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)enumeration.nextElement();
                    if (!extensions.getExtension(asn1objectidentifier).isCritical())
                    {
                        hashset.add(asn1objectidentifier.getId());
                    }
                } while (true);
                return hashset;
            }
        }
        return null;
    }

    public Date getNotAfter()
    {
        return c.getEndDate().getDate();
    }

    public Date getNotBefore()
    {
        return c.getStartDate().getDate();
    }

    public PublicKey getPublicKey()
    {
        PublicKey publickey;
        try
        {
            publickey = BouncyCastleProvider.getPublicKey(c.getSubjectPublicKeyInfo());
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return publickey;
    }

    public BigInteger getSerialNumber()
    {
        return c.getSerialNumber().getValue();
    }

    public String getSigAlgName()
    {
        Object obj = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        if (obj != null)
        {
            obj = ((Provider) (obj)).getProperty((new StringBuilder()).append("Alg.Alias.Signature.").append(getSigAlgOID()).toString());
            if (obj != null)
            {
                return ((String) (obj));
            }
        }
        Provider aprovider[] = Security.getProviders();
        for (int i = 0; i != aprovider.length; i++)
        {
            String s = aprovider[i].getProperty((new StringBuilder()).append("Alg.Alias.Signature.").append(getSigAlgOID()).toString());
            if (s != null)
            {
                return s;
            }
        }

        return getSigAlgOID();
    }

    public String getSigAlgOID()
    {
        return c.getSignatureAlgorithm().getAlgorithm().getId();
    }

    public byte[] getSigAlgParams()
    {
        byte abyte0[] = null;
        if (c.getSignatureAlgorithm().getParameters() != null)
        {
            try
            {
                abyte0 = c.getSignatureAlgorithm().getParameters().toASN1Primitive().getEncoded("DER");
            }
            catch (IOException ioexception)
            {
                return null;
            }
        }
        return abyte0;
    }

    public byte[] getSignature()
    {
        return c.getSignature().getBytes();
    }

    public Collection getSubjectAlternativeNames()
    {
        return getAlternativeNames(getExtensionBytes(Extension.subjectAlternativeName.getId()));
    }

    public Principal getSubjectDN()
    {
        return new X509Principal(X500Name.getInstance(c.getSubject().toASN1Primitive()));
    }

    public boolean[] getSubjectUniqueID()
    {
        DERBitString derbitstring = c.getTBSCertificate().getSubjectUniqueId();
        if (derbitstring != null)
        {
            byte abyte0[] = derbitstring.getBytes();
            boolean aflag[] = new boolean[abyte0.length * 8 - derbitstring.getPadBits()];
            int i = 0;
            while (i != aflag.length) 
            {
                boolean flag;
                if ((abyte0[i / 8] & 128 >>> i % 8) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                aflag[i] = flag;
                i++;
            }
            return aflag;
        } else
        {
            return null;
        }
    }

    public X500Principal getSubjectX500Principal()
    {
        Object obj;
        try
        {
            obj = new ByteArrayOutputStream();
            (new ASN1OutputStream(((java.io.OutputStream) (obj)))).writeObject(c.getSubject());
            obj = new X500Principal(((ByteArrayOutputStream) (obj)).toByteArray());
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("can't encode issuer DN");
        }
        return ((X500Principal) (obj));
    }

    public byte[] getTBSCertificate()
    {
        byte abyte0[];
        try
        {
            abyte0 = c.getTBSCertificate().getEncoded("DER");
        }
        catch (IOException ioexception)
        {
            throw new CertificateEncodingException(ioexception.toString());
        }
        return abyte0;
    }

    public int getVersion()
    {
        return c.getVersionNumber();
    }

    public boolean hasUnsupportedCriticalExtension()
    {
label0:
        {
            if (getVersion() != 3)
            {
                break label0;
            }
            Extensions extensions = c.getTBSCertificate().getExtensions();
            if (extensions == null)
            {
                break label0;
            }
            Enumeration enumeration = extensions.oids();
            ASN1ObjectIdentifier asn1objectidentifier;
            String s;
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break label0;
                }
                asn1objectidentifier = (ASN1ObjectIdentifier)enumeration.nextElement();
                s = asn1objectidentifier.getId();
            } while (s.equals(RFC3280CertPathUtilities.KEY_USAGE) || s.equals(RFC3280CertPathUtilities.CERTIFICATE_POLICIES) || s.equals(RFC3280CertPathUtilities.POLICY_MAPPINGS) || s.equals(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY) || s.equals(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS) || s.equals(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT) || s.equals(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR) || s.equals(RFC3280CertPathUtilities.POLICY_CONSTRAINTS) || s.equals(RFC3280CertPathUtilities.BASIC_CONSTRAINTS) || s.equals(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME) || s.equals(RFC3280CertPathUtilities.NAME_CONSTRAINTS) || !extensions.getExtension(asn1objectidentifier).isCritical());
            return true;
        }
        return false;
    }

    public int hashCode()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        if (!hashValueSet)
        {
            hashValue = calculateHashCode();
            hashValueSet = true;
        }
        i = hashValue;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public void setBagAttribute(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        attrCarrier.setBagAttribute(asn1objectidentifier, asn1encodable);
    }

    public String toString()
    {
        StringBuffer stringbuffer;
        String s;
        Extensions extensions;
        stringbuffer = new StringBuffer();
        s = System.getProperty("line.separator");
        stringbuffer.append("  [0]         Version: ").append(getVersion()).append(s);
        stringbuffer.append("         SerialNumber: ").append(getSerialNumber()).append(s);
        stringbuffer.append("             IssuerDN: ").append(getIssuerDN()).append(s);
        stringbuffer.append("           Start Date: ").append(getNotBefore()).append(s);
        stringbuffer.append("           Final Date: ").append(getNotAfter()).append(s);
        stringbuffer.append("            SubjectDN: ").append(getSubjectDN()).append(s);
        stringbuffer.append("           Public Key: ").append(getPublicKey()).append(s);
        stringbuffer.append("  Signature Algorithm: ").append(getSigAlgName()).append(s);
        byte abyte0[] = getSignature();
        stringbuffer.append("            Signature: ").append(new String(Hex.encode(abyte0, 0, 20))).append(s);
        int i = 20;
        while (i < abyte0.length) 
        {
            if (i < abyte0.length - 20)
            {
                stringbuffer.append("                       ").append(new String(Hex.encode(abyte0, i, 20))).append(s);
            } else
            {
                stringbuffer.append("                       ").append(new String(Hex.encode(abyte0, i, abyte0.length - i))).append(s);
            }
            i += 20;
        }
        extensions = c.getTBSCertificate().getExtensions();
        if (extensions == null) goto _L2; else goto _L1
_L1:
        Enumeration enumeration;
        enumeration = extensions.oids();
        if (enumeration.hasMoreElements())
        {
            stringbuffer.append("       Extensions: \n");
        }
_L3:
        ASN1ObjectIdentifier asn1objectidentifier;
        ASN1InputStream asn1inputstream;
        if (!enumeration.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        asn1objectidentifier = (ASN1ObjectIdentifier)enumeration.nextElement();
        Extension extension = extensions.getExtension(asn1objectidentifier);
        if (extension.getExtnValue() == null)
        {
            break MISSING_BLOCK_LABEL_659;
        }
        asn1inputstream = new ASN1InputStream(extension.getExtnValue().getOctets());
        stringbuffer.append("                       critical(").append(extension.isCritical()).append(") ");
        Exception exception;
        if (asn1objectidentifier.equals(Extension.basicConstraints))
        {
            stringbuffer.append(BasicConstraints.getInstance(asn1inputstream.readObject())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (asn1objectidentifier.equals(Extension.keyUsage))
        {
            stringbuffer.append(KeyUsage.getInstance(asn1inputstream.readObject())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (asn1objectidentifier.equals(MiscObjectIdentifiers.netscapeCertType))
        {
            stringbuffer.append(new NetscapeCertType((DERBitString)asn1inputstream.readObject())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (asn1objectidentifier.equals(MiscObjectIdentifiers.netscapeRevocationURL))
        {
            stringbuffer.append(new NetscapeRevocationURL((DERIA5String)asn1inputstream.readObject())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (asn1objectidentifier.equals(MiscObjectIdentifiers.verisignCzagExtension))
        {
            stringbuffer.append(new VerisignCzagExtension((DERIA5String)asn1inputstream.readObject())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            stringbuffer.append(asn1objectidentifier.getId());
            stringbuffer.append(" value = ").append(ASN1Dump.dumpAsString(asn1inputstream.readObject())).append(s);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            stringbuffer.append(asn1objectidentifier.getId());
            stringbuffer.append(" value = ").append("*****").append(s);
        }
        continue; /* Loop/switch isn't completed */
        stringbuffer.append(s);
        if (true) goto _L3; else goto _L2
_L2:
        return stringbuffer.toString();
    }

    public final void verify(PublicKey publickey)
    {
        String s = X509SignatureUtil.getSignatureName(c.getSignatureAlgorithm());
        Signature signature;
        try
        {
            signature = Signature.getInstance(s, BouncyCastleProvider.PROVIDER_NAME);
        }
        catch (Exception exception)
        {
            exception = Signature.getInstance(s);
        }
        checkSignature(publickey, signature);
    }

    public final void verify(PublicKey publickey, String s)
    {
        checkSignature(publickey, Signature.getInstance(X509SignatureUtil.getSignatureName(c.getSignatureAlgorithm()), s));
    }
}
