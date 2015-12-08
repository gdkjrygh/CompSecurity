// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERUniversalString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            X509ObjectIdentifiers, X509DefaultEntryConverter, X509NameTokenizer, X509NameEntryConverter

public class X509Name extends ASN1Object
{

    public static final ASN1ObjectIdentifier BUSINESS_CATEGORY;
    public static final ASN1ObjectIdentifier C;
    public static final ASN1ObjectIdentifier CN;
    public static final ASN1ObjectIdentifier COUNTRY_OF_CITIZENSHIP;
    public static final ASN1ObjectIdentifier COUNTRY_OF_RESIDENCE;
    public static final ASN1ObjectIdentifier DATE_OF_BIRTH;
    public static final ASN1ObjectIdentifier DC;
    public static final ASN1ObjectIdentifier DMD_NAME = new ASN1ObjectIdentifier("2.5.4.54");
    public static final ASN1ObjectIdentifier DN_QUALIFIER;
    public static final Hashtable DefaultLookUp;
    public static boolean DefaultReverse = false;
    public static final Hashtable DefaultSymbols;
    public static final ASN1ObjectIdentifier E;
    public static final ASN1ObjectIdentifier EmailAddress;
    private static final Boolean FALSE = new Boolean(false);
    public static final ASN1ObjectIdentifier GENDER;
    public static final ASN1ObjectIdentifier GENERATION;
    public static final ASN1ObjectIdentifier GIVENNAME;
    public static final ASN1ObjectIdentifier INITIALS;
    public static final ASN1ObjectIdentifier L;
    public static final ASN1ObjectIdentifier NAME;
    public static final ASN1ObjectIdentifier NAME_AT_BIRTH;
    public static final ASN1ObjectIdentifier O;
    public static final Hashtable OIDLookUp;
    public static final ASN1ObjectIdentifier OU;
    public static final ASN1ObjectIdentifier PLACE_OF_BIRTH;
    public static final ASN1ObjectIdentifier POSTAL_ADDRESS;
    public static final ASN1ObjectIdentifier POSTAL_CODE;
    public static final ASN1ObjectIdentifier PSEUDONYM;
    public static final Hashtable RFC1779Symbols;
    public static final Hashtable RFC2253Symbols;
    public static final ASN1ObjectIdentifier SERIALNUMBER;
    public static final ASN1ObjectIdentifier SN;
    public static final ASN1ObjectIdentifier ST;
    public static final ASN1ObjectIdentifier STREET;
    public static final ASN1ObjectIdentifier SURNAME;
    public static final Hashtable SymbolLookUp;
    public static final ASN1ObjectIdentifier T;
    public static final ASN1ObjectIdentifier TELEPHONE_NUMBER;
    private static final Boolean TRUE = new Boolean(true);
    public static final ASN1ObjectIdentifier UID;
    public static final ASN1ObjectIdentifier UNIQUE_IDENTIFIER;
    public static final ASN1ObjectIdentifier UnstructuredAddress;
    public static final ASN1ObjectIdentifier UnstructuredName;
    private Vector added;
    private X509NameEntryConverter converter;
    private int hashCodeValue;
    private boolean isHashCodeCalculated;
    private Vector ordering;
    private ASN1Sequence seq;
    private Vector values;

    protected X509Name()
    {
        converter = null;
        ordering = new Vector();
        values = new Vector();
        added = new Vector();
    }

    public X509Name(String s)
    {
        this(DefaultReverse, DefaultLookUp, s);
    }

    public X509Name(String s, X509NameEntryConverter x509nameentryconverter)
    {
        this(DefaultReverse, DefaultLookUp, s, x509nameentryconverter);
    }

    public X509Name(Hashtable hashtable)
    {
        this(((Vector) (null)), hashtable);
    }

    public X509Name(Vector vector, Hashtable hashtable)
    {
        this(vector, hashtable, ((X509NameEntryConverter) (new X509DefaultEntryConverter())));
    }

    public X509Name(Vector vector, Hashtable hashtable, X509NameEntryConverter x509nameentryconverter)
    {
        int j;
        boolean flag = false;
        super();
        converter = null;
        ordering = new Vector();
        values = new Vector();
        added = new Vector();
        converter = x509nameentryconverter;
        if (vector != null)
        {
            int i = 0;
            do
            {
                j = ((flag) ? 1 : 0);
                if (i == vector.size())
                {
                    break;
                }
                ordering.addElement(vector.elementAt(i));
                added.addElement(FALSE);
                i++;
            } while (true);
        } else
        {
            vector = hashtable.keys();
            do
            {
                j = ((flag) ? 1 : 0);
                if (!vector.hasMoreElements())
                {
                    break;
                }
                ordering.addElement(vector.nextElement());
                added.addElement(FALSE);
            } while (true);
        }
_L3:
        if (j != ordering.size())
        {
            if (hashtable.get(vector = (ASN1ObjectIdentifier)ordering.elementAt(j)) == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("No attribute for object id - ").append(vector.getId()).append(" - passed to distinguished name").toString());
            }
        } else
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L2:
        values.addElement(hashtable.get(vector));
        j++;
        if (true) goto _L3; else goto _L1
_L1:
    }

    public X509Name(Vector vector, Vector vector1)
    {
        this(vector, vector1, ((X509NameEntryConverter) (new X509DefaultEntryConverter())));
    }

    public X509Name(Vector vector, Vector vector1, X509NameEntryConverter x509nameentryconverter)
    {
        converter = null;
        ordering = new Vector();
        values = new Vector();
        added = new Vector();
        converter = x509nameentryconverter;
        if (vector.size() != vector1.size())
        {
            throw new IllegalArgumentException("oids vector must be same length as values.");
        }
        for (int i = 0; i < vector.size(); i++)
        {
            ordering.addElement(vector.elementAt(i));
            values.addElement(vector1.elementAt(i));
            added.addElement(FALSE);
        }

    }

    public X509Name(ASN1Sequence asn1sequence)
    {
        converter = null;
        ordering = new Vector();
        values = new Vector();
        added = new Vector();
        seq = asn1sequence;
        for (Enumeration enumeration = asn1sequence.getObjects(); enumeration.hasMoreElements();)
        {
            ASN1Set asn1set = ASN1Set.getInstance(((ASN1Encodable)enumeration.nextElement()).toASN1Primitive());
            int i = 0;
            while (i < asn1set.size()) 
            {
                asn1sequence = ASN1Sequence.getInstance(asn1set.getObjectAt(i).toASN1Primitive());
                if (asn1sequence.size() != 2)
                {
                    throw new IllegalArgumentException("badly sized pair");
                }
                ordering.addElement(ASN1ObjectIdentifier.getInstance(asn1sequence.getObjectAt(0)));
                asn1sequence = asn1sequence.getObjectAt(1);
                if ((asn1sequence instanceof ASN1String) && !(asn1sequence instanceof DERUniversalString))
                {
                    asn1sequence = ((ASN1String)asn1sequence).getString();
                    Vector vector;
                    if (asn1sequence.length() > 0 && asn1sequence.charAt(0) == '#')
                    {
                        values.addElement((new StringBuilder()).append("\\").append(asn1sequence).toString());
                    } else
                    {
                        values.addElement(asn1sequence);
                    }
                } else
                {
                    try
                    {
                        values.addElement((new StringBuilder()).append("#").append(bytesToString(Hex.encode(asn1sequence.toASN1Primitive().getEncoded("DER")))).toString());
                    }
                    // Misplaced declaration of an exception variable
                    catch (ASN1Sequence asn1sequence)
                    {
                        throw new IllegalArgumentException("cannot encode value");
                    }
                }
                vector = added;
                if (i != 0)
                {
                    asn1sequence = TRUE;
                } else
                {
                    asn1sequence = FALSE;
                }
                vector.addElement(asn1sequence);
                i++;
            }
        }

    }

    public X509Name(boolean flag, String s)
    {
        this(flag, DefaultLookUp, s);
    }

    public X509Name(boolean flag, String s, X509NameEntryConverter x509nameentryconverter)
    {
        this(flag, DefaultLookUp, s, x509nameentryconverter);
    }

    public X509Name(boolean flag, Hashtable hashtable, String s)
    {
        this(flag, hashtable, s, ((X509NameEntryConverter) (new X509DefaultEntryConverter())));
    }

    public X509Name(boolean flag, Hashtable hashtable, String s, X509NameEntryConverter x509nameentryconverter)
    {
        converter = null;
        ordering = new Vector();
        values = new Vector();
        added = new Vector();
        converter = x509nameentryconverter;
        for (s = new X509NameTokenizer(s); s.hasMoreTokens();)
        {
            Object obj = s.nextToken();
            int i = ((String) (obj)).indexOf('=');
            if (i == -1)
            {
                throw new IllegalArgumentException("badly formatted directory string");
            }
            x509nameentryconverter = ((String) (obj)).substring(0, i);
            String s1 = ((String) (obj)).substring(i + 1);
            obj = decodeOID(x509nameentryconverter, hashtable);
            if (s1.indexOf('+') > 0)
            {
                x509nameentryconverter = new X509NameTokenizer(s1, '+');
                s1 = x509nameentryconverter.nextToken();
                ordering.addElement(obj);
                values.addElement(s1);
                added.addElement(FALSE);
                while (x509nameentryconverter.hasMoreTokens()) 
                {
                    s1 = x509nameentryconverter.nextToken();
                    int j = s1.indexOf('=');
                    obj = s1.substring(0, j);
                    s1 = s1.substring(j + 1);
                    ordering.addElement(decodeOID(((String) (obj)), hashtable));
                    values.addElement(s1);
                    added.addElement(TRUE);
                }
            } else
            {
                ordering.addElement(obj);
                values.addElement(s1);
                added.addElement(FALSE);
            }
        }

        if (flag)
        {
            hashtable = new Vector();
            s = new Vector();
            x509nameentryconverter = new Vector();
            int l = 0;
            int k = 1;
            while (l < ordering.size()) 
            {
                if (((Boolean)added.elementAt(l)).booleanValue())
                {
                    hashtable.insertElementAt(ordering.elementAt(l), k);
                    s.insertElementAt(values.elementAt(l), k);
                    x509nameentryconverter.insertElementAt(added.elementAt(l), k);
                    k++;
                } else
                {
                    hashtable.insertElementAt(ordering.elementAt(l), 0);
                    s.insertElementAt(values.elementAt(l), 0);
                    x509nameentryconverter.insertElementAt(added.elementAt(l), 0);
                    k = 1;
                }
                l++;
            }
            ordering = hashtable;
            values = s;
            added = x509nameentryconverter;
        }
    }

    private void appendValue(StringBuffer stringbuffer, Hashtable hashtable, ASN1ObjectIdentifier asn1objectidentifier, String s)
    {
        hashtable = (String)hashtable.get(asn1objectidentifier);
        int i;
        int j;
        int k;
        int i1;
        if (hashtable != null)
        {
            stringbuffer.append(hashtable);
        } else
        {
            stringbuffer.append(asn1objectidentifier.getId());
        }
        stringbuffer.append('=');
        i1 = stringbuffer.length();
        stringbuffer.append(s);
        k = stringbuffer.length();
        j = k;
        i = i1;
        if (s.length() >= 2)
        {
            j = k;
            i = i1;
            if (s.charAt(0) == '\\')
            {
                j = k;
                i = i1;
                if (s.charAt(1) == '#')
                {
                    i = i1 + 2;
                    j = k;
                }
            }
        }
        int l;
        for (; i != j; j = l)
        {
            int j1;
label0:
            {
                if (stringbuffer.charAt(i) != ',' && stringbuffer.charAt(i) != '"' && stringbuffer.charAt(i) != '\\' && stringbuffer.charAt(i) != '+' && stringbuffer.charAt(i) != '=' && stringbuffer.charAt(i) != '<' && stringbuffer.charAt(i) != '>')
                {
                    l = j;
                    j1 = i;
                    if (stringbuffer.charAt(i) != ';')
                    {
                        break label0;
                    }
                }
                stringbuffer.insert(i, "\\");
                j1 = i + 1;
                l = j + 1;
            }
            i = j1 + 1;
        }

    }

    private String bytesToString(byte abyte0[])
    {
        char ac[] = new char[abyte0.length];
        for (int i = 0; i != ac.length; i++)
        {
            ac[i] = (char)(abyte0[i] & 0xff);
        }

        return new String(ac);
    }

    private String canonicalize(String s)
    {
        s = Strings.toLowerCase(s.trim());
        if (s.length() > 0 && s.charAt(0) == '#')
        {
            ASN1Primitive asn1primitive = decodeObject(s);
            if (asn1primitive instanceof ASN1String)
            {
                return Strings.toLowerCase(((ASN1String)asn1primitive).getString().trim());
            }
        }
        return s;
    }

    private ASN1ObjectIdentifier decodeOID(String s, Hashtable hashtable)
    {
        if (Strings.toUpperCase(s).startsWith("OID."))
        {
            hashtable = new ASN1ObjectIdentifier(s.substring(4));
        } else
        {
            if (s.charAt(0) >= '0' && s.charAt(0) <= '9')
            {
                return new ASN1ObjectIdentifier(s);
            }
            ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)hashtable.get(Strings.toLowerCase(s));
            hashtable = asn1objectidentifier;
            if (asn1objectidentifier == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unknown object id - ").append(s).append(" - passed to distinguished name").toString());
            }
        }
        return hashtable;
    }

    private ASN1Primitive decodeObject(String s)
    {
        try
        {
            s = ASN1Primitive.fromByteArray(Hex.decode(s.substring(1)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalStateException((new StringBuilder()).append("unknown encoding in name: ").append(s).toString());
        }
        return s;
    }

    private boolean equivalentStrings(String s, String s1)
    {
        s = canonicalize(s);
        s1 = canonicalize(s1);
        return s.equals(s1) || stripInternalSpaces(s).equals(stripInternalSpaces(s1));
    }

    public static X509Name getInstance(Object obj)
    {
        if (obj == null || (obj instanceof X509Name))
        {
            return (X509Name)obj;
        }
        if (obj instanceof X500Name)
        {
            return new X509Name(ASN1Sequence.getInstance(((X500Name)obj).toASN1Primitive()));
        }
        if (obj != null)
        {
            return new X509Name(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static X509Name getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    private String stripInternalSpaces(String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (s.length() != 0)
        {
            char c = s.charAt(0);
            stringbuffer.append(c);
            int i = 1;
            for (char c1 = c; i < s.length(); c1 = c)
            {
                c = s.charAt(i);
                if (c1 != ' ' || c != ' ')
                {
                    stringbuffer.append(c);
                }
                i++;
            }

        }
        return stringbuffer.toString();
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        if (obj instanceof X509Name)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!(obj instanceof ASN1Sequence)) goto _L4; else goto _L3
_L3:
        int k;
        ASN1Primitive asn1primitive = ((ASN1Encodable)obj).toASN1Primitive();
        if (toASN1Primitive().equals(asn1primitive))
        {
            return true;
        }
        boolean aflag[];
        ASN1ObjectIdentifier asn1objectidentifier;
        String s;
        int i;
        byte byte0;
        int j;
        int l;
        try
        {
            obj = getInstance(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        l = ordering.size();
        flag = flag1;
        if (l != ((X509Name) (obj)).ordering.size()) goto _L4; else goto _L5
_L5:
        aflag = new boolean[l];
        if (ordering.elementAt(0).equals(((X509Name) (obj)).ordering.elementAt(0)))
        {
            byte0 = 1;
            j = l;
            i = 0;
        } else
        {
            i = l - 1;
            byte0 = -1;
            j = -1;
        }
_L14:
        if (i == j) goto _L7; else goto _L6
_L6:
        asn1objectidentifier = (ASN1ObjectIdentifier)ordering.elementAt(i);
        s = (String)values.elementAt(i);
        k = 0;
_L10:
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
          goto _L8
_L12:
        k++;
        if (true) goto _L10; else goto _L9
_L8:
        if (aflag[k] || !asn1objectidentifier.equals((ASN1ObjectIdentifier)((X509Name) (obj)).ordering.elementAt(k)) || !equivalentStrings(s, (String)((X509Name) (obj)).values.elementAt(k))) goto _L12; else goto _L11
_L11:
        aflag[k] = true;
        k = 1;
_L15:
        flag = flag1;
        if (!k) goto _L4; else goto _L13
_L13:
        i += byte0;
          goto _L14
_L7:
        return true;
_L9:
        k = 0;
          goto _L15
    }

    public boolean equals(Object obj, boolean flag)
    {
        if (!flag)
        {
            return equals(obj);
        }
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof X509Name) && !(obj instanceof ASN1Sequence))
        {
            return false;
        }
        ASN1Primitive asn1primitive = ((ASN1Encodable)obj).toASN1Primitive();
        if (toASN1Primitive().equals(asn1primitive))
        {
            return true;
        }
        int j;
        try
        {
            obj = getInstance(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        j = ordering.size();
        if (j != ((X509Name) (obj)).ordering.size())
        {
            return false;
        }
        for (int i = 0; i < j; i++)
        {
            if (((ASN1ObjectIdentifier)ordering.elementAt(i)).equals((ASN1ObjectIdentifier)((X509Name) (obj)).ordering.elementAt(i)))
            {
                if (!equivalentStrings((String)values.elementAt(i), (String)((X509Name) (obj)).values.elementAt(i)))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }

        return true;
    }

    public Vector getOIDs()
    {
        Vector vector = new Vector();
        for (int i = 0; i != ordering.size(); i++)
        {
            vector.addElement(ordering.elementAt(i));
        }

        return vector;
    }

    public Vector getValues()
    {
        Vector vector = new Vector();
        for (int i = 0; i != values.size(); i++)
        {
            vector.addElement(values.elementAt(i));
        }

        return vector;
    }

    public Vector getValues(ASN1ObjectIdentifier asn1objectidentifier)
    {
        Vector vector = new Vector();
        int i = 0;
        while (i != values.size()) 
        {
            if (ordering.elementAt(i).equals(asn1objectidentifier))
            {
                String s = (String)values.elementAt(i);
                if (s.length() > 2 && s.charAt(0) == '\\' && s.charAt(1) == '#')
                {
                    vector.addElement(s.substring(1));
                } else
                {
                    vector.addElement(s);
                }
            }
            i++;
        }
        return vector;
    }

    public int hashCode()
    {
        if (isHashCodeCalculated)
        {
            return hashCodeValue;
        }
        isHashCodeCalculated = true;
        for (int i = 0; i != ordering.size(); i++)
        {
            String s = stripInternalSpaces(canonicalize((String)values.elementAt(i)));
            hashCodeValue = hashCodeValue ^ ordering.elementAt(i).hashCode();
            int j = hashCodeValue;
            hashCodeValue = s.hashCode() ^ j;
        }

        return hashCodeValue;
    }

    public ASN1Primitive toASN1Primitive()
    {
        if (seq == null)
        {
            ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
            ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
            ASN1ObjectIdentifier asn1objectidentifier = null;
            int i = 0;
            while (i != ordering.size()) 
            {
                ASN1EncodableVector asn1encodablevector2 = new ASN1EncodableVector();
                ASN1ObjectIdentifier asn1objectidentifier1 = (ASN1ObjectIdentifier)ordering.elementAt(i);
                asn1encodablevector2.add(asn1objectidentifier1);
                String s = (String)values.elementAt(i);
                asn1encodablevector2.add(converter.getConvertedValue(asn1objectidentifier1, s));
                if (asn1objectidentifier == null || ((Boolean)added.elementAt(i)).booleanValue())
                {
                    asn1encodablevector.add(new DERSequence(asn1encodablevector2));
                } else
                {
                    asn1encodablevector1.add(new DERSet(asn1encodablevector));
                    asn1encodablevector = new ASN1EncodableVector();
                    asn1encodablevector.add(new DERSequence(asn1encodablevector2));
                }
                i++;
                asn1objectidentifier = asn1objectidentifier1;
            }
            asn1encodablevector1.add(new DERSet(asn1encodablevector));
            seq = new DERSequence(asn1encodablevector1);
        }
        return seq;
    }

    public String toString()
    {
        return toString(DefaultReverse, DefaultSymbols);
    }

    public String toString(boolean flag, Hashtable hashtable)
    {
        StringBuffer stringbuffer1 = new StringBuffer();
        Vector vector = new Vector();
        StringBuffer stringbuffer = null;
        int i = 0;
        while (i < ordering.size()) 
        {
            if (((Boolean)added.elementAt(i)).booleanValue())
            {
                stringbuffer.append('+');
                appendValue(stringbuffer, hashtable, (ASN1ObjectIdentifier)ordering.elementAt(i), (String)values.elementAt(i));
            } else
            {
                stringbuffer = new StringBuffer();
                appendValue(stringbuffer, hashtable, (ASN1ObjectIdentifier)ordering.elementAt(i), (String)values.elementAt(i));
                vector.addElement(stringbuffer);
            }
            i++;
        }
        if (flag)
        {
            int j = vector.size() - 1;
            boolean flag1 = true;
            while (j >= 0) 
            {
                if (flag1)
                {
                    flag1 = false;
                } else
                {
                    stringbuffer1.append(',');
                }
                stringbuffer1.append(vector.elementAt(j).toString());
                j--;
            }
        } else
        {
            int k = 0;
            boolean flag2 = true;
            while (k < vector.size()) 
            {
                if (flag2)
                {
                    flag2 = false;
                } else
                {
                    stringbuffer1.append(',');
                }
                stringbuffer1.append(vector.elementAt(k).toString());
                k++;
            }
        }
        return stringbuffer1.toString();
    }

    static 
    {
        C = new ASN1ObjectIdentifier("2.5.4.6");
        O = new ASN1ObjectIdentifier("2.5.4.10");
        OU = new ASN1ObjectIdentifier("2.5.4.11");
        T = new ASN1ObjectIdentifier("2.5.4.12");
        CN = new ASN1ObjectIdentifier("2.5.4.3");
        SN = new ASN1ObjectIdentifier("2.5.4.5");
        STREET = new ASN1ObjectIdentifier("2.5.4.9");
        SERIALNUMBER = SN;
        L = new ASN1ObjectIdentifier("2.5.4.7");
        ST = new ASN1ObjectIdentifier("2.5.4.8");
        SURNAME = new ASN1ObjectIdentifier("2.5.4.4");
        GIVENNAME = new ASN1ObjectIdentifier("2.5.4.42");
        INITIALS = new ASN1ObjectIdentifier("2.5.4.43");
        GENERATION = new ASN1ObjectIdentifier("2.5.4.44");
        UNIQUE_IDENTIFIER = new ASN1ObjectIdentifier("2.5.4.45");
        BUSINESS_CATEGORY = new ASN1ObjectIdentifier("2.5.4.15");
        POSTAL_CODE = new ASN1ObjectIdentifier("2.5.4.17");
        DN_QUALIFIER = new ASN1ObjectIdentifier("2.5.4.46");
        PSEUDONYM = new ASN1ObjectIdentifier("2.5.4.65");
        DATE_OF_BIRTH = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.1");
        PLACE_OF_BIRTH = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.2");
        GENDER = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.3");
        COUNTRY_OF_CITIZENSHIP = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.4");
        COUNTRY_OF_RESIDENCE = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.5");
        NAME_AT_BIRTH = new ASN1ObjectIdentifier("1.3.36.8.3.14");
        POSTAL_ADDRESS = new ASN1ObjectIdentifier("2.5.4.16");
        TELEPHONE_NUMBER = X509ObjectIdentifiers.id_at_telephoneNumber;
        NAME = X509ObjectIdentifiers.id_at_name;
        EmailAddress = PKCSObjectIdentifiers.pkcs_9_at_emailAddress;
        UnstructuredName = PKCSObjectIdentifiers.pkcs_9_at_unstructuredName;
        UnstructuredAddress = PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress;
        E = EmailAddress;
        DC = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        UID = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        DefaultSymbols = new Hashtable();
        RFC2253Symbols = new Hashtable();
        RFC1779Symbols = new Hashtable();
        DefaultLookUp = new Hashtable();
        OIDLookUp = DefaultSymbols;
        SymbolLookUp = DefaultLookUp;
        DefaultSymbols.put(C, "C");
        DefaultSymbols.put(O, "O");
        DefaultSymbols.put(T, "T");
        DefaultSymbols.put(OU, "OU");
        DefaultSymbols.put(CN, "CN");
        DefaultSymbols.put(L, "L");
        DefaultSymbols.put(ST, "ST");
        DefaultSymbols.put(SN, "SERIALNUMBER");
        DefaultSymbols.put(EmailAddress, "E");
        DefaultSymbols.put(DC, "DC");
        DefaultSymbols.put(UID, "UID");
        DefaultSymbols.put(STREET, "STREET");
        DefaultSymbols.put(SURNAME, "SURNAME");
        DefaultSymbols.put(GIVENNAME, "GIVENNAME");
        DefaultSymbols.put(INITIALS, "INITIALS");
        DefaultSymbols.put(GENERATION, "GENERATION");
        DefaultSymbols.put(UnstructuredAddress, "unstructuredAddress");
        DefaultSymbols.put(UnstructuredName, "unstructuredName");
        DefaultSymbols.put(UNIQUE_IDENTIFIER, "UniqueIdentifier");
        DefaultSymbols.put(DN_QUALIFIER, "DN");
        DefaultSymbols.put(PSEUDONYM, "Pseudonym");
        DefaultSymbols.put(POSTAL_ADDRESS, "PostalAddress");
        DefaultSymbols.put(NAME_AT_BIRTH, "NameAtBirth");
        DefaultSymbols.put(COUNTRY_OF_CITIZENSHIP, "CountryOfCitizenship");
        DefaultSymbols.put(COUNTRY_OF_RESIDENCE, "CountryOfResidence");
        DefaultSymbols.put(GENDER, "Gender");
        DefaultSymbols.put(PLACE_OF_BIRTH, "PlaceOfBirth");
        DefaultSymbols.put(DATE_OF_BIRTH, "DateOfBirth");
        DefaultSymbols.put(POSTAL_CODE, "PostalCode");
        DefaultSymbols.put(BUSINESS_CATEGORY, "BusinessCategory");
        DefaultSymbols.put(TELEPHONE_NUMBER, "TelephoneNumber");
        DefaultSymbols.put(NAME, "Name");
        RFC2253Symbols.put(C, "C");
        RFC2253Symbols.put(O, "O");
        RFC2253Symbols.put(OU, "OU");
        RFC2253Symbols.put(CN, "CN");
        RFC2253Symbols.put(L, "L");
        RFC2253Symbols.put(ST, "ST");
        RFC2253Symbols.put(STREET, "STREET");
        RFC2253Symbols.put(DC, "DC");
        RFC2253Symbols.put(UID, "UID");
        RFC1779Symbols.put(C, "C");
        RFC1779Symbols.put(O, "O");
        RFC1779Symbols.put(OU, "OU");
        RFC1779Symbols.put(CN, "CN");
        RFC1779Symbols.put(L, "L");
        RFC1779Symbols.put(ST, "ST");
        RFC1779Symbols.put(STREET, "STREET");
        DefaultLookUp.put("c", C);
        DefaultLookUp.put("o", O);
        DefaultLookUp.put("t", T);
        DefaultLookUp.put("ou", OU);
        DefaultLookUp.put("cn", CN);
        DefaultLookUp.put("l", L);
        DefaultLookUp.put("st", ST);
        DefaultLookUp.put("sn", SN);
        DefaultLookUp.put("serialnumber", SN);
        DefaultLookUp.put("street", STREET);
        DefaultLookUp.put("emailaddress", E);
        DefaultLookUp.put("dc", DC);
        DefaultLookUp.put("e", E);
        DefaultLookUp.put("uid", UID);
        DefaultLookUp.put("surname", SURNAME);
        DefaultLookUp.put("givenname", GIVENNAME);
        DefaultLookUp.put("initials", INITIALS);
        DefaultLookUp.put("generation", GENERATION);
        DefaultLookUp.put("unstructuredaddress", UnstructuredAddress);
        DefaultLookUp.put("unstructuredname", UnstructuredName);
        DefaultLookUp.put("uniqueidentifier", UNIQUE_IDENTIFIER);
        DefaultLookUp.put("dn", DN_QUALIFIER);
        DefaultLookUp.put("pseudonym", PSEUDONYM);
        DefaultLookUp.put("postaladdress", POSTAL_ADDRESS);
        DefaultLookUp.put("nameofbirth", NAME_AT_BIRTH);
        DefaultLookUp.put("countryofcitizenship", COUNTRY_OF_CITIZENSHIP);
        DefaultLookUp.put("countryofresidence", COUNTRY_OF_RESIDENCE);
        DefaultLookUp.put("gender", GENDER);
        DefaultLookUp.put("placeofbirth", PLACE_OF_BIRTH);
        DefaultLookUp.put("dateofbirth", DATE_OF_BIRTH);
        DefaultLookUp.put("postalcode", POSTAL_CODE);
        DefaultLookUp.put("businesscategory", BUSINESS_CATEGORY);
        DefaultLookUp.put("telephonenumber", TELEPHONE_NUMBER);
        DefaultLookUp.put("name", NAME);
    }
}
