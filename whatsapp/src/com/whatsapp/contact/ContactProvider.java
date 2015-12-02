// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.contact;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.DialogToastActivity;
import java.io.File;

// Referenced classes of package com.whatsapp.contact:
//            h

public class ContactProvider extends ContentProvider
{

    public static final String a[];
    private static final UriMatcher b;
    public static final Uri c;
    public static final Uri e;
    public static boolean f;
    private static final String z[];
    private h d;

    public ContactProvider()
    {
    }

    private String a(String s)
    {
label0:
        {
            try
            {
                if (!TextUtils.isEmpty(s))
                {
                    break label0;
                }
                s = z[12];
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            return s;
        }
        return (new StringBuilder()).append(z[13]).append(s).append(")").toString();
    }

    public static boolean a(Uri uri)
    {
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        boolean flag;
        try
        {
            flag = TextUtils.equals(uri.getScheme(), z[10]);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            try
            {
                throw uri;
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (TextUtils.equals(uri.getAuthority(), z[11]))
        {
            return true;
        }
        return false;
    }

    private String[] a(String as[], long l)
    {
        if (as == null)
        {
            return (new String[] {
                String.valueOf(l)
            });
        } else
        {
            String as1[] = new String[as.length + 1];
            System.arraycopy(as, 0, as1, 1, as.length);
            as1[0] = String.valueOf(l);
            return as1;
        }
    }

    private static String z(char ac[])
    {
        int i;
        int j;
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            return (new String(ac)).intern();
        }
        c1 = ac[i];
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
        byte byte0 = 50;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 127;
          goto _L8
_L3:
        byte0 = 115;
          goto _L8
_L4:
        byte0 = 48;
          goto _L8
        byte0 = 92;
          goto _L8
    }

    private static char[] z(String s)
    {
        s = s.toCharArray();
        if (s.length < 2)
        {
            s[0] = (char)(s[0] ^ 0x32);
        }
        return s;
    }

    public void attachInfo(Context context, ProviderInfo providerinfo)
    {
        super.attachInfo(context, providerinfo);
    }

    public int delete(Uri uri, String s, String as[])
    {
        String s1;
        String as1[];
        boolean flag = f;
        int i;
        long l;
        try
        {
            i = b.match(uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        i;
        JVM INSTR tableswitch 1 3: default 44
    //                   1 74
    //                   2 85
    //                   3 112;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append(z[2]).append(uri).toString());
_L2:
        s1 = s;
        as1 = as;
        if (!flag) goto _L5; else goto _L3
_L3:
        l = ContentUris.parseId(uri);
        s1 = a(s);
        as1 = a(as, l);
        if (!flag) goto _L5; else goto _L4
_L4:
        int j;
        try
        {
            flag = d.d();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        getContext().getContentResolver().notifyChange(uri, null);
        return j;
_L5:
        int k = d.getWritableDatabase().delete(z[3], s1, as1);
        getContext().getContentResolver().notifyChange(uri, null);
        return k;
    }

    public String getType(Uri uri)
    {
        int i;
        try
        {
            i = b.match(uri);
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
        uri = z[5];
        return uri;
_L3:
        return z[4];
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        boolean flag;
label0:
        {
            int i = b.match(uri);
            if (i == 3)
            {
                try
                {
                    if (!contentvalues.containsKey(z[16]))
                    {
                        throw new IllegalArgumentException(z[18]);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Uri uri)
                {
                    throw uri;
                }
                d.a(new File(contentvalues.getAsString(z[20])));
                return uri;
            }
            try
            {
                if (!contentvalues.containsKey(z[21]))
                {
                    break label0;
                }
                flag = contentvalues.getAsBoolean(z[19]).booleanValue();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
_L1:
        long l;
        try
        {
            contentvalues.remove(z[22]);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append(z[15]).append(uri).toString());

        case 1: // '\001'
            break;
        }
        break MISSING_BLOCK_LABEL_168;
        flag = false;
          goto _L1
label1:
        {
            if (flag)
            {
                l = d.getWritableDatabase().replaceOrThrow(z[14], null, contentvalues);
                if (!f)
                {
                    break label1;
                }
            }
            l = d.getWritableDatabase().insertOrThrow(z[17], null, contentvalues);
        }
        uri = ContentUris.withAppendedId(e, l);
        getContext().getContentResolver().notifyChange(uri, null);
        return uri;
    }

    public boolean onCreate()
    {
        d = new h(getContext());
        return true;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        SQLiteQueryBuilder sqlitequerybuilder;
        boolean flag;
        flag = f;
        sqlitequerybuilder = new SQLiteQueryBuilder();
        int i;
        sqlitequerybuilder.setTables(z[8]);
        i = b.match(uri);
        i;
        JVM INSTR tableswitch 1 2: default 60
    //                   1 94
    //                   2 99;
           goto _L1 _L2 _L3
_L1:
        try
        {
            throw new IllegalArgumentException((new StringBuilder()).append(z[7]).append(uri).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        sqlitequerybuilder.appendWhere((new StringBuilder()).append(z[9]).append(ContentUris.parseId(uri)).toString());
        if (flag) goto _L1; else goto _L4
_L4:
        as = sqlitequerybuilder.query(d.getReadableDatabase(), as, s, as1, null, null, s1);
        int j;
        try
        {
            as.setNotificationUri(getContext().getContentResolver(), uri);
            j = DialogToastActivity.g;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            try
            {
                throw uri;
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        if (j != 0)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            f = flag;
        }
        return as;
        uri;
        try
        {
            throw uri;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri) { }
        throw uri;
    }

    public void shutdown()
    {
        super.shutdown();
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        boolean flag = f;
        String as1[];
        String s1;
        int i;
        long l;
        try
        {
            i = b.match(uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        i;
        JVM INSTR tableswitch 1 2: default 40
    //                   1 73
    //                   2 85;
           goto _L1 _L2 _L3
_L1:
        try
        {
            throw new IllegalArgumentException((new StringBuilder()).append(z[0]).append(uri).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
_L2:
        s1 = s;
        as1 = as;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        l = ContentUris.parseId(uri);
        s1 = a(s);
        as1 = a(as, l);
        if (flag) goto _L1; else goto _L4
_L4:
        i = d.getWritableDatabase().update(z[1], contentvalues, s1, as1);
        getContext().getContentResolver().notifyChange(uri, null);
        return i;
    }

    static 
    {
        Object obj;
        String s;
        Object obj1;
        byte byte0;
        int i;
        obj = new String[23];
        i = 0;
        obj1 = obj;
        s = "*\035[2]\b\035\020\t`6S";
        byte0 = -1;
_L39:
        s = z(z(s));
        byte0;
        JVM INSTR tableswitch 0 22: default 132
    //                   0 150
    //                   1 168
    //                   2 186
    //                   3 204
    //                   4 222
    //                   5 241
    //                   6 261
    //                   7 281
    //                   8 301
    //                   9 321
    //                   10 341
    //                   11 361
    //                   12 381
    //                   13 401
    //                   14 421
    //                   15 441
    //                   16 461
    //                   17 481
    //                   18 501
    //                   19 521
    //                   20 541
    //                   21 561
    //                   22 619;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24
_L1:
        obj1[i] = s;
        s = "\b\022o?]\021\007Q?F\f";
        i = 1;
        obj1 = obj;
        byte0 = 0;
        continue; /* Loop/switch isn't completed */
_L2:
        obj1[i] = s;
        s = "*\035[2]\b\035\020\t`6S";
        i = 2;
        obj1 = obj;
        byte0 = 1;
        continue; /* Loop/switch isn't completed */
_L3:
        obj1[i] = s;
        s = "\b\022o?]\021\007Q?F\f";
        i = 3;
        obj1 = obj;
        byte0 = 2;
        continue; /* Loop/switch isn't completed */
_L4:
        obj1[i] = s;
        i = 4;
        obj1 = obj;
        s = "\t\035TrS\021\027B3[\033]S)@\f\034Br[\013\026]sD\021\027\036?]\022]G4S\013\000Q,BQ\003B3D\026\027U.\034\034\034^(S\034\007";
        byte0 = 3;
        continue; /* Loop/switch isn't completed */
_L5:
        obj1[i] = s;
        i = 5;
        s = "\t\035TrS\021\027B3[\033]S)@\f\034BrV\026\001\037*\\\033]S3_Q\004X=F\f\022@,\034\017\001_*[\033\026BrQ\020\035D=Q\013";
        byte0 = 4;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L6:
        obj1[i] = s;
        i = 6;
        s = "*\035[2]\b\035\020\t`6S";
        byte0 = 5;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L7:
        obj1[i] = s;
        i = 7;
        s = "*\035[2]\b\035\020\t`6S";
        byte0 = 6;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L8:
        obj1[i] = s;
        i = 8;
        s = "\b\022o?]\021\007Q?F\f";
        byte0 = 7;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L9:
        obj1[i] = s;
        i = 9;
        s = " \032T|\017_";
        byte0 = 8;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L10:
        obj1[i] = s;
        i = 10;
        s = "\034\034^(W\021\007";
        byte0 = 9;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L11:
        obj1[i] = s;
        i = 11;
        s = "\034\034]rE\027\022D/S\017\003\036,@\020\005Y8W\r]S3\\\013\022S(";
        byte0 = 10;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L12:
        obj1[i] = s;
        i = 12;
        s = " \032T|\017_L";
        byte0 = 11;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L13:
        obj1[i] = s;
        i = 13;
        s = " \032T|\017_L\020\035|;S\030";
        byte0 = 12;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L14:
        obj1[i] = s;
        i = 14;
        s = "\b\022o?]\021\007Q?F\f";
        byte0 = 13;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L15:
        obj1[i] = s;
        i = 15;
        s = "*\035[2]\b\035\020\t`6S";
        byte0 = 14;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L16:
        obj1[i] = s;
        i = 16;
        s = "\017\022D4";
        byte0 = 15;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L17:
        obj1[i] = s;
        i = 17;
        s = "\b\022o?]\021\007Q?F\f";
        byte0 = 16;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L18:
        obj1[i] = s;
        i = 18;
        s = "\017\022D4\022\026\000\020=\022\r\026A)[\r\026T|D\036\037E9";
        byte0 = 17;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L19:
        obj1[i] = s;
        i = 19;
        s = " ,Y2A\032\001D\003]\r,B9B\023\022S9m ";
        byte0 = 18;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L20:
        obj1[i] = s;
        i = 20;
        s = "\017\022D4";
        byte0 = 19;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L21:
        obj1[i] = s;
        i = 21;
        s = " ,Y2A\032\001D\003]\r,B9B\023\022S9m ";
        byte0 = 20;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L22:
        obj1[i] = s;
        i = 22;
        s = " ,Y2A\032\001D\003]\r,B9B\023\022S9m ";
        byte0 = 21;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L23:
        obj1[i] = s;
        z = ((String []) (obj));
        obj = "\034\034^(W\021\007\ns\035\034\034]rE\027\022D/S\017\003\036,@\020\005Y8W\r]S3\\\013\022S(\035\034\034^(S\034\007C";
        byte0 = -1;
_L28:
        obj = z(z(((String) (obj))));
        byte0;
        JVM INSTR tableswitch 0 0: default 604
    //                   0 728;
           goto _L25 _L26
_L25:
        e = Uri.parse(((String) (obj)));
        obj = "\034\034^(W\021\007\ns\035\034\034]rE\027\022D/S\017\003\036,@\020\005Y8W\r]S3\\\013\022S(\035\034\034^(S\034\007CsV\035\025Y0W";
        byte0 = 0;
        if (true) goto _L28; else goto _L27
_L27:
_L24:
        obj1[i] = s;
        a = ((String []) (obj));
        b = new UriMatcher(-1);
        obj = b;
        byte0 = -1;
_L36:
        obj1 = z(z("\034\034]rE\027\022D/S\017\003\036,@\020\005Y8W\r]S3\\\013\022S("));
        byte0;
        JVM INSTR tableswitch 0 1: default 676
    //                   0 754
    //                   1 778;
           goto _L29 _L30 _L31
_L29:
        s = "\034\034^(S\034\007C";
        byte0 = -1;
_L37:
        s = z(z(s));
        byte0;
        JVM INSTR tableswitch 0 1: default 712
    //                   0 762
    //                   1 786;
           goto _L32 _L33 _L34
_L32:
        ((UriMatcher) (obj)).addURI(((String) (obj1)), s, 1);
        obj = b;
        byte0 = 0;
        if (true) goto _L36; else goto _L35
_L35:
_L26:
        c = Uri.parse(((String) (obj)));
        obj = new String[1];
        s = "\034\034E2FW,Y8\033_2c|m\034\034E2F";
        byte0 = 22;
        obj1 = obj;
        i = 0;
        continue; /* Loop/switch isn't completed */
_L30:
        s = "\034\034^(S\034\007Cs\021";
        byte0 = 0;
          goto _L37
_L33:
        ((UriMatcher) (obj)).addURI(((String) (obj1)), s, 2);
        obj = b;
        byte0 = 1;
          goto _L36
_L31:
        s = "\034\034^(S\034\007CsV\035\025Y0W";
        byte0 = 1;
          goto _L37
_L34:
        ((UriMatcher) (obj)).addURI(((String) (obj1)), s, 3);
        if (true) goto _L39; else goto _L38
_L38:
    }
}
