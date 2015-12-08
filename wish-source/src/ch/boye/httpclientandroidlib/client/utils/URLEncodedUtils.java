// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.utils;

import ch.boye.httpclientandroidlib.Consts;
import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.HttpEntity;
import ch.boye.httpclientandroidlib.NameValuePair;
import ch.boye.httpclientandroidlib.entity.ContentType;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import ch.boye.httpclientandroidlib.message.BasicNameValuePair;
import ch.boye.httpclientandroidlib.message.ParserCursor;
import ch.boye.httpclientandroidlib.protocol.HTTP;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import ch.boye.httpclientandroidlib.util.EntityUtils;
import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class URLEncodedUtils
{

    public static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
    private static final char DELIM[] = {
        '&'
    };
    private static final BitSet FRAGMENT;
    private static final String NAME_VALUE_SEPARATOR = "=";
    private static final String PARAMETER_SEPARATOR = "&";
    private static final BitSet PATHSAFE;
    private static final BitSet PUNCT;
    private static final int RADIX = 16;
    private static final BitSet RESERVED;
    private static final BitSet UNRESERVED;
    private static final BitSet URLENCODER;
    private static final BitSet USERINFO;

    public URLEncodedUtils()
    {
    }

    private static String decodeFormFields(String s, String s1)
    {
        if (s == null)
        {
            return null;
        }
        if (s1 != null)
        {
            s1 = Charset.forName(s1);
        } else
        {
            s1 = Consts.UTF_8;
        }
        return urldecode(s, s1, true);
    }

    private static String decodeFormFields(String s, Charset charset)
    {
        if (s == null)
        {
            return null;
        }
        if (charset == null)
        {
            charset = Consts.UTF_8;
        }
        return urldecode(s, charset, true);
    }

    static String encFragment(String s, Charset charset)
    {
        return urlencode(s, charset, FRAGMENT, false);
    }

    static String encPath(String s, Charset charset)
    {
        return urlencode(s, charset, PATHSAFE, false);
    }

    static String encUserInfo(String s, Charset charset)
    {
        return urlencode(s, charset, USERINFO, false);
    }

    private static String encodeFormFields(String s, String s1)
    {
        if (s == null)
        {
            return null;
        }
        if (s1 != null)
        {
            s1 = Charset.forName(s1);
        } else
        {
            s1 = Consts.UTF_8;
        }
        return urlencode(s, s1, URLENCODER, true);
    }

    private static String encodeFormFields(String s, Charset charset)
    {
        if (s == null)
        {
            return null;
        }
        if (charset == null)
        {
            charset = Consts.UTF_8;
        }
        return urlencode(s, charset, URLENCODER, true);
    }

    public static String format(Iterable iterable, Charset charset)
    {
        StringBuilder stringbuilder = new StringBuilder();
        iterable = iterable.iterator();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            Object obj = (NameValuePair)iterable.next();
            String s = encodeFormFields(((NameValuePair) (obj)).getName(), charset);
            obj = encodeFormFields(((NameValuePair) (obj)).getValue(), charset);
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("&");
            }
            stringbuilder.append(s);
            if (obj != null)
            {
                stringbuilder.append("=");
                stringbuilder.append(((String) (obj)));
            }
        } while (true);
        return stringbuilder.toString();
    }

    public static String format(List list, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (NameValuePair)list.next();
            String s1 = encodeFormFields(((NameValuePair) (obj)).getName(), s);
            obj = encodeFormFields(((NameValuePair) (obj)).getValue(), s);
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("&");
            }
            stringbuilder.append(s1);
            if (obj != null)
            {
                stringbuilder.append("=");
                stringbuilder.append(((String) (obj)));
            }
        } while (true);
        return stringbuilder.toString();
    }

    public static boolean isEncoded(HttpEntity httpentity)
    {
        boolean flag1 = false;
        httpentity = httpentity.getContentType();
        boolean flag = flag1;
        if (httpentity != null)
        {
            httpentity = httpentity.getElements();
            flag = flag1;
            if (httpentity.length > 0)
            {
                flag = httpentity[0].getName().equalsIgnoreCase("application/x-www-form-urlencoded");
            }
        }
        return flag;
    }

    public static List parse(HttpEntity httpentity)
        throws IOException
    {
        Object obj = ContentType.get(httpentity);
        if (obj != null && ((ContentType) (obj)).getMimeType().equalsIgnoreCase("application/x-www-form-urlencoded"))
        {
            String s = EntityUtils.toString(httpentity, Consts.ASCII);
            if (s != null && s.length() > 0)
            {
                obj = ((ContentType) (obj)).getCharset();
                httpentity = ((HttpEntity) (obj));
                if (obj == null)
                {
                    httpentity = HTTP.DEF_CONTENT_CHARSET;
                }
                return parse(s, ((Charset) (httpentity)));
            }
        }
        return Collections.emptyList();
    }

    public static List parse(String s, Charset charset)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        s = Collections.emptyList();
_L4:
        return s;
_L2:
        BasicHeaderValueParser basicheadervalueparser = BasicHeaderValueParser.DEFAULT;
        CharArrayBuffer chararraybuffer = new CharArrayBuffer(s.length());
        chararraybuffer.append(s);
        ParserCursor parsercursor = new ParserCursor(0, chararraybuffer.length());
        ArrayList arraylist = new ArrayList();
        do
        {
            s = arraylist;
            if (parsercursor.atEnd())
            {
                continue;
            }
            s = basicheadervalueparser.parseNameValuePair(chararraybuffer, parsercursor, DELIM);
            if (s.getName().length() > 0)
            {
                arraylist.add(new BasicNameValuePair(decodeFormFields(s.getName(), charset), decodeFormFields(s.getValue(), charset)));
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static List parse(URI uri, String s)
    {
        uri = uri.getRawQuery();
        if (uri != null && uri.length() > 0)
        {
            ArrayList arraylist = new ArrayList();
            parse(((List) (arraylist)), new Scanner(uri), s);
            return arraylist;
        } else
        {
            return Collections.emptyList();
        }
    }

    public static void parse(List list, Scanner scanner, String s)
    {
        scanner.useDelimiter("&");
        while (scanner.hasNext()) 
        {
            String s2 = null;
            String s3 = scanner.next();
            int i = s3.indexOf("=");
            String s1;
            if (i != -1)
            {
                s1 = decodeFormFields(s3.substring(0, i).trim(), s);
                s2 = decodeFormFields(s3.substring(i + 1).trim(), s);
            } else
            {
                s1 = decodeFormFields(s3.trim(), s);
            }
            list.add(new BasicNameValuePair(s1, s2));
        }
    }

    private static String urldecode(String s, Charset charset, boolean flag)
    {
        if (s == null)
        {
            return null;
        }
        ByteBuffer bytebuffer = ByteBuffer.allocate(s.length());
        for (s = CharBuffer.wrap(s); s.hasRemaining();)
        {
            int i = s.get();
            if (i == 37 && s.remaining() >= 2)
            {
                char c = s.get();
                char c1 = s.get();
                i = Character.digit(c, 16);
                int j = Character.digit(c1, 16);
                if (i != -1 && j != -1)
                {
                    bytebuffer.put((byte)((i << 4) + j));
                } else
                {
                    bytebuffer.put((byte)37);
                    bytebuffer.put((byte)c);
                    bytebuffer.put((byte)c1);
                }
            } else
            if (flag && i == 43)
            {
                bytebuffer.put((byte)32);
            } else
            {
                bytebuffer.put((byte)i);
            }
        }

        bytebuffer.flip();
        return charset.decode(bytebuffer).toString();
    }

    private static String urlencode(String s, Charset charset, BitSet bitset, boolean flag)
    {
        if (s == null)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        for (s = charset.encode(s); s.hasRemaining();)
        {
            int i = s.get() & 0xff;
            if (bitset.get(i))
            {
                stringbuilder.append((char)i);
            } else
            if (flag && i == 32)
            {
                stringbuilder.append('+');
            } else
            {
                stringbuilder.append("%");
                char c = Character.toUpperCase(Character.forDigit(i >> 4 & 0xf, 16));
                char c1 = Character.toUpperCase(Character.forDigit(i & 0xf, 16));
                stringbuilder.append(c);
                stringbuilder.append(c1);
            }
        }

        return stringbuilder.toString();
    }

    static 
    {
        UNRESERVED = new BitSet(256);
        PUNCT = new BitSet(256);
        USERINFO = new BitSet(256);
        PATHSAFE = new BitSet(256);
        FRAGMENT = new BitSet(256);
        RESERVED = new BitSet(256);
        URLENCODER = new BitSet(256);
        for (int i = 97; i <= 122; i++)
        {
            UNRESERVED.set(i);
        }

        for (int j = 65; j <= 90; j++)
        {
            UNRESERVED.set(j);
        }

        for (int k = 48; k <= 57; k++)
        {
            UNRESERVED.set(k);
        }

        UNRESERVED.set(95);
        UNRESERVED.set(45);
        UNRESERVED.set(46);
        UNRESERVED.set(42);
        URLENCODER.or(UNRESERVED);
        UNRESERVED.set(33);
        UNRESERVED.set(126);
        UNRESERVED.set(39);
        UNRESERVED.set(40);
        UNRESERVED.set(41);
        PUNCT.set(44);
        PUNCT.set(59);
        PUNCT.set(58);
        PUNCT.set(36);
        PUNCT.set(38);
        PUNCT.set(43);
        PUNCT.set(61);
        USERINFO.or(UNRESERVED);
        USERINFO.or(PUNCT);
        PATHSAFE.or(UNRESERVED);
        PATHSAFE.set(47);
        PATHSAFE.set(59);
        PATHSAFE.set(58);
        PATHSAFE.set(64);
        PATHSAFE.set(38);
        PATHSAFE.set(61);
        PATHSAFE.set(43);
        PATHSAFE.set(36);
        PATHSAFE.set(44);
        RESERVED.set(59);
        RESERVED.set(47);
        RESERVED.set(63);
        RESERVED.set(58);
        RESERVED.set(64);
        RESERVED.set(38);
        RESERVED.set(61);
        RESERVED.set(43);
        RESERVED.set(36);
        RESERVED.set(44);
        RESERVED.set(91);
        RESERVED.set(93);
        FRAGMENT.or(RESERVED);
        FRAGMENT.or(UNRESERVED);
    }
}
