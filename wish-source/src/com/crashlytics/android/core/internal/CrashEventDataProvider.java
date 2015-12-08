// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core.internal;

import com.crashlytics.android.core.internal.models.SessionEventData;

public interface CrashEventDataProvider
{

    public abstract SessionEventData getCrashEventData();
}
