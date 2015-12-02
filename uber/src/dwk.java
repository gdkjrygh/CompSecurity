// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderAddressComponent;
import com.ubercab.client.core.location.RiderLocation;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class dwk
{

    private static final Pattern a = Pattern.compile("(\\w+)\\[([\\w_,]+)\\]\\[?(\\w+)?\\]?=(.*?)(?:&|$)");
    private static final List b = (new gkf()).a("street_number").a("route").a("locality").a("postal_code").a("administrative_area_level_1").a("administrative_area_level_2").a("country").a();

    private static UberLatLng a(List list, UberLatLng uberlatlng)
    {
        String s = b(list, "latitude");
        list = b(list, "longitude");
        boolean flag;
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(list))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            uberlatlng = new UberLatLng(Double.parseDouble(s), Double.parseDouble(list));
        }
        return uberlatlng;
    }

    public static RiderLocation a(Uri uri)
    {
        return a(uri, "dropoff", null);
    }

    public static RiderLocation a(Uri uri, RiderLocation riderlocation)
    {
        UberLatLng uberlatlng = null;
        if (riderlocation != null)
        {
            uberlatlng = riderlocation.getUberLatLng();
        }
        return a(uri, "pickup", uberlatlng);
    }

    private static RiderLocation a(Uri uri, String s, UberLatLng uberlatlng)
    {
        uri = a(a(uri.toString()), s);
        s = a(((List) (uri)), uberlatlng);
        if (s == null)
        {
            return null;
        } else
        {
            uberlatlng = b(uri, "nickname");
            String s1 = b(uri, "formatted_address");
            return RiderLocation.create("external", s, a(((List) (uri))), s1, uberlatlng);
        }
    }

    private static List a(String s)
    {
        Matcher matcher = a.matcher(s);
        ArrayList arraylist = new ArrayList();
        do
        {
            if (!matcher.find())
            {
                break;
            }
            String s2 = matcher.group(1);
            String s1 = matcher.group(2);
            s = s1;
            if (s1 == null)
            {
                s = "";
            }
            List list = Arrays.asList(s.split(","));
            s1 = matcher.group(3);
            try
            {
                s = URLDecoder.decode(matcher.group(4), "utf-8");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s = "";
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s = "";
                s1 = "";
            }
            arraylist.add(new dwj(s2, list, s1, s));
        } while (true);
        return arraylist;
    }

    private static List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            RiderAddressComponent rideraddresscomponent = c(list, (String)iterator.next());
            if (rideraddresscomponent != null)
            {
                arraylist.add(rideraddresscomponent);
            }
        } while (true);
        return arraylist;
    }

    private static List a(List list, String s)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            dwj dwj1 = (dwj)list.next();
            if (dwj1.b().equals(s))
            {
                arraylist.add(dwj1);
            }
        } while (true);
        return arraylist;
    }

    public static String b(Uri uri)
    {
        return uri.getQueryParameter("client_id");
    }

    private static String b(List list, String s)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            dwj dwj1 = (dwj)list.next();
            if (dwj1.d().contains(s))
            {
                return dwj1.a();
            }
        }

        return null;
    }

    private static RiderAddressComponent c(List list, String s)
    {
        Object obj;
        Object obj1;
        HashSet hashset;
        Iterator iterator;
        hashset = new HashSet();
        iterator = list.iterator();
        obj = "";
        obj1 = "";
        list = "";
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        dwj dwj1 = (dwj)iterator.next();
        if (dwj1.d().contains(s))
        {
            hashset.addAll(dwj1.d());
            String s1 = dwj1.c();
            if (TextUtils.isEmpty(s1))
            {
                list = dwj1.a();
            } else
            {
                Object obj2 = obj;
                if ("short_name".equals(s1))
                {
                    obj2 = dwj1.a();
                }
                if ("long_name".equals(s1))
                {
                    obj = dwj1.a();
                } else
                {
                    obj = obj1;
                }
                obj1 = obj;
                obj = obj2;
            }
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (TextUtils.isEmpty(((CharSequence) (obj1))) && TextUtils.isEmpty(((CharSequence) (obj))) && TextUtils.isEmpty(list))
        {
            return null;
        }
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            if (TextUtils.isEmpty(list))
            {
                s = ((String) (obj));
            } else
            {
                s = list;
            }
        } else
        {
            s = ((String) (obj1));
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = list;
            if (TextUtils.isEmpty(list))
            {
                obj = s;
            }
        }
        return RiderAddressComponent.a().b(((String) (obj))).a(s).a(new ArrayList(hashset));
    }

    public static String c(Uri uri)
    {
        return uri.getQueryParameter("product_id");
    }

    public static String d(Uri uri)
    {
        return uri.getQueryParameter("product_group");
    }

    public static Float e(Uri uri)
    {
        uri = uri.getQueryParameter("surge");
        if (TextUtils.isEmpty(uri))
        {
            return null;
        } else
        {
            return Float.valueOf(Float.parseFloat(uri));
        }
    }

}
