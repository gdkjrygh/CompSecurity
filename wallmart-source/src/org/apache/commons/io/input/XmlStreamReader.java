// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.ByteOrderMark;

// Referenced classes of package org.apache.commons.io.input:
//            BOMInputStream, XmlStreamReaderException

public class XmlStreamReader extends Reader
{

    private static final ByteOrderMark BOMS[];
    private static final int BUFFER_SIZE = 4096;
    private static final Pattern CHARSET_PATTERN = Pattern.compile("charset=[\"']?([.[^; \"']]*)[\"']?");
    private static final String EBCDIC = "CP1047";
    public static final Pattern ENCODING_PATTERN = Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", 8);
    private static final String HTTP_EX_1 = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL";
    private static final String HTTP_EX_2 = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch";
    private static final String HTTP_EX_3 = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME";
    private static final String RAW_EX_1 = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";
    private static final String RAW_EX_2 = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM";
    private static final String US_ASCII = "US-ASCII";
    private static final String UTF_16 = "UTF-16";
    private static final String UTF_16BE = "UTF-16BE";
    private static final String UTF_16LE = "UTF-16LE";
    private static final String UTF_32 = "UTF-32";
    private static final String UTF_32BE = "UTF-32BE";
    private static final String UTF_32LE = "UTF-32LE";
    private static final String UTF_8 = "UTF-8";
    private static final ByteOrderMark XML_GUESS_BYTES[] = {
        new ByteOrderMark("UTF-8", new int[] {
            60, 63, 120, 109
        }), new ByteOrderMark("UTF-16BE", new int[] {
            0, 60, 0, 63
        }), new ByteOrderMark("UTF-16LE", new int[] {
            60, 0, 63, 0
        }), new ByteOrderMark("UTF-32BE", new int[] {
            0, 0, 0, 60, 0, 0, 0, 63, 0, 0, 
            0, 120, 0, 0, 0, 109
        }), new ByteOrderMark("UTF-32LE", new int[] {
            60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 
            0, 0, 109, 0, 0, 0
        }), new ByteOrderMark("CP1047", new int[] {
            76, 111, 167, 148
        })
    };
    private final String defaultEncoding;
    private final String encoding;
    private final Reader reader;

    public XmlStreamReader(File file)
        throws IOException
    {
        this(((InputStream) (new FileInputStream(file))));
    }

    public XmlStreamReader(InputStream inputstream)
        throws IOException
    {
        this(inputstream, true);
    }

    public XmlStreamReader(InputStream inputstream, String s)
        throws IOException
    {
        this(inputstream, s, true);
    }

    public XmlStreamReader(InputStream inputstream, String s, boolean flag)
        throws IOException
    {
        this(inputstream, s, flag, null);
    }

    public XmlStreamReader(InputStream inputstream, String s, boolean flag, String s1)
        throws IOException
    {
        defaultEncoding = s1;
        inputstream = new BOMInputStream(new BufferedInputStream(inputstream, 4096), false, BOMS);
        s1 = new BOMInputStream(inputstream, true, XML_GUESS_BYTES);
        encoding = doHttpStream(inputstream, s1, s, flag);
        reader = new InputStreamReader(s1, encoding);
    }

    public XmlStreamReader(InputStream inputstream, boolean flag)
        throws IOException
    {
        this(inputstream, flag, ((String) (null)));
    }

    public XmlStreamReader(InputStream inputstream, boolean flag, String s)
        throws IOException
    {
        defaultEncoding = s;
        inputstream = new BOMInputStream(new BufferedInputStream(inputstream, 4096), false, BOMS);
        s = new BOMInputStream(inputstream, true, XML_GUESS_BYTES);
        encoding = doRawStream(inputstream, s, flag);
        reader = new InputStreamReader(s, encoding);
    }

    public XmlStreamReader(URL url)
        throws IOException
    {
        this(url.openConnection(), ((String) (null)));
    }

    public XmlStreamReader(URLConnection urlconnection, String s)
        throws IOException
    {
        defaultEncoding = s;
        s = urlconnection.getContentType();
        BOMInputStream bominputstream = new BOMInputStream(new BufferedInputStream(urlconnection.getInputStream(), 4096), false, BOMS);
        BOMInputStream bominputstream1 = new BOMInputStream(bominputstream, true, XML_GUESS_BYTES);
        if ((urlconnection instanceof HttpURLConnection) || s != null)
        {
            encoding = doHttpStream(bominputstream, bominputstream1, s, true);
        } else
        {
            encoding = doRawStream(bominputstream, bominputstream1, true);
        }
        reader = new InputStreamReader(bominputstream1, encoding);
    }

    private String doHttpStream(BOMInputStream bominputstream, BOMInputStream bominputstream1, String s, boolean flag)
        throws IOException
    {
        bominputstream = bominputstream.getBOMCharsetName();
        String s1 = bominputstream1.getBOMCharsetName();
        bominputstream1 = getXmlProlog(bominputstream1, s1);
        try
        {
            bominputstream = calculateHttpEncoding(s, bominputstream, s1, bominputstream1, flag);
        }
        // Misplaced declaration of an exception variable
        catch (BOMInputStream bominputstream)
        {
            if (flag)
            {
                return doLenientDetection(s, bominputstream);
            } else
            {
                throw bominputstream;
            }
        }
        return bominputstream;
    }

    private String doLenientDetection(String s, XmlStreamReaderException xmlstreamreaderexception)
        throws IOException
    {
        XmlStreamReaderException xmlstreamreaderexception1 = xmlstreamreaderexception;
        if (s == null) goto _L2; else goto _L1
_L1:
        xmlstreamreaderexception1 = xmlstreamreaderexception;
        if (!s.startsWith("text/html")) goto _L2; else goto _L3
_L3:
        s = s.substring("text/html".length());
        s = (new StringBuilder()).append("text/xml").append(s).toString();
        xmlstreamreaderexception = calculateHttpEncoding(s, xmlstreamreaderexception.getBomEncoding(), xmlstreamreaderexception.getXmlGuessEncoding(), xmlstreamreaderexception.getXmlEncoding(), true);
_L5:
        return xmlstreamreaderexception;
        xmlstreamreaderexception1;
_L2:
        xmlstreamreaderexception = xmlstreamreaderexception1.getXmlEncoding();
        s = xmlstreamreaderexception;
        if (xmlstreamreaderexception == null)
        {
            s = xmlstreamreaderexception1.getContentTypeEncoding();
        }
        xmlstreamreaderexception = s;
        if (s == null)
        {
            if (defaultEncoding == null)
            {
                return "UTF-8";
            } else
            {
                return defaultEncoding;
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private String doRawStream(BOMInputStream bominputstream, BOMInputStream bominputstream1, boolean flag)
        throws IOException
    {
        bominputstream = bominputstream.getBOMCharsetName();
        String s = bominputstream1.getBOMCharsetName();
        bominputstream1 = getXmlProlog(bominputstream1, s);
        try
        {
            bominputstream = calculateRawEncoding(bominputstream, s, bominputstream1);
        }
        // Misplaced declaration of an exception variable
        catch (BOMInputStream bominputstream)
        {
            if (flag)
            {
                return doLenientDetection(null, bominputstream);
            } else
            {
                throw bominputstream;
            }
        }
        return bominputstream;
    }

    static String getContentTypeEncoding(String s)
    {
label0:
        {
            Object obj = null;
            String s1 = obj;
            if (s != null)
            {
                int i = s.indexOf(";");
                s1 = obj;
                if (i > -1)
                {
                    s = s.substring(i + 1);
                    s = CHARSET_PATTERN.matcher(s);
                    if (s.find())
                    {
                        s = s.group(1);
                    } else
                    {
                        s = null;
                    }
                    if (s == null)
                    {
                        break label0;
                    }
                    s1 = s.toUpperCase(Locale.US);
                }
            }
            return s1;
        }
        return null;
    }

    static String getContentTypeMime(String s)
    {
        String s1 = null;
        if (s != null)
        {
            int i = s.indexOf(";");
            if (i >= 0)
            {
                s = s.substring(0, i);
            }
            s1 = s.trim();
        }
        return s1;
    }

    private static String getXmlProlog(InputStream inputstream, String s)
        throws IOException
    {
        Object obj2 = null;
        Object obj1 = obj2;
        if (s != null)
        {
            obj1 = new byte[4096];
            inputstream.mark(4096);
            int l = 0;
            int k = 4096;
            int i = inputstream.read(((byte []) (obj1)), 0, 4096);
            int j = -1;
            Object obj = null;
            for (; i != -1 && j == -1 && l < 4096; j = ((String) (obj)).indexOf('>'))
            {
                l += i;
                k -= i;
                i = inputstream.read(((byte []) (obj1)), l, k);
                obj = new String(((byte []) (obj1)), 0, l, s);
            }

            if (j == -1)
            {
                if (i == -1)
                {
                    throw new IOException("Unexpected end of XML stream");
                } else
                {
                    throw new IOException((new StringBuilder()).append("XML prolog or ROOT element not found on first ").append(l).append(" bytes").toString());
                }
            }
            obj1 = obj2;
            if (l > 0)
            {
                inputstream.reset();
                s = new BufferedReader(new StringReader(((String) (obj)).substring(0, j + 1)));
                obj = new StringBuffer();
                for (inputstream = s.readLine(); inputstream != null; inputstream = s.readLine())
                {
                    ((StringBuffer) (obj)).append(inputstream);
                }

                inputstream = ENCODING_PATTERN.matcher(((CharSequence) (obj)));
                obj1 = obj2;
                if (inputstream.find())
                {
                    inputstream = inputstream.group(1).toUpperCase();
                    obj1 = inputstream.substring(1, inputstream.length() - 1);
                }
            }
        }
        return ((String) (obj1));
    }

    static boolean isAppXml(String s)
    {
        return s != null && (s.equals("application/xml") || s.equals("application/xml-dtd") || s.equals("application/xml-external-parsed-entity") || s.startsWith("application/") && s.endsWith("+xml"));
    }

    static boolean isTextXml(String s)
    {
        return s != null && (s.equals("text/xml") || s.equals("text/xml-external-parsed-entity") || s.startsWith("text/") && s.endsWith("+xml"));
    }

    String calculateHttpEncoding(String s, String s1, String s2, String s3, boolean flag)
        throws IOException
    {
        if (!flag || s3 == null) goto _L2; else goto _L1
_L1:
        s = s3;
_L4:
        return s;
_L2:
        String s4;
        String s5;
        s5 = getContentTypeMime(s);
        s4 = getContentTypeEncoding(s);
        flag = isAppXml(s5);
        boolean flag1 = isTextXml(s5);
        if (!flag && !flag1)
        {
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME", new Object[] {
                s5, s4, s1, s2, s3
            }), s5, s4, s1, s2, s3);
        }
        if (s4 == null)
        {
            if (flag)
            {
                return calculateRawEncoding(s1, s2, s3);
            }
            if (defaultEncoding == null)
            {
                s = "US-ASCII";
            } else
            {
                s = defaultEncoding;
            }
            return s;
        }
        if (!s4.equals("UTF-16BE") && !s4.equals("UTF-16LE"))
        {
            break; /* Loop/switch isn't completed */
        }
        s = s4;
        if (s1 != null)
        {
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL", new Object[] {
                s5, s4, s1, s2, s3
            }), s5, s4, s1, s2, s3);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (s4.equals("UTF-16"))
        {
            if (s1 != null && s1.startsWith("UTF-16"))
            {
                return s1;
            } else
            {
                throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch", new Object[] {
                    s5, s4, s1, s2, s3
                }), s5, s4, s1, s2, s3);
            }
        }
        if (!s4.equals("UTF-32BE") && !s4.equals("UTF-32LE"))
        {
            break; /* Loop/switch isn't completed */
        }
        s = s4;
        if (s1 != null)
        {
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL", new Object[] {
                s5, s4, s1, s2, s3
            }), s5, s4, s1, s2, s3);
        }
        if (true) goto _L4; else goto _L5
_L5:
        s = s4;
        if (s4.equals("UTF-32"))
        {
            if (s1 != null && s1.startsWith("UTF-32"))
            {
                return s1;
            } else
            {
                throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch", new Object[] {
                    s5, s4, s1, s2, s3
                }), s5, s4, s1, s2, s3);
            }
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    String calculateRawEncoding(String s, String s1, String s2)
        throws IOException
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        if (s1 != null && s2 != null) goto _L4; else goto _L3
_L3:
        String s3;
        if (defaultEncoding == null)
        {
            s = "UTF-8";
        } else
        {
            s = defaultEncoding;
        }
        s3 = s;
_L6:
        return s3;
_L4:
        if (s2.equals("UTF-16") && (s1.equals("UTF-16BE") || s1.equals("UTF-16LE")))
        {
            return s1;
        } else
        {
            return s2;
        }
_L2:
        if (!s.equals("UTF-8"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (s1 != null && !s1.equals("UTF-8"))
        {
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", new Object[] {
                s, s1, s2
            }), s, s1, s2);
        }
        s3 = s;
        if (s2 != null)
        {
            s3 = s;
            if (!s2.equals("UTF-8"))
            {
                throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", new Object[] {
                    s, s1, s2
                }), s, s1, s2);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (!s.equals("UTF-16BE") && !s.equals("UTF-16LE"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (s1 != null && !s1.equals(s))
        {
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", new Object[] {
                s, s1, s2
            }), s, s1, s2);
        }
        s3 = s;
        if (s2 != null)
        {
            s3 = s;
            if (!s2.equals("UTF-16"))
            {
                s3 = s;
                if (!s2.equals(s))
                {
                    throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", new Object[] {
                        s, s1, s2
                    }), s, s1, s2);
                }
            }
        }
        if (true) goto _L6; else goto _L7
_L7:
        if (s.equals("UTF-32BE") || s.equals("UTF-32LE"))
        {
            if (s1 != null && !s1.equals(s))
            {
                throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", new Object[] {
                    s, s1, s2
                }), s, s1, s2);
            }
            s3 = s;
            if (s2 != null)
            {
                s3 = s;
                if (!s2.equals("UTF-32"))
                {
                    s3 = s;
                    if (!s2.equals(s))
                    {
                        throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", new Object[] {
                            s, s1, s2
                        }), s, s1, s2);
                    }
                }
            }
        } else
        {
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM", new Object[] {
                s, s1, s2
            }), s, s1, s2);
        }
        if (true) goto _L6; else goto _L8
_L8:
    }

    public void close()
        throws IOException
    {
        reader.close();
    }

    public String getDefaultEncoding()
    {
        return defaultEncoding;
    }

    public String getEncoding()
    {
        return encoding;
    }

    public int read(char ac[], int i, int j)
        throws IOException
    {
        return reader.read(ac, i, j);
    }

    static 
    {
        BOMS = (new ByteOrderMark[] {
            ByteOrderMark.UTF_8, ByteOrderMark.UTF_16BE, ByteOrderMark.UTF_16LE, ByteOrderMark.UTF_32BE, ByteOrderMark.UTF_32LE
        });
    }
}
