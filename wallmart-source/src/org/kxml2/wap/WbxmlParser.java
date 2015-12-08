// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kxml2.wap;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class WbxmlParser
    implements XmlPullParser
{

    static final String HEX_DIGITS = "0123456789abcdef";
    private static final String ILLEGAL_TYPE = "Wrong event type";
    private static final String UNEXPECTED_EOF = "Unexpected EOF";
    public static final int WAP_EXTENSION = 64;
    private int ATTR_START_TABLE;
    private int ATTR_VALUE_TABLE;
    private int TAG_TABLE;
    private String attrStartTable[];
    private String attrValueTable[];
    private int attributeCount;
    private String attributes[];
    private Hashtable cacheStringTable;
    private boolean degenerated;
    private int depth;
    private String elementStack[];
    private String encoding;
    private InputStream in;
    private boolean isWhitespace;
    private String name;
    private String namespace;
    private int nextId;
    private int nspCounts[];
    private String nspStack[];
    private String prefix;
    private boolean processNsp;
    private int publicIdentifierId;
    private byte stringTable[];
    private Vector tables;
    private String tagTable[];
    private String text;
    private int type;
    private int version;
    private int wapCode;
    private Object wapExtensionData;

    public WbxmlParser()
    {
        TAG_TABLE = 0;
        ATTR_START_TABLE = 1;
        ATTR_VALUE_TABLE = 2;
        cacheStringTable = null;
        elementStack = new String[16];
        nspStack = new String[8];
        nspCounts = new int[4];
        attributes = new String[16];
        nextId = -2;
        tables = new Vector();
    }

    private final boolean adjustNsp()
        throws XmlPullParserException
    {
        int i;
        boolean flag;
        flag = false;
        i = 0;
_L11:
        String s;
        int j;
        if (i >= attributeCount << 2)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        s = attributes[i + 2];
        j = s.indexOf(':');
        if (j == -1) goto _L2; else goto _L1
_L1:
        String s2;
        s2 = s.substring(0, j);
        s = s.substring(j + 1);
_L5:
        boolean flag1;
        if (!s2.equals("xmlns"))
        {
            flag1 = true;
            j = i;
        } else
        {
            Object aobj[] = nspCounts;
            j = depth;
            int i1 = aobj[j];
            aobj[j] = i1 + 1;
            j = i1 << 1;
            nspStack = ensureCapacity(nspStack, j + 2);
            nspStack[j] = s;
            nspStack[j + 1] = attributes[i + 3];
            if (s != null && attributes[i + 3].equals(""))
            {
                exception("illegal empty namespace");
            }
            String as[] = attributes;
            aobj = attributes;
            j = attributeCount - 1;
            attributeCount = j;
            System.arraycopy(as, i + 4, ((Object) (aobj)), i, (j << 2) - i);
            j = i - 4;
            flag1 = flag;
        }
_L4:
        i = j + 4;
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L2:
        flag1 = flag;
        j = i;
        if (!s.equals("xmlns")) goto _L4; else goto _L3
_L3:
        s2 = s;
        s = null;
          goto _L5
        if (flag)
        {
            for (i = (attributeCount << 2) - 4; i >= 0; i -= 4)
            {
                String s3 = attributes[i + 2];
                int k = s3.indexOf(':');
                if (k == 0)
                {
                    throw new RuntimeException((new StringBuilder()).append("illegal attribute name: ").append(s3).append(" at ").append(this).toString());
                }
                if (k == -1)
                {
                    continue;
                }
                String s1 = s3.substring(0, k);
                s3 = s3.substring(k + 1);
                String s4 = getNamespace(s1);
                if (s4 == null)
                {
                    throw new RuntimeException((new StringBuilder()).append("Undefined Prefix: ").append(s1).append(" in ").append(this).toString());
                }
                attributes[i] = s4;
                attributes[i + 1] = s1;
                attributes[i + 2] = s3;
                for (int l = (attributeCount << 2) - 4; l > i; l -= 4)
                {
                    if (s3.equals(attributes[l + 2]) && s4.equals(attributes[l]))
                    {
                        exception((new StringBuilder()).append("Duplicate Attribute: {").append(s4).append("}").append(s3).toString());
                    }
                }

            }

        }
        i = name.indexOf(':');
        if (i != 0) goto _L7; else goto _L6
_L6:
        exception((new StringBuilder()).append("illegal tag name: ").append(name).toString());
_L9:
        namespace = getNamespace(prefix);
        if (namespace == null)
        {
            if (prefix != null)
            {
                exception((new StringBuilder()).append("undefined prefix: ").append(prefix).toString());
            }
            namespace = "";
        }
        return flag;
_L7:
        if (i != -1)
        {
            prefix = name.substring(0, i);
            name = name.substring(i + 1);
        }
        if (true) goto _L9; else goto _L8
_L8:
        if (true) goto _L11; else goto _L10
_L10:
    }

    private final String[] ensureCapacity(String as[], int i)
    {
        if (as.length >= i)
        {
            return as;
        } else
        {
            String as1[] = new String[i + 16];
            System.arraycopy(as, 0, as1, 0, as.length);
            return as1;
        }
    }

    private final void exception(String s)
        throws XmlPullParserException
    {
        throw new XmlPullParserException(s, this, null);
    }

    private final void nextImpl()
        throws IOException, XmlPullParserException
    {
        if (type == 3)
        {
            depth = depth - 1;
        }
        if (degenerated)
        {
            type = 3;
            degenerated = false;
            return;
        }
        text = null;
        prefix = null;
        name = null;
        int i;
        for (i = peekId(); i == 0; i = peekId())
        {
            nextId = -2;
            selectPage(readByte(), true);
        }

        nextId = -2;
        switch (i)
        {
        default:
            parseElement(i);
            return;

        case -1: 
            type = 1;
            return;

        case 1: // '\001'
            i = depth - 1 << 2;
            type = 3;
            namespace = elementStack[i];
            prefix = elementStack[i + 1];
            name = elementStack[i + 2];
            return;

        case 2: // '\002'
            type = 6;
            char c = (char)readInt();
            text = (new StringBuilder()).append("").append(c).toString();
            name = (new StringBuilder()).append("#").append(c).toString();
            return;

        case 3: // '\003'
            type = 4;
            text = readStrI();
            return;

        case 64: // '@'
        case 65: // 'A'
        case 66: // 'B'
        case 128: 
        case 129: 
        case 130: 
        case 192: 
        case 193: 
        case 194: 
        case 195: 
            type = 64;
            wapCode = i;
            wapExtensionData = parseWapExtension(i);
            return;

        case 67: // 'C'
            throw new RuntimeException("PI curr. not supp.");

        case 131: 
            type = 4;
            break;
        }
        text = readStrT();
    }

    private int peekId()
        throws IOException
    {
        if (nextId == -2)
        {
            nextId = in.read();
        }
        return nextId;
    }

    private void selectPage(int i, boolean flag)
        throws XmlPullParserException
    {
        if (tables.size() == 0 && i == 0)
        {
            return;
        }
        if (i * 3 > tables.size())
        {
            exception((new StringBuilder()).append("Code Page ").append(i).append(" undefined!").toString());
        }
        if (flag)
        {
            tagTable = (String[])(String[])tables.elementAt(i * 3 + TAG_TABLE);
            return;
        } else
        {
            attrStartTable = (String[])(String[])tables.elementAt(i * 3 + ATTR_START_TABLE);
            attrValueTable = (String[])(String[])tables.elementAt(i * 3 + ATTR_VALUE_TABLE);
            return;
        }
    }

    private final void setTable(int i, int j, String as[])
    {
        if (stringTable != null)
        {
            throw new RuntimeException("setXxxTable must be called before setInput!");
        }
        for (; tables.size() < i * 3 + 3; tables.addElement(null)) { }
        tables.setElementAt(as, i * 3 + j);
    }

    public void defineEntityReplacementText(String s, String s1)
        throws XmlPullParserException
    {
    }

    public int getAttributeCount()
    {
        return attributeCount;
    }

    public String getAttributeName(int i)
    {
        if (i >= attributeCount)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            return attributes[(i << 2) + 2];
        }
    }

    public String getAttributeNamespace(int i)
    {
        if (i >= attributeCount)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            return attributes[i << 2];
        }
    }

    public String getAttributePrefix(int i)
    {
        if (i >= attributeCount)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            return attributes[(i << 2) + 1];
        }
    }

    public String getAttributeType(int i)
    {
        return "CDATA";
    }

    public String getAttributeValue(int i)
    {
        if (i >= attributeCount)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            return attributes[(i << 2) + 3];
        }
    }

    public String getAttributeValue(String s, String s1)
    {
        for (int i = (attributeCount << 2) - 4; i >= 0; i -= 4)
        {
            if (attributes[i + 2].equals(s1) && (s == null || attributes[i].equals(s)))
            {
                return attributes[i + 3];
            }
        }

        return null;
    }

    public int getColumnNumber()
    {
        return -1;
    }

    public int getDepth()
    {
        return depth;
    }

    public int getEventType()
        throws XmlPullParserException
    {
        return type;
    }

    public boolean getFeature(String s)
    {
        if ("http://xmlpull.org/v1/doc/features.html#process-namespaces".equals(s))
        {
            return processNsp;
        } else
        {
            return false;
        }
    }

    public String getInputEncoding()
    {
        return encoding;
    }

    public int getLineNumber()
    {
        return -1;
    }

    public String getName()
    {
        return name;
    }

    public String getNamespace()
    {
        return namespace;
    }

    public String getNamespace(String s)
    {
        if ("xml".equals(s))
        {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(s))
        {
            return "http://www.w3.org/2000/xmlns/";
        }
        for (int i = (getNamespaceCount(depth) << 1) - 2; i >= 0; i -= 2)
        {
            if (s == null)
            {
                if (nspStack[i] == null)
                {
                    return nspStack[i + 1];
                }
                continue;
            }
            if (s.equals(nspStack[i]))
            {
                return nspStack[i + 1];
            }
        }

        return null;
    }

    public int getNamespaceCount(int i)
    {
        if (i > depth)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            return nspCounts[i];
        }
    }

    public String getNamespacePrefix(int i)
    {
        return nspStack[i << 1];
    }

    public String getNamespaceUri(int i)
    {
        return nspStack[(i << 1) + 1];
    }

    public String getPositionDescription()
    {
        StringBuffer stringbuffer;
        String s;
        int i;
        int j;
        if (type < TYPES.length)
        {
            s = TYPES[type];
        } else
        {
            s = "unknown";
        }
        stringbuffer = new StringBuffer(s);
        stringbuffer.append(' ');
        if (type != 2 && type != 3) goto _L2; else goto _L1
_L1:
        if (degenerated)
        {
            stringbuffer.append("(empty) ");
        }
        stringbuffer.append('<');
        if (type == 3)
        {
            stringbuffer.append('/');
        }
        if (prefix != null)
        {
            stringbuffer.append((new StringBuilder()).append("{").append(namespace).append("}").append(prefix).append(":").toString());
        }
        stringbuffer.append(name);
        j = attributeCount;
        for (i = 0; i < j << 2; i += 4)
        {
            stringbuffer.append(' ');
            if (attributes[i + 1] != null)
            {
                stringbuffer.append((new StringBuilder()).append("{").append(attributes[i]).append("}").append(attributes[i + 1]).append(":").toString());
            }
            stringbuffer.append((new StringBuilder()).append(attributes[i + 2]).append("='").append(attributes[i + 3]).append("'").toString());
        }

        stringbuffer.append('>');
_L4:
        return stringbuffer.toString();
_L2:
        if (type != 7)
        {
            if (type != 4)
            {
                stringbuffer.append(getText());
            } else
            if (isWhitespace)
            {
                stringbuffer.append("(whitespace)");
            } else
            {
                String s2 = getText();
                String s1 = s2;
                if (s2.length() > 16)
                {
                    s1 = (new StringBuilder()).append(s2.substring(0, 16)).append("...").toString();
                }
                stringbuffer.append(s1);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getPrefix()
    {
        return prefix;
    }

    public Object getProperty(String s)
    {
        return null;
    }

    public String getText()
    {
        return text;
    }

    public char[] getTextCharacters(int ai[])
    {
        if (type >= 4)
        {
            ai[0] = 0;
            ai[1] = text.length();
            ai = new char[text.length()];
            text.getChars(0, text.length(), ai, 0);
            return ai;
        } else
        {
            ai[0] = -1;
            ai[1] = -1;
            return null;
        }
    }

    public int getWapCode()
    {
        return wapCode;
    }

    public Object getWapExtensionData()
    {
        return wapExtensionData;
    }

    public boolean isAttributeDefault(int i)
    {
        return false;
    }

    public boolean isEmptyElementTag()
        throws XmlPullParserException
    {
        if (type != 2)
        {
            exception("Wrong event type");
        }
        return degenerated;
    }

    public boolean isWhitespace()
        throws XmlPullParserException
    {
        if (type != 4 && type != 7 && type != 5)
        {
            exception("Wrong event type");
        }
        return isWhitespace;
    }

    public int next()
        throws XmlPullParserException, IOException
    {
        isWhitespace = true;
        int i = 9999;
label0:
        do
        {
            String s;
            int j;
            do
            {
                s = text;
                nextImpl();
                j = i;
                if (type < i)
                {
                    j = type;
                }
                i = j;
            } while (j > 5);
            if (j < 4)
            {
                break;
            }
            if (s != null)
            {
                if (text != null)
                {
                    s = (new StringBuilder()).append(s).append(text).toString();
                }
                text = s;
            }
            i = j;
            switch (peekId())
            {
            default:
                break label0;

            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 68: // 'D'
            case 131: 
            case 132: 
            case 196: 
                break;
            }
        } while (true);
        type = j;
        if (type > 4)
        {
            type = 4;
        }
        return type;
    }

    public int nextTag()
        throws XmlPullParserException, IOException
    {
        next();
        if (type == 4 && isWhitespace)
        {
            next();
        }
        if (type != 3 && type != 2)
        {
            exception("unexpected type");
        }
        return type;
    }

    public String nextText()
        throws XmlPullParserException, IOException
    {
        if (type != 2)
        {
            exception("precondition: START_TAG");
        }
        next();
        String s;
        if (type == 4)
        {
            s = getText();
            next();
        } else
        {
            s = "";
        }
        if (type != 3)
        {
            exception("END_TAG expected");
        }
        return s;
    }

    public int nextToken()
        throws XmlPullParserException, IOException
    {
        isWhitespace = true;
        nextImpl();
        return type;
    }

    void parseElement(int i)
        throws IOException, XmlPullParserException
    {
        type = 2;
        name = resolveId(tagTable, i & 0x3f);
        attributeCount = 0;
        if ((i & 0x80) != 0)
        {
            readAttr();
        }
        int k;
        boolean flag;
        if ((i & 0x40) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        degenerated = flag;
        i = depth;
        depth = i + 1;
        k = i << 2;
        elementStack = ensureCapacity(elementStack, k + 4);
        elementStack[k + 3] = name;
        if (depth >= nspCounts.length)
        {
            int ai[] = new int[depth + 4];
            System.arraycopy(nspCounts, 0, ai, 0, nspCounts.length);
            nspCounts = ai;
        }
        nspCounts[depth] = nspCounts[depth - 1];
        for (i = attributeCount - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (getAttributeName(i).equals(getAttributeName(j)))
                {
                    exception((new StringBuilder()).append("Duplicate Attribute: ").append(getAttributeName(i)).toString());
                }
            }

        }

        if (processNsp)
        {
            adjustNsp();
        } else
        {
            namespace = "";
        }
        elementStack[k] = namespace;
        elementStack[k + 1] = prefix;
        elementStack[k + 2] = name;
    }

    public Object parseWapExtension(int i)
        throws IOException, XmlPullParserException
    {
        byte abyte0[];
        Object obj;
        obj = null;
        abyte0 = obj;
        i;
        JVM INSTR lookupswitch 10: default 96
    //                   64: 124
    //                   65: 124
    //                   66: 124
    //                   128: 129
    //                   129: 129
    //                   130: 129
    //                   192: 122
    //                   193: 122
    //                   194: 122
    //                   195: 141;
           goto _L1 _L2 _L2 _L2 _L3 _L3 _L3 _L4 _L4 _L4 _L5
_L1:
        exception((new StringBuilder()).append("illegal id: ").append(i).toString());
        abyte0 = obj;
_L4:
        return abyte0;
_L2:
        return readStrI();
_L3:
        return new Integer(readInt());
_L5:
        i = readInt();
        byte abyte1[] = new byte[i];
        do
        {
            abyte0 = abyte1;
            if (i <= 0)
            {
                continue;
            }
            i -= in.read(abyte1, abyte1.length - i, i);
        } while (true);
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void readAttr()
        throws IOException, XmlPullParserException
    {
        int i;
        int j;
        i = readByte();
        j = 0;
_L11:
        StringBuffer stringbuffer;
        String s;
        if (i == 1)
        {
            break; /* Loop/switch isn't completed */
        }
        for (; i == 0; i = readByte())
        {
            selectPage(readByte(), false);
        }

        s = resolveId(attrStartTable, i);
        i = s.indexOf('=');
        if (i == -1)
        {
            stringbuffer = new StringBuffer();
        } else
        {
            stringbuffer = new StringBuffer(s.substring(i + 1));
            s = s.substring(0, i);
        }
        i = readByte();
_L8:
        if (i <= 128 && i != 0 && i != 2 && i != 3 && i != 131 && (i < 64 || i > 66) && (i < 128 || i > 130))
        {
            break MISSING_BLOCK_LABEL_384;
        }
        i;
        JVM INSTR lookupswitch 14: default 264
    //                   0: 315
    //                   2: 327
    //                   3: 340
    //                   64: 352
    //                   65: 352
    //                   66: 352
    //                   128: 352
    //                   129: 352
    //                   130: 352
    //                   131: 372
    //                   192: 352
    //                   193: 352
    //                   194: 352
    //                   195: 352;
           goto _L1 _L2 _L3 _L4 _L5 _L5 _L5 _L5 _L5 _L5 _L6 _L5 _L5 _L5 _L5
_L6:
        break MISSING_BLOCK_LABEL_372;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        stringbuffer.append(resolveId(attrValueTable, i));
_L9:
        i = readByte();
        if (true) goto _L8; else goto _L7
_L7:
        selectPage(readByte(), false);
          goto _L9
_L3:
        stringbuffer.append((char)readInt());
          goto _L9
_L4:
        stringbuffer.append(readStrI());
          goto _L9
_L5:
        stringbuffer.append(resolveWapExtension(i, parseWapExtension(i)));
          goto _L9
        stringbuffer.append(readStrT());
          goto _L9
        attributes = ensureCapacity(attributes, j + 4);
        String as1[] = attributes;
        int k = j + 1;
        as1[j] = "";
        as1 = attributes;
        j = k + 1;
        as1[k] = null;
        as1 = attributes;
        k = j + 1;
        as1[j] = s;
        String as[] = attributes;
        j = k + 1;
        as[k] = stringbuffer.toString();
        attributeCount = attributeCount + 1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    int readByte()
        throws IOException
    {
        int i = in.read();
        if (i == -1)
        {
            throw new IOException("Unexpected EOF");
        } else
        {
            return i;
        }
    }

    int readInt()
        throws IOException
    {
        int i = 0;
        int j;
        int k;
        do
        {
            k = readByte();
            j = i << 7 | k & 0x7f;
            i = j;
        } while ((k & 0x80) != 0);
        return j;
    }

    String readStrI()
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        boolean flag = true;
        do
        {
            int i = in.read();
            if (i == 0)
            {
                isWhitespace = flag;
                String s = new String(bytearrayoutputstream.toByteArray(), encoding);
                bytearrayoutputstream.close();
                return s;
            }
            if (i == -1)
            {
                throw new IOException("Unexpected EOF");
            }
            if (i > 32)
            {
                flag = false;
            }
            bytearrayoutputstream.write(i);
        } while (true);
    }

    String readStrT()
        throws IOException
    {
        int j = readInt();
        if (cacheStringTable == null)
        {
            cacheStringTable = new Hashtable();
        }
        String s1 = (String)cacheStringTable.get(new Integer(j));
        String s = s1;
        if (s1 == null)
        {
            int i;
            for (i = j; i < stringTable.length && stringTable[i] != 0; i++) { }
            s = new String(stringTable, j, i - j, encoding);
            cacheStringTable.put(new Integer(j), s);
        }
        return s;
    }

    public void require(int i, String s, String s1)
        throws XmlPullParserException, IOException
    {
        if (i != type || s != null && !s.equals(getNamespace()) || s1 != null && !s1.equals(getName()))
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("expected: ");
            if (i == 64)
            {
                s = "WAP Ext.";
            } else
            {
                s = (new StringBuilder()).append(TYPES[i]).append(" {").append(s).append("}").append(s1).toString();
            }
            exception(stringbuilder.append(s).toString());
        }
    }

    String resolveId(String as[], int i)
        throws IOException
    {
        int j = (i & 0x7f) - 5;
        if (j == -1)
        {
            wapCode = -1;
            return readStrT();
        }
        if (j < 0 || as == null || j >= as.length || as[j] == null)
        {
            throw new IOException((new StringBuilder()).append("id ").append(i).append(" undef.").toString());
        } else
        {
            wapCode = j + 5;
            return as[j];
        }
    }

    protected String resolveWapExtension(int i, Object obj)
    {
        if (obj instanceof byte[])
        {
            StringBuffer stringbuffer = new StringBuffer();
            obj = (byte[])(byte[])obj;
            for (i = 0; i < obj.length; i++)
            {
                stringbuffer.append("0123456789abcdef".charAt(obj[i] >> 4 & 0xf));
                stringbuffer.append("0123456789abcdef".charAt(obj[i] & 0xf));
            }

            return stringbuffer.toString();
        } else
        {
            return (new StringBuilder()).append("$(").append(obj).append(")").toString();
        }
    }

    public void setAttrStartTable(int i, String as[])
    {
        setTable(i, ATTR_START_TABLE, as);
    }

    public void setAttrValueTable(int i, String as[])
    {
        setTable(i, ATTR_VALUE_TABLE, as);
    }

    public void setFeature(String s, boolean flag)
        throws XmlPullParserException
    {
        if ("http://xmlpull.org/v1/doc/features.html#process-namespaces".equals(s))
        {
            processNsp = flag;
            return;
        } else
        {
            exception((new StringBuilder()).append("unsupported feature: ").append(s).toString());
            return;
        }
    }

    public void setInput(InputStream inputstream, String s)
        throws XmlPullParserException
    {
        in = inputstream;
        int i;
        version = readByte();
        publicIdentifierId = readInt();
        if (publicIdentifierId == 0)
        {
            readInt();
        }
        i = readInt();
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        i;
        JVM INSTR lookupswitch 2: default 192
    //                   4: 104
    //                   106: 166;
           goto _L1 _L2 _L3
_L1:
        try
        {
            throw new UnsupportedEncodingException((new StringBuilder()).append("").append(i).toString());
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            exception("Illegal input format");
        }
        return;
_L2:
        encoding = "ISO-8859-1";
_L4:
        int k;
        k = readInt();
        stringTable = new byte[k];
        int l;
        for (int j = 0; j >= k; j += l)
        {
            break MISSING_BLOCK_LABEL_153;
        }

        l = inputstream.read(stringTable, j, k - j);
        if (l > 0)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        selectPage(0, true);
        selectPage(0, false);
        return;
_L3:
        encoding = "UTF-8";
          goto _L4
        encoding = s;
          goto _L4
    }

    public void setInput(Reader reader)
        throws XmlPullParserException
    {
        exception("InputStream required");
    }

    public void setProperty(String s, Object obj)
        throws XmlPullParserException
    {
        throw new XmlPullParserException((new StringBuilder()).append("unsupported property: ").append(s).toString());
    }

    public void setTagTable(int i, String as[])
    {
        setTable(i, TAG_TABLE, as);
    }
}
