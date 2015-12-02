// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.Location;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.whatsapp:
//            App, afm, al0, PlaceInfo, 
//            afu

public class t3 extends ArrayList
{

    private static ArrayList c;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String i;
    public static final String m;
    private static final String z[];
    protected String a;
    protected boolean b;
    public int d;
    protected String h;
    protected String j;
    protected int k;
    protected Location l;

    public t3()
    {
        j = "";
        h = "";
    }

    public t3(int i1, Location location, int j1, String s, String s1)
    {
        j = "";
        h = "";
        d = i1;
        l = location;
        k = j1;
        if (s != null)
        {
            j = s;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        h = s1;
        return;
        location;
        throw location;
    }

    private static t3 a(int i1, Location location, int j1, String s, String s1)
    {
        i1 = App.am;
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            t3 t3_1 = (t3)iterator.next();
            boolean flag;
            try
            {
                if (!t3_1.j.equalsIgnoreCase(s))
                {
                    continue;
                }
                flag = t3_1.h.equalsIgnoreCase(s1);
            }
            // Misplaced declaration of an exception variable
            catch (Location location)
            {
                throw location;
            }
            if (flag)
            {
                double d1 = t3_1.l.distanceTo(location);
                double d2 = (double)((t3_1.k + j1) / 2) * 0.20000000000000001D;
                if (d1 < d2)
                {
                    int k1;
                    try
                    {
                        k1 = Math.abs(t3_1.k - j1);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Location location)
                    {
                        throw location;
                    }
                    if ((double)k1 < d2)
                    {
                        return t3_1;
                    }
                }
            }
        } while (i1 == 0);
        return null;
    }

    public static t3 a(Location location, int i1, String s, String s1)
    {
        if (s == null)
        {
            s = "";
        }
        String s2;
        t3 t3_1;
        int j1;
        boolean flag;
        if (s1 == null)
        {
            s2 = "";
        } else
        {
            s2 = s1;
        }
        j1 = (int)(Math.log(i1) / Math.log(2D));
        t3_1 = a(1, location, i1, s, s2);
        s1 = t3_1;
        if (t3_1 != null)
        {
            break MISSING_BLOCK_LABEL_509;
        }
        t3_1 = new t3(1, location, i1, s, s2);
        s1 = new ArrayList();
        s1.add(new BasicNameValuePair(z[30], (new StringBuilder()).append(location.getLatitude()).append(",").append(location.getLongitude()).toString()));
        s1.add(new BasicNameValuePair(z[33], Integer.toString(i1)));
        if (s2 != null)
        {
            try
            {
                if (!"".equals(s2))
                {
                    s1.add(new BasicNameValuePair(z[25], s2));
                }
            }
            // Misplaced declaration of an exception variable
            catch (Location location)
            {
                throw location;
            }
        }
        if (s != null)
        {
            try
            {
                if (!"".equals(s))
                {
                    s1.add(new BasicNameValuePair(z[24], s));
                }
            }
            // Misplaced declaration of an exception variable
            catch (Location location)
            {
                throw location;
            }
        }
        location = App.au.getResources().getConfiguration().locale;
        if (location != null)
        {
            try
            {
                s1.add(new BasicNameValuePair(z[31], location.getLanguage()));
            }
            // Misplaced declaration of an exception variable
            catch (Location location)
            {
                throw location;
            }
        }
        location = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(location, 15000);
        HttpConnectionParams.setSoTimeout(location, 30000);
        HttpProtocolParams.setUserAgent(location, afm.a());
        location = (new DefaultHttpClient(location)).execute(new HttpGet((new StringBuilder()).append(al0.s).append(URLEncodedUtils.format(s1, z[26])).toString()));
        if (location == null)
        {
            try
            {
                throw new IOException(z[29]);
            }
            // Misplaced declaration of an exception variable
            catch (Location location)
            {
                throw location;
            }
        }
        break MISSING_BLOCK_LABEL_367;
        location;
        throw location;
        s1 = t3_1;
        if (location.getStatusLine().getStatusCode() != 200)
        {
            break MISSING_BLOCK_LABEL_509;
        }
        location = new JSONObject(EntityUtils.toString(location.getEntity()));
        s = location.getString(z[32]);
        flag = z[27].equals(s);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_449;
        }
        t3_1.b = true;
        i1 = App.am;
        s1 = t3_1;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_509;
        }
        flag = z[28].equals(s);
        s1 = t3_1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_509;
        }
        try
        {
            t3_1.b(location);
            c.add(t3_1);
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            throw location;
        }
        s1 = t3_1;
        if (c.size() <= 12)
        {
            break MISSING_BLOCK_LABEL_509;
        }
        c.remove(0);
        s1 = t3_1;
        return s1;
        location;
        try
        {
            throw location;
        }
        // Misplaced declaration of an exception variable
        catch (Location location) { }
        try
        {
            throw location;
        }
        // Misplaced declaration of an exception variable
        catch (Location location) { }
        throw location;
    }

    public static void a(int i1)
    {
        int j1 = App.am;
        ArrayList arraylist = new ArrayList();
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            t3 t3_1 = (t3)iterator.next();
            try
            {
                if (t3_1.d == i1)
                {
                    arraylist.add(t3_1);
                }
            }
            catch (NumberFormatException numberformatexception)
            {
                throw numberformatexception;
            }
        } while (j1 == 0);
        c.removeAll(arraylist);
    }

    public static t3 b(Location location, int i1, String s, String s1)
    {
        Object obj;
        if (s == null)
        {
            s = "";
        }
        if (s1 == null)
        {
            s1 = "";
        }
        int j1 = (int)(Math.log(i1) / Math.log(2D));
        t3 t3_1 = a(3, location, i1, s, s1);
        obj = t3_1;
        if (t3_1 != null)
        {
            break MISSING_BLOCK_LABEL_522;
        }
        s = new t3(3, location, i1, s, s1);
        obj = new ArrayList();
        ((List) (obj)).add(new BasicNameValuePair(z[14], (new StringBuilder()).append(location.getLatitude()).append(",").append(location.getLongitude()).toString()));
        ((List) (obj)).add(new BasicNameValuePair(z[21], Integer.toString(Math.min(i1, 4999))));
        if (s1 != null)
        {
            try
            {
                if (!"".equals(s1))
                {
                    ((List) (obj)).add(new BasicNameValuePair("q", s1));
                }
            }
            // Misplaced declaration of an exception variable
            catch (Location location)
            {
                throw location;
            }
        }
        ((List) (obj)).add(new BasicNameValuePair(z[20], z[22]));
        ((List) (obj)).add(new BasicNameValuePair(z[23], z[15]));
        location = App.au.getResources().getConfiguration().locale;
        if (location != null)
        {
            try
            {
                ((List) (obj)).add(new BasicNameValuePair(z[16], location.getLanguage()));
            }
            // Misplaced declaration of an exception variable
            catch (Location location)
            {
                throw location;
            }
        }
        location = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(location, 15000);
        HttpConnectionParams.setSoTimeout(location, 30000);
        HttpProtocolParams.setUserAgent(location, afm.a());
        location = (new DefaultHttpClient(location)).execute(new HttpGet((new StringBuilder()).append(al0.c).append(z[19]).append(al0.l).append("&").append(URLEncodedUtils.format(((List) (obj)), z[13])).toString()));
        if (location == null)
        {
            try
            {
                throw new IOException(z[17]);
            }
            // Misplaced declaration of an exception variable
            catch (Location location)
            {
                throw location;
            }
        }
        break MISSING_BLOCK_LABEL_408;
        location;
        throw location;
        if (location.getStatusLine().getStatusCode() != 200)
        {
            break MISSING_BLOCK_LABEL_483;
        }
        s1 = new JSONObject(EntityUtils.toString(location.getEntity()));
        try
        {
            s.c(s1);
            c.add(s);
            if (c.size() > 12)
            {
                c.remove(0);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            throw location;
        }
        obj = s;
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_522;
        }
        Log.e((new StringBuilder()).append(z[18]).append(location.getStatusLine().getStatusCode()).toString());
        obj = s;
        return ((t3) (obj));
        location;
        throw location;
    }

    public static t3 c(Location location, int i1, String s, String s1)
    {
        Object obj;
        if (s == null)
        {
            s = "";
        }
        if (s1 == null)
        {
            s1 = "";
        }
        t3 t3_1 = a(2, location, i1, s, s1);
        obj = t3_1;
        if (t3_1 != null)
        {
            break MISSING_BLOCK_LABEL_468;
        }
        s = new t3(2, location, i1, s, s1);
        obj = new ArrayList();
        ((List) (obj)).add(new BasicNameValuePair(z[0], (new StringBuilder()).append(location.getLatitude()).append(",").append(location.getLongitude()).toString()));
        ((List) (obj)).add(new BasicNameValuePair(z[5], Integer.toString(Math.min(i1, 0x1869f))));
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        boolean flag = "".equals(s1);
        if (!flag)
        {
            try
            {
                ((List) (obj)).add(new BasicNameValuePair(z[4], s1));
            }
            // Misplaced declaration of an exception variable
            catch (Location location)
            {
                throw location;
            }
        }
        location = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(location, 15000);
        HttpConnectionParams.setSoTimeout(location, 30000);
        HttpProtocolParams.setUserAgent(location, afm.a());
        location = (new DefaultHttpClient(location)).execute(new HttpGet((new StringBuilder()).append(al0.n).append(URLEncodedUtils.format(((List) (obj)), z[7])).toString()));
        if (location == null)
        {
            try
            {
                throw new IOException(z[1]);
            }
            // Misplaced declaration of an exception variable
            catch (Location location)
            {
                throw location;
            }
        }
        break MISSING_BLOCK_LABEL_276;
        location;
        throw location;
        s1 = location.getFirstHeader(z[2]);
        if (s1 != null)
        {
            try
            {
                Log.i((new StringBuilder()).append(z[8]).append(s1.getValue()).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Location location)
            {
                throw location;
            }
        }
        s1 = location.getFirstHeader(z[6]);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_393;
        }
        s1 = s1.getValue();
        Log.i((new StringBuilder()).append(z[3]).append(s1).toString());
        if (TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_393;
        }
        i1 = Integer.parseInt(s1);
        if (i1 == 0)
        {
            try
            {
                s.b = true;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                try
                {
                    throw s1;
                }
                // Misplaced declaration of an exception variable
                catch (String s1) { }
            }
        }
        obj = s;
        if (location.getStatusLine().getStatusCode() != 200)
        {
            break MISSING_BLOCK_LABEL_468;
        }
        location = new JSONObject(EntityUtils.toString(location.getEntity()));
        try
        {
            s.a(location);
            c.add(s);
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            throw location;
        }
        obj = s;
        if (c.size() <= 12)
        {
            break MISSING_BLOCK_LABEL_468;
        }
        c.remove(0);
        obj = s;
        return ((t3) (obj));
    }

    public PlaceInfo a(String s)
    {
        int i1 = App.am;
        Iterator iterator = iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PlaceInfo placeinfo = (PlaceInfo)iterator.next();
            boolean flag;
            try
            {
                flag = s.equalsIgnoreCase(placeinfo.placeId);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (flag)
            {
                return placeinfo;
            }
        } while (i1 == 0);
        return null;
    }

    public void a(Location location)
    {
        int i1 = App.am;
        Iterator iterator = iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PlaceInfo placeinfo = (PlaceInfo)iterator.next();
            placeinfo.dist = placeinfo.getLocation().distanceTo(location);
        } while (i1 == 0);
        Collections.sort(this, new afu(this));
    }

    public void a(JSONObject jsonobject)
    {
        int i1 = 0;
        int j1 = App.am;
        jsonobject = jsonobject.getJSONObject(z[36]).getJSONArray(z[35]);
        do
        {
            if (i1 >= jsonobject.length())
            {
                break;
            }
            try
            {
                JSONObject jsonobject1 = jsonobject.getJSONObject(i1);
                PlaceInfo placeinfo = new PlaceInfo();
                placeinfo.fromJsonFoursquare(jsonobject1, false);
                add(placeinfo);
            }
            catch (JSONException jsonexception)
            {
                Log.a(jsonexception);
            }
            i1++;
        } while (j1 == 0);
    }

    public boolean a()
    {
        return b;
    }

    public PlaceInfo b(String s)
    {
        int i1 = App.am;
        Iterator iterator = iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PlaceInfo placeinfo = (PlaceInfo)iterator.next();
            boolean flag;
            try
            {
                flag = s.equalsIgnoreCase(placeinfo.name);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (flag)
            {
                return placeinfo;
            }
        } while (i1 == 0);
        return null;
    }

    public void b(JSONObject jsonobject)
    {
        JSONArray jsonarray;
        int i1;
        int j1;
        int k1;
        j1 = 0;
        k1 = App.am;
        jsonarray = jsonobject.getJSONArray(z[11]);
        i1 = 0;
_L2:
        if (i1 >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject1;
        PlaceInfo placeinfo;
        jsonobject1 = jsonarray.getJSONObject(i1);
        placeinfo = new PlaceInfo();
        boolean flag;
        placeinfo.fromJsonGoogle(jsonobject1, false);
        if (placeinfo.icon == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        flag = placeinfo.icon.endsWith(z[10]);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        try
        {
            add(placeinfo);
        }
        catch (JSONException jsonexception1)
        {
            try
            {
                throw jsonexception1;
            }
            catch (JSONException jsonexception2)
            {
                Log.a(jsonexception2);
            }
        }
        i1++;
        if (k1 == 0) goto _L2; else goto _L1
_L1:
        jsonobject = jsonobject.getJSONArray(z[9]);
        if (jsonobject.length() <= 0) goto _L4; else goto _L3
_L3:
        a = "";
        i1 = j1;
_L5:
        j1 = jsonobject.length();
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        JSONException jsonexception;
        if (i1 > 0)
        {
            try
            {
                a = (new StringBuilder()).append(a).append(z[12]).toString();
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                try
                {
                    throw jsonobject;
                }
                // Misplaced declaration of an exception variable
                catch (JSONObject jsonobject)
                {
                    Log.a(jsonobject);
                }
                return;
            }
        }
        a = (new StringBuilder()).append(a).append(jsonobject.getString(i1)).toString();
        i1++;
        if (k1 == 0) goto _L5; else goto _L4
_L4:
        return;
        jsonexception;
        throw jsonexception;
    }

    public void c(JSONObject jsonobject)
    {
        int i1 = 0;
        int j1 = App.am;
        jsonobject = jsonobject.getJSONArray(z[34]);
        do
        {
            if (i1 >= jsonobject.length())
            {
                break;
            }
            try
            {
                JSONObject jsonobject1 = jsonobject.getJSONObject(i1);
                PlaceInfo placeinfo = new PlaceInfo();
                placeinfo.fromJsonFacebook(jsonobject1, false);
                add(placeinfo);
            }
            catch (JSONException jsonexception)
            {
                Log.a(jsonexception);
            }
            i1++;
        } while (j1 == 0);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[37];
        obj = "ak&?\020`z(.\020}g2.";
        byte0 = 36;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "]AW\0300@^\030\004&V";
                i1 = 1;
                byte0 = 0;
                break;

            case 36: // '$'
                m = ((String) (obj));
                obj = "|e";
                byte0 = 37;
                break;

            case 37: // '%'
                g = ((String) (obj));
                obj = "z`!+\031zj(8\020b{29\001";
                byte0 = 38;
                break;

            case 38: // '&'
                f = ((String) (obj));
                obj = "ik%%\nak$?\031g}";
                byte0 = 39;
                break;

            case 39: // '\''
                e = ((String) (obj));
                obj = "|x28\nb{28\flb>'\034g";
                byte0 = 40;
                break;

            case 40: // '('
                i = ((String) (obj));
                obj = "_B";
                byte0 = -1;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "k\003%\013!Vb\036\007<G\003;\0038ZZ";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "k\003%\013!Vb\036\007<G\003%\0178RG\031\003;T\024W";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "B[\022\030,";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "AO\023\003 @";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "k\003%\013!Vb\036\007<G\003%\0178RG\031\003;T";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "fz1Gm";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "k\003%\013!Vb\036\007<G\003;\0038ZZMJ";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "[Z\032\006\nRZ\003\030<Q[\003\003:]]";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "TK\030\t:WKZ]d\035^\031\r";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "AK\004\0379G]";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "\017L\005Jz\r";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "fz1Gm";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "PK\031\0360A";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "\001\033";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "_A\024\0139V";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "]AW\0300@^\030\004&V";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "V\\\005\005'\023]\003\013!F]W";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "@K\026\0306[\021";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "GW\007\017";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "WG\004\0364]M\022";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "CB\026\t0";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "_G\032\003!";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "GW\007\017&";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "XK\016\035:AJ";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "fz1Gm";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = "|x28\nb{28\flb>'\034g";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = "|e";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "]AW\0300@^\030\004&V";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = "_A\024\013!ZA\031";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "_O\031\r RI\022";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                i1 = 32;
                obj = "@Z\026\036 @";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i1] = ((String) (obj));
                i1 = 33;
                obj = "AO\023\003 @";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i1] = ((String) (obj));
                i1 = 34;
                obj = "WO\003\013";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i1] = ((String) (obj));
                i1 = 35;
                obj = "EK\031\0370@";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i1] = ((String) (obj));
                i1 = 36;
                obj = "AK\004\032:]]\022";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i1] = ((String) (obj));
                z = as;
                c = new ArrayList();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 988
    //                   0 1011
    //                   1 1018
    //                   2 1025
    //                   3 1032;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1032;
_L3:
        byte byte1 = 85;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 51;
          goto _L9
_L5:
        byte1 = 46;
          goto _L9
_L6:
        byte1 = 119;
          goto _L9
        byte1 = 106;
          goto _L9
    }
}
