// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            Request, cn, df, PayPalOneTouchCore, 
//            b, c, db, da, 
//            cx, dd, co, d, 
//            de, RequestTarget, Result, cp, 
//            ct, ResponseType, dj, dc, 
//            dl, Protocol

public class AuthorizationRequest extends Request
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cn();
    public static final String ENVIRONMENT_LIVE = "live";
    public static final String ENVIRONMENT_MOCK = "mock";
    public static final String ENVIRONMENT_SANDBOX = "sandbox";
    private static final String a = com/paypal/android/sdk/onetouch/core/AuthorizationRequest.getSimpleName();
    private final Pattern b;
    private df c;
    private String d;
    private String e;
    private HashSet f;
    private HashMap g;
    private final String h;
    private final byte i[];

    public AuthorizationRequest(Context context)
    {
        b = Pattern.compile("\\s");
        c = new df();
        clientMetadataId(PayPalOneTouchCore.getClientMetadataId(context));
        h = UUID.randomUUID().toString();
        i = df.a();
        g = new HashMap();
        f = new HashSet();
    }

    private AuthorizationRequest(Parcel parcel)
    {
        b = Pattern.compile("\\s");
        c = new df();
        clientMetadataId(parcel.readString());
        clientId(parcel.readString());
        environment(parcel.readString());
        d = parcel.readString();
        e = parcel.readString();
        f = (HashSet)parcel.readSerializable();
        g = (HashMap)parcel.readSerializable();
        h = parcel.readString();
        i = new byte[parcel.readInt()];
        parcel.readByteArray(i);
    }

    AuthorizationRequest(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    private String a(Context context, X509Certificate x509certificate)
    {
        JSONObject jsonobject;
        b b1;
        b1 = new b(context, (new c()).b());
        jsonobject = new JSONObject();
        jsonobject.put("version", 3);
        jsonobject.put("client_id", getClientId());
        jsonobject.put("app_name", b1.b());
        jsonobject.put("environment", getEnvironment());
        jsonobject.put("environment_url", getEnvironmentUrl());
        jsonobject.put("scope", getScopeString());
        jsonobject.put("response_type", "code");
        jsonobject.put("privacy_url", getPrivacyUrl());
        jsonobject.put("agreement_url", getUserAgreementUrl());
        jsonobject.put("client_metadata_id", getClientMetadataId());
        jsonobject.put("key_id", x509certificate.getSerialNumber());
        x509certificate = new Intent("android.intent.action.VIEW", Uri.parse("https://www.paypal.com"));
        x509certificate.setPackage("com.android.chrome");
        boolean flag;
        if (x509certificate.resolveActivity(context.getPackageManager()) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            jsonobject.put("android_chrome_available", flag);
            for (context = g.entrySet().iterator(); context.hasNext(); jsonobject.put((String)x509certificate.getKey(), x509certificate.getValue()))
            {
                x509certificate = (java.util.Map.Entry)context.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException(context);
        }
        context = Base64.encodeToString(jsonobject.toString().getBytes(), 2);
        return context;
    }

    private Set c()
    {
        return new HashSet(f);
    }

    protected final volatile Request a()
    {
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public dc getBrowserSwitchRecipe(db db1)
    {
        return db1.a(c());
    }

    public String getBrowserSwitchUrl(Context context, db db1)
    {
        String s = context.getPackageName();
        Object obj = db1.a(c()).b(getEnvironment());
        (new StringBuilder("selected environment: ")).append(getEnvironment());
        (new StringBuilder("selected configEndpoint:")).append(((cx) (obj)).a()).append(" with url: ").append(((cx) (obj)).b());
        db1 = dd.a(((cx) (obj)).c());
        context = (new StringBuilder()).append(((cx) (obj)).b()).append("?payload=").append(URLEncoder.encode(a(context, db1), "utf-8")).append("&payloadEnc=");
        obj = new JSONObject();
        ((JSONObject) (obj)).put("timestamp", (new co(this)).format(new Date()));
        ((JSONObject) (obj)).put("msg_GUID", h);
        ((JSONObject) (obj)).put("sym_key", dd.a(i));
        new d();
        ((JSONObject) (obj)).put("device_name", com.paypal.android.sdk.onetouch.core.d.a());
        return context.append(URLEncoder.encode(Base64.encodeToString(df.a(((JSONObject) (obj)).toString().getBytes(), db1), 2), "utf-8")).append("&x-source=").append(s).append("&x-success=").append(getSuccessUrl()).append("&x-cancel=").append(getCancelUrl()).toString();
    }

    public String getPrivacyUrl()
    {
        return d;
    }

    public dc getRecipeToExecute(Context context, db db1, boolean flag)
    {
        Iterator iterator = db1.c().iterator();
_L2:
        da da1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        da1 = (da)iterator.next();
        if (!da1.a(c()))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (RequestTarget.wallet == da1.d())
        {
            if (da1.a(context, flag))
            {
                return da1;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (RequestTarget.browser != da1.d())
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag1;
        String s = getBrowserSwitchUrl(context, db1);
        (new StringBuilder("generated url:")).append(s);
        flag1 = da1.a(context, s);
        if (flag1)
        {
            return da1;
        }
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
_L3:
        Log.e(a, "cannot create browser switch URL", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        return null;
        obj;
          goto _L3
        obj;
          goto _L3
        obj;
          goto _L3
        obj;
          goto _L3
        obj;
          goto _L3
        obj;
          goto _L3
        obj;
          goto _L3
        obj;
          goto _L3
        obj;
          goto _L3
    }

    public String getScopeString()
    {
        return TextUtils.join(" ", c());
    }

    public String getUserAgreementUrl()
    {
        return e;
    }

    public Result parseBrowserResponse(b b1, Uri uri)
    {
        Object obj;
        boolean flag;
        flag = false;
        obj = uri.getLastPathSegment();
        if (!Uri.parse(getSuccessUrl()).getLastPathSegment().equals(obj))
        {
            return new Result();
        }
        obj = uri.getQueryParameter("payloadEnc");
        uri = Base64.decode(uri.getQueryParameter("payload"), 0);
        uri = new JSONObject(new String(uri));
        (new StringBuilder("unencrypted data: ")).append(uri.toString(4));
        if (!uri.has("msg_GUID")) goto _L2; else goto _L1
_L1:
        String s = uri.optString("msg_GUID");
        if (!TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
        Log.e(a, "response msgGUID is empty");
_L12:
        if (!flag) goto _L6; else goto _L5
_L5:
        if (!validResponse(b1, s)) goto _L6; else goto _L7
_L7:
        b1 = b1.a("com.paypal.otc.key");
        obj = Base64.decode(((String) (obj)), 0);
        b1 = dd.b(b1);
        b1 = new JSONObject(new String((new df()).a(((byte []) (obj)), b1)));
        (new StringBuilder("decrypted payload: ")).append(b1.toString(4));
        obj = uri.optString("error");
        if (TextUtils.isEmpty(((CharSequence) (obj))) || "null".equals(obj)) goto _L9; else goto _L8
_L8:
        b1 = new Result(new cp(((String) (obj))));
        return b1;
        b1;
_L13:
        Log.e(a, "failed", b1);
        return new Result(new ct(b1));
_L4:
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L11; else goto _L10
_L10:
        Log.e(a, "empty payloadEnc");
          goto _L12
_L9:
        return new Result(uri.optString("environment"), ResponseType.authorization_code, (new JSONObject()).put("code", b1.getString("payment_code")), b1.getString("email"));
_L6:
        Log.e(a, "response not understood");
        return new Result(new ct("Response was not understood"));
_L2:
        b1 = new Result(new ct("Response was missing some information"));
        return b1;
        b1;
          goto _L13
        b1;
          goto _L13
        b1;
          goto _L13
        b1;
          goto _L13
        b1;
          goto _L13
_L11:
        flag = true;
          goto _L12
        b1;
          goto _L13
        b1;
          goto _L13
    }

    public void persistRequiredFields(b b1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("com.paypal.otc.msg_guid", h);
        hashmap.put("com.paypal.otc.key", dd.a(i));
        b1.a(hashmap);
    }

    public AuthorizationRequest privacyUrl(String s)
    {
        d = s;
        return this;
    }

    public String toString()
    {
        return String.format((new StringBuilder()).append(com/paypal/android/sdk/onetouch/core/AuthorizationRequest.getSimpleName()).append(": {").append(b()).append(", privacyUrl:%s, userAgreementUrl:%s, scopeValues:%s}").toString(), new Object[] {
            getClientId(), d, e, f
        });
    }

    public void trackFpti(Context context, dl dl, Protocol protocol)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("clid", getClientId());
        PayPalOneTouchCore.getFptiManager(context).a(dl, getEnvironment(), hashmap, protocol);
    }

    public AuthorizationRequest userAgreementUrl(String s)
    {
        e = s;
        return this;
    }

    public boolean validResponse(b b1, String s)
    {
        String s1 = b1.a("com.paypal.otc.msg_guid");
        b1 = b1.a("com.paypal.otc.key");
        if (TextUtils.isEmpty(s1))
        {
            Log.e(a, "stored msg_GUID is empty");
        } else
        if (!s.equals(s1))
        {
            Log.e(a, "msgGUIDs do not match");
        } else
        if (TextUtils.isEmpty(b1))
        {
            Log.e(a, "empty symmetric key");
        } else
        {
            return true;
        }
        return false;
    }

    public boolean validateV1V2Response(b b1, Bundle bundle)
    {
        return true;
    }

    public AuthorizationRequest withAdditionalPayloadAttribute(String s, String s1)
    {
        g.put(s, s1);
        return this;
    }

    public AuthorizationRequest withScopeValue(String s)
    {
        if (b.matcher(s).find())
        {
            throw new IllegalArgumentException("scopes must be provided individually, with no whitespace");
        } else
        {
            f.add(s);
            return this;
        }
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeString(getClientMetadataId());
        parcel.writeString(getClientId());
        parcel.writeString(getEnvironment());
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeSerializable(f);
        parcel.writeSerializable(g);
        parcel.writeString(h);
        parcel.writeInt(i.length);
        parcel.writeByteArray(i);
    }

}
