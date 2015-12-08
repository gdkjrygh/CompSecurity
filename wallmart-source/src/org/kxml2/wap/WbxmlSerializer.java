// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kxml2.wap;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Hashtable;
import java.util.Vector;
import org.xmlpull.v1.XmlSerializer;

public class WbxmlSerializer
    implements XmlSerializer
{

    private int attrPage;
    Hashtable attrStartTable;
    Hashtable attrValueTable;
    Vector attributes;
    ByteArrayOutputStream buf;
    int depth;
    private String encoding;
    private boolean headerSent;
    String name;
    String namespace;
    OutputStream out;
    String pending;
    Hashtable stringTable;
    ByteArrayOutputStream stringTableBuf;
    private int tagPage;
    Hashtable tagTable;

    public WbxmlSerializer()
    {
        stringTable = new Hashtable();
        buf = new ByteArrayOutputStream();
        stringTableBuf = new ByteArrayOutputStream();
        attributes = new Vector();
        attrStartTable = new Hashtable();
        attrValueTable = new Hashtable();
        tagTable = new Hashtable();
        headerSent = false;
    }

    static void writeInt(OutputStream outputstream, int i)
        throws IOException
    {
        byte abyte0[] = new byte[5];
        boolean flag = false;
        int j = i;
        i = ((flag) ? 1 : 0);
        do
        {
            int k = i + 1;
            abyte0[i] = (byte)(j & 0x7f);
            j >>= 7;
            if (j == 0)
            {
                while (k > 1) 
                {
                    k--;
                    outputstream.write(abyte0[k] | 0x80);
                }
                outputstream.write(abyte0[0]);
                return;
            }
            i = k;
        } while (true);
    }

    private void writeStr(String s)
        throws IOException
    {
        int i;
        int k;
        int j1;
        i = 0;
        k = 0;
        j1 = s.length();
        if (!headerSent) goto _L2; else goto _L1
_L1:
        writeStrI(buf, s);
_L4:
        return;
_L2:
        do
        {
            if (i >= j1)
            {
                continue; /* Loop/switch isn't completed */
            }
            for (; i < j1 && s.charAt(i) < 'A'; i++) { }
            j = i;
            while (j < j1 && s.charAt(j) >= 'A') 
            {
                j++;
            }
            l = k;
            if (j - i > 10)
            {
                if (i > k && s.charAt(i - 1) == ' ' && stringTable.get(s.substring(i, j)) == null)
                {
                    buf.write(131);
                    writeStrT(s.substring(k, j), false);
                } else
                {
                    int i1 = i;
                    if (i > k)
                    {
                        i1 = i;
                        if (s.charAt(i - 1) == ' ')
                        {
                            i1 = i - 1;
                        }
                    }
                    if (i1 > k)
                    {
                        buf.write(131);
                        writeStrT(s.substring(k, i1), false);
                    }
                    buf.write(131);
                    writeStrT(s.substring(i1, j), true);
                }
                l = j;
            }
            i = j;
            k = l;
        } while (true);
        if (k >= j1) goto _L4; else goto _L3
_L3:
        buf.write(131);
        writeStrT(s.substring(k, j1), false);
        return;
    }

    private final void writeStrT(String s, boolean flag)
        throws IOException
    {
        Integer integer = (Integer)stringTable.get(s);
        ByteArrayOutputStream bytearrayoutputstream = buf;
        int i;
        if (integer == null)
        {
            i = addToStringTable(s, flag);
        } else
        {
            i = integer.intValue();
        }
        writeInt(bytearrayoutputstream, i);
    }

    public int addToStringTable(String s, boolean flag)
        throws IOException
    {
        if (headerSent)
        {
            throw new IOException("stringtable sent");
        }
        int k = stringTableBuf.size();
        int j = k;
        int i = j;
        String s1 = s;
        if (s.charAt(0) >= '0')
        {
            i = j;
            s1 = s;
            if (flag)
            {
                s1 = (new StringBuilder()).append(' ').append(s).toString();
                i = j + 1;
            }
        }
        stringTable.put(s1, new Integer(k));
        if (s1.charAt(0) == ' ')
        {
            stringTable.put(s1.substring(1), new Integer(k + 1));
        }
        j = s1.lastIndexOf(' ');
        if (j > 1)
        {
            stringTable.put(s1.substring(j), new Integer(k + j));
            stringTable.put(s1.substring(j + 1), new Integer(k + j + 1));
        }
        writeStrI(stringTableBuf, s1);
        stringTableBuf.flush();
        return i;
    }

    public XmlSerializer attribute(String s, String s1, String s2)
    {
        attributes.addElement(s1);
        attributes.addElement(s2);
        return this;
    }

    public void cdsect(String s)
        throws IOException
    {
        text(s);
    }

    public void checkPending(boolean flag)
        throws IOException
    {
        if (pending == null)
        {
            return;
        }
        int k = attributes.size();
        Object obj = (int[])(int[])tagTable.get(pending);
        if (obj == null)
        {
            obj = buf;
            Vector vector;
            int i;
            if (k == 0)
            {
                if (flag)
                {
                    i = 4;
                } else
                {
                    i = 68;
                }
            } else
            if (flag)
            {
                i = 132;
            } else
            {
                i = 196;
            }
            ((ByteArrayOutputStream) (obj)).write(i);
            writeStrT(pending, false);
        } else
        {
            if (obj[0] != tagPage)
            {
                tagPage = obj[0];
                buf.write(0);
                buf.write(tagPage);
            }
            ByteArrayOutputStream bytearrayoutputstream = buf;
            int j;
            if (k == 0)
            {
                if (flag)
                {
                    j = obj[1];
                } else
                {
                    j = obj[1] | 0x40;
                }
            } else
            if (flag)
            {
                j = obj[1] | 0x80;
            } else
            {
                j = obj[1] | 0xc0;
            }
            bytearrayoutputstream.write(j);
        }
        i = 0;
        do
        {
            while (i < k) 
            {
                obj = (int[])(int[])attrStartTable.get(attributes.elementAt(i));
                if (obj == null)
                {
                    buf.write(4);
                    writeStrT((String)attributes.elementAt(i), false);
                } else
                {
                    if (obj[0] != attrPage)
                    {
                        attrPage = obj[0];
                        buf.write(0);
                        buf.write(attrPage);
                    }
                    buf.write(obj[1]);
                }
                obj = attrValueTable;
                vector = attributes;
                i++;
                obj = (int[])(int[])((Hashtable) (obj)).get(vector.elementAt(i));
                if (obj == null)
                {
                    writeStr((String)attributes.elementAt(i));
                } else
                {
                    if (obj[0] != attrPage)
                    {
                        attrPage = obj[0];
                        buf.write(0);
                        buf.write(attrPage);
                    }
                    buf.write(obj[1]);
                }
                i++;
            }
            if (k > 0)
            {
                buf.write(1);
            }
            pending = null;
            attributes.removeAllElements();
            return;
        } while (true);
    }

    public void comment(String s)
    {
    }

    public void docdecl(String s)
    {
        throw new RuntimeException("Cannot write docdecl for WBXML");
    }

    public void endDocument()
        throws IOException
    {
        flush();
    }

    public XmlSerializer endTag(String s, String s1)
        throws IOException
    {
        if (pending != null)
        {
            checkPending(true);
        } else
        {
            buf.write(1);
        }
        depth = depth - 1;
        return this;
    }

    public void entityRef(String s)
    {
        throw new RuntimeException("EntityReference not supported for WBXML");
    }

    public void flush()
        throws IOException
    {
        checkPending(false);
        if (!headerSent)
        {
            writeInt(out, stringTableBuf.size());
            out.write(stringTableBuf.toByteArray());
            headerSent = true;
        }
        out.write(buf.toByteArray());
        buf.reset();
    }

    public int getDepth()
    {
        return depth;
    }

    public boolean getFeature(String s)
    {
        return false;
    }

    public String getName()
    {
        return pending;
    }

    public String getNamespace()
    {
        return null;
    }

    public String getPrefix(String s, boolean flag)
    {
        throw new RuntimeException("NYI");
    }

    public Object getProperty(String s)
    {
        return null;
    }

    public void ignorableWhitespace(String s)
    {
    }

    public void processingInstruction(String s)
    {
        throw new RuntimeException("PI NYI");
    }

    public void setAttrStartTable(int i, String as[])
    {
        for (int j = 0; j < as.length; j++)
        {
            if (as[j] != null)
            {
                attrStartTable.put(as[j], new int[] {
                    i, j + 5
                });
            }
        }

    }

    public void setAttrValueTable(int i, String as[])
    {
        for (int j = 0; j < as.length; j++)
        {
            if (as[j] != null)
            {
                attrValueTable.put(as[j], new int[] {
                    i, j + 133
                });
            }
        }

    }

    public void setFeature(String s, boolean flag)
    {
        throw new IllegalArgumentException((new StringBuilder()).append("unknown feature ").append(s).toString());
    }

    public void setOutput(OutputStream outputstream, String s)
        throws IOException
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "UTF-8";
        }
        encoding = s1;
        out = outputstream;
        buf = new ByteArrayOutputStream();
        stringTableBuf = new ByteArrayOutputStream();
        headerSent = false;
    }

    public void setOutput(Writer writer)
    {
        throw new RuntimeException("Wbxml requires an OutputStream!");
    }

    public void setPrefix(String s, String s1)
    {
        throw new RuntimeException("NYI");
    }

    public void setProperty(String s, Object obj)
    {
        throw new IllegalArgumentException((new StringBuilder()).append("unknown property ").append(s).toString());
    }

    public void setTagTable(int i, String as[])
    {
        for (int j = 0; j < as.length; j++)
        {
            if (as[j] != null)
            {
                tagTable.put(as[j], new int[] {
                    i, j + 5
                });
            }
        }

    }

    public void startDocument(String s, Boolean boolean1)
        throws IOException
    {
        out.write(3);
        out.write(1);
        if (s != null)
        {
            encoding = s;
        }
        if (encoding.toUpperCase().equals("UTF-8"))
        {
            out.write(106);
            return;
        }
        if (encoding.toUpperCase().equals("ISO-8859-1"))
        {
            out.write(4);
            return;
        } else
        {
            throw new UnsupportedEncodingException(s);
        }
    }

    public XmlSerializer startTag(String s, String s1)
        throws IOException
    {
        if (s != null && !"".equals(s))
        {
            throw new RuntimeException("NSP NYI");
        } else
        {
            checkPending(false);
            pending = s1;
            depth = depth + 1;
            return this;
        }
    }

    public XmlSerializer text(String s)
        throws IOException
    {
        checkPending(false);
        writeStr(s);
        return this;
    }

    public XmlSerializer text(char ac[], int i, int j)
        throws IOException
    {
        checkPending(false);
        writeStr(new String(ac, i, j));
        return this;
    }

    void writeStrI(OutputStream outputstream, String s)
        throws IOException
    {
        outputstream.write(s.getBytes(encoding));
        outputstream.write(0);
    }

    public void writeWapExtension(int i, Object obj)
        throws IOException
    {
        checkPending(false);
        buf.write(i);
        switch (i)
        {
        default:
            throw new IllegalArgumentException();

        case 195: 
            obj = (byte[])(byte[])obj;
            writeInt(buf, obj.length);
            buf.write(((byte []) (obj)));
            // fall through

        case 192: 
        case 193: 
        case 194: 
            return;

        case 64: // '@'
        case 65: // 'A'
        case 66: // 'B'
            writeStrI(buf, (String)obj);
            return;

        case 128: 
        case 129: 
        case 130: 
            writeStrT((String)obj, false);
            return;
        }
    }
}
