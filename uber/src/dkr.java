// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.mobileapptracker.MobileAppTracker;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.network.SignupApi;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class dkr
{

    private final SignupApi a;
    private final cev b;
    private final Context c;
    private final hjn d;
    private final cyy e;
    private final dak f;
    private final MobileAppTracker g;
    private final dao h;
    private final gju i;
    private final chp j;

    public dkr(cev cev, Context context, hjn hjn1, cyy cyy1, SignupApi signupapi, dak dak1, MobileAppTracker mobileapptracker, 
            dao dao1, gju gju1, chp chp1)
    {
        a = signupapi;
        e = cyy1;
        b = cev;
        c = context;
        d = hjn1;
        f = dak1;
        g = mobileapptracker;
        h = dao1;
        i = gju1;
        j = chp1;
    }

    static cev a(dkr dkr1)
    {
        return dkr1.b;
    }

    private String a()
    {
        return cxf.a(cwt.a(c));
    }

    private static String a(String s)
    {
        return (new JSONObject(gkg.a("ack_type", s))).toString();
    }

    private static String a(String s, String s1)
    {
        return (new JSONObject(gkg.a("paytm_email", s, "paytm_mobile", s1))).toString();
    }

    private static String a(String s, String s1, String s2)
    {
        return (new JSONObject(gkg.a("alipay_id", s, "alipay_mobile", s1, "ack_type", s2))).toString();
    }

    private void a(Map map)
    {
        map.put("app", cyy.b());
        map.put("device", "android");
        map.put("deviceData", d.a());
        map.put("device_id", a());
        map.put("device_mobile_digits", cwt.d(c));
        map.put("device_mobile_country_iso2", cwt.e(c));
        map.put("device_model", Build.MODEL);
        map.put("device_os", android.os.Build.VERSION.RELEASE);
        map.put("device_serial_number", cwt.c());
        map.put("epoch", Long.valueOf(gju.a()));
        map.put("language", cwt.a());
        Object obj;
        if (h.q())
        {
            map.put("version", h.r());
        } else
        {
            map.put("version", cyy.a());
        }
        obj = f.c();
        if (obj != null)
        {
            map.put("altitude", Double.valueOf(((RiderLocation) (obj)).getAltitude()));
            map.put("course", Float.valueOf(((RiderLocation) (obj)).getBearing()));
            map.put("horizontal_accuracy", Float.valueOf(((RiderLocation) (obj)).getAccuracy()));
            map.put("latitude", Double.valueOf(((RiderLocation) (obj)).getUberLatLng().a()));
            map.put("longitude", Double.valueOf(((RiderLocation) (obj)).getUberLatLng().b()));
            map.put("speed", Float.valueOf(((RiderLocation) (obj)).getSpeed()));
        }
        obj = g.getGoogleAdvertisingId();
        if (obj != null && !((String) (obj)).isEmpty())
        {
            map.put("device_ids", gkg.a("googleAdvertisingId", obj));
        }
        map.put("device_ids", gkg.a("device_imei", cwt.f(c)));
        if (j != null && j.e() != null)
        {
            map.put("signup_session_id", j.e().b());
        }
        if (h.o())
        {
            map.put("client_id", h.n());
        }
    }

    private void a(Map map, dks dks1)
    {
        a.create(map, dks1);
    }

    private void a(Map map, dkt dkt1)
    {
        a.validate(map, dkt1);
    }

    private static String b(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.toUpperCase(Locale.US);
        }
    }

    private Map e(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, long l)
    {
        String s10 = s5;
        if (TextUtils.isEmpty(s5))
        {
            s10 = "";
        }
        s5 = new HashMap();
        a(s5);
        s5.put("email", s);
        s5.put("mobile", s1);
        s5.put("first_name", s3);
        s5.put("last_name", s4);
        s5.put("mobile_country_iso2", b(s2));
        s5.put("signup_form", "android");
        s5.put("promotion_code", s10);
        if (!TextUtils.isEmpty(s9))
        {
            s5.put("third_party_identity_type", s8);
            s5.put("third_party_access_token", s9);
            s5.put("third_party_access_token_expiry", Long.valueOf(l));
            return s5;
        }
        if (!TextUtils.isEmpty(s7))
        {
            s5.put("google_oauth_token_type", "jwt");
            s5.put("google_oauth_token", s7);
            return s5;
        } else
        {
            s5.put("password", s6);
            return s5;
        }
    }

    public final void a(String s, String s1, String s2, String s3)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("email", s);
        hashmap.put("mobile", s1);
        hashmap.put("mobile_country_iso2", b(s2));
        hashmap.put("password", s3);
        hashmap.put("device", "android");
        hashmap.put("device_id", a());
        a(((Map) (hashmap)));
        a(((Map) (hashmap)), new dkt(this));
    }

    public final void a(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8)
    {
        s1 = e(s, s1, s2, s3, s4, s7, s8, null, null, null, 0L);
        s1.put("token_type", "alipay");
        s1.put("token_data", a(s5, s6, "M"));
        a(((Map) (s1)), new dks(this, s, "alipay"));
    }

    public final void a(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, long l)
    {
        s1 = e(s, s1, s2, s3, s4, s5, s6, null, s7, s8, l);
        s1.put("token_type", "alipay");
        s1.put("token_data", a("M"));
        a(((Map) (s1)), new dks(this, s, "alipay"));
    }

    public final void a(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, long l)
    {
        a(e(s, s1, s2, s3, s4, s5, s6, s7, s8, s9, l), new dks(this, s, null));
    }

    public final void a(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, long l, Map map)
    {
        s1 = e(s, s1, s2, s3, s4, s6, s5, s7, s8, s9, l);
        s1.putAll(map);
        a(((Map) (s1)), new dks(this, s, s8));
    }

    public final void a(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, String s10, long l, String s11)
    {
        s1 = e(s, s1, s2, s3, s4, s6, s7, s8, s9, s10, l);
        s1.put("token_type", "paypal");
        s1.put("token_data", s5);
        s1.put("paypal_correlation_id", s11);
        a(((Map) (s1)), new dks(this, s, "paypal"));
    }

    public final void a(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, String s10, String s11, String s12, boolean flag, 
            String s13, String s14, String s15, String s16, long l)
    {
        s1 = e(s, s1, s2, s3, s4, s12, s13, s14, s15, s16, l);
        s1.put("card_number", s5);
        s1.put("card_code", s6);
        s1.put("card_expiration_month", s7);
        s1.put("card_expiration_year", s8);
        s1.put("cardio", Boolean.valueOf(flag));
        s1.put("billing_zip", s9);
        s1.put("billing_country_iso2", b(s10));
        s1.put("use_case", s11);
        a(((Map) (s1)), new dks(this, s, "braintree"));
    }

    public final void b(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, long l)
    {
        s1 = e(s, s1, s2, s3, s4, s5, s6, s7, s8, s9, l);
        s1.put("token_type", "cash");
        a(s1, new dks(this, s, "cash"));
    }

    public final void c(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, long l)
    {
        s1 = e(s, s1, s2, s3, s4, s5, s6, s7, s8, s9, l);
        s1.put("is_google_wallet", Boolean.valueOf(true));
        a(s1, new dks(this, s, "braintree", true));
    }

    public final void d(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, long l)
    {
        s2 = e(s, s1, s2, s3, s4, s5, s6, s7, s8, s9, l);
        s2.put("token_type", "paytm");
        s2.put("token_data", a(s, s1));
        a(s2, new dks(this, s, "paytm"));
    }
}
