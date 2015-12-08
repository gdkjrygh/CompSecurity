// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.campaigns;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.arubanetworks.meridian.editor.EditorKey;
import com.arubanetworks.meridian.internal.util.Dev;
import com.arubanetworks.meridian.location.Beacon;
import com.arubanetworks.meridian.log.MeridianLogger;
import com.arubanetworks.meridian.requests.CampaignResetRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.arubanetworks.meridian.campaigns:
//            CampaignCache

public class CampaignsService extends IntentService
{
    private static final class UpdateCheckState extends Enum
    {

        public static final UpdateCheckState a;
        public static final UpdateCheckState b;
        public static final UpdateCheckState c;
        private static final UpdateCheckState h[];
        final long d;
        final long e;
        final long f;
        final long g;

        public static UpdateCheckState valueOf(String s)
        {
            return (UpdateCheckState)Enum.valueOf(com/arubanetworks/meridian/campaigns/CampaignsService$UpdateCheckState, s);
        }

        public static UpdateCheckState[] values()
        {
            return (UpdateCheckState[])h.clone();
        }

        static 
        {
            a = new UpdateCheckState("HIGH", 0, 20L, 15L, 10L, 1L);
            b = new UpdateCheckState("MEDIUM", 1, 60L, 40L, 7L, 1L);
            c = new UpdateCheckState("LOW", 2, 300L, 200L, 5L, 1L);
            h = (new UpdateCheckState[] {
                a, b, c
            });
        }

        private UpdateCheckState(String s, int i, long l, long l1, long l2, long l3)
        {
            super(s, i);
            e = 1000L * l1;
            d = 1000L * l;
            f = 1000L * l2 * 0xf4240L;
            g = 1000L * l3;
        }
    }


    private static final MeridianLogger a;
    private UpdateCheckState b;

    public CampaignsService()
    {
        super("com.arubanetworks.meridian.campaigns.CampaignsService");
        b = UpdateCheckState.a;
    }

    private static PendingIntent a(Context context, UpdateCheckState updatecheckstate)
    {
        Intent intent = new Intent("com.arubanetworks.meridian.CHECK_CAMPAIGNS");
        intent.setClass(context, com/arubanetworks/meridian/campaigns/CampaignsService);
        if (updatecheckstate != null)
        {
            a(intent, updatecheckstate);
        }
        return PendingIntent.getService(context, 0, intent, 0x8000000);
    }

    private static PendingIntent a(Context context, EditorKey editorkey)
    {
        Intent intent = new Intent("com.arubanetworks.meridian.START_CAMPAIGNS");
        intent.setClass(context, com/arubanetworks/meridian/campaigns/CampaignsService);
        if (editorkey != null)
        {
            intent.putExtra("com.arubanetworks.meridian.campaigns.CampaignsService.EDITOR_KEY_KEY", editorkey);
        }
        return PendingIntent.getService(context, 0, intent, 0x8000000);
    }

    private static Intent a(Intent intent, UpdateCheckState updatecheckstate)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("com.arubanetworks.meridian.campaigns.CHECK_STATE_KEY", updatecheckstate);
        return intent.putExtra("com.arubanetworks.meridian.campaigns.CHECK_STATE_KEY", bundle);
    }

    private static UpdateCheckState a(Intent intent)
    {
        intent = intent.getBundleExtra("com.arubanetworks.meridian.campaigns.CHECK_STATE_KEY");
        if (intent == null)
        {
            intent = UpdateCheckState.a;
        } else
        {
            UpdateCheckState updatecheckstate = (UpdateCheckState)intent.getSerializable("com.arubanetworks.meridian.campaigns.CHECK_STATE_KEY");
            intent = updatecheckstate;
            if (updatecheckstate == null)
            {
                return UpdateCheckState.a;
            }
        }
        return intent;
    }

    static UpdateCheckState a(CampaignsService campaignsservice)
    {
        return campaignsservice.b;
    }

    static UpdateCheckState a(CampaignsService campaignsservice, UpdateCheckState updatecheckstate)
    {
        campaignsservice.b = updatecheckstate;
        return updatecheckstate;
    }

    static MeridianLogger a()
    {
        return a;
    }

    static String a(Context context)
    {
        return (new StringBuilder()).append(android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id")).append(":").append(context.getPackageName()).toString();
    }

    private static void a(Context context, long l, long l1, PendingIntent pendingintent)
    {
        context = (AlarmManager)context.getSystemService("alarm");
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            context.setWindow(0, (System.currentTimeMillis() + l) - l1 / 2L, l1, pendingintent);
            return;
        } else
        {
            context.set(0, System.currentTimeMillis() + l, pendingintent);
            return;
        }
    }

    private static void a(Context context, boolean flag)
    {
        context.getSharedPreferences("com.arubanetworks.meridian.campaigns.CampaignsService.SHARED_PREFS_KEY", 0).edit().putBoolean("com.arubanetworks.meridian.campaigns.CampaignsService.ENABLED_KEY", flag).commit();
    }

    private void b()
    {
        a.d("(called)startCheckLoopNow state = %s", new Object[] {
            b.name()
        });
        PendingIntent pendingintent = a(getApplicationContext(), b);
        a(getApplicationContext(), b.e / 2L, b.e, pendingintent);
    }

    private void b(Intent intent)
    {
        a.v("(called)startMonitorLoop");
        intent = (EditorKey)intent.getSerializableExtra("com.arubanetworks.meridian.campaigns.CampaignsService.EDITOR_KEY_KEY");
        if (intent == null)
        {
            a.d("No App Key! Canceling!");
            return;
        } else
        {
            CampaignCache.a(getApplicationContext(), intent, new Runnable() {

                final CampaignsService a;

                public void run()
                {
                    CampaignsService.c(a);
                }

            
            {
                a = CampaignsService.this;
                super();
            }
            });
            return;
        }
    }

    static void b(CampaignsService campaignsservice)
    {
        campaignsservice.d();
    }

    static boolean b(Context context)
    {
        return c(context);
    }

    private void c()
    {
        a.v("(called)startCheckLoop state = %s", new Object[] {
            b.name()
        });
        PendingIntent pendingintent = a(getApplicationContext(), b);
        a(getApplicationContext(), b.d, b.e, pendingintent);
    }

    static void c(CampaignsService campaignsservice)
    {
        campaignsservice.b();
    }

    private static boolean c(Context context)
    {
        return context.getSharedPreferences("com.arubanetworks.meridian.campaigns.CampaignsService.SHARED_PREFS_KEY", 0).getBoolean("com.arubanetworks.meridian.campaigns.CampaignsService.ENABLED_KEY", false);
    }

    private void d()
    {
        static class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[UpdateCheckState.values().length];
                try
                {
                    a[UpdateCheckState.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[UpdateCheckState.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls4.a[b.ordinal()])
        {
        default:
            b = UpdateCheckState.c;
            return;

        case 1: // '\001'
            b = UpdateCheckState.b;
            return;

        case 2: // '\002'
            b = UpdateCheckState.c;
            break;
        }
    }

    private void e()
    {
        HashMap hashmap;
        AtomicBoolean atomicboolean;
        Timer timer;
        AtomicLong atomiclong;
        BluetoothAdapter bluetoothadapter;
        a.d("(called)checkCampaigns state = %s", new Object[] {
            b.name()
        });
        atomiclong = new AtomicLong(System.nanoTime());
        atomicboolean = new AtomicBoolean(true);
        bluetoothadapter = BluetoothAdapter.getDefaultAdapter();
        timer = new Timer(true);
        hashmap = CampaignCache.a(getApplicationContext());
        if (hashmap.size() > 0) goto _L2; else goto _L1
_L1:
        a.d("No campaigns!");
_L4:
        return;
_L2:
        android.bluetooth.BluetoothAdapter.LeScanCallback lescancallback;
        int k;
label0:
        {
            lescancallback = new android.bluetooth.BluetoothAdapter.LeScanCallback(hashmap, atomiclong) {

                final HashMap a;
                final AtomicLong b;
                final CampaignsService c;

                public void onLeScan(BluetoothDevice bluetoothdevice, int l, byte abyte0[])
                {
                    bluetoothdevice = Beacon.fromScanData(bluetoothdevice, abyte0, l);
                    if (bluetoothdevice != null)
                    {
                        if (CampaignsService.a(c) == UpdateCheckState.c)
                        {
                            CampaignsService.a(c, UpdateCheckState.b);
                        }
                        abyte0 = a.values().iterator();
                        boolean flag = false;
                        while (abyte0.hasNext()) 
                        {
                            if (((CampaignCache)abyte0.next()).a(c.getApplicationContext(), bluetoothdevice, l) || flag)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                        }
                        if (flag)
                        {
                            b.set(System.nanoTime());
                            CampaignsService.a(c, UpdateCheckState.a);
                            return;
                        }
                    }
                }

            
            {
                c = CampaignsService.this;
                a = hashmap;
                b = atomiclong;
                super();
            }
            };
            int i;
            int j;
            for (i = 5; !bluetoothadapter.startLeScan(lescancallback); i = j)
            {
                j = i - 1;
                k = j;
                if (i <= 0)
                {
                    break label0;
                }
            }

            k = i;
        }
        if (k >= 0)
        {
            atomicboolean.set(false);
            timer.schedule(new TimerTask(atomiclong, bluetoothadapter, lescancallback, atomicboolean) {

                final AtomicLong a;
                final BluetoothAdapter b;
                final android.bluetooth.BluetoothAdapter.LeScanCallback c;
                final AtomicBoolean d;
                final CampaignsService e;

                public void run()
                {
                    if (System.nanoTime() - a.get() >= CampaignsService.a(e).f || !CampaignsService.b(e.getApplicationContext()))
                    {
                        cancel();
                        CampaignsService.b(e);
                        CampaignsService.a().d("Canceled due to timeout! state = %s", new Object[] {
                            CampaignsService.a(e).name()
                        });
                        b.stopLeScan(c);
                        d.set(true);
                    }
                }

            
            {
                e = CampaignsService.this;
                a = atomiclong;
                b = bluetoothadapter;
                c = lescancallback;
                d = atomicboolean;
                super();
            }
            }, b.g, b.g);
        }
        while (!atomicboolean.get()) 
        {
            try
            {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedexception)
            {
                a.e("Error checking campaigns", interruptedexception);
            }
        }
        timer.purge();
        if (c(getApplicationContext()))
        {
            for (Iterator iterator = hashmap.values().iterator(); iterator.hasNext(); ((CampaignCache)iterator.next()).a(getApplicationContext(), true)) { }
            CampaignCache.a(getApplicationContext(), hashmap);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean f()
    {
        return Dev.hasBLEPermission(getApplicationContext()) && Dev.hasBLE(getApplicationContext());
    }

    public static void resetAllCampaigns(Context context, EditorKey editorkey, com.arubanetworks.meridian.requests.MeridianRequest.Listener listener, com.arubanetworks.meridian.requests.MeridianRequest.ErrorListener errorlistener)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("context must not be null");
        }
        if (editorkey == null)
        {
            throw new IllegalArgumentException("appKey must not be null");
        } else
        {
            stopMonitoring(context, true);
            (new com.arubanetworks.meridian.requests.CampaignResetRequest.Builder()).setAppId(editorkey.getId()).setDeviceId(a(context)).setListener(listener).setErrorListener(errorlistener).build().sendRequest();
            return;
        }
    }

    public static void startMonitoring(Context context, EditorKey editorkey)
    {
        a.v("(called)startMonitoring");
        if (context == null)
        {
            throw new IllegalArgumentException("context must not be null");
        }
        if (editorkey == null)
        {
            throw new IllegalArgumentException("appKey must not be null");
        } else
        {
            stopMonitoring(context);
            AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
            context = a(context, editorkey);
            alarmmanager.set(0, System.currentTimeMillis() + 1000L, context);
            return;
        }
    }

    public static void stopMonitoring(Context context)
    {
        stopMonitoring(context, false);
    }

    public static void stopMonitoring(Context context, boolean flag)
    {
        a.v("(called)stopMonitoring");
        if (context == null)
        {
            throw new IllegalArgumentException("context must not be null");
        }
        AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
        a(context, false);
        alarmmanager.cancel(a(context, ((UpdateCheckState) (null))));
        alarmmanager.cancel(a(context, ((EditorKey) (null))));
        a(context, false);
        if (flag)
        {
            CampaignCache.a(context, null);
        }
    }

    protected void onHandleIntent(Intent intent)
    {
        a.v("(called)onHandleIntent");
        if (f())
        {
            if ("com.arubanetworks.meridian.START_CAMPAIGNS".equals(intent.getAction()))
            {
                b = UpdateCheckState.a;
                a(getApplicationContext(), true);
                b(intent);
                return;
            }
            if ("com.arubanetworks.meridian.CHECK_CAMPAIGNS".equals(intent.getAction()))
            {
                b = a(intent);
                e();
                if (c(getApplicationContext()))
                {
                    c();
                    return;
                }
            }
        }
    }

    static 
    {
        a = MeridianLogger.forTag("CampaignsService").andFeature(com.arubanetworks.meridian.log.MeridianLogger.Feature.CAMPAIGNS);
    }
}
