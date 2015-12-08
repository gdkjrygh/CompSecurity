// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.events;

import java.io.IOException;

public interface FileRollOverManager
{

    public abstract void cancelTimeBasedFileRollOver();

    public abstract boolean rollFileOver()
        throws IOException;

    public abstract void scheduleTimeBasedRollOverIfNeeded();
}
