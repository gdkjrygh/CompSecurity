// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.hiring.model;

import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.hiring.model:
//            Shape_CodingQuestion

public abstract class CodingQuestion
{

    public CodingQuestion()
    {
    }

    public static transient CodingQuestion create(String s, Type type, String s1, String as[])
    {
        return (new Shape_CodingQuestion()).setId(s).setType(type).setCorrectAnswers(Arrays.asList(as)).setCode(s1);
    }

    public abstract String getCode();

    public abstract List getCorrectAnswers();

    public abstract String getId();

    public abstract Type getType();

    public abstract CodingQuestion setCode(String s);

    public abstract CodingQuestion setCorrectAnswers(List list);

    public abstract CodingQuestion setId(String s);

    public abstract CodingQuestion setType(Type type);
}
