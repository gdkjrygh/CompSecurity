// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.annotation;

import java.lang.annotation.Annotation;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

// Referenced classes of package javax.annotation:
//            Nonnegative

public static class lidator
    implements TypeQualifierValidator
{

    public volatile When forConstantValue(Annotation annotation, Object obj)
    {
        return forConstantValue((Nonnegative)annotation, obj);
    }

    public When forConstantValue(Nonnegative nonnegative, Object obj)
    {
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        boolean flag = true;
        if (!(obj instanceof Number))
        {
            return When.NEVER;
        }
        nonnegative = (Number)obj;
        if (nonnegative instanceof Long)
        {
            if (nonnegative.longValue() >= 0L)
            {
                flag = false;
            }
        } else
        if (nonnegative instanceof Double)
        {
            if (nonnegative.doubleValue() < 0.0D)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        } else
        if (nonnegative instanceof Float)
        {
            if (nonnegative.floatValue() < 0.0F)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
        } else
        if (nonnegative.intValue() < 0)
        {
            flag = flag3;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return When.NEVER;
        } else
        {
            return When.ALWAYS;
        }
    }

    public lidator()
    {
    }
}
