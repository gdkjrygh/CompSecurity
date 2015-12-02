// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.whatsapp.util.Log;
import com.whatsapp.util.x;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

// Referenced classes of package com.whatsapp:
//            App, afm, rg

public class atr
{

    private static volatile boolean a;
    private static String b;
    private static String c;
    private static String d;
    private static String e;
    private static final String z[];

    private static long a(File file)
    {
        int l = App.am;
        FileInputStream fileinputstream;
        byte abyte0[];
        CRC32 crc32;
        abyte0 = new byte[4096];
        crc32 = new CRC32();
        fileinputstream = new FileInputStream(file);
_L2:
        file = fileinputstream;
        int i1 = fileinputstream.read(abyte0, 0, abyte0.length);
        if (i1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        file = fileinputstream;
        crc32.update(abyte0, 0, i1);
        if (l == 0) goto _L2; else goto _L1
_L1:
        file = fileinputstream;
        long l1 = crc32.getValue();
        long l2;
        l2 = l1;
        if (fileinputstream == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        fileinputstream.close();
        l2 = l1;
_L4:
        return l2;
        file;
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return l1;
        }
        IOException ioexception;
        ioexception;
        fileinputstream = null;
_L9:
        file = fileinputstream;
        Log.a(ioexception);
        l2 = 0L;
        if (fileinputstream == null) goto _L4; else goto _L3
_L3:
        fileinputstream.close();
        return 0L;
        file;
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return 0L;
        }
        Exception exception;
        exception;
        file = null;
_L8:
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        file.close();
_L6:
        throw exception;
        file;
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        if (true) goto _L6; else goto _L5
_L5:
        exception;
        if (true) goto _L8; else goto _L7
_L7:
        ioexception;
          goto _L9
    }

    private static String a(String s)
    {
        int l = App.am;
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 15000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 30000);
        HttpProtocolParams.setUserAgent(basichttpparams, afm.a());
        s = (new DefaultHttpClient(basichttpparams)).execute(new HttpGet(s)).getEntity().getContent();
        Object obj = new StringBuilder();
_L2:
        int i1 = s.read();
        if (i1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringBuilder) (obj)).append((char)i1);
        if (l == 0) goto _L2; else goto _L1
_L1:
        s.close();
        obj = ((StringBuilder) (obj)).toString();
        String s1;
        s1 = ((String) (obj));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        s.close();
        s1 = ((String) (obj));
_L4:
        return s1;
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return ((String) (obj));
        }
        s;
        s = null;
_L9:
        s1 = "";
        if (s == null) goto _L4; else goto _L3
_L3:
        s.close();
        return "";
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        Object obj1;
        obj1;
        s = null;
_L8:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        s.close();
_L6:
        throw obj1;
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        if (true) goto _L8; else goto _L7
_L7:
        obj1;
          goto _L9
    }

    static void a()
    {
        k();
    }

    public static void a(Context context, String s)
    {
        boolean flag;
        try
        {
            flag = a;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (flag)
        {
            boolean flag1;
            try
            {
                flag1 = e();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (flag1)
            {
                long l = context.getSharedPreferences(z[16], 0).getLong(z[17], 0L);
                long l1;
                try
                {
                    l1 = System.currentTimeMillis();
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    throw context;
                }
                if (l + 0x1499700L <= l1)
                {
                    x.a(new rg(s, context));
                    return;
                }
            }
        }
    }

    private static void a(String s, File file)
    {
        Object obj;
        String s1;
        File file1;
        int l;
        s1 = null;
        obj = null;
        file1 = null;
        l = App.am;
        byte abyte0[];
        abyte0 = new byte[4096];
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 15000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 30000);
        HttpProtocolParams.setUserAgent(basichttpparams, afm.a());
        s = (new DefaultHttpClient(basichttpparams)).execute(new HttpGet(s)).getEntity().getContent();
        s1 = s;
        file = new FileOutputStream(file);
_L2:
        int i1 = s.read(abyte0, 0, abyte0.length);
        if (i1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        file.write(abyte0, 0, i1);
        if (l == 0) goto _L2; else goto _L1
_L1:
        file.flush();
        if (true)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        throw new NullPointerException();
_L3:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        s.close();
_L5:
        return;
        file;
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
          goto _L3
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        file;
        s = null;
_L10:
        s1 = s;
        obj = file1;
        Log.e((new StringBuilder()).append(z[27]).append(file).toString());
        if (file1 != null)
        {
            try
            {
                file1.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        if (s == null) goto _L5; else goto _L4
_L4:
        try
        {
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        throw s;
        file;
        s = null;
        obj = s1;
_L9:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        ((OutputStream) (obj)).close();
_L6:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        s.close();
_L7:
        throw file;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
          goto _L6
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
          goto _L7
        file;
        s = s1;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        obj = file;
        file = exception;
        if (true) goto _L9; else goto _L8
_L8:
        file;
          goto _L10
        IOException ioexception;
        ioexception;
        file1 = file;
        file = ioexception;
          goto _L10
    }

    static String b()
    {
        return i();
    }

    public static boolean b(String s)
    {
        if (s != null)
        {
            int l;
            try
            {
                l = s.length();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (l >= 1)
            {
                boolean flag;
                try
                {
                    flag = a;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
                if (flag)
                {
                    return true;
                } else
                {
                    s = (new StringBuilder()).append(z[26]).append(s.substring(s.length() - 1)).append("/").toString();
                    Log.i((new StringBuilder()).append(z[25]).append(s).toString());
                    b = (new StringBuilder()).append(s).append(z[21]).toString();
                    d = (new StringBuilder()).append(s).append(z[22]).toString();
                    c = (new StringBuilder()).append(s).append(z[23]).toString();
                    e = (new StringBuilder()).append(s).append(z[24]).toString();
                    a = true;
                    return true;
                }
            }
        }
        return false;
    }

    private static long c()
    {
        String s = a(d).trim();
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            Log.a(s, numberformatexception);
            return -1L;
        }
        return l;
    }

    public static Uri d()
    {
        int l = App.u;
        if (l != 1)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        NumberFormatException numberformatexception;
        try
        {
            if (b != null)
            {
                return Uri.parse(b);
            }
        }
        catch (NumberFormatException numberformatexception1)
        {
            throw numberformatexception1;
        }
        break MISSING_BLOCK_LABEL_28;
        numberformatexception;
        throw numberformatexception;
        return Uri.parse(z[4]);
label0:
        {
            Uri uri;
            try
            {
                if (!App.a())
                {
                    break label0;
                }
                uri = Uri.parse(z[3]);
            }
            catch (NumberFormatException numberformatexception2)
            {
                throw numberformatexception2;
            }
            return uri;
        }
        return Uri.parse(z[2]);
    }

    public static boolean e()
    {
label0:
        {
            int l = App.G();
            if (l != 1)
            {
                try
                {
                    l = App.b(l);
                }
                catch (NumberFormatException numberformatexception)
                {
                    throw numberformatexception;
                }
                if ((l & 4) == 0)
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }

    public static void f()
    {
        File file = new File(App.aK, z[0]);
        try
        {
            file.createNewFile();
            return;
        }
        catch (IOException ioexception)
        {
            Log.e(z[1]);
        }
    }

    public static void g()
    {
        Object obj;
        File file;
        boolean flag2;
        flag2 = true;
        obj = App.aK;
        file = new File(((File) (obj)), z[18]);
        boolean flag = file.exists();
        if (flag)
        {
            try
            {
                flag = file.delete();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Log.b(flag);
        }
        file = new File(((File) (obj)), z[19]);
        try
        {
            flag = file.exists();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        return;
        obj;
        throw obj;
_L2:
        obj = new File(((File) (obj)), z[20]);
        flag = ((File) (obj)).exists();
        if (flag)
        {
            NumberFormatException numberformatexception;
            boolean flag1;
            try
            {
                flag1 = ((File) (obj)).delete();
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw numberformatexception1;
            }
            if (flag1)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            Log.b(flag1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        numberformatexception;
        throw numberformatexception;
    }

    public static Uri h()
    {
        File file;
        File file1;
        file1 = App.aK;
        file = new File(file1, z[5]);
        file1 = new File(file1, z[6]);
        boolean flag = file1.delete();
        NumberFormatException numberformatexception;
        if (flag)
        {
            try
            {
                if (file.exists())
                {
                    return Uri.fromFile(file);
                }
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw numberformatexception1;
            }
        }
        break MISSING_BLOCK_LABEL_60;
        numberformatexception;
        throw numberformatexception;
        return null;
    }

    private static String i()
    {
        return a(c).trim();
    }

    public static Uri j()
    {
        boolean flag;
        try
        {
            flag = a;
        }
        catch (NumberFormatException numberformatexception)
        {
            throw numberformatexception;
        }
        if (!flag)
        {
            return null;
        } else
        {
            return Uri.parse(e);
        }
    }

    private static void k()
    {
        File file1;
        File file2;
        long l;
        File file = App.aK;
        file1 = new File(file, z[7]);
        file2 = new File(file, z[13]);
        new File(file, z[14]);
        l = c();
        if (!file2.exists()) goto _L2; else goto _L1
_L1:
        if (l != a(file2)) goto _L4; else goto _L3
_L3:
        boolean flag = file1.exists();
        NumberFormatException numberformatexception;
        if (flag)
        {
            try
            {
                if (!file1.delete())
                {
                    Log.w(z[12]);
                }
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw numberformatexception1;
            }
        }
        f();
_L6:
        return;
        numberformatexception;
        throw numberformatexception;
_L4:
        try
        {
            if (!file2.delete())
            {
                Log.w(z[10]);
            }
        }
        catch (NumberFormatException numberformatexception2)
        {
            throw numberformatexception2;
        }
_L2:
        if (file1.exists())
        {
            if (l == a(file1))
            {
                try
                {
                    if (!file1.renameTo(file2))
                    {
                        Log.w(z[9]);
                    }
                }
                catch (NumberFormatException numberformatexception3)
                {
                    throw numberformatexception3;
                }
                f();
                return;
            }
            boolean flag1;
            try
            {
                if (!file1.delete())
                {
                    Log.w(z[15]);
                }
            }
            catch (NumberFormatException numberformatexception4)
            {
                throw numberformatexception4;
            }
        }
        if (!e()) goto _L6; else goto _L5
_L5:
        a(b, file1);
        flag1 = file1.exists();
        if (flag1)
        {
            if (l == a(file1))
            {
                NumberFormatException numberformatexception5;
                try
                {
                    if (!file1.renameTo(file2))
                    {
                        Log.w(z[8]);
                    }
                }
                catch (NumberFormatException numberformatexception6)
                {
                    throw numberformatexception6;
                }
                f();
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
          goto _L6
        numberformatexception5;
        throw numberformatexception5;
        if (file1.delete()) goto _L6; else goto _L7
_L7:
        Log.w(z[11]);
        return;
        NumberFormatException numberformatexception7;
        numberformatexception7;
        throw numberformatexception7;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int l;
        as = new String[28];
        obj = "aS\003EzwK\022\037|F\\\020PmS";
        byte0 = -1;
        l = 0;
_L2:
        String as1[];
        int i1;
        int j1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        j1 = obj.length;
        i1 = 0;
_L8:
label0:
        {
            if (j1 > i1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[l] = ((String) (obj));
                obj = "CK\005ChR^MBlXO\013_lZ\024\004P`Z";
                l = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[l] = ((String) (obj));
                obj = "[Z\020ZlB\001M\036mSO\003XeE\004\013U4UT\017\037~^Z\026BhFK";
                l = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[l] = ((String) (obj));
                obj = "WV\030_3\031\024\003AyE\024\003_mDT\013U6F\006\001^d\030L\nP}EZ\022A";
                l = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[l] = ((String) (obj));
                l = 4;
                obj = "^O\026Az\f\024MF~A\025\025YhBH\003Ay\030X\r\\&WU\006Cf__MR|DI\007_}\031l\nP}Ez\022A'WK\t";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[l] = ((String) (obj));
                l = 5;
                obj = "aS\003EzwK\022\037hFP";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[l] = ((String) (obj));
                l = 6;
                obj = "aS\003EzwK\022\037|F\\\020PmS";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[l] = ((String) (obj));
                l = 7;
                obj = "aS\003EzwK\022\037mYL\f]fW_";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[l] = ((String) (obj));
                l = 8;
                obj = "\034\021HDyQI\003Ul\031_\rFgZT\003U&RT\025_eYZ\006\021jYN\016Ug\021OBClXZ\017T)RT\025_eYZ\006\020";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[l] = ((String) (obj));
                obj = "\034\021HDyQI\003Ul\031_\rFgZT\003U)UT\027]mX\034\026\021{SU\003\\l\026_\rFgZT\003U(";
                byte0 = 8;
                l = 9;
                break;

            case 8: // '\b'
                as1[l] = ((String) (obj));
                l = 10;
                obj = "\034\021HDyQI\003Ul\031R\fB}WW\016\021jYN\016Ug\021OBUlZ^\026T)_U\021EhZWC";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[l] = ((String) (obj));
                l = 11;
                obj = "\034\021HDyQI\003Ul\031_\rFgZT\003U&RT\025_eYZ\006\021jYN\016Ug\021OBUlZ^\026T)RT\025_eYZ\006\020";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[l] = ((String) (obj));
                l = 12;
                obj = "\034\021HDyQI\003Ul\031R\fB}WW\016\021jYN\016Ug\021OBUlZ^\026T)RT\025_eYZ\006\020";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[l] = ((String) (obj));
                l = 13;
                obj = "aS\003EzwK\022\037hFP";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[l] = ((String) (obj));
                l = 14;
                obj = "aS\003EzwK\022\037|F\\\020PmS";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[l] = ((String) (obj));
                l = 15;
                obj = "\034\021HDyQI\003Ul\031_\rFgZT\003U)UT\027]mX\034\026\021mSW\007El\026_\rFgZT\003U(";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[l] = ((String) (obj));
                l = 16;
                obj = "UT\017\037~^Z\026BhFK=A{S]\007ClXX\007B";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[l] = ((String) (obj));
                l = 17;
                obj = "ZZ\021EVCK\005ChR^=RaSX\t";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[l] = ((String) (obj));
                l = 18;
                obj = "aS\003EzwK\022\037mYL\f]fW_";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[l] = ((String) (obj));
                l = 19;
                obj = "aS\003EzwK\022\037|F\\\020PmS";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[l] = ((String) (obj));
                l = 20;
                obj = "aS\003EzwK\022\037hFP";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[l] = ((String) (obj));
                l = 21;
                obj = "aS\003EzwK\022\037hFP";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[l] = ((String) (obj));
                l = 22;
                obj = "aS\003EzwK\022\037j]H\027\\";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[l] = ((String) (obj));
                l = 23;
                obj = "aS\003EzwK\022\037\177SI\021XfX";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[l] = ((String) (obj));
                l = 24;
                obj = "aS\003EzwK\022\037aBV\016";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[l] = ((String) (obj));
                l = 25;
                obj = "CK\005ChR^MBfCI\001T)";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[l] = ((String) (obj));
                l = 26;
                obj = "^O\026Az\f\024MF~A\025\025YhBH\003Ay\030X\r\\&WU\006Cf__M";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[l] = ((String) (obj));
                l = 27;
                obj = "CK\005ChR^MUfAU\016^hR\026\004XeS\033";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[l] = ((String) (obj));
                z = as;
                a = false;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 700
    //                   0 723
    //                   1 730
    //                   2 737
    //                   3 744;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_744;
_L3:
        byte byte1 = 9;
_L9:
        obj[i1] = (char)(byte1 ^ c1);
        i1++;
          goto _L8
_L4:
        byte1 = 54;
          goto _L9
_L5:
        byte1 = 59;
          goto _L9
_L6:
        byte1 = 98;
          goto _L9
        byte1 = 49;
          goto _L9
    }
}
