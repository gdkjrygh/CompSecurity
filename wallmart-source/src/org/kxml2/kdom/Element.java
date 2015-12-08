// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kxml2.kdom;

import java.io.IOException;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

// Referenced classes of package org.kxml2.kdom:
//            Node

public class Element extends Node
{

    protected Vector attributes;
    protected String name;
    protected String namespace;
    protected Node parent;
    protected Vector prefixes;

    public Element()
    {
    }

    public void clear()
    {
        attributes = null;
        children = null;
    }

    public Element createElement(String s, String s1)
    {
        if (parent == null)
        {
            return super.createElement(s, s1);
        } else
        {
            return parent.createElement(s, s1);
        }
    }

    public int getAttributeCount()
    {
        if (attributes == null)
        {
            return 0;
        } else
        {
            return attributes.size();
        }
    }

    public String getAttributeName(int i)
    {
        return ((String[])(String[])attributes.elementAt(i))[1];
    }

    public String getAttributeNamespace(int i)
    {
        return ((String[])(String[])attributes.elementAt(i))[0];
    }

    public String getAttributeValue(int i)
    {
        return ((String[])(String[])attributes.elementAt(i))[2];
    }

    public String getAttributeValue(String s, String s1)
    {
        for (int i = 0; i < getAttributeCount(); i++)
        {
            if (s1.equals(getAttributeName(i)) && (s == null || s.equals(getAttributeNamespace(i))))
            {
                return getAttributeValue(i);
            }
        }

        return null;
    }

    public String getName()
    {
        return name;
    }

    public String getNamespace()
    {
        return namespace;
    }

    public int getNamespaceCount()
    {
        if (prefixes == null)
        {
            return 0;
        } else
        {
            return prefixes.size();
        }
    }

    public String getNamespacePrefix(int i)
    {
        return ((String[])(String[])prefixes.elementAt(i))[0];
    }

    public String getNamespaceUri(int i)
    {
        return ((String[])(String[])prefixes.elementAt(i))[1];
    }

    public String getNamespaceUri(String s)
    {
        int j = getNamespaceCount();
        for (int i = 0; i < j; i++)
        {
            if (s == getNamespacePrefix(i) || s != null && s.equals(getNamespacePrefix(i)))
            {
                return getNamespaceUri(i);
            }
        }

        if (parent instanceof Element)
        {
            return ((Element)parent).getNamespaceUri(s);
        } else
        {
            return null;
        }
    }

    public Node getParent()
    {
        return parent;
    }

    public Node getRoot()
    {
        Element element = this;
        do
        {
label0:
            {
                Object obj = element;
                if (element.parent != null)
                {
                    if (element.parent instanceof Element)
                    {
                        break label0;
                    }
                    obj = element.parent;
                }
                return ((Node) (obj));
            }
            element = (Element)element.parent;
        } while (true);
    }

    public void init()
    {
    }

    public void parse(XmlPullParser xmlpullparser)
        throws IOException, XmlPullParserException
    {
        for (int i = xmlpullparser.getNamespaceCount(xmlpullparser.getDepth() - 1); i < xmlpullparser.getNamespaceCount(xmlpullparser.getDepth()); i++)
        {
            setPrefix(xmlpullparser.getNamespacePrefix(i), xmlpullparser.getNamespaceUri(i));
        }

        for (int j = 0; j < xmlpullparser.getAttributeCount(); j++)
        {
            setAttribute(xmlpullparser.getAttributeNamespace(j), xmlpullparser.getAttributeName(j), xmlpullparser.getAttributeValue(j));
        }

        init();
        if (!xmlpullparser.isEmptyElementTag()) goto _L2; else goto _L1
_L1:
        xmlpullparser.nextToken();
_L4:
        xmlpullparser.require(3, getNamespace(), getName());
        xmlpullparser.nextToken();
        return;
_L2:
        xmlpullparser.nextToken();
        super.parse(xmlpullparser);
        if (getChildCount() == 0)
        {
            addChild(7, "");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setAttribute(String s, String s1, String s2)
    {
        if (attributes == null)
        {
            attributes = new Vector();
        }
        String s3 = s;
        if (s == null)
        {
            s3 = "";
        }
        for (int i = attributes.size() - 1; i >= 0; i--)
        {
            s = (String[])(String[])attributes.elementAt(i);
            if (s[0].equals(s3) && s[1].equals(s1))
            {
                if (s2 == null)
                {
                    attributes.removeElementAt(i);
                    return;
                } else
                {
                    s[2] = s2;
                    return;
                }
            }
        }

        attributes.addElement(new String[] {
            s3, s1, s2
        });
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setNamespace(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("Use \"\" for empty namespace");
        } else
        {
            namespace = s;
            return;
        }
    }

    protected void setParent(Node node)
    {
        parent = node;
    }

    public void setPrefix(String s, String s1)
    {
        if (prefixes == null)
        {
            prefixes = new Vector();
        }
        prefixes.addElement(new String[] {
            s, s1
        });
    }

    public void write(XmlSerializer xmlserializer)
        throws IOException
    {
        if (prefixes != null)
        {
            for (int i = 0; i < prefixes.size(); i++)
            {
                xmlserializer.setPrefix(getNamespacePrefix(i), getNamespaceUri(i));
            }

        }
        xmlserializer.startTag(getNamespace(), getName());
        int k = getAttributeCount();
        for (int j = 0; j < k; j++)
        {
            xmlserializer.attribute(getAttributeNamespace(j), getAttributeName(j), getAttributeValue(j));
        }

        writeChildren(xmlserializer);
        xmlserializer.endTag(getNamespace(), getName());
    }
}
