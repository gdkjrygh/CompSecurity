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
import java.io.Serializable;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.whatsapp:
//            afm, al0, App

public class PlaceInfo
    implements Serializable
{

    public static final int SOURCE_FACEBOOK = 3;
    public static final int SOURCE_FOURSQUARE = 2;
    public static final int SOURCE_GOOGLE = 1;
    private static final long serialVersionUID = 1L;
    private static final String z[];
    public String address;
    public double dist;
    public boolean hasDetails;
    public String icon;
    public double lat;
    private transient Location location;
    public double lon;
    public String name;
    public String phone;
    public String placeId;
    public String rating;
    public int source;
    public transient Object tag;
    public Set types;
    public String url;
    public String vicinity;

    public PlaceInfo()
    {
    }

    private void downloadDetailsFacebook()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        DefaultHttpClient defaulthttpclient;
        Locale locale;
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 15000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 30000);
        HttpProtocolParams.setUserAgent(basichttpparams, afm.a());
        defaulthttpclient = new DefaultHttpClient(basichttpparams);
        s = (new StringBuilder()).append(al0.c).append(placeId).append("?").append(al0.l).toString();
        locale = App.au.getResources().getConfiguration().locale;
        Object obj;
        obj = s;
        if (locale == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        obj = (new StringBuilder()).append(s).append(z[48]).append(locale.getLanguage()).toString();
        obj = new HttpGet(((String) (obj)));
        obj = defaulthttpclient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        if (((HttpResponse) (obj)).getStatusLine().getStatusCode() == 200)
        {
            url = (new JSONObject(EntityUtils.toString(((HttpResponse) (obj)).getEntity()))).optString(z[47]);
            hasDetails = true;
        }
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1;
        Log.a(((Throwable) (obj1)));
          goto _L1
        obj1;
        throw obj1;
        obj1;
        Log.a(((Throwable) (obj1)));
          goto _L1
    }

    private void downloadDetailsGoogle()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        DefaultHttpClient defaulthttpclient;
        Locale locale;
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 15000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 30000);
        HttpProtocolParams.setUserAgent(basichttpparams, afm.a());
        defaulthttpclient = new DefaultHttpClient(basichttpparams);
        s = (new StringBuilder()).append(al0.d).append(placeId).toString();
        locale = App.au.getResources().getConfiguration().locale;
        Object obj;
        obj = s;
        if (locale == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        obj = (new StringBuilder()).append(s).append(z[43]).append(locale.getLanguage()).toString();
        obj = new HttpGet(((String) (obj)));
        obj = defaulthttpclient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        if (((HttpResponse) (obj)).getStatusLine().getStatusCode() != 200)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        obj = new JSONObject(EntityUtils.toString(((HttpResponse) (obj)).getEntity()));
        String s1 = ((JSONObject) (obj)).getString(z[46]);
        if (!z[45].equals(s1))
        {
            break MISSING_BLOCK_LABEL_216;
        }
        obj = ((JSONObject) (obj)).getJSONObject(z[44]);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        fromJsonGoogle(((JSONObject) (obj)), true);
        hasDetails = true;
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1;
        throw obj1;
        obj1;
        Log.a(((Throwable) (obj1)));
          goto _L1
        obj1;
        throw obj1;
        obj1;
        Log.a(((Throwable) (obj1)));
          goto _L1
    }

    public void downloadDetails()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = hasDetails;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        source;
        JVM INSTR tableswitch 1 3: default 66
    //                   1 44
    //                   2 66
    //                   3 54;
           goto _L3 _L4 _L3 _L5
_L3:
        continue; /* Loop/switch isn't completed */
_L4:
        downloadDetailsGoogle();
        if (App.am == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        downloadDetailsFacebook();
        if (true) goto _L1; else goto _L6
_L6:
        Exception exception;
        exception;
        throw exception;
    }

    public void fromJsonFacebook(JSONObject jsonobject, boolean flag)
    {
        source = 3;
        name = jsonobject.getString(z[5]);
        placeId = jsonobject.optString(z[6]);
        icon = (new StringBuilder()).append(al0.c).append(placeId).append(z[4]).toString();
        jsonobject = jsonobject.getJSONObject(z[10]);
        if (jsonobject != null)
        {
            lat = jsonobject.optDouble(z[1]);
            lon = jsonobject.optDouble(z[7]);
            address = jsonobject.optString(z[8]);
            String s = jsonobject.optString(z[3]);
            if (s != null && !"".equals(s))
            {
                if (!TextUtils.isEmpty(address) && !address.endsWith(","))
                {
                    address = (new StringBuilder()).append(address).append(z[0]).toString();
                }
                address = (new StringBuilder()).append(address).append(s).toString();
            }
            vicinity = address;
            jsonobject = jsonobject.optString(z[2]);
            if (jsonobject != null && !"".equals(jsonobject))
            {
                if (!TextUtils.isEmpty(address))
                {
                    address = (new StringBuilder()).append(address).append(z[9]).toString();
                }
                address = (new StringBuilder()).append(address).append(jsonobject).toString();
            }
        }
    }

    public void fromJsonFoursquare(JSONObject jsonobject, boolean flag)
    {
        JSONArray jsonarray;
        int i;
        int j;
        i = 0;
        j = App.am;
        source = 2;
        name = jsonobject.getString(z[40]);
        url = jsonobject.optString(z[35]);
        placeId = jsonobject.optString(z[32]);
        if (url == null || "".equals(url))
        {
            url = (new StringBuilder()).append(z[38]).append(placeId).toString();
        }
        Object obj = jsonobject.getJSONObject(z[27]);
        if (obj != null)
        {
            lat = ((JSONObject) (obj)).optDouble(z[37]);
            lon = ((JSONObject) (obj)).optDouble(z[33]);
            address = ((JSONObject) (obj)).optString(z[42]);
            vicinity = address;
            String s = ((JSONObject) (obj)).optString(z[28]);
            if (s != null && !"".equals(s))
            {
                if (address != null && !"".equals(address))
                {
                    address = (new StringBuilder()).append(address).append(z[30]).toString();
                }
                address = (new StringBuilder()).append(address).append(s).toString();
            }
            s = ((JSONObject) (obj)).optString(z[41]);
            if (s != null && !"".equals(s))
            {
                if (address != null && !"".equals(address))
                {
                    address = (new StringBuilder()).append(address).append(z[34]).toString();
                }
                address = (new StringBuilder()).append(address).append(s).toString();
            }
            obj = ((JSONObject) (obj)).optString(z[26]);
            if (obj != null && !"".equals(obj))
            {
                if (address != null && !"".equals(address))
                {
                    address = (new StringBuilder()).append(address).append(" ").toString();
                }
                address = (new StringBuilder()).append(address).append(((String) (obj))).toString();
            }
            hasDetails = true;
        }
        jsonarray = jsonobject.optJSONArray(z[36]);
        if (jsonarray == null) goto _L2; else goto _L1
_L1:
        jsonobject = jsonarray.optJSONObject(0);
_L9:
        JSONObject jsonobject1;
        JSONObject jsonobject2;
        jsonobject1 = jsonobject;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject2 = jsonarray.optJSONObject(i);
        jsonobject1 = jsonobject;
        if (jsonobject2 == null) goto _L4; else goto _L3
_L3:
        jsonobject1 = jsonobject;
        if (!jsonobject2.optBoolean(z[31])) goto _L4; else goto _L5
_L5:
        if (j == 0) goto _L7; else goto _L6
_L6:
        jsonobject1 = jsonobject2;
_L4:
        i++;
        jsonobject = jsonobject1;
        if (j == 0) goto _L9; else goto _L8
_L8:
        if (jsonobject1 != null)
        {
            jsonobject = jsonobject1.optJSONObject(z[39]);
            if (jsonobject != null)
            {
                icon = jsonobject.optString(z[25]);
                if (icon != null)
                {
                    icon = (new StringBuilder()).append(icon).append(z[29]).toString();
                }
            }
        }
_L2:
        return;
_L7:
        jsonobject1 = jsonobject2;
        if (true) goto _L8; else goto _L10
_L10:
    }

    public void fromJsonGoogle(JSONObject jsonobject, boolean flag)
    {
        int j = App.am;
        source = 1;
        name = jsonobject.getString(z[24]);
        placeId = jsonobject.optString(z[23]);
        vicinity = jsonobject.optString(z[14]);
        types = new HashSet();
        Object obj = jsonobject.optJSONArray(z[20]);
        if (obj != null)
        {
            int i = 0;
            do
            {
                if (i >= ((JSONArray) (obj)).length())
                {
                    break;
                }
                types.add(((JSONArray) (obj)).getString(i));
                i++;
            } while (j == 0);
        }
        obj = jsonobject.getJSONObject(z[13]);
        if (obj != null)
        {
            obj = ((JSONObject) (obj)).getJSONObject(z[21]);
            if (obj != null)
            {
                lat = ((JSONObject) (obj)).getDouble(z[12]);
                lon = ((JSONObject) (obj)).getDouble(z[17]);
            }
        }
        icon = jsonobject.optString(z[11]);
        if (flag)
        {
            url = jsonobject.optString(z[15]);
            phone = jsonobject.optString(z[16]);
            address = jsonobject.optString(z[22]);
            rating = jsonobject.optString(z[18]);
            if (address != null)
            {
                address = address.replace(z[19], "");
            }
            hasDetails = true;
        }
    }

    public Location getLocation()
    {
        if (location == null)
        {
            location = new Location("");
            location.setLatitude(lat);
            location.setLongitude(lon);
        }
        return location;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[49];
        obj = "oH";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "/\t\025BP6\f\004";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "0\034\000_A";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = " \001\025R";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "l\030\bHP6\032\004\024P:\030\004\026W2\035\000YA";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "-\t\fN";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "*\f";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "/\007\017LM7\035\005N";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "0\034\023NA7";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "oH";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "/\007\002JP*\007\017";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "*\013\016E";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "/\t\025";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "$\r\016FA7\032\030";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "5\001\002BJ*\034\030";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "6\032\r";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "%\007\023FE7\034\004O{3\000\016EA\034\006\024FF&\032";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "/\006\006";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "1\t\025BJ$";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "oH4EM7\r\005\013w7\t\025NW";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "7\021\021NW";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "/\007\002JP*\007\017";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "%\007\023FE7\034\004O{\"\f\005YA0\033";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "3\004\000HA\034\001\005";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "-\t\fN";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "3\032\004MM;";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "3\007\022_E/+\016OA";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "/\007\002JP*\007\017";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = " \001\025R";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "!\017>\035\020m\030\017L";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "oH";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "3\032\bFE1\021";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "*\f";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "/\006\006";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "oH";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "6\032\r";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                obj = " \t\025NC,\032\bNW";
                byte0 = 35;
                i = 36;
                break;

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "/\t\025";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 38;
                obj = "+\034\025[WyGNMK6\032\022ZQ\"\032\004\005G,\005N]\013";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i] = ((String) (obj));
                i = 39;
                obj = "*\013\016E";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i] = ((String) (obj));
                i = 40;
                obj = "-\t\fN";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i] = ((String) (obj));
                i = 41;
                obj = "0\034\000_A";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i] = ((String) (obj));
                i = 42;
                obj = "\"\f\005YA0\033";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i] = ((String) (obj));
                obj = "e\004\000EC6\t\006N\031";
                byte0 = 42;
                i = 43;
                break;

            case 42: // '*'
                as1[i] = ((String) (obj));
                i = 44;
                obj = "1\r\022^H7";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i] = ((String) (obj));
                i = 45;
                obj = "\f#";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i] = ((String) (obj));
                i = 46;
                obj = "0\034\000_Q0";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[i] = ((String) (obj));
                i = 47;
                obj = "/\001\017@";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[i] = ((String) (obj));
                i = 48;
                obj = "e\004\016HE/\r\\";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1160
    //                   0 1183
    //                   1 1190
    //                   2 1197
    //                   3 1204;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1204;
_L3:
        byte byte1 = 36;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 67;
          goto _L9
_L5:
        byte1 = 104;
          goto _L9
_L6:
        byte1 = 97;
          goto _L9
        byte1 = 43;
          goto _L9
    }
}
