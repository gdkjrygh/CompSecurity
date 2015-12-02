// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.hiring.template;

import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import butterknife.ButterKnife;
import cev;
import com.ubercab.client.feature.hiring.model.CodingQuestion;
import edn;

// Referenced classes of package com.ubercab.client.feature.hiring.template:
//            BaseQuestionTemplate

public class TapLineQuestionTemplate extends BaseQuestionTemplate
{

    public TextView mContentTextView;
    TextView mMarginTextView;

    public TapLineQuestionTemplate(Context context)
    {
        this(context, (byte)0);
    }

    private TapLineQuestionTemplate(Context context, byte byte0)
    {
        this(context, '\0');
    }

    private TapLineQuestionTemplate(Context context, char c)
    {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(0x7f030078, this);
        ButterKnife.inject(this);
    }

    private void a()
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (int i = 1; i <= mContentTextView.getLineCount(); i++)
        {
            stringbuffer.append((new StringBuilder()).append(i).append("\n").toString());
        }

        mMarginTextView.setText(stringbuffer);
    }

    static void a(TapLineQuestionTemplate taplinequestiontemplate)
    {
        taplinequestiontemplate.a();
    }

    public final void a(cev cev, CodingQuestion codingquestion)
    {
        Object obj = Html.fromHtml(codingquestion.getCode());
        codingquestion = new SpannableString(((CharSequence) (obj)));
        obj = obj.toString().trim();
        String as[] = ((String) (obj)).split("\n");
        int i1 = as.length;
        int j = 0;
        int i;
        for (int k = 0; j < i1; k = i)
        {
            String s = as[j];
            if (k >= ((String) (obj)).length())
            {
                break;
            }
            int l = s.length() + k;
            i = l;
            if (l < ((String) (obj)).length())
            {
                i = l + 1;
            }
            codingquestion.setSpan(new edn(this, cev), k, i, 33);
            j++;
        }

        mContentTextView.setMovementMethod(LinkMovementMethod.getInstance());
        mContentTextView.setText(codingquestion, android.widget.TextView.BufferType.SPANNABLE);
        mContentTextView.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final TapLineQuestionTemplate a;

            public final void onGlobalLayout()
            {
                TapLineQuestionTemplate.a(a);
            }

            
            {
                a = TapLineQuestionTemplate.this;
                super();
            }
        });
    }
}
