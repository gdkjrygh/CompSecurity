// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import com.google.android.youtube.player.internal.ah;
import com.google.android.youtube.player.internal.b.b;

// Referenced classes of package com.google.android.youtube.player:
//            c, d

public final class YouTubeInitializationResult extends Enum
{

    private static final YouTubeInitializationResult $VALUES[];
    public static final YouTubeInitializationResult CLIENT_LIBRARY_UPDATE_REQUIRED;
    public static final YouTubeInitializationResult DEVELOPER_KEY_INVALID;
    public static final YouTubeInitializationResult ERROR_CONNECTING_TO_SERVICE;
    public static final YouTubeInitializationResult INTERNAL_ERROR;
    public static final YouTubeInitializationResult INVALID_APPLICATION_SIGNATURE;
    public static final YouTubeInitializationResult NETWORK_ERROR;
    public static final YouTubeInitializationResult SERVICE_DISABLED;
    public static final YouTubeInitializationResult SERVICE_INVALID;
    public static final YouTubeInitializationResult SERVICE_MISSING;
    public static final YouTubeInitializationResult SERVICE_VERSION_UPDATE_REQUIRED;
    public static final YouTubeInitializationResult SUCCESS;
    public static final YouTubeInitializationResult UNKNOWN_ERROR;

    private YouTubeInitializationResult(String s, int i)
    {
        super(s, i);
    }

    private Intent getRecoveryIntent(Context context)
    {
        switch (c.a[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
        case 3: // '\003'
            return b.b(b.a(context));

        case 2: // '\002'
            return b.a(b.a(context));
        }
    }

    public static YouTubeInitializationResult valueOf(String s)
    {
        return (YouTubeInitializationResult)Enum.valueOf(com/google/android/youtube/player/YouTubeInitializationResult, s);
    }

    public static YouTubeInitializationResult[] values()
    {
        return (YouTubeInitializationResult[])$VALUES.clone();
    }

    public final Dialog getErrorDialog(Activity activity, int i)
    {
        return getErrorDialog(activity, i, null);
    }

    public final Dialog getErrorDialog(Activity activity, int i, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        if (oncancellistener != null)
        {
            builder.setOnCancelListener(oncancellistener);
        }
        oncancellistener = new d(activity, getRecoveryIntent(activity), i);
        activity = new ah(activity);
        switch (c.a[ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected errorReason: ")).append(name()).toString());

        case 1: // '\001'
            return builder.setTitle(((ah) (activity)).b).setMessage(((ah) (activity)).c).setPositiveButton(((ah) (activity)).d, oncancellistener).create();

        case 2: // '\002'
            return builder.setTitle(((ah) (activity)).e).setMessage(((ah) (activity)).f).setPositiveButton(((ah) (activity)).g, oncancellistener).create();

        case 3: // '\003'
            return builder.setTitle(((ah) (activity)).h).setMessage(((ah) (activity)).i).setPositiveButton(((ah) (activity)).j, oncancellistener).create();
        }
    }

    public final boolean isUserRecoverableError()
    {
        switch (c.a[ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return true;
        }
    }

    static 
    {
        SUCCESS = new YouTubeInitializationResult("SUCCESS", 0);
        INTERNAL_ERROR = new YouTubeInitializationResult("INTERNAL_ERROR", 1);
        UNKNOWN_ERROR = new YouTubeInitializationResult("UNKNOWN_ERROR", 2);
        SERVICE_MISSING = new YouTubeInitializationResult("SERVICE_MISSING", 3);
        SERVICE_VERSION_UPDATE_REQUIRED = new YouTubeInitializationResult("SERVICE_VERSION_UPDATE_REQUIRED", 4);
        SERVICE_DISABLED = new YouTubeInitializationResult("SERVICE_DISABLED", 5);
        SERVICE_INVALID = new YouTubeInitializationResult("SERVICE_INVALID", 6);
        ERROR_CONNECTING_TO_SERVICE = new YouTubeInitializationResult("ERROR_CONNECTING_TO_SERVICE", 7);
        CLIENT_LIBRARY_UPDATE_REQUIRED = new YouTubeInitializationResult("CLIENT_LIBRARY_UPDATE_REQUIRED", 8);
        NETWORK_ERROR = new YouTubeInitializationResult("NETWORK_ERROR", 9);
        DEVELOPER_KEY_INVALID = new YouTubeInitializationResult("DEVELOPER_KEY_INVALID", 10);
        INVALID_APPLICATION_SIGNATURE = new YouTubeInitializationResult("INVALID_APPLICATION_SIGNATURE", 11);
        $VALUES = (new YouTubeInitializationResult[] {
            SUCCESS, INTERNAL_ERROR, UNKNOWN_ERROR, SERVICE_MISSING, SERVICE_VERSION_UPDATE_REQUIRED, SERVICE_DISABLED, SERVICE_INVALID, ERROR_CONNECTING_TO_SERVICE, CLIENT_LIBRARY_UPDATE_REQUIRED, NETWORK_ERROR, 
            DEVELOPER_KEY_INVALID, INVALID_APPLICATION_SIGNATURE
        });
    }
}
