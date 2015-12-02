// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.survey.model.Answer;

public final class fpt
{

    private final Answer a;

    public fpt(Answer answer)
    {
        a = answer;
    }

    public final Answer a()
    {
        return a;
    }

    final String b()
    {
        return a.getText();
    }
}
