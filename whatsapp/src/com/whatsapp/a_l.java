// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.whatsapp:
//            App

public class a_l
{

    private static final String z[];

    public static byte[] a(String s)
    {
        int j;
        j = App.am;
        boolean flag;
        try
        {
            flag = TextUtils.isEmpty(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        s = new SpannableString(s);
        Linkify.addLinks(s, 1);
        s = (URLSpan[])s.getSpans(0, s.length(), android/text/style/URLSpan);
        if (s == null) goto _L1; else goto _L3
_L3:
        Object obj;
        byte abyte0[];
        int i;
        int k;
        boolean flag1;
        try
        {
            i = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (i <= 0) goto _L1; else goto _L4
_L4:
        s = Uri.parse(s[0].getURL());
        if (s.getHost() == null) goto _L6; else goto _L5
_L5:
        flag1 = s.getHost().endsWith(z[5]);
        if (!flag1) goto _L6; else goto _L7
_L7:
        s = s.getQueryParameter("v");
        if (TextUtils.isEmpty(s)) goto _L9; else goto _L8
_L8:
        s = (new StringBuilder()).append(z[2]).append(s).append(z[4]).toString();
_L15:
        if (s == null) goto _L1; else goto _L10
_L10:
        s = (new URL(s.replace(" ", z[12]))).openStream();
        obj = new ByteArrayOutputStream();
        abyte0 = new byte[1024];
        i = 0;
_L24:
        k = s.read(abyte0, 0, 1024);
        if (k == -1 && j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        ((ByteArrayOutputStream) (obj)).write(abyte0, 0, k);
        i += k;
        if (i > 0x32000)
        {
            try
            {
                throw new IOException(z[1]);
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.c(s);
            }
            return null;
        }
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
_L6:
        if (s.getHost() == null) goto _L12; else goto _L11
_L11:
        flag1 = s.getHost().endsWith(z[14]);
        if (!flag1) goto _L12; else goto _L13
_L13:
        s = s.getPath();
        if (TextUtils.isEmpty(s)) goto _L9; else goto _L14
_L14:
        s = s.substring(1);
        s = (new StringBuilder()).append(z[9]).append(s).append(z[6]).toString();
          goto _L15
        s;
        throw s;
_L12:
label0:
        {
            try
            {
                if (s.getHost() == null)
                {
                    break label0;
                }
                flag1 = s.getHost().endsWith(z[7]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                try
                {
                    throw s;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
            }
            if (!flag1)
            {
                break label0;
            }
            s = null;
        }
          goto _L15
        if (s.getHost() == null) goto _L9; else goto _L16
_L16:
        flag1 = s.getHost().endsWith(z[3]);
        if (!flag1) goto _L9; else goto _L17
_L17:
        s = s.getPathSegments();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_650;
        }
        i = s.size();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_650;
        }
        s = (String)s.get(s.size() - 1);
        if (!s.startsWith(z[8]))
        {
            break MISSING_BLOCK_LABEL_650;
        }
        s = s.substring(2);
_L25:
        if (s == null) goto _L9; else goto _L18
_L18:
        BufferedReader bufferedreader;
        StringBuilder stringbuilder;
        obj = (new URL((new StringBuilder()).append(z[0]).append(s).toString())).openStream();
        bufferedreader = new BufferedReader(new InputStreamReader(((InputStream) (obj)), z[11]));
        stringbuilder = new StringBuilder();
        s = bufferedreader.readLine();
_L20:
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder.append(s);
        s = bufferedreader.readLine();
        if (j == 0) goto _L20; else goto _L19
_L19:
        ((InputStream) (obj)).close();
        s = (new JSONObject(stringbuilder.toString())).optJSONArray(z[10]);
        if (s == null) goto _L9; else goto _L21
_L21:
        s = s.optJSONObject(0);
        if (s == null) goto _L9; else goto _L22
_L22:
        s = s.optString(z[13]);
          goto _L15
        s;
        throw s;
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.c(s);
        }
_L9:
        s = null;
          goto _L15
        if (j == 0) goto _L24; else goto _L23
_L23:
        ((ByteArrayOutputStream) (obj)).close();
        s.close();
        s = ((ByteArrayOutputStream) (obj)).toByteArray();
        return s;
        s = null;
          goto _L25
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[15];
        obj = "aAS;m3\032\b\"j|[B80hEW'{'VH&1eZH ky\nN/#";
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
                obj = "`XF,{)AH$>eTU,{";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "aAS;m3\032\b\"sn\033^$k}@E.0jZJdh`\032";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "`AR%{z\033F;neP\t(qd";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "&QB-\177|YSetyR";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "pZR?kkP\t(qd";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "&QB-\177|YSetyR";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "yYF20nZH,rl\033D$s";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "`Q";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                obj = "aAS;m3\032\b\"sn\033^$k}@E.0jZJdh`\032";
                byte0 = 8;
                i = 9;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "{PT>r}F";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\\aaf&";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = ",\007\027";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "hGS<q{^r9r8\005\027";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "pZR?k'WB";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 412
    //                   0 435
    //                   1 442
    //                   2 449
    //                   3 456;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_456;
_L3:
        byte byte1 = 30;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 9;
          goto _L9
_L5:
        byte1 = 53;
          goto _L9
_L6:
        byte1 = 39;
          goto _L9
        byte1 = 75;
          goto _L9
    }
}
