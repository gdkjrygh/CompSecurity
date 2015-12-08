// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

class SharedPreferencesLoader
{
    private static class LoadSharedPreferences
        implements Callable
    {

        private final Context mContext;
        private final OnPrefsLoadedListener mListener;
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

        public LoadSharedPreferences(Context context, String s, OnPrefsLoadedListener onprefsloadedlistener)
        {
            mContext = context;
            mPrefsName = s;
            mListener = onprefsloadedlistener;
        }
    }

    static interface OnPrefsLoadedListener
    {

        public abstract void onPrefsLoaded(SharedPreferences sharedpreferences);
    }


    private final Executor mExecutor = Executors.newSingleThreadExecutor();

    public SharedPreferencesLoader()
    {
    }

    public Future loadPreferences(Context context, String s, OnPrefsLoadedListener onprefsloadedlistener)
    {
        context = new FutureTask(new LoadSharedPreferences(context, s, onprefsloadedlistener));
        mExecutor.execute(context);
        return context;
    }
}
