// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

// Referenced classes of package com.whatsapp:
//            kt, x9, App, aoz

public class MediaProvider extends ContentProvider
{

    private static final UriMatcher a;
    public static final Uri b;
    private static final String z[];

    public MediaProvider()
    {
    }

    private static String z(char ac[])
    {
        int i;
        int j;
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            return (new String(ac)).intern();
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 78
    //                   1 84
    //                   2 90
    //                   3 96;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_96;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 83;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 44;
          goto _L8
_L3:
        byte0 = 64;
          goto _L8
_L4:
        byte0 = 93;
          goto _L8
        byte0 = 120;
          goto _L8
    }

    private static char[] z(String s)
    {
        s = s.toCharArray();
        if (s.length < 2)
        {
            s[0] = (char)(s[0] ^ 0x53);
        }
        return s;
    }

    public int delete(Uri uri, String s, String as[])
    {
        throw new UnsupportedOperationException();
    }

    public String getType(Uri uri)
    {
        int i;
        try
        {
            i = a.match(uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        i;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 63
    //                   2 74;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append(z[6]).append(uri).toString());
_L2:
        uri = z[4];
        return uri;
_L3:
        return z[5];
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        throw new UnsupportedOperationException();
    }

    public boolean onCreate()
    {
        return true;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        byte byte0;
        byte0 = 3;
        int i;
        try
        {
            i = a.match(uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        i;
        JVM INSTR tableswitch 1 2: default 36
    //                   1 66
    //                   2 83;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append(z[1]).append(uri).toString());
_L2:
        uri = new kt(getContext());
        return uri;
_L3:
        as = uri.getQueryParameter(z[2]);
        uri = uri.getQueryParameter(z[3]);
        boolean flag;
        try
        {
            flag = z[0].equals(uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        if (!flag)
        {
            byte0 = 1;
        }
        return new x9(as, App.ah.a(as, byte0));
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        throw new UnsupportedOperationException();
    }

    static 
    {
        Object obj;
        byte byte0;
        String as[] = new String[7];
        int i = 0;
        obj = "Z)9\035<";
        byte0 = -1;
label0:
        do
        {
            String as1[] = as;
            obj = z(z(((String) (obj))));
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "y.6\026<[.}-\001e`";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "N5>\0236X\t9";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "E.>\024&H%";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "Z.9V2B$/\027:Hn>\r!_//V7E2r\016=Hn>\027>\00275\031'_!-\b}\\22\016:H%/V>I$4\031}N5>\0236X3";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "Z.9V2B$/\027:Hn>\r!_//V7E2r\016=Hn>\027>\00275\031'_!-\b}\\22\016:H%/V>I$4\031}E48\025 ";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "y.6\026<[.}-\001e`";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                break label0;
            }
        } while (true);
        z = as;
        b = Uri.parse(z(z("O/3\f6B4gW|O/0V$D!)\0132\\0s\b!C64\0346^n0\0357E!")));
        a = new UriMatcher(-1);
        obj = a;
        byte0 = -1;
_L3:
        String s;
        String s1;
        s1 = z(z("O/0V$D!)\0132\\0s\b!C64\0346^n0\0357E!"));
        switch (byte0)
        {
        default:
            s = "N5>\0236X3";
            byte0 = -1;
            break;

        case 0: // '\0'
            break MISSING_BLOCK_LABEL_276;
        }
_L1:
        s = z(z(s));
        switch (byte0)
        {
        default:
            ((UriMatcher) (obj)).addURI(s1, s, 1);
            obj = a;
            byte0 = 0;
            continue; /* Loop/switch isn't completed */

        case 0: // '\0'
            ((UriMatcher) (obj)).addURI(s1, s, 2);
            break;
        }
        break; /* Loop/switch isn't completed */
        s = "E48\025 ";
        byte0 = 0;
          goto _L1
        if (true) goto _L3; else goto _L2
_L2:
    }
}
