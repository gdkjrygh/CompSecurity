// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.location.Location;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.location.UberLatLngBounds;
import com.ubercab.android.location.UberLocation;
import java.io.IOException;
import java.util.Locale;
import org.json.JSONException;

public final class duc
{

    public static boolean a(Context context, UberLocation uberlocation, String s)
    {
        boolean flag = false;
        if (uberlocation == null)
        {
            uberlocation = null;
        } else
        {
            uberlocation = uberlocation.g();
        }
        if (uberlocation != null)
        {
            Location location = new Location("other");
            location.setLatitude(uberlocation.a());
            location.setLongitude(uberlocation.b());
            try
            {
                flag = gnu.a(context, location, s);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
        }
        return flag;
    }

    public static boolean a(UberLocation uberlocation)
    {
label0:
        {
            boolean flag1 = Locale.getDefault().getLanguage().startsWith("de");
            boolean flag = flag1;
            if (uberlocation != null)
            {
                if (!(new UberLatLngBounds(new UberLatLng(47.299999999999997D, 5.3200000000000003D), new UberLatLng(55.119999999999997D, 14.800000000000001D))).a(uberlocation.g()) && !flag1)
                {
                    break label0;
                }
                flag = true;
            }
            return flag;
        }
        return false;
    }
}
