// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.shape.Shape;

public class hnz
    implements bkr
{

    public hnz()
    {
    }

    public bkq create(bjw bjw1, bmj bmj1)
    {
        bmj1 = bmj1.getRawType();
        if (bmj1.getAnnotation(getAnnotationClass()) == null)
        {
            return null;
        }
        String s = bmj1.getPackage().getName();
        bmj1 = bmj1.getName().substring(s.length() + 1).replace('$', '_');
        s = (new StringBuilder()).append(s).append(getGeneratedClassPrefix()).append(bmj1).toString();
        try
        {
            bjw1 = bjw1.a(Class.forName(s));
        }
        // Misplaced declaration of an exception variable
        catch (bjw bjw1)
        {
            throw new RuntimeException((new StringBuilder("Could not load generated class for ")).append(bmj1).toString(), bjw1);
        }
        return bjw1;
    }

    public Class getAnnotationClass()
    {
        return com/ubercab/shape/Shape;
    }

    public String getGeneratedClassPrefix()
    {
        return (new StringBuilder(".")).append(getAnnotationClass().getSimpleName()).append("_").toString();
    }
}
