// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view.builder;

import android.content.Context;
import android.support.v7.widget.GridLayout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.walmart.android.service.item.StringPair;
import com.walmart.android.service.item.model.Nutrition;
import com.walmart.android.utils.ViewUtil;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.app.item.view.builder:
//            TableGridViewBuilder, ViewBuilder

public class NutritionViewBuilder extends TableGridViewBuilder
{

    private static final int DIVIDER_LARGE_THICKNESS_DP = 10;
    private static final int DIVIDER_MEDIUM_THICKNESS_DP = 5;
    private static final int DIVIDER_SMALL_THICKNESS_DP = 1;
    private static final int INDENT_DP = 20;
    private static final int N_COLUMNS = 2;
    private static final int PADDING_DP = 10;
    private static final int TEXT_ZOOM = 75;
    private static final int TOP_MARGIN_STATIC_CONTENT_DP = 20;
    private final int mLeftIndent;
    private final int mPadding;
    private final int mTopMarginStaticContent;

    public NutritionViewBuilder(Context context)
    {
        super(context, 2);
        mLeftIndent = ViewUtil.dpToPixels(20, context);
        mPadding = ViewUtil.dpToPixels(10, context);
        mTopMarginStaticContent = ViewUtil.dpToPixels(20, context);
    }

    private void addCalorieInformation(List list)
    {
        if (!list.isEmpty())
        {
            add(divider(10));
            add(text(0x7f0901af)).withLayout(layout().span(2));
            boolean flag = true;
            list = list.iterator();
            while (list.hasNext()) 
            {
                com.walmart.android.service.item.model.Nutrition.Nutrient nutrient = (com.walmart.android.service.item.model.Nutrition.Nutrient)list.next();
                add(divider(1));
                if (flag)
                {
                    add(text(nutrient.name).bold());
                } else
                {
                    add(text(nutrient.name)).withLayout(layout().leftMargin(mLeftIndent));
                }
                add(text(nutrient.amount)).withLayout(layout().column(1).align(GridLayout.RIGHT));
                flag = false;
            }
        }
    }

    private void addKeyNutrients(List list)
    {
        if (!list.isEmpty())
        {
            add(divider(5));
            add(text(0x7f0901bc).bold()).withLayout(layout().span(2).align(GridLayout.RIGHT));
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
            list = list.iterator();
            while (list.hasNext()) 
            {
                Object obj = (com.walmart.android.service.item.model.Nutrition.Nutrient)list.next();
                add(divider(1));
                spannablestringbuilder.clear();
                spannablestringbuilder.append(((com.walmart.android.service.item.model.Nutrition.Nutrient) (obj)).name).setSpan(new StyleSpan(1), 0, spannablestringbuilder.length(), 17);
                add(text(spannablestringbuilder.append(" ").append(((com.walmart.android.service.item.model.Nutrition.Nutrient) (obj)).amount)));
                add(text(((com.walmart.android.service.item.model.Nutrition.Nutrient) (obj)).dvp).bold()).withLayout(layout().column(1).align(GridLayout.RIGHT));
                obj = ((com.walmart.android.service.item.model.Nutrition.Nutrient) (obj)).children.iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    com.walmart.android.service.item.model.Nutrition.Nutrient nutrient = (com.walmart.android.service.item.model.Nutrition.Nutrient)((Iterator) (obj)).next();
                    add(divider(1));
                    add(text((new StringBuilder()).append(nutrient.name).append(" ").append(nutrient.amount).toString())).withLayout(layout().leftMargin(mLeftIndent));
                    add(text(nutrient.dvp).bold()).withLayout(layout().column(1).align(GridLayout.RIGHT));
                }
            }
        }
    }

    private void addServingInformation(List list)
    {
        if (!list.isEmpty())
        {
            StringPair stringpair;
            for (list = list.iterator(); list.hasNext(); add(text((new StringBuilder()).append(stringpair.name).append(" ").append(stringpair.value).toString())).withLayout(layout().span(2)))
            {
                stringpair = (StringPair)list.next();
            }

        }
    }

    private void addStaticContent(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            WebView webview = new WebView(mContext);
            webview.loadData(s, "text/html", "UTF-8");
            webview.getSettings().setTextZoom(75);
            add(webview).withLayout(layout().span(2).topMargin(mTopMarginStaticContent));
        }
    }

    private void addVitaminsMinerals(List list)
    {
        if (!list.isEmpty())
        {
            add(divider(5));
            list = list.iterator();
            while (list.hasNext()) 
            {
                com.walmart.android.service.item.model.Nutrition.Nutrient nutrient = (com.walmart.android.service.item.model.Nutrition.Nutrient)list.next();
                add(divider(1));
                add(text(nutrient.name));
                add(text(nutrient.dvp).bold()).withLayout(layout().column(1).align(GridLayout.RIGHT));
            }
        }
    }

    public View build(Nutrition nutrition)
    {
        if (nutrition == null)
        {
            return null;
        } else
        {
            ((GridLayout)mView).setPadding(mPadding, mPadding, mPadding, mPadding);
            addServingInformation(nutrition.servingInformation);
            addCalorieInformation(nutrition.calorieInformation);
            addKeyNutrients(nutrition.keyNutrients);
            addVitaminsMinerals(nutrition.vitaminsMinerals);
            addStaticContent(nutrition.staticContent);
            return mView;
        }
    }

    protected View divider(int i)
    {
        if (mView instanceof GridLayout)
        {
            View view = new View(mContext);
            view.setBackgroundColor(0xff000000);
            android.support.v7.widget.GridLayout.LayoutParams layoutparams = new android.support.v7.widget.GridLayout.LayoutParams();
            layoutparams.height = ViewUtil.dpToPixels(i, mContext);
            layoutparams.columnSpec = GridLayout.spec(0, ((GridLayout)mView).getColumnCount());
            view.setLayoutParams(layoutparams);
            return view;
        } else
        {
            throw new IllegalStateException("mView must be a GridLayout");
        }
    }
}
