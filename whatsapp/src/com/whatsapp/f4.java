// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.media.AudioRecord;
import android.media.MediaRecorder;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.whatsapp:
//            fm, jz, au5, au2, 
//            DialogToastActivity

class f4 extends fm
{

    private static boolean g;
    private static final String z[];
    private MediaRecorder d;
    private String e;
    private jz f;
    private au5 h;
    private String i;

    public f4(String s, String s1)
    {
        e = s;
        i = s1;
    }

    static MediaRecorder a(f4 f4_1)
    {
        return f4_1.d;
    }

    static au5 a(f4 f4_1, au5 au5_1)
    {
        f4_1.h = au5_1;
        return au5_1;
    }

    public static void a(InputStream inputstream, OutputStream outputstream)
    {
        int j = 0;
        int j1 = fm.a;
        byte abyte0[] = new byte[7];
        byte abyte1[] = new byte[8192];
        int k = 0;
label0:
        do
        {
label1:
            {
                int l = j;
                if (inputstream.read(abyte0) != abyte0.length)
                {
                    break label0;
                }
                byte byte0 = abyte0[3];
                byte byte1 = abyte0[4];
                byte byte2 = abyte0[5];
                int i1 = k;
                if ((abyte0[2] & 0xc0) != 64)
                {
                    l = k;
                    if (k == 0)
                    {
                        l = 1;
                        Log.w((new StringBuilder()).append(z[15]).append((abyte0[2] & 0xc0) >> 6).toString());
                    }
                    abyte0[2] = (byte)(abyte0[2] & 0x3c | 0x40);
                    i1 = l;
                }
                k = ((byte0 & 3) << 11 | (byte1 & 0xff) << 3 | (byte2 & 0xe0) >> 5) - abyte0.length;
                if (k > 0)
                {
                    try
                    {
                        outputstream.write(abyte0);
                        inputstream.read(abyte1, 0, k);
                        outputstream.write(abyte1, 0, k);
                    }
                    // Misplaced declaration of an exception variable
                    catch (InputStream inputstream)
                    {
                        throw inputstream;
                    }
                    l = j;
                    if (j1 == 0)
                    {
                        break label1;
                    }
                }
                l = j + 1;
            }
            j = l;
            k = i1;
        } while (j1 == 0);
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        Log.w((new StringBuilder()).append(z[16]).append(l).toString());
        return;
        inputstream;
        throw inputstream;
    }

    static au5 b(f4 f4_1)
    {
        return f4_1.h;
    }

    static String c(f4 f4_1)
    {
        return f4_1.e;
    }

    public void a()
    {
        try
        {
            if (d != null)
            {
                d.stop();
            }
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
        try
        {
            if (f != null)
            {
                f.removeMessages(0);
            }
        }
        catch (RuntimeException runtimeexception1)
        {
            throw runtimeexception1;
        }
        try
        {
            if (h != null)
            {
                h.a();
            }
            return;
        }
        catch (RuntimeException runtimeexception2)
        {
            throw runtimeexception2;
        }
    }

    public void b()
    {
        try
        {
            if (d != null)
            {
                d.release();
                d = null;
            }
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
    }

    public void e()
    {
        d.start();
        return;
        Object obj;
        obj;
        int j;
        Log.a(z[0], ((Throwable) (obj)));
        j = android.os.Build.VERSION.SDK_INT;
        if (j < 10)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        boolean flag = g;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        try
        {
            d.release();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.a(z[2], ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        d = new MediaRecorder();
        d.setAudioSource(1);
        d.setOutputFormat(3);
        d.setAudioEncoder(1);
        c = new File((new StringBuilder()).append(e).append(z[3]).toString());
        b = 12200;
        d.setOutputFile(c.getAbsolutePath());
        d.setMaxFileSize((long)au2.q * 0x100000L);
        d.prepare();
        try
        {
            d.start();
            g = true;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            Log.a(z[1], ((Throwable) (obj)));
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.a(z[4], ((Throwable) (obj)));
        }
        throw obj;
        obj;
        throw obj;
        throw obj;
    }

    public void f()
    {
        Object obj1;
        int j;
        j = fm.a;
        d = new MediaRecorder();
        d.setAudioSource(1);
        obj1 = null;
        if (!z[11].equals(i)) goto _L2; else goto _L1
_L1:
        c = new File((new StringBuilder()).append(e).append(z[5]).toString());
        b = 12200;
        d.setOutputFormat(1);
        d.setAudioEncoder(1);
        Object obj = obj1;
        if (j == 0) goto _L3; else goto _L2
_L2:
        int k = android.os.Build.VERSION.SDK_INT;
        if (k < 10) goto _L5; else goto _L4
_L4:
        boolean flag = g;
        if (!flag) goto _L6; else goto _L5
_L5:
        int l;
        try
        {
            c = new File((new StringBuilder()).append(e).append(z[10]).toString());
            b = 12200;
            d.setOutputFormat(3);
            d.setAudioEncoder(1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj = obj1;
        if (j == 0) goto _L3; else goto _L6
_L6:
        if (android.os.Build.VERSION.SDK_INT < 14) goto _L8; else goto _L7
_L7:
        l = AudioRecord.getMinBufferSize(22050, 1, 2);
        if (l <= 0) goto _L8; else goto _L9
_L9:
        c = new File((new StringBuilder()).append(e).append(z[13]).toString());
        b = 32000;
        d.setOutputFormat(6);
        d.setAudioEncoder(3);
        d.setAudioSamplingRate(22050);
        d.setAudioEncodingBitRate(32000);
        obj = new File((new StringBuilder()).append(e).append(z[12]).append(z[14]).toString());
        try
        {
            f = new jz(this, null);
            f.sendEmptyMessageDelayed(0, 50L);
        }
        catch (Exception exception) { }
_L3:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_385;
        }
        d.setOutputFile(((File) (obj)).getAbsolutePath());
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_399;
        }
        try
        {
            d.setOutputFile(c.getAbsolutePath());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        d.setMaxFileSize((long)au2.q * 0x100000L);
        d.prepare();
_L11:
        try
        {
            if (DialogToastActivity.g != 0)
            {
                fm.a = j + 1;
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = obj1;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        c = new File((new StringBuilder()).append(e).append(z[6]).toString());
        if (AudioRecord.getMinBufferSize(16000, 1, 2) <= 0)
        {
            break MISSING_BLOCK_LABEL_540;
        }
        b = 12650;
        d.setOutputFormat(4);
        d.setAudioEncoder(2);
        d.setAudioSamplingRate(16000);
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_778;
        }
        b = 12200;
        d.setOutputFormat(3);
        d.setAudioEncoder(1);
        obj = null;
        continue; /* Loop/switch isn't completed */
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        obj;
        throw obj;
        obj;
        boolean flag1;
        try
        {
            Log.a(z[7], ((Throwable) (obj)));
            if (android.os.Build.VERSION.SDK_INT < 10)
            {
                break; /* Loop/switch isn't completed */
            }
            flag1 = g;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            d.release();
        }
        catch (RuntimeException runtimeexception)
        {
            Log.a(z[8], runtimeexception);
        }
        try
        {
            g = true;
            d = new MediaRecorder();
            d.setAudioSource(1);
            c = new File((new StringBuilder()).append(e).append(z[9]).toString());
            b = 12200;
            d.setOutputFormat(3);
            d.setAudioEncoder(1);
            d.setOutputFile(c.getAbsolutePath());
            d.setMaxFileSize((long)au2.q * 0x100000L);
            d.prepare();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (j == 0) goto _L11; else goto _L10
_L10:
        throw new IOException(((Exception) (obj)).toString());
        obj = null;
        if (true) goto _L3; else goto _L12
_L12:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int j;
        as = new String[17];
        obj = "e`]&tajW*cwjFjbgnF1wrfX u";
        byte0 = -1;
        j = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "e`]&tajW*cwjFjbgnF1wrfX u<|@$cgiU,}vk";
                j = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "e`]&tajW*cwjFjbgnF1wrfX u<}Q)tr|Q";
                j = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                obj = "=nY7";
                j = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[j] = ((String) (obj));
                j = 4;
                obj = "e`]&tajW*cwjFjbgnF1wrfX u<\177F ar}Q";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "=<S5";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[j] = ((String) (obj));
                j = 6;
                obj = "=nY7";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[j] = ((String) (obj));
                j = 7;
                obj = "e`]&tajW*cwjFjaajD$cv";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[j] = ((String) (obj));
                j = 8;
                obj = "e`]&tajW*cwjFjaajD$cviU,}vk\0337t\177jU6t";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[j] = ((String) (obj));
                j = 9;
                obj = "=nY7";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[j] = ((String) (obj));
                j = 10;
                obj = "=nY7";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[j] = ((String) (obj));
                j = 11;
                obj = "rzP,~<<S5a";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[j] = ((String) (obj));
                j = 12;
                obj = "=>";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[j] = ((String) (obj));
                j = 13;
                obj = "=nU&";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[j] = ((String) (obj));
                j = 14;
                obj = "=nU&";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[j] = ((String) (obj));
                obj = "e`]&tajW*cwjFjwzwU$r<mU!1~\177Q\"<'/U0uz`\024*syjW11gvD +";
                byte0 = 14;
                j = 15;
                break;

            case 14: // '\016'
                as1[j] = ((String) (obj));
                j = 16;
                obj = "e`]&tajW*cwjFjwzwU$r<jY5ej5\024";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[j] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 456
    //                   0 479
    //                   1 486
    //                   2 493
    //                   3 500;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_500;
_L3:
        byte byte1 = 17;
_L9:
        obj[k] = (char)(byte1 ^ c1);
        k++;
          goto _L8
_L4:
        byte1 = 19;
          goto _L9
_L5:
        byte1 = 15;
          goto _L9
_L6:
        byte1 = 52;
          goto _L9
        byte1 = 69;
          goto _L9
    }
}
