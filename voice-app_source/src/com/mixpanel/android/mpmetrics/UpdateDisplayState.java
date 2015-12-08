// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MPConfig, InAppNotification, Survey

public class UpdateDisplayState
    implements Parcelable
{
    public static class AnswerMap
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public AnswerMap createFromParcel(Parcel parcel)
            {
                Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap.getClassLoader());
                AnswerMap answermap = new AnswerMap();
                bundle.readFromParcel(parcel);
                parcel = bundle.keySet().iterator();
                do
                {
                    if (!parcel.hasNext())
                    {
                        return answermap;
                    }
                    String s = (String)parcel.next();
                    answermap.put(Integer.valueOf(s), bundle.getString(s));
                } while (true);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public AnswerMap[] newArray(int i)
            {
                return new AnswerMap[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private final HashMap mMap = new HashMap();

        public boolean contentEquals(AnswerMap answermap)
        {
            return mMap.equals(answermap.mMap);
        }

        public int describeContents()
        {
            return 0;
        }

        public String get(Integer integer)
        {
            return (String)mMap.get(integer);
        }

        public void put(Integer integer, String s)
        {
            mMap.put(integer, s);
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            Bundle bundle = new Bundle();
            Iterator iterator = mMap.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    parcel.writeBundle(bundle);
                    return;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                bundle.putString(Integer.toString(((Integer)entry.getKey()).intValue()), (String)entry.getValue());
            } while (true);
        }


        public AnswerMap()
        {
        }
    }

    public static abstract class DisplayState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public DisplayState createFromParcel(Parcel parcel)
            {
                Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState.getClassLoader());
                bundle.readFromParcel(parcel);
                parcel = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY");
                bundle = bundle.getBundle("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY");
                if ("InAppNotificationState".equals(parcel))
                {
                    return new DisplayState.InAppNotificationState(bundle, null);
                }
                if ("SurveyState".equals(parcel))
                {
                    return new DisplayState.SurveyState(bundle, null);
                } else
                {
                    throw new RuntimeException((new StringBuilder("Unrecognized display state type ")).append(parcel).toString());
                }
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public DisplayState[] newArray(int i)
            {
                return new DisplayState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public static final String STATE_IMPL_KEY = "com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY";
        public static final String STATE_TYPE_KEY = "com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY";

        public abstract String getType();


        private DisplayState()
        {
        }

        DisplayState(DisplayState displaystate)
        {
            this();
        }
    }

    public static final class DisplayState.InAppNotificationState extends DisplayState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public DisplayState.InAppNotificationState createFromParcel(Parcel parcel)
            {
                Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState.getClassLoader());
                bundle.readFromParcel(parcel);
                return new DisplayState.InAppNotificationState(bundle, null);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public DisplayState.InAppNotificationState[] newArray(int i)
            {
                return new DisplayState.InAppNotificationState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private static String HIGHLIGHT_KEY = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.HIGHLIGHT_KEY";
        private static String INAPP_KEY = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.INAPP_KEY";
        public static final String TYPE = "InAppNotificationState";
        private final int mHighlightColor;
        private final InAppNotification mInAppNotification;

        public int describeContents()
        {
            return 0;
        }

        public int getHighlightColor()
        {
            return mHighlightColor;
        }

        public InAppNotification getInAppNotification()
        {
            return mInAppNotification;
        }

        public String getType()
        {
            return "InAppNotificationState";
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable(INAPP_KEY, mInAppNotification);
            bundle.putInt(HIGHLIGHT_KEY, mHighlightColor);
            parcel.writeBundle(bundle);
        }


        private DisplayState.InAppNotificationState(Bundle bundle)
        {
            super(null);
            mInAppNotification = (InAppNotification)bundle.getParcelable(INAPP_KEY);
            mHighlightColor = bundle.getInt(HIGHLIGHT_KEY);
        }

        DisplayState.InAppNotificationState(Bundle bundle, DisplayState.InAppNotificationState inappnotificationstate)
        {
            this(bundle);
        }

        public DisplayState.InAppNotificationState(InAppNotification inappnotification, int i)
        {
            super(null);
            mInAppNotification = inappnotification;
            mHighlightColor = i;
        }
    }

    public static final class DisplayState.SurveyState extends DisplayState
    {

        private static final String ANSWERS_BUNDLE_KEY = "com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY";
        private static final String BACKGROUND_COMPRESSED_BUNDLE_KEY = "com.mixpanel.android.mpmetrics.UpdateDisplayState.BACKGROUND_COMPRESSED_BUNDLE_KEY";
        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public DisplayState.SurveyState createFromParcel(Parcel parcel)
            {
                Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState.getClassLoader());
                bundle.readFromParcel(parcel);
                return new DisplayState.SurveyState(bundle, null);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public DisplayState.SurveyState[] newArray(int i)
            {
                return new DisplayState.SurveyState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private static final String HIGHLIGHT_COLOR_BUNDLE_KEY = "com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY";
        private static final String SURVEY_BUNDLE_KEY = "com.mixpanel.android.mpmetrics.UpdateDisplayState.SURVEY_BUNDLE_KEY";
        public static final String TYPE = "SurveyState";
        private final AnswerMap mAnswers;
        private Bitmap mBackground;
        private int mHighlightColor;
        private final Survey mSurvey;

        public int describeContents()
        {
            return 0;
        }

        public AnswerMap getAnswers()
        {
            return mAnswers;
        }

        public Bitmap getBackground()
        {
            return mBackground;
        }

        public int getHighlightColor()
        {
            return mHighlightColor;
        }

        public Survey getSurvey()
        {
            return mSurvey;
        }

        public String getType()
        {
            return "SurveyState";
        }

        public void setBackground(Bitmap bitmap)
        {
            mBackground = bitmap;
        }

        public void setHighlightColor(int i)
        {
            mHighlightColor = i;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY", mHighlightColor);
            bundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY", mAnswers);
            byte abyte0[] = null;
            if (mBackground != null)
            {
                abyte0 = new ByteArrayOutputStream();
                mBackground.compress(android.graphics.Bitmap.CompressFormat.PNG, 20, abyte0);
                abyte0 = abyte0.toByteArray();
            }
            bundle.putByteArray("com.mixpanel.android.mpmetrics.UpdateDisplayState.BACKGROUND_COMPRESSED_BUNDLE_KEY", abyte0);
            bundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.SURVEY_BUNDLE_KEY", mSurvey);
            parcel.writeBundle(bundle);
        }


        private DisplayState.SurveyState(Bundle bundle)
        {
            super(null);
            mHighlightColor = bundle.getInt("com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY");
            mAnswers = (AnswerMap)bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY");
            byte abyte0[] = bundle.getByteArray("com.mixpanel.android.mpmetrics.UpdateDisplayState.BACKGROUND_COMPRESSED_BUNDLE_KEY");
            if (abyte0 != null)
            {
                mBackground = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
            } else
            {
                mBackground = null;
            }
            mSurvey = (Survey)bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.SURVEY_BUNDLE_KEY");
        }

        DisplayState.SurveyState(Bundle bundle, DisplayState.SurveyState surveystate)
        {
            this(bundle);
        }

        public DisplayState.SurveyState(Survey survey)
        {
            super(null);
            mSurvey = survey;
            mAnswers = new AnswerMap();
            mHighlightColor = 0xff000000;
            mBackground = null;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public UpdateDisplayState createFromParcel(Parcel parcel)
        {
            Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState.getClassLoader());
            bundle.readFromParcel(parcel);
            return new UpdateDisplayState(bundle, null);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public UpdateDisplayState[] newArray(int i)
        {
            return new UpdateDisplayState[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final String DISPLAYSTATE_BUNDLE_KEY = "com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY";
    private static final String DISTINCT_ID_BUNDLE_KEY = "com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY";
    private static final String LOGTAG = "MixpanelAPI.UpDisplSt";
    private static final long MAX_LOCK_TIME_MILLIS = 0x2932e00L;
    private static final String TOKEN_BUNDLE_KEY = "com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY";
    private static int sNextIntentId = 0;
    private static int sShowingIntentId = -1;
    private static final ReentrantLock sUpdateDisplayLock = new ReentrantLock();
    private static long sUpdateDisplayLockMillis = -1L;
    private static UpdateDisplayState sUpdateDisplayState = null;
    private final DisplayState mDisplayState;
    private final String mDistinctId;
    private final String mToken;

    private UpdateDisplayState(Bundle bundle)
    {
        mDistinctId = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY");
        mToken = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY");
        mDisplayState = (DisplayState)bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY");
    }

    UpdateDisplayState(Bundle bundle, UpdateDisplayState updatedisplaystate)
    {
        this(bundle);
    }

    UpdateDisplayState(DisplayState displaystate, String s, String s1)
    {
        mDistinctId = s;
        mToken = s1;
        mDisplayState = displaystate;
    }

    public static UpdateDisplayState claimDisplayState(int i)
    {
        sUpdateDisplayLock.lock();
        if (sShowingIntentId <= 0) goto _L2; else goto _L1
_L1:
        int j = sShowingIntentId;
        if (j == i) goto _L2; else goto _L3
_L3:
        sUpdateDisplayLock.unlock();
        return null;
_L2:
        if (sUpdateDisplayState == null) goto _L3; else goto _L4
_L4:
        UpdateDisplayState updatedisplaystate;
        sUpdateDisplayLockMillis = System.currentTimeMillis();
        sShowingIntentId = i;
        updatedisplaystate = sUpdateDisplayState;
        sUpdateDisplayLock.unlock();
        return updatedisplaystate;
        Exception exception;
        exception;
        sUpdateDisplayLock.unlock();
        throw exception;
    }

    static ReentrantLock getLockObject()
    {
        return sUpdateDisplayLock;
    }

    static boolean hasCurrentProposal()
    {
        if (!sUpdateDisplayLock.isHeldByCurrentThread())
        {
            throw new AssertionError();
        }
        long l = System.currentTimeMillis();
        long l1 = sUpdateDisplayLockMillis;
        if (sNextIntentId > 0 && l - l1 > 0x2932e00L)
        {
            Log.i("MixpanelAPI.UpDisplSt", "UpdateDisplayState set long, long ago, without showing. Update state will be cleared.");
            sUpdateDisplayState = null;
        }
        return sUpdateDisplayState != null;
    }

    static int proposeDisplay(DisplayState displaystate, String s, String s1)
    {
        int i = -1;
        if (!sUpdateDisplayLock.isHeldByCurrentThread())
        {
            throw new AssertionError();
        }
        if (!hasCurrentProposal())
        {
            sUpdateDisplayLockMillis = System.currentTimeMillis();
            sUpdateDisplayState = new UpdateDisplayState(displaystate, s, s1);
            sNextIntentId++;
            i = sNextIntentId;
        } else
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.UpDisplSt", "Already showing (or cooking) a Mixpanel update, declining to show another.");
            return -1;
        }
        return i;
    }

    public static void releaseDisplayState(int i)
    {
        sUpdateDisplayLock.lock();
        if (i == sShowingIntentId)
        {
            sShowingIntentId = -1;
            sUpdateDisplayState = null;
        }
        sUpdateDisplayLock.unlock();
        return;
        Exception exception;
        exception;
        sUpdateDisplayLock.unlock();
        throw exception;
    }

    public int describeContents()
    {
        return 0;
    }

    public DisplayState getDisplayState()
    {
        return mDisplayState;
    }

    public String getDistinctId()
    {
        return mDistinctId;
    }

    public String getToken()
    {
        return mToken;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY", mDistinctId);
        bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY", mToken);
        bundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY", mDisplayState);
        parcel.writeBundle(bundle);
    }

}
