// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.event;

import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.apps.youtube.core.Analytics;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.apps.youtube.core.player.event:
//            d

public final class PlaybackServiceException extends Exception
{

    private static final String ANALYTICS_ACTION_BASE_STRING = "PlaybackError - ";
    public final boolean isRetriable;
    public final ErrorReason reason;

    public PlaybackServiceException(ErrorReason errorreason, boolean flag, String s)
    {
        super(s);
        reason = errorreason;
        isRetriable = flag;
    }

    public PlaybackServiceException(ErrorReason errorreason, boolean flag, String s, Throwable throwable)
    {
        super(s, throwable);
        reason = errorreason;
        isRetriable = flag;
    }

    public PlaybackServiceException(ErrorReason errorreason, boolean flag, Throwable throwable)
    {
        super(throwable);
        reason = errorreason;
        isRetriable = flag;
    }

    private String causeExceptionSimpleClassNameForAnalytics()
    {
        Throwable throwable1 = getCause();
        Throwable throwable = throwable1;
        if (throwable1 instanceof ExecutionException)
        {
            throwable = throwable1.getCause();
        }
        if (throwable != null)
        {
            return throwable.getClass().getSimpleName();
        } else
        {
            return "UnknownCause";
        }
    }

    private String detailsForAnalytics()
    {
        if (TextUtils.isEmpty(getMessage()))
        {
            return "UnknownDetails";
        } else
        {
            return getMessage();
        }
    }

    public final void recordExceptionInAnalytics(Analytics analytics)
    {
        String s = "PlaybackError - ";
        d.a[reason.ordinal()];
        JVM INSTR tableswitch 1 9: default 64
    //                   1 73
    //                   2 145
    //                   3 176
    //                   4 176
    //                   5 176
    //                   6 176
    //                   7 210
    //                   8 241
    //                   9 265;
           goto _L1 _L2 _L3 _L4 _L4 _L4 _L4 _L5 _L6 _L7
_L1:
        analytics.a(s, 0);
        return;
_L2:
        if (getCause() instanceof VolleyError)
        {
            s = (new StringBuilder()).append("PlaybackError - ").append("InnerTube: ").append(causeExceptionSimpleClassNameForAnalytics()).toString();
        } else
        {
            s = (new StringBuilder()).append("PlaybackError - ").append("GData: ").append(causeExceptionSimpleClassNameForAnalytics()).toString();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        s = (new StringBuilder()).append("PlaybackError - ").append("WatchNext: ").append(causeExceptionSimpleClassNameForAnalytics()).toString();
        continue; /* Loop/switch isn't completed */
_L4:
        s = (new StringBuilder()).append("PlaybackError - ").append("PlayabilityFailed: ").append(reason.toString()).toString();
        continue; /* Loop/switch isn't completed */
_L5:
        s = (new StringBuilder()).append("PlaybackError - ").append("HeartbeatServer: ").append(causeExceptionSimpleClassNameForAnalytics()).toString();
        continue; /* Loop/switch isn't completed */
_L6:
        s = (new StringBuilder()).append("PlaybackError - ").append("MissingStreams").toString();
        continue; /* Loop/switch isn't completed */
_L7:
        s = (new StringBuilder()).append("PlaybackError - ").append(String.format("Unknown: %s - %s", new Object[] {
            causeExceptionSimpleClassNameForAnalytics(), detailsForAnalytics()
        })).toString();
        if (true) goto _L1; else goto _L8
_L8:
    }

    public final boolean shouldSkipVideo()
    {
        return reason.isIn(new ErrorReason[] {
            ErrorReason.UNPLAYABLE, ErrorReason.VIDEO_ERROR, ErrorReason.USER_CHECK_FAILED, ErrorReason.UNPLAYABLE_IN_BACKGROUND, ErrorReason.NO_STREAMS
        });
    }

    private class ErrorReason extends Enum
    {

        private static final ErrorReason $VALUES[];
        public static final ErrorReason LICENSE_SERVER_ERROR;
        public static final ErrorReason NO_STREAMS;
        public static final ErrorReason PLAYER_ERROR;
        public static final ErrorReason REQUEST_FAILED;
        public static final ErrorReason UNKNOWN;
        public static final ErrorReason UNPLAYABLE;
        public static final ErrorReason UNPLAYABLE_IN_BACKGROUND;
        public static final ErrorReason USER_CHECK_FAILED;
        public static final ErrorReason VIDEO_ERROR;
        public static final ErrorReason WATCH_NEXT_ERROR;

        public static ErrorReason valueOf(String s)
        {
            return (ErrorReason)Enum.valueOf(com/google/android/apps/youtube/core/player/event/PlaybackServiceException$ErrorReason, s);
        }

        public static ErrorReason[] values()
        {
            return (ErrorReason[])$VALUES.clone();
        }

        public final boolean isCritical()
        {
            return isIn(new ErrorReason[] {
                UNKNOWN, VIDEO_ERROR, UNPLAYABLE, REQUEST_FAILED, USER_CHECK_FAILED, LICENSE_SERVER_ERROR, PLAYER_ERROR, NO_STREAMS, UNPLAYABLE_IN_BACKGROUND
            });
        }

        public final transient boolean isIn(ErrorReason aerrorreason[])
        {
            boolean flag1 = false;
            int j = aerrorreason.length;
            int i = 0;
            do
            {
label0:
                {
                    boolean flag = flag1;
                    if (i < j)
                    {
                        if (this != aerrorreason[i])
                        {
                            break label0;
                        }
                        flag = true;
                    }
                    return flag;
                }
                i++;
            } while (true);
        }

        static 
        {
            UNKNOWN = new ErrorReason("UNKNOWN", 0);
            VIDEO_ERROR = new ErrorReason("VIDEO_ERROR", 1);
            UNPLAYABLE = new ErrorReason("UNPLAYABLE", 2);
            REQUEST_FAILED = new ErrorReason("REQUEST_FAILED", 3);
            USER_CHECK_FAILED = new ErrorReason("USER_CHECK_FAILED", 4);
            LICENSE_SERVER_ERROR = new ErrorReason("LICENSE_SERVER_ERROR", 5);
            PLAYER_ERROR = new ErrorReason("PLAYER_ERROR", 6);
            NO_STREAMS = new ErrorReason("NO_STREAMS", 7);
            WATCH_NEXT_ERROR = new ErrorReason("WATCH_NEXT_ERROR", 8);
            UNPLAYABLE_IN_BACKGROUND = new ErrorReason("UNPLAYABLE_IN_BACKGROUND", 9);
            $VALUES = (new ErrorReason[] {
                UNKNOWN, VIDEO_ERROR, UNPLAYABLE, REQUEST_FAILED, USER_CHECK_FAILED, LICENSE_SERVER_ERROR, PLAYER_ERROR, NO_STREAMS, WATCH_NEXT_ERROR, UNPLAYABLE_IN_BACKGROUND
            });
        }

        private ErrorReason(String s, int i)
        {
            super(s, i);
        }
    }

}
