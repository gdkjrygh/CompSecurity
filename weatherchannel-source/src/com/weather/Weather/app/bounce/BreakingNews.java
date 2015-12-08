// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app.bounce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.weather.commons.news.ui.BreakingNewsActivity;
import com.weather.commons.push.AlertList;
import com.weather.commons.push.AlertResponseField;

public class BreakingNews extends Activity
{

    public BreakingNews()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        if (bundle != null)
        {
            Intent intent = new Intent(bundle);
            AlertList.breakingNewsList.clearList();
            Object obj = bundle.getExtras();
            if (obj != null)
            {
                obj = ((Bundle) (obj)).getString(AlertResponseField.ARTICLE_ID.getName());
                java.io.Serializable serializable = bundle.getSerializableExtra("com.weather.extraAdTargeting");
                intent.setClass(this, com/weather/commons/news/ui/BreakingNewsActivity);
                intent.putExtra("com.weather.extraAdTargeting", serializable);
                intent.putExtra("ArticleId", ((String) (obj)));
                intent.putExtra("com.weather.moduleId", "breaking-news");
                bundle.addFlags(0x4000000);
                startActivity(intent);
            }
        }
        finish();
    }
}
