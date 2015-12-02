// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            LocationSharingService

class ri
    implements Runnable
{

    final LocationSharingService a;

    ri(LocationSharingService locationsharingservice)
    {
        a = locationsharingservice;
        super();
    }

    public void run()
    {
        a.stopSelf();
    }
}
