// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;

import com.vladium.emma.EMMARuntimeException;
import com.vladium.emma.Processor;
import com.vladium.emma.filter.IInclExclFilter;
import com.vladium.util.Files;
import com.vladium.util.IConstants;
import java.io.File;

// Referenced classes of package com.vladium.emma.instr:
//            InstrProcessorST

public abstract class InstrProcessor extends Processor
    implements com.vladium.util.IPathEnumerator.IPathHandler
{
    public static final class OutMode
    {

        public static final OutMode OUT_MODE_COPY = new OutMode("copy");
        public static final OutMode OUT_MODE_FULLCOPY = new OutMode("fullcopy");
        public static final OutMode OUT_MODE_OVERWRITE = new OutMode("overwrite");
        private final String m_name;

        public static OutMode nameToMode(String s)
        {
            if (OUT_MODE_COPY.m_name.equals(s))
            {
                return OUT_MODE_COPY;
            }
            if (OUT_MODE_FULLCOPY.m_name.equals(s))
            {
                return OUT_MODE_FULLCOPY;
            }
            if (OUT_MODE_OVERWRITE.m_name.equals(s))
            {
                return OUT_MODE_OVERWRITE;
            } else
            {
                return null;
            }
        }

        public String getName()
        {
            return m_name;
        }

        public String toString()
        {
            return m_name;
        }


        private OutMode(String s)
        {
            m_name = s;
        }
    }


    protected static final String CLASSES = "classes";
    public static final String DEFAULT_DO_SUID_COMPENSATION = "true";
    public static final String DEFAULT_EXCLUDE_BRIDGE_METHODS = "true";
    public static final String DEFAULT_EXCLUDE_SYNTHETIC_METHODS = "true";
    protected static final boolean IN_CLASSES = true;
    protected static final boolean IN_LIB = false;
    protected static final String LIB = "lib";
    public static final String PROPERTY_DO_SUID_COMPENSATION = "instr.do_suid_compensation";
    public static final String PROPERTY_EXCLUDE_BRIDGE_METHODS = "instr.exclude_bridge_methods";
    public static final String PROPERTY_EXCLUDE_SYNTHETIC_METHODS = "instr.exclude_synthetic_methods";
    protected boolean m_canonical;
    protected int m_classCopies;
    protected int m_classInstrs;
    protected IInclExclFilter m_coverageFilter;
    protected boolean m_dependsMode;
    protected File m_instrPath[];
    protected File m_mdataOutFile;
    protected Boolean m_mdataOutMerge;
    protected File m_outDir;
    protected OutMode m_outMode;

    protected InstrProcessor()
    {
        m_dependsMode = true;
    }

    public static InstrProcessor create()
    {
        return new InstrProcessorST();
    }

    protected final void createDir(File file, boolean flag)
        throws EMMARuntimeException
    {
        if (flag)
        {
            if (!file.mkdirs() && !file.exists())
            {
                throw new EMMARuntimeException("OUT_MKDIR_FAILURE", new Object[] {
                    file.getAbsolutePath()
                });
            }
        } else
        if (!file.mkdir() && !file.exists())
        {
            throw new EMMARuntimeException("OUT_MKDIR_FAILURE", new Object[] {
                file.getAbsolutePath()
            });
        }
    }

    protected final File getFullOutDir(File file, boolean flag)
    {
        if (m_outMode == OutMode.OUT_MODE_OVERWRITE)
        {
            return file;
        }
        if (m_outMode == OutMode.OUT_MODE_COPY)
        {
            return m_outDir;
        }
        if (m_outMode == OutMode.OUT_MODE_FULLCOPY)
        {
            if (flag)
            {
                file = Files.newFile(m_outDir, "classes");
            } else
            {
                file = Files.newFile(m_outDir, "lib");
            }
            return file;
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("invalid out mode state: ").append(m_outMode).toString());
        }
    }

    protected final File getFullOutFile(File file, File file1, boolean flag)
    {
        return Files.newFile(getFullOutDir(file, flag), file1.getPath());
    }

    protected void reset()
    {
        m_classInstrs = 0;
        m_classCopies = 0;
    }

    public final void setDependsMode(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        m_dependsMode = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void setInclExclFilter(String as[])
    {
        this;
        JVM INSTR monitorenter ;
        if (as != null) goto _L2; else goto _L1
_L1:
        m_coverageFilter = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        m_coverageFilter = com.vladium.emma.filter.IInclExclFilter.Factory.create(as);
        if (true) goto _L4; else goto _L3
_L3:
        as;
        throw as;
    }

    public final void setInstrOutDir(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        m_outDir = null;
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        s = new File(s);
        if (s.exists() && !s.isDirectory())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("not a directory: [").append(s.getAbsolutePath()).append("]").toString());
        }
        break MISSING_BLOCK_LABEL_77;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        m_outDir = s;
          goto _L3
    }

    public final void setInstrPath(String as[], boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_11;
        }
        if (as.length != 0)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        m_instrPath = IConstants.EMPTY_FILE_ARRAY;
_L1:
        m_canonical = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        m_instrPath = Files.pathToFiles(as, flag);
          goto _L1
        as;
        throw as;
    }

    public final void setMetaOutFile(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        m_mdataOutFile = null;
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        s = new File(s);
        if (s.exists() && !s.isFile())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("not a file: [").append(s.getAbsolutePath()).append("]").toString());
        }
        break MISSING_BLOCK_LABEL_77;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        m_mdataOutFile = s;
          goto _L3
    }

    public final void setMetaOutMerge(Boolean boolean1)
    {
        this;
        JVM INSTR monitorenter ;
        m_mdataOutMerge = boolean1;
        this;
        JVM INSTR monitorexit ;
        return;
        boolean1;
        throw boolean1;
    }

    public final void setOutMode(OutMode outmode)
    {
        this;
        JVM INSTR monitorenter ;
        if (outmode != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("null input: mode");
        outmode;
        this;
        JVM INSTR monitorexit ;
        throw outmode;
        m_outMode = outmode;
        this;
        JVM INSTR monitorexit ;
    }

    protected void validateState()
    {
        File file;
        super.validateState();
        if (m_instrPath == null || m_instrPath.length == 0)
        {
            throw new IllegalStateException("instrumentation path not set");
        }
        if (m_outMode == null)
        {
            throw new IllegalStateException("output mode not set");
        }
        if (m_outMode == OutMode.OUT_MODE_OVERWRITE)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        if (m_outDir == null)
        {
            throw new IllegalStateException("output directory not set");
        }
        file = Files.canonicalizeFile(m_outDir);
        if (!m_canonical) goto _L2; else goto _L1
_L1:
        File afile[] = m_instrPath;
_L8:
        Object obj;
        int j;
        j = afile.length;
        obj = file;
_L6:
        int i;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((File) (obj)).equals(afile[i]))
        {
            throw new IllegalStateException((new StringBuilder()).append("output directory [").append(file).append("] cannot be one of the instrumentation path directories (or a child thereof)").toString());
        }
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        obj = new File[m_instrPath.length];
        i = 0;
        do
        {
            afile = ((File []) (obj));
            if (i >= obj.length)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj[i] = Files.canonicalizeFile(m_instrPath[i]);
            i++;
        } while (true);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        obj = ((File) (obj)).getParentFile();
        if (true) goto _L6; else goto _L5
_L5:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
