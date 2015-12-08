// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import java.util.UUID;

// Referenced classes of package com.samsung.android.sdk.richnotification:
//            SrnRichNotificationManager

public static interface 
{

    public abstract void onError(UUID uuid,  );

    public abstract void onRead(UUID uuid);

    public abstract void onRemoved(UUID uuid);
}
