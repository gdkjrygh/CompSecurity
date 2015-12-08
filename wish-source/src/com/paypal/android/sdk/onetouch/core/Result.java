// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            cu, ResultType, ResponseType

public final class Result
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cu();
    private static final String a = com/paypal/android/sdk/onetouch/core/Result.getSimpleName();
    private static boolean h;
    private final String b;
    private final ResultType c;
    private final ResponseType d;
    private final JSONObject e;
    private final String f;
    private final Throwable g;

    Result()
    {
        this(ResultType.Cancel, null, null, null, null, null);
    }

    private Result(Parcel parcel)
    {
        b = (String)parcel.readValue(null);
        c = (ResultType)parcel.readValue(com/paypal/android/sdk/onetouch/core/ResultType.getClassLoader());
        d = (ResponseType)parcel.readValue(com/paypal/android/sdk/onetouch/core/ResponseType.getClassLoader());
        Object obj = (String)parcel.readValue(null);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = new JSONObject(((String) (obj)));
_L4:
        e = ((JSONObject) (obj));
        f = (String)parcel.readValue(null);
        g = (Throwable)parcel.readValue(null);
        return;
        obj;
        (new StringBuilder("Failed to read parceled JSON for mResponse: ")).append(obj);
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    Result(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    private Result(ResultType resulttype, String s, ResponseType responsetype, JSONObject jsonobject, String s1, Throwable throwable)
    {
        if (!h && resulttype == null)
        {
            throw new AssertionError();
        } else
        {
            b = s;
            c = resulttype;
            d = responsetype;
            e = jsonobject;
            f = s1;
            g = throwable;
            return;
        }
    }

    Result(String s, ResponseType responsetype, JSONObject jsonobject, String s1)
    {
        this(ResultType.Success, s, responsetype, jsonobject, s1, null);
    }

    Result(Throwable throwable)
    {
        this(ResultType.Error, null, null, null, null, throwable);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Throwable getError()
    {
        return g;
    }

    public final JSONObject getResponse()
    {
        JSONObject jsonobject;
        try
        {
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.put("environment", b);
            jsonobject1.put("paypal_sdk_version", "2.1.1");
            jsonobject1.put("platform", "Android");
            jsonobject1.put("product_name", "OneTouchCore-Android");
            jsonobject = new JSONObject();
            jsonobject.put("client", jsonobject1);
            if (e != null)
            {
                jsonobject.put("response", e);
            }
            if (d != null)
            {
                jsonobject.put("response_type", d.name());
            }
            if (f != null)
            {
                JSONObject jsonobject2 = new JSONObject();
                jsonobject2.put("display_string", f);
                jsonobject.put("user", jsonobject2);
            }
            Log.e(a, (new StringBuilder("Success encoding JSON")).append(jsonobject).toString());
        }
        catch (JSONException jsonexception)
        {
            Log.e(a, "Error encoding JSON", jsonexception);
            return null;
        }
        return jsonobject;
    }

    public final ResultType getResultType()
    {
        return c;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(b);
        parcel.writeValue(c);
        parcel.writeValue(d);
        if (e != null)
        {
            parcel.writeValue(e.toString());
        } else
        {
            parcel.writeValue(null);
        }
        parcel.writeValue(f);
        parcel.writeValue(g);
    }

    static 
    {
        boolean flag;
        if (!com/paypal/android/sdk/onetouch/core/Result.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
    }
}
