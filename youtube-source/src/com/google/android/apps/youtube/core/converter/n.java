// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter;

import com.google.android.apps.youtube.common.fromguava.c;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

// Referenced classes of package com.google.android.apps.youtube.core.converter:
//            p, q, InvalidFormatException, ParserException, 
//            e

public final class n
{

    private static final Attributes a = new p((byte)0);
    private static final Map c;
    private final SAXParserFactory b;

    private n(Map map)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(map);
        try
        {
            b = SAXParserFactory.newInstance();
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); b.setFeature((String)entry.getKey(), ((Boolean)entry.getValue()).booleanValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new RuntimeException("SAX initilization error", map);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new RuntimeException("SAX initilization error", map);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new RuntimeException("SAX initilization error", map);
        }
    }

    public static n a()
    {
        return new n(c);
    }

    static Attributes b()
    {
        return a;
    }

    public final Object a(InputStream inputstream, e e)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(inputstream);
        com.google.android.apps.youtube.common.fromguava.c.a(e);
        XMLReader xmlreader;
        synchronized (b)
        {
            xmlreader = b.newSAXParser().getXMLReader();
        }
        try
        {
            e = new q(e);
            xmlreader.setContentHandler(e);
            xmlreader.parse(new InputSource(inputstream));
            if (((q) (e)).a == null)
            {
                throw new InvalidFormatException("XML is well-formed but invalid");
            }
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new ParserException(inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new ParserException(inputstream);
        }
        break MISSING_BLOCK_LABEL_105;
        inputstream;
        saxparserfactory;
        JVM INSTR monitorexit ;
        throw inputstream;
        inputstream = ((InputStream) (((q) (e)).a));
        return inputstream;
    }

    static 
    {
        HashMap hashmap = new HashMap();
        hashmap.put("http://xml.org/sax/features/namespaces", Boolean.valueOf(false));
        hashmap.put("http://xml.org/sax/features/namespace-prefixes", Boolean.valueOf(true));
        c = Collections.unmodifiableMap(hashmap);
    }
}
