// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.data;

import com.vladium.emma.Command;
import com.vladium.emma.EMMARuntimeException;
import com.vladium.util.ClassLoaderResolver;
import com.vladium.util.args.IOptsParser;
import java.io.IOException;

// Referenced classes of package com.vladium.emma.data:
//            MergeProcessor

public final class mergeCommand extends Command
{

    private String m_datapath[];
    private String m_outFileName;

    public mergeCommand(String s, String as[])
    {
        super(s, as);
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
        Object obj1;
        int i;
        obj1 = getOptParser(((ClassLoader) (obj)));
        obj = ((IOptsParser) (obj1)).parse(m_args);
        i = ((com.vladium.util.args.IOptsParser.IOpts) (obj)).usageRequestLevel();
        if (i <= 0) goto _L2; else goto _L1
_L1:
        usageexit(((IOptsParser) (obj1)), i, null);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        obj = getClass().getClassLoader();
          goto _L3
_L2:
        com.vladium.util.args.IOptsParser.IOpt aiopt[] = ((com.vladium.util.args.IOptsParser.IOpts) (obj)).getOpts();
        if (aiopt != null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        ((com.vladium.util.args.IOptsParser.IOpts) (obj)).error(m_out, 80);
        usageexit(((IOptsParser) (obj1)), 1, null);
          goto _L4
        obj;
        exit(true, ((EMMARuntimeException) (obj)).getMessage(), ((Throwable) (obj)), 2);
          goto _L4
        obj;
        throw obj;
        i = 0;
_L8:
        if (i >= aiopt.length) goto _L6; else goto _L5
_L5:
        obj1 = aiopt[i];
        String s;
        s = ((com.vladium.util.args.IOptsParser.IOpt) (obj1)).getCanonicalName();
        if (processOpt(((com.vladium.util.args.IOptsParser.IOpt) (obj1))))
        {
            break MISSING_BLOCK_LABEL_277;
        }
        if ("in".equals(s))
        {
            m_datapath = getListOptValue(((com.vladium.util.args.IOptsParser.IOpt) (obj1)), PATH_DELIMITERS, true);
            break MISSING_BLOCK_LABEL_277;
        }
        if ("out".equals(s))
        {
            m_outFileName = ((com.vladium.util.args.IOptsParser.IOpt) (obj1)).getFirstValue();
        }
        break MISSING_BLOCK_LABEL_277;
        obj;
        throw new EMMARuntimeException("ARGS_IO_FAILURE", ((Throwable) (obj)));
        obj;
        exit(true, "unexpected failure: ", ((Throwable) (obj)), 2);
          goto _L4
_L6:
        if (!processFilePropertyOverrides()) goto _L4; else goto _L7
_L7:
        processCmdPropertyOverrides(((com.vladium.util.args.IOptsParser.IOpts) (obj)));
        MergeProcessor mergeprocessor = MergeProcessor.create();
        mergeprocessor.setAppName("EMMA");
        mergeprocessor.setDataPath(m_datapath);
        mergeprocessor.setSessionOutFile(m_outFileName);
        mergeprocessor.setPropertyOverrides(m_propertyOverrides);
        mergeprocessor.run();
        exit(false, null, null, 0);
          goto _L4
        i++;
          goto _L8
    }

    protected String usageArgsMsg()
    {
        return "[options]";
    }
}
