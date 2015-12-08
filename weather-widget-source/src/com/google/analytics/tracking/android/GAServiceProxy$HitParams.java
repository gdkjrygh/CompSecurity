// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.analytics.tracking.android:
//            GAServiceProxy

private static class commands
{

    private final List commands;
    private final long hitTimeInMilliseconds;
    private final String path;
    private final Map wireFormatParams;

    public List getCommands()
    {
        return commands;
    }

    public long getHitTimeInMilliseconds()
    {
        return hitTimeInMilliseconds;
    }

    public String getPath()
    {
        return path;
    }

    public Map getWireFormatParams()
    {
        return wireFormatParams;
    }

    public (Map map, long l, String s, List list)
    {
        wireFormatParams = map;
        hitTimeInMilliseconds = l;
        path = s;
        commands = list;
    }
}
