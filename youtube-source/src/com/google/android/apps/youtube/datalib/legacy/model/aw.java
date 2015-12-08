// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            SurveyQuestion, Survey

public final class aw
{

    private final b a;
    private final TimeZone b;
    private long c;
    private long d;
    private List e;

    public aw(b b1)
    {
        this(b1, TimeZone.getDefault());
    }

    private aw(b b1, TimeZone timezone)
    {
        a = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        b = (TimeZone)com.google.android.apps.youtube.common.fromguava.c.a(timezone);
    }

    private Uri a(SurveyQuestion surveyquestion, Uri uri)
    {
        String s = String.valueOf(surveyquestion.getId());
        android.net.Uri.Builder builder = uri.buildUpon();
        if (!TextUtils.isEmpty(surveyquestion.getApiContext()))
        {
            builder.appendQueryParameter("p", surveyquestion.getApiContext());
        }
        builder.appendQueryParameter((new StringBuilder("m.d-")).append(s).toString(), Long.toString(d - c));
        builder.appendQueryParameter("m.v", "2");
        long l = d;
        long l1 = b.getOffset(d);
        builder.appendQueryParameter((new StringBuilder("m.lt-")).append(s).toString(), Long.toString(Math.round((l + l1) / 1000L)));
        if (surveyquestion.getType() == SurveyQuestion.Type.MULTI_SELECT || surveyquestion.getType() == SurveyQuestion.Type.SINGLE_ANSWERS)
        {
            builder.appendQueryParameter((new StringBuilder("r.o-")).append(s).toString(), surveyquestion.getAnswerOrdering());
        }
        if (e != null)
        {
            builder.appendQueryParameter("t", "a");
            int i;
            for (uri = e.iterator(); uri.hasNext(); builder.appendQueryParameter((new StringBuilder("r.r-")).append(s).toString(), (String)surveyquestion.getAnswers().get(i)))
            {
                i = ((Integer)uri.next()).intValue();
            }

        } else
        {
            builder.appendQueryParameter((new StringBuilder("m.f-")).append(s).toString(), "1");
            if (uri.getQueryParameter("t") == "a")
            {
                builder.appendQueryParameter("t", "pa");
            } else
            {
                builder.appendQueryParameter("t", "nr");
            }
        }
        return builder.build();
    }

    public final List a(Survey survey)
    {
        survey = (SurveyQuestion)survey.getQuestions().get(0);
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = survey.getBeaconUris().iterator(); iterator.hasNext(); arraylist.add(a(((SurveyQuestion) (survey)), (Uri)iterator.next()))) { }
        return arraylist;
    }

    public final void a()
    {
        c = a.a();
    }

    public final void a(List list)
    {
        d = a.a();
        e = Collections.unmodifiableList((List)com.google.android.apps.youtube.common.fromguava.c.a(list));
    }

    public final void b()
    {
        d = a.a();
        e = null;
    }
}
