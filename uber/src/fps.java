// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.ubercab.client.feature.survey.templates.FinishQuestionTemplate;
import com.ubercab.client.feature.survey.templates.ListQuestionTemplate;
import com.ubercab.client.feature.survey.templates.PositiveNegativeQuestionTemplate;
import com.ubercab.client.feature.survey.templates.QuestionTemplateBase;

public final class fps
{

    private final Context a;

    public fps(Context context)
    {
        a = context;
    }

    public final QuestionTemplateBase a(com.ubercab.client.feature.survey.model.Question.TYPE type)
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.ubercab.client.feature.survey.model.Question.TYPE.values().length];
                try
                {
                    a[com.ubercab.client.feature.survey.model.Question.TYPE.POSITIVE_NEGATIVE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.ubercab.client.feature.survey.model.Question.TYPE.LIST.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.ubercab.client.feature.survey.model.Question.TYPE.FINISH.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[type.ordinal()])
        {
        default:
            throw new IllegalArgumentException("Unknown survey question type. Please create template for the type.");

        case 1: // '\001'
            return new PositiveNegativeQuestionTemplate(a);

        case 2: // '\002'
            return new ListQuestionTemplate(a);

        case 3: // '\003'
            return new FinishQuestionTemplate(a);
        }
    }
}
