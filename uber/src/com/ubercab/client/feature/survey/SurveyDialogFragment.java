// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.survey;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.survey.model.Answer;
import com.ubercab.client.feature.survey.model.Question;
import com.ubercab.client.feature.survey.model.Survey;
import com.ubercab.client.feature.survey.templates.QuestionTemplateBase;
import cyz;
import czj;
import dal;
import dfp;
import diw;
import fpg;
import fph;
import fpj;
import fpk;
import fpl;
import fpr;
import fps;
import gju;
import gjy;
import gka;
import gki;
import java.util.List;

public class SurveyDialogFragment extends cyz
    implements android.content.DialogInterface.OnCancelListener, fpr
{

    private static final Answer h = Answer.create("dismiss", null, "dismiss");
    public chp a;
    public gju b;
    public fps c;
    public dal d;
    public fpj g;
    private Question i;
    private QuestionTemplateBase j;
    private Survey k;
    private int l;
    LinearLayout mSurveyDialogView;

    public SurveyDialogFragment()
    {
    }

    private static SurveyDialogFragment a(int i1, int j1, Bundle bundle)
    {
        Bundle bundle1 = b(i1);
        bundle1.putInt("survey.survey_type", j1);
        if (bundle != null)
        {
            bundle1.putAll(bundle);
        }
        bundle = new SurveyDialogFragment();
        bundle.setArguments(bundle1);
        return bundle;
    }

    private Question a(Answer answer)
    {
        answer = answer.getNextQuestionId();
        List list = k.getQuestions();
        if (TextUtils.isEmpty(answer) || list.isEmpty())
        {
            return null;
        } else
        {
            return (Question)gki.d(list, new gka(answer) {

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

            
            {
                b = SurveyDialogFragment.this;
                a = s;
                super();
            }
            }).d();
        }
    }

    private void a(int i1)
    {
        c(i1);
        dismiss();
    }

    public static void a(RiderActivity rideractivity, int i1, int j1, Bundle bundle)
    {
        bundle = a(i1, j1, bundle);
        bundle.show(rideractivity.getSupportFragmentManager(), bundle.getClass().getName());
    }

    private void a(Question question)
    {
        i = question;
        j = c.a(i.getType());
        if (j == null)
        {
            a(0);
            return;
        } else
        {
            j.a(getArguments());
            j.a(this);
            j.a(question);
            mSurveyDialogView.addView(j);
            a.a(question.getImpressionEvent());
            return;
        }
    }

    private void a(fpk fpk1)
    {
        fpk1.a(this);
    }

    private fpk b(dfp dfp)
    {
        return fpg.a().a(new diw(this)).a(new fpl()).a(dfp).a();
    }

    private void b(Question question, Answer answer)
    {
        question = AnalyticsEvent.create("tap").setName(question.getTapEvent()).setValue(String.format("%s:%s", new Object[] {
            answer.getText(), answer.getId()
        }));
        a.a(question);
    }

    private void d()
    {
        long l1 = gju.a();
        d.a(k.getSurveyType(), l1 + k.getRepeatTimeoutMs());
    }

    public final cic a()
    {
        if (i != null)
        {
            return i.getImpressionEvent();
        } else
        {
            return cyz.e;
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(Question question, Answer answer)
    {
        b(question, answer);
        d();
        j.b(this);
        mSurveyDialogView.removeAllViews();
        question = a(answer);
        if (question == null)
        {
            a(-1);
            return;
        } else
        {
            a(question);
            return;
        }
    }

    public final volatile void a(czj czj)
    {
        a((fpk)czj);
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        if (i.getType() != com.ubercab.client.feature.survey.model.Question.TYPE.FINISH)
        {
            d();
            b(i, h);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, 0x7f09017b);
        l = getArguments().getInt("survey.survey_type");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0301aa, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        getDialog().setOnCancelListener(this);
        getDialog().setCanceledOnTouchOutside(true);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroy();
        ButterKnife.reset(this);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        k = g.a(l);
        if (k == null)
        {
            a(0);
            return;
        }
        view = k.getQuestions();
        if (view.isEmpty())
        {
            a(0);
            return;
        }
        view = (Question)view.get(0);
        if (view == null)
        {
            a(0);
            return;
        } else
        {
            a(view);
            return;
        }
    }

}
