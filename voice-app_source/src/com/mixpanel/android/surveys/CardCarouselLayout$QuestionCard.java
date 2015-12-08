// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

// Referenced classes of package com.mixpanel.android.surveys:
//            CardCarouselLayout

private class _cls2
{

    private final View mCardView;
    private final ListView mChoiceView;
    private final TextView mEditAnswerView;
    private final TextView mPromptView;
    private com.mixpanel.android.mpmetrics.werTypeException mQuestion;
    final CardCarouselLayout this$0;

    public View getView()
    {
        return mCardView;
    }

    public void showQuestionOnCard(com.mixpanel.android.mpmetrics.ardView ardview, String s)
        throws nswerTypeException
    {
        InputMethodManager inputmethodmanager;
        com.mixpanel.android.mpmetrics.werTypeException wertypeexception;
        mQuestion = ardview;
        mPromptView.setText(mQuestion.uestion());
        inputmethodmanager = (InputMethodManager)mCardView.getContext().getSystemService("input_method");
        wertypeexception = ardview.ardView();
        if (com.mixpanel.android.mpmetrics.ardView != wertypeexception) goto _L2; else goto _L1
_L1:
        mChoiceView.setVisibility(8);
        mEditAnswerView.setVisibility(0);
        if (s != null)
        {
            mEditAnswerView.setText(s);
        }
        if (getResources().getConfiguration().orientation == 1)
        {
            mEditAnswerView.requestFocus();
            inputmethodmanager.showSoftInput(mEditAnswerView, 0);
        } else
        {
            inputmethodmanager.hideSoftInputFromWindow(mCardView.getWindowToken(), 0);
        }
_L4:
        mCardView.invalidate();
        return;
_L2:
        if (com.mixpanel.android.mpmetrics.ICE != wertypeexception)
        {
            break; /* Loop/switch isn't completed */
        }
        inputmethodmanager.hideSoftInputFromWindow(mCardView.getWindowToken(), 0);
        mChoiceView.setVisibility(0);
        mEditAnswerView.setVisibility(8);
        ardview = new (ardview.init>(), LayoutInflater.from(getContext()));
        mChoiceView.setAdapter(ardview);
        mChoiceView.clearChoices();
        if (s != null)
        {
            int i = 0;
            while (i < ardview.getCount()) 
            {
                if (ardview.getItem(i).equals(s))
                {
                    mChoiceView.setItemChecked(i, true);
                }
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        throw new nswerTypeException((new StringBuilder("No way to display question type ")).append(wertypeexception).toString(), null);
    }



    public _cls2.this._cls1(View view)
    {
        this$0 = CardCarouselLayout.this;
        super();
        mCardView = view;
        mPromptView = (TextView)view.findViewWithTag("com_mixpanel_android_TAG_prompt_text");
        mEditAnswerView = (EditText)view.findViewWithTag("com_mixpanel_android_TAG_text_answer");
        mChoiceView = (ListView)view.findViewWithTag("com_mixpanel_android_TAG_choice_list");
        mEditAnswerView.setText("");
        mEditAnswerView.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final CardCarouselLayout.QuestionCard this$1;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                boolean flag1 = false;
                boolean flag;
                if (keyevent != null && keyevent.getKeyCode() == 66 && keyevent.getAction() == 0 && (keyevent.getFlags() & 0x20) == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag || i == 6)
                {
                    textview.clearComposingText();
                    if (CardCarouselLayout.access$0(this$0) != null)
                    {
                        textview = textview.getText().toString();
                        CardCarouselLayout.access$0(this$0).onQuestionAnswered(mQuestion, textview);
                    }
                    flag1 = true;
                }
                return flag1;
            }

            
            {
                this$1 = CardCarouselLayout.QuestionCard.this;
                super();
            }
        });
        mChoiceView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final CardCarouselLayout.QuestionCard this$1;

            public void onItemClick(AdapterView adapterview, View view1, int i, long l)
            {
                if (CardCarouselLayout.access$0(this$0) != null)
                {
                    adapterview = adapterview.getItemAtPosition(i).toString();
                    postDelayed(adapterview. new Runnable() {

                        final _cls2 this$2;
                        private final String val$answer;

                        public void run()
                        {
                            CardCarouselLayout.access$0(this$0).onQuestionAnswered(mQuestion, answer);
                        }

            
            {
                this$2 = final__pcls2;
                answer = String.this;
                super();
            }
                    }, 165L);
                }
            }


            
            {
                this$1 = CardCarouselLayout.QuestionCard.this;
                super();
            }
        });
    }
}
