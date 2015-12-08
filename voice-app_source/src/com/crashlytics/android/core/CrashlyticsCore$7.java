// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.ScrollView;
import android.widget.TextView;
import io.fabric.sdk.android.services.settings.PromptSettingsData;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsCore, DialogStringResolver

class ettingsData
    implements Runnable
{

    final CrashlyticsCore this$0;
    final Activity val$activity;
    final tInLatch val$latch;
    final PromptSettingsData val$promptData;
    final DialogStringResolver val$stringResolver;

    public void run()
    {
        android.app.r r = new android.app.r(val$activity);
        android.content.ClickListener clicklistener = new android.content.DialogInterface.OnClickListener() {

            final CrashlyticsCore._cls7 this$1;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                latch.setOptIn(true);
                dialoginterface.dismiss();
            }

            
            {
                this$1 = CrashlyticsCore._cls7.this;
                super();
            }
        };
        float f = val$activity.getResources().getDisplayMetrics().density;
        int i = CrashlyticsCore.access$300(CrashlyticsCore.this, f, 5);
        TextView textview = new TextView(val$activity);
        textview.setAutoLinkMask(15);
        textview.setText(val$stringResolver.getMessage());
        textview.setTextAppearance(val$activity, 0x1030044);
        textview.setPadding(i, i, i, i);
        textview.setFocusable(false);
        ScrollView scrollview = new ScrollView(val$activity);
        scrollview.setPadding(CrashlyticsCore.access$300(CrashlyticsCore.this, f, 14), CrashlyticsCore.access$300(CrashlyticsCore.this, f, 2), CrashlyticsCore.access$300(CrashlyticsCore.this, f, 10), CrashlyticsCore.access$300(CrashlyticsCore.this, f, 12));
        scrollview.addView(textview);
        r.setView(scrollview).setTitle(val$stringResolver.getTitle()).setCancelable(false).setNeutralButton(val$stringResolver.getSendButtonTitle(), clicklistener);
        if (val$promptData.showCancelButton)
        {
            android.content.ClickListener clicklistener1 = new android.content.DialogInterface.OnClickListener() {

                final CrashlyticsCore._cls7 this$1;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    latch.setOptIn(false);
                    dialoginterface.dismiss();
                }

            
            {
                this$1 = CrashlyticsCore._cls7.this;
                super();
            }
            };
            r.setNegativeButton(val$stringResolver.getCancelButtonTitle(), clicklistener1);
        }
        if (val$promptData.showAlwaysSendButton)
        {
            android.content.ClickListener clicklistener2 = new android.content.DialogInterface.OnClickListener() {

                final CrashlyticsCore._cls7 this$1;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    setShouldSendUserReportsWithoutPrompting(true);
                    latch.setOptIn(true);
                    dialoginterface.dismiss();
                }

            
            {
                this$1 = CrashlyticsCore._cls7.this;
                super();
            }
            };
            r.setPositiveButton(val$stringResolver.getAlwaysSendButtonTitle(), clicklistener2);
        }
        r.show();
    }

    ettingsData()
    {
        this$0 = final_crashlyticscore;
        val$activity = activity1;
        val$latch = tinlatch;
        val$stringResolver = dialogstringresolver;
        val$promptData = PromptSettingsData.this;
        super();
    }
}
