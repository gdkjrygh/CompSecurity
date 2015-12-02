// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
//            App, i2, zm, al0, 
//            o4, afm

public class nt
{

    private static final File c;
    private static final String z[];
    public int a;
    private String b;
    public int d;
    private int e;
    public ArrayList f;

    public nt(int i, String s)
    {
        a = i;
        b = s;
        c.mkdirs();
    }

    public nt(String s)
    {
        this(50, s);
    }

    private void a(JSONObject jsonobject)
    {
        Object obj;
        JSONObject jsonobject1;
        Object obj1;
        int j;
        j = App.am;
        obj1 = null;
        jsonobject1 = null;
        obj = obj1;
        JSONObject jsonobject2 = jsonobject.getJSONObject(z[12]);
        jsonobject = jsonobject1;
        if (jsonobject2 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        obj = obj1;
        jsonobject2 = jsonobject2.getJSONObject(z[6]);
        jsonobject = jsonobject1;
        if (jsonobject2 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        obj = obj1;
        jsonobject = jsonobject2.getJSONArray(z[5]);
        obj = jsonobject;
        try
        {
            d = jsonobject2.getInt(z[14]);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            d = 0;
            jsonobject = ((JSONObject) (obj));
        }
        int i;
        if (jsonobject == null)
        {
            return;
        }
        Log.i((new StringBuilder()).append(z[11]).append(jsonobject.length()).append(z[10]).append(d).toString());
        i = 0;
_L2:
        if (i >= jsonobject.length())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = new i2();
        jsonobject1 = jsonobject.getJSONObject(i);
        obj.a = jsonobject1.getString(z[13]);
        obj.d = jsonobject1.getInt(z[8]);
        obj.c = jsonobject1.getInt(z[9]);
        obj.b = jsonobject1.getInt(z[15]);
        jsonobject1 = jsonobject1.getJSONObject(z[17]);
        if (jsonobject1 == null)
        {
            break MISSING_BLOCK_LABEL_259;
        }
        obj.e = jsonobject1.getString(z[16]);
        int k;
        if (((i2) (obj)).c < 300)
        {
            break MISSING_BLOCK_LABEL_305;
        }
        k = ((i2) (obj)).b;
        if (k < 300)
        {
            break MISSING_BLOCK_LABEL_305;
        }
        k = ((i2) (obj)).d;
        if (k > 0x7d000)
        {
            break MISSING_BLOCK_LABEL_305;
        }
        f.add(obj);
_L3:
        i++;
        if (j == 0) goto _L2; else goto _L1
_L1:
        e = e + jsonobject.length();
        Log.i((new StringBuilder()).append(f.size()).append(z[7]).toString());
        return;
        JSONException jsonexception;
        jsonexception;
        try
        {
            throw jsonexception;
        }
        // Misplaced declaration of an exception variable
        catch (JSONException jsonexception) { }
          goto _L3
        jsonexception;
        throw jsonexception;
        jsonexception;
        throw jsonexception;
        jsonexception;
        throw jsonexception;
    }

    public static void b()
    {
        int j = App.am;
        File afile[] = c.listFiles();
        if (afile != null)
        {
            Arrays.sort(afile, new zm());
            int i = 0;
            do
            {
                if (i >= afile.length)
                {
                    break;
                }
                File file = afile[i];
                if (i <= afile.length - 16 || file.lastModified() + 0x5265c00L <= System.currentTimeMillis())
                {
                    file.delete();
                }
                i++;
            } while (j == 0);
        }
    }

    public String a()
    {
        return b;
    }

    public List c()
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        obj4 = null;
        obj = null;
        obj2 = null;
        f = new ArrayList();
        obj1 = new ArrayList();
        ((List) (obj1)).add(new BasicNameValuePair(z[1], b.trim()));
        ((List) (obj1)).add(new BasicNameValuePair(z[4], Integer.toString(e)));
        ((List) (obj1)).add(new BasicNameValuePair(z[2], Integer.toString(a)));
        obj3 = (new StringBuilder()).append(al0.j).append(URLEncodedUtils.format(((List) (obj1)), z[0])).toString();
        obj1 = o4.b(((String) (obj3)));
        obj1 = new File(c, ((String) (obj1)).toString());
        if (!((File) (obj1)).exists()) goto _L2; else goto _L1
_L1:
        long l;
        long l1;
        l = ((File) (obj1)).lastModified();
        l1 = System.currentTimeMillis();
        if (l + 0x5265c00L <= l1) goto _L2; else goto _L3
_L3:
        obj1 = new ObjectInputStream(new FileInputStream(((File) (obj1))));
        obj = obj1;
        obj2 = (String)((ObjectInputStream) (obj1)).readObject();
        obj = obj2;
        if (obj1 != null)
        {
            BasicHttpParams basichttpparams;
            int i;
            try
            {
                ((ObjectInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = obj2;
                continue; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            obj = obj2;
        }
_L19:
        if (obj != null)
        {
            a(new JSONObject(((String) (obj))));
        }
        return f;
        obj;
        throw obj;
        obj2;
        obj1 = null;
_L17:
        obj = obj1;
        Log.a(((Throwable) (obj2)));
        if (obj1 != null)
        {
            try
            {
                ((ObjectInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = null;
                continue; /* Loop/switch isn't completed */
            }
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        break; /* Loop/switch isn't completed */
        obj2;
        obj1 = null;
_L15:
        obj = obj1;
        Log.a(((Throwable) (obj2)));
        if (obj1 != null)
        {
            try
            {
                ((ObjectInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = null;
                continue; /* Loop/switch isn't completed */
            }
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        break; /* Loop/switch isn't completed */
        obj1;
        obj = null;
_L13:
        if (obj != null)
        {
            try
            {
                ((ObjectInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        throw obj1;
_L2:
        ((File) (obj1)).delete();
        obj3 = new HttpGet(((String) (obj3)));
        basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 15000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 30000);
        HttpProtocolParams.setUserAgent(basichttpparams, afm.a());
        obj3 = (new DefaultHttpClient(basichttpparams)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj3)));
        i = ((HttpResponse) (obj3)).getStatusLine().getStatusCode();
        if (i != 200) goto _L5; else goto _L4
_L4:
        obj3 = EntityUtils.toString(((HttpResponse) (obj3)).getEntity());
        obj1 = new ObjectOutputStream(new FileOutputStream(((File) (obj1))));
        ((ObjectOutputStream) (obj1)).writeObject(obj3);
        if (obj1 != null)
        {
            try
            {
                ((ObjectOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        obj = obj3;
        continue; /* Loop/switch isn't completed */
        obj;
        obj1 = obj2;
        obj2 = obj;
_L11:
        obj = obj1;
        Log.a(((Throwable) (obj2)));
        if (obj1 != null)
        {
            try
            {
                ((ObjectOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        break MISSING_BLOCK_LABEL_451;
        obj2;
        obj1 = obj4;
_L9:
        obj = obj1;
        Log.a(((Throwable) (obj2)));
        if (obj1 != null)
        {
            try
            {
                ((ObjectOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        break MISSING_BLOCK_LABEL_451;
        obj2;
        obj1 = obj;
        obj = obj2;
_L7:
        if (obj1 != null)
        {
            try
            {
                ((ObjectOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        throw obj;
_L5:
        throw new IOException((new StringBuilder()).append(z[3]).append(i).toString());
        obj;
        if (true) goto _L7; else goto _L6
_L6:
        obj2;
        if (true) goto _L9; else goto _L8
_L8:
        obj2;
        if (true) goto _L11; else goto _L10
_L10:
        obj1;
        if (true) goto _L13; else goto _L12
_L12:
        obj2;
        if (true) goto _L15; else goto _L14
_L14:
        break; /* Loop/switch isn't completed */
        obj2;
        if (true) goto _L17; else goto _L16
_L16:
        obj = null;
        if (true) goto _L19; else goto _L18
_L18:
    }

    public boolean d()
    {
        return d > e;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[19];
        obj = "\005C{x\f";
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
                obj = "\001bX'M";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\031z\\2Q~TR Z$";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\023xP8A>~^4@9xSuR1~Q0P|7N!U$bNh";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\031z\\2Q~X[3G5c";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\002rN X$d";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\031z\\2Q";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "p~P4S5d";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\026~Q0g9mX";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\007~Y!\\";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "|7I:@1{\007";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\"rN X$d\0239Q>pI=\034y7\000u";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\003r\\'W8EX&D?yN0";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\035rY<U\005eQ";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\004xI4X";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\030rT2\\$";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "\005eQ";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "\004\177H8V>vT9";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "\022~S2";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                z = as;
                c = new File(App.au.getCacheDir(), z[18]);
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 520
    //                   0 543
    //                   1 550
    //                   2 557
    //                   3 564;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_564;
_L3:
        byte byte1 = 52;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 80;
          goto _L9
_L5:
        byte1 = 23;
          goto _L9
_L6:
        byte1 = 61;
          goto _L9
        byte1 = 85;
          goto _L9
    }
}
