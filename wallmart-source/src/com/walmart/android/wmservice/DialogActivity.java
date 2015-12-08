// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DialogActivity extends Activity
{

    public static final String EXTRA_MESSAGE = "msg";
    public static final String EXTRA_TITLE = "title";

    public DialogActivity()
    {
    }

    public static void ShowDialog(String s, String s1, Context context)
    {
        Intent intent = new Intent(context, com/walmart/android/wmservice/DialogActivity);
        intent.setFlags(0x10000000);
        intent.putExtra("title", s);
        intent.putExtra("msg", s1);
        context.startActivity(intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Object obj = getIntent();
        bundle = ((Intent) (obj)).getStringExtra("title");
        obj = ((Intent) (obj)).getStringExtra("msg");
        if (bundle != null)
        {
            setTitle(bundle);
        }
        setContentView(0x7f04009b);
        if (obj != null)
        {
            ((TextView)findViewById(0x7f100090)).setText(((CharSequence) (obj)));
        }
        findViewById(0x7f100094).setOnClickListener(new android.view.View.OnClickListener() {

            final DialogActivity this$0;

            public void onClick(View view)
            {
                finish();
            }

            
            {
                this$0 = DialogActivity.this;
                super();
            }
        });
    }

    public boolean onSearchRequested()
    {
        return false;
    }
}
