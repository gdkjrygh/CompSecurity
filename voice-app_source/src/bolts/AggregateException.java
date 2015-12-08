// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AggregateException extends Exception
{

    private static final String DEFAULT_MESSAGE = "There were multiple errors.";
    private static final long serialVersionUID = 1L;
    private List innerThrowables;

    public AggregateException(String s, List list)
    {
        Throwable throwable;
        if (list != null && list.size() > 0)
        {
            throwable = (Throwable)list.get(0);
        } else
        {
            throwable = null;
        }
        super(s, throwable);
        innerThrowables = Collections.unmodifiableList(list);
    }

    public AggregateException(String s, Throwable athrowable[])
    {
        this(s, Arrays.asList(athrowable));
    }

    public AggregateException(List list)
    {
        this("There were multiple errors.", list);
    }

    public Throwable[] getCauses()
    {
        return (Throwable[])innerThrowables.toArray(new Throwable[innerThrowables.size()]);
    }

    public List getErrors()
    {
        ArrayList arraylist = new ArrayList();
        if (innerThrowables != null)
        {
            Iterator iterator = innerThrowables.iterator();
            while (iterator.hasNext()) 
            {
                Throwable throwable = (Throwable)iterator.next();
                if (throwable instanceof Exception)
                {
                    arraylist.add((Exception)throwable);
                } else
                {
                    arraylist.add(new Exception(throwable));
                }
            }
        }
        return arraylist;
    }

    public List getInnerThrowables()
    {
        return innerThrowables;
    }

    public void printStackTrace(PrintStream printstream)
    {
        super.printStackTrace(printstream);
        int i = -1;
        for (Iterator iterator = innerThrowables.iterator(); iterator.hasNext(); printstream.append("\n"))
        {
            Throwable throwable = (Throwable)iterator.next();
            printstream.append("\n");
            printstream.append("  Inner throwable #");
            i++;
            printstream.append(Integer.toString(i));
            printstream.append(": ");
            throwable.printStackTrace(printstream);
        }

    }

    public void printStackTrace(PrintWriter printwriter)
    {
        super.printStackTrace(printwriter);
        int i = -1;
        for (Iterator iterator = innerThrowables.iterator(); iterator.hasNext(); printwriter.append("\n"))
        {
            Throwable throwable = (Throwable)iterator.next();
            printwriter.append("\n");
            printwriter.append("  Inner throwable #");
            i++;
            printwriter.append(Integer.toString(i));
            printwriter.append(": ");
            throwable.printStackTrace(printwriter);
        }

    }
}
