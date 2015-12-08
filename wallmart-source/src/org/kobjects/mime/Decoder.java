// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kobjects.mime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Hashtable;
import org.kobjects.base64.Base64;

public class Decoder
{

    String boundary;
    char buf[];
    String characterEncoding;
    boolean consumed;
    boolean eof;
    Hashtable header;
    InputStream is;

    public Decoder(InputStream inputstream, String s)
        throws IOException
    {
        this(inputstream, s, null);
    }

    public Decoder(InputStream inputstream, String s, String s1)
        throws IOException
    {
        buf = new char[256];
        characterEncoding = s1;
        is = inputstream;
        boundary = (new StringBuilder()).append("--").append(s).toString();
        do
        {
            s = readLine();
            if (s == null)
            {
                throw new IOException("Unexpected EOF");
            }
        } while (!s.startsWith(boundary));
        if (s.endsWith("--"))
        {
            eof = true;
            inputstream.close();
        }
        consumed = true;
    }

    public static Hashtable getHeaderElements(String s)
    {
        String s1;
        Hashtable hashtable;
        int i;
        s1 = "";
        i = 0;
        hashtable = new Hashtable();
_L6:
        int i1;
        for (i1 = s.length(); i < i1 && s.charAt(i) <= ' '; i++) { }
        if (i < i1) goto _L2; else goto _L1
_L1:
        return hashtable;
_L2:
        if (s.charAt(i) != '"')
        {
            break; /* Loop/switch isn't completed */
        }
        i++;
        int j = s.indexOf('"', i);
        if (j == -1)
        {
            throw new RuntimeException((new StringBuilder()).append("End quote expected in ").append(s).toString());
        }
        hashtable.put(s1, s.substring(i, j));
        j += 2;
        if (j < i1)
        {
            i = j;
            if (s.charAt(j - 1) != ';')
            {
                throw new RuntimeException((new StringBuilder()).append("; expected in ").append(s).toString());
            }
            break MISSING_BLOCK_LABEL_221;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int k = s.indexOf(';', i);
        if (k == -1)
        {
            hashtable.put(s1, s.substring(i));
            return hashtable;
        }
        hashtable.put(s1, s.substring(i, k));
        i = k + 1;
        int l = s.indexOf('=', i);
        if (l == -1) goto _L1; else goto _L4
_L4:
        s1 = s.substring(i, l).toLowerCase().trim();
        i = l + 1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private final String readLine()
        throws IOException
    {
        int i = 0;
        do
        {
            int j;
            do
            {
                j = is.read();
                if (j == -1 && i == 0)
                {
                    return null;
                }
                if (j == -1 || j == 10)
                {
                    return new String(buf, 0, i);
                }
            } while (j == 13);
            if (i >= buf.length)
            {
                char ac[] = new char[(buf.length * 3) / 2];
                System.arraycopy(buf, 0, ac, 0, buf.length);
                buf = ac;
            }
            buf[i] = (char)j;
            i++;
        } while (true);
    }

    public String getHeader(String s)
    {
        return (String)header.get(s.toLowerCase());
    }

    public Enumeration getHeaderNames()
    {
        return header.keys();
    }

    public boolean next()
        throws IOException
    {
        if (!consumed)
        {
            readContent(null);
        }
        if (eof)
        {
            return false;
        }
        header = new Hashtable();
        do
        {
            String s = readLine();
            if (s == null || s.equals(""))
            {
                consumed = false;
                return true;
            }
            int i = s.indexOf(':');
            if (i == -1)
            {
                throw new IOException((new StringBuilder()).append("colon missing in multipart header line: ").append(s).toString());
            }
            header.put(s.substring(0, i).trim().toLowerCase(), s.substring(i + 1).trim());
        } while (true);
    }

    public String readContent()
        throws IOException
    {
        Object obj = new ByteArrayOutputStream();
        readContent(((OutputStream) (obj)));
        if (characterEncoding == null)
        {
            obj = new String(((ByteArrayOutputStream) (obj)).toByteArray());
        } else
        {
            obj = new String(((ByteArrayOutputStream) (obj)).toByteArray(), characterEncoding);
        }
        System.out.println((new StringBuilder()).append("Field content: '").append(((String) (obj))).append("'").toString());
        return ((String) (obj));
    }

    public void readContent(OutputStream outputstream)
        throws IOException
    {
        if (consumed)
        {
            throw new RuntimeException("Content already consumed!");
        }
        getHeader("Content-Type");
        if (!"base64".equals(getHeader("Content-Transfer-Encoding"))) goto _L2; else goto _L1
_L1:
        new ByteArrayOutputStream();
_L5:
        String s;
        s = readLine();
        if (s == null)
        {
            throw new IOException("Unexpected EOF");
        }
        if (!s.startsWith(boundary)) goto _L4; else goto _L3
_L3:
        outputstream = s;
_L6:
        if (outputstream.endsWith("--"))
        {
            eof = true;
        }
        consumed = true;
        return;
_L4:
        Base64.decode(s, outputstream);
          goto _L5
_L2:
        int i;
        s = (new StringBuilder()).append("\r\n").append(boundary).toString();
        i = 0;
_L7:
        int l;
label0:
        {
            int j;
            do
            {
                l = is.read();
                if (l == -1)
                {
                    throw new RuntimeException("Unexpected EOF");
                }
                if ((char)l != s.charAt(i))
                {
                    break label0;
                }
                j = i + 1;
                i = j;
            } while (j != s.length());
            outputstream = readLine();
        }
          goto _L6
        int k = i;
        if (i > 0)
        {
            for (k = 0; k < i; k++)
            {
                outputstream.write((byte)s.charAt(k));
            }

            if ((char)l == s.charAt(0))
            {
                k = 1;
            } else
            {
                k = 0;
            }
        }
        i = k;
        if (k == 0)
        {
            outputstream.write((byte)l);
            i = k;
        }
          goto _L7
    }
}
