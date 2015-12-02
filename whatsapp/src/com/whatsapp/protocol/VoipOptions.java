// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            bp, c_

public final class VoipOptions
{

    private static final String z[];
    public final Aec aec;
    public final Agc agc;
    public final AudioRestrict audioRestrict;
    public final Decode decode;
    public final Encode encode;
    public final Miscellaneous miscellaneous;
    public final NoiseSuppression noiseSuppression;

    public VoipOptions()
    {
        this(null, null, null, null, null, null, null);
    }

    public VoipOptions(Aec aec1, Encode encode1, Decode decode1, Miscellaneous miscellaneous1, Agc agc1, AudioRestrict audiorestrict, NoiseSuppression noisesuppression)
    {
        aec = aec1;
        encode = encode1;
        decode = decode1;
        miscellaneous = miscellaneous1;
        agc = agc1;
        audioRestrict = audiorestrict;
        noiseSuppression = noisesuppression;
    }

    private static Boolean convertAttributeToBoolean(String s)
    {
        boolean flag;
        try
        {
            flag = "0".equals(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        if (!z[13].equals(s))
        {
            break MISSING_BLOCK_LABEL_34;
        }
        return Boolean.FALSE;
        if (s != null)
        {
            try
            {
                s = Boolean.TRUE;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            return s;
        } else
        {
            return null;
        }
    }

    private static Integer convertAttributeToInteger(String s, String s1)
    {
        if (s != null)
        {
            Integer integer;
            try
            {
                integer = Integer.valueOf(s);
            }
            catch (NumberFormatException numberformatexception)
            {
                throw new bp((new StringBuilder()).append(z[0]).append(s1).append(z[1]).append(s).toString());
            }
            return integer;
        } else
        {
            return null;
        }
    }

    private static Integer convertAttributeToInteger(String s, String s1, int i, int j)
    {
        s = convertAttributeToInteger(s, s1);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        int k;
        try
        {
            k = s.intValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (k < i)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        if (s.intValue() <= j)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        throw new bp((new StringBuilder()).append(s1).append(z[21]).append(s).append(z[22]).append(i).append(",").append(j).append("]").toString());
        return s;
    }

    private static Short convertAttributeToShort(String s, String s1)
    {
        if (s != null)
        {
            Short short1;
            try
            {
                short1 = new Short(Short.parseShort(s));
            }
            catch (NumberFormatException numberformatexception)
            {
                throw new bp((new StringBuilder()).append(z[2]).append(s1).append(z[3]).append(s).toString());
            }
            return short1;
        } else
        {
            return null;
        }
    }

    private static Short convertAttributeToShort(String s, String s1, int i, int j)
    {
        s = convertAttributeToShort(s, s1);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        short word0;
        try
        {
            word0 = s.shortValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (word0 < i)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        if (s.shortValue() <= j)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        throw new bp((new StringBuilder()).append(s1).append(z[11]).append(s).append(z[12]).append(i).append(",").append(j).append("]").toString());
        return s;
    }

    public static VoipOptions fromProtocolTreeNode(c_ c_1, boolean flag)
    {
        AudioRestrict audiorestrict;
        Aec aec1;
        Encode encode1;
        Decode decode1;
        Miscellaneous miscellaneous1;
        Agc agc1;
        try
        {
            aec1 = Aec.fromProtocolTreeNode(c_1.a(z[14]));
            encode1 = Encode.fromProtocolTreeNode(c_1.a(z[20]));
            decode1 = Decode.fromProtocolTreeNode(c_1.a(z[16]));
            miscellaneous1 = Miscellaneous.fromProtocolTreeNode(c_1.a(z[19]));
            agc1 = Agc.fromProtocolTreeNode(c_1.a(z[15]));
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1)
        {
            throw c_1;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        audiorestrict = AudioRestrict.fromProtocolTreeNode(c_1.a(z[18]));
_L4:
        return new VoipOptions(aec1, encode1, decode1, miscellaneous1, agc1, audiorestrict, NoiseSuppression.fromProtocolTreeNode(c_1.a(z[17])));
_L2:
        audiorestrict = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String toString()
    {
        return (new StringBuilder()).append(z[8]).append(aec).append(z[4]).append(encode).append(z[6]).append(decode).append(z[7]).append(miscellaneous).append(z[9]).append(agc).append(z[10]).append(audioRestrict).append(z[5]).append(noiseSuppression).append('}').toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[23];
        obj = "cDa\025%cN7_i";
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
                obj = "0\n";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "cDa\025%cN7_i";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "0\n";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "&\nr\032*eNrI";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "&\ny\033 yOD\0019zXr\007:cEyI";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "&\ns\021*eNrI";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "&\nz\035:iO{\030(dOx\001:7";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\\E~\004\006z^~\033'yQv\021*7";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "&\nv\023*7";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                obj = "&\nv\001-cEE\021:~X~\027=7";
                byte0 = 9;
                i = 10;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "*\002";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "#\nx\001=yCs\021ieL7\002(fCsT;kDp\021iQ";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "lK{\007,";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "kOt";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "kMt";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "nOt\033-o";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "dY";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "k_s\035&";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "eZc\035&dY";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "oDt\033-o";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "*\002";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "#\nx\001=yCs\021ieL7\002(fCsT;kDp\021iQ";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 588
    //                   0 611
    //                   1 618
    //                   2 625
    //                   3 632;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_632;
_L3:
        byte byte1 = 73;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 10;
          goto _L9
_L5:
        byte1 = 42;
          goto _L9
_L6:
        byte1 = 23;
          goto _L9
        byte1 = 116;
          goto _L9
    }






    private class Aec
    {

        private static final String z[];
        public final String algorithm;
        public final Integer length;
        public final Short mode;
        public final Integer offset;

        public static Aec fromProtocolTreeNode(c_ c_1)
        {
            if (c_1 == null)
            {
                return null;
            } else
            {
                String s = c_1.d(z[8]);
                String s1 = c_1.d(z[4]);
                String s2 = c_1.d(z[6]);
                c_1 = c_1.d(z[5]);
                return new Aec(s, VoipOptions.convertAttributeToInteger(s1, z[7]), VoipOptions.convertAttributeToInteger(s2, z[9]), VoipOptions.convertAttributeToShort(c_1, z[10], 0, 2));
            }
        }

        public String toString()
        {
            return (new StringBuilder()).append(z[0]).append(algorithm).append('\'').append(z[1]).append(offset).append(z[3]).append(length).append(z[2]).append(mode).append('}').toString();
        }

        static 
        {
            Object obj;
            String as[];
            byte byte0;
            int i;
            as = new String[11];
            obj = "iX`\007+DZl\016#\\UnAm";
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
                    obj = "\004\035l\032,[XwA";
                    i = 1;
                    byte0 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    obj = "\004\035n\023.M\0";
                    i = 2;
                    byte0 = 1;
                    break;

                case 1: // '\001'
                    as1[i] = ((String) (obj));
                    obj = "\004\035o\031$OIkA";
                    i = 3;
                    byte0 = 2;
                    break;

                case 2: // '\002'
                    as1[i] = ((String) (obj));
                    obj = "G[e\017/\\";
                    i = 4;
                    byte0 = 3;
                    break;

                case 3: // '\003'
                    as1[i] = ((String) (obj));
                    i = 5;
                    obj = "ERg\031";
                    byte0 = 4;
                    break;

                case 4: // '\004'
                    as1[i] = ((String) (obj));
                    i = 6;
                    obj = "DXm\033>@";
                    byte0 = 5;
                    break;

                case 5: // '\005'
                    as1[i] = ((String) (obj));
                    i = 7;
                    obj = "G[e\017/\\";
                    byte0 = 6;
                    break;

                case 6: // '\006'
                    as1[i] = ((String) (obj));
                    i = 8;
                    obj = "IQd\0238AIk\021";
                    byte0 = 7;
                    break;

                case 7: // '\007'
                    as1[i] = ((String) (obj));
                    i = 9;
                    obj = "DXm\033>@";
                    byte0 = 8;
                    break;

                case 8: // '\b'
                    as1[i] = ((String) (obj));
                    i = 10;
                    obj = "ERg\031";
                    byte0 = 9;
                    break;

                case 9: // '\t'
                    as1[i] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 324
        //                       0 347
        //                       1 354
        //                       2 361
        //                       3 367;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_367;
_L3:
            byte byte1 = 74;
_L9:
            obj[j] = (char)(byte1 ^ c);
            j++;
              goto _L8
_L4:
            byte1 = 40;
              goto _L9
_L5:
            byte1 = 61;
              goto _L9
_L6:
            byte1 = 3;
              goto _L9
            byte1 = 124;
              goto _L9
        }

        public Aec(String s, Integer integer, Integer integer1, Short short1)
        {
            algorithm = s;
            offset = integer;
            length = integer1;
            mode = short1;
        }
    }


    private class Encode
    {

        private static final String z[];
        public final Short complexity;
        public final Boolean disableRateControl;
        public final Boolean enableConstantBitrate;
        public final Boolean enableDiscontinuousTransmission;
        public final Boolean forwardErrorCorrection;
        public final Integer framesPerPacket;
        public final Integer targetBitrate;

        public static Encode fromProtocolTreeNode(c_ c_1)
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
            obj1 = VoipOptions.convertAttributeToShort(((String) (obj1)), z[8], 1, 10);
            obj2 = VoipOptions.convertAttributeToBoolean(((String) (obj2)));
            obj4 = VoipOptions.convertAttributeToBoolean(((String) (obj4)));
            if (z[17].equals(s1))
            {
                c_1 = null;
            } else
            {
                c_1 = VoipOptions.convertAttributeToInteger(s1, z[10], 6000, 51000);
            }
            obj3 = VoipOptions.convertAttributeToBoolean(((String) (obj3)));
            if (obj == null)
            {
                obj = null;
            } else
            {
                boolean flag;
                if (!VoipOptions.convertAttributeToBoolean(((String) (obj))).booleanValue())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj = Boolean.valueOf(flag);
            }
            return new Encode(((Short) (obj1)), ((Boolean) (obj2)), ((Boolean) (obj4)), c_1, ((Boolean) (obj3)), ((Boolean) (obj)), VoipOptions.convertAttributeToInteger(s, z[14], 0, 8));
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
        //                       0 499
        //                       1 506
        //                       2 513
        //                       3 520;
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

        public Encode(Short short1, Boolean boolean1, Boolean boolean2, Integer integer, Boolean boolean3, Boolean boolean4, Integer integer1)
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


    private class Decode
    {

        private static final String z[];
        public final Boolean forwardErrorCorrection;
        public final Short gain;

        public static Decode fromProtocolTreeNode(c_ c_1)
        {
            if (c_1 == null)
            {
                return null;
            } else
            {
                return new Decode(VoipOptions.convertAttributeToShort(c_1.d(z[0]), z[2]), VoipOptions.convertAttributeToBoolean(c_1.d(z[1])));
            }
        }

        public String toString()
        {
            return (new StringBuilder()).append(z[3]).append(gain).append(z[4]).append(forwardErrorCorrection).append('}').toString();
        }

        static 
        {
            Object obj;
            String as[];
            byte byte0;
            int i;
            as = new String[5];
            obj = "m{\022p";
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
                    obj = "l\177\030";
                    i = 1;
                    byte0 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    obj = "m{\022p";
                    i = 2;
                    byte0 = 1;
                    break;

                case 1: // '\001'
                    as1[i] = ((String) (obj));
                    obj = "N\177\030qMoa\034\177@d'";
                    i = 3;
                    byte0 = 2;
                    break;

                case 2: // '\002'
                    as1[i] = ((String) (obj));
                    i = 4;
                    obj = "lu\tiHx~>l[eh8q[x\177\030j@etF";
                    byte0 = 3;
                    break;

                case 3: // '\003'
                    as1[i] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 192
        //                       0 215
        //                       1 222
        //                       2 229
        //                       3 236;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_236;
_L3:
            byte byte1 = 41;
_L9:
            obj[j] = (char)(byte1 ^ c);
            j++;
              goto _L8
_L4:
            byte1 = 10;
              goto _L9
_L5:
            byte1 = 26;
              goto _L9
_L6:
            byte1 = 123;
              goto _L9
            byte1 = 30;
              goto _L9
        }

        public Decode(Short short1, Boolean boolean1)
        {
            gain = short1;
            forwardErrorCorrection = boolean1;
        }
    }


    private class Miscellaneous
    {

        private static final String z[];
        public final Boolean enableComfortNoiseGeneration;
        public final Boolean enableHighPassFiltering;

        public static Miscellaneous fromProtocolTreeNode(c_ c_1)
        {
            if (c_1 == null)
            {
                return null;
            } else
            {
                return new Miscellaneous(VoipOptions.convertAttributeToBoolean(c_1.d(z[3])), VoipOptions.convertAttributeToBoolean(c_1.d(z[2])));
            }
        }

        public String toString()
        {
            return (new StringBuilder()).append(z[1]).append(enableComfortNoiseGeneration).append(z[0]).append(enableHighPassFiltering).append('}').toString();
        }

        static 
        {
            Object obj;
            String as[];
            byte byte1;
            int i;
            as = new String[4];
            obj = "\033[\027xCU\027\027^KP\023\"wQD=\033zVR\t\033xE\n";
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
                    obj = "z\022\001uG[\027\023xGX\016\001mGY\032\020zGt\024\037pME\017<yKD\0365sLR\t\023bKX\025O";
                    i = 1;
                    byte1 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    obj = "_\013\024";
                    i = 2;
                    byte1 = 1;
                    break;

                case 1: // '\001'
                    as1[i] = ((String) (obj));
                    i = 3;
                    obj = "T\025\025";
                    byte1 = 2;
                    break;

                case 2: // '\002'
                    as1[i] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 176
        //                       0 197
        //                       1 203
        //                       2 209
        //                       3 215;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_215;
_L3:
            byte byte0 = 34;
_L9:
            obj[j] = (char)(byte0 ^ c);
            j++;
              goto _L8
_L4:
            byte0 = 55;
              goto _L9
_L5:
            byte0 = 123;
              goto _L9
_L6:
            byte0 = 114;
              goto _L9
            byte0 = 22;
              goto _L9
        }

        public Miscellaneous(Boolean boolean1, Boolean boolean2)
        {
            enableComfortNoiseGeneration = boolean1;
            enableHighPassFiltering = boolean2;
        }
    }


    private class Agc
    {

        private static final String z[];
        public final Short compressionGain;
        public final Boolean enableLimiter;
        public final Short mode;
        public final Short targetLevel;

        public static Agc fromProtocolTreeNode(c_ c_1)
        {
            if (c_1 == null)
            {
                return null;
            } else
            {
                String s = c_1.d(z[3]);
                String s1 = c_1.d(z[1]);
                String s2 = c_1.d(z[4]);
                c_1 = c_1.d(z[5]);
                return new Agc(VoipOptions.convertAttributeToShort(s, z[6], 0, 31), VoipOptions.convertAttributeToShort(s1, z[2], 0, 90), VoipOptions.convertAttributeToBoolean(s2), VoipOptions.convertAttributeToShort(c_1, z[0], 0, 2));
            }
        }

        public String toString()
        {
            return (new StringBuilder()).append(z[7]).append(targetLevel).append(z[10]).append(compressionGain).append(z[8]).append(enableLimiter).append(z[9]).append(mode).append('}').toString();
        }

        static 
        {
            Object obj;
            String as[];
            byte byte0;
            int i;
            as = new String[11];
            obj = "<0yi";
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
                    obj = "20p|\0244,ne\t?8|e\b";
                    i = 1;
                    byte0 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    obj = "20p|\0244,ne\t?\177zm\017?";
                    i = 2;
                    byte0 = 1;
                    break;

                case 1: // '\001'
                    as1[i] = ((String) (obj));
                    obj = "%>ok\003%3xz\003=";
                    i = 3;
                    byte0 = 2;
                    break;

                case 2: // '\002'
                    as1[i] = ((String) (obj));
                    obj = "=6pe\0224-xb\00733x";
                    i = 4;
                    byte0 = 3;
                    break;

                case 3: // '\003'
                    as1[i] = ((String) (obj));
                    i = 5;
                    obj = "<0yi";
                    byte0 = 4;
                    break;

                case 4: // '\004'
                    as1[i] = ((String) (obj));
                    i = 6;
                    obj = "%>ok\003%\177qi\02043";
                    byte0 = 5;
                    break;

                case 5: // '\005'
                    as1[i] = ((String) (obj));
                    i = 7;
                    obj = "\0208~w\0220-zi\022\035:ki\nl";
                    byte0 = 6;
                    break;

                case 6: // '\006'
                    as1[i] = ((String) (obj));
                    i = 8;
                    obj = "}\177xb\00733x@\017<6ii\024l";
                    byte0 = 7;
                    break;

                case 7: // '\007'
                    as1[i] = ((String) (obj));
                    i = 9;
                    obj = "}\177pc\0024b";
                    byte0 = 8;
                    break;

                case 8: // '\b'
                    as1[i] = ((String) (obj));
                    i = 10;
                    obj = "}\177~c\013!-x\177\02580sK\00781 ";
                    byte0 = 9;
                    break;

                case 9: // '\t'
                    as1[i] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 324
        //                       0 347
        //                       1 354
        //                       2 361
        //                       3 368;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_368;
_L3:
            byte byte1 = 102;
_L9:
            obj[j] = (char)(byte1 ^ c);
            j++;
              goto _L8
_L4:
            byte1 = 81;
              goto _L9
_L5:
            byte1 = 95;
              goto _L9
_L6:
            byte1 = 29;
              goto _L9
            byte1 = 12;
              goto _L9
        }

        public Agc(Short short1, Short short2, Boolean boolean1, Short short3)
        {
            targetLevel = short1;
            compressionGain = short2;
            enableLimiter = boolean1;
            mode = short3;
        }
    }


    private class AudioRestrict
    {

        private static final String z[];
        public final String encoding;
        public final Integer rate;

        public static AudioRestrict fromProtocolTreeNode(c_ c_1)
        {
            if (c_1 == null)
            {
                return null;
            } else
            {
                return new AudioRestrict(c_1.d(z[4]), VoipOptions.convertAttributeToInteger(c_1.d(z[3]), z[2]));
            }
        }

        public String toString()
        {
            return (new StringBuilder()).append(z[0]).append(encoding).append('\'').append(z[1]).append(rate).append('}').toString();
        }

        static 
        {
            Object obj;
            String as[];
            byte byte0;
            int i;
            as = new String[5];
            obj = "BDoIcQTxT~jR\177[imRdDemV6\007";
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
                    obj = "/\021yAxf\f";
                    i = 1;
                    byte0 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    obj = "qP\177E";
                    i = 2;
                    byte0 = 1;
                    break;

                case 1: // '\001'
                    as1[i] = ((String) (obj));
                    obj = "qP\177E";
                    i = 3;
                    byte0 = 2;
                    break;

                case 2: // '\002'
                    as1[i] = ((String) (obj));
                    i = 4;
                    obj = "f_h";
                    byte0 = 3;
                    break;

                case 3: // '\003'
                    as1[i] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 192
        //                       0 215
        //                       1 221
        //                       2 228
        //                       3 235;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_235;
_L3:
            byte byte1 = 12;
_L9:
            obj[j] = (char)(byte1 ^ c);
            j++;
              goto _L8
_L4:
            byte1 = 3;
              goto _L9
_L5:
            byte1 = 49;
              goto _L9
_L6:
            byte1 = 11;
              goto _L9
            byte1 = 32;
              goto _L9
        }

        public AudioRestrict(String s, Integer integer)
        {
            encoding = s;
            rate = integer;
        }
    }


    private class NoiseSuppression
    {

        private static final String z[];
        public final Short mode;

        public static NoiseSuppression fromProtocolTreeNode(c_ c_1)
        {
            if (c_1 == null)
            {
                return null;
            } else
            {
                return new NoiseSuppression(VoipOptions.convertAttributeToShort(c_1.d(z[0]), z[1], 0, 3));
            }
        }

        public String toString()
        {
            return (new StringBuilder()).append(z[2]).append(mode).append('}').toString();
        }

        static 
        {
            Object obj;
            String as[];
            byte byte1;
            int i;
            as = new String[3];
            obj = "dx5-";
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
                    obj = "dx5-";
                    i = 1;
                    byte1 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    i = 2;
                    obj = "Gx8;+Zb!8<ld\"!!gl<'*l*";
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
        //                       0 177
        //                       1 183
        //                       2 189
        //                       3 195;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_195;
_L3:
            byte byte0 = 78;
_L9:
            obj[j] = (char)(byte0 ^ c);
            j++;
              goto _L8
_L4:
            byte0 = 9;
              goto _L9
_L5:
            byte0 = 23;
              goto _L9
_L6:
            byte0 = 81;
              goto _L9
            byte0 = 72;
              goto _L9
        }

        public NoiseSuppression(Short short1)
        {
            mode = short1;
        }
    }

}
