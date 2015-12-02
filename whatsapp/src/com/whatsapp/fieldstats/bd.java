// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class bd extends Enum
{

    public static final bd ADDRESSBOOK_SYNC;
    public static final bd BACKUP;
    public static final bd BBX_BBID_CALL;
    public static final bd BBX_HUB_UPDATE_INBOX;
    public static final bd BROADCAST_FANOUT;
    public static final bd CALL;
    public static final bd CALL_OFFER;
    public static final bd CDB_GET;
    public static final bd CDB_REGENERATION;
    public static final bd CHAT_CONNECTION;
    public static final bd CONTACT_US_SESSION;
    public static final bd CRASH_LOG;
    public static final bd DATABASE_ERROR;
    public static final bd E2E_MESSAGE_RECV;
    public static final bd E2E_MESSAGE_SEND;
    public static final bd GROUP_MUTE;
    public static final bd IPHONE_BACKGROUND_FETCH;
    public static final bd IPHONE_FAILED_TO_LAUNCH;
    public static final bd I_CLOUD_AUTO_BACKUP_ERROR;
    public static final bd I_CLOUD_BACKUP;
    public static final bd I_CLOUD_RESTORE;
    public static final bd LOCATION_PICKER;
    public static final bd LOGIN;
    public static final bd MEDIA_DOWNLOAD;
    public static final bd MEDIA_UPLOAD;
    public static final bd MESSAGE_RECEIVE;
    public static final bd MESSAGE_SEND;
    public static final bd MMD_DOWNLOAD;
    public static final bd OFFLINE_MESSAGES;
    public static final bd PAY_CHURN;
    public static final bd PAY_FREE_EXTENSION;
    public static final bd PAY_PAYMENT;
    public static final bd PROFILE_PIC_UPLOAD;
    public static final bd PTT;
    public static final bd PUSH_RECEIVE;
    public static final bd RECEIPTS_RECV;
    public static final bd RECEIPTS_SEND;
    public static final bd REG_CODE;
    public static final bd REG_EXIST;
    public static final bd REG_REGISTER;
    public static final bd RESTORE;
    public static final bd SUPPORT_EMAIL;
    public static final bd UI_ACTION;
    public static final bd UI_USAGE;
    private static final bd b[];
    private static final String z[];
    private final int a;

    private bd(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static bd valueOf(String s)
    {
        return (bd)Enum.valueOf(com/whatsapp/fieldstats/bd, s);
    }

    public static bd[] values()
    {
        return (bd[])b.clone();
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
        obj = "a\004,\0255m\013&\0338c\0236\025.f\020;\034>|\027,";
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
                obj = "z\0217\0164z\021";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "z\021#\005>p\0357\016";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "k\020&\005)m\023!\024>z\0250\0234f";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "a\013'\0264}\020;\b>{\000+\b>";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "j\006+\033?k\0257\016$n\025*\025.|";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "e\0217\t:o\021;\b>k\021-\f>";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "k\020&\005<m\0";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "i\020 \b>{\007&\0254c\0137\0035k";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "k\033*\016:k\000;\017(w\007!\t(a\033*";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "e\021 \023:w\020+\r5d\033%\036";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "mf!\0056m\0077\033<m\0136\0378~";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "e\031 \005?g\003*\0264i\020";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "z\021#\0058g\020!";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "a\013'\0264}\020;\030:k\0371\n";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "z\021'\0372x\0007\005)m\0272";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "z\021'\0372x\0007\005(m\032 ";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "x\025=\005=z\021!\005>p\000!\024(a\033*";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "d\033#\0235";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "k\006%\t3w\030+\035";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "k\025(\026";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "}\035;\0338|\035+\024";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "x\0000";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "j\026<\0059j\035 \0058i\030(";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "o\006+\017+w\0311\016>";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "e\021 \023:w\0014\0264i\020";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "a\013'\0264}\020;\033.|\033;\030:k\0371\n$m\0066\025)";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "x\0017\022$z\021'\0372~\021";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "e\0217\t:o\021;\t>f\020";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "k\034%\016$k\033*\024>k\000-\0255";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "x\025=\005+i\r)\0375|";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "d\033'\033/a\033*\005+a\027/\037)";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "x\025=\0058`\0016\024";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "j\026<\0053}\026;\017+l\0250\037$a\032&\025#";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "a\004,\0255m\013\"\0332d\021 \005/g\013(\033.f\027,";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "mf!\0056m\0077\033<m\0137\0375l";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 36;
                obj = "l\0250\0339i\007!\005>z\006+\b";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "{\0014\n4z\000;\0376i\035(";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 38;
                obj = "x\006+\0342d\021;\n2k\0131\n7g\025 ";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i] = ((String) (obj));
                i = 39;
                obj = "z\021#\005)m\023-\t/m\006";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i] = ((String) (obj));
                obj = "g\022\"\0262f\021;\027>{\007%\035>{";
                byte0 = 39;
                i = 40;
                break;

            case 39: // '\''
                as1[i] = ((String) (obj));
                i = 41;
                obj = "}\035;\017(i\023!";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i] = ((String) (obj));
                i = 42;
                obj = "k\025(\026$g\022\"\037)";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i] = ((String) (obj));
                i = 43;
                obj = "j\025'\021.x";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i] = ((String) (obj));
                z = as;
                ADDRESSBOOK_SYNC = new bd(z[8], 0, 31);
                BACKUP = new bd(z[43], 1, 41);
                BBX_BBID_CALL = new bd(z[23], 2, 20);
                BBX_HUB_UPDATE_INBOX = new bd(z[33], 3, 19);
                BROADCAST_FANOUT = new bd(z[5], 4, 28);
                CALL = new bd(z[20], 5, 15);
                CALL_OFFER = new bd(z[42], 6, 16);
                CDB_GET = new bd(z[7], 7, 27);
                CDB_REGENERATION = new bd(z[3], 8, 26);
                CHAT_CONNECTION = new bd(z[29], 9, 40);
                CONTACT_US_SESSION = new bd(z[9], 10, 25);
                CRASH_LOG = new bd(z[19], 11, 32);
                DATABASE_ERROR = new bd(z[36], 12, 37);
                E2E_MESSAGE_RECV = new bd(z[11], 13, 24);
                E2E_MESSAGE_SEND = new bd(z[35], 14, 23);
                GROUP_MUTE = new bd(z[24], 15, 17);
                I_CLOUD_AUTO_BACKUP_ERROR = new bd(z[26], 16, 36);
                I_CLOUD_BACKUP = new bd(z[14], 17, 21);
                I_CLOUD_RESTORE = new bd(z[4], 18, 35);
                IPHONE_BACKGROUND_FETCH = new bd(z[0], 19, 38);
                IPHONE_FAILED_TO_LAUNCH = new bd(z[34], 20, 39);
                LOCATION_PICKER = new bd(z[31], 21, 43);
                LOGIN = new bd(z[18], 22, 14);
                MEDIA_DOWNLOAD = new bd(z[10], 23, 12);
                MEDIA_UPLOAD = new bd(z[25], 24, 11);
                MESSAGE_RECEIVE = new bd(z[6], 25, 10);
                MESSAGE_SEND = new bd(z[28], 26, 9);
                MMD_DOWNLOAD = new bd(z[12], 27, 8);
                OFFLINE_MESSAGES = new bd(z[40], 28, 30);
                PAY_CHURN = new bd(z[32], 29, 6);
                PAY_FREE_EXTENSION = new bd(z[17], 30, 5);
                PAY_PAYMENT = new bd(z[30], 31, 4);
                PROFILE_PIC_UPLOAD = new bd(z[38], 32, 18);
                PTT = new bd(z[22], 33, 13);
                PUSH_RECEIVE = new bd(z[27], 34, 44);
                RECEIPTS_RECV = new bd(z[15], 35, 33);
                RECEIPTS_SEND = new bd(z[16], 36, 34);
                REG_CODE = new bd(z[13], 37, 2);
                REG_EXIST = new bd(z[2], 38, 1);
                REG_REGISTER = new bd(z[39], 39, 3);
                RESTORE = new bd(z[1], 40, 42);
                SUPPORT_EMAIL = new bd(z[37], 41, 7);
                UI_ACTION = new bd(z[21], 42, 22);
                UI_USAGE = new bd(z[41], 43, 29);
                b = (new bd[] {
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
        byte byte1 = 123;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 40;
          goto _L9
_L5:
        byte1 = 84;
          goto _L9
_L6:
        byte1 = 100;
          goto _L9
        byte1 = 90;
          goto _L9
    }
}
