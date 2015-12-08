// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.common.network.h;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            bn, at, bk, bj

final class bo extends BroadcastReceiver
{

    final bk a;

    private bo(bk bk1)
    {
        a = bk1;
        super();
    }

    bo(bk bk1, byte byte0)
    {
        this(bk1);
    }

    public final void onReceive(Context context, Intent intent)
    {
        context = com.google.android.apps.ytremote.intent.Intents.IntentAction.fromString(intent.getAction());
        switch (bn.c[context.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            a.a(at.a);
            return;

        case 3: // '\003'
            break;
        }
        if (!bk.H(a).a())
        {
            a.a(at.a);
            return;
        } else
        {
            a.a(bj.a);
            return;
        }
    }
}
