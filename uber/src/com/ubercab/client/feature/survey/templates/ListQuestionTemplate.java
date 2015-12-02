// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.survey.templates;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.ubercab.client.feature.survey.model.Answer;
import com.ubercab.client.feature.survey.model.Question;
import com.ubercab.ui.TextView;
import fpp;
import fpt;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.survey.templates:
//            QuestionTemplateBase

public class ListQuestionTemplate extends QuestionTemplateBase
{

    private fpp a;
    private Question b;
    ImageView mQuestionIcon;
    TextView mQuestionSubtitle;
    TextView mQuestionTitle;
    ListView mSurveyListView;

    public ListQuestionTemplate(Context context)
    {
        this(context, (byte)0);
    }

    private ListQuestionTemplate(Context context, byte byte0)
    {
        this(context, '\0');
    }

    private ListQuestionTemplate(Context context, char c1)
    {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(0x7f0301ac, this);
        if (!isInEditMode())
        {
            ButterKnife.inject(this);
        }
    }

    private void b(Question question)
    {
        a = new fpp(getContext());
        mSurveyListView.setAdapter(a);
        Answer answer;
        for (question = question.getAnswers().iterator(); question.hasNext(); a.add(new fpt(answer)))
        {
            answer = (Answer)question.next();
        }

    }

    private void c(Question question)
    {
        mQuestionIcon.setImageDrawable(getContext().getResources().getDrawable(question.getIconResource()));
        mQuestionTitle.setText(question.getTitle());
        mQuestionSubtitle.setText(question.getSubtitle());
    }

    public final void a(Question question)
    {
        b = question;
        c(question);
        b(question);
    }

    public void onSurveyItemClick(int i)
    {
        fpt fpt1 = (fpt)a.getItem(i);
        a(b, fpt1.a());
    }
}
