// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import android.content.Intent;

// Referenced classes of package com.samsung.android.sdk.richnotification:
//            SrnAction

public static final class mIntent
{
    private static final class CallbackType extends Enum
    {

        public static final CallbackType ACTIVITY_CALLBACK;
        public static final CallbackType BROADCAST_CALLBACK;
        private static final CallbackType ENUM$VALUES[];
        public static final CallbackType SERVICE_CALLBACK;
        private final String mAbbreviation;

        private String getAbbreviation()
        {
            return mAbbreviation;
        }

        public static CallbackType valueOf(String s)
        {
            return (CallbackType)Enum.valueOf(com/samsung/android/sdk/richnotification/SrnAction$CallbackIntent$CallbackType, s);
        }

        public static CallbackType[] values()
        {
            CallbackType acallbacktype[] = ENUM$VALUES;
            int i = acallbacktype.length;
            CallbackType acallbacktype1[] = new CallbackType[i];
            System.arraycopy(acallbacktype, 0, acallbacktype1, 0, i);
            return acallbacktype1;
        }

        static 
        {
            ACTIVITY_CALLBACK = new CallbackType("ACTIVITY_CALLBACK", 0, "a");
            BROADCAST_CALLBACK = new CallbackType("BROADCAST_CALLBACK", 1, "b");
            SERVICE_CALLBACK = new CallbackType("SERVICE_CALLBACK", 2, "s");
            ENUM$VALUES = (new CallbackType[] {
                ACTIVITY_CALLBACK, BROADCAST_CALLBACK, SERVICE_CALLBACK
            });
        }


        private CallbackType(String s, int i, String s1)
        {
            super(s, i);
            mAbbreviation = s1;
        }
    }


    private final Intent mIntent;

    public static CallbackType getActivityCallback(Intent intent)
    {
        return new <init>(intent, CallbackType.ACTIVITY_CALLBACK);
    }

    public static CallbackType.ACTIVITY_CALLBACK getBroadcastCallback(Intent intent)
    {
        return new <init>(intent, CallbackType.BROADCAST_CALLBACK);
    }

    public static CallbackType.BROADCAST_CALLBACK getServiceCallback(Intent intent)
    {
        return new <init>(intent, CallbackType.SERVICE_CALLBACK);
    }


    private CallbackType(Intent intent, CallbackType callbacktype)
    {
        if (intent == null)
        {
            throw new NullPointerException("intent is null.");
        } else
        {
            intent.putExtra("RICH_NOTIFICATION_CALLBACK_INTENT_TYPE", callbacktype.getAbbreviation());
            mIntent = intent;
            return;
        }
    }
}
