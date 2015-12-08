// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.util.SparseArray;

final class a extends SparseArray
{

    a()
    {
        put(-1002, AdError.ErrorType.VIDEO_PLAYBACK_ERROR_UNKNOWN_HOST);
        put(-1003, AdError.ErrorType.VIDEO_PLAYBACK_ERROR_CANNOT_CONNECT);
        put(-1005, AdError.ErrorType.VIDEO_PLAYBACK_ERROR_TIMEOUT);
    }
}
