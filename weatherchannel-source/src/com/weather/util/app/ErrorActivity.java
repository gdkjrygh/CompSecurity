// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ErrorActivity extends Activity
{

    public ErrorActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        TextView textview;
        if (bundle == null)
        {
            bundle = "none";
        } else
        {
            bundle = bundle.getStringExtra("LOC");
        }
        textview = new TextView(this);
        textview.setLines(5);
        textview.setText((new StringBuilder()).append('(').append(bundle).append(") You have encountered an OUT OF MEMORY EXCEPTION. The app has saved a file to your phone which is crucial to resolving such issues.  ").append("Please contact ralph.mueller@weather.com.  Please press HOME to exit").toString());
        setContentView(textview);
    }
}
