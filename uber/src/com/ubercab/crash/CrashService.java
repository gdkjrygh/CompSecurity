// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.crash;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import com.ubercab.crash.model.Crash;
import gkx;
import gky;
import gkz;
import glb;
import glc;
import gle;
import gmc;

public class CrashService extends Service
{

    private gky a;
    private gmc b;
    private String c;
    private glb d;

    public CrashService()
    {
    }

    CrashService(glb glb1)
    {
        d = glb1;
    }

    public static Intent a(Crash crash, Application application)
    {
        application = new Intent("crash_action_send_contents", null, application.getApplicationContext(), com/ubercab/crash/CrashService);
        application.putExtra("crash_params", crash);
        return application;
    }

    static gky a(CrashService crashservice)
    {
        return crashservice.a;
    }

    private void a(Intent intent)
    {
        Crash crash;
        byte byte0;
        crash = b(intent);
        b.a(c);
        if (crash == null)
        {
            throw new IllegalArgumentException("Null crash supplied");
        }
        intent = intent.getAction();
        byte0 = -1;
        intent.hashCode();
        JVM INSTR tableswitch -506444480 -506444480: default 60
    //                   -506444480 90;
           goto _L1 _L2
_L2:
        if (intent.equals("crash_action_send_contents"))
        {
            byte0 = 0;
        }
_L1:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException("Unknown crash action");

        case 0: // '\0'
            a(crash);
            break;
        }
        return;
    }

    private void a(Crash crash)
    {
        try
        {
            b(crash);
            a.a(crash, new gkz() {

                final CrashService a;

                public final void a()
                {
                    a.stopSelf();
                }

                public final void a(Crash crash1)
                {
                    CrashService.a(a).a().c(crash1.getCrashId());
                    a.stopSelf();
                }

            
            {
                a = CrashService.this;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Crash crash)
        {
            b.a(crash);
        }
        stopSelf();
    }

    private static Crash b(Intent intent)
    {
        return (Crash)intent.getParcelableExtra("crash_params");
    }

    private void b(Crash crash)
    {
        if (crash.getCrashId() == null)
        {
            crash.setCrashId(a.a().b());
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        if (d == null)
        {
            d = ((glc)getApplication()).j();
        }
        a = d.v();
        c = d.w().a();
        b = d.x();
    }

    public void onDestroy()
    {
        super.onDestroy();
        Process.killProcess(Process.myPid());
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (intent == null)
        {
            stopSelf();
        } else
        {
            a(intent);
        }
        return 1;
    }
}
