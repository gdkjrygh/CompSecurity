// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kxml2.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.util.Hashtable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class KXmlParser
    implements XmlPullParser
{

    private static final String ILLEGAL_TYPE = "Wrong event type";
    private static final int LEGACY = 999;
    private static final String UNEXPECTED_EOF = "Unexpected EOF";
    private static final int XML_DECL = 998;
    private int attributeCount;
    private String attributes[];
    private int column;
    private boolean degenerated;
    private int depth;
    private String elementStack[];
    private String encoding;
    private Hashtable entityMap;
    private String error;
    private boolean isWhitespace;
    private int line;
    private Object location;
    private String name;
    private String namespace;
    private int nspCounts[];
    private String nspStack[];
    private int peek[];
    private int peekCount;
    private String prefix;
    private boolean processNsp;
    private Reader reader;
    private boolean relaxed;
    private char srcBuf[];
    private int srcCount;
    private int srcPos;
    private Boolean standalone;
    private boolean token;
    private char txtBuf[];
    private int txtPos;
    private int type;
    private boolean unresolved;
    private String version;
    private boolean wasCR;

    public KXmlParser()
    {
        char c = '\200';
        super();
        elementStack = new String[16];
        nspStack = new String[8];
        nspCounts = new int[4];
        txtBuf = new char[128];
        attributes = new String[16];
        peek = new int[2];
        if (Runtime.getRuntime().freeMemory() >= 0x100000L)
        {
            c = '\u2000';
        }
        srcBuf = new char[c];
    }

    private final boolean adjustNsp()
        throws XmlPullParserException
    {
        int i;
        boolean flag;
        flag = false;
        i = 0;
_L7:
        String s;
        int l;
        if (i >= attributeCount << 2)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        s = attributes[i + 2];
        l = s.indexOf(':');
        if (l == -1) goto _L2; else goto _L1
_L1:
        String s2;
        s2 = s.substring(0, l);
        s = s.substring(l + 1);
_L5:
        boolean flag1;
        if (!s2.equals("xmlns"))
        {
            flag1 = true;
            l = i;
        } else
        {
            Object aobj[] = nspCounts;
            l = depth;
            int j1 = aobj[l];
            aobj[l] = j1 + 1;
            l = j1 << 1;
            nspStack = ensureCapacity(nspStack, l + 2);
            nspStack[l] = s;
            nspStack[l + 1] = attributes[i + 3];
            if (s != null && attributes[i + 3].equals(""))
            {
                error("illegal empty namespace");
            }
            String as[] = attributes;
            aobj = attributes;
            l = attributeCount - 1;
            attributeCount = l;
            System.arraycopy(as, i + 4, ((Object) (aobj)), i, (l << 2) - i);
            l = i - 4;
            flag1 = flag;
        }
_L4:
        i = l + 4;
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L2:
        flag1 = flag;
        l = i;
        if (!s.equals("xmlns")) goto _L4; else goto _L3
_L3:
        s2 = s;
        s = null;
          goto _L5
        if (flag)
        {
            for (int j = (attributeCount << 2) - 4; j >= 0; j -= 4)
            {
                String s3 = attributes[j + 2];
                int i1 = s3.indexOf(':');
                if (i1 == 0 && !relaxed)
                {
                    throw new RuntimeException((new StringBuilder()).append("illegal attribute name: ").append(s3).append(" at ").append(this).toString());
                }
                if (i1 == -1)
                {
                    continue;
                }
                String s1 = s3.substring(0, i1);
                s3 = s3.substring(i1 + 1);
                String s4 = getNamespace(s1);
                if (s4 == null && !relaxed)
                {
                    throw new RuntimeException((new StringBuilder()).append("Undefined Prefix: ").append(s1).append(" in ").append(this).toString());
                }
                attributes[j] = s4;
                attributes[j + 1] = s1;
                attributes[j + 2] = s3;
            }

        }
        int k = name.indexOf(':');
        if (k == 0)
        {
            error((new StringBuilder()).append("illegal tag name: ").append(name).toString());
        }
        if (k != -1)
        {
            prefix = name.substring(0, k);
            name = name.substring(k + 1);
        }
        namespace = getNamespace(prefix);
        if (namespace == null)
        {
            if (prefix != null)
            {
                error((new StringBuilder()).append("undefined prefix: ").append(prefix).toString());
            }
            namespace = "";
        }
        return flag;
        if (true) goto _L7; else goto _L6
_L6:
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

    private final void error(String s)
        throws XmlPullParserException
    {
        if (relaxed)
        {
            if (error == null)
            {
                error = (new StringBuilder()).append("ERR: ").append(s).toString();
            }
            return;
        } else
        {
            exception(s);
            return;
        }
    }

    private final void exception(String s)
        throws XmlPullParserException
    {
        if (s.length() >= 100)
        {
            s = (new StringBuilder()).append(s.substring(0, 100)).append("\n").toString();
        }
        throw new XmlPullParserException(s, this, null);
    }

    private final String get(int i)
    {
        return new String(txtBuf, i, txtPos - i);
    }

    private final boolean isProp(String s, boolean flag, String s1)
    {
        if (!s.startsWith("http://xmlpull.org/v1/doc/"))
        {
            return false;
        }
        if (flag)
        {
            return s.substring(42).equals(s1);
        } else
        {
            return s.substring(40).equals(s1);
        }
    }

    private final void nextImpl()
        throws IOException, XmlPullParserException
    {
        boolean flag;
        flag = false;
        if (reader == null)
        {
            exception("No Input specified");
        }
        if (type == 3)
        {
            depth = depth - 1;
        }
_L7:
        attributeCount = -1;
        if (!degenerated) goto _L2; else goto _L1
_L1:
        degenerated = false;
        type = 3;
_L4:
        return;
_L2:
        if (error != null)
        {
            for (int i = 0; i < error.length(); i++)
            {
                push(error.charAt(i));
            }

            error = null;
            type = 9;
            return;
        }
        prefix = null;
        name = null;
        namespace = null;
        type = peekType();
        switch (type)
        {
        case 5: // '\005'
        default:
            type = parseLegacy(token);
            if (type != 998)
            {
                return;
            }
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            break;

        case 6: // '\006'
            pushEntity();
            return;

        case 2: // '\002'
            parseStartTag(false);
            return;

        case 3: // '\003'
            parseEndTag();
            return;

        case 4: // '\004'
            if (!token)
            {
                flag = true;
            }
            pushText(60, flag);
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (depth != 0 || !isWhitespace) goto _L4; else goto _L5
_L5:
        type = 7;
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private final void parseDoctype(boolean flag)
        throws IOException, XmlPullParserException
    {
        boolean flag1;
        int j;
        j = 1;
        flag1 = false;
_L10:
        int k = read();
        k;
        JVM INSTR lookupswitch 4: default 56
    //                   -1: 87
    //                   39: 94
    //                   60: 114
    //                   62: 135;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        int i;
        boolean flag2;
        flag2 = flag1;
        i = j;
_L6:
        j = i;
        flag1 = flag2;
        if (flag)
        {
            push(k);
            j = i;
            flag1 = flag2;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        error("Unexpected EOF");
        return;
_L3:
        if (!flag1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i = j;
        flag2 = flag1;
        continue; /* Loop/switch isn't completed */
_L4:
        i = j;
        flag2 = flag1;
        if (!flag1)
        {
            i = j + 1;
            flag2 = flag1;
        }
        if (true) goto _L6; else goto _L5
_L5:
        i = j;
        flag2 = flag1;
        if (flag1) goto _L6; else goto _L7
_L7:
        j--;
        i = j;
        flag2 = flag1;
        if (j != 0) goto _L6; else goto _L8
_L8:
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private final void parseEndTag()
        throws IOException, XmlPullParserException
    {
        read();
        read();
        name = readName();
        skip();
        read('>');
        int i = depth - 1 << 2;
        if (depth == 0)
        {
            error("element stack empty");
            type = 9;
        } else
        if (!relaxed)
        {
            if (!name.equals(elementStack[i + 3]))
            {
                error((new StringBuilder()).append("expected: /").append(elementStack[i + 3]).append(" read: ").append(name).toString());
            }
            namespace = elementStack[i];
            prefix = elementStack[i + 1];
            name = elementStack[i + 2];
            return;
        }
    }

    private final int parseLegacy(boolean flag)
        throws IOException, XmlPullParserException
    {
        String s;
        int i;
        boolean flag1;
        s = "";
        flag1 = false;
        read();
        i = read();
        if (i != 63) goto _L2; else goto _L1
_L1:
        if (peek(0) != 120 && peek(0) != 88 || peek(1) != 109 && peek(1) != 77) goto _L4; else goto _L3
_L3:
        if (flag)
        {
            push(peek(0));
            push(peek(1));
        }
        read();
        read();
        if (peek(0) != 108 && peek(0) != 76 || peek(1) > 32) goto _L4; else goto _L5
_L5:
        int k;
        if (line != 1 || column > 4)
        {
            error("PI must not start with xml");
        }
        parseStartTag(true);
        if (attributeCount < 1 || !"version".equals(attributes[2]))
        {
            error("version expected");
        }
        version = attributes[3];
        int j = 1;
        i = j;
        if (1 < attributeCount)
        {
            i = j;
            if ("encoding".equals(attributes[6]))
            {
                encoding = attributes[7];
                i = 1 + 1;
            }
        }
        j = i;
        if (i < attributeCount)
        {
            j = i;
            if ("standalone".equals(attributes[i * 4 + 2]))
            {
                s = attributes[i * 4 + 3];
                if ("yes".equals(s))
                {
                    standalone = new Boolean(true);
                } else
                if ("no".equals(s))
                {
                    standalone = new Boolean(false);
                } else
                {
                    error((new StringBuilder()).append("illegal standalone value: ").append(s).toString());
                }
                j = i + 1;
            }
        }
        if (j != attributeCount)
        {
            error("illegal xmldecl");
        }
        isWhitespace = true;
        txtPos = 0;
        k = 998;
_L9:
        return k;
_L4:
        byte byte0;
        byte0 = 63;
        i = 8;
_L7:
        for (k = 0; k < s.length(); k++)
        {
            read(s.charAt(k));
        }

        break; /* Loop/switch isn't completed */
_L2:
        if (i == 33)
        {
            if (peek(0) == 45)
            {
                i = 9;
                s = "--";
                byte0 = 45;
            } else
            if (peek(0) == 91)
            {
                i = 5;
                s = "[CDATA[";
                byte0 = 93;
                flag = true;
            } else
            {
                i = 10;
                s = "DOCTYPE";
                byte0 = -1;
            }
        } else
        {
            error((new StringBuilder()).append("illegal: <").append(i).toString());
            return 9;
        }
        if (true) goto _L7; else goto _L6
_L6:
        k = ((flag1) ? 1 : 0);
        if (i == 10)
        {
            parseDoctype(flag);
            return i;
        }
        do
        {
            l = read();
            if (l == -1)
            {
                error("Unexpected EOF");
                return 9;
            }
            if (flag)
            {
                push(l);
            }
            if (byte0 != 63 && l != byte0 || peek(0) != byte0 || peek(1) != 62)
            {
                k = l;
            } else
            {
                break;
            }
        } while (true);
        if (byte0 == 45 && k == 45 && !relaxed)
        {
            error("illegal comment delimiter: --->");
        }
        read();
        read();
        k = i;
        if (flag)
        {
            k = i;
            if (byte0 != 63)
            {
                txtPos = txtPos - 1;
                return i;
            }
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    private final void parseStartTag(boolean flag)
        throws IOException, XmlPullParserException
    {
        if (!flag)
        {
            read();
        }
        name = readName();
        attributeCount = 0;
_L3:
        int i;
label0:
        {
            skip();
            i = peek(0);
            if (flag)
            {
                if (i == 63)
                {
                    read();
                    read('>');
                    return;
                }
                break label0;
            }
            int ai[];
            if (i == 47)
            {
                degenerated = true;
                read();
                skip();
                read('>');
            } else
            {
                if (i != 62 || flag)
                {
                    break label0;
                }
                read();
            }
        }
_L1:
        i = depth;
        depth = i + 1;
        i <<= 2;
        elementStack = ensureCapacity(elementStack, i + 4);
        elementStack[i + 3] = name;
        if (depth >= nspCounts.length)
        {
            ai = new int[depth + 4];
            System.arraycopy(nspCounts, 0, ai, 0, nspCounts.length);
            nspCounts = ai;
        }
        nspCounts[depth] = nspCounts[depth - 1];
        String s;
        String as[];
        int j;
        int k;
        if (processNsp)
        {
            adjustNsp();
        } else
        {
            namespace = "";
        }
        elementStack[i] = namespace;
        elementStack[i + 1] = prefix;
        elementStack[i + 2] = name;
        return;
label1:
        {
            if (i == -1)
            {
                error("Unexpected EOF");
                return;
            }
            s = readName();
            if (s.length() != 0)
            {
                break label1;
            }
            error("attr name expected");
        }
          goto _L1
        i = attributeCount;
        attributeCount = i + 1;
        j = i << 2;
        attributes = ensureCapacity(attributes, j + 4);
        as = attributes;
        i = j + 1;
        as[j] = "";
        as = attributes;
        k = i + 1;
        as[i] = null;
        as = attributes;
        j = k + 1;
        as[k] = s;
        skip();
        if (peek(0) != 61)
        {
            if (!relaxed)
            {
                error((new StringBuilder()).append("Attr.value missing f. ").append(s).toString());
            }
            attributes[j] = s;
        } else
        {
            read('=');
            skip();
            i = peek(0);
            if (i != 39 && i != 34)
            {
                if (!relaxed)
                {
                    error("attr value delimiter missing!");
                }
                i = 32;
            } else
            {
                read();
            }
            k = txtPos;
            pushText(i, true);
            attributes[j] = get(k);
            txtPos = k;
            if (i != 32)
            {
                read();
            }
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    private final int peek(int i)
        throws IOException
    {
        while (i >= peekCount) 
        {
            int j;
            if (srcBuf.length <= 1)
            {
                j = reader.read();
            } else
            if (srcPos < srcCount)
            {
                char ac[] = srcBuf;
                j = srcPos;
                srcPos = j + 1;
                j = ac[j];
            } else
            {
                srcCount = reader.read(srcBuf, 0, srcBuf.length);
                if (srcCount <= 0)
                {
                    j = -1;
                } else
                {
                    j = srcBuf[0];
                }
                srcPos = 1;
            }
            if (j == 13)
            {
                wasCR = true;
                int ai[] = peek;
                j = peekCount;
                peekCount = j + 1;
                ai[j] = 10;
            } else
            {
                if (j == 10)
                {
                    if (!wasCR)
                    {
                        int ai1[] = peek;
                        j = peekCount;
                        peekCount = j + 1;
                        ai1[j] = 10;
                    }
                } else
                {
                    int ai2[] = peek;
                    int k = peekCount;
                    peekCount = k + 1;
                    ai2[k] = j;
                }
                wasCR = false;
            }
        }
        return peek[i];
    }

    private final int peekType()
        throws IOException
    {
        byte byte0 = 1;
        switch (peek(0))
        {
        default:
            byte0 = 4;
            // fall through

        case -1: 
            return byte0;

        case 38: // '&'
            return 6;

        case 60: // '<'
            switch (peek(1))
            {
            default:
                return 2;

            case 47: // '/'
                return 3;

            case 33: // '!'
            case 63: // '?'
                return 999;
            }
        }
    }

    private final void push(int i)
    {
        boolean flag = isWhitespace;
        char ac1[];
        int j;
        if (i <= 32)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        isWhitespace = j & flag;
        if (txtPos == txtBuf.length)
        {
            char ac[] = new char[(txtPos * 4) / 3 + 4];
            System.arraycopy(txtBuf, 0, ac, 0, txtPos);
            txtBuf = ac;
        }
        ac1 = txtBuf;
        j = txtPos;
        txtPos = j + 1;
        ac1[j] = (char)i;
    }

    private final void pushEntity()
        throws IOException, XmlPullParserException
    {
        boolean flag = true;
        push(read());
        int i = txtPos;
        do
        {
            int k = peek(0);
            if (k == 59)
            {
                read();
                String s = get(i);
                txtPos = i - 1;
                if (token && type == 6)
                {
                    name = s;
                }
                if (s.charAt(0) == '#')
                {
                    if (s.charAt(1) == 'x')
                    {
                        i = Integer.parseInt(s.substring(2), 16);
                    } else
                    {
                        i = Integer.parseInt(s.substring(1));
                    }
                    push(i);
                } else
                {
                    String s1 = (String)entityMap.get(s);
                    if (s1 != null)
                    {
                        flag = false;
                    }
                    unresolved = flag;
                    if (unresolved)
                    {
                        if (!token)
                        {
                            error((new StringBuilder()).append("unresolved: &").append(s).append(";").toString());
                            return;
                        }
                    } else
                    {
                        int j = 0;
                        while (j < s1.length()) 
                        {
                            push(s1.charAt(j));
                            j++;
                        }
                    }
                }
                return;
            }
            if (k < 128 && (k < 48 || k > 57) && (k < 97 || k > 122) && (k < 65 || k > 90) && k != 95 && k != 45 && k != 35)
            {
                if (!relaxed)
                {
                    error("unterminated entity ref");
                }
                System.out.println((new StringBuilder()).append("broken entitiy: ").append(get(i - 1)).toString());
                return;
            }
            push(read());
        } while (true);
    }

    private final void pushText(int i, boolean flag)
        throws IOException, XmlPullParserException
    {
        int j;
        int k;
        k = peek(0);
        j = 0;
_L6:
        if (k != -1 && k != i && (i != 32 || k > 32 && k != 62)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (k != 38) goto _L4; else goto _L3
_L3:
        if (!flag) goto _L1; else goto _L5
_L5:
        pushEntity();
_L7:
        if (k == 62 && j >= 2 && i != 93)
        {
            error("Illegal: ]]>");
        }
        if (k == 93)
        {
            j++;
        } else
        {
            j = 0;
        }
        k = peek(0);
        if (true) goto _L6; else goto _L4
_L4:
        if (k == 10 && type == 2)
        {
            read();
            push(32);
        } else
        {
            push(read());
        }
          goto _L7
    }

    private final int read()
        throws IOException
    {
        int i;
        if (peekCount == 0)
        {
            i = peek(0);
        } else
        {
            i = peek[0];
            peek[0] = peek[1];
        }
        peekCount = peekCount - 1;
        column = column + 1;
        if (i == 10)
        {
            line = line + 1;
            column = 1;
        }
        return i;
    }

    private final void read(char c)
        throws IOException, XmlPullParserException
    {
        int i = read();
        if (i != c)
        {
            error((new StringBuilder()).append("expected: '").append(c).append("' actual: '").append((char)i).append("'").toString());
        }
    }

    private final String readName()
        throws IOException, XmlPullParserException
    {
        int i = txtPos;
        int j = peek(0);
        if ((j < 97 || j > 122) && (j < 65 || j > 90) && j != 95 && j != 58 && j < 192 && !relaxed)
        {
            error("name expected");
        }
        do
        {
            push(read());
            j = peek(0);
        } while (j >= 97 && j <= 122 || j >= 65 && j <= 90 || j >= 48 && j <= 57 || j == 95 || j == 45 || j == 58 || j == 46 || j >= 183);
        String s = get(i);
        txtPos = i;
        return s;
    }

    private final void skip()
        throws IOException
    {
        do
        {
            int i = peek(0);
            if (i > 32 || i == -1)
            {
                return;
            }
            read();
        } while (true);
    }

    public void defineEntityReplacementText(String s, String s1)
        throws XmlPullParserException
    {
        if (entityMap == null)
        {
            throw new RuntimeException("entity replacement text must be defined after setInput!");
        } else
        {
            entityMap.put(s, s1);
            return;
        }
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
        return column;
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
        boolean flag = false;
        if ("http://xmlpull.org/v1/doc/features.html#process-namespaces".equals(s))
        {
            flag = processNsp;
        } else
        if (isProp(s, false, "relaxed"))
        {
            return relaxed;
        }
        return flag;
    }

    public String getInputEncoding()
    {
        return encoding;
    }

    public int getLineNumber()
    {
        return line;
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
        String s;
        StringBuffer stringbuffer;
        if (type < TYPES.length)
        {
            s = TYPES[type];
        } else
        {
            s = "unknown";
        }
        stringbuffer = new StringBuffer(s);
        stringbuffer.append(' ');
        if (type == 2 || type == 3)
        {
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
            int j = attributeCount;
            for (int i = 0; i < j << 2; i += 4)
            {
                stringbuffer.append(' ');
                if (attributes[i + 1] != null)
                {
                    stringbuffer.append((new StringBuilder()).append("{").append(attributes[i]).append("}").append(attributes[i + 1]).append(":").toString());
                }
                stringbuffer.append((new StringBuilder()).append(attributes[i + 2]).append("='").append(attributes[i + 3]).append("'").toString());
            }

            stringbuffer.append('>');
        } else
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
        stringbuffer.append((new StringBuilder()).append("@").append(line).append(":").append(column).toString());
        if (location != null)
        {
            stringbuffer.append(" in ");
            stringbuffer.append(location);
        } else
        if (reader != null)
        {
            stringbuffer.append(" in ");
            stringbuffer.append(reader.toString());
        }
        return stringbuffer.toString();
    }

    public String getPrefix()
    {
        return prefix;
    }

    public Object getProperty(String s)
    {
        if (isProp(s, true, "xmldecl-version"))
        {
            return version;
        }
        if (isProp(s, true, "xmldecl-standalone"))
        {
            return standalone;
        }
        if (isProp(s, true, "location"))
        {
            if (location != null)
            {
                return location;
            } else
            {
                return reader.toString();
            }
        } else
        {
            return null;
        }
    }

    public String getText()
    {
        if (type < 4 || type == 6 && unresolved)
        {
            return null;
        } else
        {
            return get(0);
        }
    }

    public char[] getTextCharacters(int ai[])
    {
        if (type >= 4)
        {
            if (type == 6)
            {
                ai[0] = 0;
                ai[1] = name.length();
                return name.toCharArray();
            } else
            {
                ai[0] = 0;
                ai[1] = txtPos;
                return txtBuf;
            }
        } else
        {
            ai[0] = -1;
            ai[1] = -1;
            return null;
        }
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
        txtPos = 0;
        isWhitespace = true;
        int i = 9999;
        token = false;
        int j;
        do
        {
            do
            {
                nextImpl();
                j = i;
                if (type < i)
                {
                    j = type;
                }
                i = j;
            } while (j > 6);
            if (j < 4)
            {
                break;
            }
            i = j;
        } while (peekType() >= 4);
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
        txtPos = 0;
        token = true;
        nextImpl();
        return type;
    }

    public void require(int i, String s, String s1)
        throws XmlPullParserException, IOException
    {
        if (i != type || s != null && !s.equals(getNamespace()) || s1 != null && !s1.equals(getName()))
        {
            exception((new StringBuilder()).append("expected: ").append(TYPES[i]).append(" {").append(s).append("}").append(s1).toString());
        }
    }

    public void setFeature(String s, boolean flag)
        throws XmlPullParserException
    {
        if ("http://xmlpull.org/v1/doc/features.html#process-namespaces".equals(s))
        {
            processNsp = flag;
            return;
        }
        if (isProp(s, false, "relaxed"))
        {
            relaxed = flag;
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
        Object obj;
        Object obj1;
        int i;
        srcPos = 0;
        srcCount = 0;
        obj1 = s;
        if (inputstream == null)
        {
            throw new IllegalArgumentException();
        }
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_646;
        }
        i = 0;
_L13:
        if (srcCount >= 4) goto _L2; else goto _L1
_L1:
        int j = inputstream.read();
        if (j != -1) goto _L3; else goto _L2
_L2:
        obj = obj1;
        if (srcCount != 4)
        {
            break MISSING_BLOCK_LABEL_646;
        }
        i;
        JVM INSTR lookupswitch 7: default 640
    //                   -131072: 300
    //                   60: 312
    //                   65279: 288
    //                   3932223: 352
    //                   1006632960: 332
    //                   1006649088: 380
    //                   1010792557: 408;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L15:
        if ((0xffff0000 & i) == 0xfeff0000)
        {
            obj = "UTF-16BE";
            int k;
            try
            {
                srcBuf[0] = (char)(srcBuf[2] << 8 | srcBuf[3]);
                srcCount = 1;
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                throw new XmlPullParserException((new StringBuilder()).append("Invalid stream or encoding: ").append(inputstream.toString()).toString(), this, inputstream);
            }
            break MISSING_BLOCK_LABEL_646;
        }
          goto _L12
_L20:
        i = srcCount;
        setInput(((Reader) (new InputStreamReader(inputstream, ((String) (obj1))))));
        encoding = s;
        srcCount = i;
        return;
_L3:
        i = i << 8 | j;
        obj = srcBuf;
        k = srcCount;
        srcCount = k + 1;
        obj[k] = (char)j;
          goto _L13
_L7:
        obj = "UTF-32BE";
        srcCount = 0;
        break MISSING_BLOCK_LABEL_646;
_L5:
        obj = "UTF-32LE";
        srcCount = 0;
        break MISSING_BLOCK_LABEL_646;
_L6:
        obj = "UTF-32BE";
        srcBuf[0] = '<';
        srcCount = 1;
        break MISSING_BLOCK_LABEL_646;
_L9:
        obj = "UTF-32LE";
        srcBuf[0] = '<';
        srcCount = 1;
        break MISSING_BLOCK_LABEL_646;
_L8:
        obj = "UTF-16BE";
        srcBuf[0] = '<';
        srcBuf[1] = '?';
        srcCount = 2;
        break MISSING_BLOCK_LABEL_646;
_L10:
        obj = "UTF-16LE";
        srcBuf[0] = '<';
        srcBuf[1] = '?';
        srcCount = 2;
        break MISSING_BLOCK_LABEL_646;
_L11:
        j = inputstream.read();
        obj = obj1;
        if (j == -1) goto _L15; else goto _L14
_L14:
        int l;
        obj = srcBuf;
        l = srcCount;
        srcCount = l + 1;
        obj[l] = (char)j;
        if (j != 62) goto _L11; else goto _L16
_L16:
        String s1;
        s1 = new String(srcBuf, 0, srcCount);
        j = s1.indexOf("encoding");
        obj = obj1;
        if (j == -1) goto _L15; else goto _L17
_L17:
        for (; s1.charAt(j) != '"' && s1.charAt(j) != '\''; j++) { }
        l = j + 1;
        obj = s1.substring(l, s1.indexOf(s1.charAt(j), l));
          goto _L15
_L12:
        if ((0xffff0000 & i) != 0xfffe0000) goto _L19; else goto _L18
_L18:
        obj = "UTF-16LE";
        srcBuf[0] = (char)(srcBuf[3] << 8 | srcBuf[2]);
        srcCount = 1;
        break MISSING_BLOCK_LABEL_646;
_L19:
        if ((i & 0xffffff00) != 0xefbbbf00)
        {
            break MISSING_BLOCK_LABEL_646;
        }
        obj = "UTF-8";
        srcBuf[0] = srcBuf[3];
        srcCount = 1;
        break MISSING_BLOCK_LABEL_646;
_L4:
        obj = obj1;
          goto _L15
        obj1 = obj;
        if (obj == null)
        {
            obj1 = "UTF-8";
        }
          goto _L20
    }

    public void setInput(Reader reader1)
        throws XmlPullParserException
    {
        reader = reader1;
        line = 1;
        column = 0;
        type = 0;
        name = null;
        namespace = null;
        degenerated = false;
        attributeCount = -1;
        encoding = null;
        version = null;
        standalone = null;
        if (reader1 == null)
        {
            return;
        } else
        {
            srcPos = 0;
            srcCount = 0;
            peekCount = 0;
            depth = 0;
            entityMap = new Hashtable();
            entityMap.put("amp", "&");
            entityMap.put("apos", "'");
            entityMap.put("gt", ">");
            entityMap.put("lt", "<");
            entityMap.put("quot", "\"");
            return;
        }
    }

    public void setProperty(String s, Object obj)
        throws XmlPullParserException
    {
        if (isProp(s, true, "location"))
        {
            location = obj;
            return;
        } else
        {
            throw new XmlPullParserException((new StringBuilder()).append("unsupported property: ").append(s).toString());
        }
    }

    public void skipSubTree()
        throws XmlPullParserException, IOException
    {
        require(2, null, null);
        int i = 1;
        do
        {
            if (i <= 0)
            {
                break;
            }
            int j = next();
            if (j == 3)
            {
                i--;
            } else
            if (j == 2)
            {
                i++;
            }
        } while (true);
    }
}
