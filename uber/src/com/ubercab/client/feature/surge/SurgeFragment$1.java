// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.surge;

import android.os.Message;
import cev;
import fpd;

// Referenced classes of package com.ubercab.client.feature.surge:
//            SurgeFragment

final class a
    implements android.os.
{

    final SurgeFragment a;

    public final boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            a.e.c(new fpd());
        }
        return false;
    }

    (SurgeFragment surgefragment)
    {
        a = surgefragment;
        super();
    }
}
