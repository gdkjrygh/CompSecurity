// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kobjects.xml;

import java.io.IOException;
import java.io.Reader;
import java.util.Hashtable;

public class XmlReader
{

    static final int CDSECT = 5;
    public static final int END_DOCUMENT = 1;
    public static final int END_TAG = 3;
    static final int ENTITY_REF = 6;
    private static final int LEGACY = 999;
    public static final int START_DOCUMENT = 0;
    public static final int START_TAG = 2;
    public static final int TEXT = 4;
    private static final String UNEXPECTED_EOF = "Unexpected EOF";
    private String TYPES[] = {
        "Start Document", "End Document", "Start Tag", "End Tag", "Text"
    };
    private int attributeCount;
    private String attributes[];
    private int column;
    private boolean degenerated;
    private int depth;
    private String elementStack[];
    private Hashtable entityMap;
    private boolean eof;
    private boolean isWhitespace;
    private int line;
    private String name;
    private int peek0;
    private int peek1;
    private Reader reader;
    public boolean relaxed;
    private char srcBuf[];
    private int srcCount;
    private int srcPos;
    private String text;
    private char txtBuf[];
    private int txtPos;
    private int type;

    public XmlReader(Reader reader1)
        throws IOException
    {
        elementStack = new String[4];
        char c;
        boolean flag;
        if (Runtime.getRuntime().freeMemory() >= 0x100000L)
        {
            c = '\u2000';
        } else
        {
            c = '\200';
        }
        srcBuf = new char[c];
        txtBuf = new char[128];
        attributes = new String[16];
        reader = reader1;
        peek0 = reader1.read();
        peek1 = reader1.read();
        if (peek0 == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        eof = flag;
        entityMap = new Hashtable();
        entityMap.put("amp", "&");
        entityMap.put("apos", "'");
        entityMap.put("gt", ">");
        entityMap.put("lt", "<");
        entityMap.put("quot", "\"");
        line = 1;
        column = 1;
    }

    private static final String[] ensureCapacity(String as[], int i)
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
        throws IOException
    {
        throw new IOException((new StringBuilder()).append(s).append(" pos: ").append(getPositionDescription()).toString());
    }

    private final void parseDoctype()
        throws IOException
    {
        int i = 1;
        int j;
        do
        {
label0:
            do
            {
                switch (read())
                {
                default:
                    break;

                case -1: 
                    exception("Unexpected EOF");
                    // fall through

                case 60: // '<'
                    i++;
                    break;

                case 62: // '>'
                    j = i - 1;
                    break label0;
                }
            } while (true);
            i = j;
        } while (j != 0);
    }

    private final void parseEndTag()
        throws IOException
    {
        read();
        read();
        name = readName();
        if (depth == 0 && !relaxed)
        {
            exception("element stack empty");
        }
        if (!name.equals(elementStack[depth - 1])) goto _L2; else goto _L1
_L1:
        depth = depth - 1;
_L4:
        skip();
        read('>');
        return;
_L2:
        if (!relaxed)
        {
            exception((new StringBuilder()).append("expected: ").append(elementStack[depth]).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private final void parseLegacy(boolean flag)
        throws IOException
    {
        String s = "";
        read();
        int i = read();
        int j;
        if (i == 63)
        {
            i = 63;
        } else
        if (i == 33)
        {
            if (peek0 == 45)
            {
                s = "--";
                i = 45;
            } else
            {
                s = "DOCTYPE";
                i = -1;
            }
        } else
        {
            if (i != 91)
            {
                exception((new StringBuilder()).append("cantreachme: ").append(i).toString());
            }
            s = "CDATA[";
            i = 93;
        }
        for (j = 0; j < s.length(); j++)
        {
            read(s.charAt(j));
        }

        if (i == -1)
        {
            parseDoctype();
        } else
        {
            int k;
            do
            {
                if (eof)
                {
                    exception("Unexpected EOF");
                }
                k = read();
                if (flag)
                {
                    push(k);
                }
            } while (i != 63 && k != i || peek0 != i || peek1 != 62);
            read();
            read();
            if (flag && i != 63)
            {
                pop(txtPos - 1);
                return;
            }
        }
    }

    private final void parseStartTag()
        throws IOException
    {
        read();
        name = readName();
        elementStack = ensureCapacity(elementStack, depth + 1);
        String as[] = elementStack;
        int i = depth;
        depth = i + 1;
        as[i] = name;
        do
        {
            int j;
            do
            {
                skip();
                j = peek0;
                if (j == 47)
                {
                    degenerated = true;
                    read();
                    skip();
                    read('>');
                    return;
                }
                if (j == 62)
                {
                    read();
                    return;
                }
                if (j == -1)
                {
                    exception("Unexpected EOF");
                }
                String s = readName();
                if (s.length() == 0)
                {
                    exception("attr name expected");
                }
                skip();
                read('=');
                skip();
                int k = read();
                j = k;
                if (k != 39)
                {
                    j = k;
                    if (k != 34)
                    {
                        if (!relaxed)
                        {
                            exception((new StringBuilder()).append("<").append(name).append(">: invalid delimiter: ").append((char)k).toString());
                        }
                        j = 32;
                    }
                }
                k = attributeCount;
                attributeCount = k + 1;
                k <<= 1;
                attributes = ensureCapacity(attributes, k + 4);
                attributes[k] = s;
                int l = txtPos;
                pushText(j);
                attributes[k + 1] = pop(l);
            } while (j == 32);
            read();
        } while (true);
    }

    private final int peekType()
    {
        switch (peek0)
        {
        default:
            return 4;

        case -1: 
            return 1;

        case 38: // '&'
            return 6;

        case 60: // '<'
            switch (peek1)
            {
            default:
                return 2;

            case 47: // '/'
                return 3;

            case 91: // '['
                return 5;

            case 33: // '!'
            case 63: // '?'
                return 999;
            }
        }
    }

    private final String pop(int i)
    {
        String s = new String(txtBuf, i, txtPos - i);
        txtPos = i;
        return s;
    }

    private final void push(int i)
    {
        if (i == 0)
        {
            return;
        }
        if (txtPos == txtBuf.length)
        {
            char ac[] = new char[(txtPos * 4) / 3 + 4];
            System.arraycopy(txtBuf, 0, ac, 0, txtPos);
            txtBuf = ac;
        }
        char ac1[] = txtBuf;
        int j = txtPos;
        txtPos = j + 1;
        ac1[j] = (char)i;
    }

    private final boolean pushText(int i)
        throws IOException
    {
        int j;
        boolean flag;
        flag = true;
        j = peek0;
_L2:
        if (eof || j == i || i == 32 && (j <= 32 || j == 62))
        {
            return flag;
        }
        if (j != 38)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!pushEntity())
        {
            flag = false;
        }
_L3:
        j = peek0;
        if (true) goto _L2; else goto _L1
_L1:
        if (j > 32)
        {
            flag = false;
        }
        push(read());
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    private final int read()
        throws IOException
    {
        int i = peek0;
        peek0 = peek1;
        if (peek0 == -1)
        {
            eof = true;
            return i;
        }
        if (i == 10 || i == 13)
        {
            line = line + 1;
            column = 0;
            if (i == 13 && peek0 == 10)
            {
                peek0 = 0;
            }
        }
        column = column + 1;
        if (srcPos >= srcCount)
        {
            srcCount = reader.read(srcBuf, 0, srcBuf.length);
            if (srcCount <= 0)
            {
                peek1 = -1;
                return i;
            }
            srcPos = 0;
        }
        char ac[] = srcBuf;
        int j = srcPos;
        srcPos = j + 1;
        peek1 = ac[j];
        return i;
    }

    private final void read(char c)
        throws IOException
    {
label0:
        {
            if (read() != c)
            {
                if (!relaxed)
                {
                    break label0;
                }
                if (c <= ' ')
                {
                    skip();
                    read();
                }
            }
            return;
        }
        exception((new StringBuilder()).append("expected: '").append(c).append("'").toString());
    }

    private final String readName()
        throws IOException
    {
        int i = txtPos;
        int j = peek0;
        if ((j < 97 || j > 122) && (j < 65 || j > 90) && j != 95 && j != 58 && !relaxed)
        {
            exception("name expected");
        }
        do
        {
            push(read());
            j = peek0;
        } while (j >= 97 && j <= 122 || j >= 65 && j <= 90 || j >= 48 && j <= 57 || j == 95 || j == 45 || j == 58 || j == 46);
        return pop(i);
    }

    private final void skip()
        throws IOException
    {
        while (!eof && peek0 <= 32) 
        {
            read();
        }
    }

    public void defineCharacterEntity(String s, String s1)
    {
        entityMap.put(s, s1);
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
            return attributes[i << 1];
        }
    }

    public String getAttributeValue(int i)
    {
        if (i >= attributeCount)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            return attributes[(i << 1) + 1];
        }
    }

    public String getAttributeValue(String s)
    {
        for (int i = (attributeCount << 1) - 2; i >= 0; i -= 2)
        {
            if (attributes[i].equals(s))
            {
                return attributes[i + 1];
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

    public int getLineNumber()
    {
        return line;
    }

    public String getName()
    {
        return name;
    }

    public String getPositionDescription()
    {
        Object obj;
        if (type < TYPES.length)
        {
            obj = TYPES[type];
        } else
        {
            obj = "Other";
        }
        obj = new StringBuffer(((String) (obj)));
        ((StringBuffer) (obj)).append((new StringBuilder()).append(" @").append(line).append(":").append(column).append(": ").toString());
        if (type == 2 || type == 3)
        {
            ((StringBuffer) (obj)).append('<');
            if (type == 3)
            {
                ((StringBuffer) (obj)).append('/');
            }
            ((StringBuffer) (obj)).append(name);
            ((StringBuffer) (obj)).append('>');
        } else
        if (isWhitespace)
        {
            ((StringBuffer) (obj)).append("[whitespace]");
        } else
        {
            ((StringBuffer) (obj)).append(getText());
        }
        return ((StringBuffer) (obj)).toString();
    }

    public String getText()
    {
        if (text == null)
        {
            text = pop(0);
        }
        return text;
    }

    public int getType()
    {
        return type;
    }

    public boolean isEmptyElementTag()
    {
        return degenerated;
    }

    public boolean isWhitespace()
    {
        return isWhitespace;
    }

    public int next()
        throws IOException
    {
        boolean flag;
        flag = true;
        if (degenerated)
        {
            type = 3;
            degenerated = false;
            depth = depth - 1;
            return type;
        }
        txtPos = 0;
        isWhitespace = true;
_L10:
        attributeCount = 0;
        name = null;
        text = null;
        type = peekType();
        type;
        JVM INSTR tableswitch 1 6: default 108
    //                   1 113
    //                   2 183
    //                   3 190
    //                   4 197
    //                   5 215
    //                   6 162;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L6:
        break MISSING_BLOCK_LABEL_215;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        parseLegacy(false);
_L8:
        if (type <= 4 && (type != 4 || peekType() < 4))
        {
            boolean flag1 = isWhitespace;
            if (type != 4)
            {
                flag = false;
            }
            isWhitespace = flag & flag1;
            return type;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        isWhitespace = isWhitespace & pushEntity();
        type = 4;
          goto _L8
_L3:
        parseStartTag();
          goto _L8
_L4:
        parseEndTag();
          goto _L8
_L5:
        isWhitespace = isWhitespace & pushText(60);
          goto _L8
        parseLegacy(true);
        isWhitespace = false;
        type = 4;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final boolean pushEntity()
        throws IOException
    {
        read();
        int i = txtPos;
        while (!eof && peek0 != 59) 
        {
            push(read());
        }
        String s2 = pop(i);
        read();
        if (s2.length() > 0 && s2.charAt(0) == '#')
        {
            int j;
            if (s2.charAt(1) == 'x')
            {
                j = Integer.parseInt(s2.substring(2), 16);
            } else
            {
                j = Integer.parseInt(s2.substring(1));
            }
            push(j);
            return j <= 32;
        }
        String s1 = (String)entityMap.get(s2);
        boolean flag = true;
        String s = s1;
        if (s1 == null)
        {
            s = (new StringBuilder()).append("&").append(s2).append(";").toString();
        }
        for (int k = 0; k < s.length(); k++)
        {
            char c = s.charAt(k);
            if (c > ' ')
            {
                flag = false;
            }
            push(c);
        }

        return flag;
    }

    public String readText()
        throws IOException
    {
        if (type != 4)
        {
            return "";
        } else
        {
            String s = getText();
            next();
            return s;
        }
    }

    public void require(int i, String s)
        throws IOException
    {
        if (type == 4 && i != 4 && isWhitespace())
        {
            next();
        }
        if (i != type || s != null && !s.equals(getName()))
        {
            exception((new StringBuilder()).append("expected: ").append(TYPES[i]).append("/").append(s).toString());
        }
    }
}
