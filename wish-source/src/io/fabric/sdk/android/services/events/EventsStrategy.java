// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.events;


// Referenced classes of package io.fabric.sdk.android.services.events:
//            EventsManager, FileRollOverManager, FilesSender

public interface EventsStrategy
    extends EventsManager, FileRollOverManager
{

    public abstract FilesSender getFilesSender();
}
