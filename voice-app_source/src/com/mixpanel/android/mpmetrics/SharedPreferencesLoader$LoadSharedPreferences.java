// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            SharedPreferencesLoader

private static class mListener
    implements Callable
{

    private final Context mContext;
    private final call mListener;
    private final String mPrefsName;

    public SharedPreferences call()
    {
        SharedPreferences sharedpreferences = mContext.getSharedPreferences(mPrefsName, 0);
        if (mListener != null)
        {
            mListener.onPrefsLoaded(sharedpreferences);
        }
        return sharedpreferences;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public (Context context, String s,  )
    {
        mContext = context;
        mPrefsName = s;
        mListener = ;
    }
}
