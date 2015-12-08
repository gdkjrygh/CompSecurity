// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.crashlytics.android.internal:
//            aB, aD, az, aF

public final class ay
{

    private static aB a;
    private HttpURLConnection b;
    private URL c;
    private final String d;
    private aF e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;

    private ay(CharSequence charsequence, String s)
        throws aD
    {
        b = null;
        g = true;
        h = false;
        i = 8192;
        try
        {
            c = new URL(charsequence.toString());
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new aD(charsequence);
        }
        d = s;
    }

    static int a(ay ay1)
    {
        return ay1.i;
    }

    private ay a(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        return (ay)(new az(this, inputstream, g, inputstream, outputstream)).call();
    }

    public static ay a(CharSequence charsequence)
        throws aD
    {
        return new ay(charsequence, "PUT");
    }

    public static ay a(CharSequence charsequence, Map map, boolean flag)
    {
        return new ay(c(a(charsequence, map)), "GET");
    }

    private ay a(String s, String s1, String s2)
        throws IOException
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("form-data; name=\"").append(s);
        if (s1 != null)
        {
            stringbuilder.append("\"; filename=\"").append(s1);
        }
        stringbuilder.append('"');
        d("Content-Disposition", stringbuilder.toString());
        if (s2 != null)
        {
            d("Content-Type", s2);
        }
        return d("\r\n");
    }

    private ay a(String s, String s1, String s2, String s3)
        throws aD
    {
        try
        {
            j();
            a(s, s1, ((String) (null)));
            e.a(s3);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new aD(s);
        }
        return this;
    }

    private static String a(CharSequence charsequence, Map map)
    {
        Object obj;
        int k;
        int l;
        obj = charsequence.toString();
        if (map == null || map.isEmpty())
        {
            return ((String) (obj));
        }
        charsequence = new StringBuilder(((String) (obj)));
        if (((String) (obj)).indexOf(':') + 2 == ((String) (obj)).lastIndexOf('/'))
        {
            charsequence.append('/');
        }
        k = ((String) (obj)).indexOf('?');
        l = charsequence.length() - 1;
        if (k != -1) goto _L2; else goto _L1
_L1:
        charsequence.append('?');
_L4:
        map = map.entrySet().iterator();
        obj = (java.util.Map.Entry)map.next();
        charsequence.append(((java.util.Map.Entry) (obj)).getKey().toString());
        charsequence.append('=');
        obj = ((java.util.Map.Entry) (obj)).getValue();
        if (obj != null)
        {
            charsequence.append(obj);
        }
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            charsequence.append('&');
            obj = (java.util.Map.Entry)map.next();
            charsequence.append(((java.util.Map.Entry) (obj)).getKey().toString());
            charsequence.append('=');
            obj = ((java.util.Map.Entry) (obj)).getValue();
            if (obj != null)
            {
                charsequence.append(obj);
            }
        } while (true);
        break; /* Loop/switch isn't completed */
_L2:
        if (k < l && ((String) (obj)).charAt(l) != '&')
        {
            charsequence.append('&');
        }
        if (true) goto _L4; else goto _L3
_L3:
        return charsequence.toString();
    }

    public static ay b(CharSequence charsequence)
        throws aD
    {
        return new ay(charsequence, "DELETE");
    }

    public static ay b(CharSequence charsequence, Map map, boolean flag)
    {
        return new ay(c(a(charsequence, map)), "POST");
    }

    private ay b(String s, String s1, String s2)
        throws aD
    {
        return a(s, s1, null, s2);
    }

    static String b(String s)
    {
        return c(s);
    }

    private static String c(CharSequence charsequence)
        throws aD
    {
        String s;
        URL url;
        int k;
        try
        {
            url = new URL(charsequence.toString());
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new aD(charsequence);
        }
        s = url.getHost();
        k = url.getPort();
        charsequence = s;
        if (k != -1)
        {
            charsequence = (new StringBuilder()).append(s).append(':').append(Integer.toString(k)).toString();
        }
        try
        {
            s = (new URI(url.getProtocol(), charsequence, url.getPath(), url.getQuery(), null)).toASCIIString();
            k = s.indexOf('?');
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            IOException ioexception = new IOException("Parsing URI failed");
            ioexception.initCause(charsequence);
            throw new aD(ioexception);
        }
        charsequence = s;
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        charsequence = s;
        if (k + 1 < s.length())
        {
            charsequence = (new StringBuilder()).append(s.substring(0, k + 1)).append(s.substring(k + 1).replace("+", "%2B")).toString();
        }
        return charsequence;
    }

    private static String c(String s)
    {
        if (s != null && s.length() > 0)
        {
            return s;
        } else
        {
            return "UTF-8";
        }
    }

    private static String c(String s, String s1)
    {
        if (s != null && s.length() != 0) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        int i1 = s.length();
        int k = s.indexOf(';') + 1;
        if (k == 0 || k == i1)
        {
            return null;
        }
        int l = s.indexOf(';', k);
        if (l == -1)
        {
            l = i1;
        }
        int j1;
        for (; k < l; l = j1)
        {
            j1 = s.indexOf('=', k);
            if (j1 != -1 && j1 < l && s1.equals(s.substring(k, j1).trim()))
            {
                String s2 = s.substring(j1 + 1, l).trim();
                k = s2.length();
                if (k != 0)
                {
                    s = s2;
                    if (k > 2)
                    {
                        s = s2;
                        if ('"' == s2.charAt(0))
                        {
                            s = s2;
                            if ('"' == s2.charAt(k - 1))
                            {
                                return s2.substring(1, k - 1);
                            }
                        }
                    }
                    continue; /* Loop/switch isn't completed */
                }
            }
            l++;
            j1 = s.indexOf(';', l);
            k = j1;
            if (j1 == -1)
            {
                k = i1;
            }
            j1 = k;
            k = l;
        }

        return null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private ay d(CharSequence charsequence)
        throws aD
    {
        try
        {
            i();
            e.a(charsequence.toString());
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new aD(charsequence);
        }
        return this;
    }

    private ay d(String s, String s1)
        throws aD
    {
        return d(((CharSequence) (s))).d(": ").d(((CharSequence) (s1))).d("\r\n");
    }

    private String d(String s)
        throws aD
    {
        h();
        int k = a().getHeaderFieldInt("Content-Length", -1);
        ByteArrayOutputStream bytearrayoutputstream;
        if (k > 0)
        {
            bytearrayoutputstream = new ByteArrayOutputStream(k);
        } else
        {
            bytearrayoutputstream = new ByteArrayOutputStream();
        }
        try
        {
            a(new BufferedInputStream(f(), i), bytearrayoutputstream);
            s = bytearrayoutputstream.toString(c(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new aD(s);
        }
        return s;
    }

    private HttpURLConnection e()
    {
        HttpURLConnection httpurlconnection;
        try
        {
            httpurlconnection = a.a(c);
            httpurlconnection.setRequestMethod(d);
        }
        catch (IOException ioexception)
        {
            throw new aD(ioexception);
        }
        return httpurlconnection;
    }

    private InputStream f()
        throws aD
    {
        Object obj;
        if (b() < 400)
        {
            try
            {
                obj = a().getInputStream();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new aD(((IOException) (obj)));
            }
        } else
        {
            InputStream inputstream1 = a().getErrorStream();
            obj = inputstream1;
            if (inputstream1 == null)
            {
                InputStream inputstream;
                try
                {
                    inputstream = a().getInputStream();
                }
                catch (IOException ioexception)
                {
                    throw new aD(ioexception);
                }
                return inputstream;
            }
        }
        return ((InputStream) (obj));
    }

    private ay g()
        throws IOException
    {
        if (e == null)
        {
            return this;
        }
        if (f)
        {
            e.a("\r\n--00content0boundary00--\r\n");
        }
        if (g)
        {
            try
            {
                e.close();
            }
            catch (IOException ioexception) { }
        } else
        {
            e.close();
        }
        e = null;
        return this;
    }

    private ay h()
        throws aD
    {
        ay ay1;
        try
        {
            ay1 = g();
        }
        catch (IOException ioexception)
        {
            throw new aD(ioexception);
        }
        return ay1;
    }

    private ay i()
        throws IOException
    {
        if (e != null)
        {
            return this;
        } else
        {
            a().setDoOutput(true);
            String s = c(a().getRequestProperty("Content-Type"), "charset");
            e = new aF(a().getOutputStream(), s, i);
            return this;
        }
    }

    private ay j()
        throws IOException
    {
        if (!f)
        {
            f = true;
            a("Content-Type", "multipart/form-data; boundary=00content0boundary00").i();
            e.a("--00content0boundary00\r\n");
            return this;
        } else
        {
            e.a("\r\n--00content0boundary00\r\n");
            return this;
        }
    }

    public final ay a(int k)
    {
        a().setConnectTimeout(10000);
        return this;
    }

    public final ay a(String s, Number number)
        throws aD
    {
        if (number != null)
        {
            number = number.toString();
        } else
        {
            number = null;
        }
        return b(s, ((String) (null)), number);
    }

    public final ay a(String s, String s1)
    {
        a().setRequestProperty(s, s1);
        return this;
    }

    public final ay a(String s, String s1, String s2, File file)
        throws aD
    {
        BufferedInputStream bufferedinputstream = new BufferedInputStream(new FileInputStream(file));
        file = bufferedinputstream;
        s = a(s, s1, s2, ((InputStream) (bufferedinputstream)));
        try
        {
            bufferedinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return s;
        }
        return s;
        s;
        file = null;
_L4:
        throw new aD(s);
        s;
_L2:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        throw s;
        s;
        file = null;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        file = bufferedinputstream;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final ay a(String s, String s1, String s2, InputStream inputstream)
        throws aD
    {
        try
        {
            j();
            a(s, s1, s2);
            a(inputstream, ((OutputStream) (e)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new aD(s);
        }
        return this;
    }

    public final ay a(java.util.Map.Entry entry)
    {
        return a((String)entry.getKey(), (String)entry.getValue());
    }

    public final ay a(boolean flag)
    {
        a().setUseCaches(false);
        return this;
    }

    public final String a(String s)
        throws aD
    {
        h();
        return a().getHeaderField(s);
    }

    public final HttpURLConnection a()
    {
        if (b == null)
        {
            b = e();
        }
        return b;
    }

    public final int b()
        throws aD
    {
        int k;
        try
        {
            g();
            k = a().getResponseCode();
        }
        catch (IOException ioexception)
        {
            throw new aD(ioexception);
        }
        return k;
    }

    public final ay b(String s, String s1)
    {
        return b(s, ((String) (null)), s1);
    }

    public final String c()
        throws aD
    {
        return d(c(a("Content-Type"), "charset"));
    }

    public final String d()
    {
        return a().getRequestMethod();
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a().getRequestMethod()).append(' ').append(a().getURL()).toString();
    }

    static 
    {
        a = aB.a;
    }
}
