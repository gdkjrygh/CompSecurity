// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.survey.templates;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.ubercab.client.feature.survey.templates:
//            ListQuestionTemplate

final class a
    implements android.widget.tionTemplate..ViewInjector._cls1
{

    final ListQuestionTemplate a;
    final k b;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.onSurveyItemClick(i);
    }

    ( , ListQuestionTemplate listquestiontemplate)
    {
        b = ;
        a = listquestiontemplate;
        super();
    }
}
