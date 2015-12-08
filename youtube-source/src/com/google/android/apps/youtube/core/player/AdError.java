// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.util.SparseArray;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            a

public final class AdError
{

    public static final AdError a;
    private static final SparseArray c = new a();
    public final ErrorType b;

    public AdError(ErrorType errortype)
    {
        b = errortype;
    }

    public static AdError a(int i, int j)
    {
        if (i == 1)
        {
            ErrorType errortype = (ErrorType)c.get(j);
            if (errortype == null)
            {
                errortype = ErrorType.VIDEO_PLAYBACK_UNKNOWN_ERROR;
            }
            return new AdError(errortype);
        } else
        {
            return new AdError(ErrorType.VIDEO_PLAYBACK_UNKNOWN_ERROR);
        }
    }

    public final int a()
    {
        return b.internalError;
    }

    public final int b()
    {
        return b.vastError;
    }

    public final int c()
    {
        return b.monetizationError;
    }

    public final boolean d()
    {
        return b.internalError != 0;
    }

    public final String toString()
    {
        return (new StringBuilder("AdError: ")).append(b).toString();
    }

    static 
    {
        a = new AdError(ErrorType.NONE);
    }

    private class ErrorType extends Enum
    {

        private static final ErrorType $VALUES[];
        public static final ErrorType AD_SURVEY_PARSING_ERROR;
        public static final ErrorType NONE;
        public static final ErrorType UNSUPPORTED_VIDEO_FORMAT;
        public static final ErrorType VIDEO_PLAYBACK_ERROR_CANNOT_CONNECT;
        public static final ErrorType VIDEO_PLAYBACK_ERROR_NO_NETWORK;
        public static final ErrorType VIDEO_PLAYBACK_ERROR_TIMEOUT;
        public static final ErrorType VIDEO_PLAYBACK_ERROR_UNKNOWN_HOST;
        public static final ErrorType VIDEO_PLAYBACK_UNKNOWN_ERROR;
        public final int internalError;
        public final int monetizationError;
        public final int vastError;

        public static ErrorType valueOf(String s)
        {
            return (ErrorType)Enum.valueOf(com/google/android/apps/youtube/core/player/AdError$ErrorType, s);
        }

        public static ErrorType[] values()
        {
            return (ErrorType[])$VALUES.clone();
        }

        static 
        {
            NONE = new ErrorType("NONE", 0, 0, 0, 0);
            VIDEO_PLAYBACK_ERROR_NO_NETWORK = new ErrorType("VIDEO_PLAYBACK_ERROR_NO_NETWORK", 1, 10, 7, 405);
            VIDEO_PLAYBACK_ERROR_UNKNOWN_HOST = new ErrorType("VIDEO_PLAYBACK_ERROR_UNKNOWN_HOST", 2, 11, 7, 401);
            VIDEO_PLAYBACK_ERROR_CANNOT_CONNECT = new ErrorType("VIDEO_PLAYBACK_ERROR_CANNOT_CONNECT", 3, 12, 7, 401);
            VIDEO_PLAYBACK_ERROR_TIMEOUT = new ErrorType("VIDEO_PLAYBACK_ERROR_TIMEOUT", 4, 13, 3, 402);
            VIDEO_PLAYBACK_UNKNOWN_ERROR = new ErrorType("VIDEO_PLAYBACK_UNKNOWN_ERROR", 5, 14, 3, 405);
            UNSUPPORTED_VIDEO_FORMAT = new ErrorType("UNSUPPORTED_VIDEO_FORMAT", 6, 15, 6, 403);
            AD_SURVEY_PARSING_ERROR = new ErrorType("AD_SURVEY_PARSING_ERROR", 7, 20, 10, 900);
            $VALUES = (new ErrorType[] {
                NONE, VIDEO_PLAYBACK_ERROR_NO_NETWORK, VIDEO_PLAYBACK_ERROR_UNKNOWN_HOST, VIDEO_PLAYBACK_ERROR_CANNOT_CONNECT, VIDEO_PLAYBACK_ERROR_TIMEOUT, VIDEO_PLAYBACK_UNKNOWN_ERROR, UNSUPPORTED_VIDEO_FORMAT, AD_SURVEY_PARSING_ERROR
            });
        }

        private ErrorType(String s, int i, int j, int k, int l)
        {
            super(s, i);
            internalError = j;
            monetizationError = k;
            vastError = l;
        }
    }

}
