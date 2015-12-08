// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util.exception;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

// Referenced classes of package com.vladium.util.exception:
//            ICodedException, IThrowableWrapper, ExceptionCommon

public abstract class AbstractException extends Exception
    implements ICodedException, IThrowableWrapper
{

    private final transient Object m_arguments[];
    private final Throwable m_cause;
    private String m_message;

    public AbstractException()
    {
        m_cause = null;
        m_arguments = null;
    }

    public AbstractException(String s)
    {
        super(s);
        m_cause = null;
        m_arguments = null;
    }

    public AbstractException(String s, Throwable throwable)
    {
        super(s);
        m_cause = throwable;
        m_arguments = null;
    }

    public AbstractException(String s, Object aobj[])
    {
        Object obj = null;
        super(s);
        m_cause = null;
        if (aobj == null)
        {
            s = obj;
        } else
        {
            s = ((String) ((Object[])(Object[])((Object []) (aobj)).clone()));
        }
        m_arguments = s;
    }

    public AbstractException(String s, Object aobj[], Throwable throwable)
    {
        super(s);
        m_cause = throwable;
        if (aobj == null)
        {
            s = null;
        } else
        {
            s = ((String) ((Object[])(Object[])((Object []) (aobj)).clone()));
        }
        m_arguments = s;
    }

    public AbstractException(Throwable throwable)
    {
        m_cause = throwable;
        m_arguments = null;
    }

    public static void addExceptionResource(Class class1, String s)
    {
        ExceptionCommon.addExceptionResource(class1, s);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        getMessage();
        objectoutputstream.defaultWriteObject();
    }

    public void __printStackTrace(PrintStream printstream)
    {
        super.printStackTrace(printstream);
    }

    public void __printStackTrace(PrintWriter printwriter)
    {
        super.printStackTrace(printwriter);
    }

    public final Throwable getCause()
    {
        return m_cause;
    }

    public final String getErrorCode()
    {
        return super.getMessage();
    }

    public final String getLocalizedMessage()
    {
        return getMessage();
    }

    public final String getMessage()
    {
        if (m_message == null)
        {
            String s2 = super.getMessage();
            Class class1 = getClass();
            String s;
            String s1;
            if (m_arguments == null)
            {
                s = ExceptionCommon.getMessage(class1, s2);
            } else
            {
                s = ExceptionCommon.getMessage(class1, s2, m_arguments);
            }
            s1 = s;
            if (s == null)
            {
                s1 = class1.getName();
                if (s2 != null)
                {
                    s1 = (new StringBuilder()).append(s1).append(": ").append(s2).toString();
                }
            }
            m_message = s1;
        }
        return m_message;
    }

    public final void printStackTrace()
    {
        ExceptionCommon.printStackTrace(this, System.out);
    }

    public final void printStackTrace(PrintStream printstream)
    {
        ExceptionCommon.printStackTrace(this, printstream);
    }

    public final void printStackTrace(PrintWriter printwriter)
    {
        ExceptionCommon.printStackTrace(this, printwriter);
    }
}
