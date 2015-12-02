// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.Loader;

public abstract class LoaderManager
{

    public LoaderManager()
    {
    }

    public abstract void destroyLoader(int i);

    public abstract Loader getLoader(int i);

    public abstract Loader initLoader(int i, Bundle bundle, LoaderCallbacks loadercallbacks);

    public abstract Loader restartLoader(int i, Bundle bundle, LoaderCallbacks loadercallbacks);
}
