// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.now.NowAuthService;
import com.ubercab.client.core.vendor.google.now.GoogleNowApi;
import com.ubercab.client.core.vendor.google.now.NowAuthIntentService;
import com.ubercab.client.core.vendor.google.now.NowBroadcastReceiver;
import com.ubercab.client.core.vendor.google.now.RtNowApi;
import java.io.IOException;
import java.util.HashMap;
import retrofit.RetrofitError;
import retrofit.client.Response;

final class dwy
    implements dwx
{

    private final gmg a;
    private final RtNowApi b;
    private final dal c;
    private final GoogleNowApi d;

    public dwy(gmg gmg, GoogleNowApi googlenowapi, RtNowApi rtnowapi, dal dal1)
    {
        a = gmg;
        d = googlenowapi;
        b = rtnowapi;
        c = dal1;
    }

    private static int a(dwz dwz1)
    {
        int i;
        try
        {
            i = dwz1.a().getStatus();
        }
        // Misplaced declaration of an exception variable
        catch (dwz dwz1)
        {
            dwz1 = dwz1.getResponse();
            if (dwz1 != null)
            {
                return dwz1.getStatus();
            } else
            {
                return 0;
            }
        }
        return i;
    }

    static RtNowApi a(dwy dwy1)
    {
        return dwy1.b;
    }

    private static void a(Context context, Class class1, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, class1), i, 1);
    }

    static GoogleNowApi b(dwy dwy1)
    {
        return dwy1.d;
    }

    private static PendingIntent c(Context context)
    {
        android.content.Intent intent = NowAuthIntentService.a(context);
        return PendingIntent.getService(context, dxa.a, intent, 0x20000000);
    }

    public final int a()
    {
        if (!dxa.a(a))
        {
            return 0;
        }
        if (c.u() == null)
        {
            ijg.c("We have been logged out.", new Object[0]);
            return 0;
        } else
        {
            return a(new dwz() {

                final dwy a;

                public final Response a()
                {
                    return dwy.a(a).checkCredentials(new HashMap());
                }

            
            {
                a = dwy.this;
                super();
            }
            });
        }
    }

    public final int a(String s)
    {
        if (!dxa.a(a))
        {
            return 0;
        } else
        {
            return a(new dwz(s) {

                final String a;
                final dwy b;

                public final Response a()
                {
                    return dwy.a(b).addCredentials(a);
                }

            
            {
                b = dwy.this;
                a = s;
                super();
            }
            });
        }
    }

    public final String a(Context context)
    {
        if (!dxa.a(a))
        {
            throw new com.google.android.now.NowAuthService.DisabledException();
        }
        context = NowAuthService.getAuthCode(context, dxa.a(context));
        if (context == null)
        {
            throw new IOException("Failed to retrieve auth code");
        } else
        {
            return context;
        }
    }

    public final void a(Context context, boolean flag)
    {
        if (dxa.a(a)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = c(context);
        android.content.Intent intent;
        boolean flag1;
        if (obj != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        ijg.a("Removing alarm.", new Object[0]);
        ((PendingIntent) (obj)).cancel();
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        a(context, com/ubercab/client/core/vendor/google/now/NowBroadcastReceiver, true);
        a(context, com/ubercab/client/core/vendor/google/now/NowAuthIntentService, true);
        ijg.a("Setting new alarm.", new Object[0]);
        obj = (AlarmManager)context.getSystemService("alarm");
        intent = NowAuthIntentService.a(context);
        ((AlarmManager) (obj)).setInexactRepeating(2, 0L, 0x5265c00L, PendingIntent.getService(context, dxa.a, intent, 0));
        return;
    }

    public final int b(String s)
    {
        if (!dxa.a(a))
        {
            return 0;
        } else
        {
            return a(new dwz(s) {

                final String a;
                final dwy b;

                public final Response a()
                {
                    return dwy.b(b).revokeAccess(a);
                }

            
            {
                b = dwy.this;
                a = s;
                super();
            }
            });
        }
    }

    public final boolean b(Context context)
    {
        PendingIntent pendingintent = c(context);
        if (pendingintent != null)
        {
            ijg.a("Removing alarm.", new Object[0]);
            pendingintent.cancel();
            a(context, com/ubercab/client/core/vendor/google/now/NowBroadcastReceiver, false);
            a(context, com/ubercab/client/core/vendor/google/now/NowAuthIntentService, false);
            return true;
        } else
        {
            ijg.a("No alarm to remove", new Object[0]);
            return false;
        }
    }
}
