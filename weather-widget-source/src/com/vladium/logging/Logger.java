// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.logging;

import com.vladium.util.ClassLoaderResolver;
import com.vladium.util.Property;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;

// Referenced classes of package com.vladium.logging:
//            ILogLevels

public final class Logger
    implements ILogLevels
{
    private static final class ThreadLocalStack extends InheritableThreadLocal
    {

        protected Object initialValue()
        {
            return new LinkedList();
        }

        private ThreadLocalStack()
        {
        }

    }


    private static final String COMMA_DELIMITERS = ", \t\r\n";
    private static final boolean FLUSH_LOG = true;
    private static final String PREFIX_TO_STRIP = "com.vladium.";
    private static final int PREFIX_TO_STRIP_LENGTH = "com.vladium.".length();
    private static final Logger STATIC_LOGGER;
    private static final ThreadLocalStack THREAD_LOCAL_STACK = new ThreadLocalStack();
    private final Set m_classMask;
    private final int m_level;
    private final PrintWriter m_out;
    private final String m_prefix;

    private Logger(int i, PrintWriter printwriter, String s, Set set)
    {
        m_level = i;
        m_out = printwriter;
        m_prefix = s;
        m_classMask = set;
    }

    private void _log(int i, String s, String s1, Throwable throwable)
    {
label0:
        {
            if (i > m_level || i < 0)
            {
                break label0;
            }
            Object obj1 = ClassLoaderResolver.getCallerClass(2);
            Object obj;
            StringBuffer stringbuffer;
            if (m_prefix != null)
            {
                obj = (new StringBuilder()).append(m_prefix).append(": ").toString();
            } else
            {
                obj = "";
            }
            stringbuffer = new StringBuffer(((String) (obj)));
            if (obj1 != null || s != null)
            {
                stringbuffer.append("[");
                if (obj1 != null)
                {
                    obj1 = ((Class) (obj1)).getName();
                    obj = obj1;
                    if (((String) (obj1)).startsWith("com.vladium."))
                    {
                        obj = ((String) (obj1)).substring(PREFIX_TO_STRIP_LENGTH);
                    }
                    obj1 = obj;
                    i = ((String) (obj)).indexOf('$');
                    if (i > 0)
                    {
                        obj1 = ((String) (obj)).substring(0, i);
                    }
                    if (m_classMask != null && !m_classMask.contains(obj1))
                    {
                        break label0;
                    }
                    stringbuffer.append(((String) (obj)));
                }
                if (s != null)
                {
                    stringbuffer.append("::");
                    stringbuffer.append(s);
                }
                stringbuffer.append("] ");
            }
            s = m_out;
            if (s1 != null)
            {
                stringbuffer.append(s1);
            }
            if (throwable != null)
            {
                s1 = new StringWriter();
                obj = new PrintWriter(s1);
                throwable.printStackTrace(((PrintWriter) (obj)));
                ((PrintWriter) (obj)).flush();
                stringbuffer.append(s1.toString());
            }
            s.println(stringbuffer);
            s.flush();
        }
    }

    private void _log(int i, String s, String s1, boolean flag)
    {
label0:
        {
            if (i > m_level || i < 0)
            {
                break label0;
            }
            Object obj;
            String s2;
            StringBuffer stringbuffer;
            if (flag)
            {
                obj = ClassLoaderResolver.getCallerClass(2);
            } else
            {
                obj = null;
            }
            if (m_prefix != null)
            {
                s2 = (new StringBuilder()).append(m_prefix).append(": ").toString();
            } else
            {
                s2 = "";
            }
            stringbuffer = new StringBuffer(s2);
            if (obj != null || s != null)
            {
                stringbuffer.append("[");
                if (obj != null)
                {
                    s2 = ((Class) (obj)).getName();
                    obj = s2;
                    if (s2.startsWith("com.vladium."))
                    {
                        obj = s2.substring(PREFIX_TO_STRIP_LENGTH);
                    }
                    s2 = ((String) (obj));
                    i = ((String) (obj)).indexOf('$');
                    if (i > 0)
                    {
                        s2 = ((String) (obj)).substring(0, i);
                    }
                    if (m_classMask != null && !m_classMask.contains(s2))
                    {
                        break label0;
                    }
                    stringbuffer.append(((String) (obj)));
                }
                if (s != null)
                {
                    stringbuffer.append("::");
                    stringbuffer.append(s);
                }
                stringbuffer.append("] ");
            }
            s = m_out;
            if (s1 != null)
            {
                stringbuffer.append(s1);
            }
            s.println(stringbuffer);
            s.flush();
        }
    }

    private void cleanup()
    {
        m_out.flush();
    }

    public static Logger create(int i, PrintWriter printwriter, String s, Set set)
    {
        if (i < -1 || i > 7)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid log level: ").append(i).toString());
        }
        if (printwriter == null || printwriter.checkError())
        {
            throw new IllegalArgumentException("null or corrupt input: out");
        } else
        {
            return new Logger(i, printwriter, s, set);
        }
    }

    public static Logger create(int i, PrintWriter printwriter, String s, Set set, Logger logger)
    {
        if (logger == null)
        {
            return create(i, printwriter, s, set);
        }
        if (i < -1)
        {
            i = logger.m_level;
        }
        if (printwriter == null || printwriter.checkError())
        {
            printwriter = logger.m_out;
        }
        if (set == null)
        {
            set = logger.m_classMask;
        }
        return new Logger(i, printwriter, s, set);
    }

    public static Logger getLogger()
    {
        LinkedList linkedlist = (LinkedList)THREAD_LOCAL_STACK.get();
        if (linkedlist.isEmpty())
        {
            return STATIC_LOGGER;
        } else
        {
            return (Logger)linkedlist.getLast();
        }
    }

    public static void pop(Logger logger)
    {
        LinkedList linkedlist;
        Logger logger1;
        linkedlist = (LinkedList)THREAD_LOCAL_STACK.get();
        try
        {
            logger1 = (Logger)linkedlist.getLast();
        }
        // Misplaced declaration of an exception variable
        catch (Logger logger)
        {
            throw new IllegalStateException((new StringBuilder()).append("empty logger context stack on thread [").append(Thread.currentThread()).append("]: ").append(logger).toString());
        }
        if (logger1 == logger)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        throw new IllegalStateException((new StringBuilder()).append("invalid context being popped: ").append(logger).toString());
        linkedlist.removeLast();
        logger1.cleanup();
        return;
    }

    public static void push(Logger logger)
    {
        if (logger == null)
        {
            throw new IllegalArgumentException("null input: ctx");
        } else
        {
            ((LinkedList)THREAD_LOCAL_STACK.get()).addLast(logger);
            return;
        }
    }

    public static int stringToLevel(String s)
    {
        if (!"severe".equalsIgnoreCase(s) && !"silent".equalsIgnoreCase(s)) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        int i;
        if ("warning".equalsIgnoreCase(s) || "quiet".equalsIgnoreCase(s))
        {
            return 1;
        }
        if ("info".equalsIgnoreCase(s))
        {
            return 2;
        }
        if ("verbose".equalsIgnoreCase(s))
        {
            return 3;
        }
        if ("trace1".equalsIgnoreCase(s))
        {
            return 4;
        }
        if ("trace2".equalsIgnoreCase(s))
        {
            return 5;
        }
        if ("trace3".equalsIgnoreCase(s))
        {
            return 6;
        }
        if ("none".equalsIgnoreCase(s))
        {
            return -1;
        }
        if ("all".equalsIgnoreCase(s))
        {
            return 7;
        }
        i = 0x80000000;
        j = Integer.parseInt(s);
        i = j;
_L5:
        if (i < -1)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (i <= 7) goto _L4; else goto _L3
_L3:
        return 2;
        s;
          goto _L5
    }

    public final boolean atINFO()
    {
        return 2 <= m_level;
    }

    public final boolean atTRACE1()
    {
        return 4 <= m_level;
    }

    public final boolean atTRACE2()
    {
        return 5 <= m_level;
    }

    public final boolean atTRACE3()
    {
        return 6 <= m_level;
    }

    public final boolean atVERBOSE()
    {
        return 3 <= m_level;
    }

    public PrintWriter getWriter()
    {
        return m_out;
    }

    public final void info(String s)
    {
        _log(2, null, s, false);
    }

    public final boolean isLoggable(int i)
    {
        return i <= m_level;
    }

    public final void log(int i, String s, String s1, Throwable throwable)
    {
        _log(i, s, s1, throwable);
    }

    public final void log(int i, String s, String s1, boolean flag)
    {
        _log(i, s, s1, flag);
    }

    public final void log(int i, String s, Throwable throwable)
    {
        _log(i, null, s, throwable);
    }

    public final void log(int i, String s, boolean flag)
    {
        _log(i, null, s, flag);
    }

    public final void trace1(String s, String s1)
    {
        _log(4, s, s1, true);
    }

    public final void trace2(String s, String s1)
    {
        _log(5, s, s1, true);
    }

    public final void trace3(String s, String s1)
    {
        _log(6, s, s1, true);
    }

    public final void verbose(String s)
    {
        _log(3, null, s, false);
    }

    public final void warning(String s)
    {
        _log(1, null, s, false);
    }

    static 
    {
        Object obj = Property.getAppProperties("emma", com/vladium/logging/Logger.getClassLoader());
        int i = stringToLevel(((Properties) (obj)).getProperty("verbosity.level", "info"));
        Object obj2 = ((Properties) (obj)).getProperty("verbosity.filter");
        Object obj1 = null;
        obj = obj1;
        if (obj2 != null)
        {
            obj2 = new StringTokenizer(((String) (obj2)), ", \t\r\n");
            obj = obj1;
            if (((StringTokenizer) (obj2)).countTokens() > 0)
            {
                HashSet hashset = new HashSet(((StringTokenizer) (obj2)).countTokens());
                do
                {
                    obj = hashset;
                    if (!((StringTokenizer) (obj2)).hasMoreTokens())
                    {
                        break;
                    }
                    hashset.add(((StringTokenizer) (obj2)).nextToken());
                } while (true);
            }
        }
        STATIC_LOGGER = create(i, new PrintWriter(System.out, false), "EMMA", ((Set) (obj)));
    }
}
