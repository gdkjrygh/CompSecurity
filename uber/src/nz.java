// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class nz extends aiw
{

    static final long a;
    private static final Object b = new Object();
    private static boolean c = false;
    private static adv d = null;
    private static acv e = null;
    private static add f = null;
    private static acu g = null;
    private final nf h;
    private final nd i;
    private final Object j;
    private final Context k;
    private ajy l;

    public nz(Context context, nd nd1, nf nf)
    {
        j = new Object();
        h = nf;
        k = context;
        i = nd1;
        synchronized (b)
        {
            if (!c)
            {
                f = new add();
                e = new acv(context.getApplicationContext(), nd1.j);
                g = new oc();
                d = new adv(k.getApplicationContext(), i.j, (String)abn.b.c(), new ob(), new oa());
                c = true;
            }
        }
        return;
        context;
        nf;
        JVM INSTR monitorexit ;
        throw context;
    }

    static ajy a(nz nz1, ajy ajy)
    {
        nz1.l = ajy;
        return ajy;
    }

    private AdResponseParcel a(AdRequestInfoParcel adrequestinfoparcel)
    {
        Object obj;
        JSONObject jsonobject;
        obj = UUID.randomUUID().toString();
        jsonobject = a(adrequestinfoparcel, ((String) (obj)));
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        adrequestinfoparcel = new AdResponseParcel(0);
_L4:
        return adrequestinfoparcel;
_L2:
        long l1 = ot.i().b();
        Future future = f.a(((String) (obj)));
        oe.a.post(new _cls2(jsonobject, ((String) (obj))));
        long l2 = a;
        long l3 = ot.i().b();
        try
        {
            obj = (JSONObject)future.get(l2 - (l3 - l1), TimeUnit.MILLISECONDS);
            break MISSING_BLOCK_LABEL_102;
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel) { }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel) { }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            return new AdResponseParcel(2);
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            return new AdResponseParcel(0);
        }
        return new AdResponseParcel(-1);
        if (obj == null)
        {
            return new AdResponseParcel(-1);
        }
        obj = ahq.a(k, adrequestinfoparcel, ((JSONObject) (obj)).toString());
        adrequestinfoparcel = ((AdRequestInfoParcel) (obj));
        if (((AdResponseParcel) (obj)).e != -3)
        {
            adrequestinfoparcel = ((AdRequestInfoParcel) (obj));
            if (TextUtils.isEmpty(((AdResponseParcel) (obj)).c))
            {
                return new AdResponseParcel(3);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static nf a(nz nz1)
    {
        return nz1.h;
    }

    private JSONObject a(AdRequestInfoParcel adrequestinfoparcel, String s)
    {
        Bundle bundle;
        String s1;
        bundle = adrequestinfoparcel.c.c.getBundle("sdk_less_server_data");
        s1 = adrequestinfoparcel.c.c.getString("sdk_less_network_id");
        if (bundle != null) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject;
        return null;
_L2:
        if ((jsonobject = ahq.a(adrequestinfoparcel, new ahu(k), new abf((String)abn.b.c()), null, new ArrayList())) == null) goto _L1; else goto _L3
_L3:
        adrequestinfoparcel = AdvertisingIdClient.getAdvertisingIdInfo(k);
_L4:
        HashMap hashmap = new HashMap();
        hashmap.put("request_id", s);
        hashmap.put("network_id", s1);
        hashmap.put("request_param", jsonobject);
        hashmap.put("data", bundle);
        if (adrequestinfoparcel != null)
        {
            hashmap.put("adid", adrequestinfoparcel.getId());
            int i1;
            if (adrequestinfoparcel.isLimitAdTrackingEnabled())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            hashmap.put("lat", Integer.valueOf(i1));
        }
        try
        {
            adrequestinfoparcel = ot.e().a(hashmap);
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            return null;
        }
        return adrequestinfoparcel;
        adrequestinfoparcel;
_L5:
        of.d("Cannot get advertising id info", adrequestinfoparcel);
        adrequestinfoparcel = null;
          goto _L4
        adrequestinfoparcel;
          goto _L5
        adrequestinfoparcel;
          goto _L5
        adrequestinfoparcel;
          goto _L5
    }

    protected static void a(aql aql1)
    {
        aql1.a("/loadAd", f);
        aql1.a("/fetchHttpRequest", e);
        aql1.a("/invalidRequest", g);
    }

    static ajy b(nz nz1)
    {
        return nz1.l;
    }

    protected static void b(aql aql1)
    {
        aql1.b("/loadAd", f);
        aql1.b("/fetchHttpRequest", e);
        aql1.b("/invalidRequest", g);
    }

    static add c()
    {
        return f;
    }

    static adv d()
    {
        return d;
    }

    public final void a()
    {
        of.a("SdkLessAdLoaderBackgroundTask started.");
        Object obj = new AdRequestInfoParcel(i, null, null);
        AdResponseParcel adresponseparcel = a(((AdRequestInfoParcel) (obj)));
        long l1 = ot.i().b();
        obj = new aio(((AdRequestInfoParcel) (obj)), adresponseparcel, null, null, adresponseparcel.e, l1, adresponseparcel.n, null);
        oe.a.post(new _cls1(((aio) (obj))));
    }

    public final void b()
    {
        synchronized (j)
        {
            oe.a.post(new _cls3());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(10L);
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls3 {}

}
