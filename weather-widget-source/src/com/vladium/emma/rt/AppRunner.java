// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.rt;

import com.vladium.emma.AppLoggers;
import com.vladium.emma.EMMAProperties;
import com.vladium.emma.EMMARuntimeException;
import com.vladium.emma.IAppConstants;
import com.vladium.emma.IAppErrorCodes;
import com.vladium.emma.Processor;
import com.vladium.emma.data.CoverageOptionsFactory;
import com.vladium.emma.data.DataFactory;
import com.vladium.emma.data.ICoverageData;
import com.vladium.emma.data.IMetaData;
import com.vladium.emma.data.SessionData;
import com.vladium.emma.filter.IInclExclFilter;
import com.vladium.emma.report.AbstractReportGenerator;
import com.vladium.emma.report.IReportGenerator;
import com.vladium.emma.report.SourcePathCache;
import com.vladium.logging.Logger;
import com.vladium.util.Files;
import com.vladium.util.IConstants;
import com.vladium.util.IProperties;
import com.vladium.util.Property;
import com.vladium.util.SoftValueMap;
import com.vladium.util.Strings;
import com.vladium.util.exception.Exceptions;
import com.vladium.util.exit.ExitHookManager;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.vladium.emma.rt:
//            RT, ClassPathProcessorST, InstrClassLoadHook, InstrClassLoader, 
//            RTSettings

public final class AppRunner extends Processor
    implements IAppErrorCodes
{
    private static final class AppRunnerExitHook
        implements Runnable
    {

        private SourcePathCache m_cache;
        private ICoverageData m_cdata;
        private Throwable m_dataDumpFailure;
        private boolean m_done;
        private final boolean m_dumpRawData;
        private IReportGenerator m_generators[];
        private final Logger m_log;
        private IMetaData m_mdata;
        private IProperties m_properties;
        private List m_reportFailures;
        private final File m_sdataOutFile;
        private final boolean m_sdataOutMerge;

        Throwable getDataDumpFailure()
        {
            this;
            JVM INSTR monitorenter ;
            Throwable throwable = m_dataDumpFailure;
            this;
            JVM INSTR monitorexit ;
            return throwable;
            Exception exception;
            exception;
            throw exception;
        }

        List getReportFailures()
        {
            this;
            JVM INSTR monitorenter ;
            List list = m_reportFailures;
            this;
            JVM INSTR monitorexit ;
            return list;
            Exception exception;
            exception;
            throw exception;
        }

        public void run()
        {
            this;
            JVM INSTR monitorenter ;
            if (m_done) goto _L2; else goto _L1
_L1:
            IMetaData imetadata;
            ICoverageData icoveragedata;
            imetadata = m_mdata.shallowCopy();
            m_mdata = null;
            icoveragedata = m_cdata.shallowCopy();
            m_cdata = null;
            if (!imetadata.isEmpty()) goto _L4; else goto _L3
_L3:
            m_log.warning("no metadata collected at runtime [no reports generated]");
            m_generators = null;
            m_mdata = null;
            m_cdata = null;
            m_properties = null;
            m_cache = null;
            m_done = true;
_L14:
            this;
            JVM INSTR monitorexit ;
            return;
_L4:
            Object obj;
            if (icoveragedata.isEmpty())
            {
                m_log.warning("no coverage data collected at runtime [all reports will be empty]");
            }
            obj = new SessionData(imetadata, icoveragedata);
            if (!m_dumpRawData) goto _L6; else goto _L5
_L5:
            Object obj1 = m_sdataOutFile;
            if (obj1 == null) goto _L6; else goto _L7
_L7:
            boolean flag = m_log.atINFO();
            if (!flag) goto _L9; else goto _L8
_L8:
            long l = System.currentTimeMillis();
_L12:
            DataFactory.persist(((com.vladium.emma.data.ISessionData) (obj)), m_sdataOutFile, m_sdataOutMerge);
            if (!flag) goto _L6; else goto _L10
_L10:
            StringBuilder stringbuilder;
            long l1;
            l1 = System.currentTimeMillis();
            obj1 = m_log;
            stringbuilder = (new StringBuilder()).append("raw session data ");
            int i;
            if (m_sdataOutMerge)
            {
                obj = "merged into";
            } else
            {
                obj = "written to";
            }
            ((Logger) (obj1)).info(stringbuilder.append(((String) (obj))).append(" [").append(m_sdataOutFile.getAbsolutePath()).append("] {in ").append(l1 - l).append(" ms}").toString());
_L6:
            i = 0;
_L11:
            if (i >= m_generators.length)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = m_generators[i];
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_309;
            }
            ((IReportGenerator) (obj)).process(imetadata, icoveragedata, m_cache, m_properties);
            Exception exception;
            Throwable throwable3;
            try
            {
                ((IReportGenerator) (obj)).cleanup();
            }
            catch (Throwable throwable) { }
            m_generators[i] = null;
_L13:
            i++;
            if (true) goto _L11; else goto _L2
_L9:
            l = 0L;
              goto _L12
            obj;
            m_dataDumpFailure = ((Throwable) (obj));
              goto _L6
            obj;
            m_generators = null;
            m_mdata = null;
            m_cdata = null;
            m_properties = null;
            m_cache = null;
            m_done = true;
            throw obj;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
            throwable3;
            if (m_reportFailures == null)
            {
                m_reportFailures = new ArrayList();
            }
            m_reportFailures.add(throwable3);
            try
            {
                ((IReportGenerator) (obj)).cleanup();
            }
            catch (Throwable throwable1) { }
            m_generators[i] = null;
              goto _L13
            exception;
            try
            {
                ((IReportGenerator) (obj)).cleanup();
            }
            catch (Throwable throwable2) { }
            m_generators[i] = null;
            throw exception;
_L2:
            m_generators = null;
            m_mdata = null;
            m_cdata = null;
            m_properties = null;
            m_cache = null;
            m_done = true;
              goto _L14
        }

        AppRunnerExitHook(Logger logger, boolean flag, File file, boolean flag1, IMetaData imetadata, ICoverageData icoveragedata, IReportGenerator aireportgenerator[], 
                SourcePathCache sourcepathcache, IProperties iproperties)
        {
            if (logger == null)
            {
                throw new IllegalArgumentException("null input: log");
            }
            if (aireportgenerator == null || aireportgenerator.length == 0)
            {
                throw new IllegalArgumentException("null/empty input: generators");
            }
            if (imetadata == null)
            {
                throw new IllegalArgumentException("null input: mdata");
            }
            if (icoveragedata == null)
            {
                throw new IllegalArgumentException("null input: cdata");
            }
            if (iproperties == null)
            {
                throw new IllegalArgumentException("null input: properties");
            } else
            {
                m_log = logger;
                m_dumpRawData = flag;
                m_sdataOutFile = file;
                m_sdataOutMerge = flag1;
         