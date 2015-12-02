// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public interface 
{

    public abstract void audioInitError();

    public abstract void audioStreamStarted();

    public abstract void callAcceptFailed();

    public abstract void callAcceptReceived();

    public abstract void callAcceptSent();

    public abstract void callCaptureBufferFilled( , byte abyte0[], int i,  a[]);

    public abstract void callCaptureEnded( ,  a[]);

    public abstract void callEnding();

    public abstract void callInterrupted();

    public abstract void callOfferAckedWithRelayInfo();

    public abstract void callOfferNacked();

    public abstract void callOfferReceived();

    public abstract void callOfferSent();

    public abstract void callRejectReceived(String s);

    public abstract void callResumed();

    public abstract void callStateChanged( ,  1);

    public abstract void callTerminateReceived();

    public abstract void errorGatheringHostCandidates();

    public abstract void handleAcceptFailed();

    public abstract void handleOfferFailed();

    public abstract void incompatibleSrtpKeyExchange();

    public abstract void mediaStreamError();

    public abstract void mediaStreamStartError();

    public abstract void missingRelayInfo();

    public abstract void p2pNegotaitionFailed();

    public abstract void p2pNegotiationSuccess();

    public abstract void p2pTransportCreateFailed();

    public abstract void p2pTransportMediaCreateFailed();

    public abstract void p2pTransportRestartSuccess();

    public abstract void p2pTransportStartFailed();

    public abstract void relayBindsFailed();

    public abstract void relayCreateSuccess();

    public abstract void relayElectionSendFailed();

    public abstract void relayLatencySendFailed();

    public abstract void rtcpPacketReceived();

    public abstract void rxTimeout();

    public abstract void rxTrafficStarted();

    public abstract void rxTrafficStopped();

    public abstract void sendAcceptFailed();

    public abstract void sendOfferFailed();

    public abstract void soundPortCreateFailed();

    public abstract void transportCandSendFailed();

    public abstract void txTimeout();

    public abstract void willCreateSoundPort();
}
