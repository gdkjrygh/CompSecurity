// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import android.content.Intent;
import android.os.Parcel;
import android.util.Base64;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

// Referenced classes of package com.samsung.android.sdk.richnotification:
//            SrnValidationException

public abstract class SrnAction
{
    protected static final class ActionType extends Enum
    {

        private static final ActionType ENUM$VALUES[];
        public static final ActionType HOST;
        public static final ActionType REMOTE_BUILT_IN;
        public static final ActionType REMOTE_INPUT;
        public static final ActionType REMOTE_LAUNCH;

        public static ActionType valueOf(String s)
        {
            return (ActionType)Enum.valueOf(com/samsung/android/sdk/richnotification/SrnAction$ActionType, s);
        }

        public static ActionType[] values()
        {
            ActionType aactiontype[] = ENUM$VALUES;
            int i = aactiontype.length;
            ActionType aactiontype1[] = new ActionType[i];
            System.arraycopy(aactiontype, 0, aactiontype1, 0, i);
            return aactiontype1;
        }

        static 
        {
            HOST = new ActionType("HOST", 0);
            REMOTE_BUILT_IN = new ActionType("REMOTE_BUILT_IN", 1);
            REMOTE_LAUNCH = new ActionType("REMOTE_LAUNCH", 2);
            REMOTE_INPUT = new ActionType("REMOTE_INPUT", 3);
            ENUM$VALUES = (new ActionType[] {
                HOST, REMOTE_BUILT_IN, REMOTE_LAUNCH, REMOTE_INPUT
            });
        }

        private ActionType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class CallbackIntent
    {

        private final Intent mIntent;

        public static CallbackIntent getActivityCallback(Intent intent)
        {
            return new CallbackIntent(intent, CallbackType.ACTIVITY_CALLBACK);
        }

        public static CallbackIntent getBroadcastCallback(Intent intent)
        {
            return new CallbackIntent(intent, CallbackType.BROADCAST_CALLBACK);
        }

        public static CallbackIntent getServiceCallback(Intent intent)
        {
            return new CallbackIntent(intent, CallbackType.SERVICE_CALLBACK);
        }


        private CallbackIntent(Intent intent, CallbackType callbacktype)
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

    private static final class CallbackIntent.CallbackType extends Enum
    {

        public static final CallbackIntent.CallbackType ACTIVITY_CALLBACK;
        public static final CallbackIntent.CallbackType BROADCAST_CALLBACK;
        private static final CallbackIntent.CallbackType ENUM$VALUES[];
        public static final CallbackIntent.CallbackType SERVICE_CALLBACK;
        private final String mAbbreviation;

        private String getAbbreviation()
        {
            return mAbbreviation;
        }

        public static CallbackIntent.CallbackType valueOf(String s)
        {
            return (CallbackIntent.CallbackType)Enum.valueOf(com/samsung/android/sdk/richnotification/SrnAction$CallbackIntent$CallbackType, s);
        }

        public static CallbackIntent.CallbackType[] values()
        {
            CallbackIntent.CallbackType acallbacktype[] = ENUM$VALUES;
            int i = acallbacktype.length;
            CallbackIntent.CallbackType acallbacktype1[] = new CallbackIntent.CallbackType[i];
            System.arraycopy(acallbacktype, 0, acallbacktype1, 0, i);
            return acallbacktype1;
        }

        static 
        {
            ACTIVITY_CALLBACK = new CallbackIntent.CallbackType("ACTIVITY_CALLBACK", 0, "a");
            BROADCAST_CALLBACK = new CallbackIntent.CallbackType("BROADCAST_CALLBACK", 1, "b");
            SERVICE_CALLBACK = new CallbackIntent.CallbackType("SERVICE_CALLBACK", 2, "s");
            ENUM$VALUES = (new CallbackIntent.CallbackType[] {
                ACTIVITY_CALLBACK, BROADCAST_CALLBACK, SERVICE_CALLBACK
            });
        }


        private CallbackIntent.CallbackType(String s, int i, String s1)
        {
            super(s, i);
            mAbbreviation = s1;
        }
    }

    static final class CallbackIntentSerializer
        implements JsonSerializer
    {

        public JsonElement serialize(CallbackIntent callbackintent, Type type, JsonSerializationContext jsonserializationcontext)
        {
            type = Parcel.obtain();
            callbackintent.mIntent.writeToParcel(type, 0);
            callbackintent = type.marshall();
            type.recycle();
            return new JsonPrimitive(Base64.encodeToString(callbackintent, 2));
        }

        public volatile JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonserializationcontext)
        {
            return serialize((CallbackIntent)obj, type, jsonserializationcontext);
        }

        CallbackIntentSerializer()
        {
        }
    }


    private static int incrementalID = 0;
    private CallbackIntent mCallbackIntent;
    private final String mId;
    private final String mLabel;
    private final ActionType mType;

    protected SrnAction(ActionType actiontype, String s)
    {
        if (s == null)
        {
            throw new NullPointerException("label is null.");
        }
        if (s.isEmpty())
        {
            throw new IllegalArgumentException("label is an empty string.");
        } else
        {
            int i = incrementalID + 1;
            incrementalID = i;
            mId = Integer.toString(i);
            mType = actiontype;
            mLabel = s;
            return;
        }
    }

    protected SrnAction(SrnAction srnaction)
    {
        mId = srnaction.mId;
        mType = srnaction.mType;
        mLabel = srnaction.mLabel;
        mCallbackIntent = srnaction.mCallbackIntent;
    }

    protected abstract SrnAction cloneSelf();

    protected String getLabel()
    {
        return mLabel;
    }

    public void setCallbackIntent(CallbackIntent callbackintent)
    {
        mCallbackIntent = callbackintent;
    }

    protected void validateSelf()
        throws SrnValidationException
    {
    }

}
