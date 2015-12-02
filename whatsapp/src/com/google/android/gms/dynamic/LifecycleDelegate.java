// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public interface LifecycleDelegate
{

    public abstract void onCreate(Bundle bundle);

    public abstract View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle);

    public abstract void onDestroy();

    public abstract void onDestroyView();

    public abstract void onInflate(Activity activity, Bundle bundle, Bundle bundle1);

    public abstract void onLowMemory();

    public abstract void onPause();

    public abstract void onResume();

    public abstract void onSaveInstanceState(Bundle bundle);
}
