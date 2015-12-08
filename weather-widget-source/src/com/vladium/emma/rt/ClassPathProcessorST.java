// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.rt;

import com.vladium.emma.EMMARuntimeException;
import com.vladium.emma.IAppErrorCodes;
import com.vladium.emma.data.IMetaData;
import com.vladium.emma.filter.IInclExclFilter;
import com.vladium.emma.instr.InstrVisitor;
import com.vladium.jcd.cls.ClassDef;
import com.vladium.jcd.parser.ClassDefParser;
import com.vladium.logging.Logger;
import com.vladium.util.ByteArrayOStream;
import com.vladium.util.Files;
import com.vladium.util.IPathEnumerator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

// Referenced classes of package com.vladium.emma.rt:
//            ClassPathCacheEntry

public final class ClassPathProcessorST
    implements com.vladium.util.IPathEnumerator.IPathHandler, IAppErrorCodes
{

    private static final int BUF_SIZE = 32768;
    private File m_archiveFile;
    private ByteArrayOStream m_baos;
    private final Map m_cache;
    private final boolean m_canonical;
    private int m_classCount;
    private final IInclExclFilter m_coverageFilter;
    private final com.vladium.emma.instr.InstrVisitor.InstrResult m_instrResult;
    private final Logger m_log;
    private final IMetaData m_mdata;
    private final File m_path[];
    private byte m_readbuf[];
    private int m_readpos;
    private final InstrVisitor m_visitor;

    ClassPathProcessorST(File afile[], boolean flag, IMetaData imetadata, IInclExclFilter iinclexclfilter, Map map)
    {
        if (afile == null)
        {
            throw new IllegalArgumentException("null input: path");
        }
        if (imetadata == null)
        {
            throw new IllegalArgumentException("null input: mdata");
        } else
        {
            m_path = afile;
            m_canonical = flag;
            m_mdata = imetadata;
            m_coverageFilter = iinclexclfilter;
            m_cache = map;
            m_visitor = new InstrVisitor(imetadata.getOptions());
            m_instrResult = new com.vladium.emma.instr.InstrVisitor.InstrResult();
            m_log = Logger.getLogger();
            return;
        }
    }

    private void ensureReadCapacity(int i)
    {
        if (m_readbuf.length < i)
        {
            int j = m_readbuf.length;
            m_readbuf = null;
            m_readbuf = new byte[Math.max(j << 1, i)];
        }
    }

    private void readFile(File file)
        throws IOException
    {
        Object obj;
        int j;
        j = (int)file.length();
        ensureReadCapacity(j);
        obj = null;
        FileInputStream fileinputstream = new FileInputStream(file);
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        int k = fileinputstream.read(m_readbuf, i, j - i);
        if (k < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i += k;
        if (true) goto _L2; else goto _L1
_L1:
        m_readpos = i;
        if (fileinputstream == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        fileinputstream.close();
        return;
        file;
_L4:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw file;
        file;
        return;
        file;
        obj = fileinputstream;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void readZipEntry(ZipInputStream zipinputstream, ZipEntry zipentry)
        throws IOException
    {
        int k = (int)zipentry.getSize();
        if (k >= 0)
        {
            ensureReadCapacity(k);
            int i = 0;
            do
            {
                if (i >= k)
                {
                    break;
                }
                int l = zipinputstream.read(m_readbuf, i, k - i);
                if (l < 0)
                {
                    break;
                }
                i += l;
            } while (true);
            m_readpos = i;
            return;
        }
        ensureReadCapacity(32768);
        m_baos.reset();
        do
        {
            int j = zipinputstream.read(m_readbuf);
            if (j >= 0)
            {
                m_baos.write(m_readbuf, 0, j);
            } else
            {
                m_readbuf = m_baos.copyByteArray();
                m_readpos = m_readbuf.length;
                return;
            }
        } while (true);
    }

    public void handleArchiveEnd(File file, File file1)
    {
        m_archiveFile = null;
    }

    public void handleArchiveEntry(JarInputStream jarinputstream, ZipEntry zipentry)
    {
        String s1;
        if (m_log.atTRACE2())
        {
            m_log.trace2("handleArchiveEntry", (new StringBuilder()).append("[").append(zipentry.getName()).append("]").toString());
        }
        s1 = zipentry.getName();
        if (!s1.toLowerCase().endsWith(".class")) goto _L2; else goto _L1
_L1:
        String s = s1.substring(0, s1.length() - 6).replace('/', '.');
        if (m_coverageFilter != null && !m_coverageFilter.included(s)) goto _L2; else goto _L3
_L3:
        Object obj = null;
        readZipEntry(jarinputstream, zipentry);
        jarinputstream = "jar:".concat(m_archiveFile.toURL().toExternalForm()).concat("!/").concat(s1);
        boolean flag;
        boolean flag1;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (JarInputStream jarinputstream)
            {
                throw new EMMARuntimeException(jarinputstream);
            }
        }
_L6:
        try
        {
            zipentry = ClassDefParser.parseClass(m_readbuf, m_readpos);
            if (!zipentry.isInterface())
            {
                m_classCount = m_classCount + 1;
            }
            m_visitor.process(zipentry, false, false, true, m_instrResult);
        }
        // Misplaced declaration of an exception variable
        catch (JarInputStream jarinputstream)
        {
            throw new EMMARuntimeException(jarinputstream);
        }
        flag1 = true;
        flag = flag1;
        if (m_instrResult.m_descriptor == null)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        flag = flag1;
        if (!m_mdata.add(m_instrResult.m_descriptor, false))
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L4
_L4:
        if (m_cache != null)
        {
            zipentry = new byte[m_readpos];
            System.arraycopy(m_readbuf, 0, zipentry, 0, m_readpos);
            m_cache.put(s, new ClassPathCacheEntry(zipentry, jarinputstream));
        }
_L2:
        return;
        jarinputstream;
        jarinputstream = obj;
        if (true) goto _L6; else goto _L5
_L5:
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (JarInputStream jarinputstream)
        {
            throw new EMMARuntimeException(jarinputstream);
        }
        jarinputstream;
        throw new EMMARuntimeException(jarinputstream);
        jarinputstream;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (JarInputStream jarinputstream)
            {
                throw new EMMARuntimeException(jarinputstream);
            }
        } else
        {
            throw jarinputstream;
        }
    }

    public void handleArchiveStart(File file, File file1, Manifest manifest)
    {
        m_archiveFile = Files.newFile(file, file1.getPath());
    }

    public void handleDirEnd(File file, File file1)
    {
    }

    public void handleDirStart(File file, File file1)
    {
    }

    public void handleFile(File file, File file1)
    {
        String s;
        if (m_log.atTRACE2())
        {
            m_log.trace2("handleFile", (new StringBuilder()).append("[").append(file).append("] [").append(file1).append("]").toString());
        }
        s = file1.getPath();
        if (!s.toLowerCase().endsWith(".class")) goto _L2; else goto _L1
_L1:
        String s1 = s.substring(0, s.length() - 6).replace(File.separatorChar, '.');
        if (m_coverageFilter != null && !m_coverageFilter.included(s1)) goto _L2; else goto _L3
_L3:
        s = null;
        file = Files.newFile(file, file1.getPath());
        readFile(file);
        file = file.toURL().toExternalForm();
        boolean flag;
        boolean flag1;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw new EMMARuntimeException(file);
            }
        }
_L6:
        try
        {
            file1 = ClassDefParser.parseClass(m_readbuf, m_readpos);
            if (!file1.isInterface())
            {
                m_classCount = m_classCount + 1;
            }
            m_visitor.process(file1, false, false, true, m_instrResult);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new EMMARuntimeException(file);
        }
        flag1 = true;
        flag = flag1;
        if (m_instrResult.m_descriptor == null)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        flag = flag1;
        if (!m_mdata.add(m_instrResult.m_descriptor, false))
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L4
_L4:
        if (m_cache != null)
        {
            file1 = new byte[m_readpos];
            System.arraycopy(m_readbuf, 0, file1, 0, m_readpos);
            m_cache.put(s1, new ClassPathCacheEntry(file1, file));
        }
_L2:
        return;
        file;
        file = s;
        if (true) goto _L6; else goto _L5
_L5:
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new EMMARuntimeException(file);
        }
        file;
        throw new EMMARuntimeException(file);
        file;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw new EMMARuntimeException(file);
            }
        } else
        {
            throw file;
        }
    }

    public void run()
    {
        long l = System.currentTimeMillis();
        IPathEnumerator ipathenumerator = com.vladium.util.IPathEnumerator.Factory.create(m_path, m_canonical, this);
        m_readbuf = new byte[32768];
        m_readpos = 0;
        m_baos = new ByteArrayOStream(32768);
        if (m_log.atINFO())
        {
            m_log.info("processing classpath ...");
        }
        try
        {
            ipathenumerator.enumerate();
        }
        catch (IOException ioexception)
        {
            throw new EMMARuntimeException("INSTR_IO_FAILURE", ioexception);
        }
        if (m_log.atINFO())
        {
            long l1 = System.currentTimeMillis();
            m_log.info((new StringBuilder()).append("[").append(m_classCount).append(" class(es) processed in ").append(l1 - l).append(" ms]").toString());
        }
    }
}
