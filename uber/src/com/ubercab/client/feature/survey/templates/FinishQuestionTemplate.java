// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.survey.templates;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.ubercab.client.feature.survey.model.Answer;
import com.ubercab.client.feature.survey.model.Question;
import com.ubercab.ui.TextView;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.survey.templates:
//            QuestionTemplateBase

public class FinishQuestionTemplate extends QuestionTemplateBase
{

    private Question a;
    ImageView mQuestionIcon;
    TextView mQuestionSubtitle;
    TextView mQuestionTitle;
    View mSurveyFinishView;

    public FinishQuestionTemplate(Context context)
    {
        this(context, (byte)0);
    }

    private FinishQuestionTemplate(Context context, byte byte0)
    {
        this(context, '\0');
    }

    private FinishQuestionTemplate(Context context, char c)
    {
        super(context, null, 0);
        inflate(context, 0x7f0301ab, this);
        if (!isInEditMode())
        {
            ButterKnife.inject(this);
        }
    }

    private void b(Question question)
    {
        mQuestionIcon.setImageDrawable(getContext().getResources().getDrawable(question.getIconResource()));
        mQuestionTitle.setText(question.getTitle());
        mQuestionSubtitle.setText(question.getSubtitle());
    }

    public final void a(Question question)
    {
        a = question;
        b(question);
    }

    public void onClickView()
    {
        a(a, (Answer)a.getAnswers().get(0));
    }
}
