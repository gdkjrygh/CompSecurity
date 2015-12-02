// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.survey.templates;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.client.feature.survey.model.Answer;
import com.ubercab.client.feature.survey.model.Question;
import com.ubercab.ui.TextView;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.survey.templates:
//            QuestionTemplateBase

public class PositiveNegativeQuestionTemplate extends QuestionTemplateBase
{

    private String a;
    LinearLayout mAnswersContainer;
    TextView mQuestionDisclaimer;
    TextView mQuestionSubtitle;
    TextView mQuestionTitle;

    public PositiveNegativeQuestionTemplate(Context context)
    {
        this(context, (byte)0);
    }

    private PositiveNegativeQuestionTemplate(Context context, byte byte0)
    {
        this(context, '\0');
    }

    private PositiveNegativeQuestionTemplate(Context context, char c1)
    {
        super(context, null, 0);
        inflate(context, 0x7f0301ae, this);
        if (!isInEditMode())
        {
            ButterKnife.inject(this);
        }
    }

    private android.widget.LinearLayout.LayoutParams a()
    {
        Object obj = getContext().getResources();
        int i = ((Resources) (obj)).getDimensionPixelSize(0x7f080238);
        int j = ((Resources) (obj)).getDimensionPixelSize(0x7f0800dc);
        obj = new android.widget.LinearLayout.LayoutParams(i, i);
        obj.gravity = 17;
        obj.weight = 1.0F;
        ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(j, j, j, j);
        return ((android.widget.LinearLayout.LayoutParams) (obj));
    }

    private void b(Question question)
    {
        ImageView imageview;
        for (Iterator iterator = question.getAnswers().iterator(); iterator.hasNext(); mAnswersContainer.addView(imageview))
        {
            Answer answer = (Answer)iterator.next();
            imageview = new ImageView(getContext());
            imageview.setImageDrawable(getContext().getResources().getDrawable(answer.getIconResource()));
            imageview.setContentDescription(answer.getText());
            imageview.setOnClickListener(new android.view.View.OnClickListener(question, answer) {

                final Question a;
                final Answer b;
                final PositiveNegativeQuestionTemplate c;

                public final void onClick(View view)
                {
                    c.a(a, b);
                }

            
            {
                c = PositiveNegativeQuestionTemplate.this;
                a = question;
                b = answer;
                super();
            }
            });
            imageview.setLayoutParams(a());
        }

    }

    private void c(Question question)
    {
        mQuestionTitle.setText(question.getTitle());
        mQuestionDisclaimer.setText(question.getDisclaimer());
        mQuestionSubtitle.setText(a);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a = bundle.getString("survey.survey_pickup_address");
    }

    public final void a(Question question)
    {
        c(question);
        b(question);
    }
}
