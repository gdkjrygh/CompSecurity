// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal.b;

import android.util.Log;

public final class a
{

    public static transient void a(String s, Object aobj[])
    {
        Log.w("YouTubeAndroidPlayerAPI", String.format(s, aobj));
    }

    public static transient void b(String s, Object aobj[])
    {
        Log.e("YouTubeAndroidPlayerAPI", String.format(s, aobj));
    }
}
