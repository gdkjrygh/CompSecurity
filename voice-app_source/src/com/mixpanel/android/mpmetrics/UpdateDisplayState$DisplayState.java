// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            UpdateDisplayState, InAppNotification, Survey

public static abstract class <init>
    implements Parcelable
{
    public static final class InAppNotificationState extends UpdateDisplayState.DisplayState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public InAppNotificationState createFromParcel(Parcel parcel)
            {
                Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState.getClassLoader());
                bundle.readFromParcel(parcel);
                return new InAppNotificationState(bundle, null);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public InAppNotificationState[] newArray(int i)
            {
                return new InAppNotificationState[i];
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


        private InAppNotificationState(Bundle bundle)
        {
            super(null);
            mInAppNotification = (InAppNotification)bundle.getParcelable(INAPP_KEY);
            mHighlightColor = bundle.getInt(HIGHLIGHT_KEY);
        }

        InAppNotificationState(Bundle bundle, InAppNotificationState inappnotificationstate)
        {
            this(bundle);
        }

        public InAppNotificationState(InAppNotification inappnotification, int i)
        {
            super(null);
            mInAppNotification = inappnotification;
            mHighlightColor = i;
        }
    }

    public static final class SurveyState extends UpdateDisplayState.DisplayState
    {

        private static final String ANSWERS_BUNDLE_KEY = "com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY";
        private static final String BACKGROUND_COMPRESSED_BUNDLE_KEY = "com.mixpanel.android.mpmetrics.UpdateDisplayState.BACKGROUND_COMPRESSED_BUNDLE_KEY";
        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SurveyState createFromParcel(Parcel parcel)
            {
                Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState.getClassLoader());
                bundle.readFromParcel(parcel);
                return new SurveyState(bundle, null);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SurveyState[] newArray(int i)
            {
                return new SurveyState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private static final String HIGHLIGHT_COLOR_BUNDLE_KEY = "com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY";
        private static final String SURVEY_BUNDLE_KEY = "com.mixpanel.android.mpmetrics.UpdateDisplayState.SURVEY_BUNDLE_KEY";
        public static final String TYPE = "SurveyState";
        private final UpdateDisplayState.AnswerMap mAnswers;
        private Bitmap mBackground;
        private int mHighlightColor;
        private final Survey mSurvey;

        public int describeContents()
        {
            return 0;
        }

        public UpdateDisplayState.AnswerMap getAnswers()
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


        private SurveyState(Bundle bundle)
        {
            super(null);
            mHighlightColor = bundle.getInt("com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY");
            mAnswers = (UpdateDisplayState.AnswerMap)bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY");
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

        SurveyState(Bundle bundle, SurveyState surveystate)
        {
            this(bundle);
        }

        public SurveyState(Survey survey)
        {
            super(null);
            mSurvey = survey;
            mAnswers = new UpdateDisplayState.AnswerMap();
            mHighlightColor = 0xff000000;
            mBackground = null;
        }
    }


    public static final android.os.yState.DisplayState CREATOR = new android.os.Parcelable.Creator() {

        public UpdateDisplayState.DisplayState createFromParcel(Parcel parcel)
        {
            Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState.getClassLoader());
            bundle.readFromParcel(parcel);
            parcel = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY");
            bundle = bundle.getBundle("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY");
            if ("InAppNotificationState".equals(parcel))
            {
                return new InAppNotificationState(bundle, null);
            }
            if ("SurveyState".equals(parcel))
            {
                return new SurveyState(bundle, null);
            } else
            {
                throw new RuntimeException((new StringBuilder("Unrecognized display state type ")).append(parcel).toString());
            }
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public UpdateDisplayState.DisplayState[] newArray(int i)
        {
            return new UpdateDisplayState.DisplayState[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public static final String STATE_IMPL_KEY = "com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY";
    public static final String STATE_TYPE_KEY = "com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY";

    public abstract String getType();


    private _cls1()
    {
    }

    _cls1(_cls1 _pcls1)
    {
        this();
    }
}
