// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.events;

import java.util.Comparator;

// Referenced classes of package io.fabric.sdk.android.services.events:
//            EventsFilesManager

class this._cls0
    implements Comparator
{

    final EventsFilesManager this$0;

    public int compare(leWithTimestamp lewithtimestamp, leWithTimestamp lewithtimestamp1)
    {
        return (int)(lewithtimestamp.timestamp - lewithtimestamp1.timestamp);
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((leWithTimestamp)obj, (leWithTimestamp)obj1);
    }

    leWithTimestamp()
    {
        this$0 = EventsFilesManager.this;
        super();
    }
}
