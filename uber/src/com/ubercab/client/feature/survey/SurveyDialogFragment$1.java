// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.survey;

import com.ubercab.client.feature.survey.model.Question;
import gka;

// Referenced classes of package com.ubercab.client.feature.survey:
//            SurveyDialogFragment

final class a
    implements gka
{

    final String a;
    final SurveyDialogFragment b;

    private boolean a(Question question)
    {
        return question.getId().equals(a);
    }

    public final boolean apply(Object obj)
    {
        return a((Question)obj);
    }

    (SurveyDialogFragment surveydialogfragment, String s)
    {
        b = surveydialogfragment;
        a = s;
        super();
    }
}
