// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.nearby.messages:
//            MessageFilter

public static final class pe
{

    private final List zzaFP = new ArrayList();

    private pe zzC(String s, String s1)
    {
        zzaFP.add(new MessageType(s, s1));
        return this;
    }

    public pe zzwX()
    {
        return zzC("", "");
    }

    public MessageFilter zzwY()
    {
        boolean flag;
        if (!zzaFP.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "At least one of the include methods must be called.");
        return new MessageFilter(zzaFP, null);
    }

    public pe()
    {
    }
}
