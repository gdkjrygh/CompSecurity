// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

// Referenced classes of package com.google.common.io:
//            ByteSource, CharSource, LineProcessor

public final class Resources
{
    private static final class UrlByteSource extends ByteSource
    {

        private final URL url;

        public InputStream openStream()
            throws IOException
        {
            return url.openStream();
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(url));
            return (new StringBuilder(s.length() + 24)).append("Resources.asByteSource(").append(s).append(")").toString();
        }

        private UrlByteSource(URL url1)
        {
            url = (URL)Preconditions.checkNotNull(url1);
        }

    }


    private Resources()
    {
    }

    public static ByteSource asByteSource(URL url)
    {
        return new UrlByteSource(url);
    }

    public static CharSource asCharSource(URL url, Charset charset)
    {
        return asByteSource(url).asCharSource(charset);
    }

    public static void copy(URL url, OutputStream outputstream)
        throws IOException
    {
        asByteSource(url).copyTo(outputstream);
    }

    public static URL getResource(Class class1, String s)
    {
        URL url = class1.getResource(s);
        boolean flag;
        if (url != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "resource %s relative to %s not found.", new Object[] {
            s, class1.getName()
        });
        return url;
    }

    public static URL getResource(String s)
    {
        URL url = ((ClassLoader)MoreObjects.firstNonNull(Thread.currentThread().getContextClassLoader(), com/google/common/io/Resources.getClassLoader())).getResource(s);
        boolean flag;
        if (url != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "resource %s not found.", new Object[] {
            s
        });
        return url;
    }

    public static Object readLines(URL url, Charset charset, LineProcessor lineprocessor)
        throws IOException
    {
        return asCharSource(url, charset).readLines(lineprocessor);
    }

    public static List readLines(URL url, Charset charset)
        throws IOException
    {
        return (List)readLines(url, charset, new LineProcessor() {

            final List result = Lists.newArrayList();

            public volatile Object getResult()
            {
                return getResult();
            }

            public List getResult()
            {
                return result;
            }

            public boolean processLine(String s)
            {
                result.add(s);
                return true;
            }

        });
    }

    public static byte[] toByteArray(URL url)
        throws IOException
    {
        return asByteSource(url).read();
    }

    public static String toString(URL url, Charset charset)
        throws IOException
    {
        return asCharSource(url, charset).read();
    }
}
