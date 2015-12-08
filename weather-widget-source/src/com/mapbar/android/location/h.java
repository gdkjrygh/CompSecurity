// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.location.Address;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

public final class h
{

    private static Hashtable a;
    private static Hashtable b;
    private static String c = "\u4E2D\u56FD";

    public h()
    {
    }

    public static int a(String s)
    {
        StringBuffer stringbuffer;
        int i;
        try
        {
            stringbuffer = new StringBuffer();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1;
        }
        i = 0;
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuffer.append((String)a.get(String.valueOf(s.charAt(i))));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_10;
_L1:
        i = Integer.parseInt(stringbuffer.toString());
        return i;
    }

    public static String a(int i)
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = String.valueOf(i);
        if (s.length() < 8)
        {
            int j = s.length();
            for (i = 0; i < 8 - j; i++)
            {
                stringbuffer.append("a");
            }

        }
        for (i = 0; i < s.length(); i++)
        {
            stringbuffer.append((String)b.get(String.valueOf(s.charAt(i))));
        }

        return stringbuffer.toString();
    }

    public static List a(Locale locale, String s)
    {
        String s1;
        Object obj;
        Object obj1;
        obj = new JSONObject(s);
        obj1 = ((JSONObject) (obj)).getString("districtName");
        s = ((JSONObject) (obj)).getString("cityName");
        s1 = ((JSONObject) (obj)).getString("provinceName");
        obj = ((JSONObject) (obj)).getJSONObject("poiList");
        Object obj2;
        String s5;
        byte byte0;
        if (((JSONObject) (obj)).getInt("poiItemCount") == 0)
        {
            return null;
        }
        StringBuilder stringbuilder;
        String s2;
        String as[];
        String s3;
        String s4;
        int i;
        int j;
        try
        {
            obj = ((JSONObject) (obj)).getJSONArray("poiItemList");
            j = ((JSONArray) (obj)).length();
            stringbuilder = new StringBuilder();
        }
        // Misplaced declaration of an exception variable
        catch (Locale locale)
        {
            locale.printStackTrace();
            return null;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        if (!"\u76F4\u8F96\u5E02".equals(s1) && s1.trim().length() > 0)
        {
            stringbuilder.append(s1);
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        if (s.trim().length() > 0)
        {
            stringbuilder.append(s);
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        if (((String) (obj1)).trim().length() > 0)
        {
            stringbuilder.append(((String) (obj1)));
        }
        obj1 = new ArrayList();
        i = 0;
_L22:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_661;
        }
        obj2 = (JSONObject)((JSONArray) (obj)).get(i);
        ((JSONObject) (obj2)).getString("poiDirection");
        ((JSONObject) (obj2)).getString("poiType");
        ((JSONObject) (obj2)).getString("poiId");
        ((JSONObject) (obj2)).getInt("poiCommentScore");
        ((JSONObject) (obj2)).getString("poiDistance");
        ((JSONObject) (obj2)).getString("poiCity");
        ((JSONObject) (obj2)).getInt("poiCommentCount");
        ((JSONObject) (obj2)).getString("poiDistrict");
        s2 = ((JSONObject) (obj2)).getString("poiLatLon");
        s3 = ((JSONObject) (obj2)).getString("poiName");
        s4 = ((JSONObject) (obj2)).getString("poiAddress");
        ((JSONObject) (obj2)).getString("roadDistance");
        ((JSONObject) (obj2)).getString("roadDirection");
        ((JSONObject) (obj2)).getString("roadLevel");
        s5 = ((JSONObject) (obj2)).getString("roadName");
        obj2 = new Address(locale);
        byte0 = 1;
        ((Address) (obj2)).setAddressLine(0, c);
        if (stringbuilder.toString().trim().length() <= 0)
        {
            break MISSING_BLOCK_LABEL_350;
        }
        byte0 = 2;
        ((Address) (obj2)).setAddressLine(1, stringbuilder.toString());
        if (s4 == null) goto _L2; else goto _L1
_L1:
        if (s4.trim().length() <= 0) goto _L2; else goto _L3
_L3:
        ((Address) (obj2)).setAddressLine(byte0, s4);
_L13:
        if (s3 == null) goto _L5; else goto _L4
_L4:
        if (s3.trim().length() <= 0) goto _L5; else goto _L6
_L6:
        ((Address) (obj2)).setFeatureName(s3);
_L17:
        ((Address) (obj2)).setCountryName(c);
        ((Address) (obj2)).setCountryCode("CN");
        if (s1 == null) goto _L8; else goto _L7
_L7:
        if ("\u76F4\u8F96\u5E02".equals(s1) || s1.trim().length() <= 0) goto _L8; else goto _L9
_L9:
        ((Address) (obj2)).setAdminArea(s1);
_L19:
        ((Address) (obj2)).setLocality(s);
        if (s5 == null)
        {
            break MISSING_BLOCK_LABEL_471;
        }
        if (s5.trim().length() > 0)
        {
            ((Address) (obj2)).setThoroughfare(s5);
        }
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_646;
        }
        if (s2.indexOf(",") <= 0)
        {
            break MISSING_BLOCK_LABEL_646;
        }
        as = s2.split(",");
        ((Address) (obj2)).setLongitude((double)a(as[0]) / 100000D);
        ((Address) (obj2)).setLatitude((double)a(as[1]) / 100000D);
_L20:
        ((List) (obj1)).add(obj2);
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (s3 == null) goto _L11; else goto _L10
_L10:
        if (s3.trim().length() <= 0) goto _L11; else goto _L12
_L12:
        ((Address) (obj2)).setAddressLine(byte0, s3);
          goto _L13
_L11:
        if (s5 == null) goto _L13; else goto _L14
_L14:
        if (s5.trim().length() <= 0) goto _L13; else goto _L15
_L15:
        ((Address) (obj2)).setAddressLine(byte0, s5);
          goto _L13
_L5:
        if (s5 == null) goto _L17; else goto _L16
_L16:
        if (s5.trim().length() <= 0) goto _L17; else goto _L18
_L18:
        ((Address) (obj2)).setFeatureName(s5);
          goto _L17
_L8:
        ((Address) (obj2)).setAdminArea(s);
          goto _L19
        ((Address) (obj2)).setLatitude(0.0D);
        ((Address) (obj2)).setLongitude(0.0D);
          goto _L20
        return ((List) (obj1));
        if (true) goto _L22; else goto _L21
_L21:
    }

    public static Vector a(String s, String s1)
    {
        Vector vector = new Vector();
        String s2 = s.trim();
        s = s2;
        if (!s2.startsWith(s1))
        {
            s = (new StringBuilder()).append(s1).append(s2).toString();
        }
        s2 = s;
        if (!s.endsWith(s1))
        {
            s2 = (new StringBuilder()).append(s).append(s1).toString();
        }
        int i = s2.indexOf(s1);
        do
        {
            int j = s2.indexOf(s1, i + 1);
            if (j != -1)
            {
                vector.addElement(s2.substring(i + 1, j));
                i = j;
            } else
            {
                return vector;
            }
        } while (true);
    }

    public static Vector a(Vector vector)
    {
        Vector vector1 = new Vector();
        if (!((String)vector.elementAt(0)).equals("$#"))
        {
            return vector1;
        }
        int i;
        try
        {
            i = Integer.parseInt((String)vector.elementAt(1));
        }
        catch (NumberFormatException numberformatexception)
        {
            i = 0;
        }
        if (i < 0)
        {
            return vector1;
        }
        int i1 = Integer.parseInt((String)vector.elementAt(4));
        int k = 5;
        for (int j = 0; j <= i; j++)
        {
            String as[] = new String[i1];
            for (int l = 0; l < i1;)
            {
                as[l] = (String)vector.elementAt(k);
                l++;
                k++;
            }

            vector1.addElement(as);
        }

        return vector1;
    }

    public static List b(Locale locale, String s)
    {
        String as[];
        ArrayList arraylist;
        int i;
        int j;
        int l;
        int i1;
        as = s.split("\\|");
        if (as == null || as.length < 6)
        {
            return null;
        }
        if (!as[1].equals("$#"))
        {
            return null;
        }
        try
        {
            i1 = Integer.parseInt(as[2]);
            l = Integer.parseInt(as[5]);
        }
        // Misplaced declaration of an exception variable
        catch (Locale locale)
        {
            return null;
        }
        if (i1 < 0)
        {
            return null;
        }
        i = l + 5;
        arraylist = new ArrayList();
        j = 0;
_L48:
        if (j >= i1) goto _L2; else goto _L1
_L1:
        Address address = new Address(locale);
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        StringBuilder stringbuilder;
        int k;
        if (j <= 1)
        {
            k = l * j;
        } else
        {
            k = l;
        }
        i = k + i;
        if (l <= 0) goto _L4; else goto _L3
_L3:
        if (i + 1 >= as.length) goto _L4; else goto _L5
_L5:
        s = as[i + 1];
_L46:
        if (l < 3) goto _L7; else goto _L6
_L6:
        if (i + 3 >= as.length) goto _L7; else goto _L8
_L8:
        s1 = as[i + 3];
_L44:
        if (l < 4) goto _L10; else goto _L9
_L9:
        if (i + 4 >= as.length) goto _L10; else goto _L11
_L11:
        s2 = as[i + 4];
_L42:
        if (l < 6) goto _L13; else goto _L12
_L12:
        if (i + 6 >= as.length) goto _L13; else goto _L14
_L14:
        s3 = as[i + 6];
_L40:
        if (l < 10) goto _L16; else goto _L15
_L15:
        if (i + 10 >= as.length) goto _L16; else goto _L17
_L17:
        s4 = as[i + 10];
_L38:
        if (l < 11) goto _L19; else goto _L18
_L18:
        if (i + 11 >= as.length) goto _L19; else goto _L20
_L20:
        s5 = as[i + 11];
_L36:
        if (l < 12) goto _L22; else goto _L21
_L21:
        if (i + 12 >= as.length) goto _L22; else goto _L23
_L23:
        s6 = as[i + 12];
_L34:
        k = 1;
        address.setAddressLine(0, "\u4E2D\u56FD");
        stringbuilder = new StringBuilder();
        if (s4 == null)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        if (!"\u76F4\u8F96\u5E02".equals(s4) && s4.trim().length() > 0)
        {
            stringbuilder.append(s4);
        }
        if (s5 == null)
        {
            break MISSING_BLOCK_LABEL_383;
        }
        if (s5.trim().length() > 0)
        {
            stringbuilder.append(s5);
        }
        if (s6 == null)
        {
            break MISSING_BLOCK_LABEL_407;
        }
        if (s6.trim().length() > 0)
        {
            stringbuilder.append(s6);
        }
        if (stringbuilder.toString().trim().length() <= 0)
        {
            break MISSING_BLOCK_LABEL_435;
        }
        k = 2;
        address.setAddressLine(1, stringbuilder.toString());
        if (s1 == null) goto _L25; else goto _L24
_L24:
        if (s1.trim().length() <= 0) goto _L25; else goto _L26
_L26:
        address.setAddressLine(k, s1);
_L30:
        if (s4 == null) goto _L28; else goto _L27
_L27:
        if ("\u76F4\u8F96\u5E02".equals(s4) || s4.trim().length() <= 0) goto _L28; else goto _L29
_L29:
        address.setAdminArea(s4);
_L31:
        address.setLocality(s5);
        address.setCountryName("\u4E2D\u56FD");
        address.setCountryCode("CN");
        address.setFeatureName(s);
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_537;
        }
        if (s2.trim().length() > 0)
        {
            address.setPhone(s2);
        }
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_592;
        }
        if (s3.indexOf(",") > 0)
        {
            s = s3.split(",");
            address.setLongitude((double)a(s[0]) / 100000D);
            address.setLatitude((double)a(s[1]) / 100000D);
        }
        arraylist.add(address);
        break; /* Loop/switch isn't completed */
_L25:
        address.setAddressLine(k, s);
          goto _L30
        s;
_L32:
        s.printStackTrace();
        break; /* Loop/switch isn't completed */
_L28:
        address.setAdminArea(s5);
          goto _L31
_L2:
        return arraylist;
        s;
          goto _L32
_L22:
        s6 = null;
        if (true) goto _L34; else goto _L33
_L33:
        break; /* Loop/switch isn't completed */
_L19:
        s5 = null;
        if (true) goto _L36; else goto _L35
_L35:
        break; /* Loop/switch isn't completed */
_L16:
        s4 = null;
        if (true) goto _L38; else goto _L37
_L37:
        break; /* Loop/switch isn't completed */
_L13:
        s3 = null;
        if (true) goto _L40; else goto _L39
_L39:
        break; /* Loop/switch isn't completed */
_L10:
        s2 = null;
        if (true) goto _L42; else goto _L41
_L41:
        break; /* Loop/switch isn't completed */
_L7:
        s1 = null;
        if (true) goto _L44; else goto _L43
_L43:
        break; /* Loop/switch isn't completed */
_L4:
        s = null;
        if (true) goto _L46; else goto _L45
_L45:
        j++;
        if (true) goto _L48; else goto _L47
_L47:
    }

    static 
    {
        a = new Hashtable();
        b = new Hashtable();
        a.put("a", "0");
        a.put("b", "1");
        a.put("e", "2");
        a.put("f", "3");
        a.put("n", "4");
        a.put("m", "5");
        a.put("k", "6");
        a.put("l", "7");
        a.put("g", "8");
        a.put("h", "9");
        b.put("0", "a");
        b.put("1", "b");
        b.put("2", "e");
        b.put("3", "f");
        b.put("4", "n");
        b.put("5", "m");
        b.put("6", "k");
        b.put("7", "l");
        b.put("8", "g");
        b.put("9", "h");
    }
}
