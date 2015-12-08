// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.Map;

final class AnalyticsTimedAction
{

    protected long adjustedStartTime;
    protected Map contextData;
    protected int databaseID;
    protected long startTime;

    protected AnalyticsTimedAction(Map map, long l, long l1, int i)
    {
        contextData = map;
        databaseID = i;
        startTime = l;
        adjustedStartTime = l1;
    }
}
