// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push.alertmessages;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.weather.ads2.targeting.AdTargetingParam;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.push.ProductType;
import com.weather.util.app.AbstractTwcApplication;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.weather.commons.push.alertmessages:
//            AlertMessage

public class BreakingNewsAlertMessage extends AlertMessage
{

    private String articleId;
    private String articleUrl;
    private String imgSrc;
    private String product;
    private String title;

    public BreakingNewsAlertMessage(String s, String s1, String s2, String s3, String s4)
    {
        product = s;
        articleId = s1;
        articleUrl = s2;
        imgSrc = s3;
        title = s4;
    }

    public Map getAdTargeting()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put(AdTargetingParam.ALERT.getParameterKey(), "breaking");
        return hashmap;
    }

    public String getArticleId()
    {
        return articleId;
    }

    public int getColor(Context context)
    {
        return context.getResources().getColor(com.weather.commons.R.color.breaking_news_notification_color);
    }

    public String getDescription()
    {
        return AbstractTwcApplication.getRootContext().getString(com.weather.commons.R.string.breaking_news_activity_label);
    }

    public String getImgSrc()
    {
        return imgSrc;
    }

    public Bitmap getLargeIcon(Context context)
    {
        return ((BitmapDrawable)context.getResources().getDrawable(com.weather.commons.R.drawable.breaking_news_notification)).getBitmap();
    }

    public String getPresentationName()
    {
        return title;
    }

    public int getPriority()
    {
        return 1;
    }

    public String getProduct()
    {
        return product;
    }

    public String getProductCode()
    {
        return ProductType.PRODUCT_BREAKINGNEWS.getProductName();
    }

    public String getSharedUrl(LocationManager locationmanager, ConfigurationManagers configurationmanagers)
    {
        if (articleUrl == null)
        {
            return "http://www.weather.com";
        } else
        {
            return articleUrl;
        }
    }

    public int getSmallIcon()
    {
        return com.weather.commons.R.drawable.breaking_news_icon_leveled;
    }

    public String getTitle()
    {
        return title;
    }

    protected String getUrlTemplate(ConfigurationManagers configurationmanagers)
    {
        return "http://www.weather.com";
    }

    public void setArticleId(String s)
    {
        articleId = s;
    }

    public void setArticleUrl(String s)
    {
        articleUrl = s;
    }

    public void setImgSrc(String s)
    {
        imgSrc = s;
    }

    public void setProduct(String s)
    {
        product = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
