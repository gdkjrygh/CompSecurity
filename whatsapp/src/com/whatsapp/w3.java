// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import android.widget.EditText;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.whatsapp:
//            App, DescribeProblemActivity, alw, SearchFAQ, 
//            asw

public class w3 extends AsyncTask
{

    private static final String z[];
    final DescribeProblemActivity a;
    JSONArray b;

    protected w3(DescribeProblemActivity describeproblemactivity)
    {
        a = describeproblemactivity;
        super();
    }

    protected Void a(Void avoid[])
    {
        int i = App.am;
        Object obj;
        BufferedReader bufferedreader;
        avoid = DescribeProblemActivity.a(a).getText().toString().trim();
        obj = new ArrayList();
        ((ArrayList) (obj)).add(new BasicNameValuePair(z[11], z[8]));
        ((ArrayList) (obj)).add(new BasicNameValuePair(z[4], alw.a()));
        ((ArrayList) (obj)).add(new BasicNameValuePair(z[9], alw.b()));
        ((ArrayList) (obj)).add(new BasicNameValuePair(z[3], avoid));
        avoid = (new URL((new StringBuilder()).append(z[10]).append(URLEncodedUtils.format(((java.util.List) (obj)), z[7])).toString())).openConnection();
        avoid.setConnectTimeout(30000);
        avoid.setReadTimeout(30000);
        avoid = avoid.getInputStream();
        obj = new StringBuilder();
        bufferedreader = new BufferedReader(new InputStreamReader(avoid));
        avoid = bufferedreader.readLine();
_L2:
        if (avoid == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringBuilder) (obj)).append(avoid);
        avoid = bufferedreader.readLine();
        if (i == 0) goto _L2; else goto _L1
_L1:
        bufferedreader.close();
        avoid = ((StringBuilder) (obj)).toString();
        if (avoid == null)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        i = avoid.length();
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        avoid = z[5];
        b = new JSONArray(avoid);
        break MISSING_BLOCK_LABEL_283;
        avoid;
        try
        {
            throw avoid;
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Log.a(z[6], avoid);
        }
        return null;
    }

    protected void a(Void void1)
    {
        int j;
        j = App.am;
        a.removeDialog(2);
        int k;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        k = b.length();
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        ArrayList arraylist;
        ArrayList arraylist1;
        void1 = new ArrayList(k);
        arraylist = new ArrayList(k);
        arraylist1 = new ArrayList(k);
        int i = 0;
_L2:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject = b.optJSONObject(i);
        void1.add(jsonobject.getString(z[0]));
        arraylist.add(jsonobject.getString(z[1]));
        arraylist1.add(jsonobject.getString(z[2]));
        i++;
        if (j == 0) goto _L2; else goto _L1
_L1:
        ArrayList arraylist2;
        android.net.Uri auri[];
        int l;
        arraylist2 = new ArrayList();
        auri = DescribeProblemActivity.d(a);
        l = auri.length;
        i = 0;
_L4:
        android.net.Uri uri;
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        uri = auri[i];
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        arraylist2.add(uri);
        i++;
        if (j == 0) goto _L4; else goto _L3
_L3:
        try
        {
            SearchFAQ.a(a, DescribeProblemActivity.c(a), DescribeProblemActivity.a(a).getText().toString().trim(), arraylist2, DescribeProblemActivity.g(a), k, void1, arraylist, arraylist1);
            a.finish();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Void void1)
        {
            Log.a(void1);
        }
        break MISSING_BLOCK_LABEL_265;
        void1;
        throw void1;
        DescribeProblemActivity.a(a, null);
        asw.a(DescribeProblemActivity.b(a), new Void[0]);
        return;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    protected void onPreExecute()
    {
        a.showDialog(2);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[12];
        obj = "Wd6\023M";
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
                obj = "Gh1\034ZJ}6\026GM";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "V\177.";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "Rx'\rQ";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "Oj";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "xP";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "Gh1\034XQb P[Fl0\034@\003";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "vY\004R\020";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "Bc&\rGJi";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "On";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "Ky6\017[\031\"m\b_T#5\027IW~#\017X\rn-\022\007El3PKOd'\021\\|~'\036Z@el\017@S2";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "Sa#\013NL\177/";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 344
    //                   0 367
    //                   1 374
    //                   2 381
    //                   3 388;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_388;
_L3:
        byte byte1 = 40;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 35;
          goto _L9
_L5:
        byte1 = 13;
          goto _L9
_L6:
        byte1 = 66;
          goto _L9
        byte1 = 127;
          goto _L9
    }
}
