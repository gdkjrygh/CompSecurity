// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import com.vladium.emma.EMMARuntimeException;
import com.vladium.emma.IAppErrorCodes;
import com.vladium.emma.Processor;
import com.vladium.emma.data.DataFactory;
import com.vladium.emma.data.ICoverageData;
import com.vladium.emma.data.IMetaData;
import com.vladium.logging.Logger;
import com.vladium.util.Files;
import com.vladium.util.IConstants;
import com.vladium.util.IProperties;
import com.vladium.util.Strings;
import com.vladium.util.exception.Exceptions;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.vladium.emma.report:
//            SourcePathCache, IReportGenerator, AbstractReportGenerator

public final class ReportProcessor extends Processor
    implements IAppErrorCodes
{

    private static final Class EXPECTED_FAILURES[] = {
        com/vladium/emma/EMMARuntimeException, java/lang/IllegalArgumentException, java/lang/IllegalStateException
    };
    private int m_dataFileCount;
    private File m_dataPath[];
    private IReportGenerator m_reportGenerators[];
    private File m_sourcePath[];

    private ReportProcessor()
    {
        m_dataPath = IConstants.EMPTY_FILE_ARRAY;
    }

    public static ReportProcessor create()
    {
        return new ReportProcessor();
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
        Object obj4;
        Logger logger;
        long l;
        boolean flag;
        logger = m_log;
        flag = m_log.atVERBOSE();
        if (flag)
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
            com.vladium.emma.data.IMergeable aimergeable[];
            if (m_sourcePath == null || m_sourcePath.length == 0)
            {
                logger.verbose("source path not set");
            } else
            {
                logger.verbose("source path:");
                logger.verbose("{");
                int j = 0;
                while (j < m_sourcePath.length) 
                {
                    obj1 = m_sourcePath[j];
                    if (((File) (obj1)).exists())
                    {
                        obj = "";
                    } else
                    {
                        obj = "{nonexistent} ";
                    }
                    logger.verbose((new StringBuilder()).append("  ").append(((String) (obj))).append(((File) (obj1)).getAbsolutePath()).toString());
                    j++;
                }
                logger.verbose("}");
            }
        } else
        {
            logger.info("processing input files ...");
        }
        obj3 = null;
        if (!logger.atINFO()) goto _L2; else goto _L1
_L1:
        l = System.currentTimeMillis();
_L14:
        obj1 = null;
        obj2 = null;
        i = 0;
_L13:
        if (i >= m_dataPath.length) goto _L4; else goto _L3
_L3:
        obj = m_dataPath[i];
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        logger.verbose((new StringBuilder()).append("processing input file [").append(((File) (obj)).getAbsolutePath()).append("] ...").toString());
        aimergeable = DataFactory.load(((File) (obj)));
        obj4 = (IMetaData)aimergeable[0];
        obj = obj1;
        if (obj4 == null) goto _L6; else goto _L5
_L5:
        if (!flag) goto _L8; else goto _L7
_L7:
        logger.verbose((new StringBuilder()).append("  loaded ").append(((IMetaData) (obj4)).size()).append(" metadata entries").toString());
          goto _L8
_L6:
        obj4 = (ICoverageData)aimergeable[1];
        obj1 = obj2;
        if (obj4 == null) goto _L10; else goto _L9
_L9:
        if (!flag) goto _L12; else goto _L11
_L11:
        logger.verbose((new StringBuilder()).append("  loaded ").append(((ICoverageData) (obj4)).size()).append(" coverage data entries").toString());
          goto _L12
_L10:
        m_dataFileCount = m_dataFileCount + 1;
        i++;
        obj2 = obj1;
        obj1 = obj;
          goto _L13
_L2:
        l = 0L;
          goto _L14
_L26:
        obj = (IMetaData)((IMetaData) (obj1)).merge(((com.vladium.emma.data.IMergeable) (obj4)));
          goto _L6
_L28:
        obj1 = (ICoverageData)((ICoverageData) (obj2)).merge(((com.vladium.emma.data.IMergeable) (obj4)));
          goto _L10
_L4:
        if (logger.atINFO())
        {
            long l1 = System.currentTimeMillis();
            logger.info((new StringBuilder()).append(m_dataFileCount).append(" file(s) read and merged in ").append(l1 - l).append(" ms").toString());
        }
        if (obj1 == null) goto _L16; else goto _L15
_L15:
        if (!((IMetaData) (obj1)).isEmpty()) goto _L17; else goto _L16
_L16:
        logger.warning("nothing to do: no metadata found in any of the data files");
        reset();
_L22:
        return;
_L17:
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_618;
        }
        logger.warning("nothing to do: no runtime coverage data found in any of the data files");
        reset();
        return;
        if (((ICoverageData) (obj2)).isEmpty())
        {
            logger.warning("no collected coverage data found in any of the data files [all reports will be empty]");
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_718;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_678;
        }
        logger.verbose((new StringBuilder()).append("  merged metadata contains ").append(((IMetaData) (obj1)).size()).append(" entries").toString());
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_718;
        }
        logger.verbose((new StringBuilder()).append("  merged coverage data contains ").append(((ICoverageData) (obj2)).size()).append(" entries").toString());
        obj = null;
        if (m_sourcePath != null)
        {
            obj = new SourcePathCache(m_sourcePath, true);
        }
        break MISSING_BLOCK_LABEL_953;
_L20:
        int k;
        if (k >= m_reportGenerators.length) goto _L19; else goto _L18
_L18:
        obj4 = m_reportGenerators[k];
        ((IReportGenerator) (obj4)).process(((IMetaData) (obj1)), ((ICoverageData) (obj2)), ((SourcePathCache) (obj)), iproperties);
        ((IReportGenerator) (obj4)).cleanup();
_L24:
        k++;
          goto _L20
        iproperties;
        iproperties.printStackTrace(System.out);
        ((IReportGenerator) (obj4)).cleanup();
_L19:
        reset();
        iproperties = obj3;
_L23:
        if (iproperties == null) goto _L22; else goto _L21
_L21:
        if (Exceptions.unexpectedFailure(iproperties, EXPECTED_FAILURES))
        {
            throw new EMMARuntimeException("UNEXPECTED_FAILURE", new Object[] {
                iproperties.toString(), "this private build is unsupported"
            }, iproperties);
        } else
        {
            throw iproperties;
        }
        iproperties;
        try
        {
            ((IReportGenerator) (obj4)).cleanup();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw iproperties;
        iproperties;
        iproperties.printStackTrace(System.out);
          goto _L19
        iproperties;
        iproperties = new EMMARuntimeException("SECURITY_RESTRICTION:", new String[] {
            "EMMA"
        }, iproperties);
        reset();
          goto _L23
        iproperties;
        reset();
          goto _L23
        iproperties;
        reset();
        throw iproperties;
        obj4;
          goto _L24
        iproperties;
          goto _L19
_L8:
        if (obj1 != null) goto _L26; else goto _L25
_L25:
        obj = obj4;
          goto _L6
_L12:
        if (obj2 != null) goto _L28; else goto _L27
_L27:
        obj1 = obj4;
          goto _L10
        k = 0;
          goto _L20
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

    public void setReportTypes(String as[])
    {
        this;
        JVM INSTR monitorenter ;
        if (as != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("null input: types");
        as;
        this;
        JVM INSTR monitorexit ;
        throw as;
        IReportGenerator aireportgenerator[];
        as = Strings.removeDuplicates(as, true);
        if (as.length == 0)
        {
            throw new IllegalArgumentException("empty input: types");
        }
        aireportgenerator = new IReportGenerator[as.length];
        int i = 0;
_L2:
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        aireportgenerator[i] = AbstractReportGenerator.create(as[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        m_reportGenerators = aireportgenerator;
        this;
        JVM INSTR monitorexit ;
    }

    public void setSourcePath(String as[])
    {
        this;
        JVM INSTR monitorenter ;
        if (as != null) goto _L2; else goto _L1
_L1:
        m_sourcePath = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        m_sourcePath = Files.pathToFiles(as, true);
        if (true) goto _L4; else goto _L3
_L3:
        as;
        throw as;
    }

    protected void validateState()
    {
        super.validateState();
        if (m_dataPath == null)
        {
            throw new IllegalStateException("data path not set");
        }
        if (m_reportGenerators == null || m_reportGenerators.length == 0)
        {
            throw new IllegalStateException("report types not set");
        } else
        {
            return;
        }
    }

}
