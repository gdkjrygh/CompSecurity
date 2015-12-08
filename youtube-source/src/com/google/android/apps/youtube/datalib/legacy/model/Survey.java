// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.a.a.a.b;
import com.google.android.apps.youtube.common.e.j;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.legacy.a.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            aq, ar, as, SurveyQuestion, 
//            au

public final class Survey
    implements Parcelable, a
{

    public static final android.os.Parcelable.Creator CREATOR = new aq();
    public static final Survey EMPTY = new Survey();
    private List questions;
    private final b surveyProto;

    private Survey()
    {
        surveyProto = new b();
    }

    private Survey(b b1)
    {
        c.a(b1);
        boolean flag;
        if (b1.b.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        surveyProto = b1;
    }

    Survey(b b1, aq aq1)
    {
        this(b1);
    }

    public final ar buildUpon()
    {
        return (new ar()).a(getQuestions());
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != null && getClass().equals(obj.getClass()))
        {
            obj = (Survey)obj;
            if (com.google.android.apps.youtube.common.fromguava.b.a(getQuestions(), ((Survey) (obj)).getQuestions()))
            {
                return true;
            }
        }
        return false;
    }

    public final volatile com.google.android.apps.youtube.datalib.legacy.a.b getConverter()
    {
        return getConverter();
    }

    public final as getConverter()
    {
        return new as(this);
    }

    public final SurveyQuestion getQuestion(int i)
    {
        return (SurveyQuestion)getQuestions().get(i);
    }

    public final List getQuestions()
    {
        if (questions == null)
        {
            questions = new ArrayList();
            com.google.android.apps.youtube.a.a.a.c ac[] = surveyProto.b;
            int k = ac.length;
            for (int i = 0; i < k; i++)
            {
                com.google.android.apps.youtube.a.a.a.c c1 = ac[i];
                questions.add((new au(c1)).a());
            }

            questions = Collections.unmodifiableList(questions);
        }
        return questions;
    }

    public final String toString()
    {
        return (new StringBuilder("Survey ")).append(getQuestions().toString()).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        j.a(parcel, surveyProto);
    }


}
