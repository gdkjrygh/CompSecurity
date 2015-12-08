// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xmlpull.v1;

import java.io.PrintStream;

// Referenced classes of package org.xmlpull.v1:
//            XmlPullParser

public class XmlPullParserException extends Exception
{

    protected int column;
    protected Throwable detail;
    protected int row;

    public XmlPullParserException(String s)
    {
        super(s);
        row = -1;
        column = -1;
    }

    public XmlPullParserException(String s, XmlPullParser xmlpullparser, Throwable throwable)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (s == null)
        {
            s = "";
        } else
        {
            s = (new StringBuilder()).append(s).append(" ").toString();
        }
        stringbuilder = stringbuilder.append(s);
        if (xmlpullparser == null)
        {
            s = "";
        } else
        {
            s = (new StringBuilder()).append("(position:").append(xmlpullparser.getPositionDescription()).append(") ").toString();
        }
        stringbuilder = stringbuilder.append(s);
        if (throwable == null)
        {
            s = "";
        } else
        {
            s = (new StringBuilder()).append("caused by: ").append(throwable).toString();
        }
        super(stringbuilder.append(s).toString());
        row = -1;
        column = -1;
        if (xmlpullparser != null)
        {
            row = xmlpullparser.getLineNumber();
            column = xmlpullparser.getColumnNumber();
        }
        detail = throwable;
    }

    public int getColumnNumber()
    {
        return column;
    }

    public Throwable getDetail()
    {
        return detail;
    }

    public int getLineNumber()
    {
        return row;
    }

    public void printStackTrace()
    {
        if (detail == null)
        {
            super.printStackTrace();
            return;
        }
        synchronized (System.err)
        {
            System.err.println((new StringBuilder()).append(super.getMessage()).append("; nested exception is:").toString());
            detail.printStackTrace();
        }
        return;
        exception;
        printstream;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
