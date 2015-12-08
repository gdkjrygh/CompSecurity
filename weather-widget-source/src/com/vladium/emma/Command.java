// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma;

import com.vladium.emma.data.mergeCommand;
import com.vladium.emma.instr.instrCommand;
import com.vladium.emma.report.reportCommand;
import com.vladium.util.IConstants;
import com.vladium.util.Property;
import com.vladium.util.Strings;
import com.vladium.util.XProperties;
import com.vladium.util.args.IOptsParser;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

// Referenced classes of package com.vladium.emma:
//            runCommand, EMMARuntimeException

public abstract class Command
{

    protected static final String COMMA_DELIMITERS = ", \t\r\n";
    protected static final String PATH_DELIMITERS;
    protected static final int RC_OK = 0;
    protected static final int RC_UNEXPECTED = 2;
    protected static final int RC_USAGE = 1;
    protected static final int STDOUT_WIDTH = 80;
    protected static final String USAGE_OPT_NAMES[] = {
        "h", "help"
    };
    protected final String m_args[];
    protected boolean m_exit;
    protected PrintWriter m_out;
    protected File m_propertyFile;
    protected Properties m_propertyOverrides;
    protected final String m_usageToolName;

    protected Command(String s, String as[])
    {
        m_usageToolName = s;
        if (as != null)
        {
            s = (String[])(String[])as.clone();
        } else
        {
            s = IConstants.EMPTY_STRING_ARRAY;
        }
        m_args = s;
    }

    public static Command create(String s, String s1, String as[])
    {
        if ("run".equals(s))
        {
            s = new runCommand(s1, as);
        } else
        if ("instr".equals(s))
        {
            s = new instrCommand(s1, as);
        } else
        if ("report".equals(s))
        {
            s = new reportCommand(s1, as);
        } else
        if ("merge".equals(s))
        {
            s = new mergeCommand(s1, as);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown command: [").append(s).append("]").toString());
        }
        s.initialize();
        return s;
    }

    protected static String[] getListOptValue(com.vladium.util.args.IOptsParser.IOpt iopt, String s, boolean flag)
        throws IOException
    {
        return Strings.mergeAT(iopt.getValues(), s, flag);
    }

    protected static boolean getOptionalBooleanOptValue(com.vladium.util.args.IOptsParser.IOpt iopt)
    {
        if (iopt.getValueCount() == 0)
        {
            return true;
        } else
        {
            return Property.toBoolean(iopt.getFirstValue().toLowerCase());
        }
    }

    private void setPropertyOverride(String s, String s1)
    {
        Properties properties = m_propertyOverrides;
        Object obj = properties;
        if (properties == null)
        {
            obj = new XProperties();
            m_propertyOverrides = ((Properties) (obj));
        }
        ((Properties) (obj)).setProperty(s, s1);
    }

    protected static String toolNameToCommandName(String s)
    {
        int i = s.lastIndexOf('.');
        String s1 = s;
        if (i > 0)
        {
            s1 = s.substring(i + 1);
        }
        return s1;
    }

    protected static String usageMsgPrefix(String s)
    {
        return toolNameToCommandName(s).concat(" usage: ");
    }

    protected static String usageResName(String s)
    {
        return s.replace('.', '/').concat("_usage.res");
    }

    protected final void exit(boolean flag, String s, Throwable throwable, int i)
        throws EMMARuntimeException
    {
        if (flag)
        {
            m_out.println("[EMMA v0.0, build 0 (unsupported private build)]");
        }
        if (s != null)
        {
            m_out.print((new StringBuilder()).append(toolNameToCommandName(m_usageToolName)).append(": ").toString());
            m_out.println(s);
        }
        if (i == 0) goto _L2; else goto _L1
_L1:
        if (!m_exit) goto _L4; else goto _L3
_L3:
        if (throwable != null)
        {
            throwable.printStackTrace(m_out);
        }
        System.exit(i);
_L6:
        return;
_L4:
        if (throwable instanceof EMMARuntimeException)
        {
            throw (EMMARuntimeException)throwable;
        }
        if (throwable != null)
        {
            if (s != null)
            {
                s = new EMMARuntimeException(s, throwable);
            } else
            {
                s = new EMMARuntimeException("unexpected failure: ", throwable);
            }
            throw s;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (m_exit)
        {
            System.exit(0);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final IOptsParser getOptParser(ClassLoader classloader)
    {
        return com.vladium.util.args.IOptsParser.Factory.create(usageResName(getToolName()), classloader, usageMsgPrefix(m_usageToolName), USAGE_OPT_NAMES);
    }

    protected final String getToolName()
    {
        String s = getClass().getName();
        return s.substring(0, s.length() - 7);
    }

    protected void initialize()
    {
        m_exit = false;
        if (m_out != null)
        {
            try
            {
                m_out.flush();
            }
            catch (Throwable throwable) { }
        }
        m_out = new PrintWriter(System.out, true);
    }

    protected final void processCmdPropertyOverrides(com.vladium.util.args.IOptsParser.IOpts iopts)
    {
        iopts = iopts.getOpts("D");
        if (iopts != null && iopts.length != 0)
        {
            XProperties xproperties = new XProperties();
            for (int i = 0; i < iopts.length; i++)
            {
                com.vladium.util.args.IOptsParser.IOpt iopt = iopts[i];
                xproperties.setProperty(iopt.getName().substring(iopt.getPatternPrefix().length()), iopt.getFirstValue());
            }

            m_propertyOverrides = Property.combine(xproperties, m_propertyOverrides);
        }
    }

    protected final boolean processFilePropertyOverrides()
    {
        if (m_propertyFile != null)
        {
            Properties properties;
            try
            {
                properties = Property.getPropertiesFromFile(m_propertyFile);
            }
            catch (IOException ioexception)
            {
                exit(true, (new StringBuilder()).append("property override file [").append(m_propertyFile.getAbsolutePath()).append("] could not be read").toString(), ioexception, 1);
                return false;
            }
            m_propertyOverrides = Property.combine(m_propertyOverrides, properties);
        }
        return true;
    }

    protected final boolean processOpt(com.vladium.util.args.IOptsParser.IOpt iopt)
    {
        String s = iopt.getCanonicalName();
        if ("exit".equals(s))
        {
            m_exit = getOptionalBooleanOptValue(iopt);
            return true;
        }
        if ("p".equals(s))
        {
            m_propertyFile = new File(iopt.getFirstValue());
            return true;
        }
        if ("verbose".equals(s))
        {
            setPropertyOverride("verbosity.level", "verbose");
            return true;
        }
        if ("quiet".equals(s))
        {
            setPropertyOverride("verbosity.level", "warning");
            return true;
        }
        if ("silent".equals(s))
        {
            setPropertyOverride("verbosity.level", "severe");
            return true;
        }
        if ("debug".equals(s))
        {
            if (iopt.getValueCount() == 0)
            {
                setPropertyOverride("verbosity.level", "trace1");
                return true;
            } else
            {
                setPropertyOverride("verbosity.level", iopt.getFirstValue());
                return true;
            }
        }
        if ("debugcls".equals(s))
        {
            setPropertyOverride("verbosity.filter", Strings.toListForm(Strings.merge(iopt.getValues(), ", \t\r\n", true), ','));
            return true;
        } else
        {
            return false;
        }
    }

    public abstract void run();

    protected abstract String usageArgsMsg();

    protected final void usageexit(IOptsParser ioptsparser, int i, String s)
    {
        if (s != null)
        {
            m_out.print(usageMsgPrefix(m_usageToolName));
            m_out.println(s);
        }
        if (ioptsparser != null)
        {
            m_out.println();
            m_out.print(usageMsgPrefix(m_usageToolName));
            m_out.println((new StringBuilder()).append(toolNameToCommandName(m_usageToolName)).append(" ").append(usageArgsMsg()).append(",").toString());
            m_out.println("  where options include:");
            m_out.println();
            ioptsparser.usage(m_out, i, 80);
        }
        m_out.println();
        exit(true, null, null, 1);
    }

    static 
    {
        PATH_DELIMITERS = ",".concat(File.pathSeparator);
    }
}
