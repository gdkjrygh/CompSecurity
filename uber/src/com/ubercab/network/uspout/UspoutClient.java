// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.network.uspout;

import android.content.Context;
import bjy;
import com.ubercab.network.uspout.internal.model.App;
import com.ubercab.network.uspout.internal.model.Device;
import com.ubercab.network.uspout.internal.model.Request;
import com.ubercab.network.uspout.model.ApplicationName;
import com.ubercab.network.uspout.model.Message;
import gqn;
import grs;
import grt;
import grv;
import grw;
import hnz;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import retrofit.Callback;
import retrofit.android.MainThreadExecutor;
import retrofit.converter.GsonConverter;

public final class UspoutClient
{

    private final List a;
    private final UspoutApi b;
    private final grv c;
    private final App d;
    private final Device e;
    private final ScheduledThreadPoolExecutor f;
    private final int g;
    private final int h;
    private final Runnable i;

    public UspoutClient(Context context, grv grv1, ApplicationName applicationname, gqn gqn, ExecutorService executorservice)
    {
        this(grv1, Device.create(context), App.create(context, applicationname), (UspoutApi)a(gqn, executorservice).a(com/ubercab/network/uspout/UspoutClient$UspoutApi));
    }

    private UspoutClient(grv grv1, Device device, App app, UspoutApi uspoutapi)
    {
        a = new ArrayList();
        h = 100;
        i = new _cls1();
        c = grv1;
        b = uspoutapi;
        d = app;
        e = device;
        f = grw.a();
        g = 15;
    }

    private static grs a(gqn gqn, ExecutorService executorservice)
    {
        bjw bjw = (new bjy()).a(new hnz()).b().c();
        return (new grt(gqn)).a(new GsonConverter(bjw)).a(executorservice, new MainThreadExecutor()).a();
    }

    static void a(UspoutClient uspoutclient)
    {
        uspoutclient.b();
    }

    private void b()
    {
        if (f.getQueue().isEmpty())
        {
            f.schedule(i, g, TimeUnit.SECONDS);
        }
    }

    public final void a()
    {
        if (a.isEmpty())
        {
            return;
        }
        List list1 = a;
        list1;
        JVM INSTR monitorenter ;
        List list;
        int j;
        j = a.size();
        list = a;
        if (j <= 100)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        list = a.subList(0, 100);
        Message amessage[];
        amessage = (Message[])list.toArray(new Message[list.size()]);
        list.clear();
        list1;
        JVM INSTR monitorexit ;
        Request request = Request.create(amessage);
        request.setDevice(e);
        request.setApp(d);
        b.sendRequest(request, new _cls2());
        return;
        Exception exception;
        exception;
        list1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final transient void a(Callback callback, Message amessage[])
    {
        for (int j = 0; j <= 0; j++)
        {
            amessage[0].setUserUUID(c.z());
        }

        amessage = Request.create(amessage);
        amessage.setDevice(e);
        amessage.setApp(d);
        b.sendRequest(amessage, callback);
    }

    public final transient void a(Message amessage[])
    {
        String s;
        int j;
        j = 0;
        b();
        s = c.z();
        List list = a;
        list;
        JVM INSTR monitorenter ;
_L2:
        Message message;
        if (j > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        message = amessage[0];
        message.setUserUUID(s);
        a.add(message);
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        list;
        JVM INSTR monitorexit ;
        return;
        amessage;
        list;
        JVM INSTR monitorexit ;
        throw amessage;
    }

    private class UspoutApi
    {

        public abstract void sendRequest(Request request, Callback callback);
    }


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
