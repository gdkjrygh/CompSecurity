// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;

import android.content.Context;
import com.whatsapp.DialogToastActivity;

// Referenced classes of package com.whatsapp.fieldstats:
//            aq, bl, ag, bu, 
//            z, j

public final class  extends aq
{

    public Double callAcceptFuncT;
    public Double callAvgRtt;
    public Double callEndFuncT;
    public Double callMaxRtt;
    public Double callMinRtt;
    public Double callNetwork;
    public Double callOfferReceiptDelay;
    public Double callRejectFuncT;
    public Double callResult;
    public Double callRingingT;
    public Double callRxAvgBitrate;
    public Double callRxAvgJitter;
    public Double callRxAvgLossPeriod;
    public Double callRxMaxJitter;
    public Double callRxMaxLossPeriod;
    public Double callRxMinJitter;
    public Double callRxMinLossPeriod;
    public Double callRxPktLossPct;
    public Double callSetupErrorType;
    public Double callSetupT;
    public Double callSide;
    public Double callSoundPortFuncT;
    public Double callStartFuncT;
    public Double callT;
    public Double callTermReason;
    public Double callTransitionCount;
    public Double callTransport;
    public Double callTxAvgBitrate;
    public Double callTxAvgJitter;
    public Double callTxAvgLossPeriod;
    public Double callTxMaxJitter;
    public Double callTxMaxLossPeriod;
    public Double callTxMinJitter;
    public Double callTxMinLossPeriod;
    public Double callTxPktLossPct;

    void updateFields(Context context)
    {
        int i = bl.a;
        z.a(context, ag.EVENT, Integer.valueOf(bu.CALL.getCode()));
        z.a(context, ag.CALL_NETWORK, callNetwork);
        z.a(context, ag.CALL_RESULT, callResult);
        z.a(context, ag.CALL_SETUP_ERROR_TYPE, callSetupErrorType);
        z.a(context, ag.CALL_SIDE, callSide);
        z.a(context, ag.CALL_TERM_REASON, callTermReason);
        z.a(context, ag.CALL_TRANSITION_COUNT, callTransitionCount);
        z.a(context, ag.CALL_TRANSPORT, callTransport);
        if (callAcceptFuncT != null)
        {
            z.a(context, j.CALL_ACCEPT_FUNC_T, callAcceptFuncT);
        }
        if (callAvgRtt != null)
        {
            z.a(context, j.CALL_AVG_RTT, callAvgRtt);
        }
        if (callEndFuncT != null)
        {
            z.a(context, j.CALL_END_FUNC_T, callEndFuncT);
        }
        if (callMaxRtt != null)
        {
            z.a(context, j.CALL_MAX_RTT, callMaxRtt);
        }
        if (callMinRtt != null)
        {
            z.a(context, j.CALL_MIN_RTT, callMinRtt);
        }
        if (callOfferReceiptDelay != null)
        {
            z.a(context, j.CALL_OFFER_RECEIPT_DELAY, callOfferReceiptDelay);
        }
        if (callRejectFuncT != null)
        {
            z.a(context, j.CALL_REJECT_FUNC_T, callRejectFuncT);
        }
        if (callRingingT != null)
        {
            z.a(context, j.CALL_RINGING_T, callRingingT);
        }
        if (callRxAvgBitrate != null)
        {
            z.a(context, j.CALL_RX_AVG_BITRATE, callRxAvgBitrate);
        }
        if (callRxAvgJitter != null)
        {
            z.a(context, j.CALL_RX_AVG_JITTER, callRxAvgJitter);
        }
        if (callRxAvgLossPeriod != null)
        {
            z.a(context, j.CALL_RX_AVG_LOSS_PERIOD, callRxAvgLossPeriod);
        }
        if (callRxMaxJitter != null)
        {
            z.a(context, j.CALL_RX_MAX_JITTER, callRxMaxJitter);
        }
        if (callRxMaxLossPeriod != null)
        {
            z.a(context, j.CALL_RX_MAX_LOSS_PERIOD, callRxMaxLossPeriod);
        }
        if (callRxMinJitter != null)
        {
            z.a(context, j.CALL_RX_MIN_JITTER, callRxMinJitter);
        }
        if (callRxMinLossPeriod != null)
        {
            z.a(context, j.CALL_RX_MIN_LOSS_PERIOD, callRxMinLossPeriod);
        }
        if (callRxPktLossPct != null)
        {
            z.a(context, j.CALL_RX_PKT_LOSS_PCT, callRxPktLossPct);
        }
        if (callSetupT != null)
        {
            z.a(context, j.CALL_SETUP_T, callSetupT);
        }
        if (callSoundPortFuncT != null)
        {
            z.a(context, j.CALL_SOUND_PORT_FUNC_T, callSoundPortFuncT);
        }
        if (callStartFuncT != null)
        {
            z.a(context, j.CALL_START_FUNC_T, callStartFuncT);
        }
        if (callT != null)
        {
            z.a(context, j.CALL_T, callT);
        }
        if (callTxAvgBitrate != null)
        {
            z.a(context, j.CALL_TX_AVG_BITRATE, callTxAvgBitrate);
        }
        if (callTxAvgJitter != null)
        {
            z.a(context, j.CALL_TX_AVG_JITTER, callTxAvgJitter);
        }
        if (callTxAvgLossPeriod != null)
        {
            z.a(context, j.CALL_TX_AVG_LOSS_PERIOD, callTxAvgLossPeriod);
        }
        if (callTxMaxJitter != null)
        {
            z.a(context, j.CALL_TX_MAX_JITTER, callTxMaxJitter);
        }
        if (callTxMaxLossPeriod != null)
        {
            z.a(context, j.CALL_TX_MAX_LOSS_PERIOD, callTxMaxLossPeriod);
        }
        if (callTxMinJitter != null)
        {
            z.a(context, j.CALL_TX_MIN_JITTER, callTxMinJitter);
        }
        if (callTxMinLossPeriod != null)
        {
            z.a(context, j.CALL_TX_MIN_LOSS_PERIOD, callTxMinLossPeriod);
        }
        if (callTxPktLossPct != null)
        {
            z.a(context, j.CALL_TX_PKT_LOSS_PCT, callTxPktLossPct);
        }
        z.a(context, ag.EVENT);
        if (i != 0)
        {
            DialogToastActivity.g++;
        }
    }

    public ()
    {
    }
}
