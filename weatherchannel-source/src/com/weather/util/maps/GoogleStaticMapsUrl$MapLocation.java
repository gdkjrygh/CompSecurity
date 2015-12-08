// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.maps;

import android.text.TextUtils;
import com.google.common.base.Preconditions;
import com.weather.util.geometry.LatLng;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

// Referenced classes of package com.weather.util.maps:
//            GoogleStaticMapsUrl

public static class address
    implements address
{

    private static final ThreadLocal LOCATION_FORMAT = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DecimalFormat initialValue()
        {
            return new DecimalFormat("#.######", DecimalFormatSymbols.getInstance(Locale.US));
        }

    };
    private final String address;
    private final LatLng latLng;

    public String getParamString()
    {
        if (latLng != null)
        {
            return (new StringBuilder()).append(((DecimalFormat)LOCATION_FORMAT.get()).format(latLng.latitude)).append(',').append(((DecimalFormat)LOCATION_FORMAT.get()).format(latLng.longitude)).toString();
        }
        String s;
        try
        {
            s = URLEncoder.encode(address, "utf-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new IllegalStateException("static map request has no usable center", unsupportedencodingexception);
        }
        return s;
    }


    public _cls1(Double double1, Double double2)
    {
        latLng = new LatLng(double1, double2);
        address = null;
    }

    public address(String s)
    {
        latLng = null;
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "%s is not a valid address", new Object[] {
            s
        });
        address = s;
    }
}
