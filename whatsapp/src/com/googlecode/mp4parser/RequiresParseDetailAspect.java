// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.NoAspectBoundException;

// Referenced classes of package com.googlecode.mp4parser:
//            AbstractBox

public class RequiresParseDetailAspect
{

    private static Throwable ajc$initFailureCause;
    public static final RequiresParseDetailAspect ajc$perSingletonInstance;

    public RequiresParseDetailAspect()
    {
    }

    private static void ajc$postClinit()
    {
        ajc$perSingletonInstance = new RequiresParseDetailAspect();
    }

    public static RequiresParseDetailAspect aspectOf()
    {
        if (ajc$perSingletonInstance == null)
        {
            throw new NoAspectBoundException("com.googlecode.mp4parser.RequiresParseDetailAspect", ajc$initFailureCause);
        } else
        {
            return ajc$perSingletonInstance;
        }
    }

    public static boolean hasAspect()
    {
        return ajc$perSingletonInstance != null;
    }

    public void before(JoinPoint joinpoint)
    {
        if (joinpoint.getTarget() instanceof AbstractBox)
        {
            if (!((AbstractBox)joinpoint.getTarget()).isParsed())
            {
                ((AbstractBox)joinpoint.getTarget()).parseDetails();
            }
            return;
        } else
        {
            throw new RuntimeException((new StringBuilder("Only methods in subclasses of ")).append(com/googlecode/mp4parser/AbstractBox.getName()).append(" can  be annotated with ParseDetail").toString());
        }
    }

    static 
    {
        try
        {
            ajc$postClinit();
        }
        catch (Throwable throwable)
        {
            ajc$initFailureCause = throwable;
        }
    }
}
