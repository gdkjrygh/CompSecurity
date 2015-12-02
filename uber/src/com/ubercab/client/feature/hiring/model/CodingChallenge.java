// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.hiring.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.feature.hiring.model:
//            Shape_CodingChallenge

public abstract class CodingChallenge
{

    public CodingChallenge()
    {
    }

    public static CodingChallenge create(String s, List list)
    {
        return (new Shape_CodingChallenge()).setId(s).setQuestions(list);
    }

    public abstract String getId();

    public abstract List getQuestions();

    public abstract CodingChallenge setId(String s);

    public abstract CodingChallenge setQuestions(List list);
}
