// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.whatsapp:
//            fm, DialogToastActivity, q0

class f0 extends fm
{

    private static final int h[];
    private static final String z[];
    private int d;
    private CountDownLatch e;
    private boolean f;
    private Thread g;
    private Exception i;

    public f0(String s)
    {
        int j = fm.a;
        super();
        d = 1;
        c = new File((new StringBuilder()).append(s).append(z[17]).toString());
        b = 32000;
        if (j != 0)
        {
            DialogToastActivity.g++;
        }
    }

    private static int a(int j)
    {
        int l = fm.a;
        int k = 0;
        do
        {
            if (k >= h.length)
            {
                break;
            }
            int i1;
            try
            {
                i1 = h[k];
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            if (j == i1)
            {
                return k;
            }
            k++;
        } while (l == 0);
        return 0;
    }

    static void a(f0 f0_1)
    {
        f0_1.c();
    }

    static boolean a(f0 f0_1, boolean flag)
    {
        f0_1.f = flag;
        return flag;
    }

    private void c()
    {
        Object obj;
        Object obj1;
        java.nio.channels.FileChannel filechannel;
        FileOutputStream fileoutputstream;
        java.nio.channels.FileChannel filechannel1;
        AudioRecord audiorecord;
        MediaCodec mediacodec;
        int j1 = fm.a;
        int l = AudioRecord.getMinBufferSize(22050, 16, 2);
        int j = 1;
        int k;
        do
        {
            k = j;
            if (j >= l)
            {
                break;
            }
            k = j * 2;
            j = k;
        } while (j1 == 0);
        mediacodec = MediaCodec.createEncoderByType(z[2]);
        obj = new MediaFormat();
        ((MediaFormat) (obj)).setString(z[3], z[8]);
        ((MediaFormat) (obj)).setInteger(z[6], 1);
        ((MediaFormat) (obj)).setInteger(z[0], 22050);
        ((MediaFormat) (obj)).setInteger(z[9], 32000);
        ((MediaFormat) (obj)).setInteger(z[1], 2);
        ((MediaFormat) (obj)).setInteger(z[7], k);
        ByteBuffer abytebuffer[];
        android.media.MediaCodec.BufferInfo bufferinfo;
        byte abyte0[];
        byte abyte1[];
        int k1;
        int l1;
        try
        {
            mediacodec.configure(((MediaFormat) (obj)), null, null, 1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.a(((Throwable) (obj)));
            i = ((Exception) (obj));
            mediacodec.release();
            e.countDown();
            throw obj;
        }
        mediacodec.start();
        abytebuffer = mediacodec.getInputBuffers();
        obj = mediacodec.getOutputBuffers();
        bufferinfo = new android.media.MediaCodec.BufferInfo();
        abyte0 = new byte[7];
        abyte0[0] = -1;
        abyte0[1] = -15;
        j = (byte)a(22050);
        abyte0[2] = (byte)64;
        abyte0[2] = (byte)(j << 2 | abyte0[2]);
        abyte0[2] = (byte)(abyte0[2] | 0);
        abyte0[3] = 0;
        abyte0[4] = 0;
        abyte0[5] = 0;
        abyte0[6] = -4;
        abyte1 = new byte[k];
        audiorecord = new AudioRecord(d, 22050, 16, 2, k);
        try
        {
            audiorecord.startRecording();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.a(((Throwable) (obj)));
            i = ((Exception) (obj));
            mediacodec.stop();
            mediacodec.release();
            e.countDown();
            throw obj;
        }
        e.countDown();
        filechannel = null;
        obj1 = null;
        fileoutputstream = new FileOutputStream(c());
        filechannel = ((java.nio.channels.FileChannel) (obj1));
        filechannel1 = fileoutputstream.getChannel();
_L7:
        filechannel = filechannel1;
        boolean flag;
        if (!f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        filechannel = filechannel1;
        k1 = audiorecord.read(abyte1, 0, k);
        filechannel = filechannel1;
        l1 = mediacodec.dequeueInputBuffer(0xf4240L);
        if (l1 < 0)
        {
            break MISSING_BLOCK_LABEL_411;
        }
        obj1 = abytebuffer[l1];
        filechannel = filechannel1;
        ((ByteBuffer) (obj1)).clear();
        filechannel = filechannel1;
        ((ByteBuffer) (obj1)).put(abyte1);
        int i1;
        if (flag)
        {
            i1 = 4;
        } else
        {
            i1 = 0;
        }
        filechannel = filechannel1;
        mediacodec.queueInputBuffer(l1, 0, k1, 0L, i1);
        filechannel = filechannel1;
        i1 = mediacodec.dequeueOutputBuffer(bufferinfo, 0L);
_L2:
        obj1 = obj;
        if (i1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_604;
        }
        obj1 = obj[i1];
        filechannel = filechannel1;
        ((ByteBuffer) (obj1)).position(bufferinfo.offset);
        filechannel = filechannel1;
        ((ByteBuffer) (obj1)).limit(bufferinfo.offset + bufferinfo.size);
        filechannel = filechannel1;
        if ((bufferinfo.flags & 2) == 2)
        {
            break MISSING_BLOCK_LABEL_578;
        }
        filechannel = filechannel1;
        k1 = (bufferinfo.size - bufferinfo.offset) + 7;
        abyte0[3] = (byte)(k1 >> 11 & 3 | 0x40);
        abyte0[4] = (byte)(k1 >> 3 & 0xff);
        abyte0[5] = (byte)((k1 & 7) << 5 | 0x1f);
        filechannel = filechannel1;
        filechannel1.write(ByteBuffer.wrap(abyte0));
        filechannel = filechannel1;
        filechannel1.write(((ByteBuffer) (obj1)));
        filechannel = filechannel1;
        ((ByteBuffer) (obj1)).clear();
        filechannel = filechannel1;
        mediacodec.releaseOutputBuffer(i1, false);
        obj1 = obj;
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_687;
        }
        if (i1 != -3)
        {
            break MISSING_BLOCK_LABEL_638;
        }
        filechannel = filechannel1;
        obj = mediacodec.getOutputBuffers();
        filechannel = filechannel1;
        Log.i(z[4]);
        obj1 = obj;
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_687;
        }
        obj1 = obj;
        if (i1 != -2)
        {
            break MISSING_BLOCK_LABEL_687;
        }
        filechannel = filechannel1;
        obj1 = mediacodec.getOutputFormat();
        filechannel = filechannel1;
        Log.i((new StringBuilder()).append(z[12]).append(obj1).toString());
        obj1 = obj;
        filechannel = filechannel1;
        i1 = mediacodec.dequeueOutputBuffer(bufferinfo, 0L);
        obj = obj1;
        if (j1 == 0) goto _L2; else goto _L1
_L1:
        if ((!flag || j1 != 0) && j1 == 0)
        {
            break MISSING_BLOCK_LABEL_965;
        }
        try
        {
            mediacodec.stop();
            mediacodec.release();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_744;
        }
        filechannel1.close();
_L3:
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.a(z[13], ((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        audiorecord.stop();
        audiorecord.release();
        return;
        obj;
        filechannel = filechannel1;
        throw obj;
        obj;
        obj1 = fileoutputstream;
_L5:
        try
        {
            mediacodec.stop();
            mediacodec.release();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_854;
        }
        filechannel.close();
_L4:
        IOException ioexception;
        if (obj1 != null)
        {
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Log.a(z[10], ((Throwable) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        audiorecord.stop();
        audiorecord.release();
        throw obj;
        obj;
        filechannel = filechannel1;
        throw obj;
        obj;
        filechannel = filechannel1;
        throw obj;
        obj;
        Log.a(z[5], ((Throwable) (obj)));
          goto _L3
        ioexception;
        Log.a(z[11], ioexception);
          goto _L4
        obj;
        obj1 = null;
          goto _L5
        obj = obj1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void a()
    {
        Thread thread;
        try
        {
            f = false;
            thread = g;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (thread == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        g.join();
        g = null;
        return;
        InterruptedException interruptedexception;
        interruptedexception;
        Log.a(z[14], interruptedexception);
        return;
    }

    public void b()
    {
    }

    public void b(int j)
    {
        d = j;
    }

    public void e()
    {
        try
        {
            if (g != null)
            {
                throw new IllegalStateException();
            }
        }
        catch (InterruptedException interruptedexception)
        {
            throw interruptedexception;
        }
        f = true;
        g = new Thread(new q0(this));
        e = new CountDownLatch(1);
        g.start();
        try
        {
            e.await();
            if (i != null)
            {
                throw new RuntimeException(z[15], i);
            }
        }
        catch (InterruptedException interruptedexception1)
        {
            Log.a(z[16], interruptedexception1);
        }
    }

    public void f()
    {
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int j;
        as = new String[18];
        obj = "p\022r-Ef^m<]f";
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
                obj = "b\022|pYq\034y4Ef";
                j = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "b\006{4F,\036oiH.\037~)D";
                j = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                obj = "n\032r8";
                j = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[j] = ((String) (obj));
                j = 4;
                obj = "u\034v>Lq\026|2[g\026m<\\g\032p/L`\034m9\006#\026q>Fg\026m}Fv\007o(]#\021j;Of\001l}Ab\005z}Jk\022q:Lg]";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "u\034v>Lq\026|2[g\026m<\\g\032p/L`\034m9\006#";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[j] = ((String) (obj));
                j = 6;
                obj = "`\033~3Gf\0372>Fv\035k";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[j] = ((String) (obj));
                j = 7;
                obj = "n\022gp@m\003j)\004p\032e8";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[j] = ((String) (obj));
                j = 8;
                obj = "b\006{4F,\036oiH.\037~)D";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[j] = ((String) (obj));
                j = 9;
                obj = "a\032k/Hw\026";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[j] = ((String) (obj));
                j = 10;
                obj = "u\034v>Lq\026|2[g\026m<\\g\032p/L`\034m9\006#";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[j] = ((String) (obj));
                j = 11;
                obj = "u\034v>Lq\026|2[g\026m<\\g\032p/L`\034m9\006#";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[j] = ((String) (obj));
                obj = "u\034v>Lq\026|2[g\026m<\\g\032p/L`\034m9\006#\026q>Fg\026m}Fv\007o(]#\025p/Db\007?5HpS|5Hm\024z9\tw\034?";
                byte0 = 11;
                j = 12;
                break;

            case 11: // '\013'
                as1[j] = ((String) (obj));
                j = 13;
                obj = "u\034v>Lq\026|2[g\026m<\\g\032p/L`\034m9\006#";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[j] = ((String) (obj));
                j = 14;
                obj = "u\034v>Lq\026|2[g\026m<\\g\032p/L`\034m9";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[j] = ((String) (obj));
                j = 15;
                obj = "p\007~/]#\001z>Fq\027v3N#\025~4Ef\027";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[j] = ((String) (obj));
                j = 16;
                obj = "u\034v>Lq\026|2[g\026m<\\g\032p/L`\034m9";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[j] = ((String) (obj));
                j = 17;
                obj = "-\022~>";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[j] = ((String) (obj));
                z = as;
                h = (new int[] {
                    0x17700, 0x15888, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 
                    11025, 8000
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 556
    //                   0 579
    //                   1 585
    //                   2 592
    //                   3 599;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_599;
_L3:
        byte byte1 = 41;
_L9:
        obj[k] = (char)(byte1 ^ c1);
        k++;
          goto _L8
_L4:
        byte1 = 3;
          goto _L9
_L5:
        byte1 = 115;
          goto _L9
_L6:
        byte1 = 31;
          goto _L9
        byte1 = 93;
          goto _L9
    }
}
