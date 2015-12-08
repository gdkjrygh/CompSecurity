// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.List;

public class AggregateException extends Exception
{

    private static final long serialVersionUID = 1L;
    private List errors;

    public AggregateException(List list)
    {
        super("There were multiple errors.");
        errors = list;
    }

    public List getErrors()
    {
        return errors;
    }
}
