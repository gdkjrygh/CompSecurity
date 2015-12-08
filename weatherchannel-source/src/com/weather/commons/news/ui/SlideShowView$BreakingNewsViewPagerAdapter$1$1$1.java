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

class this._cls3
    implements Runnable
{

    final collapse this$3;

    public void run()
    {
        SlideShowView slideshowview = ;
        boolean flag;
        if (seeMore.getVisibility() == 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SlideShowView.access$702(slideshowview, flag);
        if (SlideShowView.access$700())
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

    assetItem()
    {
        this$3 = this._cls3.this;
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


    // Unreferenced inner class com/weather/commons/news/ui/SlideShowView$BreakingNewsViewPagerAdapter$1$1

/* anonymous class */
    class SlideShowView.BreakingNewsViewPagerAdapter._cls1._cls1
        implements android.view.View.OnClickListener
    {

        final SlideShowView.BreakingNewsViewPagerAdapter._cls1 this$2;

        public void onClick(View view)
        {
            SlideShowView.BreakingNewsViewPagerAdapter.access$800(this$1).post(new SlideShowView.BreakingNewsViewPagerAdapter._cls1._cls1._cls1());
            view = this$0;
            boolean flag;
            if (!SlideShowView.access$700(this$0))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            SlideShowView.access$702(view, flag);
        }

            
            {
                this$2 = SlideShowView.BreakingNewsViewPagerAdapter._cls1.this;
                super();
            }
    }

}
