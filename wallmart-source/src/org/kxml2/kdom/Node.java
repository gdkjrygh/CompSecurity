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
//            Element

public class Node
{

    public static final int CDSECT = 5;
    public static final int COMMENT = 9;
    public static final int DOCDECL = 10;
    public static final int DOCUMENT = 0;
    public static final int ELEMENT = 2;
    public static final int ENTITY_REF = 6;
    public static final int IGNORABLE_WHITESPACE = 7;
    public static final int PROCESSING_INSTRUCTION = 8;
    public static final int TEXT = 4;
    protected Vector children;
    protected StringBuffer types;

    public Node()
    {
    }

    public void addChild(int i, int j, Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        }
        if (children == null)
        {
            children = new Vector();
            types = new StringBuffer();
        }
        if (j == 2)
        {
            if (!(obj instanceof Element))
            {
                throw new RuntimeException("Element obj expected)");
            }
            ((Element)obj).setParent(this);
        } else
        if (!(obj instanceof String))
        {
            throw new RuntimeException("String expected");
        }
        children.insertElementAt(obj, i);
        types.insert(i, (char)j);
    }

    public void addChild(int i, Object obj)
    {
        addChild(getChildCount(), i, obj);
    }

    public Element createElement(String s, String s1)
    {
        Element element = new Element();
        String s2 = s;
        if (s == null)
        {
            s2 = "";
        }
        element.namespace = s2;
        element.name = s1;
        return element;
    }

    public Object getChild(int i)
    {
        return children.elementAt(i);
    }

    public int getChildCount()
    {
        if (children == null)
        {
            return 0;
        } else
        {
            return children.size();
        }
    }

    public Element getElement(int i)
    {
        Object obj = getChild(i);
        if (obj instanceof Element)
        {
            return (Element)obj;
        } else
        {
            return null;
        }
    }

    public Element getElement(String s, String s1)
    {
        int i = indexOf(s, s1, 0);
        int j = indexOf(s, s1, i + 1);
        if (i == -1 || j != -1)
        {
            s1 = (new StringBuilder()).append("Element {").append(s).append("}").append(s1);
            if (i == -1)
            {
                s = " not found in ";
            } else
            {
                s = " more than once in ";
            }
            throw new RuntimeException(s1.append(s).append(this).toString());
        } else
        {
            return getElement(i);
        }
    }

    public String getText(int i)
    {
        if (isText(i))
        {
            return (String)getChild(i);
        } else
        {
            return null;
        }
    }

    public int getType(int i)
    {
        return types.charAt(i);
    }

    public int indexOf(String s, String s1, int i)
    {
        for (int j = getChildCount(); i < j; i++)
        {
            Element element = getElement(i);
            if (element != null && s1.equals(element.getName()) && (s == null || s.equals(element.getNamespace())))
            {
                return i;
            }
        }

        return -1;
    }

    public boolean isText(int i)
    {
        i = getType(i);
        return i == 4 || i == 7 || i == 5;
    }

    public void parse(XmlPullParser xmlpullparser)
        throws IOException, XmlPullParserException
    {
label0:
        {
label1:
            {
                boolean flag = false;
                do
                {
                    {
                        int j = xmlpullparser.getEventType();
                        switch (j)
                        {
                        default:
                            Element element;
                            boolean flag1;
                            if (xmlpullparser.getText() != null)
                            {
                                int i = j;
                                if (j == 6)
                                {
                                    i = 4;
                                }
                                addChild(i, xmlpullparser.getText());
                            } else
                            if (j == 6 && xmlpullparser.getName() != null)
                            {
                                addChild(6, xmlpullparser.getName());
                            }
                            xmlpullparser.nextToken();
                            flag1 = flag;
                            break;

                        case 1: // '\001'
                        case 3: // '\003'
                            break label0;

                        case 2: // '\002'
                            break label1;
                        }
                    }
                    flag = flag1;
                } while (!flag1);
                return;
            }
            element = createElement(xmlpullparser.getNamespace(), xmlpullparser.getName());
            addChild(2, element);
            element.parse(xmlpullparser);
            flag1 = flag;
            break MISSING_BLOCK_LABEL_85;
        }
        flag1 = true;
        break MISSING_BLOCK_LABEL_85;
    }

    public void removeChild(int i)
    {
        children.removeElementAt(i);
        int j;
        for (j = types.length() - 1; i < j; i++)
        {
            types.setCharAt(i, types.charAt(i + 1));
        }

        types.setLength(j);
    }

    public void write(XmlSerializer xmlserializer)
        throws IOException
    {
        writeChildren(xmlserializer);
        xmlserializer.flush();
    }

    public void writeChildren(XmlSerializer xmlserializer)
        throws IOException
    {
        if (children != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        int j;
        j = children.size();
        i = 0;
_L13:
        if (i >= j) goto _L1; else goto _L3
_L3:
        Object obj;
        int k;
        k = getType(i);
        obj = children.elementAt(i);
        k;
        JVM INSTR tableswitch 2 10: default 92
    //                   2 120
    //                   3 92
    //                   4 135
    //                   5 162
    //                   6 188
    //                   7 149
    //                   8 201
    //                   9 175
    //                   10 214;
           goto _L4 _L5 _L4 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_214;
_L4:
        throw new RuntimeException((new StringBuilder()).append("Illegal type: ").append(k).toString());
_L5:
        ((Element)obj).write(xmlserializer);
_L14:
        i++;
          goto _L13
_L6:
        xmlserializer.text((String)obj);
          goto _L14
_L9:
        xmlserializer.ignorableWhitespace((String)obj);
          goto _L14
_L7:
        xmlserializer.cdsect((String)obj);
          goto _L14
_L11:
        xmlserializer.comment((String)obj);
          goto _L14
_L8:
        xmlserializer.entityRef((String)obj);
          goto _L14
_L10:
        xmlserializer.processingInstruction((String)obj);
          goto _L14
        xmlserializer.docdecl((String)obj);
          goto _L14
    }
}
