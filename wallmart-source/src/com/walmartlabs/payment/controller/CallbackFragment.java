// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.walmartlabs.utils.WLog;

public abstract class CallbackFragment extends Fragment
{

    protected String TAG;
    protected Object mCallback;
    private final Class mCallbackClass;

    protected CallbackFragment(Class class1)
    {
        TAG = com/walmartlabs/payment/controller/CallbackFragment.getSimpleName();
        mCallbackClass = class1;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        WLog.v(TAG, "onAttach()");
        try
        {
            mCallback = mCallbackClass.cast(activity);
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement the callback interface for ").append(TAG).toString());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        WLog.v(TAG, "onCreate()");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        WLog.v(TAG, "onCreateView()");
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        WLog.v(TAG, "onDestroy()");
    }

    public void onPause()
    {
        super.onPause();
        Log.v(TAG, "onPause()");
    }

    public void onResume()
    {
        super.onResume();
        WLog.v(TAG, "onResume()");
    }

    public void onStart()
    {
        super.onStart();
        WLog.v(TAG, "onStart()");
    }

    public void onStop()
    {
        super.onStop();
        WLog.v(TAG, "onStop()");
    }
}
