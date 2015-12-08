// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.share;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import com.weather.util.intent.MimeType;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Set;

public final class MessengerUtils
{

    private static final String AL_APPLINK_BUNDLE_EXTRA = "al_applink_data";
    private static final String BUNDLE_EXTRAS = "extras";
    private static final String EXTRA_APP_ID = "com.facebook.orca.extra.APPLICATION_ID";
    private static final String EXTRA_IS_REPLY = "com.facebook.orca.extra.IS_REPLY";
    private static final String EXTRA_METADATA = "com.facebook.orca.extra.METADATA";
    private static final String EXTRA_PROTOCOL_VERSION = "com.facebook.orca.extra.PROTOCOL_VERSION";
    private static final String EXTRA_THREAD_TOKEN = "com.facebook.orca.extra.THREAD_TOKEN";
    private static final String MESSENGER = "com.facebook.orca";
    private static final int PROTOCOL_VERSION = 0x133782a;
    public static final int SHARE_TO_MESSENGER_REQUEST_CODE = 11;
    private static final String TAG = "MessengerUtils";

    private MessengerUtils()
    {
    }

    public static Set getAllAvailableMessengerProtocolVersions(Context context)
    {
        Object obj;
        obj = context.getContentResolver();
        context = Sets.newHashSet();
        obj = ((ContentResolver) (obj)).query(Uri.parse("content://com.facebook.orca.provider.MessengerPlatformProvider/versions"), new String[] {
            "version"
        }, null, null, null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
_L1:
        int i;
        do
        {
            if (!((Cursor) (obj)).moveToNext())
            {
                break MISSING_BLOCK_LABEL_87;
            }
            i = ((Cursor) (obj)).getColumnIndex("version");
        } while (i == -1);
        context.add(Integer.valueOf(((Cursor) (obj)).getInt(i)));
          goto _L1
        context;
        ((Cursor) (obj)).close();
        throw context;
        ((Cursor) (obj)).close();
        return context;
    }

    public static Intent getBaselineShareIntent(Context context, String s)
    {
        Object obj = getAllAvailableMessengerProtocolVersions(context);
        if (!((Set) (obj)).contains(Integer.valueOf(0x133782a)))
        {
            LogUtil.d("MessengerUtils", LoggingMetaTags.TWC_WX_PICTURE, "Did not find expected protocol version %s in supported list %s", new Object[] {
                Integer.valueOf(0x133782a), obj
            });
        }
        obj = new Intent("android.intent.action.SEND");
        ((Intent) (obj)).setPackage("com.facebook.orca");
        ((Intent) (obj)).putExtra("com.facebook.orca.extra.PROTOCOL_VERSION", 0x133782a);
        ((Intent) (obj)).putExtra("com.facebook.orca.extra.APPLICATION_ID", context.getString(com.weather.commons.R.string.iphone_facebook_app_id));
        ((Intent) (obj)).setType(MimeType.TEXT_PLAIN.getMimeString());
        if (s != null)
        {
            ((Intent) (obj)).putExtra("com.facebook.orca.extra.METADATA", s);
        }
        return ((Intent) (obj));
    }

    public static Intent getMediaReplyIntent(Context context, Intent intent, Uri uri, MimeType mimetype, String s)
    {
        Preconditions.checkArgument(isReplyRequest(intent));
        Bundle bundle = intent.getBundleExtra("al_applink_data");
        Object obj = null;
        intent = obj;
        if (bundle != null)
        {
            bundle = bundle.getBundle("extras");
            intent = obj;
            if (bundle != null)
            {
                intent = bundle.getString("com.facebook.orca.extra.THREAD_TOKEN");
            }
        }
        context = getBaselineShareIntent(context, s);
        context.setType(mimetype.getMimeString());
        context.setData(uri);
        context.putExtra("com.facebook.orca.extra.THREAD_TOKEN", intent);
        return context;
    }

    public static Intent getMediaShareIntent(Context context, Uri uri, MimeType mimetype, String s)
    {
        context = getBaselineShareIntent(context, s);
        context.setType(mimetype.getMimeString());
        context.putExtra("android.intent.extra.STREAM", uri);
        return context;
    }

    public static String getMetadata(Intent intent)
    {
label0:
        {
            if (intent != null && "android.intent.action.PICK".equals(intent.getAction()))
            {
                intent = intent.getBundleExtra("al_applink_data");
                if (intent != null)
                {
                    intent = intent.getBundle("extras");
                    if (intent != null)
                    {
                        break label0;
                    }
                }
            }
            return null;
        }
        return intent.getString("com.facebook.orca.extra.METADATA", null);
    }

    public static boolean isReplyRequest(Intent intent)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (intent != null)
            {
                flag = flag1;
                if ("android.intent.action.PICK".equals(intent.getAction()))
                {
                    intent = intent.getBundleExtra("al_applink_data");
                    flag = flag1;
                    if (intent != null)
                    {
                        intent = intent.getBundle("extras");
                        if (intent == null || !intent.getBoolean("com.facebook.orca.extra.IS_REPLY", false))
                        {
                            break label0;
                        }
                        flag = true;
                    }
                }
            }
            return flag;
        }
        return false;
    }

    public static void reply(Activity activity, Intent intent)
    {
        activity.setResult(-1, intent);
        activity.finish();
    }

    public static void share(Activity activity, Intent intent)
    {
        activity.startActivityForResult(intent, 11);
    }
}
