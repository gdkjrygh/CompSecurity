// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xmlpull.v1;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package org.xmlpull.v1:
//            XmlPullParserException, XmlPullParser, XmlSerializer

public class XmlPullParserFactory
{

    public static final String PROPERTY_NAME = "org.xmlpull.v1.XmlPullParserFactory";
    private static final String RESOURCE_NAME = "/META-INF/services/org.xmlpull.v1.XmlPullParserFactory";
    static final Class referenceContextClass = (new XmlPullParserFactory()).getClass();
    protected String classNamesLocation;
    protected Hashtable features;
    protected Vector parserClasses;
    protected Vector serializerClasses;

    protected XmlPullParserFactory()
    {
        features = new Hashtable();
    }

    public static XmlPullParserFactory newInstance()
        throws XmlPullParserException
    {
        return newInstance(null, null);
    }

    public static XmlPullParserFactory newInstance(String s, Class class1)
        throws XmlPullParserException
    {
        Object obj;
        obj = class1;
        if (class1 == null)
        {
            obj = referenceContextClass;
        }
        if (s != null && s.length() != 0 && !"DEFAULT".equals(s)) goto _L2; else goto _L1
_L1:
        try
        {
            s = ((Class) (obj)).getResourceAsStream("/META-INF/services/org.xmlpull.v1.XmlPullParserFactory");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new XmlPullParserException(null, null, s);
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        throw new XmlPullParserException("resource not found: /META-INF/services/org.xmlpull.v1.XmlPullParserFactory make sure that parser implementing XmlPull API is available");
        class1 = new StringBuffer();
_L8:
        int i = s.read();
        if (i >= 0) goto _L4; else goto _L3
_L3:
        String s1;
        s.close();
        s1 = class1.toString();
        obj = (new StringBuilder()).append("resource /META-INF/services/org.xmlpull.v1.XmlPullParserFactory that contained '").append(s1).append("'").toString();
_L9:
        Vector vector;
        Vector vector1;
        s = null;
        vector = new Vector();
        vector1 = new Vector();
        i = 0;
_L10:
        if (i >= s1.length()) goto _L6; else goto _L5
_L5:
        Object obj2;
        String s2;
        int j;
        int k = s1.indexOf(',', i);
        j = k;
        if (k == -1)
        {
            j = s1.length();
        }
        s2 = s1.substring(i, j);
        class1 = null;
        obj2 = null;
        Class class2 = Class.forName(s2);
        class1 = class2;
        Object obj3 = class2.newInstance();
        obj2 = obj3;
        class1 = class2;
        break MISSING_BLOCK_LABEL_219;
_L4:
        if (i <= 32) goto _L8; else goto _L7
_L7:
        c = (char)i;
        class1.append(c);
          goto _L8
_L2:
        obj = (new StringBuilder()).append("parameter classNames to newInstance() that contained '").append(s).append("'").toString();
        s1 = s;
          goto _L9
_L11:
        Object obj1 = s;
        char c;
        if (class1 != null)
        {
            i = 0;
            if (obj2 instanceof XmlPullParser)
            {
                vector.addElement(class1);
                i = 1;
            }
            if (obj2 instanceof XmlSerializer)
            {
                vector1.addElement(class1);
                i = 1;
            }
            class1 = s;
            if (obj2 instanceof XmlPullParserFactory)
            {
                class1 = s;
                if (s == null)
                {
                    class1 = (XmlPullParserFactory)obj2;
                }
                i = 1;
            }
            obj1 = class1;
            if (i == 0)
            {
                throw new XmlPullParserException((new StringBuilder()).append("incompatible class: ").append(s2).toString());
            }
        }
        i = j + 1;
        s = ((String) (obj1));
          goto _L10
_L6:
        class1 = s;
        if (s == null)
        {
            class1 = new XmlPullParserFactory();
        }
        class1.parserClasses = vector;
        class1.serializerClasses = vector1;
        class1.classNamesLocation = ((String) (obj));
        return class1;
        Exception exception;
        exception;
          goto _L11
    }

    public boolean getFeature(String s)
    {
        s = (Boolean)features.get(s);
        if (s != null)
        {
            return s.booleanValue();
        } else
        {
            return false;
        }
    }

    public boolean isNamespaceAware()
    {
        return getFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces");
    }

    public boolean isValidating()
    {
        return getFeature("http://xmlpull.org/v1/doc/features.html#validation");
    }

    public XmlPullParser newPullParser()
        throws XmlPullParserException
    {
        StringBuffer stringbuffer;
        int i;
        if (parserClasses == null)
        {
            throw new XmlPullParserException((new StringBuilder()).append("Factory initialization was incomplete - has not tried ").append(classNamesLocation).toString());
        }
        if (parserClasses.size() == 0)
        {
            throw new XmlPullParserException((new StringBuilder()).append("No valid parser classes found in ").append(classNamesLocation).toString());
        }
        stringbuffer = new StringBuffer();
        i = 0;
_L4:
        Class class1;
        if (i >= parserClasses.size())
        {
            break; /* Loop/switch isn't completed */
        }
        class1 = (Class)parserClasses.elementAt(i);
        Object obj;
        Enumeration enumeration;
        obj = (XmlPullParser)class1.newInstance();
        enumeration = features.keys();
_L2:
        String s;
        Boolean boolean1;
        do
        {
            if (!enumeration.hasMoreElements())
            {
                break MISSING_BLOCK_LABEL_267;
            }
            s = (String)enumeration.nextElement();
            boolean1 = (Boolean)features.get(s);
        } while (boolean1 == null);
        if (!boolean1.booleanValue()) goto _L2; else goto _L1
_L1:
        ((XmlPullParser) (obj)).setFeature(s, true);
          goto _L2
        obj;
        stringbuffer.append((new StringBuilder()).append(class1.getName()).append(": ").append(((Exception) (obj)).toString()).append("; ").toString());
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        throw new XmlPullParserException((new StringBuilder()).append("could not create parser: ").append(stringbuffer).toString());
        return ((XmlPullParser) (obj));
    }

    public XmlSerializer newSerializer()
        throws XmlPullParserException
    {
        StringBuffer stringbuffer;
        int i;
        if (serializerClasses == null)
        {
            throw new XmlPullParserException((new StringBuilder()).append("Factory initialization incomplete - has not tried ").append(classNamesLocation).toString());
        }
        if (serializerClasses.size() == 0)
        {
            throw new XmlPullParserException((new StringBuilder()).append("No valid serializer classes found in ").append(classNamesLocation).toString());
        }
        stringbuffer = new StringBuffer();
        i = 0;
_L2:
        Class class1;
        if (i >= serializerClasses.size())
        {
            break; /* Loop/switch isn't completed */
        }
        class1 = (Class)serializerClasses.elementAt(i);
        XmlSerializer xmlserializer = (XmlSerializer)class1.newInstance();
        return xmlserializer;
        Exception exception;
        exception;
        stringbuffer.append((new StringBuilder()).append(class1.getName()).append(": ").append(exception.toString()).append("; ").toString());
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        throw new XmlPullParserException((new StringBuilder()).append("could not create serializer: ").append(stringbuffer).toString());
    }

    public void setFeature(String s, boolean flag)
        throws XmlPullParserException
    {
        features.put(s, new Boolean(flag));
    }

    public void setNamespaceAware(boolean flag)
    {
        features.put("http://xmlpull.org/v1/doc/features.html#process-namespaces", new Boolean(flag));
    }

    public void setValidating(boolean flag)
    {
        features.put("http://xmlpull.org/v1/doc/features.html#validation", new Boolean(flag));
    }

}
