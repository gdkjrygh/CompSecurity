// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.youtube.core.player.ae;

// Referenced classes of package com.google.android.apps.youtube.api:
//            ApiPlayer, p

final class q extends Handler
{

    final ApiPlayer a;

    private q(ApiPlayer apiplayer)
    {
        a = apiplayer;
        super();
    }

    q(ApiPlayer apiplayer, byte byte0)
    {
        this(apiplayer);
    }

    public final void handleMessage(Message message)
    {
        if (ApiPlayer.a(a) == ApiPlayer.State.DESTROYED)
        {
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 2: // '\002'
            ApiPlayer.b(a);
            ApiPlayer.d(a).a(ApiPlayer.c(a).e(), ApiPlayer.c(a).f());
            return;

        case 3: // '\003'
            ApiPlayer.d(a).a(ApiPlayer.c(a).e());
            ApiPlayer.e(a);
            return;

        case 4: // '\004'
        case 7: // '\007'
        case 8: // '\b'
            ApiPlayer.d(a).h();
            ApiPlayer.e(a);
            return;

        case 5: // '\005'
        case 6: // '\006'
            p p1 = ApiPlayer.d(a);
            boolean flag;
            if (message.what == 5)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p1.a(flag, ApiPlayer.c(a).e());
            return;

        case 9: // '\t'
            ApiPlayer.d(a).b(message.arg1);
            return;
        }
    }
}
