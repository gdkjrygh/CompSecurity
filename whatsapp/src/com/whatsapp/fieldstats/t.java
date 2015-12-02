// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class t extends Enum
{

    public static final t ABORT;
    public static final t AUTH;
    public static final t BUSY;
    public static final t CANTOPEN;
    public static final t CONSTRAINT;
    public static final t CORRUPT;
    public static final t DONE;
    public static final t EMPTY;
    public static final t ERROR;
    public static final t FORMAT;
    public static final t FULL;
    public static final t INTERNAL;
    public static final t INTERRUPT;
    public static final t IOERR;
    public static final t LOCKED;
    public static final t MISMATCH;
    public static final t MISUSE;
    public static final t NOLFS;
    public static final t NOMEM;
    public static final t NOTADB;
    public static final t NOTFOUND;
    public static final t NOTICE;
    public static final t OK;
    public static final t PERM;
    public static final t PROTOCOL;
    public static final t RANGE;
    public static final t READONLY;
    public static final t ROW;
    public static final t SCHEMA;
    public static final t TOOBIG;
    public static final t WARNING;
    private static final t a[];
    private static final String z[];
    private final int b;

    private t(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static t valueOf(String s)
    {
        return (t)Enum.valueOf(com/whatsapp/fieldstats/t, s);
    }

    public static t[] values()
    {
        return (t[])a.clone();
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
        as = new String[31];
        obj = "{H\021\026&";
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
                obj = "jX\021\020=yE\022";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\177G\016\020+";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "tE\023\001?";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "yE\020\027&hK\027\n&";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "wC\r\t3nI\026";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "tE\022\002!";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "|E\f\t3n";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "vE\035\0177~";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "sD\n\001 tK\022";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                obj = "nE\021\006;}";
                byte0 = 9;
                i = 10;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "tE\n\002=oD\032";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "yK\020\020=jO\020";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\177X\f\013 ";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "uA";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "tE\n\r1\177";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "{_\n\f";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "sE\033\026 ";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "|_\022\b";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "wC\r\021!\177";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "yE\f\026'j^";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "tE\n\0056x";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "jO\f\t";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "hE\t";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "hO\037\000=tF\007";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "mK\f\n;tM";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "sD\n\001 h_\016\020";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "x_\r\035";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "iI\026\001?{";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "~E\020\001";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "hK\020\0037";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                z = as;
                OK = new t(z[14], 0, 0);
                ERROR = new t(z[13], 1, 1);
                INTERNAL = new t(z[9], 2, 2);
                PERM = new t(z[22], 3, 3);
                ABORT = new t(z[0], 4, 4);
                BUSY = new t(z[27], 5, 5);
                LOCKED = new t(z[8], 6, 6);
                NOMEM = new t(z[3], 7, 7);
                READONLY = new t(z[24], 8, 8);
                INTERRUPT = new t(z[26], 9, 9);
                IOERR = new t(z[17], 10, 10);
                CORRUPT = new t(z[20], 11, 11);
                NOTFOUND = new t(z[11], 12, 12);
                FULL = new t(z[18], 13, 13);
                CANTOPEN = new t(z[12], 14, 14);
                PROTOCOL = new t(z[1], 15, 15);
                EMPTY = new t(z[2], 16, 16);
                SCHEMA = new t(z[28], 17, 17);
                TOOBIG = new t(z[10], 18, 18);
                CONSTRAINT = new t(z[4], 19, 19);
                MISMATCH = new t(z[5], 20, 20);
                MISUSE = new t(z[19], 21, 21);
                NOLFS = new t(z[6], 22, 22);
                AUTH = new t(z[16], 23, 23);
                FORMAT = new t(z[7], 24, 24);
                RANGE = new t(z[30], 25, 25);
                NOTADB = new t(z[21], 26, 26);
                NOTICE = new t(z[15], 27, 27);
                WARNING = new t(z[25], 28, 28);
                ROW = new t(z[23], 29, 100);
                DONE = new t(z[29], 30, 101);
                a = (new t[] {
                    OK, ERROR, INTERNAL, PERM, ABORT, BUSY, LOCKED, NOMEM, READONLY, INTERRUPT, 
                    IOERR, CORRUPT, NOTFOUND, FULL, CANTOPEN, PROTOCOL, EMPTY, SCHEMA, TOOBIG, CONSTRAINT, 
                    MISMATCH, MISUSE, NOLFS, AUTH, FORMAT, RANGE, NOTADB, NOTICE, WARNING, ROW, 
                    DONE
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1584
    //                   0 1607
    //                   1 1614
    //                   2 1621
    //                   3 1628;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1628;
_L3:
        byte byte1 = 114;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 58;
          goto _L9
_L5:
        byte1 = 10;
          goto _L9
_L6:
        byte1 = 94;
          goto _L9
        byte1 = 68;
          goto _L9
    }
}
