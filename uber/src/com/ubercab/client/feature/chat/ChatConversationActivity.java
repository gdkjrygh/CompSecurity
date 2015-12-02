// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.chat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import cic;
import com.ubercab.chat.model.ConversationThread;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.trip.chat.ChatComposerView;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import cxs;
import cxu;
import czj;
import dfe;
import dfp;
import dyw;
import dyy;
import dyz;
import fuj;
import hkr;
import ijg;

public class ChatConversationActivity extends RiderActivity
    implements fuj
{

    public cxs h;
    public cxu i;
    public hkr j;
    private ConversationThread k;
    ChatComposerView mComposerView;

    public ChatConversationActivity()
    {
    }

    public static Intent a(Context context)
    {
        return new Intent(context, com/ubercab/client/feature/chat/ChatConversationActivity);
    }

    private void a(dyw dyw1)
    {
        dyw1.a(this);
    }

    private dyw b(dfp dfp)
    {
        return dyy.a().a(new dfe(this)).a(dfp).a();
    }

    private void i()
    {
        if (i.c() == null)
        {
            ijg.d("Invalid state. No user ID from chat manager", new Object[0]);
            return;
        }
        if (j.f() == null)
        {
            ijg.d("Invalid state. No trip from DataProvider", new Object[0]);
            return;
        } else
        {
            k = i.a(j.f().getDriver().getUuid(), j.f().getUuid());
            return;
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((dyw)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f03003d);
        ButterKnife.inject(this);
        mComposerView.a(this);
        i();
        if (k == null)
        {
            finish();
        }
    }

    public final void f()
    {
        h.b();
    }

    public final void g()
    {
        com.ubercab.chat.model.Payload payload = h.c();
        if (payload != null && k != null)
        {
            i.a(payload, k.getConnectedUserId(), k.getThreadId());
        }
    }

    public final void h()
    {
        h.a();
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
