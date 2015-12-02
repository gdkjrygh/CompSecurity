// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.notification;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class NotificationActionActivity extends Activity
{

    public NotificationActionActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new Intent();
        Intent intent = getIntent();
        int i = intent.getIntExtra("com.ubercab.client.EXTRA_MESSAGE_IDENTIFIER", 0);
        bundle.setAction(intent.getStringExtra("com.ubercab.client.EXTRA_ACTION"));
        bundle.putExtra("com.ubercab.client.EXTRA_MESSAGE_IDENTIFIER", i);
        sendOrderedBroadcast(bundle, null);
        finish();
        overridePendingTransition(0, 0);
    }
}
