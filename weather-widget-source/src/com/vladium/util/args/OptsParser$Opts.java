// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util.args;

import java.io.CharArrayWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.vladium.util.args:
//            OptsParser

static final class 
    implements s
{

    private static final int DEFAULT_ERROR_WIDTH = 80;
    private static final  EMPTY_OPT_ARRAY[] = new [0];
    private List m_errors;
    private String m_freeArgs[];
    private final Map m_nameMap = new HashMap();
    private final List m_opts = new ArrayList();
    private final Map m_patternMap = new HashMap();
    private int m_usageRequestLevel;

    void addError(String s)
    {
        if (s != null)
        {
            if (m_errors == null)
            {
                m_errors = new ArrayList();
            }
            m_errors.add(s);
        }
    }

    void addOpt(f f, f f1, String s)
    {
        if (f == null)
        {
            throw new IllegalArgumentException("null input: opt");
        }
        if (f1 == null)
        {
            throw new IllegalArgumentException("null input: optdef");
        }
        if (s == null)
        {
            throw new IllegalArgumentException("null input: occuranceName");
        }
        m_opts.add(f);
        String as[] = f1.getNames();
        int i;
        if (f.etPatternPrefix() != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            s = s.substring(f.etPatternPrefix().length());
            for (i = 0; i < as.length; i++)
            {
                m_nameMap.put(as[i].concat(s), f);
            }

            f1 = f1.getCanonicalName();
            s = (List)m_patternMap.get(f1);
            f1 = s;
            if (s == null)
            {
                s = new ArrayList();
                int j = 0;
                do
                {
                    f1 = s;
                    if (j >= as.length)
                    {
                        break;
                    }
                    m_patternMap.put(as[j], s);
                    j++;
                } while (true);
            }
            f1.add(f);
        } else
        {
            int k = 0;
            while (k < as.length) 
            {
                m_nameMap.put(as[k], f);
                k++;
            }
        }
    }

    public void error(PrintWriter printwriter, int i)
    {
        if (hasErrors())
        {
            for (Iterator iterator = m_errors.iterator(); iterator.hasNext(); printwriter.println(iterator.next())) { }
        }
    }

    String errorsToString()
    {
        if (!hasErrors())
        {
            return "<no errors>";
        } else
        {
            CharArrayWriter chararraywriter = new CharArrayWriter();
            PrintWriter printwriter = new PrintWriter(chararraywriter);
            error(printwriter, 80);
            printwriter.flush();
            return chararraywriter.toString();
        }
    }

    public String[] getFreeArgs()
    {
        if (hasErrors())
        {
            throw new IllegalStateException(errorsToString());
        } else
        {
            return m_freeArgs;
        }
    }

    m_freeArgs getOpt(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null input: occuranceName");
        } else
        {
            return (it>)m_nameMap.get(s);
        }
    }

    public [] getOpts()
    {
        if (hasErrors())
        {
            return null;
        }
        if (m_opts.isEmpty())
        {
            return EMPTY_OPT_ARRAY;
        } else
        {
             a[] = new [m_opts.size()];
            m_opts.toArray(a);
            return a;
        }
    }

    public [] getOpts(String s)
    {
        if (hasErrors())
        {
            return null;
        }
        s = (List)m_patternMap.get(s);
        if (s == null || s.isEmpty())
        {
            return EMPTY_OPT_ARRAY;
        } else
        {
             a[] = new [s.size()];
            s.toArray(a);
            return a;
        }
    }

    public boolean hasArg(String s)
    {
        if (hasErrors())
        {
            throw new IllegalStateException(errorsToString());
        } else
        {
            return m_nameMap.containsKey(s);
        }
    }

    boolean hasErrors()
    {
        return m_errors != null && !m_errors.isEmpty();
    }

    void setFreeArgs(String as[], int i)
    {
        if (as == null)
        {
            throw new IllegalArgumentException("null input: args");
        }
        if (i < 0 || i > as.length)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid start index: ").append(i).toString());
        } else
        {
            m_freeArgs = new String[as.length - i];
            System.arraycopy(as, i, m_freeArgs, 0, m_freeArgs.length);
            return;
        }
    }

    void setUsageRequested(int i)
    {
        m_usageRequestLevel = i;
    }

    public int usageRequestLevel()
    {
        return m_usageRequestLevel;
    }


    ()
    {
    }
}
