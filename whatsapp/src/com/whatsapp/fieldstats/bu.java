// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class bu extends Enum
{

    public static final bu ADDRESSBOOK_SYNC;
    public static final bu BACKUP;
    public static final bu BBX_BBID_CALL;
    public static final bu BBX_HUB_UPDATE_INBOX;
    public static final bu BROADCAST_FANOUT;
    public static final bu CALL;
    public static final bu CALL_OFFER;
    public static final bu CDB_GET;
    public static final bu CDB_REGENERATION;
    public static final bu CHAT_CONNECTION;
    public static final bu CONTACT_US_SESSION;
    public static final bu CRASH_LOG;
    public static final bu DATABASE_ERROR;
    public static final bu E2E_MESSAGE_RECV;
    public static final bu E2E_MESSAGE_SEND;
    public static final bu GROUP_MUTE;
    public static final bu IPHONE_BACKGROUND_FETCH;
    public static final bu IPHONE_FAILED_TO_LAUNCH;
    public static final bu I_CLOUD_AUTO_BACKUP_ERROR;
    public static final bu I_CLOUD_BACKUP;
    public static final bu I_CLOUD_RESTORE;
    public static final bu LOCATION_PICKER;
    public static final bu LOGIN;
    public static final bu MEDIA_DOWNLOAD;
    public static final bu MEDIA_UPLOAD;
    public static final bu MESSAGE_RECEIVE;
    public static final bu MESSAGE_SEND;
    public static final bu MMD_DOWNLOAD;
    public static final bu OFFLINE_MESSAGES;
    public static final bu PAY_CHURN;
    public static final bu PAY_FREE_EXTENSION;
    public static final bu PAY_PAYMENT;
    public static final bu PROFILE_PIC_UPLOAD;
    public static final bu PTT;
    public static final bu PUSH_RECEIVE;
    public static final bu RECEIPTS_RECV;
    public static final bu RECEIPTS_SEND;
    public static final bu REG_CODE;
    public static final bu REG_EXIST;
    public static final bu REG_REGISTER;
    public static final bu RESTORE;
    public static final bu SUPPORT_EMAIL;
    public static final bu UI_ACTION;
    public static final bu UI_USAGE;
    private static final bu b[];
    private static final String z[];
    private final int a;

    private bu(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static bu valueOf(String s)
    {
        return (bu)Enum.valueOf(com/whatsapp/fieldstats/bu, s);
    }

    public static bu[] values()
    {
        return (bu[])b.clone();
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
        as = new String[44];
        obj = "@bYW\000JnM\\";
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
                i = 1;
                obj = "BrM@\032@b]M\fDb";
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "@b]M\fBsMW\026WiZ";
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "_bZA\004McQ_\013^h_L";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "]aXD\f\\bAE\000At_O\000A";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "BfGW\003@b[W\000Js[F\026[hP";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "W\025[W\bWtMI\002WxMM\013V";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "[x]D\nGcAJ\004QlKX";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                obj = "W\025[W\bWtMI\002WxLM\006D";
                byte0 = 7;
                i = 8;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "[x]D\nGcAZ\000AsQZ\0";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "QfRD";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "Qc\\W\002Ws";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "_bM[\004UbA[\000\\c";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "GnA]\026S`[";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "Qo_\\\032QhPF\000QsWG\013";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "[x]D\nGcAI\020FhAJ\004QlKX\032WuLG\027";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "ScZZ\000At\\G\nYxMQ\013Q";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "[wVG\013Wx\\I\006Y`LG\020\\cAN\000FdV";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                obj = "_jZW\001]pPD\nSc";
                byte0 = 17;
                i = 18;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "BfGW\006ZrLF";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "BsJ";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "QfRD\032]aXM\027";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "UuQ]\025MjK\\\0";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "^h]I\021[hPW\025[dUM\027";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "BfGW\025S~SM\013F";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "_bZA\004MrND\nSc";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "@bYW\027W`W[\021Wu";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "Pf]C\020B";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "[wVG\013WxXI\f^bZW\021]xRI\020\\dV";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "BuQN\f^bAX\fQxKX\t]fZ";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                obj = "QhP\\\004QsA]\026Mt[[\026[hP";
                byte0 = 29;
                i = 30;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "PeFW\rGeA]\025VfJM\032[i\\G\035";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "@bYW\006]c[";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "Qc\\W\027W`[F\000@fJA\n\\";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "@bM\\\n@b";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "Qu_[\rMkQO";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 36;
                obj = "^hYA\013";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "_bM[\004UbAZ\000QbW^\0";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 38;
                obj = "PuQI\001QfM\\\032TfPG\020F";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i] = ((String) (obj));
                obj = "@b]M\fBsMW\027WdH";
                byte0 = 38;
                i = 39;
                break;

            case 38: // '&'
                as1[i] = ((String) (obj));
                i = 40;
                obj = "PeFW\007PnZW\006SkR";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i] = ((String) (obj));
                i = 41;
                obj = "ArNX\n@sAM\bSnR";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i] = ((String) (obj));
                i = 42;
                obj = "VfJI\007St[W\000@uQZ";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i] = ((String) (obj));
                i = 43;
                obj = "GnAI\006FnQF";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i] = ((String) (obj));
                z = as;
                ADDRESSBOOK_SYNC = new bu(z[16], 0, 31);
                BACKUP = new bu(z[27], 1, 41);
                BBX_BBID_CALL = new bu(z[40], 2, 20);
                BBX_HUB_UPDATE_INBOX = new bu(z[31], 3, 19);
                BROADCAST_FANOUT = new bu(z[38], 4, 28);
                CALL = new bu(z[10], 5, 15);
                CALL_OFFER = new bu(z[21], 6, 16);
                CDB_GET = new bu(z[11], 7, 27);
                CDB_REGENERATION = new bu(z[33], 8, 26);
                CHAT_CONNECTION = new bu(z[14], 9, 40);
                CONTACT_US_SESSION = new bu(z[30], 10, 25);
                CRASH_LOG = new bu(z[35], 11, 32);
                DATABASE_ERROR = new bu(z[42], 12, 37);
                E2E_MESSAGE_RECV = new bu(z[8], 13, 24);
                E2E_MESSAGE_SEND = new bu(z[6], 14, 23);
                GROUP_MUTE = new bu(z[22], 15, 17);
                I_CLOUD_AUTO_BACKUP_ERROR = new bu(z[15], 16, 36);
                I_CLOUD_BACKUP = new bu(z[7], 17, 21);
                I_CLOUD_RESTORE = new bu(z[9], 18, 35);
                IPHONE_BACKGROUND_FETCH = new bu(z[17], 19, 38);
                IPHONE_FAILED_TO_LAUNCH = new bu(z[28], 20, 39);
                LOCATION_PICKER = new bu(z[23], 21, 43);
                LOGIN = new bu(z[36], 22, 14);
                MEDIA_DOWNLOAD = new bu(z[3], 23, 12);
                MEDIA_UPLOAD = new bu(z[25], 24, 11);
                MESSAGE_RECEIVE = new bu(z[37], 25, 10);
                MESSAGE_SEND = new bu(z[12], 26, 9);
                MMD_DOWNLOAD = new bu(z[18], 27, 8);
                OFFLINE_MESSAGES = new bu(z[4], 28, 30);
                PAY_CHURN = new bu(z[19], 29, 6);
                PAY_FREE_EXTENSION = new bu(z[5], 30, 5);
                PAY_PAYMENT = new bu(z[24], 31, 4);
                PROFILE_PIC_UPLOAD = new bu(z[29], 32, 18);
                PTT = new bu(z[20], 33, 13);
                PUSH_RECEIVE = new bu(z[1], 34, 44);
                RECEIPTS_RECV = new bu(z[39], 35, 33);
                RECEIPTS_SEND = new bu(z[2], 36, 34);
                REG_CODE = new bu(z[32], 37, 2);
                REG_EXIST = new bu(z[0], 38, 1);
                REG_REGISTER = new bu(z[26], 39, 3);
                RESTORE = new bu(z[34], 40, 42);
                SUPPORT_EMAIL = new bu(z[41], 41, 7);
                UI_ACTION = new bu(z[43], 42, 22);
                UI_USAGE = new bu(z[13], 43, 29);
                b = (new bu[] {
                    ADDRESSBOOK_SYNC, BACKUP, BBX_BBID_CALL, BBX_HUB_UPDATE_INBOX, BROADCAST_FANOUT, CALL, CALL_OFFER, CDB_GET, CDB_REGENERATION, CHAT_CONNECTION, 
                    CONTACT_US_SESSION, CRASH_LOG, DATABASE_ERROR, E2E_MESSAGE_RECV, E2E_MESSAGE_SEND, GROUP_MUTE, I_CLOUD_AUTO_BACKUP_ERROR, I_CLOUD_BACKUP, I_CLOUD_RESTORE, IPHONE_BACKGROUND_FETCH, 
                    IPHONE_FAILED_TO_LAUNCH, LOCATION_PICKER, LOGIN, MEDIA_DOWNLOAD, MEDIA_UPLOAD, MESSAGE_RECEIVE, MESSAGE_SEND, MMD_DOWNLOAD, OFFLINE_MESSAGES, PAY_CHURN, 
                    PAY_FREE_EXTENSION, PAY_PAYMENT, PROFILE_PIC_UPLOAD, PTT, PUSH_RECEIVE, RECEIPTS_RECV, RECEIPTS_SEND, REG_CODE, REG_EXIST, REG_REGISTER, 
                    RESTORE, SUPPORT_EMAIL, UI_ACTION, UI_USAGE
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 2224
    //                   0 2247
    //                   1 2254
    //                   2 2261
    //                   3 2268;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_2268;
_L3:
        byte byte1 = 69;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 18;
          goto _L9
_L5:
        byte1 = 39;
          goto _L9
_L6:
        byte1 = 30;
          goto _L9
        byte1 = 8;
          goto _L9
    }
}
