// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.b;

import com.google.android.apps.ytremote.model.PairingCode;
import java.util.UUID;

// Referenced classes of package com.google.android.apps.ytremote.b:
//            f

final class e
    implements f
{

    private e()
    {
    }

    e(byte byte0)
    {
        this();
    }

    public final PairingCode a()
    {
        return new PairingCode(UUID.randomUUID().toString());
    }
}
