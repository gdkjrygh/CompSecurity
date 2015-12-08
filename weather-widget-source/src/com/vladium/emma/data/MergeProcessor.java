// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.data;

import com.vladium.emma.EMMARuntimeException;
import com.vladium.emma.IAppErrorCodes;
import com.vladium.emma.Processor;
import com.vladium.logging.Logger;
import com.vladium.util.Files;
import com.vladium.util.IConstants;
import com.vladium.util.IProperties;
import com.vladium.util.asserts.$assert;
import com.vladium.util.exception.Exceptions;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.vladium.emma.data:
//            DataFactory, IMetaData, ICoverageData, SessionData

public final class MergeProcessor extends Processor
    implements IAppErrorCodes
{

    private static final Class EXPECTED_FAILURES[] = {
        com/vladium/emma/EMMARuntimeException, java/lang/IllegalArgumentException, java/lang/IllegalStateException
    };
    private int m_dataFileCount;
    private File m_dataPath[];
    private File m_sdataOutFile;

    private MergeProcessor()
    {
        m_dataPath = IConstants.EMPTY_FILE_ARRAY;
    }

    public static MergeProcessor create()
    {
        return new MergeProcessor();
    }

    private void reset()
    {
        m_dataFileCount = 0;
    }

    protected void _run(IProperties iproperties)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        File file1;
        Object obj4;
        Object obj5;
        Logger logger;
        int j;
        long l;
        boolean flag2;
        logger = m_log;
        flag2 = m_log.atVERBOSE();
        IMergeable aimergeable[];
        if (flag2)
        {
            logger.verbose("[EMMA v0.0, build 0 (unsupported private build) (unknown)]");
            logger.verbose("input data path:");
            logger.verbose("{");
            int i = 0;
            while (i < m_dataPath.length) 
            {
                File file = m_dataPath[i];
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
        } else
        {
            logger.info("processing input files ...");
        }
        obj = m_sdataOutFile;
        file1 = ((File) (obj));
        if (obj == null)
        {
            file1 = new File(iproperties.getProperty("session.out.file", "coverage.es"));
        }
        obj5 = null;
        obj2 = null;
        obj3 = null;
        obj4 = null;
        obj1 = null;
        iproperties = ((IProperties) (obj4));
        obj = obj2;
        if (!logger.atINFO()) goto _L2; else goto _L1
_L1:
        iproperties = ((IProperties) (obj4));
        obj = obj2;
        l = System.currentTimeMillis();
          goto _L3
_L14:
        iproperties = ((IProperties) (obj1));
        obj = obj3;
        if (j >= m_dataPath.length) goto _L5; else goto _L4
_L4:
        iproperties = ((IProperties) (obj1));
        obj = obj3;
        obj2 = m_dataPath[j];
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_270;
        }
        iproperties = ((IProperties) (obj1));
        obj = obj3;
        logger.verbose((new StringBuilder()).append("processing input file [").append(((File) (obj2)).getAbsolutePath()).append("] ...").toString());
        iproperties = ((IProperties) (obj1));
        obj = obj3;
        aimergeable = DataFactory.load(((File) (obj2)));
        iproperties = ((IProperties) (obj1));
        obj = obj3;
        obj4 = (IMetaData)aimergeable[0];
        obj2 = obj3;
        if (obj4 == null) goto _L7; else goto _L6
_L6:
        if (!flag2) goto _L9; else goto _L8
_L8:
        iproperties = ((IProperties) (obj1));
        obj = obj3;
        logger.verbose((new StringBuilder()).append("  loaded ").append(((IMetaData) (obj4)).size()).append(" metadata entries").toString());
          goto _L9
_L7:
        iproperties = ((IProperties) (obj1));
        obj = obj2;
        obj4 = (ICoverageData)aimergeable[1];
        obj3 = obj1;
        if (obj4 == null) goto _L11; else goto _L10
_L10:
        if (!flag2) goto _L13; else goto _L12
_L12:
        iproperties = ((IProperties) (obj1));
        obj = obj2;
        logger.verbose((new StringBuilder()).append("  loaded ").append(((ICoverageData) (obj4)).size()).append(" coverage data entries").toString());
          goto _L13
_L11:
        iproperties = ((IProperties) (obj3));
        obj = obj2;
        m_dataFileCount = m_dataFileCount + 1;
        j++;
        obj1 = obj3;
        obj3 = obj2;
          goto _L14
_L2:
        l = 0L;
          goto _L3
_L42:
        iproperties = ((IProperties) (obj1));
        obj = obj3;
        obj2 = (IMetaData)((IMetaData) (obj3)).merge(((IMergeable) (obj4)));
          goto _L7
_L44:
        iproperties = ((IProperties) (obj1));
        obj = obj2;
        obj3 = (ICoverageData)((ICoverageData) (obj1)).merge(((IMergeable) (obj4)));
          goto _L11
_L5:
        iproperties = ((IProperties) (obj1));
        obj = obj3;
        if (!logger.atINFO())
        {
            break MISSING_BLOCK_LABEL_582;
        }
        iproperties = ((IProperties) (obj1));
        obj = obj3;
        long l1 = System.currentTimeMillis();
        iproperties = ((IProperties) (obj1));
        obj = obj3;
        logger.info((new StringBuilder()).append(m_dataFileCount).append(" file(s) read and merged in ").append(l1 - l).append(" ms").toString());
        if (obj3 == null) goto _L16; else goto _L15
_L15:
        iproperties = ((IProperties) (obj1));
        obj = obj3;
        obj2 = obj1;
        obj4 = obj3;
        if (!((IMetaData) (obj3)).isEmpty()) goto _L17; else goto _L16
_L16:
        if (obj1 == null) goto _L19; else goto _L18
_L18:
        iproperties = ((IProperties) (obj1));
        obj = obj3;
        obj2 = obj1;
        obj4 = obj3;
        if (!((ICoverageData) (obj1)).isEmpty()) goto _L17; else goto _L19
_L19:
        iproperties = ((IProperties) (obj1));
        obj = obj3;
        logger.warning("nothing to do: no metadata or coverage data found in any of the input files");
        reset();
_L35:
        return;
        obj1;
        ((IOException) (obj1)).printStackTrace(System.out);
        obj4 = obj;
        obj2 = iproperties;
_L17:
        if (!flag2) goto _L21; else goto _L20
_L20:
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_710;
        }
        logger.verbose((new StringBuilder()).append("  merged metadata contains ").append(((IMetaData) (obj4)).size()).append(" entries").toString());
        if (obj2 == null) goto _L21; else goto _L22
_L22:
        logger.verbose((new StringBuilder()).append("  merged coverage data contains ").append(((ICoverageData) (obj2)).size()).append(" entries").toString());
          goto _L21
_L36:
        $assert.ASSERT(flag2, "sdataOutFile not null");
        boolean flag1;
        flag1 = false;
        iproperties = null;
        obj1 = Files.canonicalizeFile(file1);
        j = 0;
_L37:
        boolean flag = flag1;
        if (j >= m_dataPath.length) goto _L24; else goto _L23
_L23:
        if (!((File) (obj1)).equals(Files.canonicalizeFile(m_dataPath[j]))) goto _L26; else goto _L25
_L25:
        flag = true;
_L24:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_926;
        }
        obj = ((File) (obj1)).getParentFile();
        iproperties = ((IProperties) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_834;
        }
        iproperties = new File("");
        obj = (new StringBuilder()).append(Files.getFileName(((File) (obj1)))).append("emma").toString();
        iproperties = Files.createTempFile(iproperties, ((String) (obj)), ".et");
        logger.warning((new StringBuilder()).append("the specified output file is one of the input files [").append(obj1).append("]").toString());
        logger.warning((new StringBuilder()).append("all merged data will be written to a temp file first [").append(iproperties.getAbsolutePath()).append("]").toString());
        if (!logger.atINFO()) goto _L28; else goto _L27
_L27:
        l = System.currentTimeMillis();
_L39:
        if (iproperties != null)
        {
            obj = iproperties;
        } else
        {
            obj = obj1;
        }
        if (obj4 == null) goto _L30; else goto _L29
_L29:
        if (!((IMetaData) (obj4)).isEmpty()) goto _L31; else goto _L30
_L30:
        DataFactory.persist(((ICoverageData) (obj2)), ((File) (obj)), false);
_L40:
        if (!flag) goto _L33; else goto _L32
_L32:
        if (!Files.renameFile(iproperties, ((File) (obj1)), true))
        {
            throw new EMMARuntimeException((new StringBuilder()).append("could not rename temporary file [").append(iproperties.getAbsolutePath()).append("] to [").append(obj1).append("]: make sure the original file is not locked and can be deleted").toString());
        }
          goto _L33
        iproperties;
        iproperties = new EMMARuntimeException("SECURITY_RESTRICTION:", new String[] {
            "EMMA"
        }, iproperties);
        reset();
_L38:
        if (iproperties == null) goto _L35; else goto _L34
_L34:
        if (Exceptions.unexpectedFailure(iproperties, EXPECTED_FAILURES))
        {
            throw new EMMARuntimeException("UNEXPECTED_FAILURE", new Object[] {
                iproperties.toString(), "this private build is unsupported"
            }, iproperties);
        } else
        {
            throw iproperties;
        }
_L46:
        flag2 = false;
          goto _L36
_L26:
        j++;
          goto _L37
        iproperties;
        throw new EMMARuntimeException(iproperties);
        iproperties;
        reset();
          goto _L38
_L28:
        l = 0L;
          goto _L39
_L31:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_1153;
        }
        if (!((ICoverageData) (obj2)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_1189;
        }
        DataFactory.persist(((IMetaData) (obj4)), ((File) (obj)), false);
          goto _L40
        iproperties;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1173;
        }
        ((File) (obj)).delete();
        throw new EMMARuntimeException(iproperties);
        iproperties;
        reset();
        throw iproperties;
        DataFactory.persist(new SessionData(((IMetaData) (obj4)), ((ICoverageData) (obj2))), ((File) (obj)), false);
          goto _L40
        iproperties;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1218;
        }
        ((File) (obj)).delete();
        throw iproperties;
_L33:
        if (logger.atINFO())
        {
            long l2 = System.currentTimeMillis();
            logger.info((new StringBuilder()).append("merged/compacted data written to [").append(obj1).append("] {in ").append(l2 - l).append(" ms}").toString());
        }
        reset();
        iproperties = obj5;
          goto _L38
_L3:
        j = 0;
          goto _L14
_L9:
        if (obj3 != null) goto _L42; else goto _L41
_L41:
        obj2 = obj4;
          goto _L7
_L13:
        if (obj1 != null) goto _L44; else goto _L43
_L43:
        obj3 = obj4;
          goto _L11
_L21:
        if (file1 == null) goto _L46; else goto _L45
_L45:
        flag2 = true;
          goto _L36
    }

    public final void setDataPath(String as[])
    {
        this;
        JVM INSTR monitorenter ;
        if (as == null) goto _L2; else goto _L1
_L1:
        if (as.length != 0) goto _L3; else goto _L2
_L2:
        m_dataPath = IConstants.EMPTY_FILE_ARRAY;
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        m_dataPath = Files.pathToFiles(as, true);
        if (true) goto _L5; else goto _L4
_L4:
        as;
        throw as;
    }

    public final void setSessionOutFile(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        m_sdataOutFile = null;
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
        break MISSING_BLOCK_LABEL_78;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        m_sdataOutFile = s;
          goto _L3
    }

    protected void validateState()
    {
        super.validateState();
        if (m_dataPath == null)
        {
            throw new IllegalStateException("data path not set");
        } else
        {
            return;
        }
    }

}
