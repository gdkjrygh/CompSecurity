// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.ArrayList;
import java.util.List;

public class AggregateException extends Exception
{

    private static final long serialVersionUID = 1L;
    private Throwable causes[];

    public AggregateException(String s, Throwable athrowable[])
    {
        Throwable throwable;
        if (athrowable != null && athrowable.length > 0)
        {
            throwable = athrowable[0];
        } else
        {
            throwable = null;
        }
        super(s, throwable);
        if (athrowable == null || athrowable.length <= 0)
        {
            athrowable = null;
        }
        causes = athrowable;
    }

    public AggregateException(List list)
    {
        this("There were multiple errors.", (Throwable[])list.toArray(new Exception[list.size()]));
    }

    public Throwable[] getCauses()
    {
        return causes;
    }

    public List getErrors()
    {
        ArrayList arraylist = new ArrayList();
        if (causes != null)
        {
            Throwable athrowable[] = causes;
            int j = athrowable.length;
            int i = 0;
            while (i < j) 
            {
                Throwable throwable = athrowable[i];
                if (throwable instanceof Exception)
                {
                    arraylist.add((Exception)throwable);
                } else
                {
                    arraylist.add(new Exception(throwable));
                }
                i++;
            }
        }
        return arraylist;
    }
}
