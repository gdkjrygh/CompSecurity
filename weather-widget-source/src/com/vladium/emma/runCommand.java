// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma;

import com.vladium.emma.rt.AppRunner;
import com.vladium.util.ClassLoaderResolver;
import com.vladium.util.Strings;
import com.vladium.util.args.IOptsParser;
import java.io.File;
import java.io.IOException;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

// Referenced classes of package com.vladium.emma:
//            Command, EMMARuntimeException

public final class runCommand extends Command
{

    private static final boolean DEFAULT_TO_SYSTEM_CLASSPATH = false;
    private String m_appArgs[];
    private String m_classpath[];
    private boolean m_dumpRawData;
    private String m_ixpath[];
    private boolean m_jarMode;
    private Boolean m_outDataMerge;
    private String m_outFileName;
    private String m_reportTypes[];
    private boolean m_scanCoveragePath;
    private String m_srcpath[];

    protected runCommand(String s, String as[])
    {
        super(s, as);
    }

    private static String openJarFile(File file)
        throws IOException
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        JarFile jarfile = new JarFile(file, false);
        file = jarfile.getManifest();
label0:
        {
            {
                if (file != null)
                {
                    break label0;
                }
                file = ((File) (obj));
                if (jarfile != null)
                {
                    try
                    {
                        jarfile.close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (File file)
                    {
                        return null;
                    }
                    file = ((File) (obj));
                }
            }
            return file;
        }
        file = file.getMainAttributes();
label1:
        {
            if (file != null)
            {
                break label1;
            }
            file = ((File) (obj));
            if (jarfile != null)
            {
                try
                {
                    jarfile.close();
                }
                // Misplaced declaration of an exception variable
                catch (File file)
                {
                    return null;
                }
                return null;
            } else
            {
                break MISSING_BLOCK_LABEL_35;
            }
        }
        obj = file.getValue(java.util.jar.Attributes.Name.MAIN_CLASS);
        file = ((File) (obj));
        if (jarfile != null)
        {
            try
            {
                jarfile.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return ((String) (obj));
            }
            return ((String) (obj));
        } else
        {
            break MISSING_BLOCK_LABEL_35;
        }
        file;
        obj = obj1;
_L2:
        if (obj != null)
        {
            try
            {
                ((JarFile) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw file;
        file;
        obj = jarfile;
        if (true) goto _L2; else goto _L1
_L1:
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
        Object obj2;
        int i;
        ioptsparser = getOptParser(((ClassLoader) (obj)));
        obj2 = ioptsparser.parse(m_args);
        i = ((com.vladium.util.args.IOptsParser.IOpts) (obj2)).usageRequestLevel();
        if (i <= 0) goto _L2; else goto _L1
_L1:
        usageexit(ioptsparser, i, null);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        obj = getClass().getClassLoader();
          goto _L3
_L2:
        com.vladium.util.args.IOptsParser.IOpt aiopt[] = ((com.vladium.util.args.IOptsParser.IOpts) (obj2)).getOpts();
        if (aiopt != null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        ((com.vladium.util.args.IOptsParser.IOpts) (obj2)).error(m_out, 80);
        usageexit(ioptsparser, 1, null);
          goto _L4
        obj;
        exit(true, ((EMMARuntimeException) (obj)).getMessage(), ((Throwable) (obj)), 2);
          goto _L4
        obj;
        throw obj;
        i = 0;
_L16:
        if (i >= aiopt.length) goto _L6; else goto _L5
_L5:
        Object obj1 = aiopt[i];
        String s1;
        s1 = ((com.vladium.util.args.IOptsParser.IOpt) (obj1)).getCanonicalName();
        if (processOpt(((com.vladium.util.args.IOptsParser.IOpt) (obj1))))
        {
            break MISSING_BLOCK_LABEL_770;
        }
        if ("cp".equals(s1))
        {
            m_classpath = getListOptValue(((com.vladium.util.args.IOptsParser.IOpt) (obj1)), PATH_DELIMITERS, true);
            break MISSING_BLOCK_LABEL_770;
        }
        if ("jar".equals(s1))
        {
            m_jarMode = true;
            break MISSING_BLOCK_LABEL_770;
        }
        break MISSING_BLOCK_LABEL_219;
        obj;
        throw new EMMARuntimeException("ARGS_IO_FAILURE", ((Throwable) (obj)));
        obj;
        exit(true, "unexpected failure: ", ((Throwable) (obj)), 2);
          goto _L4
        if ("f".equals(s1))
        {
            m_scanCoveragePath = getOptionalBooleanOptValue(((com.vladium.util.args.IOptsParser.IOpt) (obj1)));
            break MISSING_BLOCK_LABEL_770;
        }
        if ("sp".equals(s1))
        {
            m_srcpath = getListOptValue(((com.vladium.util.args.IOptsParser.IOpt) (obj1)), PATH_DELIMITERS, true);
            break MISSING_BLOCK_LABEL_770;
        }
        if ("raw".equals(s1))
        {
            m_dumpRawData = getOptionalBooleanOptValue(((com.vladium.util.args.IOptsParser.IOpt) (obj1)));
            break MISSING_BLOCK_LABEL_770;
        }
        if ("out".equals(s1))
        {
            m_outFileName = ((com.vladium.util.args.IOptsParser.IOpt) (obj1)).getFirstValue();
            break MISSING_BLOCK_LABEL_770;
        }
        if (!"merge".equals(s1)) goto _L8; else goto _L7
_L7:
        if (!getOptionalBooleanOptValue(((com.vladium.util.args.IOptsParser.IOpt) (obj1)))) goto _L10; else goto _L9
_L9:
        obj1 = Boolean.TRUE;
_L11:
        m_outDataMerge = ((Boolean) (obj1));
        break MISSING_BLOCK_LABEL_770;
_L10:
        obj1 = Boolean.FALSE;
        if (true) goto _L11; else goto _L8
_L8:
        if ("r".equals(s1))
        {
            m_reportTypes = Strings.merge(((com.vladium.util.args.IOptsParser.IOpt) (obj1)).getValues(), ", \t\r\n", true);
            break MISSING_BLOCK_LABEL_770;
        }
        if ("ix".equals(s1))
        {
            m_ixpath = getListOptValue(((com.vladium.util.args.IOptsParser.IOpt) (obj1)), ", \t\r\n", true);
        }
        break MISSING_BLOCK_LABEL_770;
_L6:
        if (!processFilePropertyOverrides()) goto _L4; else goto _L12
_L12:
        processCmdPropertyOverrides(((com.vladium.util.args.IOptsParser.IOpts) (obj2)));
        String as[] = ((com.vladium.util.args.IOptsParser.IOpts) (obj2)).getFreeArgs();
        if (!m_jarMode) goto _L14; else goto _L13
_L13:
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_435;
        }
        if (as.length != 0)
        {
            break MISSING_BLOCK_LABEL_446;
        }
        usageexit(ioptsparser, 1, "missing jar file name");
          goto _L4
        obj2 = new File(as[0]);
        String s = openJarFile(((File) (obj2)));
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_520;
        }
        exit(true, (new StringBuilder()).append("failed to load Main-Class manifest attribute from [").append(((File) (obj2)).getAbsolutePath()).append("]").toString(), null, 2);
          goto _L4
        obj;
        throw new EMMARuntimeException("ARGS_IO_FAILURE", ((Throwable) (obj)));
        m_appArgs = new String[as.length];
        System.arraycopy(as, 1, m_appArgs, 1, as.length - 1);
        m_appArgs[0] = s;
        m_classpath = (new String[] {
            ((File) (obj2)).getPath()
        });
_L15:
        if (m_classpath != null)
        {
            break MISSING_BLOCK_LABEL_615;
        }
        usageexit(ioptsparser, 1, "either '-cp' or '-jar' option is required");
          goto _L4
_L14:
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_595;
        }
        if (as.length != 0)
        {
            break MISSING_BLOCK_LABEL_607;
        }
        usageexit(ioptsparser, 1, "missing application class name");
          goto _L4
        m_appArgs = as;
          goto _L15
        if (m_reportTypes == null)
        {
            m_reportTypes = (new String[] {
                "txt"
            });
        }
        String as1[] = new String[m_appArgs.length - 1];
        System.arraycopy(m_appArgs, 1, as1, 0, as1.length);
        obj = AppRunner.create(((ClassLoader) (obj)));
        ((AppRunner) (obj)).setAppName("EMMA");
        ((AppRunner) (obj)).setAppClass(m_appArgs[0], as1);
        ((AppRunner) (obj)).setCoveragePath(m_classpath, true);
        ((AppRunner) (obj)).setScanCoveragePath(m_scanCoveragePath);
        ((AppRunner) (obj)).setSourcePath(m_srcpath);
        ((AppRunner) (obj)).setInclExclFilter(m_ixpath);
        ((AppRunner) (obj)).setDumpSessionData(m_dumpRawData);
        ((AppRunner) (obj)).setSessionOutFile(m_outFileName);
        ((AppRunner) (obj)).setSessionOutMerge(m_outDataMerge);
        ((AppRunner) (obj)).setReportTypes(m_reportTypes);
        ((AppRunner) (obj)).setPropertyOverrides(m_propertyOverrides);
        ((AppRunner) (obj)).run();
        exit(false, null, null, 0);
          goto _L4
        i++;
          goto _L16
    }

    protected String usageArgsMsg()
    {
        return "[options] class [args...] | -jar [options] jarfile [args...]";
    }
}
