// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.ConditionVariable;
import com.whatsapp.messaging.ay;
import com.whatsapp.protocol.VoipOptions;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;

// Referenced classes of package com.whatsapp:
//            xu

public final class Voip
{

    public static SignalingCallback a;
    private static final SimpleDateFormat b;
    public static CryptoCallback c;
    private static final ay d;
    private static final ConditionVariable e;
    private static final String z[];

    public static final String a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(z[0]).append(s).toString();
        }
    }

    public static void a()
    {
        e.close();
    }

    public static void a(CryptoCallback cryptocallback)
    {
        nativeRegisterCryptoCallback(cryptocallback);
        c = cryptocallback;
    }

    public static void a(SignalingCallback signalingcallback)
    {
        nativeRegisterSignalingCallback(signalingcallback);
        a = signalingcallback;
    }

    public static boolean a(c4 c4_1)
    {
        return c4_1.w == 8 && c4_1.l != null;
    }

    public static native void acceptCall();

    public static void b()
    {
        e.open();
    }

    public static boolean b(c4 c4_1)
    {
        return c4_1.w == 8 && !c4_1.y.b && c4_1.H == 0 && c4_1.t == 0L;
    }

    public static void c()
    {
        e.block();
    }

    public static native boolean checkStreamStatistics();

    public static ay d()
    {
        return d;
    }

    public static boolean e()
    {
        return false;
    }

    public static native void endCall();

    static SimpleDateFormat f()
    {
        return b;
    }

    public static a g()
    {
        CallInfo callinfo = getCallInfo();
        if (callinfo == null)
        {
            return null;
        } else
        {
            return new a(callinfo.getPeerId(), callinfo.isCaller(), a(callinfo.getCallId()));
        }
    }

    public static native long getCallActiveTime();

    public static native com.whatsapp.fieldstats.Events.Call getCallFieldStats();

    public static native CallInfo getCallInfo();

    public static native String getCurrentCallId();

    public static native CallState getCurrentCallState();

    public static native String getPeerJid();

    public static native String getStreamStatistics();

    public static boolean h()
    {
        CallState callstate;
        CallState callstate1;
        try
        {
            callstate = getCurrentCallState();
            callstate1 = CallState.NONE;
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            try
            {
                throw unsatisfiedlinkerror;
            }
            catch (UnsatisfiedLinkError unsatisfiedlinkerror1)
            {
                Log.a(z[1], unsatisfiedlinkerror1);
            }
            return false;
        }
        return callstate != callstate1;
    }

    public static native boolean isCaller();

    public static native void muteCall(boolean flag);

    public static native void nativeHandleCallOffer(String s, String s1, String s2, String as[], int ai[], byte abyte0[][], int ai1[], byte abyte1[][], 
            byte abyte2[][], byte abyte3[], byte abyte4[], VoipOptions voipoptions, boolean flag);

    public static native void nativeHandleCallOfferAccept(String s, String s1, String s2, String s3, int i, byte abyte0[][], int ai[], byte abyte1[], 
            byte abyte2[], byte abyte3[], int j);

    public static native void nativeHandleCallOfferAck(String s, String s1, String s2, int i, byte abyte0[][], byte abyte1[][], VoipOptions voipoptions, boolean flag);

    public static native void nativeHandleCallOfferReceipt(String s, String s1, String s2);

    public static native void nativeHandleCallOfferReject(String s, String s1, String s2, String s3);

    public static native void nativeHandleCallRelayElection(String s, String s1, String s2, byte abyte0[], int i);

    public static native void nativeHandleCallRelayLatency(String s, String s1, String s2, byte abyte0[][], int ai[]);

    public static native void nativeHandleCallTerminate(String s, String s1, String s2);

    public static native void nativeHandleCallTransport(String s, String s1, String s2, byte abyte0[][], int ai[]);

    public static native void nativeRegisterCryptoCallback(CryptoCallback cryptocallback);

    public static native void nativeRegisterEventCallback(EventCallback eventcallback);

    public static native void nativeRegisterSignalingCallback(SignalingCallback signalingcallback);

    public static native void nativeUnregisterCryptoCallback();

    public static native void nativeUnregisterEventCallback();

    public static native void nativeUnregisterSignalingCallback();

    public static native void onNetworkChange();

    public static native void rejectCall();

    public static native void setAudioStreamPause(boolean flag);

    public static native void setNetworkMedium(int i);

    public static native void setPeerAudioStreamPause(boolean flag);

    public static native void setSpeakerOn(boolean flag);

    public static native void startCall(String s, String s1);

    public static native boolean startCallRecording(RecordingInfo arecordinginfo[]);

    public static native boolean stopCallRecording();

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "u\024<zn";
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
                obj = "c\0331t8sU$ytg\0005d-6\023?dtu\000\"d1x\001pu5z\031pe w\0015";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "o\f)oy[8}r08=\030I9{*#e";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                b = new SimpleDateFormat(z[2]);
                e = new ConditionVariable(true);
                d = new xu();
                a = null;
                c = null;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 200
    //                   0 221
    //                   1 227
    //                   2 233
    //                   3 239;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_239;
_L3:
        byte byte0 = 84;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 22;
          goto _L9
_L5:
        byte0 = 117;
          goto _L9
_L6:
        byte0 = 80;
          goto _L9
        byte0 = 22;
          goto _L9
    }

    private class CallInfo
    {

        private long bytesReceived;
        private long bytesSent;
        private long callActiveTime;
        private long callDuration;
        private String callId;
        private CallState callState;
        private boolean isCaller;
        private boolean isEndedByMe;
        private String peerId;

        public long getBytesReceived()
        {
            return bytesReceived;
        }

        public long getBytesSent()
        {
            return bytesSent;
        }

        public long getCallActiveTime()
        {
            return callActiveTime;
        }

        public long getCallDuration()
        {
            return callDuration;
        }

        public String getCallId()
        {
            return callId;
        }

        public CallState getCallState()
        {
            return callState;
        }

        public String getPeerId()
        {
            return peerId;
        }

        public boolean isCaller()
        {
            return isCaller;
        }

        public boolean isEndedByMe()
        {
            return isEndedByMe;
        }

        public CallInfo(CallState callstate, String s, String s1, boolean flag, boolean flag1, long l, 
                long l1, long l2, long l3)
        {
            callState = callstate;
            callId = s;
            peerId = s1;
            isCaller = flag;
            isEndedByMe = flag1;
            callActiveTime = l;
            callDuration = l1;
            bytesSent = l2;
            bytesReceived = l3;
        }
    }


    private class CallState extends Enum
    {

        private static final CallState $VALUES[];
        public static final CallState ACCEPT_RECEIVED;
        public static final CallState ACCEPT_SENT;
        public static final CallState ACTIVE;
        public static final CallState CALLING;
        public static final CallState NONE;
        public static final CallState RECEIVED_CALL;
        private static final String z[];

        public static CallState valueOf(String s)
        {
            return (CallState)Enum.valueOf(com/whatsapp/Voip$CallState, s);
        }

        public static CallState[] values()
        {
            return (CallState[])$VALUES.clone();
        }

        static 
        {
            Object obj;
            String as[];
            byte byte0;
            int i;
            as = new String[6];
            obj = "6}\177!";
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
                    obj = "*wr!\r.wu;\0079~}";
                    i = 1;
                    byte0 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    obj = "9qr!\024,mc!\007={g!\0";
                    i = 2;
                    byte0 = 1;
                    break;

                case 1: // '\001'
                    as1[i] = ((String) (obj));
                    obj = "9qe-\022=";
                    i = 3;
                    byte0 = 2;
                    break;

                case 2: // '\002'
                    as1[i] = ((String) (obj));
                    obj = "9qr!\024,mb!\n,";
                    i = 4;
                    byte0 = 3;
                    break;

                case 3: // '\003'
                    as1[i] = ((String) (obj));
                    i = 5;
                    obj = ";s}(\r6u";
                    byte0 = 4;
                    break;

                case 4: // '\004'
                    as1[i] = ((String) (obj));
                    z = as;
                    NONE = new CallState(z[0], 0);
                    CALLING = new CallState(z[5], 1);
                    RECEIVED_CALL = new CallState(z[1], 2);
                    ACCEPT_SENT = new CallState(z[4], 3);
                    ACCEPT_RECEIVED = new CallState(z[2], 4);
                    ACTIVE = new CallState(z[3], 5);
                    $VALUES = (new CallState[] {
                        NONE, CALLING, RECEIVED_CALL, ACCEPT_SENT, ACCEPT_RECEIVED, ACTIVE
                    });
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c1 = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 356
        //                       0 379
        //                       1 386
        //                       2 393
        //                       3 400;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_400;
_L3:
            byte byte1 = 68;
_L9:
            obj[j] = (char)(byte1 ^ c1);
            j++;
              goto _L8
_L4:
            byte1 = 120;
              goto _L9
_L5:
            byte1 = 50;
              goto _L9
_L6:
            byte1 = 49;
              goto _L9
            byte1 = 100;
              goto _L9
        }

        private CallState(String s, int i)
        {
            super(s, i);
        }
    }

}
