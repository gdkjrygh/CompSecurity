// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.jce.provider:
//            PKIXNameConstraintValidatorException

public class PKIXNameConstraintValidator
{

    private Set excludedSubtreesDN;
    private Set excludedSubtreesDNS;
    private Set excludedSubtreesEmail;
    private Set excludedSubtreesIP;
    private Set excludedSubtreesURI;
    private Set permittedSubtreesDN;
    private Set permittedSubtreesDNS;
    private Set permittedSubtreesEmail;
    private Set permittedSubtreesIP;
    private Set permittedSubtreesURI;

    public PKIXNameConstraintValidator()
    {
        excludedSubtreesDN = new HashSet();
        excludedSubtreesDNS = new HashSet();
        excludedSubtreesEmail = new HashSet();
        excludedSubtreesURI = new HashSet();
        excludedSubtreesIP = new HashSet();
    }

    private void checkExcludedDN(Set set, ASN1Sequence asn1sequence)
    {
        if (!set.isEmpty())
        {
            set = set.iterator();
            while (set.hasNext()) 
            {
                if (withinDNSubtree(asn1sequence, (ASN1Sequence)set.next()))
                {
                    throw new PKIXNameConstraintValidatorException("Subject distinguished name is from an excluded subtree");
                }
            }
        }
    }

    private void checkExcludedDNS(Set set, String s)
    {
        if (!set.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        set = set.iterator();
        String s1;
        do
        {
            if (!set.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s1 = (String)set.next();
        } while (!withinDomain(s, s1) && !s.equalsIgnoreCase(s1));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        throw new PKIXNameConstraintValidatorException("DNS is from an excluded subtree.");
    }

    private void checkExcludedEmail(Set set, String s)
    {
        if (!set.isEmpty())
        {
            set = set.iterator();
            while (set.hasNext()) 
            {
                if (emailIsConstrained(s, (String)set.next()))
                {
                    throw new PKIXNameConstraintValidatorException("Email address is from an excluded subtree.");
                }
            }
        }
    }

    private void checkExcludedIP(Set set, byte abyte0[])
    {
        if (!set.isEmpty())
        {
            set = set.iterator();
            while (set.hasNext()) 
            {
                if (isIPConstrained(abyte0, (byte[])(byte[])set.next()))
                {
                    throw new PKIXNameConstraintValidatorException("IP is from an excluded subtree.");
                }
            }
        }
    }

    private void checkExcludedURI(Set set, String s)
    {
        if (!set.isEmpty())
        {
            set = set.iterator();
            while (set.hasNext()) 
            {
                if (isUriConstrained(s, (String)set.next()))
                {
                    throw new PKIXNameConstraintValidatorException("URI is from an excluded subtree.");
                }
            }
        }
    }

    private void checkPermittedDN(Set set, ASN1Sequence asn1sequence)
    {
        while (set == null || set.isEmpty() && asn1sequence.size() == 0) 
        {
            return;
        }
        for (set = set.iterator(); set.hasNext();)
        {
            if (withinDNSubtree(asn1sequence, (ASN1Sequence)set.next()))
            {
                return;
            }
        }

        throw new PKIXNameConstraintValidatorException("Subject distinguished name is not from a permitted subtree");
    }

    private void checkPermittedDNS(Set set, String s)
    {
        if (set != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator = set.iterator();
        String s1;
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s1 = (String)iterator.next();
        } while (!withinDomain(s, s1) && !s.equalsIgnoreCase(s1));
        return;
        if (s.length() == 0 && set.size() == 0) goto _L1; else goto _L3
_L3:
        throw new PKIXNameConstraintValidatorException("DNS is not from a permitted subtree.");
    }

    private void checkPermittedEmail(Set set, String s)
    {
        if (set != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator = set.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
        } while (!emailIsConstrained(s, (String)iterator.next()));
        return;
        if (s.length() == 0 && set.size() == 0) goto _L1; else goto _L3
_L3:
        throw new PKIXNameConstraintValidatorException("Subject email address is not from a permitted subtree.");
    }

    private void checkPermittedIP(Set set, byte abyte0[])
    {
        if (set != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator = set.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
        } while (!isIPConstrained(abyte0, (byte[])(byte[])iterator.next()));
        return;
        if (abyte0.length == 0 && set.size() == 0) goto _L1; else goto _L3
_L3:
        throw new PKIXNameConstraintValidatorException("IP is not from a permitted subtree.");
    }

    private void checkPermittedURI(Set set, String s)
    {
        if (set != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator = set.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
        } while (!isUriConstrained(s, (String)iterator.next()));
        return;
        if (s.length() == 0 && set.size() == 0) goto _L1; else goto _L3
_L3:
        throw new PKIXNameConstraintValidatorException("URI is not from a permitted subtree.");
    }

    private boolean collectionsAreEqual(Collection collection, Collection collection1)
    {
        if (collection != collection1) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (collection == null || collection1 == null)
        {
            return false;
        }
        if (collection.size() != collection1.size())
        {
            return false;
        }
        collection = collection.iterator();
_L4:
        if (!collection.hasNext()) goto _L1; else goto _L3
_L3:
        boolean flag;
        Object obj = collection.next();
        Iterator iterator = collection1.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_100;
            }
        } while (!equals(obj, iterator.next()));
        flag = true;
_L5:
        if (!flag)
        {
            return false;
        }
          goto _L4
          goto _L1
        flag = false;
          goto _L5
    }

    private static int compareTo(byte abyte0[], byte abyte1[])
    {
        if (Arrays.areEqual(abyte0, abyte1))
        {
            return 0;
        }
        return !Arrays.areEqual(max(abyte0, abyte1), abyte0) ? -1 : 1;
    }

    private boolean emailIsConstrained(String s, String s1)
    {
        String s2 = s.substring(s.indexOf('@') + 1);
        if (s1.indexOf('@') == -1) goto _L2; else goto _L1
_L1:
        if (!s.equalsIgnoreCase(s1)) goto _L4; else goto _L3
_L3:
        return true;
_L2:
        if (s1.charAt(0) == '.') goto _L6; else goto _L5
_L5:
        if (s2.equalsIgnoreCase(s1)) goto _L3; else goto _L4
_L4:
        return false;
_L6:
        if (withinDomain(s2, s1))
        {
            return true;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    private boolean equals(Object obj, Object obj1)
    {
        if (obj == obj1)
        {
            return true;
        }
        if (obj == null || obj1 == null)
        {
            return false;
        }
        if ((obj instanceof byte[]) && (obj1 instanceof byte[]))
        {
            return Arrays.areEqual((byte[])(byte[])obj, (byte[])(byte[])obj1);
        } else
        {
            return obj.equals(obj1);
        }
    }

    private static String extractHostFromURL(String s)
    {
        String s1 = s.substring(s.indexOf(':') + 1);
        s = s1;
        if (s1.indexOf("//") != -1)
        {
            s = s1.substring(s1.indexOf("//") + 2);
        }
        s1 = s;
        if (s.lastIndexOf(':') != -1)
        {
            s1 = s.substring(0, s.lastIndexOf(':'));
        }
        s = s1.substring(s1.indexOf(':') + 1);
        s1 = s.substring(s.indexOf('@') + 1);
        s = s1;
        if (s1.indexOf('/') != -1)
        {
            s = s1.substring(0, s1.indexOf('/'));
        }
        return s;
    }

    private byte[][] extractIPsAndSubnetMasks(byte abyte0[], byte abyte1[])
    {
        int i = abyte0.length / 2;
        byte abyte2[] = new byte[i];
        byte abyte3[] = new byte[i];
        System.arraycopy(abyte0, 0, abyte2, 0, i);
        System.arraycopy(abyte0, i, abyte3, 0, i);
        abyte0 = new byte[i];
        byte abyte4[] = new byte[i];
        System.arraycopy(abyte1, 0, abyte0, 0, i);
        System.arraycopy(abyte1, i, abyte4, 0, i);
        return (new byte[][] {
            abyte2, abyte3, abyte0, abyte4
        });
    }

    private String extractNameAsString(GeneralName generalname)
    {
        return DERIA5String.getInstance(generalname.getName()).getString();
    }

    private int hashCollection(Collection collection)
    {
        if (collection == null)
        {
            return 0;
        }
        collection = collection.iterator();
        int i = 0;
        while (collection.hasNext()) 
        {
            Object obj = collection.next();
            if (obj instanceof byte[])
            {
                i = Arrays.hashCode((byte[])(byte[])obj) + i;
            } else
            {
                i = obj.hashCode() + i;
            }
        }
        return i;
    }

    private Set intersectDN(Set set, Set set1)
    {
        HashSet hashset = new HashSet();
        for (set1 = set1.iterator(); set1.hasNext();)
        {
            ASN1Sequence asn1sequence = ASN1Sequence.getInstance(((GeneralSubtree)set1.next()).getBase().getName().toASN1Primitive());
            if (set == null)
            {
                if (asn1sequence != null)
                {
                    hashset.add(asn1sequence);
                }
            } else
            {
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) 
                {
                    ASN1Sequence asn1sequence1 = (ASN1Sequence)iterator.next();
                    if (withinDNSubtree(asn1sequence, asn1sequence1))
                    {
                        hashset.add(asn1sequence);
                    } else
                    if (withinDNSubtree(asn1sequence1, asn1sequence))
                    {
                        hashset.add(asn1sequence1);
                    }
                }
            }
        }

        return hashset;
    }

    private Set intersectDNS(Set set, Set set1)
    {
        HashSet hashset = new HashSet();
        for (set1 = set1.iterator(); set1.hasNext();)
        {
            String s = extractNameAsString(((GeneralSubtree)set1.next()).getBase());
            if (set == null)
            {
                if (s != null)
                {
                    hashset.add(s);
                }
            } else
            {
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) 
                {
                    String s1 = (String)iterator.next();
                    if (withinDomain(s1, s))
                    {
                        hashset.add(s1);
                    } else
                    if (withinDomain(s, s1))
                    {
                        hashset.add(s);
                    }
                }
            }
        }

        return hashset;
    }

    private Set intersectEmail(Set set, Set set1)
    {
        HashSet hashset = new HashSet();
        set1 = set1.iterator();
        do
        {
            if (!set1.hasNext())
            {
                break;
            }
            String s = extractNameAsString(((GeneralSubtree)set1.next()).getBase());
            if (set == null)
            {
                if (s != null)
                {
                    hashset.add(s);
                }
            } else
            {
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) 
                {
                    intersectEmail(s, (String)iterator.next(), ((Set) (hashset)));
                }
            }
        } while (true);
        return hashset;
    }

    private void intersectEmail(String s, String s1, Set set)
    {
        if (s.indexOf('@') == -1) goto _L2; else goto _L1
_L1:
        String s2 = s.substring(s.indexOf('@') + 1);
        if (s1.indexOf('@') == -1) goto _L4; else goto _L3
_L3:
        if (s.equalsIgnoreCase(s1))
        {
            set.add(s);
        }
_L6:
        return;
_L4:
        if (!s1.startsWith("."))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (withinDomain(s2, s1))
        {
            set.add(s);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!s2.equalsIgnoreCase(s1)) goto _L6; else goto _L5
_L5:
        set.add(s);
        return;
_L2:
        if (s.startsWith("."))
        {
            if (s1.indexOf('@') != -1)
            {
                if (withinDomain(s1.substring(s.indexOf('@') + 1), s))
                {
                    set.add(s1);
                    return;
                }
            } else
            {
                if (!s1.startsWith("."))
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (withinDomain(s, s1) || s.equalsIgnoreCase(s1))
                {
                    set.add(s);
                    return;
                }
                if (withinDomain(s1, s))
                {
                    set.add(s1);
                    return;
                }
            }
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_216;
        if (!withinDomain(s1, s)) goto _L6; else goto _L7
_L7:
        set.add(s1);
        return;
        if (s1.indexOf('@') == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s1.substring(s1.indexOf('@') + 1).equalsIgnoreCase(s))
        {
            set.add(s1);
            return;
        }
        if (true) goto _L6; else goto _L8
_L8:
        if (!s1.startsWith("."))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!withinDomain(s, s1)) goto _L6; else goto _L9
_L9:
        set.add(s);
        return;
        if (!s.equalsIgnoreCase(s1)) goto _L6; else goto _L10
_L10:
        set.add(s);
        return;
    }

    private Set intersectIP(Set set, Set set1)
    {
        HashSet hashset = new HashSet();
        set1 = set1.iterator();
        do
        {
            if (!set1.hasNext())
            {
                break;
            }
            byte abyte0[] = ASN1OctetString.getInstance(((GeneralSubtree)set1.next()).getBase().getName()).getOctets();
            if (set == null)
            {
                if (abyte0 != null)
                {
                    hashset.add(abyte0);
                }
            } else
            {
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) 
                {
                    hashset.addAll(intersectIPRange((byte[])(byte[])iterator.next(), abyte0));
                }
            }
        } while (true);
        return hashset;
    }

    private Set intersectIPRange(byte abyte0[], byte abyte1[])
    {
        if (abyte0.length != abyte1.length)
        {
            return Collections.EMPTY_SET;
        }
        abyte1 = extractIPsAndSubnetMasks(abyte0, abyte1);
        Object obj = abyte1[0];
        abyte0 = abyte1[1];
        byte abyte2[] = abyte1[2];
        abyte1 = abyte1[3];
        obj = minMaxIPs(((byte []) (obj)), abyte0, abyte2, abyte1);
        abyte2 = min(obj[1], obj[3]);
        if (compareTo(max(obj[0], obj[2]), abyte2) == 1)
        {
            return Collections.EMPTY_SET;
        } else
        {
            return Collections.singleton(ipWithSubnetMask(or(obj[0], obj[2]), or(abyte0, abyte1)));
        }
    }

    private Set intersectURI(Set set, Set set1)
    {
        HashSet hashset = new HashSet();
        set1 = set1.iterator();
        do
        {
            if (!set1.hasNext())
            {
                break;
            }
            String s = extractNameAsString(((GeneralSubtree)set1.next()).getBase());
            if (set == null)
            {
                if (s != null)
                {
                    hashset.add(s);
                }
            } else
            {
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) 
                {
                    intersectURI((String)iterator.next(), s, ((Set) (hashset)));
                }
            }
        } while (true);
        return hashset;
    }

    private void intersectURI(String s, String s1, Set set)
    {
        if (s.indexOf('@') == -1) goto _L2; else goto _L1
_L1:
        String s2 = s.substring(s.indexOf('@') + 1);
        if (s1.indexOf('@') == -1) goto _L4; else goto _L3
_L3:
        if (s.equalsIgnoreCase(s1))
        {
            set.add(s);
        }
_L6:
        return;
_L4:
        if (!s1.startsWith("."))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (withinDomain(s2, s1))
        {
            set.add(s);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!s2.equalsIgnoreCase(s1)) goto _L6; else goto _L5
_L5:
        set.add(s);
        return;
_L2:
        if (s.startsWith("."))
        {
            if (s1.indexOf('@') != -1)
            {
                if (withinDomain(s1.substring(s.indexOf('@') + 1), s))
                {
                    set.add(s1);
                    return;
                }
            } else
            {
                if (!s1.startsWith("."))
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (withinDomain(s, s1) || s.equalsIgnoreCase(s1))
                {
                    set.add(s);
                    return;
                }
                if (withinDomain(s1, s))
                {
                    set.add(s1);
                    return;
                }
            }
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_216;
        if (!withinDomain(s1, s)) goto _L6; else goto _L7
_L7:
        set.add(s1);
        return;
        if (s1.indexOf('@') == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s1.substring(s1.indexOf('@') + 1).equalsIgnoreCase(s))
        {
            set.add(s1);
            return;
        }
        if (true) goto _L6; else goto _L8
_L8:
        if (!s1.startsWith("."))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!withinDomain(s, s1)) goto _L6; else goto _L9
_L9:
        set.add(s);
        return;
        if (!s.equalsIgnoreCase(s1)) goto _L6; else goto _L10
_L10:
        set.add(s);
        return;
    }

    private byte[] ipWithSubnetMask(byte abyte0[], byte abyte1[])
    {
        int i = abyte0.length;
        byte abyte2[] = new byte[i * 2];
        System.arraycopy(abyte0, 0, abyte2, 0, i);
        System.arraycopy(abyte1, 0, abyte2, i, i);
        return abyte2;
    }

    private boolean isIPConstrained(byte abyte0[], byte abyte1[])
    {
        int i = 0;
        int j = abyte0.length;
        if (j != abyte1.length / 2)
        {
            return false;
        }
        byte abyte2[] = new byte[j];
        System.arraycopy(abyte1, j, abyte2, 0, j);
        byte abyte3[] = new byte[j];
        byte abyte4[] = new byte[j];
        for (; i < j; i++)
        {
            abyte3[i] = (byte)(abyte1[i] & abyte2[i]);
            abyte4[i] = (byte)(abyte0[i] & abyte2[i]);
        }

        return Arrays.areEqual(abyte3, abyte4);
    }

    private boolean isUriConstrained(String s, String s1)
    {
        s = extractHostFromURL(s);
        return s1.startsWith(".") ? withinDomain(s, s1) : s.equalsIgnoreCase(s1);
    }

    private static byte[] max(byte abyte0[], byte abyte1[])
    {
        for (int i = 0; i < abyte0.length; i++)
        {
            if ((abyte0[i] & 0xffff) > (abyte1[i] & 0xffff))
            {
                return abyte0;
            }
        }

        return abyte1;
    }

    private static byte[] min(byte abyte0[], byte abyte1[])
    {
        for (int i = 0; i < abyte0.length; i++)
        {
            if ((abyte0[i] & 0xffff) < (abyte1[i] & 0xffff))
            {
                return abyte0;
            }
        }

        return abyte1;
    }

    private byte[][] minMaxIPs(byte abyte0[], byte abyte1[], byte abyte2[], byte abyte3[])
    {
        int j = abyte0.length;
        byte abyte4[] = new byte[j];
        byte abyte5[] = new byte[j];
        byte abyte6[] = new byte[j];
        byte abyte7[] = new byte[j];
        for (int i = 0; i < j; i++)
        {
            abyte4[i] = (byte)(abyte0[i] & abyte1[i]);
            abyte5[i] = (byte)(abyte0[i] & abyte1[i] | ~abyte1[i]);
            abyte6[i] = (byte)(abyte2[i] & abyte3[i]);
            abyte7[i] = (byte)(abyte2[i] & abyte3[i] | ~abyte3[i]);
        }

        return (new byte[][] {
            abyte4, abyte5, abyte6, abyte7
        });
    }

    private static byte[] or(byte abyte0[], byte abyte1[])
    {
        byte abyte2[] = new byte[abyte0.length];
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte2[i] = (byte)(abyte0[i] | abyte1[i]);
        }

        return abyte2;
    }

    private String stringifyIP(byte abyte0[])
    {
        String s = "";
        for (int i = 0; i < abyte0.length / 2; i++)
        {
            s = (new StringBuilder()).append(s).append(Integer.toString(abyte0[i] & 0xff)).append(".").toString();
        }

        s = s.substring(0, s.length() - 1);
        s = (new StringBuilder()).append(s).append("/").toString();
        for (int j = abyte0.length / 2; j < abyte0.length; j++)
        {
            s = (new StringBuilder()).append(s).append(Integer.toString(abyte0[j] & 0xff)).append(".").toString();
        }

        return s.substring(0, s.length() - 1);
    }

    private String stringifyIPCollection(Set set)
    {
        Object obj = (new StringBuilder()).append("").append("[").toString();
        Iterator iterator = set.iterator();
        for (set = ((Set) (obj)); iterator.hasNext(); set = (new StringBuilder()).append(set).append(stringifyIP((byte[])(byte[])iterator.next())).append(",").toString()) { }
        obj = set;
        if (set.length() > 1)
        {
            obj = set.substring(0, set.length() - 1);
        }
        return (new StringBuilder()).append(((String) (obj))).append("]").toString();
    }

    private Set unionDN(Set set, ASN1Sequence asn1sequence)
    {
        if (set.isEmpty())
        {
            if (asn1sequence == null)
            {
                return set;
            } else
            {
                set.add(asn1sequence);
                return set;
            }
        }
        HashSet hashset = new HashSet();
        for (set = set.iterator(); set.hasNext();)
        {
            ASN1Sequence asn1sequence1 = (ASN1Sequence)set.next();
            if (withinDNSubtree(asn1sequence, asn1sequence1))
            {
                hashset.add(asn1sequence1);
            } else
            if (withinDNSubtree(asn1sequence1, asn1sequence))
            {
                hashset.add(asn1sequence);
            } else
            {
                hashset.add(asn1sequence1);
                hashset.add(asn1sequence);
            }
        }

        return hashset;
    }

    private Set unionEmail(Set set, String s)
    {
        if (set.isEmpty())
        {
            if (s == null)
            {
                return set;
            } else
            {
                set.add(s);
                return set;
            }
        }
        HashSet hashset = new HashSet();
        for (set = set.iterator(); set.hasNext(); unionEmail((String)set.next(), s, ((Set) (hashset)))) { }
        return hashset;
    }

    private void unionEmail(String s, String s1, Set set)
    {
        if (s.indexOf('@') != -1)
        {
            String s2 = s.substring(s.indexOf('@') + 1);
            if (s1.indexOf('@') != -1)
            {
                if (s.equalsIgnoreCase(s1))
                {
                    set.add(s);
                    return;
                } else
                {
                    set.add(s);
                    set.add(s1);
                    return;
                }
            }
            if (s1.startsWith("."))
            {
                if (withinDomain(s2, s1))
                {
                    set.add(s1);
                    return;
                } else
                {
                    set.add(s);
                    set.add(s1);
                    return;
                }
            }
            if (s2.equalsIgnoreCase(s1))
            {
                set.add(s1);
                return;
            } else
            {
                set.add(s);
                set.add(s1);
                return;
            }
        }
        if (s.startsWith("."))
        {
            if (s1.indexOf('@') != -1)
            {
                if (withinDomain(s1.substring(s.indexOf('@') + 1), s))
                {
                    set.add(s);
                    return;
                } else
                {
                    set.add(s);
                    set.add(s1);
                    return;
                }
            }
            if (s1.startsWith("."))
            {
                if (withinDomain(s, s1) || s.equalsIgnoreCase(s1))
                {
                    set.add(s1);
                    return;
                }
                if (withinDomain(s1, s))
                {
                    set.add(s);
                    return;
                } else
                {
                    set.add(s);
                    set.add(s1);
                    return;
                }
            }
            if (withinDomain(s1, s))
            {
                set.add(s);
                return;
            } else
            {
                set.add(s);
                set.add(s1);
                return;
            }
        }
        if (s1.indexOf('@') != -1)
        {
            if (s1.substring(s.indexOf('@') + 1).equalsIgnoreCase(s))
            {
                set.add(s);
                return;
            } else
            {
                set.add(s);
                set.add(s1);
                return;
            }
        }
        if (s1.startsWith("."))
        {
            if (withinDomain(s, s1))
            {
                set.add(s1);
                return;
            } else
            {
                set.add(s);
                set.add(s1);
                return;
            }
        }
        if (s.equalsIgnoreCase(s1))
        {
            set.add(s);
            return;
        } else
        {
            set.add(s);
            set.add(s1);
            return;
        }
    }

    private Set unionIP(Set set, byte abyte0[])
    {
        if (set.isEmpty())
        {
            if (abyte0 == null)
            {
                return set;
            } else
            {
                set.add(abyte0);
                return set;
            }
        }
        HashSet hashset = new HashSet();
        for (set = set.iterator(); set.hasNext(); hashset.addAll(unionIPRange((byte[])(byte[])set.next(), abyte0))) { }
        return hashset;
    }

    private Set unionIPRange(byte abyte0[], byte abyte1[])
    {
        HashSet hashset = new HashSet();
        if (Arrays.areEqual(abyte0, abyte1))
        {
            hashset.add(abyte0);
            return hashset;
        } else
        {
            hashset.add(abyte0);
            hashset.add(abyte1);
            return hashset;
        }
    }

    private Set unionURI(Set set, String s)
    {
        if (set.isEmpty())
        {
            if (s == null)
            {
                return set;
            } else
            {
                set.add(s);
                return set;
            }
        }
        HashSet hashset = new HashSet();
        for (set = set.iterator(); set.hasNext(); unionURI((String)set.next(), s, ((Set) (hashset)))) { }
        return hashset;
    }

    private void unionURI(String s, String s1, Set set)
    {
        if (s.indexOf('@') != -1)
        {
            String s2 = s.substring(s.indexOf('@') + 1);
            if (s1.indexOf('@') != -1)
            {
                if (s.equalsIgnoreCase(s1))
                {
                    set.add(s);
                    return;
                } else
                {
                    set.add(s);
                    set.add(s1);
                    return;
                }
            }
            if (s1.startsWith("."))
            {
                if (withinDomain(s2, s1))
                {
                    set.add(s1);
                    return;
                } else
                {
                    set.add(s);
                    set.add(s1);
                    return;
                }
            }
            if (s2.equalsIgnoreCase(s1))
            {
                set.add(s1);
                return;
            } else
            {
                set.add(s);
                set.add(s1);
                return;
            }
        }
        if (s.startsWith("."))
        {
            if (s1.indexOf('@') != -1)
            {
                if (withinDomain(s1.substring(s.indexOf('@') + 1), s))
                {
                    set.add(s);
                    return;
                } else
                {
                    set.add(s);
                    set.add(s1);
                    return;
                }
            }
            if (s1.startsWith("."))
            {
                if (withinDomain(s, s1) || s.equalsIgnoreCase(s1))
                {
                    set.add(s1);
                    return;
                }
                if (withinDomain(s1, s))
                {
                    set.add(s);
                    return;
                } else
                {
                    set.add(s);
                    set.add(s1);
                    return;
                }
            }
            if (withinDomain(s1, s))
            {
                set.add(s);
                return;
            } else
            {
                set.add(s);
                set.add(s1);
                return;
            }
        }
        if (s1.indexOf('@') != -1)
        {
            if (s1.substring(s.indexOf('@') + 1).equalsIgnoreCase(s))
            {
                set.add(s);
                return;
            } else
            {
                set.add(s);
                set.add(s1);
                return;
            }
        }
        if (s1.startsWith("."))
        {
            if (withinDomain(s, s1))
            {
                set.add(s1);
                return;
            } else
            {
                set.add(s);
                set.add(s1);
                return;
            }
        }
        if (s.equalsIgnoreCase(s1))
        {
            set.add(s);
            return;
        } else
        {
            set.add(s);
            set.add(s1);
            return;
        }
    }

    private static boolean withinDNSubtree(ASN1Sequence asn1sequence, ASN1Sequence asn1sequence1)
    {
_L2:
        return false;
        if (asn1sequence1.size() < 1 || asn1sequence1.size() > asn1sequence.size()) goto _L2; else goto _L1
_L1:
        int i = asn1sequence1.size() - 1;
label0:
        do
        {
label1:
            {
                if (i < 0)
                {
                    break label1;
                }
                if (!asn1sequence1.getObjectAt(i).equals(asn1sequence.getObjectAt(i)))
                {
                    break label0;
                }
                i--;
            }
        } while (true);
        if (true) goto _L2; else goto _L3
_L3:
        return true;
    }

    private boolean withinDomain(String s, String s1)
    {
        String s2 = s1;
        if (s1.startsWith("."))
        {
            s2 = s1.substring(1);
        }
        s1 = Strings.split(s2, '.');
        s = Strings.split(s, '.');
        if (s.length <= s1.length)
        {
            return false;
        }
        int j = s.length - s1.length;
        for (int i = -1; i < s1.length; i++)
        {
            if (i == -1)
            {
                if (s[i + j].equals(""))
                {
                    return false;
                }
                continue;
            }
            if (!s1[i].equalsIgnoreCase(s[i + j]))
            {
                return false;
            }
        }

        return true;
    }

    public void addExcludedSubtree(GeneralSubtree generalsubtree)
    {
        generalsubtree = generalsubtree.getBase();
        switch (generalsubtree.getTagNo())
        {
        case 3: // '\003'
        case 5: // '\005'
        default:
            return;

        case 1: // '\001'
            excludedSubtreesEmail = unionEmail(excludedSubtreesEmail, extractNameAsString(generalsubtree));
            return;

        case 2: // '\002'
            excludedSubtreesDNS = unionDNS(excludedSubtreesDNS, extractNameAsString(generalsubtree));
            return;

        case 4: // '\004'
            excludedSubtreesDN = unionDN(excludedSubtreesDN, (ASN1Sequence)generalsubtree.getName().toASN1Primitive());
            return;

        case 6: // '\006'
            excludedSubtreesURI = unionURI(excludedSubtreesURI, extractNameAsString(generalsubtree));
            return;

        case 7: // '\007'
            excludedSubtreesIP = unionIP(excludedSubtreesIP, ASN1OctetString.getInstance(generalsubtree.getName()).getOctets());
            break;
        }
    }

    public void checkExcluded(GeneralName generalname)
    {
        switch (generalname.getTagNo())
        {
        case 3: // '\003'
        case 5: // '\005'
        default:
            return;

        case 1: // '\001'
            checkExcludedEmail(excludedSubtreesEmail, extractNameAsString(generalname));
            return;

        case 2: // '\002'
            checkExcludedDNS(excludedSubtreesDNS, DERIA5String.getInstance(generalname.getName()).getString());
            return;

        case 4: // '\004'
            checkExcludedDN(ASN1Sequence.getInstance(generalname.getName().toASN1Primitive()));
            return;

        case 6: // '\006'
            checkExcludedURI(excludedSubtreesURI, DERIA5String.getInstance(generalname.getName()).getString());
            return;

        case 7: // '\007'
            generalname = ASN1OctetString.getInstance(generalname.getName()).getOctets();
            break;
        }
        checkExcludedIP(excludedSubtreesIP, generalname);
    }

    public void checkExcludedDN(ASN1Sequence asn1sequence)
    {
        checkExcludedDN(excludedSubtreesDN, asn1sequence);
    }

    public void checkPermitted(GeneralName generalname)
    {
        switch (generalname.getTagNo())
        {
        case 3: // '\003'
        case 5: // '\005'
        default:
            return;

        case 1: // '\001'
            checkPermittedEmail(permittedSubtreesEmail, extractNameAsString(generalname));
            return;

        case 2: // '\002'
            checkPermittedDNS(permittedSubtreesDNS, DERIA5String.getInstance(generalname.getName()).getString());
            return;

        case 4: // '\004'
            checkPermittedDN(ASN1Sequence.getInstance(generalname.getName().toASN1Primitive()));
            return;

        case 6: // '\006'
            checkPermittedURI(permittedSubtreesURI, DERIA5String.getInstance(generalname.getName()).getString());
            return;

        case 7: // '\007'
            generalname = ASN1OctetString.getInstance(generalname.getName()).getOctets();
            break;
        }
        checkPermittedIP(permittedSubtreesIP, generalname);
    }

    public void checkPermittedDN(ASN1Sequence asn1sequence)
    {
        checkPermittedDN(permittedSubtreesDN, asn1sequence);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PKIXNameConstraintValidator)
        {
            if (collectionsAreEqual(((PKIXNameConstraintValidator) (obj = (PKIXNameConstraintValidator)obj)).excludedSubtreesDN, excludedSubtreesDN) && collectionsAreEqual(((PKIXNameConstraintValidator) (obj)).excludedSubtreesDNS, excludedSubtreesDNS) && collectionsAreEqual(((PKIXNameConstraintValidator) (obj)).excludedSubtreesEmail, excludedSubtreesEmail) && collectionsAreEqual(((PKIXNameConstraintValidator) (obj)).excludedSubtreesIP, excludedSubtreesIP) && collectionsAreEqual(((PKIXNameConstraintValidator) (obj)).excludedSubtreesURI, excludedSubtreesURI) && collectionsAreEqual(((PKIXNameConstraintValidator) (obj)).permittedSubtreesDN, permittedSubtreesDN) && collectionsAreEqual(((PKIXNameConstraintValidator) (obj)).permittedSubtreesDNS, permittedSubtreesDNS) && collectionsAreEqual(((PKIXNameConstraintValidator) (obj)).permittedSubtreesEmail, permittedSubtreesEmail) && collectionsAreEqual(((PKIXNameConstraintValidator) (obj)).permittedSubtreesIP, permittedSubtreesIP) && collectionsAreEqual(((PKIXNameConstraintValidator) (obj)).permittedSubtreesURI, permittedSubtreesURI))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return hashCollection(excludedSubtreesDN) + hashCollection(excludedSubtreesDNS) + hashCollection(excludedSubtreesEmail) + hashCollection(excludedSubtreesIP) + hashCollection(excludedSubtreesURI) + hashCollection(permittedSubtreesDN) + hashCollection(permittedSubtreesDNS) + hashCollection(permittedSubtreesEmail) + hashCollection(permittedSubtreesIP) + hashCollection(permittedSubtreesURI);
    }

    public void intersectEmptyPermittedSubtree(int i)
    {
        switch (i)
        {
        case 3: // '\003'
        case 5: // '\005'
        default:
            return;

        case 1: // '\001'
            permittedSubtreesEmail = new HashSet();
            return;

        case 2: // '\002'
            permittedSubtreesDNS = new HashSet();
            return;

        case 4: // '\004'
            permittedSubtreesDN = new HashSet();
            return;

        case 6: // '\006'
            permittedSubtreesURI = new HashSet();
            return;

        case 7: // '\007'
            permittedSubtreesIP = new HashSet();
            break;
        }
    }

    public void intersectPermittedSubtree(GeneralSubtree generalsubtree)
    {
        intersectPermittedSubtree(new GeneralSubtree[] {
            generalsubtree
        });
    }

    public void intersectPermittedSubtree(GeneralSubtree ageneralsubtree[])
    {
        HashMap hashmap = new HashMap();
        for (int i = 0; i != ageneralsubtree.length; i++)
        {
            GeneralSubtree generalsubtree = ageneralsubtree[i];
            Integer integer = Integers.valueOf(generalsubtree.getBase().getTagNo());
            if (hashmap.get(integer) == null)
            {
                hashmap.put(integer, new HashSet());
            }
            ((Set)hashmap.get(integer)).add(generalsubtree);
        }

        ageneralsubtree = hashmap.entrySet().iterator();
        do
        {
            if (!ageneralsubtree.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)ageneralsubtree.next();
            switch (((Integer)entry.getKey()).intValue())
            {
            case 1: // '\001'
                permittedSubtreesEmail = intersectEmail(permittedSubtreesEmail, (Set)entry.getValue());
                break;

            case 2: // '\002'
                permittedSubtreesDNS = intersectDNS(permittedSubtreesDNS, (Set)entry.getValue());
                break;

            case 4: // '\004'
                permittedSubtreesDN = intersectDN(permittedSubtreesDN, (Set)entry.getValue());
                break;

            case 6: // '\006'
                permittedSubtreesURI = intersectURI(permittedSubtreesURI, (Set)entry.getValue());
                break;

            case 7: // '\007'
                permittedSubtreesIP = intersectIP(permittedSubtreesIP, (Set)entry.getValue());
                break;
            }
        } while (true);
    }

    public String toString()
    {
        String s1 = (new StringBuilder()).append("").append("permitted:\n").toString();
        String s = s1;
        if (permittedSubtreesDN != null)
        {
            s = (new StringBuilder()).append(s1).append("DN:\n").toString();
            s = (new StringBuilder()).append(s).append(permittedSubtreesDN.toString()).append("\n").toString();
        }
        s1 = s;
        if (permittedSubtreesDNS != null)
        {
            s = (new StringBuilder()).append(s).append("DNS:\n").toString();
            s1 = (new StringBuilder()).append(s).append(permittedSubtreesDNS.toString()).append("\n").toString();
        }
        s = s1;
        if (permittedSubtreesEmail != null)
        {
            s = (new StringBuilder()).append(s1).append("Email:\n").toString();
            s = (new StringBuilder()).append(s).append(permittedSubtreesEmail.toString()).append("\n").toString();
        }
        s1 = s;
        if (permittedSubtreesURI != null)
        {
            s = (new StringBuilder()).append(s).append("URI:\n").toString();
            s1 = (new StringBuilder()).append(s).append(permittedSubtreesURI.toString()).append("\n").toString();
        }
        s = s1;
        if (permittedSubtreesIP != null)
        {
            s = (new StringBuilder()).append(s1).append("IP:\n").toString();
            s = (new StringBuilder()).append(s).append(stringifyIPCollection(permittedSubtreesIP)).append("\n").toString();
        }
        s1 = (new StringBuilder()).append(s).append("excluded:\n").toString();
        s = s1;
        if (!excludedSubtreesDN.isEmpty())
        {
            s = (new StringBuilder()).append(s1).append("DN:\n").toString();
            s = (new StringBuilder()).append(s).append(excludedSubtreesDN.toString()).append("\n").toString();
        }
        s1 = s;
        if (!excludedSubtreesDNS.isEmpty())
        {
            s = (new StringBuilder()).append(s).append("DNS:\n").toString();
            s1 = (new StringBuilder()).append(s).append(excludedSubtreesDNS.toString()).append("\n").toString();
        }
        s = s1;
        if (!excludedSubtreesEmail.isEmpty())
        {
            s = (new StringBuilder()).append(s1).append("Email:\n").toString();
            s = (new StringBuilder()).append(s).append(excludedSubtreesEmail.toString()).append("\n").toString();
        }
        s1 = s;
        if (!excludedSubtreesURI.isEmpty())
        {
            s = (new StringBuilder()).append(s).append("URI:\n").toString();
            s1 = (new StringBuilder()).append(s).append(excludedSubtreesURI.toString()).append("\n").toString();
        }
        s = s1;
        if (!excludedSubtreesIP.isEmpty())
        {
            s = (new StringBuilder()).append(s1).append("IP:\n").toString();
            s = (new StringBuilder()).append(s).append(stringifyIPCollection(excludedSubtreesIP)).append("\n").toString();
        }
        return s;
    }

    protected Set unionDNS(Set set, String s)
    {
        if (set.isEmpty())
        {
            if (s == null)
            {
                return set;
            } else
            {
                set.add(s);
                return set;
            }
        }
        HashSet hashset = new HashSet();
        for (set = set.iterator(); set.hasNext();)
        {
            String s1 = (String)set.next();
            if (withinDomain(s1, s))
            {
                hashset.add(s);
            } else
            if (withinDomain(s, s1))
            {
                hashset.add(s1);
            } else
            {
                hashset.add(s1);
                hashset.add(s);
            }
        }

        return hashset;
    }
}
