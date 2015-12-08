// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.news;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.Weather.feed.Module;
import com.weather.commons.analytics.feed.LocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.news.provider.ArticlePojo;
import com.weather.commons.news.provider.Variants;

public abstract class AbstractSingleArticleModule extends Module
{

    private ImageView image;
    private android.view.ViewGroup.LayoutParams layoutParams;
    private View moduleView;
    Picasso picasso;
    private TextView title;

    protected AbstractSingleArticleModule(Context context, ModuleConfig moduleconfig, Handler handler, LocalyticsModuleHandler localyticsmodulehandler)
    {
        super(context, moduleconfig, handler, localyticsmodulehandler);
    }

    private void hide()
    {
        moduleView.setOnClickListener(null);
        if (isHideable)
        {
            moduleView.setLayoutParams(new android.widget.AbsListView.LayoutParams(layoutParams.width, 1));
            setActive(false);
            return;
        } else
        {
            setActive(true);
            moduleView.setLayoutParams(layoutParams);
            title.setText(0x7f070307);
            image.setVisibility(8);
            return;
        }
    }

    private void show(ArticlePojo articlepojo)
    {
        setActive(true);
        moduleView.setLayoutParams(layoutParams);
        image.setVisibility(0);
        if (articlepojo.variants != null)
        {
            picasso.load(articlepojo.variants._11).into(image);
        }
        title.setText(articlepojo.teaserTitle);
        moduleView.setOnClickListener(new _cls1(articlepojo));
    }

    protected View createView(ViewGroup viewgroup)
    {
        moduleView = LayoutInflater.from(context).inflate(0x7f03009a, viewgroup, false);
        image = (ImageView)moduleView.findViewById(0x7f0d025b);
        title = (TextView)moduleView.findViewById(0x7f0d006b);
        layoutParams = moduleView.getLayoutParams();
        return moduleView;
    }

    protected abstract void onArticleClicked(ArticlePojo articlepojo);

    protected void updateUi(ArticlePojo articlepojo)
    {
        if (articlepojo == null)
        {
            hide();
            return;
        } else
        {
            show(articlepojo);
            return;
        }
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((ArticlePojo)obj);
    }

    /* member class not found */
    class _cls1 {}

}
