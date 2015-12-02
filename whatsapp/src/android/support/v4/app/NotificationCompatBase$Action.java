// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

public abstract class put
{

    public static boolean a;

    protected abstract PendingIntent getActionIntent();

    protected abstract Bundle getExtras();

    protected abstract int getIcon();

    protected abstract put[] getRemoteInputs();

    protected abstract CharSequence getTitle();

    public put()
    {
    }
}
