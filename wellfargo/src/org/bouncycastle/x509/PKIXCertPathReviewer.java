// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEREnumerated;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.AccessDescription;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.asn1.x509.qualified.Iso4217CurrencyCode;
import org.bouncycastle.asn1.x509.qualified.MonetaryValue;
import org.bouncycastle.asn1.x509.qualified.QCStatement;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.LocaleString;
import org.bouncycastle.i18n.filter.TrustedInput;
import org.bouncycastle.i18n.filter.UntrustedInput;
import org.bouncycastle.i18n.filter.UntrustedUrlInput;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.CertPathValidatorUtilities;
import org.bouncycastle.jce.provider.PKIXCRLUtil;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidator;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException;
import org.bouncycastle.jce.provider.PKIXPolicyNode;
import org.bouncycastle.util.Integers;
import org.bouncycastle.x509.extension.X509ExtensionUtil;

// Referenced classes of package org.bouncycastle.x509:
//            CertPathReviewerException, X509CRLStoreSelector

public class PKIXCertPathReviewer extends CertPathValidatorUtilities
{

    private static final String AUTH_INFO_ACCESS;
    private static final String CRL_DIST_POINTS;
    private static final String QC_STATEMENT;
    private static final String RESOURCE_NAME = "org.bouncycastle.x509.CertPathReviewerMessages";
    protected CertPath certPath;
    protected List certs;
    protected List errors[];
    private boolean initialized;
    protected int n;
    protected List notifications[];
    protected PKIXParameters pkixParams;
    protected PolicyNode policyTree;
    protected PublicKey subjectPublicKey;
    protected TrustAnchor trustAnchor;
    protected Date validDate;

    public PKIXCertPathReviewer()
    {
    }

    public PKIXCertPathReviewer(CertPath certpath, PKIXParameters pkixparameters)
    {
        init(certpath, pkixparameters);
    }

    private String IPtoString(byte abyte0[])
    {
        String s;
        try
        {
            s = InetAddress.getByAddress(abyte0).getHostAddress();
        }
        catch (Exception exception)
        {
            StringBuffer stringbuffer = new StringBuffer();
            for (int i = 0; i != abyte0.length; i++)
            {
                stringbuffer.append(Integer.toHexString(abyte0[i] & 0xff));
                stringbuffer.append(' ');
            }

            return stringbuffer.toString();
        }
        return s;
    }

    private void checkCriticalExtensions()
    {
        Object obj;
        Object obj1;
        obj = pkixParams.getCertPathCheckers();
        obj1 = ((List) (obj)).iterator();
        while (((Iterator) (obj1)).hasNext()) 
        {
            ((PKIXCertPathChecker)((Iterator) (obj1)).next()).init(false);
        }
          goto _L1
        obj;
        try
        {
            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certPathCheckerError", new Object[] {
                ((CertPathValidatorException) (obj)).getMessage(), obj, obj.getClass().getName()
            }), ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            addError(((CertPathReviewerException) (obj)).getErrorMessage(), ((CertPathReviewerException) (obj)).getIndex());
        }
_L6:
        return;
_L1:
        int i = certs.size() - 1;
_L4:
        if (i < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        Set set;
        obj1 = (X509Certificate)certs.get(i);
        set = ((X509Certificate) (obj1)).getCriticalExtensionOIDs();
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_449;
        }
        if (set.isEmpty())
        {
            break MISSING_BLOCK_LABEL_449;
        }
        Iterator iterator1;
        set.remove(KEY_USAGE);
        set.remove(CERTIFICATE_POLICIES);
        set.remove(POLICY_MAPPINGS);
        set.remove(INHIBIT_ANY_POLICY);
        set.remove(ISSUING_DISTRIBUTION_POINT);
        set.remove(DELTA_CRL_INDICATOR);
        set.remove(POLICY_CONSTRAINTS);
        set.remove(BASIC_CONSTRAINTS);
        set.remove(SUBJECT_ALTERNATIVE_NAME);
        set.remove(NAME_CONSTRAINTS);
        if (set.contains(QC_STATEMENT) && processQcStatements(((X509Certificate) (obj1)), i))
        {
            set.remove(QC_STATEMENT);
        }
        iterator1 = ((List) (obj)).iterator();
_L2:
        boolean flag = iterator1.hasNext();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_381;
        }
        ((PKIXCertPathChecker)iterator1.next()).check(((java.security.cert.Certificate) (obj1)), set);
          goto _L2
        CertPathValidatorException certpathvalidatorexception;
        certpathvalidatorexception;
        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.criticalExtensionError", new Object[] {
            certpathvalidatorexception.getMessage(), certpathvalidatorexception, certpathvalidatorexception.getClass().getName()
        }), certpathvalidatorexception.getCause(), certPath, i);
        if (!set.isEmpty())
        {
            for (Iterator iterator = set.iterator(); iterator.hasNext(); addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.unknownCriticalExt", new Object[] {
    new DERObjectIdentifier((String)iterator.next())
}), i)) { }
        }
        i--;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void checkNameConstraints()
    {
        Object obj = new PKIXNameConstraintValidator();
        int i = certs.size() - 1;
_L12:
        if (i <= 0) goto _L2; else goto _L1
_L1:
        X509Certificate x509certificate;
        int j = n;
        x509certificate = (X509Certificate)certs.get(i);
        if (isSelfIssued(x509certificate)) goto _L4; else goto _L3
_L3:
        Object obj1;
        Object obj2;
        obj1 = getSubjectPrincipal(x509certificate);
        obj2 = new ASN1InputStream(new ByteArrayInputStream(((X500Principal) (obj1)).getEncoded()));
        obj2 = (ASN1Sequence)((ASN1InputStream) (obj2)).readObject();
        ((PKIXNameConstraintValidator) (obj)).checkPermittedDN(((ASN1Sequence) (obj2)));
        ((PKIXNameConstraintValidator) (obj)).checkExcludedDN(((ASN1Sequence) (obj2)));
        obj2 = (ASN1Sequence)getExtensionValue(x509certificate, SUBJECT_ALTERNATIVE_NAME);
        if (obj2 == null) goto _L4; else goto _L5
_L5:
        int k = 0;
_L6:
        if (k >= ((ASN1Sequence) (obj2)).size())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = GeneralName.getInstance(((ASN1Sequence) (obj2)).getObjectAt(k));
        ((PKIXNameConstraintValidator) (obj)).checkPermitted(((GeneralName) (obj1)));
        ((PKIXNameConstraintValidator) (obj)).checkExcluded(((GeneralName) (obj1)));
        k++;
        if (true) goto _L6; else goto _L4
        obj;
        try
        {
            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.ncSubjectNameError", new Object[] {
                new UntrustedInput(obj1)
            }), ((Throwable) (obj)), certPath, i);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            addError(((CertPathReviewerException) (obj)).getErrorMessage(), ((CertPathReviewerException) (obj)).getIndex());
        }
_L2:
        return;
        obj;
        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.notPermittedDN", new Object[] {
            new UntrustedInput(((X500Principal) (obj1)).getName())
        }), ((Throwable) (obj)), certPath, i);
        obj;
        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.excludedDN", new Object[] {
            new UntrustedInput(((X500Principal) (obj1)).getName())
        }), ((Throwable) (obj)), certPath, i);
        obj;
        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.subjAltNameExtError"), ((Throwable) (obj)), certPath, i);
        obj;
        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.notPermittedEmail", new Object[] {
            new UntrustedInput(obj1)
        }), ((Throwable) (obj)), certPath, i);
_L4:
        obj1 = (ASN1Sequence)getExtensionValue(x509certificate, NAME_CONSTRAINTS);
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        org.bouncycastle.asn1.x509.GeneralSubtree ageneralsubtree1[];
        obj1 = NameConstraints.getInstance(obj1);
        ageneralsubtree1 = ((NameConstraints) (obj1)).getPermittedSubtrees();
        if (ageneralsubtree1 == null)
        {
            break MISSING_BLOCK_LABEL_415;
        }
        ((PKIXNameConstraintValidator) (obj)).intersectPermittedSubtree(ageneralsubtree1);
        org.bouncycastle.asn1.x509.GeneralSubtree ageneralsubtree[] = ((NameConstraints) (obj1)).getExcludedSubtrees();
        if (ageneralsubtree == null) goto _L8; else goto _L9
_L9:
        k = 0;
_L10:
        if (k == ageneralsubtree.length)
        {
            break; /* Loop/switch isn't completed */
        }
        ((PKIXNameConstraintValidator) (obj)).addExcludedSubtree(ageneralsubtree[k]);
        k++;
        if (true) goto _L10; else goto _L8
        AnnotatedException annotatedexception;
        annotatedexception;
        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.ncExtError"), annotatedexception, certPath, i);
_L8:
        i--;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void checkPathLength()
    {
        int j = n;
        int k = certs.size() - 1;
        int i = 0;
        do
        {
            if (k <= 0)
            {
                break;
            }
            int l = n;
            Object obj = (X509Certificate)certs.get(k);
            if (!isSelfIssued(((X509Certificate) (obj))))
            {
                if (j <= 0)
                {
                    addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.pathLenghtExtended"));
                }
                i++;
                j--;
            }
            try
            {
                obj = BasicConstraints.getInstance(getExtensionValue(((java.security.cert.X509Extension) (obj)), BASIC_CONSTRAINTS));
            }
            catch (AnnotatedException annotatedexception)
            {
                addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.processLengthConstError"), k);
                annotatedexception = null;
            }
            if (obj != null)
            {
                obj = ((BasicConstraints) (obj)).getPathLenConstraint();
                if (obj != null)
                {
                    int i1 = ((BigInteger) (obj)).intValue();
                    if (i1 < j)
                    {
                        j = i1;
                    }
                }
            }
            k--;
        } while (true);
        addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.totalPathLength", new Object[] {
            Integers.valueOf(i)
        }));
    }

    private void checkPolicy()
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        ArrayList aarraylist[];
        Set set;
        Object obj5;
        int j;
        int k;
        int l;
        int k1;
        int l1;
        set = pkixParams.getInitialPolicies();
        aarraylist = new ArrayList[n + 1];
        for (int i = 0; i < aarraylist.length; i++)
        {
            aarraylist[i] = new ArrayList();
        }

        obj = new HashSet();
        ((Set) (obj)).add("2.5.29.32.0");
        obj = new PKIXPolicyNode(new ArrayList(), 0, ((Set) (obj)), null, new HashSet(), "2.5.29.32.0", false);
        aarraylist[0].add(obj);
        Enumeration enumeration;
        ASN1ObjectIdentifier asn1objectidentifier;
        Object obj8;
        boolean flag1;
        if (pkixParams.isExplicitPolicyRequired())
        {
            j = 0;
        } else
        {
            j = n + 1;
        }
        if (pkixParams.isAnyPolicyInhibited())
        {
            k = 0;
        } else
        {
            k = n + 1;
        }
        if (pkixParams.isPolicyMappingInhibited())
        {
            l = 0;
        } else
        {
            l = n + 1;
        }
        obj2 = null;
        k1 = certs.size() - 1;
        obj1 = null;
_L63:
        if (k1 < 0) goto _L2; else goto _L1
_L1:
        l1 = n - k1;
        obj3 = (X509Certificate)certs.get(k1);
        obj5 = (ASN1Sequence)getExtensionValue(((java.security.cert.X509Extension) (obj3)), CERTIFICATE_POLICIES);
        if (obj5 == null || obj == null) goto _L4; else goto _L3
_L3:
        enumeration = ((ASN1Sequence) (obj5)).getObjects();
        obj2 = new HashSet();
_L8:
        if (!enumeration.hasMoreElements()) goto _L6; else goto _L5
_L5:
        obj8 = PolicyInformation.getInstance(enumeration.nextElement());
        asn1objectidentifier = ((PolicyInformation) (obj8)).getPolicyIdentifier();
        ((Set) (obj2)).add(asn1objectidentifier.getId());
        flag1 = "2.5.29.32.0".equals(asn1objectidentifier.getId());
        if (flag1) goto _L8; else goto _L7
_L7:
        obj8 = getQualifierSet(((PolicyInformation) (obj8)).getPolicyQualifiers());
        if (!processCertD1i(l1, aarraylist, asn1objectidentifier, ((Set) (obj8))))
        {
            processCertD1ii(l1, aarraylist, asn1objectidentifier, ((Set) (obj8)));
        }
          goto _L8
_L10:
        return;
        obj;
        try
        {
            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyExtError"), ((Throwable) (obj)), certPath, k1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            addError(((CertPathReviewerException) (obj)).getErrorMessage(), ((CertPathReviewerException) (obj)).getIndex());
        }
        if (true) goto _L10; else goto _L9
_L9:
        obj;
        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyQualifierError"), ((Throwable) (obj)), certPath, k1);
_L6:
        if (obj1 == null) goto _L12; else goto _L11
_L11:
        if (!((Set) (obj1)).contains("2.5.29.32.0")) goto _L13; else goto _L12
_L27:
        if (k > 0) goto _L15; else goto _L14
_L14:
        if (l1 >= n || !isSelfIssued(((X509Certificate) (obj3)))) goto _L16; else goto _L15
_L15:
        obj2 = ((ASN1Sequence) (obj5)).getObjects();
_L19:
        if (!((Enumeration) (obj2)).hasMoreElements()) goto _L16; else goto _L17
_L17:
        Object obj4;
        boolean flag2;
        obj4 = PolicyInformation.getInstance(((Enumeration) (obj2)).nextElement());
        flag2 = "2.5.29.32.0".equals(((PolicyInformation) (obj4)).getPolicyIdentifier().getId());
        if (!flag2) goto _L19; else goto _L18
_L18:
        obj4 = getQualifierSet(((PolicyInformation) (obj4)).getPolicyQualifiers());
        Object obj6;
        int j1;
        obj6 = aarraylist[l1 - 1];
        j1 = 0;
_L97:
        if (j1 >= ((List) (obj6)).size()) goto _L16; else goto _L20
_L20:
        PKIXPolicyNode pkixpolicynode;
        Iterator iterator;
        pkixpolicynode = (PKIXPolicyNode)((List) (obj6)).get(j1);
        iterator = pkixpolicynode.getExpectedPolicies().iterator();
_L30:
        if (!iterator.hasNext()) goto _L22; else goto _L21
_L21:
        obj2 = iterator.next();
        if (!(obj2 instanceof String)) goto _L24; else goto _L23
_L23:
        obj2 = (String)obj2;
_L31:
        boolean flag = false;
        for (Iterator iterator1 = pkixpolicynode.getChildren(); iterator1.hasNext();)
        {
            if (((String) (obj2)).equals(((PKIXPolicyNode)iterator1.next()).getValidPolicy()))
            {
                flag = true;
            }
        }

          goto _L25
_L13:
        obj6 = ((Set) (obj1)).iterator();
        obj4 = new HashSet();
_L28:
        obj1 = obj4;
        if (!((Iterator) (obj6)).hasNext()) goto _L27; else goto _L26
_L26:
        obj1 = ((Iterator) (obj6)).next();
        if (((Set) (obj2)).contains(obj1))
        {
            ((Set) (obj4)).add(obj1);
        }
          goto _L28
        obj;
        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyQualifierError"), ((Throwable) (obj)), certPath, k1);
_L24:
        if (!(obj2 instanceof DERObjectIdentifier)) goto _L30; else goto _L29
_L29:
        obj2 = ((DERObjectIdentifier)obj2).getId();
          goto _L31
_L25:
        if (flag) goto _L30; else goto _L32
_L32:
        HashSet hashset1 = new HashSet();
        hashset1.add(obj2);
        obj2 = new PKIXPolicyNode(new ArrayList(), l1, hashset1, pkixpolicynode, ((Set) (obj4)), ((String) (obj2)), false);
        pkixpolicynode.addChild(((PKIXPolicyNode) (obj2)));
        aarraylist[l1].add(obj2);
          goto _L30
_L100:
        if (j1 >= ((List) (obj4)).size()) goto _L34; else goto _L33
_L33:
        obj2 = (PKIXPolicyNode)((List) (obj4)).get(j1);
        if (((PKIXPolicyNode) (obj2)).hasChildren()) goto _L36; else goto _L35
_L35:
        obj2 = removePolicyNode(((PKIXPolicyNode) (obj)), aarraylist, ((PKIXPolicyNode) (obj2)));
        obj = obj2;
        if (obj2 != null) goto _L36; else goto _L37
_L37:
        obj = obj2;
          goto _L34
_L99:
        obj2 = ((X509Certificate) (obj3)).getCriticalExtensionOIDs();
        if (obj2 == null) goto _L4; else goto _L38
_L38:
        flag2 = ((Set) (obj2)).contains(CERTIFICATE_POLICIES);
        int i1;
        obj2 = aarraylist[l1];
        i1 = 0;
_L39:
        if (i1 >= ((List) (obj2)).size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((PKIXPolicyNode)((List) (obj2)).get(i1)).setCritical(flag2);
        i1++;
        if (true) goto _L39; else goto _L4
_L4:
        if (obj5 == null)
        {
            obj = null;
        }
        if (j > 0 || obj != null)
        {
            break MISSING_BLOCK_LABEL_978;
        }
        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noValidPolicyTree"));
        i1 = n;
        if (l1 == i1) goto _L41; else goto _L40
_L40:
        obj2 = getExtensionValue(((java.security.cert.X509Extension) (obj3)), POLICY_MAPPINGS);
        if (obj2 == null) goto _L43; else goto _L42
_L42:
        obj4 = (ASN1Sequence)obj2;
        i1 = 0;
_L102:
        if (i1 < ((ASN1Sequence) (obj4)).size())
        {
            obj7 = (ASN1Sequence)((ASN1Sequence) (obj4)).getObjectAt(i1);
            obj5 = (DERObjectIdentifier)((ASN1Sequence) (obj7)).getObjectAt(0);
            obj7 = (DERObjectIdentifier)((ASN1Sequence) (obj7)).getObjectAt(1);
            if ("2.5.29.32.0".equals(((DERObjectIdentifier) (obj5)).getId()))
            {
                throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.invalidPolicyMapping"), certPath, k1);
            }
            break MISSING_BLOCK_LABEL_1125;
        }
          goto _L43
        obj;
        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyMapExtError"), ((Throwable) (obj)), certPath, k1);
        if ("2.5.29.32.0".equals(((DERObjectIdentifier) (obj7)).getId()))
        {
            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.invalidPolicyMapping"), certPath, k1);
        }
          goto _L44
_L43:
        if (obj2 == null) goto _L46; else goto _L45
_L45:
        obj4 = (ASN1Sequence)obj2;
        obj2 = new HashMap();
        obj5 = new HashSet();
        i1 = 0;
_L103:
        if (i1 >= ((ASN1Sequence) (obj4)).size()) goto _L48; else goto _L47
_L47:
        obj9 = (ASN1Sequence)((ASN1Sequence) (obj4)).getObjectAt(i1);
        obj7 = ((DERObjectIdentifier)((ASN1Sequence) (obj9)).getObjectAt(0)).getId();
        obj9 = ((DERObjectIdentifier)((ASN1Sequence) (obj9)).getObjectAt(1)).getId();
        if (((Map) (obj2)).containsKey(obj7)) goto _L50; else goto _L49
_L49:
        hashset = new HashSet();
        hashset.add(obj9);
        ((Map) (obj2)).put(obj7, hashset);
        ((Set) (obj5)).add(obj7);
          goto _L51
_L50:
        ((Set)((Map) (obj2)).get(obj7)).add(obj9);
          goto _L51
_L48:
        obj4 = ((Set) (obj5)).iterator();
_L55:
        if (!((Iterator) (obj4)).hasNext()) goto _L46; else goto _L52
_L52:
        obj5 = (String)((Iterator) (obj4)).next();
        if (l <= 0) goto _L54; else goto _L53
_L53:
        prepareNextCertB1(l1, aarraylist, ((String) (obj5)), ((Map) (obj2)), ((X509Certificate) (obj3)));
          goto _L55
        obj;
        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyExtError"), ((Throwable) (obj)), certPath, k1);
        obj;
        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyQualifierError"), ((Throwable) (obj)), certPath, k1);
_L54:
        if (l > 0) goto _L55; else goto _L56
_L56:
        obj = prepareNextCertB2(l1, aarraylist, ((String) (obj5)), ((PKIXPolicyNode) (obj)));
          goto _L55
_L46:
        flag3 = isSelfIssued(((X509Certificate) (obj3)));
        if (!flag3)
        {
            if (j != 0)
            {
                i1 = j - 1;
            } else
            {
                i1 = j;
            }
            if (l != 0)
            {
                j = l - 1;
            } else
            {
                j = l;
            }
            if (k != 0)
            {
                l = k - 1;
                k = i1;
            } else
            {
                l = k;
                k = i1;
            }
        } else
        {
            i1 = l;
            l = k;
            k = j;
            j = i1;
        }
        obj2 = (ASN1Sequence)getExtensionValue(((java.security.cert.X509Extension) (obj3)), POLICY_CONSTRAINTS);
        i1 = j;
        j1 = k;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_1663;
        }
        obj2 = ((ASN1Sequence) (obj2)).getObjects();
_L57:
        i1 = j;
        j1 = k;
        if (!((Enumeration) (obj2)).hasMoreElements())
        {
            break MISSING_BLOCK_LABEL_1663;
        }
        obj4 = (ASN1TaggedObject)((Enumeration) (obj2)).nextElement();
        ((ASN1TaggedObject) (obj4)).getTagNo();
        JVM INSTR tableswitch 0 1: default 2649
    //                   0 1580
    //                   1 1608;
           goto _L57 _L58 _L59
_L58:
        i1 = DERInteger.getInstance(((ASN1TaggedObject) (obj4)), false).getValue().intValue();
        if (i1 < k)
        {
            k = i1;
        }
          goto _L57
_L59:
        i1 = DERInteger.getInstance(((ASN1TaggedObject) (obj4)), false).getValue().intValue();
        if (i1 < j)
        {
            j = i1;
        }
          goto _L57
        obj;
        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyConstExtError"), certPath, k1);
        obj2 = (DERInteger)getExtensionValue(((java.security.cert.X509Extension) (obj3)), INHIBIT_ANY_POLICY);
        if (obj2 == null) goto _L61; else goto _L60
_L60:
        j = ((DERInteger) (obj2)).getValue().intValue();
        if (j >= l) goto _L61; else goto _L62
_L62:
        k1--;
        l = i1;
        obj2 = obj3;
        k = j;
        j = j1;
          goto _L63
        obj;
        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyInhibitExtError"), certPath, k1);
_L2:
        flag3 = isSelfIssued(((X509Certificate) (obj2)));
        if (!flag3 && j > 0)
        {
            j--;
        }
        obj2 = (ASN1Sequence)getExtensionValue(((java.security.cert.X509Extension) (obj2)), POLICY_CONSTRAINTS);
        k = j;
        if (obj2 == null) goto _L65; else goto _L64
_L64:
        obj2 = ((ASN1Sequence) (obj2)).getObjects();
_L67:
        k = j;
        if (!((Enumeration) (obj2)).hasMoreElements()) goto _L65; else goto _L66
_L66:
        obj3 = (ASN1TaggedObject)((Enumeration) (obj2)).nextElement();
        ((ASN1TaggedObject) (obj3)).getTagNo();
        JVM INSTR tableswitch 0 0: default 2652
    //                   0 1840;
           goto _L67 _L68
_L68:
        k = DERInteger.getInstance(((ASN1TaggedObject) (obj3)), false).getValue().intValue();
        if (k == 0)
        {
            j = 0;
        }
          goto _L67
        obj;
        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyConstExtError"), certPath, k1);
_L65:
        if (obj != null) goto _L70; else goto _L69
_L69:
        if (pkixParams.isExplicitPolicyRequired())
        {
            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.explicitPolicy"), certPath, k1);
        }
          goto _L71
_L92:
        if (k > 0 || obj1 != null) goto _L10; else goto _L72
_L72:
        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.invalidPolicy"));
_L70:
        if (!isAnyPolicy(set)) goto _L74; else goto _L73
_L73:
        if (!pkixParams.isExplicitPolicyRequired()) goto _L76; else goto _L75
_L75:
        if (((Set) (obj1)).isEmpty())
        {
            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.explicitPolicy"), certPath, k1);
        }
        obj2 = new HashSet();
        j = 0;
_L105:
        if (j >= aarraylist.length) goto _L78; else goto _L77
_L77:
        obj3 = aarraylist[j];
        l = 0;
_L104:
        if (l >= ((List) (obj3)).size()) goto _L80; else goto _L79
_L79:
        obj4 = (PKIXPolicyNode)((List) (obj3)).get(l);
        if ("2.5.29.32.0".equals(((PKIXPolicyNode) (obj4)).getValidPolicy()))
        {
            for (obj4 = ((PKIXPolicyNode) (obj4)).getChildren(); ((Iterator) (obj4)).hasNext(); ((Set) (obj2)).add(((Iterator) (obj4)).next())) { }
        }
          goto _L81
_L78:
        for (obj2 = ((Set) (obj2)).iterator(); ((Iterator) (obj2)).hasNext();)
        {
            if (((Set) (obj1)).contains(((PKIXPolicyNode)((Iterator) (obj2)).next()).getValidPolicy()));
        }

        if (obj == null) goto _L76; else goto _L82
_L82:
        j = n - 1;
          goto _L83
_L107:
        if (l >= ((List) (obj1)).size()) goto _L85; else goto _L84
_L84:
        obj2 = (PKIXPolicyNode)((List) (obj1)).get(l);
        if (!((PKIXPolicyNode) (obj2)).hasChildren())
        {
            obj = removePolicyNode(((PKIXPolicyNode) (obj)), aarraylist, ((PKIXPolicyNode) (obj2)));
        }
          goto _L86
_L74:
        obj1 = new HashSet();
        j = 0;
_L109:
        if (j >= aarraylist.length) goto _L88; else goto _L87
_L87:
        obj2 = aarraylist[j];
        l = 0;
_L108:
        if (l >= ((List) (obj2)).size()) goto _L90; else goto _L89
_L88:
        obj1 = ((Set) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            obj2 = (PKIXPolicyNode)((Iterator) (obj1)).next();
            if (!set.contains(((PKIXPolicyNode) (obj2)).getValidPolicy()))
            {
                obj = removePolicyNode(((PKIXPolicyNode) (obj)), aarraylist, ((PKIXPolicyNode) (obj2)));
            }
        } while (true);
        obj1 = obj;
        if (obj == null) goto _L92; else goto _L91
_L91:
        j = n - 1;
          goto _L93
_L96:
        if (l >= ((List) (obj1)).size()) goto _L95; else goto _L94
_L94:
        obj2 = (PKIXPolicyNode)((List) (obj1)).get(l);
        if (!((PKIXPolicyNode) (obj2)).hasChildren())
        {
            obj = removePolicyNode(((PKIXPolicyNode) (obj)), aarraylist, ((PKIXPolicyNode) (obj2)));
        }
        l++;
          goto _L96
_L95:
        j--;
          goto _L93
_L76:
        obj1 = obj;
          goto _L92
_L61:
        j = l;
          goto _L62
_L41:
        j1 = j;
        j = k;
        i1 = l;
          goto _L62
_L12:
        obj1 = obj2;
          goto _L27
_L22:
        j1++;
          goto _L97
_L16:
        i1 = l1 - 1;
_L101:
        if (i1 < 0) goto _L99; else goto _L98
_L98:
        obj4 = aarraylist[i1];
        j1 = 0;
          goto _L100
_L34:
        i1--;
          goto _L101
_L36:
        j1++;
          goto _L100
_L44:
        i1++;
          goto _L102
_L51:
        i1++;
          goto _L103
_L71:
        obj1 = null;
          goto _L92
_L81:
        l++;
          goto _L104
_L80:
        j++;
          goto _L105
_L83:
        obj1 = obj;
        if (j < 0) goto _L92; else goto _L106
_L106:
        obj1 = aarraylist[j];
        l = 0;
          goto _L107
_L86:
        l++;
          goto _L107
_L85:
        j--;
          goto _L83
_L89:
        obj3 = (PKIXPolicyNode)((List) (obj2)).get(l);
        if ("2.5.29.32.0".equals(((PKIXPolicyNode) (obj3)).getValidPolicy()))
        {
            obj3 = ((PKIXPolicyNode) (obj3)).getChildren();
            do
            {
                if (!((Iterator) (obj3)).hasNext())
                {
                    break;
                }
                obj4 = (PKIXPolicyNode)((Iterator) (obj3)).next();
                if (!"2.5.29.32.0".equals(((PKIXPolicyNode) (obj4)).getValidPolicy()))
                {
                    ((Set) (obj1)).add(obj4);
                }
            } while (true);
        }
        l++;
          goto _L108
_L90:
        j++;
          goto _L109
_L93:
        obj1 = obj;
        if (j < 0) goto _L92; else goto _L110
_L110:
        obj1 = aarraylist[j];
        l = 0;
          goto _L96
    }

    private void checkSignatures()
    {
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certPathValidDate", new Object[] {
            new TrustedInput(validDate), new TrustedInput(new Date())
        }));
        Object obj;
        Object obj3;
        obj3 = (X509Certificate)certs.get(certs.size() - 1);
        obj = getTrustAnchors(((X509Certificate) (obj3)), pkixParams.getTrustAnchors());
        if (((Collection) (obj)).size() <= 1) goto _L2; else goto _L1
_L1:
        addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.conflictingTrustAnchors", new Object[] {
            Integers.valueOf(((Collection) (obj)).size()), new UntrustedInput(((X509Certificate) (obj3)).getIssuerX500Principal())
        }));
        obj = null;
_L9:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1641;
        }
        obj3 = ((TrustAnchor) (obj)).getTrustedCert();
        if (obj3 == null) goto _L4; else goto _L3
_L3:
        obj1 = getSubjectPrincipal(((X509Certificate) (obj3)));
_L13:
        obj2 = obj1;
_L14:
        obj1 = obj2;
        if (obj3 != null)
        {
            obj3 = ((X509Certificate) (obj3)).getKeyUsage();
            obj1 = obj2;
            if (obj3 != null)
            {
                obj1 = obj2;
                if (obj3[5] == 0)
                {
                    addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.trustKeyUsage"));
                    obj1 = obj2;
                }
            }
        }
_L25:
        Object obj4;
        Object obj5;
        X509Certificate x509certificate;
        Object obj6;
        int i;
        int j;
        obj2 = null;
        obj3 = null;
        if (obj != null)
        {
            obj3 = ((TrustAnchor) (obj)).getTrustedCert();
            ASN1Primitive asn1primitive;
            if (obj3 != null)
            {
                obj2 = ((X509Certificate) (obj3)).getPublicKey();
            } else
            {
                obj2 = ((TrustAnchor) (obj)).getCAPublicKey();
            }
            try
            {
                AlgorithmIdentifier algorithmidentifier = getAlgorithmIdentifier(((PublicKey) (obj2)));
                algorithmidentifier.getObjectId();
                algorithmidentifier.getParameters();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj4)
            {
                addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.trustPubKeyError"));
            }
        }
        i = certs.size() - 1;
        obj4 = obj2;
        obj2 = obj1;
        obj1 = obj4;
_L20:
        if (i < 0) goto _L6; else goto _L5
_L5:
        j = n;
        x509certificate = (X509Certificate)certs.get(i);
        if (obj1 != null)
        {
            try
            {
                CertPathValidatorUtilities.verifyX509Certificate(x509certificate, ((PublicKey) (obj1)), pkixParams.getSigProvider());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj4)
            {
                addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.signatureNotVerified", new Object[] {
                    ((GeneralSecurityException) (obj4)).getMessage(), obj4, obj4.getClass().getName()
                }), i);
            }
        } else
        {
label0:
            {
                if (!isSelfIssued(x509certificate))
                {
                    break label0;
                }
                try
                {
                    CertPathValidatorUtilities.verifyX509Certificate(x509certificate, x509certificate.getPublicKey(), pkixParams.getSigProvider());
                    addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.rootKeyIsValidButNotATrustAnchor"), i);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj4)
                {
                    addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.signatureNotVerified", new Object[] {
                        ((GeneralSecurityException) (obj4)).getMessage(), obj4, obj4.getClass().getName()
                    }), i);
                }
            }
        }
_L15:
        try
        {
            x509certificate.checkValidity(validDate);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj4)
        {
            addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certificateNotYetValid", new Object[] {
                new TrustedInput(x509certificate.getNotBefore())
            }), i);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj4)
        {
            addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certificateExpired", new Object[] {
                new TrustedInput(x509certificate.getNotAfter())
            }), i);
        }
        if (!pkixParams.isRevocationEnabled()) goto _L8; else goto _L7
_L7:
        obj5 = null;
        obj6 = getExtensionValue(x509certificate, CRL_DIST_POINTS);
        obj4 = obj5;
        if (obj6 != null)
        {
            try
            {
                obj4 = CRLDistPoint.getInstance(obj6);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj4)
            {
                addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlDistPtExtError"), i);
                obj4 = obj5;
            }
        }
        obj6 = null;
        asn1primitive = getExtensionValue(x509certificate, AUTH_INFO_ACCESS);
        break MISSING_BLOCK_LABEL_394;
_L2:
        if (!((Collection) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_552;
        }
        addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noTrustAnchorFound", new Object[] {
            new UntrustedInput(((X509Certificate) (obj3)).getIssuerX500Principal()), Integers.valueOf(pkixParams.getTrustAnchors().size())
        }));
        obj = null;
          goto _L9
        obj = (TrustAnchor)((Collection) (obj)).iterator().next();
        if (((TrustAnchor) (obj)).getTrustedCert() == null) goto _L11; else goto _L10
_L10:
        obj1 = ((TrustAnchor) (obj)).getTrustedCert().getPublicKey();
_L12:
        CertPathValidatorUtilities.verifyX509Certificate(((X509Certificate) (obj3)), ((PublicKey) (obj1)), pkixParams.getSigProvider());
          goto _L9
        obj1;
        addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.trustButInvalidCert"));
          goto _L9
        obj1;
_L24:
        addError(((CertPathReviewerException) (obj1)).getErrorMessage());
          goto _L9
_L11:
        obj1 = ((TrustAnchor) (obj)).getCAPublicKey();
          goto _L12
        obj2;
        obj = obj1;
        obj1 = obj2;
_L23:
        addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.unknown", new Object[] {
            new UntrustedInput(((Throwable) (obj1)).getMessage()), new UntrustedInput(obj1)
        }));
          goto _L9
_L4:
        obj1 = new X500Principal(((TrustAnchor) (obj)).getCAName());
          goto _L13
        obj1;
        addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.trustDNInvalid", new Object[] {
            new UntrustedInput(((TrustAnchor) (obj)).getCAName())
        }));
        obj2 = null;
          goto _L14
        obj4 = new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.NoIssuerPublicKey");
        obj5 = x509certificate.getExtensionValue(X509Extensions.AuthorityKeyIdentifier.getId());
        if (obj5 == null)
        {
            break MISSING_BLOCK_LABEL_1067;
        }
        obj5 = AuthorityKeyIdentifier.getInstance(X509ExtensionUtil.fromExtensionValue(((byte []) (obj5))));
        obj6 = ((AuthorityKeyIdentifier) (obj5)).getAuthorityCertIssuer();
        if (obj6 == null)
        {
            break MISSING_BLOCK_LABEL_1067;
        }
        obj6 = ((GeneralNames) (obj6)).getNames()[0];
        obj5 = ((AuthorityKeyIdentifier) (obj5)).getAuthorityCertSerialNumber();
        CertPathValidatorException certpathvalidatorexception;
        if (obj5 != null)
        {
            try
            {
                ((ErrorBundle) (obj4)).setExtraArguments(new Object[] {
                    new LocaleString("org.bouncycastle.x509.CertPathReviewerMessages", "missingIssuer"), " \"", obj6, "\" ", new LocaleString("org.bouncycastle.x509.CertPathReviewerMessages", "missingSerial"), " ", obj5
                });
            }
            catch (IOException ioexception) { }
        }
        addError(((ErrorBundle) (obj4)), i);
          goto _L15
        obj5 = obj6;
        if (asn1primitive != null)
        {
            try
            {
                obj5 = AuthorityInformationAccess.getInstance(asn1primitive);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj5)
            {
                addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlAuthInfoAccError"), i);
                obj5 = obj6;
            }
        }
        obj4 = getCRLDistUrls(((CRLDistPoint) (obj4)));
        obj5 = getOCSPUrls(((AuthorityInformationAccess) (obj5)));
        for (obj6 = ((Vector) (obj4)).iterator(); ((Iterator) (obj6)).hasNext(); addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlDistPoint", new Object[] {
    new UntrustedUrlInput(((Iterator) (obj6)).next())
}), i)) { }
        for (Iterator iterator = ((Vector) (obj5)).iterator(); iterator.hasNext(); addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.ocspLocation", new Object[] {
    new UntrustedUrlInput(iterator.next())
}), i)) { }
        try
        {
            checkRevocation(pkixParams, x509certificate, validDate, ((X509Certificate) (obj3)), ((PublicKey) (obj1)), ((Vector) (obj4)), ((Vector) (obj5)), i);
        }
        catch (CertPathReviewerException certpathreviewerexception)
        {
            addError(certpathreviewerexception.getErrorMessage(), i);
        }
_L8:
        if (obj2 != null && !x509certificate.getIssuerX500Principal().equals(obj2))
        {
            addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certWrongIssuer", new Object[] {
                ((X500Principal) (obj2)).getName(), x509certificate.getIssuerX500Principal().getName()
            }), i);
        }
        if (j - i == n) goto _L17; else goto _L16
_L16:
        if (x509certificate != null && x509certificate.getVersion() == 1)
        {
            addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noCACert"), i);
        }
        obj2 = BasicConstraints.getInstance(getExtensionValue(x509certificate, BASIC_CONSTRAINTS));
        if (obj2 == null) goto _L19; else goto _L18
_L18:
        try
        {
            if (!((BasicConstraints) (obj2)).isCA())
            {
                addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noCACert"), i);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.errorProcesingBC"), i);
        }
        obj2 = x509certificate.getKeyUsage();
        if (obj2 != null && obj2[5] == 0)
        {
            addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noCertSign"), i);
        }
_L17:
        obj2 = x509certificate.getSubjectX500Principal();
        obj3 = getNextWorkingKey(certs, i);
        obj1 = obj3;
        obj3 = getAlgorithmIdentifier(((PublicKey) (obj1)));
        ((AlgorithmIdentifier) (obj3)).getObjectId();
        ((AlgorithmIdentifier) (obj3)).getParameters();
_L21:
        i--;
        obj3 = x509certificate;
          goto _L20
_L19:
        addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noBasicConstraints"), i);
        break MISSING_BLOCK_LABEL_1439;
        certpathvalidatorexception;
_L22:
        addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.pubKeyError"), i);
          goto _L21
_L6:
        trustAnchor = ((TrustAnchor) (obj));
        subjectPublicKey = ((PublicKey) (obj1));
        return;
        certpathvalidatorexception;
          goto _L22
        obj1;
          goto _L23
        obj1;
        obj = obj2;
          goto _L24
        obj1;
          goto _L9
        obj1 = null;
          goto _L25
    }

    private X509CRL getCRL(String s)
    {
        try
        {
            Object obj = new URL(s);
            if (((URL) (obj)).getProtocol().equals("http") || ((URL) (obj)).getProtocol().equals("https"))
            {
                obj = (HttpURLConnection)((URL) (obj)).openConnection();
                ((HttpURLConnection) (obj)).setUseCaches(false);
                ((HttpURLConnection) (obj)).setDoInput(true);
                ((HttpURLConnection) (obj)).connect();
                if (((HttpURLConnection) (obj)).getResponseCode() == 200)
                {
                    return (X509CRL)CertificateFactory.getInstance("X.509", "BC").generateCRL(((HttpURLConnection) (obj)).getInputStream());
                } else
                {
                    throw new Exception(((HttpURLConnection) (obj)).getResponseMessage());
                }
            }
        }
        catch (Exception exception)
        {
            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.loadCrlDistPointError", new Object[] {
                new UntrustedInput(s), exception.getMessage(), exception, exception.getClass().getName()
            }));
        }
        return null;
    }

    private boolean processQcStatements(X509Certificate x509certificate, int i)
    {
        int j;
        boolean flag;
        boolean flag1;
        ASN1Sequence asn1sequence;
        try
        {
            asn1sequence = (ASN1Sequence)getExtensionValue(x509certificate, QC_STATEMENT);
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.QcStatementExtError"), i);
            return false;
        }
        j = 0;
        flag = false;
_L3:
        if (j >= asn1sequence.size())
        {
            break MISSING_BLOCK_LABEL_370;
        }
        x509certificate = QCStatement.getInstance(asn1sequence.getObjectAt(j));
        if (!QCStatement.id_etsi_qcs_QcCompliance.equals(x509certificate.getStatementId()))
        {
            break MISSING_BLOCK_LABEL_76;
        }
        addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.QcEuCompliance"), i);
        flag1 = flag;
        break MISSING_BLOCK_LABEL_379;
        flag1 = flag;
        if (QCStatement.id_qcs_pkixQCSyntax_v1.equals(x509certificate.getStatementId()))
        {
            break MISSING_BLOCK_LABEL_379;
        }
        if (!QCStatement.id_etsi_qcs_QcSSCD.equals(x509certificate.getStatementId()))
        {
            break MISSING_BLOCK_LABEL_150;
        }
        addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.QcSSCD"), i);
        flag1 = flag;
        break MISSING_BLOCK_LABEL_379;
        double d;
        if (!QCStatement.id_etsi_qcs_LimiteValue.equals(x509certificate.getStatementId()))
        {
            break MISSING_BLOCK_LABEL_325;
        }
        x509certificate = MonetaryValue.getInstance(x509certificate.getStatementInfo());
        x509certificate.getCurrency();
        d = x509certificate.getAmount().doubleValue() * Math.pow(10D, x509certificate.getExponent().doubleValue());
        if (!x509certificate.getCurrency().isAlphabetic())
        {
            break MISSING_BLOCK_LABEL_270;
        }
        x509certificate = new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.QcLimitValueAlpha", new Object[] {
            x509certificate.getCurrency().getAlphabetic(), new TrustedInput(new Double(d)), x509certificate
        });
_L1:
        addNotification(x509certificate, i);
        flag1 = flag;
        break MISSING_BLOCK_LABEL_379;
        x509certificate = new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.QcLimitValueNum", new Object[] {
            Integers.valueOf(x509certificate.getCurrency().getNumeric()), new TrustedInput(new Double(d)), x509certificate
        });
          goto _L1
        addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.QcUnknownStatement", new Object[] {
            x509certificate.getStatementId(), new UntrustedInput(x509certificate)
        }), i);
        flag1 = true;
        break MISSING_BLOCK_LABEL_379;
        return !flag;
        j++;
        flag = flag1;
        if (true) goto _L3; else goto _L2
_L2:
    }

    protected void addError(ErrorBundle errorbundle)
    {
        errors[0].add(errorbundle);
    }

    protected void addError(ErrorBundle errorbundle, int i)
    {
        if (i < -1 || i >= n)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            errors[i + 1].add(errorbundle);
            return;
        }
    }

    protected void addNotification(ErrorBundle errorbundle)
    {
        notifications[0].add(errorbundle);
    }

    protected void addNotification(ErrorBundle errorbundle, int i)
    {
        if (i < -1 || i >= n)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            notifications[i + 1].add(errorbundle);
            return;
        }
    }

    protected void checkCRLs(PKIXParameters pkixparameters, X509Certificate x509certificate, Date date, X509Certificate x509certificate1, PublicKey publickey, Vector vector, int i)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        int j;
        int k;
        obj2 = new X509CRLStoreSelector();
        try
        {
            ((X509CRLStoreSelector) (obj2)).addIssuerName(getEncodedIssuerPrincipal(x509certificate).getEncoded());
        }
        // Misplaced declaration of an exception variable
        catch (PKIXParameters pkixparameters)
        {
            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlIssuerException"), pkixparameters);
        }
        ((X509CRLStoreSelector) (obj2)).setCertificateChecking(x509certificate);
        obj3 = CRL_UTIL.findCRLs(((X509CRLStoreSelector) (obj2)), pkixparameters);
        obj = ((Collection) (obj3)).iterator();
        obj1 = obj;
        if (!((Collection) (obj3)).isEmpty()) goto _L2; else goto _L1
_L1:
        obj1 = CRL_UTIL.findCRLs(new X509CRLStoreSelector(), pkixparameters).iterator();
        obj3 = new ArrayList();
        for (; ((Iterator) (obj1)).hasNext(); ((List) (obj3)).add(((X509CRL)((Iterator) (obj1)).next()).getIssuerX500Principal())) { }
          goto _L3
        obj;
        addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlExtractionError", new Object[] {
            ((AnnotatedException) (obj)).getCause().getMessage(), ((AnnotatedException) (obj)).getCause(), ((AnnotatedException) (obj)).getCause().getClass().getName()
        }), i);
        obj1 = (new ArrayList()).iterator();
_L2:
        obj = null;
_L14:
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_1714;
        }
        obj = (X509CRL)((Iterator) (obj1)).next();
        if (((X509CRL) (obj)).getNextUpdate() != null && !pkixparameters.getDate().before(((X509CRL) (obj)).getNextUpdate())) goto _L5; else goto _L4
_L4:
        addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.localValidCRL", new Object[] {
            new TrustedInput(((X509CRL) (obj)).getThisUpdate()), new TrustedInput(((X509CRL) (obj)).getNextUpdate())
        }), i);
        j = 1;
_L24:
        if (j != 0) goto _L7; else goto _L6
_L6:
        obj1 = vector.iterator();
_L11:
        if (!((Iterator) (obj1)).hasNext()) goto _L9; else goto _L8
_L8:
        k = j;
        obj2 = (String)((Iterator) (obj1)).next();
        k = j;
        vector = getCRL(((String) (obj2)));
        if (vector == null) goto _L11; else goto _L10
_L10:
        k = j;
        if (x509certificate.getIssuerX500Principal().equals(vector.getIssuerX500Principal())) goto _L13; else goto _L12
_L12:
        k = j;
        try
        {
            addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.onlineCRLWrongCA", new Object[] {
                new UntrustedInput(vector.getIssuerX500Principal().getName()), new UntrustedInput(x509certificate.getIssuerX500Principal().getName()), new UntrustedUrlInput(obj2)
            }), i);
        }
        // Misplaced declaration of an exception variable
        catch (Vector vector)
        {
            addNotification(vector.getErrorMessage(), i);
            j = k;
        }
          goto _L11
_L3:
        j = ((List) (obj3)).size();
        addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noCrlInCertstore", new Object[] {
            new UntrustedInput(((X509CRLStoreSelector) (obj2)).getIssuerNames()), new UntrustedInput(obj3), Integers.valueOf(j)
        }), i);
        obj1 = obj;
          goto _L2
_L5:
        addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.localInvalidCRL", new Object[] {
            new TrustedInput(((X509CRL) (obj)).getThisUpdate()), new TrustedInput(((X509CRL) (obj)).getNextUpdate())
        }), i);
          goto _L14
_L13:
        k = j;
        if (vector.getNextUpdate() == null) goto _L16; else goto _L15
_L15:
        k = j;
        if (!pkixParams.getDate().before(vector.getNextUpdate())) goto _L17; else goto _L16
_L16:
        k = 1;
        addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.onlineValidCRL", new Object[] {
            new TrustedInput(vector.getThisUpdate()), new TrustedInput(vector.getNextUpdate()), new UntrustedUrlInput(obj2)
        }), i);
        j = 1;
_L23:
        if (vector == null) goto _L19; else goto _L18
_L17:
        k = j;
        addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.onlineInvalidCRL", new Object[] {
            new TrustedInput(vector.getThisUpdate()), new TrustedInput(vector.getNextUpdate()), new UntrustedUrlInput(obj2)
        }), i);
          goto _L11
_L18:
        if (x509certificate1 != null)
        {
            x509certificate1 = x509certificate1.getKeyUsage();
            if (x509certificate1 != null && (x509certificate1.length < 7 || x509certificate1[6] == 0))
            {
                throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noCrlSigningPermited"));
            }
        }
        if (publickey != null)
        {
            try
            {
                vector.verify(publickey, "BC");
            }
            // Misplaced declaration of an exception variable
            catch (PKIXParameters pkixparameters)
            {
                throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlVerifyFailed"), pkixparameters);
            }
            obj = vector.getRevokedCertificate(x509certificate.getSerialNumber());
            if (obj != null)
            {
                publickey = null;
                x509certificate1 = publickey;
                if (((X509CRLEntry) (obj)).hasExtensions())
                {
                    org.bouncycastle.asn1.ASN1Enumerated asn1enumerated;
                    try
                    {
                        asn1enumerated = DEREnumerated.getInstance(getExtensionValue(((java.security.cert.X509Extension) (obj)), X509Extensions.ReasonCode.getId()));
                    }
                    // Misplaced declaration of an exception variable
                    catch (PKIXParameters pkixparameters)
                    {
                        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlReasonExtError"), pkixparameters);
                    }
                    x509certificate1 = publickey;
                    if (asn1enumerated != null)
                    {
                        x509certificate1 = crlReasons[asn1enumerated.getValue().intValue()];
                    }
                }
                publickey = x509certificate1;
                if (x509certificate1 == null)
                {
                    publickey = crlReasons[7];
                }
                x509certificate1 = new LocaleString("org.bouncycastle.x509.CertPathReviewerMessages", publickey);
                if (!date.before(((X509CRLEntry) (obj)).getRevocationDate()))
                {
                    throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certRevoked", new Object[] {
                        new TrustedInput(((X509CRLEntry) (obj)).getRevocationDate()), x509certificate1
                    }));
                }
                addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.revokedAfterValidation", new Object[] {
                    new TrustedInput(((X509CRLEntry) (obj)).getRevocationDate()), x509certificate1
                }), i);
            } else
            {
                addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.notRevoked"), i);
            }
            {
                if (vector.getNextUpdate() != null && vector.getNextUpdate().before(pkixParams.getDate()))
                {
                    addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlUpdateAvailable", new Object[] {
                        new TrustedInput(vector.getNextUpdate())
                    }), i);
                }
                try
                {
                    date = getExtensionValue(vector, ISSUING_DISTRIBUTION_POINT);
                }
                // Misplaced declaration of an exception variable
                catch (PKIXParameters pkixparameters)
                {
                    throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.distrPtExtError"));
                }
                try
                {
                    x509certificate1 = getExtensionValue(vector, DELTA_CRL_INDICATOR);
                }
                // Misplaced declaration of an exception variable
                catch (PKIXParameters pkixparameters)
                {
                    throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.deltaCrlExtError"));
                }
                if (x509certificate1 == null)
                {
                    break MISSING_BLOCK_LABEL_1523;
                }
                publickey = new X509CRLStoreSelector();
                try
                {
                    publickey.addIssuerName(getIssuerPrincipal(vector).getEncoded());
                }
                // Misplaced declaration of an exception variable
                catch (PKIXParameters pkixparameters)
                {
                    throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlIssuerException"), pkixparameters);
                }
                publickey.setMinCRLNumber(((DERInteger)x509certificate1).getPositiveValue());
                try
                {
                    publickey.setMaxCRLNumber(((DERInteger)getExtensionValue(vector, CRL_NUMBER)).getPositiveValue().subtract(BigInteger.valueOf(1L)));
                }
                // Misplaced declaration of an exception variable
                catch (PKIXParameters pkixparameters)
                {
                    throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlNbrExtError"), pkixparameters);
                }
                try
                {
                    pkixparameters = CRL_UTIL.findCRLs(publickey, pkixparameters).iterator();
                }
                // Misplaced declaration of an exception variable
                catch (PKIXParameters pkixparameters)
                {
                    throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlExtractionError"), pkixparameters);
                }
            }
        } else
        {
            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlNoIssuerPublicKey"));
        }
_L21:
        if (pkixparameters.hasNext())
        {
            x509certificate1 = (X509CRL)pkixparameters.next();
            try
            {
                x509certificate1 = getExtensionValue(x509certificate1, ISSUING_DISTRIBUTION_POINT);
            }
            // Misplaced declaration of an exception variable
            catch (PKIXParameters pkixparameters)
            {
                throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.distrPtExtError"), pkixparameters);
            }
            if (date != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (x509certificate1 != null)
            {
                break MISSING_BLOCK_LABEL_1290;
            }
            i = 1;
        } else
        {
            i = 0;
        }
_L22:
        if (i == 0)
        {
            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noBaseCRL"));
        }
        break MISSING_BLOCK_LABEL_1523;
        if (!date.equals(x509certificate1)) goto _L21; else goto _L20
_L20:
        i = 1;
          goto _L22
          goto _L21
        if (date != null)
        {
            pkixparameters = IssuingDistributionPoint.getInstance(date);
            try
            {
                x509certificate = BasicConstraints.getInstance(getExtensionValue(x509certificate, BASIC_CONSTRAINTS));
            }
            // Misplaced declaration of an exception variable
            catch (PKIXParameters pkixparameters)
            {
                throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlBCExtError"), pkixparameters);
            }
            if (pkixparameters.onlyContainsUserCerts() && x509certificate != null && x509certificate.isCA())
            {
                throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlOnlyUserCert"));
            }
            if (pkixparameters.onlyContainsCACerts() && (x509certificate == null || !x509certificate.isCA()))
            {
                throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlOnlyCaCert"));
            }
            if (pkixparameters.onlyContainsAttributeCerts())
            {
                throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlOnlyAttrCert"));
            }
        }
_L19:
        if (j == 0)
        {
            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noValidCrlFound"));
        } else
        {
            return;
        }
_L9:
        vector = ((Vector) (obj));
          goto _L23
_L7:
        vector = ((Vector) (obj));
          goto _L23
        j = 0;
          goto _L24
    }

    protected void checkRevocation(PKIXParameters pkixparameters, X509Certificate x509certificate, Date date, X509Certificate x509certificate1, PublicKey publickey, Vector vector, Vector vector1, 
            int i)
    {
        checkCRLs(pkixparameters, x509certificate, date, x509certificate1, publickey, vector, i);
    }

    protected void doChecks()
    {
        if (!initialized)
        {
            throw new IllegalStateException("Object not initialized. Call init() first.");
        }
        if (notifications == null)
        {
            notifications = new List[n + 1];
            errors = new List[n + 1];
            for (int i = 0; i < notifications.length; i++)
            {
                notifications[i] = new ArrayList();
                errors[i] = new ArrayList();
            }

            checkSignatures();
            checkNameConstraints();
            checkPathLength();
            checkPolicy();
            checkCriticalExtensions();
        }
    }

    protected Vector getCRLDistUrls(CRLDistPoint crldistpoint)
    {
        Vector vector = new Vector();
        if (crldistpoint != null)
        {
            crldistpoint = crldistpoint.getDistributionPoints();
            for (int i = 0; i < crldistpoint.length; i++)
            {
                DistributionPointName distributionpointname = crldistpoint[i].getDistributionPoint();
                if (distributionpointname.getType() != 0)
                {
                    continue;
                }
                GeneralName ageneralname[] = GeneralNames.getInstance(distributionpointname.getName()).getNames();
                for (int j = 0; j < ageneralname.length; j++)
                {
                    if (ageneralname[j].getTagNo() == 6)
                    {
                        vector.add(((DERIA5String)ageneralname[j].getName()).getString());
                    }
                }

            }

        }
        return vector;
    }

    public CertPath getCertPath()
    {
        return certPath;
    }

    public int getCertPathSize()
    {
        return n;
    }

    public List getErrors(int i)
    {
        doChecks();
        return errors[i + 1];
    }

    public List[] getErrors()
    {
        doChecks();
        return errors;
    }

    public List getNotifications(int i)
    {
        doChecks();
        return notifications[i + 1];
    }

    public List[] getNotifications()
    {
        doChecks();
        return notifications;
    }

    protected Vector getOCSPUrls(AuthorityInformationAccess authorityinformationaccess)
    {
        Vector vector = new Vector();
        if (authorityinformationaccess != null)
        {
            authorityinformationaccess = authorityinformationaccess.getAccessDescriptions();
            for (int i = 0; i < authorityinformationaccess.length; i++)
            {
                if (!authorityinformationaccess[i].getAccessMethod().equals(AccessDescription.id_ad_ocsp))
                {
                    continue;
                }
                GeneralName generalname = authorityinformationaccess[i].getAccessLocation();
                if (generalname.getTagNo() == 6)
                {
                    vector.add(((DERIA5String)generalname.getName()).getString());
                }
            }

        }
        return vector;
    }

    public PolicyNode getPolicyTree()
    {
        doChecks();
        return policyTree;
    }

    public PublicKey getSubjectPublicKey()
    {
        doChecks();
        return subjectPublicKey;
    }

    public TrustAnchor getTrustAnchor()
    {
        doChecks();
        return trustAnchor;
    }

    protected Collection getTrustAnchors(X509Certificate x509certificate, Set set)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        set = set.iterator();
        X509CertSelector x509certselector = new X509CertSelector();
        byte abyte0[];
        AuthorityKeyIdentifier authoritykeyidentifier;
        try
        {
            x509certselector.setSubject(getEncodedIssuerPrincipal(x509certificate).getEncoded());
            abyte0 = x509certificate.getExtensionValue(X509Extensions.AuthorityKeyIdentifier.getId());
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.trustAnchorIssuerError"));
        }
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        authoritykeyidentifier = AuthorityKeyIdentifier.getInstance(ASN1Primitive.fromByteArray(((ASN1OctetString)ASN1Primitive.fromByteArray(abyte0)).getOctets()));
        x509certselector.setSerialNumber(authoritykeyidentifier.getAuthorityCertSerialNumber());
        authoritykeyidentifier = authoritykeyidentifier.getKeyIdentifier();
        if (authoritykeyidentifier == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        x509certselector.setSubjectKeyIdentifier((new DEROctetString(authoritykeyidentifier)).getEncoded());
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            TrustAnchor trustanchor = (TrustAnchor)set.next();
            if (trustanchor.getTrustedCert() != null)
            {
                if (x509certselector.match(trustanchor.getTrustedCert()))
                {
                    arraylist.add(trustanchor);
                }
            } else
            if (trustanchor.getCAName() != null && trustanchor.getCAPublicKey() != null && getEncodedIssuerPrincipal(x509certificate).equals(new X500Principal(trustanchor.getCAName())))
            {
                arraylist.add(trustanchor);
            }
        } while (true);
        return arraylist;
    }

    public void init(CertPath certpath, PKIXParameters pkixparameters)
    {
        if (initialized)
        {
            throw new IllegalStateException("object is already initialized!");
        }
        initialized = true;
        if (certpath == null)
        {
            throw new NullPointerException("certPath was null");
        }
        certPath = certpath;
        certs = certpath.getCertificates();
        n = certs.size();
        if (certs.isEmpty())
        {
            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.emptyCertPath"));
        } else
        {
            pkixParams = (PKIXParameters)pkixparameters.clone();
            validDate = getValidDate(pkixParams);
            notifications = null;
            errors = null;
            trustAnchor = null;
            subjectPublicKey = null;
            policyTree = null;
            return;
        }
    }

    public boolean isValidCertPath()
    {
        doChecks();
        for (int i = 0; i < errors.length; i++)
        {
            if (!errors[i].isEmpty())
            {
                return false;
            }
        }

        return true;
    }

    static 
    {
        QC_STATEMENT = X509Extensions.QCStatements.getId();
        CRL_DIST_POINTS = X509Extensions.CRLDistributionPoints.getId();
        AUTH_INFO_ACCESS = X509Extensions.AuthorityInfoAccess.getId();
    }
}
