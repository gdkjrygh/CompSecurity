// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.util.Log;

class KahunaLogger
{

    private final String mLogPrefix;
    private final String mTag = "Kahuna";

    KahunaLogger(String s)
    {
        mLogPrefix = s;
    }

    protected transient void log(int i, String s, Object aobj[])
    {
        if (Log.isLoggable(mTag, i))
        {
            s = String.format(s, aobj);
            Log.println(i, mTag, (new StringBuilder()).append(mLogPrefix).append(s).toString());
        }
    }
}
