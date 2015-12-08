// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Converter, CaseFormat, Preconditions

private static final class targetFormat extends Converter
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final CaseFormat sourceFormat;
    private final CaseFormat targetFormat;

    protected volatile Object doBackward(Object obj)
    {
        return doBackward((String)obj);
    }

    protected String doBackward(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return targetFormat.to(sourceFormat, s);
        }
    }

    protected volatile Object doForward(Object obj)
    {
        return doForward((String)obj);
    }

    protected String doForward(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return sourceFormat.to(targetFormat, s);
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof targetFormat)
        {
            obj = (targetFormat)obj;
            flag = flag1;
            if (sourceFormat.equals(((sourceFormat) (obj)).sourceFormat))
            {
                flag = flag1;
                if (targetFormat.equals(((targetFormat) (obj)).targetFormat))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return sourceFormat.hashCode() ^ targetFormat.hashCode();
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(sourceFormat));
        String s1 = String.valueOf(String.valueOf(targetFormat));
        return (new StringBuilder(s.length() + 14 + s1.length())).append(s).append(".converterTo(").append(s1).append(")").toString();
    }

    (CaseFormat caseformat, CaseFormat caseformat1)
    {
        sourceFormat = (CaseFormat)Preconditions.checkNotNull(caseformat);
        targetFormat = (CaseFormat)Preconditions.checkNotNull(caseformat1);
    }
}
