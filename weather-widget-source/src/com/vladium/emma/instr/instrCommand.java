// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;

import com.vladium.emma.Command;
import com.vladium.emma.EMMARuntimeException;
import com.vladium.util.ClassLoaderResolver;
import com.vladium.util.args.IOptsParser;
import com.vladium.util.asserts.$assert;
import java.io.IOException;

// Referenced classes of package com.vladium.emma.instr:
//            InstrProcessor

public final class instrCommand extends Command
{

    private String m_instrpath[];
    private String m_ixpath[];
    private Boolean m_outDataMerge;
    private String m_outDirName;
    private String m_outFileName;
    private InstrProcessor.OutMode m_outMode;

    public instrCommand(String s, String as[])
    {
        super(s, as);
        m_outMode = InstrProcessor.OutMode.OUT_MODE_COPY;
    }

    protected void initialize()
    {
        super.initialize();
    }

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = ClassLoaderResolver.getClassLoader();
_L3:
        IOptsParser ioptsparser;
        com.vladium.util.args.IOptsParser.IOpts iopts;
        int i;
        ioptsparser = getOptParser(((ClassLoader) (obj)));
        iopts = ioptsparser.parse(m_args);
        i = iopts.usageRequestLevel();
        if (i <= 0) goto _L2; else goto _L1
_L1:
        usageexit(ioptsparser, i, null);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1;
        obj1 = getClass().getClassLoader();
          goto _L3
_L2:
        com.vladium.util.args.IOptsParser.IOpt aiopt[] = iopts.getOpts();
        if (aiopt != null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        iopts.error(m_out, 80);
        usageexit(ioptsparser, 1, null);
          goto _L4
        obj1;
        exit(true, ((EMMARuntimeException) (obj1)).getMessage(), ((Throwable) (obj1)), 2);
          goto _L4
        obj1;
        throw obj1;
        i = 0;
_L13:
        if (i >= aiopt.length) goto _L6; else goto _L5
_L5:
        obj1 = aiopt[i];
        Object obj2;
        obj2 = ((com.vladium.util.args.IOptsParser.IOpt) (obj1)).getCanonicalName();
        if (processOpt(((com.vladium.util.args.IOptsParser.IOpt) (obj1))))
        {
            break MISSING_BLOCK_LABEL_556;
        }
        if ("ip".equals(obj2))
        {
            m_instrpath = getListOptValue(((com.vladium.util.args.IOptsParser.IOpt) (obj1)), PATH_DELIMITERS, true);
            break MISSING_BLOCK_LABEL_556;
        }
        if ("d".equals(obj2))
        {
            m_outDirName = ((com.vladium.util.args.IOptsParser.IOpt) (obj1)).getFirstValue();
            break MISSING_BLOCK_LABEL_556;
        }
        break MISSING_BLOCK_LABEL_220;
        obj1;
        throw new EMMARuntimeException("ARGS_IO_FAILURE", ((Throwable) (obj1)));
        obj1;
        exit(true, "unexpected failure: ", ((Throwable) (obj1)), 2);
          goto _L4
        if ("out".equals(obj2))
        {
            m_outFileName = ((com.vladium.util.args.IOptsParser.IOpt) (obj1)).getFirstValue();
            break MISSING_BLOCK_LABEL_556;
        }
        if (!"merge".equals(obj2)) goto _L8; else goto _L7
_L7:
        if (!getOptionalBooleanOptValue(((com.vladium.util.args.IOptsParser.IOpt) (obj1)))) goto _L10; else goto _L9
_L9:
        obj1 = Boolean.TRUE;
_L11:
        m_outDataMerge = ((Boolean) (obj1));
        break MISSING_BLOCK_LABEL_556;
_L10:
        obj1 = Boolean.FALSE;
        if (true) goto _L11; else goto _L8
_L8:
        if ("ix".equals(obj2))
        {
            m_ixpath = getListOptValue(((com.vladium.util.args.IOptsParser.IOpt) (obj1)), ", \t\r\n", true);
            break MISSING_BLOCK_LABEL_556;
        }
        if (!"m".equals(obj2))
        {
            break MISSING_BLOCK_LABEL_556;
        }
        obj1 = ((com.vladium.util.args.IOptsParser.IOpt) (obj1)).getFirstValue();
        obj2 = InstrProcessor.OutMode.nameToMode(((String) (obj1)));
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_377;
        }
        usageexit(ioptsparser, 1, (new StringBuilder()).append("invalid '").append(aiopt[i].getName()).append("' option value: ").append(((String) (obj1))).toString());
          goto _L4
        m_outMode = ((InstrProcessor.OutMode) (obj2));
        break MISSING_BLOCK_LABEL_556;
_L6:
        if (!processFilePropertyOverrides()) goto _L4; else goto _L12
_L12:
        processCmdPropertyOverrides(iopts);
        if (m_outMode == InstrProcessor.OutMode.OUT_MODE_OVERWRITE || m_outDirName != null)
        {
            break MISSING_BLOCK_LABEL_451;
        }
        usageexit(ioptsparser, 1, (new StringBuilder()).append("output directory must be specified for '").append(m_outMode).append("' output mode").toString());
          goto _L4
        obj1 = InstrProcessor.create();
        ((InstrProcessor) (obj1)).setAppName("EMMA");
        ((InstrProcessor) (obj1)).setInstrPath(m_instrpath, true);
        ((InstrProcessor) (obj1)).setInclExclFilter(m_ixpath);
        boolean flag;
        if (m_outMode != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assert.ASSERT(flag, "m_outMode not set");
        ((InstrProcessor) (obj1)).setOutMode(m_outMode);
        ((InstrProcessor) (obj1)).setInstrOutDir(m_outDirName);
        ((InstrProcessor) (obj1)).setMetaOutFile(m_outFileName);
        ((InstrProcessor) (obj1)).setMetaOutMerge(m_outDataMerge);
        ((InstrProcessor) (obj1)).setPropertyOverrides(m_propertyOverrides);
        ((InstrProcessor) (obj1)).run();
        exit(false, null, null, 0);
          goto _L4
        i++;
          goto _L13
    }

    protected String usageArgsMsg()
    {
        return "[options]";
    }
}
