// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class a extends Enum
{

    public static final a AUDIO_INIT_ERROR;
    public static final a CALL_ACCEPT_FAILED;
    public static final a HANDLE_ACCEPT_FAILED;
    public static final a HANDLE_OFFER_FAILED;
    public static final a INCOMPATIBLE_SRTP_KEY_EXCHANGE;
    public static final a INIT_MEDIA_STREAM_FAILED;
    public static final a P2P_TRANSPORT_CREATE_FAILED;
    public static final a P2P_TRANSPORT_MEDIA_CREATE_FAILED;
    public static final a P2P_TRANSPORT_START_FAILED;
    public static final a RELAY_BIND_FAILED;
    public static final a SOUND_PORT_CREATE_FAILED;
    public static final a SRTP_KEY_GENERATION_ERROR;
    public static final a START_MEDIA_STREAM_FAILED;
    public static final a UNKNOWN;
    public static final a UNSUPPORTED_AUDIO_CAPS;
    private static final a a[];
    private static final String z[];
    private final int b;

    private a(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/whatsapp/fieldstats/a, s);
    }

    public static a[] values()
    {
        return (a[])a.clone();
    }

    public int getCode()
    {
        return b;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[15];
        obj = "(qZhF*sUaI?oPeP'uR";
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
                obj = "8bBtF uO{^.~SvX?yYjF.bDkK";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "#qX`U.oYb_.bIbX\"|S`";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "9uZe@4r_j]4vWmU.t";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "#qX`U.oWgZ.`B{_*yZa]";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\"~_pF&uRmX4cBv\\*}IbX\"|S`";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = ">~]jV<~";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "8dWvM4}S`P*oEpK.q[{_*yZa]";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = ";\002F{M9qXwI$bB{Z9uWp\\4vWmU.t";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\"~UkT;qBm['uIwK?`Io\\2oS|Z#qXc\\";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "8\177Cj]4`YvM4sDaX?uIbX\"|S`";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = ";\002F{M9qXwI$bB{T.t_eF(bSeM.oPeP'uR";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = ">~EqI;\177Dp\\/oWq]\"\177IgX;c";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "*eRmV4yXmM4uDvV9";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = ";\002F{M9qXwI$bB{J?qDpF-q_h\\/";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                z = as;
                UNKNOWN = new a(z[6], 0, 1);
                CALL_ACCEPT_FAILED = new a(z[0], 1, 2);
                INIT_MEDIA_STREAM_FAILED = new a(z[5], 2, 3);
                START_MEDIA_STREAM_FAILED = new a(z[7], 3, 4);
                AUDIO_INIT_ERROR = new a(z[13], 4, 5);
                HANDLE_OFFER_FAILED = new a(z[2], 5, 6);
                HANDLE_ACCEPT_FAILED = new a(z[4], 6, 7);
                SOUND_PORT_CREATE_FAILED = new a(z[10], 7, 8);
                P2P_TRANSPORT_CREATE_FAILED = new a(z[8], 8, 9);
                P2P_TRANSPORT_MEDIA_CREATE_FAILED = new a(z[11], 9, 10);
                INCOMPATIBLE_SRTP_KEY_EXCHANGE = new a(z[9], 10, 11);
                SRTP_KEY_GENERATION_ERROR = new a(z[1], 11, 12);
                UNSUPPORTED_AUDIO_CAPS = new a(z[12], 12, 13);
                P2P_TRANSPORT_START_FAILED = new a(z[14], 13, 14);
                RELAY_BIND_FAILED = new a(z[3], 14, 15);
                a = (new a[] {
                    UNKNOWN, CALL_ACCEPT_FAILED, INIT_MEDIA_STREAM_FAILED, START_MEDIA_STREAM_FAILED, AUDIO_INIT_ERROR, HANDLE_OFFER_FAILED, HANDLE_ACCEPT_FAILED, SOUND_PORT_CREATE_FAILED, P2P_TRANSPORT_CREATE_FAILED, P2P_TRANSPORT_MEDIA_CREATE_FAILED, 
                    INCOMPATIBLE_SRTP_KEY_EXCHANGE, SRTP_KEY_GENERATION_ERROR, UNSUPPORTED_AUDIO_CAPS, P2P_TRANSPORT_START_FAILED, RELAY_BIND_FAILED
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 800
    //                   0 823
    //                   1 830
    //                   2 837
    //                   3 844;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_844;
_L3:
        byte byte1 = 25;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 107;
          goto _L9
_L5:
        byte1 = 48;
          goto _L9
_L6:
        byte1 = 22;
          goto _L9
        byte1 = 36;
          goto _L9
    }
}
