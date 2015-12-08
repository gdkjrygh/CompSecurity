// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.locations;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.SearchView;
import com.weather.commons.locations.SearchUtil;
import com.weather.dal2.net.Receiver;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class TypeAheadSearchViewUtil extends SearchUtil
{

    private static final String TAG = "WcSearchUtil";
    private static final double TEXT_SIZE_FACTOR = 1.25D;
    private static final int UPS_DIALOG_DELAY = 2000;

    public TypeAheadSearchViewUtil(Menu menu, int i, Receiver receiver)
    {
        super(menu, i, receiver);
    }

    public TypeAheadSearchViewUtil(SearchView searchview, Receiver receiver)
    {
        super(searchview, receiver);
    }

    public void clickSearchItem()
    {
        if (searchItem != null)
        {
            searchItem.expandActionView();
            if (searchView != null)
            {
                searchView.requestFocus();
            }
        }
    }

    public void doSearch(CharSequence charsequence)
    {
        if (searchView != null)
        {
            searchView.setQuery(charsequence, false);
        }
    }

    public void setupMainFeedSearchView(Activity activity, int i)
    {
        Resources resources;
        Drawable drawable;
        if (searchView == null)
        {
            return;
        }
        resources = searchView.getContext().getResources();
        setTextColor(i, resources);
        setSearchViewListenerAndAdapter(activity);
    /* block-local class not found */
    class MainFeedSearchViewOnSuggestionListener {}

        searchView.setOnSuggestionListener(new MainFeedSearchViewOnSuggestionListener(activity, receiver));
        i = resources.getIdentifier("android:id/search_src_text", null, null);
        activity = searchView.findViewById(i);
        drawable = resources.getDrawable(0x7f0200ab);
        Class class1;
        SpannableStringBuilder spannablestringbuilder;
        class1 = Class.forName("android.widget.SearchView$SearchAutoComplete");
        spannablestringbuilder = new SpannableStringBuilder("   ");
        spannablestringbuilder.append(resources.getString(0x7f070269));
        i = (int)((double)((Float)class1.getMethod("getTextSize", new Class[0]).invoke(activity, new Object[0])).floatValue() * 1.25D);
        if (drawable == null)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        drawable.setBounds(0, 0, i, i);
        spannablestringbuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
        class1.getMethod("setHint", new Class[] {
            java/lang/CharSequence
        }).invoke(activity, new Object[] {
            spannablestringbuilder
        });
_L2:
        i = searchView.getContext().getResources().getIdentifier("android:id/search_close_btn", null, null);
        ((ImageView)searchView.findViewById(i)).setImageResource(0x7f02009d);
        return;
        activity;
        LogUtil.e("WcSearchUtil", LoggingMetaTags.TWC_UI, (new StringBuilder()).append("Error accessing class SearchView$SearchAutoComplete:").append(activity).toString(), new Object[0]);
        continue; /* Loop/switch isn't completed */
        activity;
        LogUtil.e("WcSearchUtil", LoggingMetaTags.TWC_UI, (new StringBuilder()).append("Error settings text size for search view:").append(activity).toString(), new Object[0]);
        continue; /* Loop/switch isn't completed */
        activity;
        LogUtil.e("WcSearchUtil", LoggingMetaTags.TWC_UI, (new StringBuilder()).append("Error accessing search view:").append(activity).toString(), new Object[0]);
        continue; /* Loop/switch isn't completed */
        activity;
        LogUtil.e("WcSearchUtil", LoggingMetaTags.TWC_UI, (new StringBuilder()).append("Error setting hint for search view:").append(activity).toString(), new Object[0]);
        if (true) goto _L2; else goto _L1
_L1:
    }

}
