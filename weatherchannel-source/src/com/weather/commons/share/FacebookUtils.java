// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.weather.util.intent.MimeType;

public final class FacebookUtils
{

    private static final String EXTRA_APP_ID = "com.facebook.platform.extra.APPLICATION_ID";
    private static final String FACEBOOK = "com.facebook.katana";
    private static final int SHARE_TO_FACEBOOK_REQUEST_CODE = 27;

    private FacebookUtils()
    {
    }

    public static Intent getBaselineShareIntent(Context context)
    {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setPackage("com.facebook.katana");
        intent.putExtra("com.facebook.platform.extra.APPLICATION_ID", context.getString(com.weather.commons.R.string.iphone_facebook_app_id));
        intent.setType(MimeType.TEXT_PLAIN.getMimeString());
        return intent;
    }

    public static Intent getMediaShareIntent(Context context, Uri uri, MimeType mimetype)
    {
        context = getBaselineShareIntent(context);
        context.setType(mimetype.getMimeString());
        context.putExtra("android.intent.extra.STREAM", uri);
        return context;
    }

    public static void share(Activity activity, Intent intent)
    {
        activity.startActivityForResult(intent, 27);
    }
}
