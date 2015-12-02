// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util.dns;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

// Referenced classes of package com.whatsapp.util.dns:
//            f, d, h, a, 
//            b

class c
{

    private static final InetSocketAddress a;
    private static final InetSocketAddress b;
    private static final String z[];

    static a[] a(String s, int i)
    {
        Object obj;
        byte abyte0[];
        byte abyte1[];
        DatagramPacket datagrampacket;
        int j;
        j = f.a;
        obj = d.a(s);
        abyte0 = ((d) (obj)).b();
        abyte1 = new byte[512];
        datagrampacket = new DatagramPacket(abyte1, abyte1.length);
        DatagramSocket datagramsocket = new DatagramSocket();
        Log.i((new StringBuilder()).append(z[23]).append(a).append(z[22]).append(s).append(z[3]).append(i).append(z[5]).toString());
        datagramsocket.connect(a);
        datagramsocket.setSoTimeout(i / 2);
        datagramsocket.send(new DatagramPacket(abyte0, abyte0.length));
        datagramsocket.receive(datagrampacket);
_L2:
        abyte0 = d.a(abyte1);
        if (abyte0 == null)
        {
            try
            {
                throw new UnknownHostException((new StringBuilder()).append(z[13]).append(s).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        break; /* Loop/switch isn't completed */
        InterruptedIOException interruptedioexception;
        interruptedioexception;
        Log.i((new StringBuilder()).append(z[0]).append(a).append(z[7]).append(s).toString());
        datagramsocket.disconnect();
        try
        {
            Log.i((new StringBuilder()).append(z[21]).append(b).append(z[4]).append(s).append(z[24]).append(i).append(z[16]).toString());
            datagramsocket.connect(b);
            datagramsocket.setSoTimeout(i / 2);
            datagramsocket.send(new DatagramPacket(abyte0, abyte0.length));
            datagramsocket.receive(datagrampacket);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                Log.i((new StringBuilder()).append(z[1]).append(b).append(z[8]).append(s).toString());
                throw new UnknownHostException((new StringBuilder()).append(z[25]).append(s).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w((new StringBuilder()).append(z[2]).append(obj).append(z[9]).append(s).toString());
            }
            throw new UnknownHostException((new StringBuilder()).append(z[10]).append(s).toString());
        }
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            if (abyte0.a().e() != ((d) (obj)).a().e())
            {
                throw new UnknownHostException((new StringBuilder()).append(z[12]).append(s).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            if (!abyte0.a().g())
            {
                throw new UnknownHostException((new StringBuilder()).append(z[11]).append(s).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            if (abyte0.a().a())
            {
                throw new UnknownHostException((new StringBuilder()).append(z[18]).append(s).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            if (abyte0.a().c() != 0)
            {
                throw new UnknownHostException((new StringBuilder()).append(z[26]).append(s).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            if (abyte0.c().length == 0)
            {
                throw new UnknownHostException((new StringBuilder()).append(z[6]).append(s).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        long l = System.currentTimeMillis();
        a aa[] = new a[abyte0.c().length];
        i = 0;
        do
        {
            if (i >= abyte0.c().length)
            {
                break;
            }
            b b1 = abyte0.c()[i];
            try
            {
                if (b1.e() != 1)
                {
                    throw new UnknownHostException((new StringBuilder()).append(z[15]).append(s).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            try
            {
                if (b1.c() != 1)
                {
                    throw new UnknownHostException((new StringBuilder()).append(z[20]).append(s).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            try
            {
                if (b1.g() != 4)
                {
                    throw new UnknownHostException((new StringBuilder()).append(z[19]).append(s).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            aa[i] = new a(InetAddress.getByAddress(abyte0.a(b1.b()), b1.f()), (long)b1.d() * 1000L + l);
            i++;
        } while (j == 0);
        Log.i((new StringBuilder()).append(z[14]).append(aa.length).append(z[17]).append(s).toString());
        return aa;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[27];
        obj = "\rG`d,YAxuh\016Fdm-Y_xd:\000Gcfh";
        byte0 = -1;
        i = 0;
_L10:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L7:
        if (k <= j)
        {
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\rG`d,YAxuh\016Fdm-Y_xd:\000Gcfh";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\f@hy8\034Myd,YgBD0\032K}u!\026@-";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "YYdu Y";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "YHbsh";
                byte0 = 3;
                i = 4;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "YC~!<\020Chn=\r";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\027A-`&\nYhs;Y\\hb-\020Xheh\016Fdm-YZ\177x!\027I-u'Y\\hr'\025Xh!";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "YHbsh";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "YHbsh";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "YYeh$\034\016ys1\020@j!<\026\016\177d;\026B{dh";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\020Ahy+\034^yh'\027\016zi!\025K-u:\000Gcfh\rA-s-\nAaw-Y";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\035Gi!&\026Z-s-\032Kdw-Y\\hr8\026@~dh\037\\blh\nK\177w-\013\016zi!\025K-u:\000Gcfh\rA-s-\nAaw-Y";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\013Knd!\017Ki!:\034]}n&\nK-v!\rF-t&\034V}d+\rKi!!\035\016zi!\025K-u:\000Gcfh\rA-s-\nAaw-Y";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                obj = "\034\\\177n:Y^ls;\020@j!:\034]}n&\nK-v \020Bh!<\013Wdo/YZb!:\034]bm>\034\016";
                byte0 = 12;
                i = 13;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\013K~n$\017Ki!";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\f@hy8\034Myd,YMa`;\n\016\177d<\f\\cd,YYeh$\034\016ys1\020@j!<\026\016\177d;\026B{dh";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "YC~!<\020Chn=\r";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "YOie:\034]~d;Y[~h&\036\016o`+\022[}!\f7}-g'\013\016";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "\013Knd!\017Ki!<\013[cb)\rKi!:\034]}n&\nK-v \020Bh!<\013Wdo/YZb!:\034]bm>\034\016";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "\f@hy8\034Myd,Y\\hb'\013J-m-\027Iyih\013Kyt:\027Ki!?\021Gadh\r\\th&\036\016ynh\013K~n$\017K-";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "\f@hy8\034Myd,YZtq-Y\\hu=\013@heh\016Fdm-YZ\177x!\027I-u'Y\\hr'\025Xh!";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "\b[hs1\020@j!";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "YHbsh";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "\b[hs1\020@j!";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "YYdu Y";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "\rG`d'\fZ-v \020Bh!<\013Wdo/YZb!:\034]bm>\034\016";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "\034\\\177n:YMbe-YYlrh\nKy!!\027\016\177d;\tAcr-YYeh$\034\016ys1\020@j!<\026\016\177d;\026B{dh";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                z = as;
                byte byte1;
                char c1;
                try
                {
                    a = new InetSocketAddress(InetAddress.getByAddress(new byte[] {
                        8, 8, 8, 8
                    }), 53);
                    b = new InetSocketAddress(InetAddress.getByAddress(new byte[] {
                        8, 8, 4, 4
                    }), 53);
                    return;
                }
                catch (UnknownHostException unknownhostexception)
                {
                    throw new Error(unknownhostexception);
                }
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 752
    //                   0 775
    //                   1 782
    //                   2 789
    //                   3 796;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_796;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 72;
_L8:
        obj[j] = (char)(byte1 ^ c1);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 121;
          goto _L8
_L3:
        byte1 = 46;
          goto _L8
_L4:
        byte1 = 13;
          goto _L8
        byte1 = 1;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
    }
}
