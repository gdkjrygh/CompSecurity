// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk;

import android.content.Context;

// Referenced classes of package com.samsung.android.sdk:
//            SsdkUnsupportedException

public interface SsdkInterface
{

    public abstract int getVersionCode();

    public abstract String getVersionName();

    public abstract void initialize(Context context)
        throws SsdkUnsupportedException;

    public abstract boolean isFeatureEnabled(int i);
}
