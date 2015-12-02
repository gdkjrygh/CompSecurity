// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c_, VoipOptions

public final class framesPerPacket
{

    private static final String z[];
    public final Short complexity;
    public final Boolean disableRateControl;
    public final Boolean enableConstantBitrate;
    public final Boolean enableDiscontinuousTransmission;
    public final Boolean forwardErrorCorrection;
    public final Integer framesPerPacket;
    public final Integer targetBitrate;

    public static framesPerPacket fromProtocolTreeNode(c_ c_1)
    {
        if (c_1 == null)
        {
            return null;
        }
        Object obj1 = c_1.d(z[15]);
        Object obj2 = c_1.d(z[16]);
        Object obj4 = c_1.d(z[12]);
        String s1 = c_1.d(z[7]);
        Object obj3 = c_1.d(z[9]);
        Object obj = c_1.d(z[11]);
        String s = c_1.d(z[13]);
        obj1 = VoipOptions.access$100(((String) (obj1)), z[8], 1, 10);
        obj2 = VoipOptions.access$200(((String) (obj2)));
        obj4 = VoipOptions.access$200(((String) (obj4)));
        if (z[17].equals(s1))
        {
            c_1 = null;
        } else
        {
            c_1 = VoipOptions.access$300(s1, z[10], 6000, 51000);
        }
        obj3 = VoipOptions.access$200(((String) (obj3)));
        if (obj == null)
        {
            obj = null;
        } else
        {
            boolean flag;
            if (!VoipOptions.access$200(((String) (obj))).booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        }
        return new <init>(((Short) (obj1)), ((Boolean) (obj2)), ((Boolean) (obj4)), c_1, ((Boolean) (obj3)), ((Boolean) (obj)), VoipOptions.access$300(s, z[14], 0, 8));
    }

    public String toString()
    {
        return (new StringBuilder()).append(z[1]).append(complexity).append(z[3]).append(enableConstantBitrate).append(z[6]).append(enableDiscontinuousTransmission).append(z[4]).append(targetBitrate).append(z[5]).append(forwardErrorCorrection).append(z[2]).append(disableRateControl).append(z[0]).append(framesPerPacket).append('}').toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[18];
        obj = "_L\t-\007\036\t\034\017\003\001<\016<\r\026\030R";
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
                obj = "6\002\f0\002\026\027\f0\013\003\000\n'\017\007\025R";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "_L\0136\025\022\016\003:4\022\030\n\034\t\035\030\0350\nN";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "_L\n1\007\021\000\n\034\t\035\037\033>\b\007.\006+\024\022\030\nb";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "_L\033>\024\024\t\033\035\017\007\036\016+\003N";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "_L\t0\024\004\r\035;#\001\036\000-%\034\036\035:\005\007\005\0001[";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "_L\n1\007\021\000\n\033\017\000\017\0001\022\032\002\0320\023\0008\035>\b\000\001\006,\025\032\003\001b";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\021\005\033-\007\007\t";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\020\003\002/\n\026\024\006+\037";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\025\t\f";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\021\005\033-\007\007\t";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\001\r\033:\005\034\002\033-\t\037";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\027\030\027";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\025\034\037";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\025\034\037";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\020\003\002/\n\026\024\006+\037";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "\020\016\035";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "\022\031\0330";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 476
    //                   0 499
    //                   1 506
    //                   2 513
    //                   3 520;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_520;
_L3:
        byte byte1 = 102;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 115;
          goto _L9
_L5:
        byte1 = 108;
          goto _L9
_L6:
        byte1 = 111;
          goto _L9
        byte1 = 95;
          goto _L9
    }

    public (Short short1, Boolean boolean1, Boolean boolean2, Integer integer, Boolean boolean3, Boolean boolean4, Integer integer1)
    {
        complexity = short1;
        enableConstantBitrate = boolean1;
        enableDiscontinuousTransmission = boolean2;
        targetBitrate = integer;
        forwardErrorCorrection = boolean3;
        disableRateControl = boolean4;
        framesPerPacket = integer1;
    }
}
