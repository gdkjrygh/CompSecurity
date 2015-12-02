// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.ubercab.client.feature.hiring.template.BaseQuestionTemplate;
import com.ubercab.client.feature.hiring.template.TapLineQuestionTemplate;

public final class edm
{

    private final Context a;

    public edm(Context context)
    {
        a = context;
    }

    public final BaseQuestionTemplate a(com.ubercab.client.feature.hiring.model.CodingQuestion.Type type)
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.ubercab.client.feature.hiring.model.CodingQuestion.Type.values().length];
                try
                {
                    a[com.ubercab.client.feature.hiring.model.CodingQuestion.Type.TAP_LINE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.ubercab.client.feature.hiring.model.CodingQuestion.Type.MULTIPLE_CHOICE.ordinal()] = 2;
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
            throw new IllegalArgumentException("Unknown coding challenge question type.");

        case 1: // '\001'
            return new TapLineQuestionTemplate(a);

        case 2: // '\002'
            return new edl(a);
        }
    }
}
