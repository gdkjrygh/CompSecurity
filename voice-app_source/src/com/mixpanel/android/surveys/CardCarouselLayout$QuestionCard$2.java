// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.mixpanel.android.surveys:
//            CardCarouselLayout

class this._cls1
    implements android.widget.uestionCard._cls2
{

    final _cls1.val.answer this$1;

    public void onItemClick(final AdapterView answer, View view, int i, long l)
    {
        if (CardCarouselLayout.access$0(cess._mth1(this._cls1.this)) != null)
        {
            answer = answer.getItemAtPosition(i).toString();
            cess._mth1(this._cls1.this).postDelayed(new Runnable() {

                final CardCarouselLayout.QuestionCard._cls2 this$2;
                private final String val$answer;

                public void run()
                {
                    CardCarouselLayout.access$0(CardCarouselLayout.QuestionCard.access$1(this$1)).onQuestionAnswered(CardCarouselLayout.QuestionCard.access$0(this$1), answer);
                }

            
            {
                this$2 = CardCarouselLayout.QuestionCard._cls2.this;
                answer = s;
                super();
            }
            }, 165L);
        }
    }


    _cls1.val.answer()
    {
        this$1 = this._cls1.this;
        super();
    }
}
