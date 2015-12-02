// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.util.concurrent.ThreadPoolExecutor;

// Referenced classes of package com.whatsapp:
//            ate, VoiceService, i_, asn, 
//            Voip, App, aoz, l1, 
//            ft, s0, ze, aa

public class bufferQueue
    implements bufferQueue
{

    private static final String z[];
    protected ate bufferQueue;
    final VoiceService this$0;

    public void audioInitError()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[23]).toString());
        com.whatsapp.VoiceService.a(VoiceService.this, null);
    }

    public void audioStreamStarted()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[4]).toString());
        com.whatsapp.VoiceService.a(VoiceService.this).sendEmptyMessage(2);
    }

    public void callAcceptFailed()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[16]).toString());
    }

    public void callAcceptReceived()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[47]).toString());
    }

    public void callAcceptSent()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[20]).toString());
    }

    public void callCaptureBufferFilled(z z1, byte abyte0[], int i, z az[])
    {
        if (abyte0 == null || abyte0.length <= 0 || i <= 0 || az == null)
        {
            return;
        } else
        {
            VoiceService.z().execute(new i_(this, az, z1, abyte0, i));
            return;
        }
    }

    public void callCaptureEnded(z z1, z az[])
    {
        VoiceService.z().execute(new asn(this, az, z1));
    }

    public void callEnding()
    {
label0:
        {
            long l = 0L;
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[42]).toString());
            Voip.checkStreamStatistics();
            z z1 = Voip.getCallInfo();
            if (z1 == null)
            {
                Log.e(z[44]);
                return;
            }
            a a1 = new a(z1.z(), z1.z(), com.whatsapp.Voip.a(z1.z()));
            c4 c4_1 = App.ah.a(a1);
            long l2 = Math.max(0L, z1.z());
            if (c4_1 != null)
            {
                c4_1.H = (int)l2 / 1000;
                if (z1.z())
                {
                    l = 1L;
                }
                c4_1.t = l;
                String s;
                if (VoiceService.j(VoiceService.this))
                {
                    s = z[43];
                } else
                {
                    s = null;
                }
                c4_1.l = s;
                Log.i((new StringBuilder()).append(getClass().getName()).append(z[45]).append(c4_1.H).append(")").toString());
                App.ah.e(c4_1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Log.e((new StringBuilder()).append(z[41]).append(a1).toString());
        }
        com.whatsapp.l1.a(z1.z(), 2);
        l1.b(z1.z(), 2);
        com.whatsapp.ft.a(App.au, Voip.getCallFieldStats());
        if (App.a9())
        {
            com.whatsapp.s0.a(false);
        }
        VoiceService.z().execute(new ze(this));
    }

    public void callInterrupted()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[1]).toString());
    }

    public void callOfferAckedWithRelayInfo()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[29]).toString());
        VoiceService.p(VoiceService.this).removeMessages(2);
    }

    public void callOfferNacked()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[39]).toString());
        com.whatsapp.VoiceService.a(VoiceService.this, null);
    }

    public void callOfferReceived()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[0]).toString());
    }

    public void callOfferSent()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[28]).toString());
    }

    public void callRejectReceived(String s)
    {
label0:
        {
            int i = App.am;
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[7]).append(s).append(')').toString());
            if (z[9].equals(s))
            {
                VoiceService.e(VoiceService.this, true);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (z[8].equals(s))
            {
                com.whatsapp.VoiceService.a(VoiceService.this, getString(0x7f0e0498, new Object[] {
                    VoiceService.l(VoiceService.this)
                }));
                if (i == 0)
                {
                    break label0;
                }
            }
            com.whatsapp.VoiceService.a(VoiceService.this, null);
        }
    }

    public void callResumed()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[25]).toString());
    }

    public void callStateChanged(z z1, z z2)
    {
        z z3;
label0:
        {
            int i = App.am;
            z3 = z2.z();
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[36]).append(z1).append(z[35]).append(z3).append(')').toString());
            if (z3 == z1)
            {
                return;
            }
            com.whatsapp.VoiceService.a(VoiceService.this, z3);
            if (z3 == this._fld0)
            {
                VoiceService.p(VoiceService.this).removeCallbacksAndMessages(null);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (z3 == this._fld0 || z3 == this._fld0)
            {
                VoiceService.p(VoiceService.this).removeCallbacksAndMessages(null);
                VoiceService.p(VoiceService.this).sendEmptyMessageDelayed(1, 20000L);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (z3 != this._fld0)
            {
                VoiceService.p(VoiceService.this).removeCallbacksAndMessages(null);
                VoiceService.p(VoiceService.this).sendEmptyMessageDelayed(0, 45000L);
                if (!z2._mth0())
                {
                    break label0;
                }
                VoiceService.p(VoiceService.this).sendEmptyMessageDelayed(2, 15000L);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (z3 == this._fld0)
            {
                VoiceService.p(VoiceService.this).removeCallbacksAndMessages(null);
            }
        }
        com.whatsapp.aa.a[z3._mth0()];
        JVM INSTR tableswitch 1 1: default 252
    //                   1 276;
           goto _L1 _L2
_L1:
        Message.obtain(com.whatsapp.VoiceService.a(VoiceService.this), 4, z1._mth0(), z3._mth0(), z2).sendToTarget();
        return;
_L2:
        if (android.os.k.this._fld0 >= 16)
        {
            startService(new Intent(z[34], null, VoiceService.this, com/whatsapp/VoiceService));
        }
        if (App.a9())
        {
            VoiceService.g(VoiceService.this);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void callTerminateReceived()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[14]).toString());
    }

    public void errorGatheringHostCandidates()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[48]).toString());
    }

    public byte[] getByteBuffer(int i)
    {
        return bufferQueue.a(i);
    }

    public void handleAcceptFailed()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[5]).toString());
        com.whatsapp.VoiceService.a(VoiceService.this, null);
    }

    public void handleOfferFailed()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[33]).toString());
        com.whatsapp.VoiceService.a(VoiceService.this, null);
    }

    public void incompatibleSrtpKeyExchange()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[12]).toString());
    }

    public void mediaStreamError()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[27]).toString());
        com.whatsapp.VoiceService.a(VoiceService.this, null);
    }

    public void mediaStreamStartError()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[24]).toString());
        com.whatsapp.VoiceService.a(VoiceService.this, null);
    }

    public void missingRelayInfo()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[10]).toString());
    }

    public void p2pNegotaitionFailed()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[32]).toString());
    }

    public void p2pNegotiationSuccess()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[31]).toString());
    }

    public void p2pTransportCreateFailed()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[26]).toString());
        com.whatsapp.VoiceService.a(VoiceService.this, null);
    }

    public void p2pTransportMediaCreateFailed()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[13]).toString());
        com.whatsapp.VoiceService.a(VoiceService.this, null);
    }

    public void p2pTransportRestartSuccess()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[38]).toString());
    }

    public void p2pTransportStartFailed()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[21]).toString());
        com.whatsapp.VoiceService.a(VoiceService.this, null);
    }

    public void relayBindsFailed()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[19]).toString());
    }

    public void relayCreateSuccess()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[6]).toString());
    }

    public void relayElectionSendFailed()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[15]).toString());
    }

    public void relayLatencySendFailed()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[22]).toString());
    }

    public void rtcpPacketReceived()
    {
    }

    public void rxTimeout()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[17]).toString());
        com.whatsapp.VoiceService.a(VoiceService.this, null);
    }

    public void rxTrafficStarted()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[18]).toString());
    }

    public void rxTrafficStopped()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[3]).toString());
    }

    public void sendAcceptFailed()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[11]).toString());
        w();
    }

    public void sendOfferFailed()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[37]).toString());
    }

    public void soundPortCreateFailed()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[46]).toString());
        com.whatsapp.VoiceService.a(VoiceService.this, null);
    }

    public void transportCandSendFailed()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[30]).toString());
    }

    public void txTimeout()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[2]).toString());
        com.whatsapp.VoiceService.a(VoiceService.this, null);
    }

    public void willCreateSoundPort()
    {
        Log.i((new StringBuilder()).append(getClass().getName()).append(z[40]).toString());
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[49];
        obj = "\005_GP\npZ@Y\024mYEY\017IYB";
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
                obj = "\005_GP\nvRRY\024MIVH\003[";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\005H^h\017RYII\022";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\005N^h\024^Z@U\005lHGS\026OYB";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\005]SX\017PoRN\003^QuH\007MHCX";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\005TGR\002SYg_\005ZLRz\007VPCX";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\005NCP\007F\177TY\007KYuI\005\\YUO";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\005_GP\nmYLY\005KnC_\003VJCXN";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "JRE]\nS]DP\003";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "]IUE";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\005QOO\025VRAn\003S]_u\bYS";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\005OCR\002~_EY\026KzGU\nZX";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\005UH_\tRLGH\017]PCo\024KLmY\037zDET\007Q[C";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\005L\024L2M]HO\026PNRq\003[UG\177\024Z]RY ^UJY\002";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\005_GP\nkYTQ\017Q]RY4Z_CU\020ZX";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\005NCP\007FyJY\005KUIR5ZRBz\007VPCX";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "\005_GP\n~_EY\026KzGU\nZX";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "\005N^h\017RYII\022";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "\005N^h\024^Z@U\005lHGN\022ZX";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "\005NCP\007F~OR\002LzGU\nZX";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "\005_GP\n~_EY\026KoCR\022";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "\005L\024L2M]HO\026PNRo\022^NRz\007VPCX";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "\005NCP\007FpGH\003Q__o\003QX`]\017SYB";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "\005]SX\017PuHU\022zNTS\024";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "\005QCX\017^oRN\003^QuH\007MHcN\024PN";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "\005_GP\nmYUI\013ZX";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "\005L\024L2M]HO\026PNR\177\024Z]RY ^UJY\002";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "\005QCX\017^oRN\003^QcN\024PN";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "\005_GP\npZ@Y\024lYHH";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "\005_GP\npZ@Y\024~_MY\002hURT4ZPGE/QZI";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "\005HT]\bLLIN\022|]HX5ZRBz\007VPCX";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "\005L\024L(Z[IH\017^HOS\blIE_\003LO";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "\005L\024L(Z[IH\017^HOS\by]OP\003[";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "\005TGR\002SYiZ\000ZN`]\017SYB";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "MY@N\003LTyR\tKU@U\005^HOS\b";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "\023\034";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 36;
                obj = "\005_GP\nlHGH\003|TGR\001ZX\016";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "\005OCR\002pZ@Y\024y]OP\003[";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i] = ((String) (obj));
                obj = "\005L\024L2M]HO\026PNRn\003LHGN\022lIE_\003LO";
                byte0 = 37;
                i = 38;
                break;

            case 37: // '%'
                as1[i] = ((String) (obj));
                i = 39;
                obj = "\005_GP\npZ@Y\024q]EW\003[";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i] = ((String) (obj));
                i = 40;
                obj = "\005KOP\n|NC]\022ZoII\b[lIN\022";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i] = ((String) (obj));
                i = 41;
                obj = "\\]H\034\bPH\006Z\017QX\006Q\003LOG[\003\037";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i] = ((String) (obj));
                i = 42;
                obj = "\005_GP\nzRBU\bX";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i] = ((String) (obj));
                i = 43;
                obj = "\\]JP9L_TY\003QcVN\003LYHH\003[";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i] = ((String) (obj));
                i = 44;
                obj = "HY\006]\024Z\034HS\022\037UH\034\007\037]EH\017IY\006_\007SP";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i] = ((String) (obj));
                i = 45;
                obj = "\005_GP\nzRBU\bX\034\016X\023M]RU\tQ\001";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i] = ((String) (obj));
                i = 46;
                obj = "\005OII\b[lIN\022|NC]\022ZzGU\nZX";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[i] = ((String) (obj));
                i = 47;
                obj = "\005_GP\n~_EY\026KnC_\003VJCX";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[i] = ((String) (obj));
                i = 48;
                obj = "\005YTN\tM{GH\016ZNOR\001wSUH%^RBU\002^HCO";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1160
    //                   0 1183
    //                   1 1190
    //                   2 1197
    //                   3 1204;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1204;
_L3:
        byte byte1 = 102;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 63;
          goto _L9
_L5:
        byte1 = 60;
          goto _L9
_L6:
        byte1 = 38;
          goto _L9
        byte1 = 60;
          goto _L9
    }

    public _cls9()
    {
        this$0 = VoiceService.this;
        super();
        bufferQueue = new ate();
    }
}
