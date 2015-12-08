// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.a.a.a.b;
import com.google.android.apps.youtube.a.a.a.c;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            Survey, SurveyQuestion, au

public class ar
{

    private b a;
    private List b;

    public ar()
    {
        a = new b();
        b = new ArrayList();
    }

    public final Survey a()
    {
        Survey survey;
        try
        {
            a.b = (c[])b.toArray(new c[0]);
            survey = new Survey((b)com.google.protobuf.nano.c.a(new b(), com.google.protobuf.nano.c.a(a)), null);
        }
        catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
        {
            return Survey.EMPTY;
        }
        return survey;
    }

    public final ar a(SurveyQuestion surveyquestion)
    {
        try
        {
            b.add(surveyquestion.buildUpon().a(b.size()).a().getSurveyQuestionProto());
        }
        // Misplaced declaration of an exception variable
        catch (SurveyQuestion surveyquestion)
        {
            return this;
        }
        return this;
    }

    public final ar a(List list)
    {
        for (list = list.iterator(); list.hasNext(); a((SurveyQuestion)list.next())) { }
        return this;
    }
}
