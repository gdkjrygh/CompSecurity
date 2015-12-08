// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.rt;

import com.vladium.emma.filter.IInclExclFilter;
import com.vladium.logging.Logger;
import com.vladium.util.ByteArrayOStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.CodeSource;
import java.util.Map;

// Referenced classes of package com.vladium.emma.rt:
//            ClassPathCacheEntry, IClassLoadHook

public final class InstrClassLoader extends URLClassLoader
{
    private static final class PoolEntry
    {

        ByteArrayOStream m_baos;
        final byte m_buf[];

        void trim(int i, int j)
        {
            if (m_baos.capacity() > j)
            {
                m_baos = new ByteArrayOStream(i);
            }
        }

        PoolEntry(int i, int j)
        {
            m_baos = new ByteArrayOStream(i);
            m_buf = new byte[j];
        }
    }


    private static final int BAOS_INIT_SIZE = 32768;
    private static final int BAOS_MAX_SIZE = 0x100000;
    private static final int BAOS_POOL_SIZE = 8;
    private static final URL EMPTY_URL_ARRAY[] = new URL[0];
    public static final String PROPERTY_FORCED_DELEGATION_FILTER = "clsload.forced_delegation_filter";
    public static final String PROPERTY_THROUGH_DELEGATION_FILTER = "clsload.through_delegation_filter";
    private final PoolEntry m_bufPool[] = new PoolEntry[8];
    private final Map m_cache;
    private int m_cacheHits;
    private int m_cacheMisses;
    private final IInclExclFilter m_forcedDelegationFilter;
    private final IClassLoadHook m_hook;
    private final Logger m_log = Logger.getLogger();
    private int m_nestLevel;
    private final ClassLoader m_parent;
    private final IInclExclFilter m_throughDelegationFilter;

    public InstrClassLoader(ClassLoader classloader, File afile[], IInclExclFilter iinclexclfilter, IInclExclFilter iinclexclfilter1, IClassLoadHook iclassloadhook, Map map)
        throws MalformedURLException
    {
        super(filesToURLs(afile), null);
        m_hook = iclassloadhook;
        m_cache = map;
        m_forcedDelegationFilter = iinclexclfilter;
        m_throughDelegationFilter = iinclexclfilter1;
        m_parent = classloader;
    }

    private PoolEntry acquirePoolEntry()
    {
        PoolEntry poolentry;
        if (m_nestLevel >= 8)
        {
            poolentry = new PoolEntry(32768, 32768);
        } else
        {
            poolentry = m_bufPool[m_nestLevel];
            if (poolentry == null)
            {
                poolentry = new PoolEntry(32768, 32768);
                m_bufPool[m_nestLevel] = poolentry;
            } else
            {
                poolentry.m_baos.reset();
            }
        }
        m_nestLevel = m_nestLevel + 1;
        return poolentry;
    }

    private Class defineClass(String s, byte abyte0[], int i, URL url)
    {
        CodeSource codesource = new CodeSource(url, (java.security.cert.Certificate[])null);
        int j = s.lastIndexOf('.');
        if (j >= 0)
        {
            String s1 = s.substring(0, j);
            if (getPackage(s1) == null)
            {
                definePackage(s1, "EMMA", "0.0", "(C) Vladimir Roubtsov", "EMMA", "0.0", "(C) Vladimir Roubtsov", url);
            }
        }
        return defineClass(s, abyte0, 0, i, codesource);
    }

    private static URL[] filesToURLs(File afile[])
        throws MalformedURLException
    {
        if (afile != null && afile.length != 0) goto _L2; else goto _L1
_L1:
        URL aurl[] = EMPTY_URL_ARRAY;
_L4:
        return aurl;
_L2:
        URL aurl1[] = new URL[afile.length];
        int i = 0;
        do
        {
            aurl = aurl1;
            if (i >= aurl1.length)
            {
                continue;
            }
            aurl1[i] = afile[i].toURL();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void readFully(InputStream inputstream, ByteArrayOStream bytearrayostream, byte abyte0[])
        throws IOException
    {
        do
        {
            int i = inputstream.read(abyte0);
            if (i >= 0)
            {
                bytearrayostream.write(abyte0, 0, i);
            } else
            {
                return;
            }
        } while (true);
    }

    private void releasePoolEntry(PoolEntry poolentry)
    {
        int i = m_nestLevel - 1;
        m_nestLevel = i;
        if (i < 8)
        {
            poolentry.trim(32768, 0x100000);
        }
    }

    public void debugDump(PrintWriter printwriter)
    {
        if (printwriter != null)
        {
            printwriter.println((new StringBuilder()).append(this).append(": ").append(m_cacheHits).append(" class cache hits, ").append(m_cacheMisses).append(" misses").toString());
        }
    }

    protected final Class findClass(String s)
        throws ClassNotFoundException
    {
        Object obj;
        Object obj1;
        PoolEntry poolentry;
        Object obj2;
        byte abyte0[];
        int i;
        int j;
        boolean flag;
        flag = m_log.atTRACE1();
        if (flag)
        {
            m_log.trace1("findClass", (new StringBuilder()).append("(").append(s).append("): nest level ").append(m_nestLevel).toString());
        }
        URL url;
        ByteArrayOStream bytearrayostream;
        if (m_cache != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            obj2 = (ClassPathCacheEntry)m_cache.remove(s);
        } else
        {
            obj2 = null;
        }
        url = null;
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        m_cacheHits = m_cacheHits + 1;
        obj = new URL(((ClassPathCacheEntry) (obj2)).m_srcURL);
        url = ((URL) (obj));
_L15:
        obj1 = null;
        obj = null;
        poolentry = acquirePoolEntry();
        obj = poolentry;
        obj1 = poolentry;
        bytearrayostream = poolentry.m_baos;
        obj = poolentry;
        obj1 = poolentry;
        abyte0 = ((ClassPathCacheEntry) (obj2)).m_bytes;
        obj = poolentry;
        obj1 = poolentry;
        j = abyte0.length;
        obj = poolentry;
        obj1 = poolentry;
        if (m_hook == null) goto _L4; else goto _L3
_L3:
        obj = poolentry;
        obj1 = poolentry;
        if (!m_hook.processClassDef(s, abyte0, j, bytearrayostream)) goto _L4; else goto _L5
_L5:
        obj = poolentry;
        obj1 = poolentry;
        abyte0 = bytearrayostream.getByteArray();
        obj = poolentry;
        obj1 = poolentry;
        j = bytearrayostream.size();
        obj2 = abyte0;
        i = j;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        obj = poolentry;
        obj1 = poolentry;
        m_log.trace1("findClass", (new StringBuilder()).append("defining [cached] instrumented [").append(s).append("] {").append(j).append(" bytes }").toString());
        i = j;
        obj2 = abyte0;
_L7:
        obj = poolentry;
        obj1 = poolentry;
        obj2 = defineClass(s, ((byte []) (obj2)), i, url);
        obj = obj2;
        s = ((String) (obj));
        if (poolentry != null)
        {
            releasePoolEntry(poolentry);
            s = ((String) (obj));
        }
_L11:
        return s;
_L4:
        obj2 = abyte0;
        i = j;
        if (!flag) goto _L7; else goto _L6
_L6:
        obj = poolentry;
        obj1 = poolentry;
        m_log.trace1("findClass", (new StringBuilder()).append("defining [cached] [").append(s).append("] {").append(j).append(" bytes }").toString());
        obj2 = abyte0;
        i = j;
          goto _L7
        obj1;
        obj1 = obj;
        throw new ClassNotFoundException(s);
        s;
        if (obj1 != null)
        {
            releasePoolEntry(((PoolEntry) (obj1)));
        }
        throw s;
_L2:
        PoolEntry poolentry1;
        Object obj4;
        URL url1;
        if (i != 0)
        {
            m_cacheMisses = m_cacheMisses + 1;
        }
        url1 = getResource((new StringBuilder()).append(s.replace('.', '/')).append(".class").toString());
        if (flag && url1 != null)
        {
            m_log.trace1("findClass", (new StringBuilder()).append("[").append(s).append("] found in ").append(url1).toString());
        }
        if (url1 == null)
        {
            throw new ClassNotFoundException(s);
        }
        obj1 = null;
        obj = null;
        obj4 = null;
        poolentry1 = null;
        poolentry = poolentry1;
        obj2 = obj4;
        Object obj3 = url1.openStream();
        poolentry = poolentry1;
        obj = obj3;
        obj2 = obj4;
        obj1 = obj3;
        poolentry1 = acquirePoolEntry();
        poolentry = poolentry1;
        obj = obj3;
        obj2 = poolentry1;
        obj1 = obj3;
        ByteArrayOStream bytearrayostream1 = poolentry1.m_baos;
        poolentry = poolentry1;
        obj = obj3;
        obj2 = poolentry1;
        obj1 = obj3;
        readFully(((InputStream) (obj3)), bytearrayostream1, poolentry1.m_buf);
        poolentry = poolentry1;
        obj = obj3;
        obj2 = poolentry1;
        obj1 = obj3;
        ((InputStream) (obj3)).close();
        Object obj5;
        obj4 = null;
        obj5 = null;
        poolentry = poolentry1;
        obj = obj5;
        obj2 = poolentry1;
        obj1 = obj4;
        byte abyte1[] = bytearrayostream1.getByteArray();
        poolentry = poolentry1;
        obj = obj5;
        obj2 = poolentry1;
        obj1 = obj4;
        j = bytearrayostream1.size();
        poolentry = poolentry1;
        obj = obj5;
        obj2 = poolentry1;
        obj1 = obj4;
        bytearrayostream1.reset();
        poolentry = poolentry1;
        obj = obj5;
        obj2 = poolentry1;
        obj1 = obj4;
        if (m_hook == null) goto _L9; else goto _L8
_L8:
        poolentry = poolentry1;
        obj = obj5;
        obj2 = poolentry1;
        obj1 = obj4;
        if (!m_hook.processClassDef(s, abyte1, j, bytearrayostream1)) goto _L9; else goto _L10
_L10:
        poolentry = poolentry1;
        obj = obj5;
        obj2 = poolentry1;
        obj1 = obj4;
        abyte1 = bytearrayostream1.getByteArray();
        poolentry = poolentry1;
        obj = obj5;
        obj2 = poolentry1;
        obj1 = obj4;
        j = bytearrayostream1.size();
        obj3 = abyte1;
        i = j;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_912;
        }
        poolentry = poolentry1;
        obj = obj5;
        obj2 = poolentry1;
        obj1 = obj4;
        m_log.trace1("findClass", (new StringBuilder()).append("defining instrumented [").append(s).append("] {").append(j).append(" bytes }").toString());
        i = j;
        obj3 = abyte1;
_L13:
        poolentry = poolentry1;
        obj = obj5;
        obj2 = poolentry1;
        obj1 = obj4;
        obj3 = defineClass(s, ((byte []) (obj3)), i, url1);
        obj = obj3;
        if (poolentry1 != null)
        {
            releasePoolEntry(poolentry1);
        }
        s = ((String) (obj));
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return ((Class) (obj));
            }
        }
          goto _L11
_L9:
        obj3 = abyte1;
        i = j;
        if (!flag) goto _L13; else goto _L12
_L12:
        poolentry = poolentry1;
        obj = obj5;
        obj2 = poolentry1;
        obj1 = obj4;
        m_log.trace1("findClass", (new StringBuilder()).append("defining [").append(s).append("] {").append(j).append(" bytes }").toString());
        obj3 = abyte1;
        i = j;
          goto _L13
        obj1;
        obj2 = poolentry;
        obj1 = obj;
        throw new ClassNotFoundException(s);
        s;
        if (obj2 != null)
        {
            releasePoolEntry(((PoolEntry) (obj2)));
        }
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            catch (Exception exception) { }
        }
        throw s;
        MalformedURLException malformedurlexception;
        malformedurlexception;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public final URL getResource(String s)
    {
        boolean flag = m_log.atTRACE1();
        if (flag)
        {
            m_log.trace1("getResource", (new StringBuilder()).append("(").append(s).append("): nest level ").append(m_nestLevel).toString());
        }
        URL url = super.getResource(s);
        if (flag && url != null)
        {
            m_log.trace1("loadClass", (new StringBuilder()).append("[").append(s).append("] found in ").append(url).toString());
        }
        return url;
    }

    public final Class loadClass(String s, boolean flag)
        throws ClassNotFoundException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag2 = m_log.atTRACE1();
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        m_log.trace1("loadClass", (new StringBuilder()).append("(").append(s).append(", ").append(flag).append("): nest level ").append(m_nestLevel).toString());
        Class class2 = findLoadedClass(s);
        Object obj1 = class2;
        if (class2 != null) goto _L2; else goto _L1
_L1:
        Class class1;
        Class class3;
        class3 = null;
        class1 = null;
        obj1 = m_parent;
        Object obj;
        obj = class2;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        obj1 = class2;
        Class class4 = m_parent.loadClass(s);
        obj1 = class2;
        class3 = class4;
        if (class4.getClassLoader() != m_parent)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        obj1 = class2;
        class3 = class4;
        if (m_forcedDelegationFilter == null)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        obj = class2;
        class1 = class4;
        obj1 = class2;
        class3 = class4;
        if (!m_forcedDelegationFilter.included(s))
        {
            break MISSING_BLOCK_LABEL_247;
        }
        class2 = class4;
        obj = class2;
        class1 = class4;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        obj1 = class2;
        class3 = class4;
        m_log.trace1("loadClass", (new StringBuilder()).append("using parent's version for [").append(s).append("]").toString());
        class1 = class4;
        obj = class2;
_L5:
        obj1 = obj;
        if (obj != null) goto _L2; else goto _L3
_L3:
        obj1 = findClass(s);
_L2:
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_404;
        }
        throw new ClassNotFoundException(s);
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        ClassNotFoundException classnotfoundexception1;
        classnotfoundexception1;
        if (m_forcedDelegationFilter == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        class1 = class3;
        if (!m_forcedDelegationFilter.included(s)) goto _L5; else goto _L4
_L4:
        throw classnotfoundexception1;
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        if (class1 == null)
        {
            break MISSING_BLOCK_LABEL_401;
        }
        boolean flag1;
        if (m_throughDelegationFilter == null || m_throughDelegationFilter.included(s))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        obj1 = class1;
        if (!flag2) goto _L2; else goto _L6
_L6:
        m_log.trace1("loadClass", (new StringBuilder()).append("[delegation filter] using parent's version for [").append(s).append("]").toString());
        obj1 = class1;
          goto _L2
        throw classnotfoundexception;
        throw classnotfoundexception;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_414;
        }
        resolveClass(((Class) (obj1)));
        this;
        JVM INSTR monitorexit ;
        return ((Class) (obj1));
    }

}
