// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            Request, cq, c, db, 
//            cw, RequestTarget, Result, b, 
//            ResponseType, ct, cp, PayPalOneTouchCore, 
//            dj, dc, dl, Protocol

public class CheckoutRequest extends Request
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cq();
    private static final String a = com/paypal/android/sdk/onetouch/core/CheckoutRequest.getSimpleName();
    private String b;
    private String c;
    private String d;

    public CheckoutRequest()
    {
        c = "token";
    }

    private CheckoutRequest(Parcel parcel)
    {
        clientMetadataId(parcel.readString());
        clientId(parcel.readString());
        environment(parcel.readString());
        b = parcel.readString();
        c = parcel.readString();
    }

    CheckoutRequest(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    protected final volatile Request a()
    {
        return this;
    }

    public CheckoutRequest approvalURL(String s)
    {
        b = s;
        if (com.paypal.android.sdk.onetouch.core.c.b(s) && s.contains("ba_token"))
        {
            c = "ba_token";
            return this;
        } else
        {
            c = "token";
            return this;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public dc getBrowserSwitchRecipe(db db1)
    {
        return db1.b();
    }

    public String getBrowserSwitchUrl(Context context, db db1)
    {
        return b;
    }

    public String getPairingId()
    {
        return d;
    }

    public dc getRecipeToExecute(Context context, db db1, boolean flag)
    {
label0:
        {
            Iterator iterator = db1.d().iterator();
            cw cw1;
label1:
            do
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    cw1 = (cw)iterator.next();
                    if (RequestTarget.wallet != cw1.d())
                    {
                        continue label1;
                    }
                } while (!cw1.a(context, flag));
                return cw1;
            } while (RequestTarget.browser != cw1.d() || !cw1.a(context, getBrowserSwitchUrl(context, db1)));
            return cw1;
        }
        return null;
    }

    public boolean isBillingAgreement()
    {
        return c == "ba_token";
    }

    public CheckoutRequest pairingId(String s)
    {
        d = s;
        return this;
    }

    public Result parseBrowserResponse(b b1, Uri uri)
    {
        String s = uri.getLastPathSegment();
        if (!Uri.parse(getSuccessUrl()).getLastPathSegment().equals(s))
        {
            return new Result();
        }
        b1 = b1.a("com.paypal.otc.hermes.token");
        s = uri.getQueryParameter(c);
        if (s != null && TextUtils.equals(b1, s))
        {
            try
            {
                b1 = new JSONObject();
                b1.put("webURL", uri.toString());
                b1 = new Result(null, ResponseType.web, b1, null);
            }
            // Misplaced declaration of an exception variable
            catch (b b1)
            {
                return new Result(new ct(b1));
            }
            return b1;
        } else
        {
            return new Result(new cp("The response contained inconsistent data."));
        }
    }

    public void persistRequiredFields(b b1)
    {
        b1.a("com.paypal.otc.hermes.token", Uri.parse(b).getQueryParameter(c));
    }

    public String toString()
    {
        return String.format((new StringBuilder()).append(com/paypal/android/sdk/onetouch/core/CheckoutRequest.getSimpleName()).append(": {").append(b()).append(", approvalURL: %s}").toString(), new Object[] {
            b
        });
    }

    public void trackFpti(Context context, dl dl, Protocol protocol)
    {
        String s = Uri.parse(b).getQueryParameter(c);
        HashMap hashmap = new HashMap();
        hashmap.put("fltk", s);
        hashmap.put("clid", getClientId());
        PayPalOneTouchCore.getFptiManager(context).a(dl, getEnvironment(), hashmap, protocol);
    }

    public boolean validateV1V2Response(b b1, Bundle bundle)
    {
        b1 = b1.a("com.paypal.otc.hermes.token");
        bundle = bundle.getString("webURL");
        if (bundle != null)
        {
            bundle = Uri.parse(bundle).getQueryParameter(c);
            if (bundle != null && TextUtils.equals(b1, bundle))
            {
                return true;
            }
            Log.e(a, "EC-tokens don't match");
        } else
        {
            Log.e(a, "no webURL in response!");
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(getClientMetadataId());
        parcel.writeString(getClientId());
        parcel.writeString(getEnvironment());
        parcel.writeString(b);
        parcel.writeString(c);
    }

}
