// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.verification;

import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import cev;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.model.Ping;
import dal;
import dbf;
import dfp;
import djx;
import dkn;
import dpg;
import dri;
import dul;
import duo;
import ekx;
import giz;
import gjn;
import gjo;
import gjr;
import gmg;
import gqg;
import gqj;
import gql;
import hkm;
import ica;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MobileVerificationIntentService extends IntentService
{

    private static final int k = com/ubercab/client/feature/verification/MobileVerificationIntentService.hashCode();
    long a;
    public djx b;
    public cev c;
    public giz d;
    public dpg e;
    public dkn f;
    public hkm g;
    public dal h;
    public dri i;
    public gmg j;
    private boolean l;

    public MobileVerificationIntentService()
    {
        super(com/ubercab/client/feature/verification/MobileVerificationIntentService.getName());
        a = TimeUnit.MINUTES.toMillis(1L);
    }

    private void a()
    {
        Object obj = ekx.a(this, getClass().hashCode(), "com.ubercab.client.ACTION_TRIP_SHOW_MAP", true);
        obj = (new android.support.v4.app.NotificationCompat.Builder(this)).setSmallIcon(0x7f020191).setAutoCancel(true).setContentTitle(getString(0x7f07065d)).setContentText(getString(0x7f07065b)).setTicker(getString(0x7f07065c)).setContentIntent(((android.app.PendingIntent) (obj)));
        ((NotificationManager)getSystemService("notification")).notify(k, ((android.support.v4.app.NotificationCompat.Builder) (obj)).build());
    }

    public static void a(Context context, String s)
    {
        Intent intent = new Intent(context, com/ubercab/client/feature/verification/MobileVerificationIntentService);
        intent.putExtra("code", s);
        context.startService(intent);
    }

    private void a(String s)
    {
        Semaphore semaphore = new Semaphore(0);
        try
        {
            f.a(s, new gql(semaphore) {

                final Semaphore a;
                final MobileVerificationIntentService b;

                private void a()
                {
                    a.release();
                }

                private void a(Ping ping)
                {
                    if (dul.r(ping))
                    {
                        if (!MobileVerificationIntentService.a(b))
                        {
                            MobileVerificationIntentService.b(b);
                        }
                        b.i.a("com.uber.SMS_RECEIVER");
                    }
                    b.d.h();
                    a.release();
                }

                public final volatile void a(gqg gqg, gqj gqj, Response response)
                {
                    a();
                }

                public final void a(gqg gqg, RetrofitError retrofiterror)
                {
                    a.release();
                }

                public final void b(gqg gqg, gqj gqj, Response response)
                {
                    a((Ping)gqj);
                }

            
            {
                b = MobileVerificationIntentService.this;
                a = semaphore;
                super();
            }
            });
            semaphore.tryAcquire(a, TimeUnit.MILLISECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            semaphore.release();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            semaphore.release();
            return;
        }
        finally
        {
            semaphore.release();
        }
        semaphore.release();
        return;
        throw s;
    }

    static boolean a(MobileVerificationIntentService mobileverificationintentservice)
    {
        return mobileverificationintentservice.l;
    }

    static void b(MobileVerificationIntentService mobileverificationintentservice)
    {
        mobileverificationintentservice.a();
    }

    public void onCreate()
    {
        super.onCreate();
        ((RiderApplication)getApplication()).b().a(this);
        c.a(this);
    }

    public void onDestroy()
    {
        super.onDestroy();
        c.b(this);
    }

    protected void onHandleIntent(Intent intent)
    {
        intent = intent.getStringExtra("code");
        if (TextUtils.isEmpty(intent) || !h.v())
        {
            return;
        }
        c.c(new gjr());
        if (j.a(dbf.ad))
        {
            if (b.b(h.z(), intent))
            {
                if (e.n())
                {
                    g.a().b(duo.a());
                } else
                {
                    f.b();
                }
                if (!l)
                {
                    a();
                }
                i.a("com.uber.SMS_RECEIVER");
            }
            d.h();
            return;
        } else
        {
            a(intent);
            return;
        }
    }

    public void onVerificationFragmentBackgrounded(gjn gjn)
    {
        l = false;
    }

    public void onVerificationFragmentForegrounded(gjo gjo)
    {
        l = true;
    }

}
