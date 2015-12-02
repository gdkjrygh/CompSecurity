// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class al extends Enum
{

    public static final al AIRTEL;
    public static final al ALFA;
    public static final al BANGLALINK;
    public static final al BEELINE;
    public static final al BICS;
    public static final al CELLC;
    public static final al CLARO;
    public static final al CLICKATELL;
    public static final al COSMOTE;
    public static final al DIGI;
    public static final al DJEZZY;
    public static final al DONT_SEND_SMS;
    public static final al DONT_SEND_VOICE;
    public static final al EMAILONLY;
    public static final al ETB;
    public static final al HIGHSIDE;
    public static final al HTHK;
    public static final al IMESSAGE;
    public static final al INDOSAT;
    public static final al INFOBIP;
    public static final al INFOBIPSMS;
    public static final al JAWWAL;
    public static final al MACH;
    public static final al MBLOX;
    public static final al MIO;
    public static final al MOBILY;
    public static final al MOBME;
    public static final al MOVISTAR;
    public static final al MTN;
    public static final al NAWRAS;
    public static final al NEXMO;
    public static final al NEXMOVOICE;
    public static final al OMANTEL;
    public static final al PERSONAL;
    public static final al PLIVO;
    public static final al ROUTO;
    public static final al ROUTOSMS;
    public static final al SELF;
    public static final al SMSGATEWAY;
    public static final al SMSGATEWAY2;
    public static final al SUNRISE;
    public static final al SYBASE;
    public static final al SYNIVERSE;
    public static final al TELENOR;
    public static final al TELESIGNSMS;
    public static final al TELESIGNVOICE;
    public static final al TIGO;
    public static final al TIM;
    public static final al TOUCH;
    public static final al TROPO;
    public static final al TWILIO;
    public static final al TWILIO2;
    public static final al TWILIOSMS;
    public static final al TWILIOSMS2;
    public static final al TYNTEC;
    public static final al UFONE;
    public static final al VEXX;
    public static final al VIETTEL;
    public static final al VOICEWORKS;
    public static final al WEBAROO;
    public static final al XL;
    private static final al b[];
    private static final String z[];
    private final int a;

    private al(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static al valueOf(String s)
    {
        return (al)Enum.valueOf(com/whatsapp/fieldstats/al, s);
    }

    public static al[] values()
    {
        return (al[])b.clone();
    }

    public int getCode()
    {
        return a;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[61];
        obj = "\006\036\025\023\b\f\035\030\003";
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
                obj = "\t\022\003\r\005\017";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\027\032\031";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\f\036\025\024\020\006\037";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\025\032\021\016\020\006\037";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\n\035\020\025\027\002\007";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\016\034\026\023\b\032";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\000\037\025\b\013";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\001\032\027\t";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\n\035\022\025\006\n\003";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\r\026\f\027\013\025\034\035\031\001";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\027\n\032\016\001\0";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\016\032\033";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\016\021\030\025\034";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\n\036\021\t\027\002\024\021";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\006\007\026";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "\027\026\030\037\027\n\024\032\f\013\n\020\021";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "\020\036\007\035\005\027\026\003\033\035";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "\007\031\021\000\036\032";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "\027\001\033\n\013";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "\024\026\026\033\026\f\034";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "\000\037\035\031\017\002\007\021\026\b";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "\001\022\032\035\b\002\037\035\024\017";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "\026\025\033\024\001";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "\027\032\023\025";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "\021\034\001\016\013\020\036\007";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "\025\034\035\031\001\024\034\006\021\027";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "\013\032\023\022\027\n\027\021";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "\027\004\035\026\r\f\000\031\t";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "\023\037\035\f\013";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "\002\032\006\016\001\017";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "\027\034\001\031\f";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "\027\026\030\037\027\n\024\032\t\t\020";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "\016\022\027\022";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "\027\004\035\026\r\fa";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "\020\n\026\033\027\006";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 36;
                obj = "\020\n\032\023\022\006\001\007\037";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "\002\037\022\033";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 38;
                obj = "\007\034\032\016\033\020\026\032\036\033\020\036\007";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i] = ((String) (obj));
                i = 39;
                obj = "\027\004\035\026\r\f\000\031\tv";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i] = ((String) (obj));
                i = 40;
                obj = "\007\034\032\016\033\020\026\032\036\033\025\034\035\031\001";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i] = ((String) (obj));
                i = 41;
                obj = "\020\026\030\034";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i] = ((String) (obj));
                i = 42;
                obj = "\016\034\002\023\027\027\022\006";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i] = ((String) (obj));
                i = 43;
                obj = "\r\026\f\027\013";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i] = ((String) (obj));
                i = 44;
                obj = "\020\006\032\b\r\020\026";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i] = ((String) (obj));
                i = 45;
                obj = "\013\007\034\021";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i] = ((String) (obj));
                i = 46;
                obj = "\027\004\035\026\r\f";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[i] = ((String) (obj));
                i = 47;
                obj = "\016\007\032";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[i] = ((String) (obj));
                i = 48;
                obj = "\n\035\022\025\006\n\003\007\027\027";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[i] = ((String) (obj));
                i = 49;
                obj = "\021\034\001\016\013";
                byte0 = 48;
                break;

            case 48: // '0'
                as1[i] = ((String) (obj));
                i = 50;
                obj = "\016\034\026\027\001";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[i] = ((String) (obj));
                i = 51;
                obj = "\000\026\030\026\007";
                byte0 = 50;
                break;

            case 50: // '2'
                as1[i] = ((String) (obj));
                i = 52;
                obj = "\027\026\030\037\n\f\001";
                byte0 = 51;
                break;

            case 51: // '3'
                as1[i] = ((String) (obj));
                i = 53;
                obj = "\025\026\f\002";
                byte0 = 52;
                break;

            case 52: // '4'
                as1[i] = ((String) (obj));
                i = 54;
                obj = "\000\034\007\027\013\027\026";
                byte0 = 53;
                break;

            case 53: // '5'
                as1[i] = ((String) (obj));
                i = 55;
                obj = "\007\032\023\023";
                byte0 = 54;
                break;

            case 54: // '6'
                as1[i] = ((String) (obj));
                i = 56;
                obj = "\r\022\003\b\005\020";
                byte0 = 55;
                break;

            case 55: // '7'
                as1[i] = ((String) (obj));
                i = 57;
                obj = "\020\036\007\035\005\027\026\003\033\035q";
                byte0 = 56;
                break;

            case 56: // '8'
                as1[i] = ((String) (obj));
                i = 58;
                obj = "\033\037";
                byte0 = 57;
                break;

            case 57: // '9'
                as1[i] = ((String) (obj));
                i = 59;
                obj = "\001\026\021\026\r\r\026";
                byte0 = 58;
                break;

            case 58: // ':'
                as1[i] = ((String) (obj));
                i = 60;
                obj = "\023\026\006\t\013\r\022\030";
                byte0 = 59;
                break;

            case 59: // ';'
                as1[i] = ((String) (obj));
                z = as;
                SELF = new al(z[41], 0, 0);
                CLICKATELL = new al(z[21], 1, 1);
                SYBASE = new al(z[35], 2, 2);
                SMSGATEWAY = new al(z[17], 3, 3);
                TROPO = new al(z[19], 4, 4);
                ROUTO = new al(z[49], 5, 5);
                INFOBIP = new al(z[9], 6, 6);
                ROUTOSMS = new al(z[25], 7, 7);
                TWILIO = new al(z[46], 8, 8);
                INFOBIPSMS = new al(z[48], 9, 9);
                TWILIOSMS = new al(z[28], 10, 10);
                NEXMO = new al(z[43], 11, 11);
                EMAILONLY = new al(z[0], 12, 12);
                INDOSAT = new al(z[5], 13, 13);
                MIO = new al(z[12], 14, 14);
                UFONE = new al(z[23], 15, 15);
                NAWRAS = new al(z[56], 16, 16);
                VOICEWORKS = new al(z[26], 17, 17);
                HTHK = new al(z[45], 18, 18);
                DIGI = new al(z[55], 19, 19);
                AIRTEL = new al(z[30], 20, 20);
                SMSGATEWAY2 = new al(z[57], 21, 21);
                XL = new al(z[58], 22, 22);
                TELESIGNVOICE = new al(z[16], 23, 23);
                MOBILY = new al(z[6], 24, 24);
                OMANTEL = new al(z[3], 25, 25);
                PLIVO = new al(z[29], 26, 26);
                TYNTEC = new al(z[11], 27, 27);
                MACH = new al(z[33], 28, 28);
                TELESIGNSMS = new al(z[32], 29, 29);
                HIGHSIDE = new al(z[27], 30, 30);
                IMESSAGE = new al(z[14], 31, 31);
                TWILIO2 = new al(z[34], 32, 32);
                TELENOR = new al(z[52], 33, 33);
                CLARO = new al(z[7], 34, 34);
                ALFA = new al(z[37], 35, 35);
                BANGLALINK = new al(z[22], 36, 36);
                MTN = new al(z[47], 37, 37);
                MOBME = new al(z[50], 38, 38);
                COSMOTE = new al(z[54], 39, 39);
                SUNRISE = new al(z[44], 40, 40);
                VEXX = new al(z[53], 41, 41);
                TOUCH = new al(z[31], 42, 42);
                DJEZZY = new al(z[18], 43, 43);
                MOVISTAR = new al(z[42], 44, 44);
                JAWWAL = new al(z[1], 45, 45);
                TWILIOSMS2 = new al(z[39], 46, 46);
                VIETTEL = new al(z[4], 47, 47);
                PERSONAL = new al(z[60], 48, 48);
                BEELINE = new al(z[59], 49, 49);
                TIGO = new al(z[24], 50, 50);
                ETB = new al(z[15], 51, 51);
                CELLC = new al(z[51], 52, 52);
                WEBAROO = new al(z[20], 53, 53);
                TIM = new al(z[2], 54, 54);
                NEXMOVOICE = new al(z[10], 55, 55);
                SYNIVERSE = new al(z[36], 56, 56);
                BICS = new al(z[8], 57, 57);
                MBLOX = new al(z[13], 58, 58);
                DONT_SEND_SMS = new al(z[38], 59, 98);
                DONT_SEND_VOICE = new al(z[40], 60, 99);
                b = (new al[] {
                    SELF, CLICKATELL, SYBASE, SMSGATEWAY, TROPO, ROUTO, INFOBIP, ROUTOSMS, TWILIO, INFOBIPSMS, 
                    TWILIOSMS, NEXMO, EMAILONLY, INDOSAT, MIO, UFONE, NAWRAS, VOICEWORKS, HTHK, DIGI, 
                    AIRTEL, SMSGATEWAY2, XL, TELESIGNVOICE, MOBILY, OMANTEL, PLIVO, TYNTEC, MACH, TELESIGNSMS, 
                    HIGHSIDE, IMESSAGE, TWILIO2, TELENOR, CLARO, ALFA, BANGLALINK, MTN, MOBME, COSMOTE, 
                    SUNRISE, VEXX, TOUCH, DJEZZY, MOVISTAR, JAWWAL, TWILIOSMS2, VIETTEL, PERSONAL, BEELINE, 
                    TIGO, ETB, CELLC, WEBAROO, TIM, NEXMOVOICE, SYNIVERSE, BICS, MBLOX, DONT_SEND_SMS, 
                    DONT_SEND_VOICE
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 3056
    //                   0 3079
    //                   1 3086
    //                   2 3093
    //                   3 3100;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_3100;
_L3:
        byte byte1 = 68;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 67;
          goto _L9
_L5:
        byte1 = 83;
          goto _L9
_L6:
        byte1 = 84;
          goto _L9
        byte1 = 90;
          goto _L9
    }
}
