// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.content.ContentResolver;
import android.text.TextUtils;
import java.security.SecureRandom;

public final class k
{

    public static String a(ContentResolver contentresolver)
    {
        String s = android.provider.Settings.Secure.getString(contentresolver, "android_id");
        contentresolver = s;
        if (TextUtils.isEmpty(s))
        {
            contentresolver = String.format("%x", new Object[] {
                Long.valueOf((new SecureRandom()).nextLong())
            });
        }
        return contentresolver;
    }
}
