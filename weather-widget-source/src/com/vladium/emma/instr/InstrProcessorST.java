// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;

import com.vladium.emma.EMMAProperties;
import com.vladium.emma.EMMARuntimeException;
import com.vladium.emma.IAppErrorCodes;
import com.vladium.emma.data.CoverageOptionsFactory;
import com.vladium.emma.data.DataFactory;
import com.vladium.emma.data.IMetaData;
import com.vladium.emma.filter.IInclExclFilter;
import com.vladium.jcd.compiler.ClassWriter;
import com.vladium.jcd.parser.ClassDefParser;
import com.vladium.logging.Logger;
import com.vladium.util.ByteArrayOStream;
import com.vladium.util.Descriptors;
import com.vladium.util.Files;
import com.vladium.util.IPathEnumerator;
import com.vladium.util.IProperties;
import com.vladium.util.Property;
import com.vladium.util.exception.Exceptions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Date;
import java.util.jar.Attributes;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

// Referenced classes of package com.vladium.emma.instr:
//            InstrProcessor, InstrVisitor

final class InstrProcessorST extends InstrProcessor
    implements IAppErrorCodes
{
    private static final class EntryWriteJob extends Job
    {

        byte m_data[];
        final ZipEntry m_entry;
        final boolean m_isCopy;
        final ZipOutputStream m_out;

        protected void run()
            throws IOException
        {
            InstrProcessorST.writeZipEntry(m_data, m_out, m_entry, m_isCopy);
            m_data = null;
        }

        EntryWriteJob(ZipOutputStream zipoutputstream, byte abyte0[], ZipEntry zipentry, boolean flag)
        {
            m_out = zipoutputstream;
            m_data = abyte0;
            m_entry = zipentry;
            m_isCopy = flag;
        }
    }

    private static final class FileWriteJob extends Job
    {

        byte m_data[];
        final boolean m_mkdirs;
        final File m_outFile;

        protected void run()
            throws IOException
        {
            InstrProcessorST.writeFile(m_data, m_outFile, m_mkdirs);
            m_data = null;
        }

        FileWriteJob(File file, byte abyte0[], boolean flag)
        {
            m_outFile = file;
            m_data = abyte0;
            m_mkdirs = flag;
        }
    }

    private static abstract class Job
    {

        protected abstract void run()
            throws IOException;

        private Job()
        {
        }

    }


    private static final int BUF_SIZE = 32768;
    private static final boolean CLEANUP_TEMP_ARCHIVE_ON_ERRORS = true;
    private static final boolean DO_DEPENDS_CHECKING = true;
    private static final boolean DO_RAF_EXTENSION = true;
    private static final Class EXPECTED_FAILURES[] = {
        com/vladium/emma/EMMARuntimeException, java/lang/IllegalArgumentException, java/lang/IllegalStateException
    };
    private static final int JOB_QUEUE_SIZE = 128;
    private JarOutputStream m_archiveOut;
    private ByteArrayOStream m_baos;
    private long m_currentArchiveTS;
    private final InstrVisitor.InstrResult m_instrResult = new InstrVisitor.InstrResult();
    private int m_jobPos;
    private final Job m_jobs[] = new Job[128];
    private IMetaData m_mdata;
    private File m_origArchiveFile;
    private byte m_readbuf[];
    private int m_readpos;
    private File m_tempArchiveFile;
    private long m_timeStamp;
    private InstrVisitor m_visitor;

    InstrProcessorST()
    {
    }

    private void addJob(Job job)
        throws FileNotFoundException, IOException
    {
        if (m_jobPos == 128)
        {
            drainJobQueue();
        }
        Job ajob[] = m_jobs;
        int i = m_jobPos;
        m_jobPos = i + 1;
        ajob[i] = job;
    }

    private void drainJobQueue()
        throws IOException
    {
        for (int i = 0; i < m_jobPos; i++)
        {
            Job job = m_jobs[i];
            if (job != null)
            {
                m_jobs[i] = null;
                job.run();
            }
        }

        m_jobPos = 0;
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

    static void writeFile(byte abyte0[], File file, boolean flag)
        throws IOException
    {
        Object obj;
        obj = null;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        File file1 = file.getParentFile();
        if (file1 == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        file1.mkdirs();
        file = new RandomAccessFile(file, "rw");
        file.setLength(abyte0.length);
        file.write(abyte0);
        if (file != null)
        {
            file.close();
        }
        return;
        file;
        abyte0 = obj;
_L2:
        if (abyte0 != null)
        {
            abyte0.close();
        }
        throw file;
        Exception exception;
        exception;
        abyte0 = file;
        file = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static void writeZipEntry(byte abyte0[], ZipOutputStream zipoutputstream, ZipEntry zipentry, boolean flag)
        throws IOException
    {
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        zipoutputstream.putNextEntry(zipentry);
        zipoutputstream.write(abyte0);
        zipoutputstream.closeEntry();
        return;
        abyte0;
        zipoutputstream.closeEntry();
        throw abyte0;
        ZipEntry zipentry1 = new ZipEntry(zipentry.getName());
        zipentry1.setTime(zipentry.getTime());
        zipentry1.setMethod(0);
        zipentry1.setSize(abyte0.length);
        zipentry1.setCompressedSize(abyte0.length);
        zipentry = new CRC32();
        zipentry.update(abyte0);
        zipentry1.setCrc(zipentry.getValue());
        zipoutputstream.putNextEntry(zipentry1);
        zipoutputstream.write(abyte0);
        zipoutputstream.closeEntry();
        return;
        abyte0;
        zipoutputstream.closeEntry();
        throw abyte0;
    }

    protected void _run(IProperties iproperties)
    {
        Object obj;
        File file1;
        Logger logger;
        logger = m_log;
        boolean flag = logger.atVERBOSE();
        Object obj1;
        Boolean boolean1;
        IPathEnumerator ipathenumerator;
        long l;
        long l2;
        if (flag)
        {
            logger.verbose("[EMMA v0.0, build 0 (unsupported private build) (unknown)]");
            logger.verbose("instrumentation path:");
            logger.verbose("{");
            int i = 0;
            while (i < m_instrPath.length) 
            {
                File file = m_instrPath[i];
                String s;
                if (file.exists())
                {
                    s = "";
                } else
                {
                    s = "{nonexistent} ";
                }
                logger.verbose((new StringBuilder()).append("  ").append(s).append(file.getAbsolutePath()).toString());
                i++;
            }
            logger.verbose("}");
            logger.verbose((new StringBuilder()).append("instrumentation output mode: ").append(m_outMode).toString());
        } else
        {
            logger.info("processing instrumentation path ...");
        }
        obj1 = null;
        l = System.currentTimeMillis();
        m_timeStamp = l;
        ipathenumerator = com.vladium.util.IPathEnumerator.Factory.create(m_instrPath, m_canonical, this);
        if (m_outMode != InstrProcessor.OutMode.OUT_MODE_OVERWRITE)
        {
            createDir(m_outDir, true);
        }
        if (m_outMode == InstrProcessor.OutMode.OUT_MODE_FULLCOPY)
        {
            createDir(Files.newFile(m_outDir, "classes"), false);
            createDir(Files.newFile(m_outDir, "lib"), false);
        }
        obj = m_mdataOutFile;
        boolean1 = m_mdataOutMerge;
        file1 = ((File) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        file1 = new File(iproperties.getProperty("metadata.out.file", "coverage.em"));
        obj = boolean1;
        if (boolean1 != null) goto _L2; else goto _L1
_L1:
        if (!Property.toBoolean(iproperties.getProperty("metadata.out.merge", EMMAProperties.DEFAULT_META_DATA_OUT_MERGE.toString()))) goto _L4; else goto _L3
_L3:
        obj = Boolean.TRUE;
_L2:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_370;
        }
        logger.verbose((new StringBuilder()).append("metadata output file: ").append(file1.getAbsolutePath()).toString());
        logger.verbose((new StringBuilder()).append("metadata output merge mode: ").append(obj).toString());
        m_readbuf = new byte[32768];
        m_readpos = 0;
        m_baos = new ByteArrayOStream(32768);
        m_jobPos = 0;
        m_currentArchiveTS = 0x7fffffffffffffffL;
        iproperties = CoverageOptionsFactory.create(iproperties);
        m_visitor = new InstrVisitor(iproperties);
        m_mdata = DataFactory.newMetaData(iproperties);
        ipathenumerator.enumerate();
        drainJobQueue();
        if (logger.atINFO())
        {
            l2 = System.currentTimeMillis();
            logger.info((new StringBuilder()).append("instrumentation path processed in ").append(l2 - l).append(" ms").toString());
            logger.info((new StringBuilder()).append("[").append(m_classInstrs).append(" class(es) instrumented, ").append(m_classCopies).append(" resource(s) copied]").toString());
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_590;
        }
        if (m_mdata != null)
        {
            logger.verbose((new StringBuilder()).append("metadata contains ").append(m_mdata.size()).append(" entries").toString());
        }
        if (!m_mdata.isEmpty()) goto _L6; else goto _L5
_L5:
        logger.info("no output created: metadata is empty");
_L9:
        reset();
        iproperties = obj1;
_L7:
        StringBuilder stringbuilder;
        long l1;
        long l3;
        if (iproperties != null)
        {
            if (Exceptions.unexpectedFailure(iproperties, EXPECTED_FAILURES))
            {
                throw new EMMARuntimeException("UNEXPECTED_FAILURE", new Object[] {
                    iproperties.toString(), "this private build is unsupported"
                }, iproperties);
            } else
            {
                throw iproperties;
            }
        } else
        {
            return;
        }
_L4:
        obj = Boolean.FALSE;
        continue; /* Loop/switch isn't completed */
        iproperties;
        throw new EMMARuntimeException("INSTR_IO_FAILURE", iproperties);
        iproperties;
        iproperties = new EMMARuntimeException("SECURITY_RESTRICTION:", new String[] {
            "EMMA"
        }, iproperties);
        reset();
          goto _L7
_L6:
        l1 = System.currentTimeMillis();
        DataFactory.persist(m_mdata, file1, ((Boolean) (obj)).booleanValue());
        l3 = System.currentTimeMillis();
        if (!logger.atINFO()) goto _L9; else goto _L8
_L8:
        stringbuilder = (new StringBuilder()).append("metadata ");
        if (((Boolean) (obj)).booleanValue())
        {
            iproperties = "merged into";
        } else
        {
            iproperties = "written to";
        }
        logger.info(stringbuilder.append(iproperties).append(" [").append(file1.getAbsolutePath()).append("] {in ").append(l3 - l1).append(" ms}").toString());
          goto _L9
        iproperties;
        throw new EMMARuntimeException("OUT_IO_FAILURE", new Object[] {
            file1.getAbsolutePath()
        }, iproperties);
        iproperties;
        reset();
          goto _L7
        iproperties;
        reset();
        throw iproperties;
        if (true) goto _L2; else goto _L10
_L10:
    }

    public final void handleArchiveEnd(File file, File file1)
    {
        Logger logger = m_log;
        if (logger.atTRACE2())
        {
            logger.trace2("handleArchiveEnd", (new StringBuilder()).append("[").append(file).append("] [").append(file1).append("]").toString());
        }
        m_currentArchiveTS = 0x7fffffffffffffffL;
        if (m_outMode == InstrProcessor.OutMode.OUT_MODE_FULLCOPY || m_outMode == InstrProcessor.OutMode.OUT_MODE_OVERWRITE)
        {
            try
            {
                drainJobQueue();
                m_archiveOut.flush();
                m_archiveOut.close();
                m_archiveOut = null;
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw new EMMARuntimeException(file);
            }
            if (m_outMode == InstrProcessor.OutMode.OUT_MODE_OVERWRITE)
            {
                if (!Files.renameFile(m_tempArchiveFile, m_origArchiveFile, true))
                {
                    throw new EMMARuntimeException((new StringBuilder()).append("could not rename temporary file [").append(m_tempArchiveFile).append("] to [").append(m_origArchiveFile).append("]: make sure the original file is not locked and can be deleted").toString());
                }
                if (logger.atTRACE2())
                {
                    logger.trace2("handleArchiveEnd", (new StringBuilder()).append("renamed temp archive [").append(m_tempArchiveFile.getAbsolutePath()).append("] to [").append(m_origArchiveFile).append("]").toString());
                }
                m_tempArchiveFile = null;
                m_origArchiveFile = null;
            }
        }
    }

    public final void handleArchiveEntry(JarInputStream jarinputstream, ZipEntry zipentry)
    {
        Object obj;
        Object obj1;
        Object obj2;
        File file;
        boolean flag;
        boolean flag1;
        obj1 = m_log;
        if (((Logger) (obj1)).atTRACE2())
        {
            ((Logger) (obj1)).trace2("handleArchiveEntry", (new StringBuilder()).append("[").append(zipentry.getName()).append("]").toString());
        }
        obj2 = zipentry.getName();
        obj = ((String) (obj2)).toLowerCase();
        boolean flag3;
        if (m_outMode == InstrProcessor.OutMode.OUT_MODE_FULLCOPY || m_outMode == InstrProcessor.OutMode.OUT_MODE_OVERWRITE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = false;
        if (!((String) (obj)).endsWith(".class")) goto _L2; else goto _L1
_L1:
        obj2 = ((String) (obj2)).substring(0, ((String) (obj2)).length() - 6).replace('/', '.');
        if (m_coverageFilter != null && !m_coverageFilter.included(((String) (obj2)))) goto _L4; else goto _L3
_L3:
        obj = null;
        if (m_outMode != InstrProcessor.OutMode.OUT_MODE_COPY) goto _L6; else goto _L5
_L5:
        file = new File(((String) (obj2)).replace('.', File.separatorChar).concat(".class"));
        obj = getFullOutFile(null, file, true);
        flag3 = m_mdata.hasDescriptor(Descriptors.javaNameToVMName(((String) (obj2))));
        if (!flag3) goto _L8; else goto _L7
_L7:
        if (true)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        throw new NullPointerException();
_L12:
        return;
        jarinputstream;
        throw new EMMARuntimeException(jarinputstream);
_L8:
        long l2 = ((File) (obj)).lastModified();
        if (l2 <= 0L) goto _L6; else goto _L9
_L9:
        long l1 = zipentry.getTime();
        long l;
        l = l1;
        if (l1 >= 0L)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        l = m_currentArchiveTS;
        if (l > l2) goto _L6; else goto _L10
_L10:
        if (((Logger) (obj1)).atVERBOSE())
        {
            ((Logger) (obj1)).verbose((new StringBuilder()).append("destination file [").append(file).append("] skipped: more recent than the source").toString());
        }
        if (true) goto _L12; else goto _L11
_L11:
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (JarInputStream jarinputstream)
        {
            throw new EMMARuntimeException(jarinputstream);
        }
_L6:
        readZipEntry(jarinputstream, zipentry);
        obj2 = ClassDefParser.parseClass(m_readbuf, m_readpos);
        obj1 = m_visitor;
        boolean flag4;
        if (m_outMode == InstrProcessor.OutMode.OUT_MODE_OVERWRITE)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        ((InstrVisitor) (obj1)).process(((com.vladium.jcd.cls.ClassDef) (obj2)), flag4, true, true, m_instrResult);
        if (!m_instrResult.m_instrumented) goto _L14; else goto _L13
_L13:
        m_classInstrs = m_classInstrs + 1;
        m_mdata.add(m_instrResult.m_descriptor, false);
        m_baos.reset();
        ClassWriter.writeClassTable(((com.vladium.jcd.cls.ClassDef) (obj2)), m_baos);
        if (!flag) goto _L16; else goto _L15
_L15:
        zipentry.setTime(m_timeStamp);
        addJob(new EntryWriteJob(m_archiveOut, m_baos.copyByteArray(), zipentry, false));
_L18:
        flag = flag1;
        FileNotFoundException filenotfoundexception;
        byte abyte0[];
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
_L4:
        if (!flag) goto _L12; else goto _L17
_L17:
        try
        {
            readZipEntry(jarinputstream, zipentry);
            jarinputstream = new byte[m_readpos];
            System.arraycopy(m_readbuf, 0, jarinputstream, 0, jarinputstream.length);
            m_classCopies = m_classCopies + 1;
            zipentry.setTime(m_timeStamp);
            addJob(new EntryWriteJob(m_archiveOut, jarinputstream, zipentry, true));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JarInputStream jarinputstream)
        {
            throw new EMMARuntimeException(jarinputstream);
        }
_L16:
        addJob(new FileWriteJob(((File) (obj)), m_baos.copyByteArray(), true));
          goto _L18
        filenotfoundexception;
_L22:
        flag = flag1;
        if (true) goto _L4; else goto _L19
_L19:
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (JarInputStream jarinputstream)
        {
            throw new EMMARuntimeException(jarinputstream);
        }
_L14:
        if (!flag) goto _L18; else goto _L20
_L20:
        abyte0 = new byte[m_readpos];
        System.arraycopy(m_readbuf, 0, abyte0, 0, abyte0.length);
        m_classCopies = m_classCopies + 1;
        zipentry.setTime(m_timeStamp);
        addJob(new EntryWriteJob(m_archiveOut, abyte0, zipentry, true));
          goto _L18
        jarinputstream;
_L21:
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
_L2:
        boolean flag2 = flag;
        if (flag)
        {
            flag2 = flag;
            if (((String) (obj2)).equalsIgnoreCase("META-INF/"))
            {
                flag2 = false;
            }
        }
        flag = flag2;
        if (flag2)
        {
            flag = flag2;
            if (((String) (obj2)).equalsIgnoreCase("META-INF/MANIFEST.MF"))
            {
                flag = false;
            }
        }
          goto _L4
        jarinputstream;
          goto _L21
        FileNotFoundException filenotfoundexception1;
        filenotfoundexception1;
          goto _L22
    }

    public final void handleArchiveStart(File file, File file1, Manifest manifest)
    {
        Logger logger;
        logger = m_log;
        if (logger.atTRACE2())
        {
            logger.trace2("handleArchiveStart", (new StringBuilder()).append("[").append(file).append("] [").append(file1).append("]").toString());
        }
        m_currentArchiveTS = Files.newFile(file, file1).lastModified();
        if (m_outMode != InstrProcessor.OutMode.OUT_MODE_FULLCOPY && m_outMode != InstrProcessor.OutMode.OUT_MODE_OVERWRITE) goto _L2; else goto _L1
_L1:
        Manifest manifest1;
        Attributes attributes;
        if (manifest != null)
        {
            manifest1 = new Manifest(manifest);
        } else
        {
            manifest1 = new Manifest();
        }
        attributes = manifest1.getMainAttributes();
        if (manifest == null)
        {
            attributes.put(java.util.jar.Attributes.Name.MANIFEST_VERSION, "1.0");
        }
        attributes.put(new java.util.jar.Attributes.Name("Created-By"), "EMMA v0.0.0 (unsupported private build)");
        attributes.put(java.util.jar.Attributes.Name.IMPLEMENTATION_TITLE, (new StringBuilder()).append("instrumented version of [").append(file1.getAbsolutePath()).append("]").toString());
        attributes.put(java.util.jar.Attributes.Name.SPECIFICATION_TITLE, (new StringBuilder()).append("instrumented on ").append(new Date(m_timeStamp)).append(" [").append(Property.getSystemFingerprint()).append("]").toString());
        if (m_outMode != InstrProcessor.OutMode.OUT_MODE_FULLCOPY) goto _L4; else goto _L3
_L3:
        try
        {
            file = new FileOutputStream(getFullOutFile(file, file1, false));
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new EMMARuntimeException(file);
        }
        if (manifest1 == null) goto _L6; else goto _L5
_L5:
        file = new JarOutputStream(file, manifest1);
_L7:
        m_archiveOut = file;
_L2:
        return;
_L6:
        file = new JarOutputStream(file);
          goto _L7
_L4:
        if (m_outMode != InstrProcessor.OutMode.OUT_MODE_OVERWRITE) goto _L2; else goto _L8
_L8:
        m_origArchiveFile = Files.newFile(file, file1);
        file1 = (new StringBuilder()).append(Files.getFileName(file1)).append("emma").toString();
        try
        {
            m_tempArchiveFile = Files.createTempFile(file, file1, ".et");
            if (logger.atTRACE2())
            {
                logger.trace2("handleArchiveStart", (new StringBuilder()).append("created temp archive [").append(m_tempArchiveFile.getAbsolutePath()).append("]").toString());
            }
            file = new FileOutputStream(m_tempArchiveFile);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new EMMARuntimeException(file);
        }
        if (manifest1 == null)
        {
            break MISSING_BLOCK_LABEL_469;
        }
        file = new JarOutputStream(file, manifest1);
_L9:
        m_archiveOut = file;
        return;
        file = new JarOutputStream(file);
          goto _L9
    }

    public final void handleDirEnd(File file, File file1)
    {
        Logger logger = m_log;
        if (logger.atTRACE2())
        {
            logger.trace2("handleDirEnd", (new StringBuilder()).append("[").append(file).append("] [").append(file1).append("]").toString());
        }
        if (m_outMode != InstrProcessor.OutMode.OUT_MODE_OVERWRITE)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        drainJobQueue();
        return;
        file;
        throw new EMMARuntimeException(file);
    }

    public final void handleDirStart(File file, File file1)
    {
        Logger logger = m_log;
        if (logger.atTRACE2())
        {
            logger.trace2("handleDirStart", (new StringBuilder()).append("[").append(file).append("] [").append(file1).append("]").toString());
        }
        if (m_outMode == InstrProcessor.OutMode.OUT_MODE_FULLCOPY)
        {
            createDir(new File(getFullOutDir(file, true), file1.getPath()), true);
        }
    }

    public final void handleFile(File file, File file1)
    {
        Object obj;
        Object obj1;
        Object obj2;
        boolean flag;
        boolean flag1;
        boolean flag2;
        obj1 = m_log;
        if (((Logger) (obj1)).atTRACE2())
        {
            ((Logger) (obj1)).trace2("handleFile", (new StringBuilder()).append("[").append(file).append("] [").append(file1).append("]").toString());
        }
        obj = file1.getPath();
        obj2 = ((String) (obj)).toLowerCase();
        String s;
        boolean flag3;
        if (m_outMode == InstrProcessor.OutMode.OUT_MODE_FULLCOPY)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (m_outMode == InstrProcessor.OutMode.OUT_MODE_COPY)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        flag1 = false;
        if (!((String) (obj2)).endsWith(".class")) goto _L2; else goto _L1
_L1:
        s = ((String) (obj)).substring(0, ((String) (obj)).length() - 6).replace(File.separatorChar, '.');
        if (m_coverageFilter != null && !m_coverageFilter.included(s)) goto _L2; else goto _L3
_L3:
        obj2 = Files.newFile(file, file1.getPath());
        obj = getFullOutFile(file, file1, true);
        if (m_outMode != InstrProcessor.OutMode.OUT_MODE_COPY) goto _L5; else goto _L4
_L4:
        flag3 = m_mdata.hasDescriptor(Descriptors.javaNameToVMName(s));
        if (!flag3) goto _L7; else goto _L6
_L6:
        if (true)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        throw new NullPointerException();
_L11:
        return;
        file;
        throw new EMMARuntimeException(file);
_L7:
        long l = ((File) (obj)).lastModified();
        if (l <= 0L) goto _L5; else goto _L8
_L8:
        if (((File) (obj2)).lastModified() > l) goto _L5; else goto _L9
_L9:
        if (((Logger) (obj1)).atVERBOSE())
        {
            ((Logger) (obj1)).verbose((new StringBuilder()).append("destination file [").append(obj).append("] skipped: more recent that the source file").toString());
        }
        if (true) goto _L11; else goto _L10
_L10:
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new EMMARuntimeException(file);
        }
_L5:
        readFile(((File) (obj2)));
        obj2 = ClassDefParser.parseClass(m_readbuf, m_readpos);
        obj1 = m_visitor;
        boolean flag4;
        if (m_outMode == InstrProcessor.OutMode.OUT_MODE_OVERWRITE)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        ((InstrVisitor) (obj1)).process(((com.vladium.jcd.cls.ClassDef) (obj2)), flag4, true, true, m_instrResult);
        if (!m_instrResult.m_instrumented) goto _L13; else goto _L12
_L12:
        m_classInstrs = m_classInstrs + 1;
        m_mdata.add(m_instrResult.m_descriptor, false);
        m_baos.reset();
        ClassWriter.writeClassTable(((com.vladium.jcd.cls.ClassDef) (obj2)), m_baos);
        addJob(new FileWriteJob(((File) (obj)), m_baos.copyByteArray(), flag2));
_L16:
        flag = flag1;
        FileNotFoundException filenotfoundexception;
        byte abyte0[];
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
_L2:
        if (!flag) goto _L11; else goto _L14
_L14:
        try
        {
            readFile(Files.newFile(file, file1.getPath()));
            obj = new byte[m_readpos];
            System.arraycopy(m_readbuf, 0, obj, 0, obj.length);
            m_classCopies = m_classCopies + 1;
            addJob(new FileWriteJob(getFullOutFile(file, file1, true), ((byte []) (obj)), flag2));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new EMMARuntimeException(file);
        }
_L13:
        if (!flag) goto _L16; else goto _L15
_L15:
        abyte0 = new byte[m_readpos];
        System.arraycopy(m_readbuf, 0, abyte0, 0, m_readpos);
        m_classCopies = m_classCopies + 1;
        addJob(new FileWriteJob(((File) (obj)), abyte0, flag2));
          goto _L16
        filenotfoundexception;
        flag = flag1;
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
          goto _L2
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

    protected void reset()
    {
        m_visitor = null;
        m_mdata = null;
        m_readbuf = null;
        m_baos = null;
        for (int i = 0; i < m_jobs.length; i++)
        {
            m_jobs[i] = null;
        }

        if (m_archiveOut != null)
        {
            try
            {
                m_archiveOut.close();
            }
            catch (Exception exception) { }
        }
        if (m_tempArchiveFile != null)
        {
            m_tempArchiveFile.delete();
        }
        m_archiveOut = null;
        m_origArchiveFile = null;
        m_tempArchiveFile = null;
        super.reset();
    }

}
