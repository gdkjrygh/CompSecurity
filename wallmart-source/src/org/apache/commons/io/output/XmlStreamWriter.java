// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.input.XmlStreamReader;

public class XmlStreamWriter extends Writer
{

    private static final int BUFFER_SIZE = 4096;
    static final Pattern ENCODING_PATTERN;
    private final String defaultEncoding;
    private String encoding;
    private final OutputStream out;
    private Writer writer;
    private StringWriter xmlPrologWriter;

    public XmlStreamWriter(File file)
        throws FileNotFoundException
    {
        this(file, null);
    }

    public XmlStreamWriter(File file, String s)
        throws FileNotFoundException
    {
        this(((OutputStream) (new FileOutputStream(file))), s);
    }

    public XmlStreamWriter(OutputStream outputstream)
    {
        this(outputstream, null);
    }

    public XmlStreamWriter(OutputStream outputstream, String s)
    {
        xmlPrologWriter = new StringWriter(4096);
        out = outputstream;
        if (s == null)
        {
            s = "UTF-8";
        }
        defaultEncoding = s;
    }

    private void detectEncoding(char ac[], int i, int j)
        throws IOException
    {
        StringBuffer stringbuffer;
        int k;
        k = j;
        stringbuffer = xmlPrologWriter.getBuffer();
        if (stringbuffer.length() + j > 4096)
        {
            k = 4096 - stringbuffer.length();
        }
        xmlPrologWriter.write(ac, i, k);
        if (stringbuffer.length() < 5) goto _L2; else goto _L1
_L1:
        if (!stringbuffer.substring(0, 5).equals("<?xml")) goto _L4; else goto _L3
_L3:
        int l = stringbuffer.indexOf("?>");
        if (l <= 0) goto _L6; else goto _L5
_L5:
        Matcher matcher = ENCODING_PATTERN.matcher(stringbuffer.substring(0, l));
        if (matcher.find())
        {
            encoding = matcher.group(1).toUpperCase();
            encoding = encoding.substring(1, encoding.length() - 1);
        } else
        {
            encoding = defaultEncoding;
        }
_L8:
        if (encoding != null)
        {
            xmlPrologWriter = null;
            writer = new OutputStreamWriter(out, encoding);
            writer.write(stringbuffer.toString());
            if (j > k)
            {
                writer.write(ac, i + k, j - k);
            }
        }
_L2:
        return;
_L6:
        if (stringbuffer.length() >= 4096)
        {
            encoding = defaultEncoding;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        encoding = defaultEncoding;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void close()
        throws IOException
    {
        if (writer == null)
        {
            encoding = defaultEncoding;
            writer = new OutputStreamWriter(out, encoding);
            writer.write(xmlPrologWriter.toString());
        }
        writer.close();
    }

    public void flush()
        throws IOException
    {
        if (writer != null)
        {
            writer.flush();
        }
    }

    public String getDefaultEncoding()
    {
        return defaultEncoding;
    }

    public String getEncoding()
    {
        return encoding;
    }

    public void write(char ac[], int i, int j)
        throws IOException
    {
        if (xmlPrologWriter != null)
        {
            detectEncoding(ac, i, j);
            return;
        } else
        {
            writer.write(ac, i, j);
            return;
        }
    }

    static 
    {
        ENCODING_PATTERN = XmlStreamReader.ENCODING_PATTERN;
    }
}
