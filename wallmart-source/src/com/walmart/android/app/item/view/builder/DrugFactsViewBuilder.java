// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view.builder;

import android.content.Context;
import android.support.v7.widget.GridLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.walmart.android.service.item.StringPair;
import com.walmart.android.service.item.model.DrugFacts;
import com.walmart.android.utils.ViewUtil;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.app.item.view.builder:
//            ViewBuilder

public class DrugFactsViewBuilder extends ViewBuilder
{
    private static class GridTextBuilder
    {

        private android.support.v7.widget.GridLayout.Alignment mAlignment;
        private final int mColumnCount;
        private android.support.v7.widget.GridLayout.LayoutParams mLayoutParams;
        private int mSize;
        private int mStart;
        private final TextView mTextView;
        private int mTextWidth;

        public GridTextBuilder bold()
        {
            mTextView.setTypeface(mTextView.getTypeface(), 1);
            return this;
        }

        public TextView build()
        {
            mTextView.setWidth(mTextWidth);
            mLayoutParams.columnSpec = GridLayout.spec(mStart, mSize, mAlignment);
            mTextView.setLayoutParams(mLayoutParams);
            return mTextView;
        }

        public GridTextBuilder gravity(int i)
        {
            mTextView.setGravity(i);
            return this;
        }

        public GridTextBuilder size(int i)
        {
            mTextView.setTextSize(2, i);
            return this;
        }

        public GridTextBuilder span(int i)
        {
            mSize = i;
            return this;
        }

        public GridTextBuilder spanAll()
        {
            mSize = mColumnCount;
            return this;
        }

        public GridTextBuilder text(int i)
        {
            mTextView.setText(i);
            return this;
        }

        public GridTextBuilder text(String s)
        {
            mTextView.setText(s);
            return this;
        }

        public GridTextBuilder(GridLayout gridlayout)
        {
            mColumnCount = gridlayout.getColumnCount();
            mTextView = new TextView(gridlayout.getContext());
            mTextWidth = 0;
            mStart = 0x80000000;
            mSize = 1;
            mAlignment = GridLayout.FILL;
            mLayoutParams = new android.support.v7.widget.GridLayout.LayoutParams();
        }
    }


    private static final int DIVIDER_LARGE_DP = 6;
    private static final int DIVIDER_SMALL_DP = 1;
    private static final int TITLE_SP = 20;

    public DrugFactsViewBuilder(Context context)
    {
        super(context);
        mView = (ViewGroup)ViewUtil.inflate(mContext, 0x7f04001d);
    }

    private void addActiveIngredients(List list)
    {
        if (!list.isEmpty())
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                com.walmart.android.service.item.model.DrugFacts.Ingredient ingredient = (com.walmart.android.service.item.model.DrugFacts.Ingredient)list.next();
                add(withText(ingredient.name).bold().build());
                add(withText(ingredient.purpose).gravity(5).build());
            }
        }
    }

    private void addDirections(List list)
    {
        if (!list.isEmpty())
        {
            add(divider(6));
            add(withTitle(0x7f0901b3));
            list = list.iterator();
            while (list.hasNext()) 
            {
                add(withText((String)list.next()).spanAll().build());
            }
        }
    }

    private void addInactiveIngredients(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            add(divider(6));
            add(withText(0x7f0901b4).size(20).bold().spanAll().build());
            add(withText(s).spanAll().build());
            return;
        }
    }

    private void addInfo(List list)
    {
        if (!list.isEmpty())
        {
            StringPair stringpair;
            for (list = list.iterator(); list.hasNext(); add(withText(stringpair.value).spanAll().build()))
            {
                stringpair = (StringPair)list.next();
                add(divider(6));
                add(withText(stringpair.name).size(20).bold().spanAll().build());
            }

        }
    }

    private void addQuestions(List list)
    {
        if (!list.isEmpty())
        {
            add(divider(6));
            add(withTitle(0x7f0901b6));
            list = list.iterator();
            while (list.hasNext()) 
            {
                add(withText(((StringPair)list.next()).value).spanAll().build());
            }
        }
    }

    private void addWarnings(List list)
    {
        if (!list.isEmpty())
        {
            add(divider(6));
            add(withTitle(0x7f0901b7));
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Object obj = (StringPair)list.next();
                String s = ((StringPair) (obj)).name;
                obj = ((StringPair) (obj)).value;
                if (!TextUtils.isEmpty(s) || !TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    add(divider(1));
                    if (!TextUtils.isEmpty(s))
                    {
                        add(withText(s).bold().spanAll().build());
                    }
                    if (!TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        add(withText(((String) (obj))).spanAll().build());
                    }
                }
            } while (true);
        }
    }

    private GridTextBuilder withText(int i)
    {
        return (new GridTextBuilder((GridLayout)mView)).text(i);
    }

    private GridTextBuilder withText(String s)
    {
        return (new GridTextBuilder((GridLayout)mView)).text(s);
    }

    private TextView withTitle(int i)
    {
        return (new GridTextBuilder((GridLayout)mView)).text(i).size(20).bold().spanAll().build();
    }

    public View build(DrugFacts drugfacts)
    {
        if (drugfacts == null)
        {
            return null;
        } else
        {
            addActiveIngredients(drugfacts.activeIngredients);
            addWarnings(drugfacts.warnings);
            addDirections(drugfacts.directions);
            addInactiveIngredients(drugfacts.inactiveIngredients);
            addInfo(drugfacts.info);
            addQuestions(drugfacts.questions);
            return mView;
        }
    }
}
