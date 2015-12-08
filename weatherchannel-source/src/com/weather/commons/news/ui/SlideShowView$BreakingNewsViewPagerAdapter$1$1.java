// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import android.os.Handler;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import com.weather.commons.news.provider.Assets;

// Referenced classes of package com.weather.commons.news.ui:
//            SlideShowView

class this._cls2
    implements android.view.gerAdapter._cls1._cls1
{

    final ._cls0 this$2;

    public void onClick(View view)
    {
        ss._mth800(_fld1).post(new Runnable() {

            final SlideShowView.BreakingNewsViewPagerAdapter._cls1._cls1 this$3;

            public void run()
            {
                SlideShowView slideshowview = this$0;
                boolean flag1;
                if (seeMore.getVisibility() == 8)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                SlideShowView.access$702(slideshowview, flag1);
                if (SlideShowView.access$700(this$0))
                {
                    CharSequence charsequence = articleTitle.getText().subSequence(0, (articleTitle.getLayout().getLineEnd(1) - expandText.length()) + 1);
                    articleTitle.setText(charsequence);
                    seeMore.setVisibility(0);
                    collapse.setVisibility(8);
                    return;
                } else
                {
                    articleTitle.setText(String.format("%s%s", new Object[] {
                        assetItem.caption, Character.valueOf('\n')
                    }));
                    seeMore.setVisibility(8);
                    collapse.setVisibility(0);
                    return;
                }
            }

            
            {
                this$3 = SlideShowView.BreakingNewsViewPagerAdapter._cls1._cls1.this;
                super();
            }
        });
        view = _fld0;
        boolean flag;
        if (!SlideShowView.access$700(_fld0))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SlideShowView.access$702(view, flag);
    }

    l.assetItem()
    {
        this$2 = this._cls2.this;
        super();
    }

    // Unreferenced inner class com/weather/commons/news/ui/SlideShowView$BreakingNewsViewPagerAdapter$1

/* anonymous class */
    class SlideShowView.BreakingNewsViewPagerAdapter._cls1
        implements Runnable
    {

        final SlideShowView.BreakingNewsViewPagerAdapter this$1;
        final TextView val$articleTitle;
        final Assets val$assetItem;
        final TextView val$collapse;
        final String val$expandText;
        final TextView val$seeMore;

        public void run()
        {
            SlideShowView slideshowview = this$0;
            boolean flag;
            if (seeMore.getVisibility() == 8)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            SlideShowView.access$702(slideshowview, flag);
            if (articleTitle.getLineCount() > 2)
            {
                CharSequence charsequence = articleTitle.getText().subSequence(0, articleTitle.getLayout().getLineEnd(1) - (expandText.length() + 1));
                articleTitle.setText(charsequence);
                seeMore.setVisibility(0);
                collapse.setVisibility(8);
                articleTitle.setOnClickListener(new SlideShowView.BreakingNewsViewPagerAdapter._cls1._cls1());
            }
        }

            
            {
                this$1 = final_breakingnewsviewpageradapter;
                seeMore = textview;
                articleTitle = textview1;
                expandText = s;
                collapse = textview2;
                assetItem = Assets.this;
                super();
            }
    }

}
