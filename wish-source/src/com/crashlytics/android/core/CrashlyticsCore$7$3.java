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

class this._cls1
    implements android.content.ickListener
{

    final nLatch.setOptIn this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        setShouldSendUserReportsWithoutPrompting(true);
        latch.setOptIn(true);
        dialoginterface.dismiss();
    }

    tingsData()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/crashlytics/android/core/CrashlyticsCore$7

/* anonymous class */
    class CrashlyticsCore._cls7
        implements Runnable
    {

        final CrashlyticsCore this$0;
        final Activity val$activity;
        final CrashlyticsCore.OptInLatch val$latch;
        final PromptSettingsData val$promptData;
        final DialogStringResolver val$stringResolver;

        public void run()
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
            android.content.DialogInterface.OnClickListener onclicklistener = new CrashlyticsCore._cls7._cls1();
            float f = activity.getResources().getDisplayMetrics().density;
            int i = CrashlyticsCore.access$300(CrashlyticsCore.this, f, 5);
            TextView textview = new TextView(activity);
            textview.setAutoLinkMask(15);
            textview.setText(stringResolver.getMessage());
            textview.setTextAppearance(activity, 0x1030044);
            textview.setPadding(i, i, i, i);
            textview.setFocusable(false);
            ScrollView scrollview = new ScrollView(activity);
            scrollview.setPadding(CrashlyticsCore.access$300(CrashlyticsCore.this, f, 14), CrashlyticsCore.access$300(CrashlyticsCore.this, f, 2), CrashlyticsCore.access$300(CrashlyticsCore.this, f, 10), CrashlyticsCore.access$300(CrashlyticsCore.this, f, 12));
            scrollview.addView(textview);
            builder.setView(scrollview).setTitle(stringResolver.getTitle()).setCancelable(false).setNeutralButton(stringResolver.getSendButtonTitle(), onclicklistener);
            if (promptData.showCancelButton)
            {
                android.content.DialogInterface.OnClickListener onclicklistener1 = new CrashlyticsCore._cls7._cls2();
                builder.setNegativeButton(stringResolver.getCancelButtonTitle(), onclicklistener1);
            }
            if (promptData.showAlwaysSendButton)
            {
                CrashlyticsCore._cls7._cls3 _lcls3 = new CrashlyticsCore._cls7._cls3();
                builder.setPositiveButton(stringResolver.getAlwaysSendButtonTitle(), _lcls3);
            }
            builder.show();
        }

            
            {
                this$0 = final_crashlyticscore;
                activity = activity1;
                latch = optinlatch;
                stringResolver = dialogstringresolver;
                promptData = PromptSettingsData.this;
                super();
            }

        // Unreferenced inner class com/crashlytics/android/core/CrashlyticsCore$7$1

/* anonymous class */
        class CrashlyticsCore._cls7._cls1
            implements android.content.DialogInterface.OnClickListener
        {

            final CrashlyticsCore._cls7 this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                latch.setOptIn(true);
                dialoginterface.dismiss();
            }

                    
                    {
                        this$1 = CrashlyticsCore._cls7.this;
                        super();
                    }
        }


        // Unreferenced inner class com/crashlytics/android/core/CrashlyticsCore$7$2

/* anonymous class */
        class CrashlyticsCore._cls7._cls2
            implements android.content.DialogInterface.OnClickListener
        {

            final CrashlyticsCore._cls7 this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                latch.setOptIn(false);
                dialoginterface.dismiss();
            }

                    
                    {
                        this$1 = CrashlyticsCore._cls7.this;
                        super();
                    }
        }

    }

}
