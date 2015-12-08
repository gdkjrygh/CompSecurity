// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.ui.utils;

import android.os.Bundle;

public interface Navigator
{
    public static interface OnNavigationListener
    {

        public abstract void onNavigation(int i);
    }


    public abstract void destroy();

    public abstract boolean isDestinationActive(int i);

    public abstract void navigateTo(int i);

    public abstract void navigateTo(int i, Bundle bundle);

    public abstract void onRestoreInstanceState(Bundle bundle);

    public abstract void onSaveInstanceState(Bundle bundle);

    public abstract boolean popBackStack();

    public abstract void registerNavigationListener(OnNavigationListener onnavigationlistener);

    public abstract void resetCurrentDestination(int i);

    public abstract void unregisterNavigationListener(OnNavigationListener onnavigationlistener);
}
