// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.fieldstats.av;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            App, Voip, aoz, VoiceService

public class 
    implements 
{

    private static final String z[];

    public void sendAccept(String s, String s1, String s2, int i, byte abyte0[][], int ai[], byte abyte1[], 
            byte abyte2[], byte abyte3[], int j)
    {
        com.whatsapp.App.a(c4.a(s1, true).c, s1, s, s2, i, abyte0, ai, abyte1, abyte2, abyte3, j);
    }

    public void sendOffer(String s, String s1, boolean flag, byte abyte0[][], int ai[], byte abyte1[], byte abyte2[])
    {
        com.whatsapp.App.a(c4.a(s1, true).c, s1, s, new String[] {
            z[0], z[1]
        }, new int[] {
            8000, 16000
        }, abyte0, ai, abyte1, abyte2);
    }

    public void sendReject(String s, String s1, String s2)
    {
        com.whatsapp.App.a(c4.a(s1, true).c, s1, s, s2);
        if (z[2].equals(s2))
        {
            s = new a(s1, false, com.whatsapp.Voip.a(s));
            s = App.ah.a(s);
            if (s != null)
            {
                App.d(s);
                com.whatsapp.VoiceService.a(av.BUSY);
            }
        }
    }

    public void sendRelayElection(String s, String s1, byte abyte0[], int i)
    {
        com.whatsapp.App.a(c4.a(s1, true).c, s1, s, abyte0, i);
    }

    public void sendRelayLatencies(String s, String s1, byte abyte0[][], int ai[])
    {
        com.whatsapp.App.a(c4.a(s1, true).c, s1, s, abyte0, ai);
    }

    public void sendTerminate(String s, String s1, String s2)
    {
        a a1 = c4.a(s1, true);
        z z1 = Voip.getCallInfo();
        long l;
        if (z1 != null)
        {
            l = z1.z();
        } else
        {
            l = 0L;
        }
        com.whatsapp.App.a(a1.c, s1, s, s2, l);
    }

    public void sendTransport(String s, String s1, byte abyte0[][], int ai[])
    {
        App.b(c4.a(s1, true).c, s1, s, abyte0, ai);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "j-\031#";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "j-\031#";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "g(\037)";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 182
    //                   2 188
    //                   3 194;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_194;
_L3:
        byte byte0 = 127;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 5;
          goto _L9
_L5:
        byte0 = 93;
          goto _L9
_L6:
        byte0 = 108;
          goto _L9
        byte0 = 80;
          goto _L9
    }

    public ()
    {
    }
}
