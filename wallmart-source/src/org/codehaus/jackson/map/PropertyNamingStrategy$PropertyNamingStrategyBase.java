// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import org.codehaus.jackson.map.introspect.AnnotatedField;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.map.introspect.AnnotatedParameter;

// Referenced classes of package org.codehaus.jackson.map:
//            PropertyNamingStrategy, MapperConfig

public static abstract class  extends PropertyNamingStrategy
{

    public String nameForConstructorParameter(MapperConfig mapperconfig, AnnotatedParameter annotatedparameter, String s)
    {
        return translate(s);
    }

    public String nameForField(MapperConfig mapperconfig, AnnotatedField annotatedfield, String s)
    {
        return translate(s);
    }

    public String nameForGetterMethod(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, String s)
    {
        return translate(s);
    }

    public String nameForSetterMethod(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, String s)
    {
        return translate(s);
    }

    public abstract String translate(String s);

    public ()
    {
    }
}
